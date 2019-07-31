package com.softmodeler.service.impl;

import java.io.File;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.softmodeler.common.service.NotificationDefinitionService;
import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.CodeEntry;
import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.NotificationParticipant;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.SoftmodelerFactory;
import com.softmodeler.model.type.LabelsType;
import com.softmodeler.model.type.MailAddressType;
import com.softmodeler.model.type.ResourceType;

public class NotificationDefinitionServiceImpl implements NotificationDefinitionService {

	@Override
	public Code getCode() {
		Code code = SoftmodelerFactory.eINSTANCE.createCode();
		code.setId(EcoreUtil.generateUUID());
		
		LabelsType names = new LabelsType();
		names.setLabel(0, "de", "name DE", true);
		names.setLabel(0, "en", "name EN", false);
		code.setNames(names);

		CodeEntry entry1 = SoftmodelerFactory.eINSTANCE.createCodeEntry();
		entry1.setId("entry_id1");
		entry1.setKey("key1");
		entry1.setValue("value1");
		code.getEntries().add(entry1);
		
		CodeEntry entry2 = SoftmodelerFactory.eINSTANCE.createCodeEntry();
		entry2.setId("entry_id2");
		entry2.setKey("key2");
		entry2.setValue("value2");
		code.getEntries().add(entry2);
		
		return code;
	}

	@Override
	public NotificationDefinition findByCode(Code code) {
		NotificationDefinition definition = getNotificationDefinition();
		definition.setDelivery(code);
		return definition;
	}
	@Override
	public NotificationDefinition getNotificationDefinition() {
		NotificationDefinition definition = SoftmodelerFactory.eINSTANCE.createNotificationDefinition();
		definition.setId(EcoreUtil.generateUUID());
		definition.setDomain(1111);

		Code code = getCode();
		definition.setDelivery(code);

		NotificationParticipant sender = SoftmodelerFactory.eINSTANCE.createNotificationParticipant();
		sender.setId(EcoreUtil.generateUUID());
		sender.setGroupId("GROUP_ID");
		sender.setMailAddress(new MailAddressType("sender@example.com", "Sender Test"));
		definition.setSender(sender);

		NotificationParticipant ccReceiver1 = SoftmodelerFactory.eINSTANCE.createNotificationParticipant();
		ccReceiver1.setId(EcoreUtil.generateUUID());
		ccReceiver1.setGroupId("GROUP_ID");
		ccReceiver1.setMailAddress(new MailAddressType("ccReceiver1@example.com", "cc1 Receiver"));
		definition.getCcReceivers().add(ccReceiver1);

		NotificationParticipant ccReceiver2 = SoftmodelerFactory.eINSTANCE.createNotificationParticipant();
		ccReceiver2.setId(EcoreUtil.generateUUID());
		ccReceiver2.setGroupId("GROUP_ID");
		ccReceiver2.setMailAddress(new MailAddressType("ccReceiver2@example.com", "cc2 Receiver"));
		definition.getCcReceivers().add(ccReceiver2);

		return definition;
	}

	@Override
	public void setNotificationDefinition(NotificationDefinition object) {
		System.out.println("Server setNotificationDefinition(): " + object);
	}

	@Override
	public Attachment getResource() {
		Attachment attachment = SoftmodelerFactory.eINSTANCE.createAttachment();
		attachment.setId(EcoreUtil.generateUUID());
		try {
			URL resource = getClass().getResource("/attachment.txt");
			File file = new File(resource.getFile());
			ResourceType resourceType = new ResourceType(file);
			attachment.setData(resourceType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		attachment.setDomain(112121);
		attachment.setKey("resource_key");
		return attachment;
	}

	@Override
	public void setResource(Attachment attachment) {
		System.out.println("Server setResource():" + attachment);
	}

	@Override
	public Set<ObjectRef> getObjectSet() {
		Set<ObjectRef> set = new HashSet<>();
		
		ObjectRef obj1 = SoftmodelerFactory.eINSTANCE.createObjectRef();
		obj1.setId("id_1");
		LabelsType labels1 = new LabelsType();
		labels1.setLabel(0, "de", "OBJ 1", true);
		obj1.setLabels(labels1);
		ObjectRef obj2 = SoftmodelerFactory.eINSTANCE.createObjectRef();
		obj2.setId("id_2");
		LabelsType labels2 = new LabelsType();
		labels2.setLabel(0, "de", "OBJ 2", true);
		obj2.setLabels(labels2);
		
		set.add(obj1);
		set.add(obj2);
		return set;
	}
}
