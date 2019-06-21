/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.Attachment;
import com.softmodeler.model.BasicCode;
import com.softmodeler.model.BasicNotificationDefinition;
import com.softmodeler.model.BasicObject;
import com.softmodeler.model.Category;
import com.softmodeler.model.Code;
import com.softmodeler.model.CodeEntry;
import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.NotificationParticipant;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.ObjectState;
import com.softmodeler.model.SoftmodelerFactory;
import com.softmodeler.model.SoftmodelerPackage;
import com.softmodeler.model.TreeNode;
import com.softmodeler.model.TreeNodeChild;

import com.softmodeler.model.type.LabelsType;
import com.softmodeler.model.type.MailAddressType;
import com.softmodeler.model.type.ResourceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class SoftmodelerPackageImpl extends EPackageImpl implements SoftmodelerPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass basicObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass objectRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass treeNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass treeNodeChildEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass basicCodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass notificationParticipantEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass basicNotificationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass notificationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum objectStateEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType labelsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mailAddressTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType resourceTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method
	 * {@link #init init()}, which also performs initialization of the package, or
	 * returns the registered package, if one already exists. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.softmodeler.model.SoftmodelerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftmodelerPackageImpl() {
		super(eNS_URI, SoftmodelerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link SoftmodelerPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftmodelerPackage init() {
		if (isInited)
			return (SoftmodelerPackage) EPackage.Registry.INSTANCE.getEPackage(SoftmodelerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSoftmodelerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SoftmodelerPackageImpl theSoftmodelerPackage = registeredSoftmodelerPackage instanceof SoftmodelerPackageImpl
				? (SoftmodelerPackageImpl) registeredSoftmodelerPackage
				: new SoftmodelerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSoftmodelerPackage.createPackageContents();

		// Initialize created meta-data
		theSoftmodelerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoftmodelerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftmodelerPackage.eNS_URI, theSoftmodelerPackage);
		return theSoftmodelerPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttachment_Key() {
		return (EAttribute) attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttachment_ObjectId() {
		return (EAttribute) attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAttachment_Data() {
		return (EAttribute) attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBasicObject() {
		return basicObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicObject_Id() {
		return (EAttribute) basicObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicObject_Domain() {
		return (EAttribute) basicObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicObject_Locale() {
		return (EAttribute) basicObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getObjectRef() {
		return objectRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_Id() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_Domain() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_State() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_Labels() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_AppId() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_Type() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getObjectRef_Nature() {
		return (EAttribute) objectRefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getTreeNode() {
		return treeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getTreeNode_Name() {
		return (EAttribute) treeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Childs() {
		return (EReference) treeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getTreeNode_Object() {
		return (EReference) treeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getTreeNodeChild() {
		return treeNodeChildEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getTreeNodeChild_NodeId() {
		return (EAttribute) treeNodeChildEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getTreeNodeChild_Parent() {
		return (EReference) treeNodeChildEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBasicCode() {
		return basicCodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Id() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicCode_Parent() {
		return (EReference) basicCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Names() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Descriptions() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicCode_Entries() {
		return (EReference) basicCodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_SortHint() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Domain() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Active() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicCode_Structure() {
		return (EAttribute) basicCodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Classifier() {
		return (EAttribute) categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getCategory_AssociatedClassifier() {
		return (EAttribute) categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getCodeEntry() {
		return codeEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getCodeEntry_Id() {
		return (EAttribute) codeEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getCodeEntry_Key() {
		return (EAttribute) codeEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getCodeEntry_Value() {
		return (EAttribute) codeEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNotificationParticipant() {
		return notificationParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationParticipant_Id() {
		return (EAttribute) notificationParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationParticipant_GroupId() {
		return (EAttribute) notificationParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationParticipant_MailAddress() {
		return (EAttribute) notificationParticipantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getNotificationParticipant_ObjectRef() {
		return (EReference) notificationParticipantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBasicNotificationDefinition() {
		return basicNotificationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicNotificationDefinition_NotificationEventId() {
		return (EAttribute) basicNotificationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicNotificationDefinition_Active() {
		return (EAttribute) basicNotificationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicNotificationDefinition_Description() {
		return (EAttribute) basicNotificationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicNotificationDefinition_Sender() {
		return (EReference) basicNotificationDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicNotificationDefinition_Receivers() {
		return (EReference) basicNotificationDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicNotificationDefinition_CcReceivers() {
		return (EReference) basicNotificationDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicNotificationDefinition_BccReceivers() {
		return (EReference) basicNotificationDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getBasicNotificationDefinition_Delivery() {
		return (EReference) basicNotificationDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getBasicNotificationDefinition_Identifier() {
		return (EAttribute) basicNotificationDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNotificationDefinition() {
		return notificationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationDefinition_IncludeFilter() {
		return (EAttribute) notificationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationDefinition_ExcludeFilter() {
		return (EAttribute) notificationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getNotificationDefinition_Template() {
		return (EAttribute) notificationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getObjectState() {
		return objectStateEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getLabelsType() {
		return labelsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getMailAddressType() {
		return mailAddressTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDataType getResourceType() {
		return resourceTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public SoftmodelerFactory getSoftmodelerFactory() {
		return (SoftmodelerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__KEY);
		createEAttribute(attachmentEClass, ATTACHMENT__OBJECT_ID);
		createEAttribute(attachmentEClass, ATTACHMENT__DATA);

		basicObjectEClass = createEClass(BASIC_OBJECT);
		createEAttribute(basicObjectEClass, BASIC_OBJECT__ID);
		createEAttribute(basicObjectEClass, BASIC_OBJECT__DOMAIN);
		createEAttribute(basicObjectEClass, BASIC_OBJECT__LOCALE);

		objectRefEClass = createEClass(OBJECT_REF);
		createEAttribute(objectRefEClass, OBJECT_REF__ID);
		createEAttribute(objectRefEClass, OBJECT_REF__DOMAIN);
		createEAttribute(objectRefEClass, OBJECT_REF__STATE);
		createEAttribute(objectRefEClass, OBJECT_REF__LABELS);
		createEAttribute(objectRefEClass, OBJECT_REF__APP_ID);
		createEAttribute(objectRefEClass, OBJECT_REF__TYPE);
		createEAttribute(objectRefEClass, OBJECT_REF__NATURE);

		treeNodeEClass = createEClass(TREE_NODE);
		createEAttribute(treeNodeEClass, TREE_NODE__NAME);
		createEReference(treeNodeEClass, TREE_NODE__CHILDS);
		createEReference(treeNodeEClass, TREE_NODE__OBJECT);

		treeNodeChildEClass = createEClass(TREE_NODE_CHILD);
		createEAttribute(treeNodeChildEClass, TREE_NODE_CHILD__NODE_ID);
		createEReference(treeNodeChildEClass, TREE_NODE_CHILD__PARENT);

		basicCodeEClass = createEClass(BASIC_CODE);
		createEAttribute(basicCodeEClass, BASIC_CODE__ID);
		createEReference(basicCodeEClass, BASIC_CODE__PARENT);
		createEAttribute(basicCodeEClass, BASIC_CODE__NAMES);
		createEAttribute(basicCodeEClass, BASIC_CODE__DESCRIPTIONS);
		createEReference(basicCodeEClass, BASIC_CODE__ENTRIES);
		createEAttribute(basicCodeEClass, BASIC_CODE__SORT_HINT);
		createEAttribute(basicCodeEClass, BASIC_CODE__DOMAIN);
		createEAttribute(basicCodeEClass, BASIC_CODE__ACTIVE);
		createEAttribute(basicCodeEClass, BASIC_CODE__STRUCTURE);

		codeEClass = createEClass(CODE);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__CLASSIFIER);
		createEAttribute(categoryEClass, CATEGORY__ASSOCIATED_CLASSIFIER);

		codeEntryEClass = createEClass(CODE_ENTRY);
		createEAttribute(codeEntryEClass, CODE_ENTRY__ID);
		createEAttribute(codeEntryEClass, CODE_ENTRY__KEY);
		createEAttribute(codeEntryEClass, CODE_ENTRY__VALUE);

		notificationParticipantEClass = createEClass(NOTIFICATION_PARTICIPANT);
		createEAttribute(notificationParticipantEClass, NOTIFICATION_PARTICIPANT__ID);
		createEAttribute(notificationParticipantEClass, NOTIFICATION_PARTICIPANT__GROUP_ID);
		createEAttribute(notificationParticipantEClass, NOTIFICATION_PARTICIPANT__MAIL_ADDRESS);
		createEReference(notificationParticipantEClass, NOTIFICATION_PARTICIPANT__OBJECT_REF);

		basicNotificationDefinitionEClass = createEClass(BASIC_NOTIFICATION_DEFINITION);
		createEAttribute(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID);
		createEAttribute(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__ACTIVE);
		createEAttribute(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__DESCRIPTION);
		createEReference(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__SENDER);
		createEReference(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__RECEIVERS);
		createEReference(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS);
		createEReference(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS);
		createEReference(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__DELIVERY);
		createEAttribute(basicNotificationDefinitionEClass, BASIC_NOTIFICATION_DEFINITION__IDENTIFIER);

		notificationDefinitionEClass = createEClass(NOTIFICATION_DEFINITION);
		createEAttribute(notificationDefinitionEClass, NOTIFICATION_DEFINITION__INCLUDE_FILTER);
		createEAttribute(notificationDefinitionEClass, NOTIFICATION_DEFINITION__EXCLUDE_FILTER);
		createEAttribute(notificationDefinitionEClass, NOTIFICATION_DEFINITION__TEMPLATE);

		// Create enums
		objectStateEEnum = createEEnum(OBJECT_STATE);

		// Create data types
		labelsTypeEDataType = createEDataType(LABELS_TYPE);
		mailAddressTypeEDataType = createEDataType(MAIL_ADDRESS_TYPE);
		resourceTypeEDataType = createEDataType(RESOURCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attachmentEClass.getESuperTypes().add(this.getBasicObject());
		treeNodeEClass.getESuperTypes().add(this.getBasicObject());
		codeEClass.getESuperTypes().add(this.getBasicCode());
		categoryEClass.getESuperTypes().add(this.getBasicCode());
		basicNotificationDefinitionEClass.getESuperTypes().add(this.getBasicObject());
		notificationDefinitionEClass.getESuperTypes().add(this.getBasicNotificationDefinition());

		// Initialize classes and features; add operations and parameters
		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_Key(), ecorePackage.getEString(), "key", null, 0, 1, Attachment.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_ObjectId(), ecorePackage.getEString(), "objectId", null, 0, 1, Attachment.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_Data(), this.getResourceType(), "data", null, 0, 1, Attachment.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicObjectEClass, BasicObject.class, "BasicObject", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, BasicObject.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicObject_Domain(), ecorePackage.getEInt(), "domain", null, 0, 1, BasicObject.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicObject_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, BasicObject.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(basicObjectEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(objectRefEClass, ObjectRef.class, "ObjectRef", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectRef_Id(), ecorePackage.getEString(), "id", null, 0, 1, ObjectRef.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_Domain(), ecorePackage.getEInt(), "domain", null, 0, 1, ObjectRef.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_State(), this.getObjectState(), "state", null, 0, 1, ObjectRef.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_Labels(), this.getLabelsType(), "labels", null, 0, 1, ObjectRef.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_AppId(), ecorePackage.getEString(), "appId", null, 0, 1, ObjectRef.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_Type(), ecorePackage.getEString(), "type", null, 0, 1, ObjectRef.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectRef_Nature(), ecorePackage.getEString(), "nature", null, 0, 1, ObjectRef.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(objectRefEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(objectRefEClass, ecorePackage.getEString(), "getWorkingId", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(objectRefEClass, ecorePackage.getEString(), "getDefaultLocale", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(objectRefEClass, ecorePackage.getEString(), "getDefaultLabel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(treeNodeEClass, TreeNode.class, "TreeNode", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, TreeNode.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNode_Childs(), this.getTreeNodeChild(), this.getTreeNodeChild_Parent(), "childs", null, 0, //$NON-NLS-1$
				-1, TreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTreeNode_Childs().getEKeys().add(this.getTreeNodeChild_NodeId());
		initEReference(getTreeNode_Object(), this.getObjectRef(), null, "object", null, 0, 1, TreeNode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeNodeChildEClass, TreeNodeChild.class, "TreeNodeChild", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeNodeChild_NodeId(), ecorePackage.getEString(), "nodeId", null, 0, 1, TreeNodeChild.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTreeNodeChild_Parent(), this.getTreeNode(), this.getTreeNode_Childs(), "parent", null, 0, 1, //$NON-NLS-1$
				TreeNodeChild.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCodeEClass, BasicCode.class, "BasicCode", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicCode_Id(), ecorePackage.getEString(), "id", null, 0, 1, BasicCode.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicCode_Parent(), this.getBasicCode(), null, "parent", null, 0, 1, BasicCode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_Names(), this.getLabelsType(), "names", null, 0, 1, BasicCode.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_Descriptions(), this.getLabelsType(), "descriptions", null, 0, 1, BasicCode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicCode_Entries(), this.getCodeEntry(), null, "entries", null, 0, -1, BasicCode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_SortHint(), ecorePackage.getEInt(), "sortHint", null, 0, 1, BasicCode.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_Domain(), ecorePackage.getEInt(), "domain", "-1", 0, 1, BasicCode.class, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_Active(), ecorePackage.getEBoolean(), "active", "true", 0, 1, BasicCode.class, //$NON-NLS-1$ //$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicCode_Structure(), ecorePackage.getEBoolean(), "structure", "false", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
				BasicCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(basicCodeEClass, ecorePackage.getEString(), "getSegments", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(basicCodeEClass, ecorePackage.getEString(), "getLastSegment", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(basicCodeEClass, ecorePackage.getEString(), "getPureLastSegment", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(basicCodeEClass, ecorePackage.getEString(), "getFirstSegment", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(basicCodeEClass, null, "setParentPath", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getBasicCode(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Classifier(), ecorePackage.getEString(), "classifier", null, 0, -1, Category.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getCategory_AssociatedClassifier(), ecorePackage.getEString(), "associatedClassifier", null, 0, //$NON-NLS-1$
				1, Category.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(codeEntryEClass, CodeEntry.class, "CodeEntry", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeEntry_Id(), ecorePackage.getEString(), "id", null, 0, 1, CodeEntry.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, CodeEntry.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, CodeEntry.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationParticipantEClass, NotificationParticipant.class, "NotificationParticipant", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationParticipant_Id(), ecorePackage.getEString(), "id", null, 0, 1, //$NON-NLS-1$
				NotificationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationParticipant_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, //$NON-NLS-1$
				NotificationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationParticipant_MailAddress(), this.getMailAddressType(), "mailAddress", null, 0, 1, //$NON-NLS-1$
				NotificationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotificationParticipant_ObjectRef(), this.getObjectRef(), null, "objectRef", null, 0, 1, //$NON-NLS-1$
				NotificationParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicNotificationDefinitionEClass, BasicNotificationDefinition.class, "BasicNotificationDefinition", //$NON-NLS-1$
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicNotificationDefinition_NotificationEventId(), ecorePackage.getEString(),
				"notificationEventId", null, 0, 1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicNotificationDefinition_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, //$NON-NLS-1$
				BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicNotificationDefinition_Description(), ecorePackage.getEString(), "description", null, 0, //$NON-NLS-1$
				1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicNotificationDefinition_Sender(), this.getNotificationParticipant(), null, "sender", null, //$NON-NLS-1$
				0, 1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicNotificationDefinition_Receivers(), this.getNotificationParticipant(), null, "receivers", //$NON-NLS-1$
				null, 0, -1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicNotificationDefinition_CcReceivers(), this.getNotificationParticipant(), null,
				"ccReceivers", null, 0, -1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicNotificationDefinition_BccReceivers(), this.getNotificationParticipant(), null,
				"bccReceivers", null, 0, -1, BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicNotificationDefinition_Delivery(), this.getCode(), null, "delivery", null, 0, 1, //$NON-NLS-1$
				BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicNotificationDefinition_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, //$NON-NLS-1$
				BasicNotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(basicNotificationDefinitionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEClass(notificationDefinitionEClass, NotificationDefinition.class, "NotificationDefinition", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotificationDefinition_IncludeFilter(), ecorePackage.getEString(), "includeFilter", null, 0, //$NON-NLS-1$
				1, NotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationDefinition_ExcludeFilter(), ecorePackage.getEString(), "excludeFilter", null, 0, //$NON-NLS-1$
				1, NotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotificationDefinition_Template(), ecorePackage.getEBoolean(), "template", "false", 0, 1, //$NON-NLS-1$ //$NON-NLS-2$
				NotificationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(notificationDefinitionEClass, ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(objectStateEEnum, ObjectState.class, "ObjectState"); //$NON-NLS-1$
		addEEnumLiteral(objectStateEEnum, ObjectState.NEW);
		addEEnumLiteral(objectStateEEnum, ObjectState.PRODUCTION);
		addEEnumLiteral(objectStateEEnum, ObjectState.MODIFICATION);
		addEEnumLiteral(objectStateEEnum, ObjectState.DELETION);

		// Initialize data types
		initEDataType(labelsTypeEDataType, LabelsType.class, "LabelsType", IS_SERIALIZABLE, //$NON-NLS-1$
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mailAddressTypeEDataType, MailAddressType.class, "MailAddressType", IS_SERIALIZABLE, //$NON-NLS-1$
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceTypeEDataType, ResourceType.class, "ResourceType", IS_SERIALIZABLE, //$NON-NLS-1$
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///www.softmodeler.com/model/annotation/REF
		createREFAnnotations();
		// http:///www.softmodeler.com/model/annotation/NLS
		createNLSAnnotations();
		// http:///www.softmodeler.com/model/annotation/Validate
		createValidateAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
		// http:///www.softmodeler.com/model/annotation/Code
		createCodeAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///www.softmodeler.com/model/annotation/REF</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createREFAnnotations() {
		String source = "http:///www.softmodeler.com/model/annotation/REF"; //$NON-NLS-1$
		addAnnotation(attachmentEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(treeNodeEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(codeEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(categoryEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(basicNotificationDefinitionEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(notificationDefinitionEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///www.softmodeler.com/model/annotation/NLS</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createNLSAnnotations() {
		String source = "http:///www.softmodeler.com/model/annotation/NLS"; //$NON-NLS-1$
		addAnnotation(attachmentEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getTreeNode_Name(), source, new String[] { "enabled", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(basicNotificationDefinitionEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(notificationDefinitionEClass, source, new String[] { "enabled", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///www.softmodeler.com/model/annotation/Validate</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createValidateAnnotations() {
		String source = "http:///www.softmodeler.com/model/annotation/Validate"; //$NON-NLS-1$
		addAnnotation(getBasicObject_Locale(), source, new String[] { "validator", "required" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getBasicCode_Id(), source, new String[] { "validator", "required" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getBasicCode_Names(), source, new String[] { "validator", "required" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>teneo.jpa</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createTeneoAnnotations() {
		String source = "teneo.jpa"; //$NON-NLS-1$
		addAnnotation(getObjectRef_Labels(), source, new String[] { "value", "@Column(length=2000)\r\n" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getObjectRef_AppId(), source, new String[] { "value", "@Column(length=10)\r\n" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getObjectRef_Nature(), source, new String[] { "value", "@Column(length=25)\r\n" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getTreeNode_Childs(), source,
				new String[] { "appinfo", "@OneToMany(cascade={MERGE,PERSIST,REFRESH} fetch=EAGER)" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getTreeNodeChild_Parent(), source,
				new String[] { "appinfo", "@ManyToOne(cascade={MERGE,PERSIST,REFRESH})" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(getBasicCode_Names(), source, new String[] { "value", "@Column(length=2000)\r\n" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getBasicCode_Descriptions(), source, new String[] { "value", "@Column(length=2000)\r\n" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getNotificationDefinition_IncludeFilter(), source, new String[] { "value", "@Column(length=2000)" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getNotificationDefinition_ExcludeFilter(), source, new String[] { "value", "@Column(length=2000)" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///www.softmodeler.com/model/annotation/Code</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createCodeAnnotations() {
		String source = "http:///www.softmodeler.com/model/annotation/Code"; //$NON-NLS-1$
		addAnnotation(getBasicNotificationDefinition_Delivery(), source, new String[] { "path", "$NOTIFICATIONDELIVERY" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} // SoftmodelerPackageImpl
