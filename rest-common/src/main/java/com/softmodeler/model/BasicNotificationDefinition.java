/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Basic
 * Notification Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getNotificationEventId
 * <em>Notification Event Id</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#isActive
 * <em>Active</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getSender
 * <em>Sender</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getReceivers
 * <em>Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getCcReceivers
 * <em>Cc Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getBccReceivers
 * <em>Bcc Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getDelivery
 * <em>Delivery</em>}</li>
 * <li>{@link com.softmodeler.model.BasicNotificationDefinition#getIdentifier
 * <em>Identifier</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition()
 * @model abstract="true"
 *        annotation="http:///www.softmodeler.com/model/annotation/NLS
 *        enabled='false'"
 *        annotation="http:///www.softmodeler.com/model/annotation/REF
 *        enabled='false'"
 * @generated
 */
public interface BasicNotificationDefinition extends BasicObject {
	/**
	 * Returns the value of the '<em><b>Notification Event Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Notification Event Id</em>' attribute.
	 * @see #setNotificationEventId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_NotificationEventId()
	 * @model
	 * @generated
	 */
	String getNotificationEventId();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getNotificationEventId
	 * <em>Notification Event Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Notification Event Id</em>' attribute.
	 * @see #getNotificationEventId()
	 * @generated
	 */
	void setNotificationEventId(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#isActive
	 * <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getDescription
	 * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(NotificationParticipant)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Sender()
	 * @model containment="true"
	 * @generated
	 */
	NotificationParticipant getSender();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getSender
	 * <em>Sender</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(NotificationParticipant value);

	/**
	 * Returns the value of the '<em><b>Receivers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link com.softmodeler.model.NotificationParticipant}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Receivers</em>' containment reference list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Receivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NotificationParticipant> getReceivers();

	/**
	 * Returns the value of the '<em><b>Cc Receivers</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link com.softmodeler.model.NotificationParticipant}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cc Receivers</em>' containment reference list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_CcReceivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NotificationParticipant> getCcReceivers();

	/**
	 * Returns the value of the '<em><b>Bcc Receivers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link com.softmodeler.model.NotificationParticipant}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bcc Receivers</em>' containment reference list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_BccReceivers()
	 * @model containment="true"
	 * @generated
	 */
	EList<NotificationParticipant> getBccReceivers();

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Delivery</em>' reference.
	 * @see #setDelivery(Code)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Delivery()
	 * @model annotation="http:///www.softmodeler.com/model/annotation/Code
	 *        path='$NOTIFICATIONDELIVERY'"
	 * @generated
	 */
	Code getDelivery();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getDelivery
	 * <em>Delivery</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Delivery</em>' reference.
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(Code value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicNotificationDefinition_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.BasicNotificationDefinition#getIdentifier
	 * <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        getDescription();'"
	 * @generated
	 */
	@Override
	String toString();

} // BasicNotificationDefinition
