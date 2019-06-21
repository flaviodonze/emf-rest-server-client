/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import com.softmodeler.model.type.MailAddressType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Notification Participant</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.NotificationParticipant#getId
 * <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.NotificationParticipant#getGroupId <em>Group
 * Id</em>}</li>
 * <li>{@link com.softmodeler.model.NotificationParticipant#getMailAddress
 * <em>Mail Address</em>}</li>
 * <li>{@link com.softmodeler.model.NotificationParticipant#getObjectRef
 * <em>Object Ref</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationParticipant()
 * @model
 * @generated
 */
public interface NotificationParticipant extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationParticipant_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationParticipant#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationParticipant_GroupId()
	 * @model
	 * @generated
	 */
	String getGroupId();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationParticipant#getGroupId <em>Group
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Mail Address</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mail Address</em>' attribute.
	 * @see #setMailAddress(MailAddressType)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationParticipant_MailAddress()
	 * @model dataType="com.softmodeler.model.MailAddressType"
	 * @generated
	 */
	MailAddressType getMailAddress();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationParticipant#getMailAddress <em>Mail
	 * Address</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Mail Address</em>' attribute.
	 * @see #getMailAddress()
	 * @generated
	 */
	void setMailAddress(MailAddressType value);

	/**
	 * Returns the value of the '<em><b>Object Ref</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object Ref</em>' reference.
	 * @see #setObjectRef(ObjectRef)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationParticipant_ObjectRef()
	 * @model
	 * @generated
	 */
	ObjectRef getObjectRef();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationParticipant#getObjectRef <em>Object
	 * Ref</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Object Ref</em>' reference.
	 * @see #getObjectRef()
	 * @generated
	 */
	void setObjectRef(ObjectRef value);

} // NotificationParticipant
