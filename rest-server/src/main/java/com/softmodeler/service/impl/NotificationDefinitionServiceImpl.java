package com.softmodeler.service.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.softmodeler.common.service.NotificationDefinitionService;
import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.NotificationParticipant;
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

		return code;
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
}
