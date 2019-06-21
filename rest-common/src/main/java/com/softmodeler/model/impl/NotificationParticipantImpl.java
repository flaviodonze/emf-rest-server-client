/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.NotificationParticipant;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.SoftmodelerPackage;

import com.softmodeler.model.type.MailAddressType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Notification Participant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.NotificationParticipantImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.NotificationParticipantImpl#getGroupId
 * <em>Group Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.NotificationParticipantImpl#getMailAddress
 * <em>Mail Address</em>}</li>
 * <li>{@link com.softmodeler.model.impl.NotificationParticipantImpl#getObjectRef
 * <em>Object Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationParticipantImpl extends EObjectImpl implements NotificationParticipant {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMailAddress() <em>Mail Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final MailAddressType MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailAddress() <em>Mail Address</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected MailAddressType mailAddress = MAIL_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectRef() <em>Object Ref</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObjectRef()
	 * @generated
	 * @ordered
	 */
	protected ObjectRef objectRef;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NotificationParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.NOTIFICATION_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.NOTIFICATION_PARTICIPANT__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.NOTIFICATION_PARTICIPANT__GROUP_ID,
					oldGroupId, groupId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public MailAddressType getMailAddress() {
		return mailAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMailAddress(MailAddressType newMailAddress) {
		MailAddressType oldMailAddress = mailAddress;
		mailAddress = newMailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.NOTIFICATION_PARTICIPANT__MAIL_ADDRESS, oldMailAddress, mailAddress));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ObjectRef getObjectRef() {
		if (objectRef != null && objectRef.eIsProxy()) {
			InternalEObject oldObjectRef = (InternalEObject) objectRef;
			objectRef = (ObjectRef) eResolveProxy(oldObjectRef);
			if (objectRef != oldObjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF, oldObjectRef, objectRef));
			}
		}
		return objectRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectRef basicGetObjectRef() {
		return objectRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setObjectRef(ObjectRef newObjectRef) {
		ObjectRef oldObjectRef = objectRef;
		objectRef = newObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF, oldObjectRef, objectRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__ID:
			return getId();
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__GROUP_ID:
			return getGroupId();
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__MAIL_ADDRESS:
			return getMailAddress();
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF:
			if (resolve)
				return getObjectRef();
			return basicGetObjectRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__ID:
			setId((String) newValue);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__GROUP_ID:
			setGroupId((String) newValue);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__MAIL_ADDRESS:
			setMailAddress((MailAddressType) newValue);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF:
			setObjectRef((ObjectRef) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__ID:
			setId(ID_EDEFAULT);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__GROUP_ID:
			setGroupId(GROUP_ID_EDEFAULT);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__MAIL_ADDRESS:
			setMailAddress(MAIL_ADDRESS_EDEFAULT);
			return;
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF:
			setObjectRef((ObjectRef) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__GROUP_ID:
			return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__MAIL_ADDRESS:
			return MAIL_ADDRESS_EDEFAULT == null ? mailAddress != null : !MAIL_ADDRESS_EDEFAULT.equals(mailAddress);
		case SoftmodelerPackage.NOTIFICATION_PARTICIPANT__OBJECT_REF:
			return objectRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", groupId: "); //$NON-NLS-1$
		result.append(groupId);
		result.append(", mailAddress: "); //$NON-NLS-1$
		result.append(mailAddress);
		result.append(')');
		return result.toString();
	}

} // NotificationParticipantImpl
