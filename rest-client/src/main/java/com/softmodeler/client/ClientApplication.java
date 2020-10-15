package com.softmodeler.client;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import com.softmodeler.common.ServerException;
import com.softmodeler.common.ValidationException;
import com.softmodeler.common.communication.CommunicationUtil;
import com.softmodeler.common.pojo.AssociationObject;
import com.softmodeler.common.pojo.PrivateObject;
import com.softmodeler.common.pojo.SampleObject;
import com.softmodeler.common.service.NotificationDefinitionService;
import com.softmodeler.common.service.POJOService;
import com.softmodeler.common.service.TreeNodeService;
import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.CodeEntry;
import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.NotificationParticipant;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.ObjectState;
import com.softmodeler.model.TreeNode;
import com.softmodeler.model.TreeNodeChild;
import com.softmodeler.model.type.LabelsType;
import com.softmodeler.model.type.ResourceType;

public class ClientApplication {

	public static void main(String[] args) {
		System.out.println("Hello World, I'm a client!");

		try {
			URI apiUri = new URI("http://localhost:8080/services/");
			RestClientBuilder client = RestClientBuilder.newBuilder().baseUri(apiUri).register(new ClientExceptionMapper());
			for (Object provider : CommunicationUtil.getProviders()) {
				client.register(provider);
			}

			if (!testPOJO(client)) {
				System.err.println("testPOJO # FAILED #");
			} else {
				System.err.println("testPOJO PASSED");
			}

			if (!testNotifications(client)) {
				System.err.println("testNotifications # FAILED #");
			} else {
				System.err.println("testNotifications PASSED");
			}

			if (!testTreeNodes(client)) {
				System.err.println("testTreeNodes # FAILED #");
			} else {
				System.err.println("testTreeNodes PASSED");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean testPOJO(RestClientBuilder client) {
		POJOService service = client.build(POJOService.class);
		SampleObject sampleObject = service.get();

		if (sampleObject == null) {
			return false;
		}
		if (!"Test".equals(sampleObject.getName()) || sampleObject.getId() != 99) {
			return false;
		}
		if (sampleObject.getAssociationObject() == null) {
			return false;
		}
		if (sampleObject.getAssociationObject().getId() != 1
				|| !"Association Name 1".equals(sampleObject.getAssociationObject().getName())) {
			return false;
		}
		if (sampleObject.getAssociationObjects().size() != 2) {
			return false;
		}
		AssociationObject a2 = sampleObject.getAssociationObjects().get(0);
		if (a2.getId() != 2 || !"Association Name 2".equals(a2.getName())) {
			return false;
		}
		AssociationObject a3 = sampleObject.getAssociationObjects().get(1);
		if (a3.getId() != 3 || !"Association Name 3".equals(a3.getName())) {
			return false;
		}

		sampleObject.setName("new name");
		service.set(sampleObject);

		List<SampleObject> result = service.findAll();

		if (result.size() != 10) {
			return false;
		}
		for (int i = 0; i < 10; i++) {
			SampleObject obj = result.get(i);
			if (!("Test " + i).equals(obj.getName()) || obj.getId() != i) {
				return false;
			}
		}
		Set<SampleObject> resultSet = service.getSampleSet();
		if (!(resultSet instanceof Set)) {
			return false;
		}
		if (resultSet.size() != 10) {
			return false;
		}
		for (int i = 0; i < 10; i++) {
			boolean passed = false;
			for (SampleObject obj : resultSet) {
				if (("Test " + i).equals(obj.getName()) && obj.getId() == i) {
					passed = true;
					break;
				}
			}
			if (passed == false) {
				return false;
			}
		}
		Map<String, SampleObject> resultMap = service.getSampleMap();
		if (!(resultMap instanceof Map)) {
			return false;
		}
		if (resultMap.size() != 10) {
			return false;
		}
		for (int i = 0; i < 10; i++) {
			SampleObject obj = resultMap.get("Test " + i);
			if (obj == null) {
				return false;
			}
		}
		
		PrivateObject privateObject = service.getPrivateObject();
		if (privateObject == null) {
			return false;
		}
		if (!"1234 test".equals(privateObject.toString())) {
			return false;
		}
		
		try {
			service.testException();
		} catch (Exception e) {
			if (!e.getClass().equals(Exception.class)) {
				return false;
			}
			if (!"plain exception".equals(e.getMessage())) {
				return false;
			}
		}

		try {
			service.testRuntimeException();
		} catch (Exception e) {
			if (!e.getClass().equals(RuntimeException.class)) {
				return false;
			}
			if (!"runtime exception".equals(e.getMessage())) {
				return false;
			}
		}
		
		
		try {
			service.testServerException();
		} catch (Exception e) {
			if (!(e instanceof ServerException)) {
				return false;
			}
			if (!"server exception".equals(e.getMessage())) {
				return false;
			}
		}
		
		try {
			service.testValidationException();
		} catch (Exception e) {
			if (!(e instanceof ValidationException)) {
				return false;
			}
			if (!"validation exception".equals(e.getMessage())) {
				return false;
			}
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("string", "test");
		map.put("integer", 12);
		map.put("list", Arrays.asList("one", "two"));
		map.put("object", sampleObject);
		map.put("null", null);

		Map<String, Object> returnMap = service.testMap(map);
		
		if(map.size() != returnMap.size()) {
			return false;
		}
		if (!"test".equals(returnMap.get("string"))) {
			return false;
		}
		if ((Integer)returnMap.get("integer") != 12) {
			return false;
		}
		if (!((List<?>)returnMap.get("list")).get(0).equals("one") || !((List<?>)returnMap.get("list")).get(1).equals("two")) {
			return false;
		}
		
		if (!(returnMap.get("object") instanceof SampleObject) || !"new name".equals(((SampleObject) returnMap.get("object")).getName()) || ((SampleObject) returnMap.get("object")).getId() != 99) {
			return false;
		}
		if (returnMap.get("null") != null) {
			return false;
		}
		
		String nullString = service.testNullString(null);
		if (nullString != null) {
			return false;
		}
		
		Object nullObject = service.testNullObject(null);
		if (nullObject != null) {
			return false;
		}
		
		return true;
	}

	private static boolean testNotifications(RestClientBuilder client) {
		NotificationDefinitionService service = client.build(NotificationDefinitionService.class);

		ObjectState state = service.getState(ObjectState.PRODUCTION);
		if (!ObjectState.PRODUCTION.equals(state)) {
			return false;
		}
		
		state = service.getState(ObjectState.MODIFICATION);
		if (!ObjectState.MODIFICATION.equals(state)) {
			return false;
		}
		
		Code code = service.getCode();
		if (code == null) {
			return false;
		}
		if (code.getId() == null || code.getNames() == null) {
			return false;
		}
		if (!"name DE".equals(code.getNames().getLabel("de", false))) {
			return false;
		}
		if (!"name EN".equals(code.getNames().getLabel("en", false))) {
			return false;
		}
		if (!"name DE".equals(code.getNames().getDefaultLabel())) {
			return false;
		}

		NotificationDefinition definition = service.createNotificationDefinition("");
		if (definition == null) {
			return false;
		}
		if (definition.getId() == null) {
			return false;
		}
		if (definition.getSender() == null || definition.getSender().getMailAddress() == null) {
			return false;
		}
		if (!"GROUP_ID".equals(definition.getSender().getGroupId())) {
			return false;
		}
		if (!"sender@example.com".equals(definition.getSender().getMailAddress().getMailAddress())
				|| !"Sender Test".equals(definition.getSender().getMailAddress().getName())) {
			return false;
		}
		if (definition.getCcReceivers() == null || definition.getCcReceivers().size() != 2) {
			return false;
		}
		NotificationParticipant cc1 = definition.getCcReceivers().get(0);
		if (!"ccReceiver1@example.com".equals(cc1.getMailAddress().getMailAddress())
				|| !"cc1 Receiver".equals(cc1.getMailAddress().getName())) {
			return false;
		}
		NotificationParticipant cc2 = definition.getCcReceivers().get(1);
		if (!"ccReceiver2@example.com".equals(cc2.getMailAddress().getMailAddress())
				|| !"cc2 Receiver".equals(cc2.getMailAddress().getName())) {
			return false;
		}

		code = definition.getDelivery();
		if (code == null) {
			return false;
		}
		if (code.getId() == null) {
			return false;
		}
		if (!"name DE".equals(code.getNames().getLabel("de", false))) {
			return false;
		}
		if (!"name EN".equals(code.getNames().getLabel("en", false))) {
			return false;
		}
		if (!"name DE".equals(code.getNames().getDefaultLabel())) {
			return false;
		}
		
		if (code.getEntries().size() != 2) {
			return false;
		}
		CodeEntry entry1 = code.getEntries().get(0);
		if (!"entry_id1".equals(entry1.getId()) || !"key1".equals(entry1.getKey()) || !"value1".equals(entry1.getValue())) {
			return false;
		}
		CodeEntry entry2 = code.getEntries().get(1);
		if (!"entry_id2".equals(entry2.getId()) || !"key2".equals(entry2.getKey()) || !"value2".equals(entry2.getValue())) {
			return false;
		}
		
		code.setId("new_id");
		NotificationDefinition definition2 = service.findByCode(code);
		if (definition2 == null) {
			return false;
		}
		if (!"new_id".equals(definition2.getDelivery().getId())) {
			return false;
		}
		
		List<Attachment> resourceList = service.getResourceList();
		if (resourceList.size() != 2) {
			return false;
		}
		
		try {
			Attachment attachment = service.getResource();
			ResourceType resourceType = attachment.getData();
			if (resourceType == null) {
				return false;
			}

			InputStream inputStream = resourceType.getInputStream();
			if (inputStream == null) {
				return false;
			}
			File outputFile = File.createTempFile("rest-test", ".txt");
			Files.copy(inputStream, outputFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

			byte[] bytes = Files.readAllBytes(outputFile.toPath());
			if (!"test content".equals(new String(bytes))) {
				return false;
			}
			attachment.setId("from_client");
			service.setResource(attachment);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		Attachment attachment = service.getEmptyResource();
		ResourceType resourceType = attachment.getData();
		if (resourceType == null || resourceType.getFile() != null || resourceType.getFile() != null) {
			return false;
		}
		if (!"path".equals(resourceType.getPath())) {
			return false;
		}

		Set<ObjectRef> objectSet = service.getObjectSet();
		if (objectSet.size() != 2) {
			return false;
		}
		for (ObjectRef objectRef : objectSet) {
			if (!objectRef.getId().startsWith("id_")) {
				return false;
			}
			if (objectRef.getLabels() == null || !objectRef.getLabels().getDefaultLabel().startsWith("OBJ ")) {
				return false;
			}
		}
		
		String suffix1 = "_o1";
		String suffix2 = "_o2";

		NotificationDefinition o1 = service.createNotificationDefinition(suffix1);
		NotificationDefinition o2 = service.createNotificationDefinition(suffix2);
		List<NotificationDefinition> list = new ArrayList<>();
		list.add(o1);
		list.add(o2);
		
		List<NotificationDefinition> resultList = service.testListGet(list);
		if (list.size() != resultList.size()) {
			return false;
		}
		NotificationDefinition r1 = resultList.get(0);
		NotificationDefinition r2 = resultList.get(1);
		testNotificationResult(r1, r2, suffix1, suffix2);
		
		resultList = service.testListPost(list);
		if (list.size() != resultList.size()) {
			return false;
		}

		r1 = resultList.get(0);
		r2 = resultList.get(1);
		if (!testNotificationResult(r1, r2, suffix1, suffix2)) {
			return false;
		}
		
		Set<NotificationDefinition> set = new HashSet<>(list);
		Set<NotificationDefinition> resultSet = service.testSetGet(set);
		
		if (set.size() != resultSet.size()) {
			return false;
		}

		NotificationDefinition[] resultArray = resultSet.toArray(new NotificationDefinition[resultSet.size()]);
		if (resultArray[0].getId().endsWith(suffix1)) {
			r1 = resultArray[0];
			r2 = resultArray[1];
		} else {
			r1 = resultArray[1];
			r2 = resultArray[0];			
		}
		if (!testNotificationResult(r1, r2, suffix1, suffix2)) {
			return false;
		}
		
		resultSet = service.testSetPost(set);
		if (set.size() != resultSet.size()) {
			return false;
		}

		resultArray = resultSet.toArray(new NotificationDefinition[resultSet.size()]);
		if (resultArray[0].getId().endsWith(suffix1)) {
			r1 = resultArray[0];
			r2 = resultArray[1];
		} else {
			r1 = resultArray[1];
			r2 = resultArray[0];			
		}
		if (!testNotificationResult(r1, r2, suffix1, suffix2)) {
			return false;
		}
		
		Map<String, NotificationDefinition> map = new HashMap<>();
		map.put(suffix1, o1);
		map.put(suffix2, o2);
		
		Map<String, NotificationDefinition> resultMap = service.testMapGet(map);
		if (map.size() != resultMap.size()) {
			return false;
		}
		r1 = resultMap.get(suffix1);
		r2 = resultMap.get(suffix2);
		if (!testNotificationResult(r1, r2, suffix1, suffix2)) {
			return false;
		}
		
		resultMap = service.testMapPost(map);
		if (map.size() != resultMap.size()) {
			return false;
		}
		r1 = resultMap.get(suffix1);
		r2 = resultMap.get(suffix2);
		if (!testNotificationResult(r1, r2, suffix1, suffix2)) {
			return false;
		}
		
		return true;
	}

	private static boolean testNotificationResult(NotificationDefinition r1, NotificationDefinition r2, String suffix1, String suffix2) {
		if (!r1.getId().endsWith(suffix1) || !r2.getId().endsWith(suffix2)) {
			return false;
		}
		if (!r1.getSender().getGroupId().endsWith(suffix1) || !r2.getSender().getGroupId().endsWith(suffix2)) {
			return false;
		}
		if (!r1.getDelivery().getNames().getDefaultLabel().endsWith(suffix1) || !r2.getDelivery().getNames().getDefaultLabel().endsWith(suffix2)) {
			return false;
		}
		return true;
	}
	
	private static boolean testTreeNodes(RestClientBuilder client) {
		TreeNodeService service = client.build(TreeNodeService.class);

		TreeNode node = service.getNode();
		if (node == null) {
			return false;
		}
		if (node.getId() == null || node.getName() == null) {
			return false;
		}
		if (node.getObject() == null) {
			return false;
		}
		
		ObjectRef objectRef = node.getObject();
		if (!ObjectState.PRODUCTION.equals(objectRef.getState())) {
			return false;
		}
		
		if (objectRef.getLabels() == null) {
			return false;
		}
		LabelsType labels = objectRef.getLabels();
		if (!"label DE".equals(labels.getLabel("de", false))) {
			return false;
		}
		if (!"label EN".equals(labels.getLabel("en", false))) {
			return false;
		}
		if (!"label DE".equals(labels.getDefaultLabel())) {
			return false;
		}
		
		if (node.getChilds().size() != 1) {
			return false;
		}
		TreeNodeChild child = node.getChilds().get(0);
		if (child.getNodeId() == null) {
			return false;
		}
		if (child.getParent() == null) {
			return false;
		}

		TreeNodeChild childResult = service.getChild();
		if (childResult == null) {
			return false;
		}
		if (childResult.getParent() == null) {
			return false;
		}
		if (!childResult.getParent().getChilds().contains(childResult)) {
			return false;
		}
		
		return true;
	}
}
