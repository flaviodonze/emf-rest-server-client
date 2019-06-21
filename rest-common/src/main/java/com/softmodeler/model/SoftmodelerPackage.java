/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see com.softmodeler.model.SoftmodelerFactory
 * @model kind="package"
 * @generated
 */
public interface SoftmodelerPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http:///www.softmodeler.com/model/softmodeler/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SoftmodelerPackage eINSTANCE = com.softmodeler.model.impl.SoftmodelerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.BasicObjectImpl
	 * <em>Basic Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.BasicObjectImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicObject()
	 * @generated
	 */
	int BASIC_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__LOCALE = 2;

	/**
	 * The number of structural features of the '<em>Basic Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.AttachmentImpl
	 * <em>Attachment</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.AttachmentImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ID = BASIC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DOMAIN = BASIC_OBJECT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LOCALE = BASIC_OBJECT__LOCALE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__KEY = BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__OBJECT_ID = BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA = BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.ObjectRefImpl
	 * <em>Object Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.ObjectRefImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getObjectRef()
	 * @generated
	 */
	int OBJECT_REF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__ID = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__STATE = 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__LABELS = 3;

	/**
	 * The feature id for the '<em><b>App Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__APP_ID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF__NATURE = 6;

	/**
	 * The number of structural features of the '<em>Object Ref</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_REF_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.TreeNodeImpl
	 * <em>Tree Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.TreeNodeImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getTreeNode()
	 * @generated
	 */
	int TREE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__ID = BASIC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__DOMAIN = BASIC_OBJECT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__LOCALE = BASIC_OBJECT__LOCALE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__NAME = BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__CHILDS = BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE__OBJECT = BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tree Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_FEATURE_COUNT = BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link com.softmodeler.model.impl.TreeNodeChildImpl <em>Tree Node
	 * Child</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.TreeNodeChildImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getTreeNodeChild()
	 * @generated
	 */
	int TREE_NODE_CHILD = 4;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_CHILD__NODE_ID = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_CHILD__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Tree Node Child</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TREE_NODE_CHILD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.BasicCodeImpl
	 * <em>Basic Code</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.BasicCodeImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicCode()
	 * @generated
	 */
	int BASIC_CODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__NAMES = 2;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__DESCRIPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Sort Hint</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__SORT_HINT = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__DOMAIN = 6;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__ACTIVE = 7;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE__STRUCTURE = 8;

	/**
	 * The number of structural features of the '<em>Basic Code</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_CODE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.CodeImpl
	 * <em>Code</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.CodeImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__ID = BASIC_CODE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__PARENT = BASIC_CODE__PARENT;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__NAMES = BASIC_CODE__NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__DESCRIPTIONS = BASIC_CODE__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__ENTRIES = BASIC_CODE__ENTRIES;

	/**
	 * The feature id for the '<em><b>Sort Hint</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__SORT_HINT = BASIC_CODE__SORT_HINT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__DOMAIN = BASIC_CODE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__ACTIVE = BASIC_CODE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE__STRUCTURE = BASIC_CODE__STRUCTURE;

	/**
	 * The number of structural features of the '<em>Code</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = BASIC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.CategoryImpl
	 * <em>Category</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.CategoryImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = BASIC_CODE__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT = BASIC_CODE__PARENT;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAMES = BASIC_CODE__NAMES;

	/**
	 * The feature id for the '<em><b>Descriptions</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTIONS = BASIC_CODE__DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ENTRIES = BASIC_CODE__ENTRIES;

	/**
	 * The feature id for the '<em><b>Sort Hint</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SORT_HINT = BASIC_CODE__SORT_HINT;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DOMAIN = BASIC_CODE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ACTIVE = BASIC_CODE__ACTIVE;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__STRUCTURE = BASIC_CODE__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CLASSIFIER = BASIC_CODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated Classifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ASSOCIATED_CLASSIFIER = BASIC_CODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = BASIC_CODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.impl.CodeEntryImpl
	 * <em>Code Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.CodeEntryImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCodeEntry()
	 * @generated
	 */
	int CODE_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY__KEY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Code Entry</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CODE_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the
	 * '{@link com.softmodeler.model.impl.NotificationParticipantImpl
	 * <em>Notification Participant</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.NotificationParticipantImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getNotificationParticipant()
	 * @generated
	 */
	int NOTIFICATION_PARTICIPANT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PARTICIPANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PARTICIPANT__GROUP_ID = 1;

	/**
	 * The feature id for the '<em><b>Mail Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PARTICIPANT__MAIL_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Object Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PARTICIPANT__OBJECT_REF = 3;

	/**
	 * The number of structural features of the '<em>Notification Participant</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_PARTICIPANT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the
	 * '{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl <em>Basic
	 * Notification Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.BasicNotificationDefinitionImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicNotificationDefinition()
	 * @generated
	 */
	int BASIC_NOTIFICATION_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__ID = BASIC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__DOMAIN = BASIC_OBJECT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__LOCALE = BASIC_OBJECT__LOCALE;

	/**
	 * The feature id for the '<em><b>Notification Event Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID = BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__ACTIVE = BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__DESCRIPTION = BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__SENDER = BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__RECEIVERS = BASIC_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cc Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS = BASIC_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bcc Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS = BASIC_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__DELIVERY = BASIC_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION__IDENTIFIER = BASIC_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Basic Notification
	 * Definition</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BASIC_NOTIFICATION_DEFINITION_FEATURE_COUNT = BASIC_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the
	 * '{@link com.softmodeler.model.impl.NotificationDefinitionImpl
	 * <em>Notification Definition</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see com.softmodeler.model.impl.NotificationDefinitionImpl
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getNotificationDefinition()
	 * @generated
	 */
	int NOTIFICATION_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__ID = BASIC_NOTIFICATION_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__DOMAIN = BASIC_NOTIFICATION_DEFINITION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__LOCALE = BASIC_NOTIFICATION_DEFINITION__LOCALE;

	/**
	 * The feature id for the '<em><b>Notification Event Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID = BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__ACTIVE = BASIC_NOTIFICATION_DEFINITION__ACTIVE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__DESCRIPTION = BASIC_NOTIFICATION_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__SENDER = BASIC_NOTIFICATION_DEFINITION__SENDER;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__RECEIVERS = BASIC_NOTIFICATION_DEFINITION__RECEIVERS;

	/**
	 * The feature id for the '<em><b>Cc Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__CC_RECEIVERS = BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Bcc Receivers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__BCC_RECEIVERS = BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS;

	/**
	 * The feature id for the '<em><b>Delivery</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__DELIVERY = BASIC_NOTIFICATION_DEFINITION__DELIVERY;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__IDENTIFIER = BASIC_NOTIFICATION_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Include Filter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__INCLUDE_FILTER = BASIC_NOTIFICATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude Filter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__EXCLUDE_FILTER = BASIC_NOTIFICATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION__TEMPLATE = BASIC_NOTIFICATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Notification Definition</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_DEFINITION_FEATURE_COUNT = BASIC_NOTIFICATION_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.softmodeler.model.ObjectState
	 * <em>Object State</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.ObjectState
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getObjectState()
	 * @generated
	 */
	int OBJECT_STATE = 12;

	/**
	 * The meta object id for the '<em>Labels Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.type.LabelsType
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getLabelsType()
	 * @generated
	 */
	int LABELS_TYPE = 13;

	/**
	 * The meta object id for the '<em>Mail Address Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.type.MailAddressType
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getMailAddressType()
	 * @generated
	 */
	int MAIL_ADDRESS_TYPE = 14;

	/**
	 * The meta object id for the '<em>Resource Type</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see com.softmodeler.model.type.ResourceType
	 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 15;

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.Attachment
	 * <em>Attachment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see com.softmodeler.model.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.Attachment#getKey <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.softmodeler.model.Attachment#getKey()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Key();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.Attachment#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see com.softmodeler.model.Attachment#getObjectId()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_ObjectId();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.Attachment#getData <em>Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.softmodeler.model.Attachment#getData()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_Data();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.BasicObject
	 * <em>Basic Object</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Basic Object</em>'.
	 * @see com.softmodeler.model.BasicObject
	 * @generated
	 */
	EClass getBasicObject();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicObject#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.softmodeler.model.BasicObject#getId()
	 * @see #getBasicObject()
	 * @generated
	 */
	EAttribute getBasicObject_Id();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicObject#getDomain <em>Domain</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.softmodeler.model.BasicObject#getDomain()
	 * @see #getBasicObject()
	 * @generated
	 */
	EAttribute getBasicObject_Domain();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicObject#getLocale <em>Locale</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see com.softmodeler.model.BasicObject#getLocale()
	 * @see #getBasicObject()
	 * @generated
	 */
	EAttribute getBasicObject_Locale();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.ObjectRef
	 * <em>Object Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object Ref</em>'.
	 * @see com.softmodeler.model.ObjectRef
	 * @generated
	 */
	EClass getObjectRef();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.softmodeler.model.ObjectRef#getId()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_Id();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getDomain <em>Domain</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.softmodeler.model.ObjectRef#getDomain()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_Domain();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getState <em>State</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see com.softmodeler.model.ObjectRef#getState()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_State();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getLabels <em>Labels</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see com.softmodeler.model.ObjectRef#getLabels()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_Labels();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getAppId <em>App Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>App Id</em>'.
	 * @see com.softmodeler.model.ObjectRef#getAppId()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_AppId();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.softmodeler.model.ObjectRef#getType()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_Type();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.ObjectRef#getNature <em>Nature</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see com.softmodeler.model.ObjectRef#getNature()
	 * @see #getObjectRef()
	 * @generated
	 */
	EAttribute getObjectRef_Nature();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.TreeNode
	 * <em>Tree Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Tree Node</em>'.
	 * @see com.softmodeler.model.TreeNode
	 * @generated
	 */
	EClass getTreeNode();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.TreeNode#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softmodeler.model.TreeNode#getName()
	 * @see #getTreeNode()
	 * @generated
	 */
	EAttribute getTreeNode_Name();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link com.softmodeler.model.TreeNode#getChilds <em>Childs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see com.softmodeler.model.TreeNode#getChilds()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Childs();

	/**
	 * Returns the meta object for the reference
	 * '{@link com.softmodeler.model.TreeNode#getObject <em>Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see com.softmodeler.model.TreeNode#getObject()
	 * @see #getTreeNode()
	 * @generated
	 */
	EReference getTreeNode_Object();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.TreeNodeChild
	 * <em>Tree Node Child</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Tree Node Child</em>'.
	 * @see com.softmodeler.model.TreeNodeChild
	 * @generated
	 */
	EClass getTreeNodeChild();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.TreeNodeChild#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see com.softmodeler.model.TreeNodeChild#getNodeId()
	 * @see #getTreeNodeChild()
	 * @generated
	 */
	EAttribute getTreeNodeChild_NodeId();

	/**
	 * Returns the meta object for the container reference
	 * '{@link com.softmodeler.model.TreeNodeChild#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see com.softmodeler.model.TreeNodeChild#getParent()
	 * @see #getTreeNodeChild()
	 * @generated
	 */
	EReference getTreeNodeChild_Parent();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.BasicCode
	 * <em>Basic Code</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Basic Code</em>'.
	 * @see com.softmodeler.model.BasicCode
	 * @generated
	 */
	EClass getBasicCode();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.softmodeler.model.BasicCode#getId()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Id();

	/**
	 * Returns the meta object for the reference
	 * '{@link com.softmodeler.model.BasicCode#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see com.softmodeler.model.BasicCode#getParent()
	 * @see #getBasicCode()
	 * @generated
	 */
	EReference getBasicCode_Parent();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#getNames <em>Names</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Names</em>'.
	 * @see com.softmodeler.model.BasicCode#getNames()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Names();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#getDescriptions
	 * <em>Descriptions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Descriptions</em>'.
	 * @see com.softmodeler.model.BasicCode#getDescriptions()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Descriptions();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link com.softmodeler.model.BasicCode#getEntries <em>Entries</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Entries</em>'.
	 * @see com.softmodeler.model.BasicCode#getEntries()
	 * @see #getBasicCode()
	 * @generated
	 */
	EReference getBasicCode_Entries();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#getSortHint <em>Sort Hint</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Sort Hint</em>'.
	 * @see com.softmodeler.model.BasicCode#getSortHint()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_SortHint();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#getDomain <em>Domain</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.softmodeler.model.BasicCode#getDomain()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Domain();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#isActive <em>Active</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see com.softmodeler.model.BasicCode#isActive()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Active();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicCode#isStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see com.softmodeler.model.BasicCode#isStructure()
	 * @see #getBasicCode()
	 * @generated
	 */
	EAttribute getBasicCode_Structure();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.Code
	 * <em>Code</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code</em>'.
	 * @see com.softmodeler.model.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.Category
	 * <em>Category</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Category</em>'.
	 * @see com.softmodeler.model.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute list
	 * '{@link com.softmodeler.model.Category#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute list '<em>Classifier</em>'.
	 * @see com.softmodeler.model.Category#getClassifier()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Classifier();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.Category#getAssociatedClassifier <em>Associated
	 * Classifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Associated Classifier</em>'.
	 * @see com.softmodeler.model.Category#getAssociatedClassifier()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_AssociatedClassifier();

	/**
	 * Returns the meta object for class '{@link com.softmodeler.model.CodeEntry
	 * <em>Code Entry</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Code Entry</em>'.
	 * @see com.softmodeler.model.CodeEntry
	 * @generated
	 */
	EClass getCodeEntry();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.CodeEntry#getId <em>Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.softmodeler.model.CodeEntry#getId()
	 * @see #getCodeEntry()
	 * @generated
	 */
	EAttribute getCodeEntry_Id();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.CodeEntry#getKey <em>Key</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.softmodeler.model.CodeEntry#getKey()
	 * @see #getCodeEntry()
	 * @generated
	 */
	EAttribute getCodeEntry_Key();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.CodeEntry#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.softmodeler.model.CodeEntry#getValue()
	 * @see #getCodeEntry()
	 * @generated
	 */
	EAttribute getCodeEntry_Value();

	/**
	 * Returns the meta object for class
	 * '{@link com.softmodeler.model.NotificationParticipant <em>Notification
	 * Participant</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Notification Participant</em>'.
	 * @see com.softmodeler.model.NotificationParticipant
	 * @generated
	 */
	EClass getNotificationParticipant();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationParticipant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.softmodeler.model.NotificationParticipant#getId()
	 * @see #getNotificationParticipant()
	 * @generated
	 */
	EAttribute getNotificationParticipant_Id();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationParticipant#getGroupId <em>Group
	 * Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see com.softmodeler.model.NotificationParticipant#getGroupId()
	 * @see #getNotificationParticipant()
	 * @generated
	 */
	EAttribute getNotificationParticipant_GroupId();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationParticipant#getMailAddress <em>Mail
	 * Address</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Mail Address</em>'.
	 * @see com.softmodeler.model.NotificationParticipant#getMailAddress()
	 * @see #getNotificationParticipant()
	 * @generated
	 */
	EAttribute getNotificationParticipant_MailAddress();

	/**
	 * Returns the meta object for the reference
	 * '{@link com.softmodeler.model.NotificationParticipant#getObjectRef <em>Object
	 * Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Object Ref</em>'.
	 * @see com.softmodeler.model.NotificationParticipant#getObjectRef()
	 * @see #getNotificationParticipant()
	 * @generated
	 */
	EReference getNotificationParticipant_ObjectRef();

	/**
	 * Returns the meta object for class
	 * '{@link com.softmodeler.model.BasicNotificationDefinition <em>Basic
	 * Notification Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Basic Notification Definition</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition
	 * @generated
	 */
	EClass getBasicNotificationDefinition();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getNotificationEventId
	 * <em>Notification Event Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the attribute '<em>Notification Event Id</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getNotificationEventId()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EAttribute getBasicNotificationDefinition_NotificationEventId();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#isActive
	 * <em>Active</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#isActive()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EAttribute getBasicNotificationDefinition_Active();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getDescription
	 * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getDescription()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EAttribute getBasicNotificationDefinition_Description();

	/**
	 * Returns the meta object for the containment reference
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getSender
	 * <em>Sender</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getSender()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EReference getBasicNotificationDefinition_Sender();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getReceivers
	 * <em>Receivers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Receivers</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getReceivers()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EReference getBasicNotificationDefinition_Receivers();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getCcReceivers
	 * <em>Cc Receivers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Cc
	 *         Receivers</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getCcReceivers()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EReference getBasicNotificationDefinition_CcReceivers();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getBccReceivers
	 * <em>Bcc Receivers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Bcc
	 *         Receivers</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getBccReceivers()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EReference getBasicNotificationDefinition_BccReceivers();

	/**
	 * Returns the meta object for the reference
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getDelivery
	 * <em>Delivery</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Delivery</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getDelivery()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EReference getBasicNotificationDefinition_Delivery();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.softmodeler.model.BasicNotificationDefinition#getIdentifier()
	 * @see #getBasicNotificationDefinition()
	 * @generated
	 */
	EAttribute getBasicNotificationDefinition_Identifier();

	/**
	 * Returns the meta object for class
	 * '{@link com.softmodeler.model.NotificationDefinition <em>Notification
	 * Definition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Notification Definition</em>'.
	 * @see com.softmodeler.model.NotificationDefinition
	 * @generated
	 */
	EClass getNotificationDefinition();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationDefinition#getIncludeFilter
	 * <em>Include Filter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Include Filter</em>'.
	 * @see com.softmodeler.model.NotificationDefinition#getIncludeFilter()
	 * @see #getNotificationDefinition()
	 * @generated
	 */
	EAttribute getNotificationDefinition_IncludeFilter();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationDefinition#getExcludeFilter
	 * <em>Exclude Filter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Exclude Filter</em>'.
	 * @see com.softmodeler.model.NotificationDefinition#getExcludeFilter()
	 * @see #getNotificationDefinition()
	 * @generated
	 */
	EAttribute getNotificationDefinition_ExcludeFilter();

	/**
	 * Returns the meta object for the attribute
	 * '{@link com.softmodeler.model.NotificationDefinition#isTemplate
	 * <em>Template</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see com.softmodeler.model.NotificationDefinition#isTemplate()
	 * @see #getNotificationDefinition()
	 * @generated
	 */
	EAttribute getNotificationDefinition_Template();

	/**
	 * Returns the meta object for enum '{@link com.softmodeler.model.ObjectState
	 * <em>Object State</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>Object State</em>'.
	 * @see com.softmodeler.model.ObjectState
	 * @generated
	 */
	EEnum getObjectState();

	/**
	 * Returns the meta object for data type
	 * '{@link com.softmodeler.model.type.LabelsType <em>Labels Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Labels Type</em>'.
	 * @see com.softmodeler.model.type.LabelsType
	 * @model instanceClass="com.softmodeler.model.type.LabelsType"
	 * @generated
	 */
	EDataType getLabelsType();

	/**
	 * Returns the meta object for data type
	 * '{@link com.softmodeler.model.type.MailAddressType <em>Mail Address
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Mail Address Type</em>'.
	 * @see com.softmodeler.model.type.MailAddressType
	 * @model instanceClass="com.softmodeler.model.type.MailAddressType"
	 * @generated
	 */
	EDataType getMailAddressType();

	/**
	 * Returns the meta object for data type
	 * '{@link com.softmodeler.model.type.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>Resource Type</em>'.
	 * @see com.softmodeler.model.type.ResourceType
	 * @model instanceClass="com.softmodeler.model.type.ResourceType"
	 * @generated
	 */
	EDataType getResourceType();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftmodelerFactory getSoftmodelerFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.AttachmentImpl <em>Attachment</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.AttachmentImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTACHMENT__KEY = eINSTANCE.getAttachment_Key();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTACHMENT__OBJECT_ID = eINSTANCE.getAttachment_ObjectId();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTACHMENT__DATA = eINSTANCE.getAttachment_Data();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.BasicObjectImpl <em>Basic Object</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.BasicObjectImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicObject()
		 * @generated
		 */
		EClass BASIC_OBJECT = eINSTANCE.getBasicObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_OBJECT__ID = eINSTANCE.getBasicObject_Id();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_OBJECT__DOMAIN = eINSTANCE.getBasicObject_Domain();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_OBJECT__LOCALE = eINSTANCE.getBasicObject_Locale();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.ObjectRefImpl <em>Object Ref</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.ObjectRefImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getObjectRef()
		 * @generated
		 */
		EClass OBJECT_REF = eINSTANCE.getObjectRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__ID = eINSTANCE.getObjectRef_Id();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__DOMAIN = eINSTANCE.getObjectRef_Domain();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__STATE = eINSTANCE.getObjectRef_State();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__LABELS = eINSTANCE.getObjectRef_Labels();

		/**
		 * The meta object literal for the '<em><b>App Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__APP_ID = eINSTANCE.getObjectRef_AppId();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__TYPE = eINSTANCE.getObjectRef_Type();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT_REF__NATURE = eINSTANCE.getObjectRef_Nature();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.TreeNodeImpl <em>Tree Node</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.TreeNodeImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getTreeNode()
		 * @generated
		 */
		EClass TREE_NODE = eINSTANCE.getTreeNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TREE_NODE__NAME = eINSTANCE.getTreeNode_Name();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TREE_NODE__CHILDS = eINSTANCE.getTreeNode_Childs();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TREE_NODE__OBJECT = eINSTANCE.getTreeNode_Object();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.TreeNodeChildImpl <em>Tree Node
		 * Child</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.TreeNodeChildImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getTreeNodeChild()
		 * @generated
		 */
		EClass TREE_NODE_CHILD = eINSTANCE.getTreeNodeChild();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TREE_NODE_CHILD__NODE_ID = eINSTANCE.getTreeNodeChild_NodeId();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TREE_NODE_CHILD__PARENT = eINSTANCE.getTreeNodeChild_Parent();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.BasicCodeImpl <em>Basic Code</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.BasicCodeImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicCode()
		 * @generated
		 */
		EClass BASIC_CODE = eINSTANCE.getBasicCode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__ID = eINSTANCE.getBasicCode_Id();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_CODE__PARENT = eINSTANCE.getBasicCode_Parent();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__NAMES = eINSTANCE.getBasicCode_Names();

		/**
		 * The meta object literal for the '<em><b>Descriptions</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__DESCRIPTIONS = eINSTANCE.getBasicCode_Descriptions();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_CODE__ENTRIES = eINSTANCE.getBasicCode_Entries();

		/**
		 * The meta object literal for the '<em><b>Sort Hint</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__SORT_HINT = eINSTANCE.getBasicCode_SortHint();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__DOMAIN = eINSTANCE.getBasicCode_Domain();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__ACTIVE = eINSTANCE.getBasicCode_Active();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_CODE__STRUCTURE = eINSTANCE.getBasicCode_Structure();

		/**
		 * The meta object literal for the '{@link com.softmodeler.model.impl.CodeImpl
		 * <em>Code</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.CodeImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.CategoryImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' attribute list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CATEGORY__CLASSIFIER = eINSTANCE.getCategory_Classifier();

		/**
		 * The meta object literal for the '<em><b>Associated Classifier</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CATEGORY__ASSOCIATED_CLASSIFIER = eINSTANCE.getCategory_AssociatedClassifier();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.CodeEntryImpl <em>Code Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.CodeEntryImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getCodeEntry()
		 * @generated
		 */
		EClass CODE_ENTRY = eINSTANCE.getCodeEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_ENTRY__ID = eINSTANCE.getCodeEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_ENTRY__KEY = eINSTANCE.getCodeEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CODE_ENTRY__VALUE = eINSTANCE.getCodeEntry_Value();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.NotificationParticipantImpl
		 * <em>Notification Participant</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.NotificationParticipantImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getNotificationParticipant()
		 * @generated
		 */
		EClass NOTIFICATION_PARTICIPANT = eINSTANCE.getNotificationParticipant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_PARTICIPANT__ID = eINSTANCE.getNotificationParticipant_Id();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_PARTICIPANT__GROUP_ID = eINSTANCE.getNotificationParticipant_GroupId();

		/**
		 * The meta object literal for the '<em><b>Mail Address</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_PARTICIPANT__MAIL_ADDRESS = eINSTANCE.getNotificationParticipant_MailAddress();

		/**
		 * The meta object literal for the '<em><b>Object Ref</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NOTIFICATION_PARTICIPANT__OBJECT_REF = eINSTANCE.getNotificationParticipant_ObjectRef();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl <em>Basic
		 * Notification Definition</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.BasicNotificationDefinitionImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getBasicNotificationDefinition()
		 * @generated
		 */
		EClass BASIC_NOTIFICATION_DEFINITION = eINSTANCE.getBasicNotificationDefinition();

		/**
		 * The meta object literal for the '<em><b>Notification Event Id</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID = eINSTANCE
				.getBasicNotificationDefinition_NotificationEventId();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_NOTIFICATION_DEFINITION__ACTIVE = eINSTANCE.getBasicNotificationDefinition_Active();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_NOTIFICATION_DEFINITION__DESCRIPTION = eINSTANCE.getBasicNotificationDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_NOTIFICATION_DEFINITION__SENDER = eINSTANCE.getBasicNotificationDefinition_Sender();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_NOTIFICATION_DEFINITION__RECEIVERS = eINSTANCE.getBasicNotificationDefinition_Receivers();

		/**
		 * The meta object literal for the '<em><b>Cc Receivers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS = eINSTANCE.getBasicNotificationDefinition_CcReceivers();

		/**
		 * The meta object literal for the '<em><b>Bcc Receivers</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS = eINSTANCE
				.getBasicNotificationDefinition_BccReceivers();

		/**
		 * The meta object literal for the '<em><b>Delivery</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference BASIC_NOTIFICATION_DEFINITION__DELIVERY = eINSTANCE.getBasicNotificationDefinition_Delivery();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute BASIC_NOTIFICATION_DEFINITION__IDENTIFIER = eINSTANCE.getBasicNotificationDefinition_Identifier();

		/**
		 * The meta object literal for the
		 * '{@link com.softmodeler.model.impl.NotificationDefinitionImpl
		 * <em>Notification Definition</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see com.softmodeler.model.impl.NotificationDefinitionImpl
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getNotificationDefinition()
		 * @generated
		 */
		EClass NOTIFICATION_DEFINITION = eINSTANCE.getNotificationDefinition();

		/**
		 * The meta object literal for the '<em><b>Include Filter</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_DEFINITION__INCLUDE_FILTER = eINSTANCE.getNotificationDefinition_IncludeFilter();

		/**
		 * The meta object literal for the '<em><b>Exclude Filter</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_DEFINITION__EXCLUDE_FILTER = eINSTANCE.getNotificationDefinition_ExcludeFilter();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NOTIFICATION_DEFINITION__TEMPLATE = eINSTANCE.getNotificationDefinition_Template();

		/**
		 * The meta object literal for the '{@link com.softmodeler.model.ObjectState
		 * <em>Object State</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.ObjectState
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getObjectState()
		 * @generated
		 */
		EEnum OBJECT_STATE = eINSTANCE.getObjectState();

		/**
		 * The meta object literal for the '<em>Labels Type</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.type.LabelsType
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getLabelsType()
		 * @generated
		 */
		EDataType LABELS_TYPE = eINSTANCE.getLabelsType();

		/**
		 * The meta object literal for the '<em>Mail Address Type</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.type.MailAddressType
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getMailAddressType()
		 * @generated
		 */
		EDataType MAIL_ADDRESS_TYPE = eINSTANCE.getMailAddressType();

		/**
		 * The meta object literal for the '<em>Resource Type</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see com.softmodeler.model.type.ResourceType
		 * @see com.softmodeler.model.impl.SoftmodelerPackageImpl#getResourceType()
		 * @generated
		 */
		EDataType RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} // SoftmodelerPackage
