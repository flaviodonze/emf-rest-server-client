/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see com.softmodeler.model.SoftmodelerPackage
 * @generated
 */
public interface SoftmodelerFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	SoftmodelerFactory eINSTANCE = com.softmodeler.model.impl.SoftmodelerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attachment</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attachment</em>'.
	 * @generated
	 */
	Attachment createAttachment();

	/**
	 * Returns a new object of class '<em>Object Ref</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Object Ref</em>'.
	 * @generated
	 */
	ObjectRef createObjectRef();

	/**
	 * Returns a new object of class '<em>Tree Node</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tree Node</em>'.
	 * @generated
	 */
	TreeNode createTreeNode();

	/**
	 * Returns a new object of class '<em>Tree Node Child</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tree Node Child</em>'.
	 * @generated
	 */
	TreeNodeChild createTreeNodeChild();

	/**
	 * Returns a new object of class '<em>Code</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

	/**
	 * Returns a new object of class '<em>Category</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Code Entry</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Code Entry</em>'.
	 * @generated
	 */
	CodeEntry createCodeEntry();

	/**
	 * Returns a new object of class '<em>Notification Participant</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Notification Participant</em>'.
	 * @generated
	 */
	NotificationParticipant createNotificationParticipant();

	/**
	 * Returns a new object of class '<em>Notification Definition</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Notification Definition</em>'.
	 * @generated
	 */
	NotificationDefinition createNotificationDefinition();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftmodelerPackage getSoftmodelerPackage();

} // SoftmodelerFactory
