package com.softmodeler.client;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import com.softmodeler.common.communication.CommunicationUtil;
import com.softmodeler.common.pojo.AssociationObject;
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
			RestClientBuilder client = RestClientBuilder.newBuilder().register(CommunicationUtil.getProvider()).baseUri(apiUri);

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
		return true;
	}

	private static boolean testNotifications(RestClientBuilder client) {
		NotificationDefinitionService service = client.build(NotificationDefinitionService.class);

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

		NotificationDefinition definition = service.getNotificationDefinition();
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
		
		try {
			Attachment attachment = service.getResource();
			ResourceType resourceType = attachment.getData();
			if (resourceType == null) {
				return false;
			}

			InputStream inputStream = resourceType.getInputStream();
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
