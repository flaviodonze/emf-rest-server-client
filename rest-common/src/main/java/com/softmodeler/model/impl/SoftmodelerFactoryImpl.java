/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.*;

import com.softmodeler.model.type.LabelsType;
import com.softmodeler.model.type.MailAddressType;
import com.softmodeler.model.type.ResourceType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SoftmodelerFactoryImpl extends EFactoryImpl implements SoftmodelerFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static SoftmodelerFactory init() {
		try {
			SoftmodelerFactory theSoftmodelerFactory = (SoftmodelerFactory) EPackage.Registry.INSTANCE
					.getEFactory(SoftmodelerPackage.eNS_URI);
			if (theSoftmodelerFactory != null) {
				return theSoftmodelerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftmodelerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public SoftmodelerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SoftmodelerPackage.ATTACHMENT:
			return createAttachment();
		case SoftmodelerPackage.OBJECT_REF:
			return createObjectRef();
		case SoftmodelerPackage.TREE_NODE:
			return createTreeNode();
		case SoftmodelerPackage.TREE_NODE_CHILD:
			return createTreeNodeChild();
		case SoftmodelerPackage.CODE:
			return createCode();
		case SoftmodelerPackage.CATEGORY:
			return createCategory();
		case SoftmodelerPackage.CODE_ENTRY:
			return createCodeEntry();
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT:
			return createNotificationParticipant();
		case SoftmodelerPackage.NOTIFICATION_DEFINITION:
			return createNotificationDefinition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SoftmodelerPackage.OBJECT_STATE:
			return createObjectStateFromString(eDataType, initialValue);
		case SoftmodelerPackage.LABELS_TYPE:
			return createLabelsTypeFromString(eDataType, initialValue);
		case SoftmodelerPackage.MAIL_ADDRESS_TYPE:
			return createMailAddressTypeFromString(eDataType, initialValue);
		case SoftmodelerPackage.RESOURCE_TYPE:
			return createResourceTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SoftmodelerPackage.OBJECT_STATE:
			return convertObjectStateToString(eDataType, instanceValue);
		case SoftmodelerPackage.LABELS_TYPE:
			return convertLabelsTypeToString(eDataType, instanceValue);
		case SoftmodelerPackage.MAIL_ADDRESS_TYPE:
			return convertMailAddressTypeToString(eDataType, instanceValue);
		case SoftmodelerPackage.RESOURCE_TYPE:
			return convertResourceTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ObjectRef createObjectRef() {
		ObjectRefImpl objectRef = new ObjectRefImpl();
		return objectRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TreeNode createTreeNode() {
		TreeNodeImpl treeNode = new TreeNodeImpl();
		return treeNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public TreeNodeChild createTreeNodeChild() {
		TreeNodeChildImpl treeNodeChild = new TreeNodeChildImpl();
		return treeNodeChild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CodeEntry createCodeEntry() {
		CodeEntryImpl codeEntry = new CodeEntryImpl();
		return codeEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationParticipant createNotificationParticipant() {
		NotificationParticipantImpl notificationParticipant = new NotificationParticipantImpl();
		return notificationParticipant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationDefinition createNotificationDefinition() {
		NotificationDefinitionImpl notificationDefinition = new NotificationDefinitionImpl();
		return notificationDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectState createObjectStateFromString(EDataType eDataType, String initialValue) {
		ObjectState result = ObjectState.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertObjectStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LabelsType createLabelsTypeFromString(EDataType eDataType, String initialValue) {
		return (LabelsType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertLabelsTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MailAddressType createMailAddressTypeFromString(EDataType eDataType, String initialValue) {
		return (MailAddressType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertMailAddressTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceType createResourceTypeFromString(EDataType eDataType, String initialValue) {
		return (ResourceType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertResourceTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SoftmodelerPackage getSoftmodelerPackage() {
		return (SoftmodelerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftmodelerPackage getPackage() {
		return SoftmodelerPackage.eINSTANCE;
	}

} // SoftmodelerFactoryImpl
