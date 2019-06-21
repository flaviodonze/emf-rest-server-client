/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.BasicNotificationDefinition;
import com.softmodeler.model.Code;
import com.softmodeler.model.NotificationParticipant;
import com.softmodeler.model.SoftmodelerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic
 * Notification Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getNotificationEventId
 * <em>Notification Event Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#isActive
 * <em>Active</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getSender
 * <em>Sender</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getReceivers
 * <em>Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getCcReceivers
 * <em>Cc Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getBccReceivers
 * <em>Bcc Receivers</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getDelivery
 * <em>Delivery</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicNotificationDefinitionImpl#getIdentifier
 * <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasicNotificationDefinitionImpl extends BasicObjectImpl implements BasicNotificationDefinition {
	/**
	 * The default value of the '{@link #getNotificationEventId() <em>Notification
	 * Event Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNotificationEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationEventId() <em>Notification
	 * Event Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNotificationEventId()
	 * @generated
	 * @ordered
	 */
	protected String notificationEventId = NOTIFICATION_EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected NotificationParticipant sender;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationParticipant> receivers;

	/**
	 * The cached value of the '{@link #getCcReceivers() <em>Cc Receivers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCcReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationParticipant> ccReceivers;

	/**
	 * The cached value of the '{@link #getBccReceivers() <em>Bcc Receivers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBccReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<NotificationParticipant> bccReceivers;

	/**
	 * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDelivery()
	 * @generated
	 * @ordered
	 */
	protected Code delivery;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BasicNotificationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.BASIC_NOTIFICATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getNotificationEventId() {
		return notificationEventId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNotificationEventId(String newNotificationEventId) {
		String oldNotificationEventId = notificationEventId;
		notificationEventId = newNotificationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID, oldNotificationEventId,
					notificationEventId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationParticipant getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSender(NotificationParticipant newSender, NotificationChain msgs) {
		NotificationParticipant oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER, oldSender, newSender);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSender(NotificationParticipant newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject) sender).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject) newSender).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<NotificationParticipant> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<NotificationParticipant>(NotificationParticipant.class, this,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<NotificationParticipant> getCcReceivers() {
		if (ccReceivers == null) {
			ccReceivers = new EObjectContainmentEList<NotificationParticipant>(NotificationParticipant.class, this,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS);
		}
		return ccReceivers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<NotificationParticipant> getBccReceivers() {
		if (bccReceivers == null) {
			bccReceivers = new EObjectContainmentEList<NotificationParticipant>(NotificationParticipant.class, this,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS);
		}
		return bccReceivers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Code getDelivery() {
		if (delivery != null && delivery.eIsProxy()) {
			InternalEObject oldDelivery = (InternalEObject) delivery;
			delivery = (Code) eResolveProxy(oldDelivery);
			if (delivery != oldDelivery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY, oldDelivery, delivery));
			}
		}
		return delivery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Code basicGetDelivery() {
		return delivery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDelivery(Code newDelivery) {
		Code oldDelivery = delivery;
		delivery = newDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY, oldDelivery, delivery));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return getDescription();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER:
			return basicSetSender(null, msgs);
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS:
			return ((InternalEList<?>) getReceivers()).basicRemove(otherEnd, msgs);
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS:
			return ((InternalEList<?>) getCcReceivers()).basicRemove(otherEnd, msgs);
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS:
			return ((InternalEList<?>) getBccReceivers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID:
			return getNotificationEventId();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__ACTIVE:
			return isActive();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DESCRIPTION:
			return getDescription();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER:
			return getSender();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS:
			return getReceivers();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS:
			return getCcReceivers();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS:
			return getBccReceivers();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY:
			if (resolve)
				return getDelivery();
			return basicGetDelivery();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__IDENTIFIER:
			return getIdentifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID:
			setNotificationEventId((String) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER:
			setSender((NotificationParticipant) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS:
			getReceivers().clear();
			getReceivers().addAll((Collection<? extends NotificationParticipant>) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS:
			getCcReceivers().clear();
			getCcReceivers().addAll((Collection<? extends NotificationParticipant>) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS:
			getBccReceivers().clear();
			getBccReceivers().addAll((Collection<? extends NotificationParticipant>) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY:
			setDelivery((Code) newValue);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__IDENTIFIER:
			setIdentifier((String) newValue);
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
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID:
			setNotificationEventId(NOTIFICATION_EVENT_ID_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER:
			setSender((NotificationParticipant) null);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS:
			getReceivers().clear();
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS:
			getCcReceivers().clear();
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS:
			getBccReceivers().clear();
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY:
			setDelivery((Code) null);
			return;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
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
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__NOTIFICATION_EVENT_ID:
			return NOTIFICATION_EVENT_ID_EDEFAULT == null ? notificationEventId != null
					: !NOTIFICATION_EVENT_ID_EDEFAULT.equals(notificationEventId);
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__SENDER:
			return sender != null;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__RECEIVERS:
			return receivers != null && !receivers.isEmpty();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__CC_RECEIVERS:
			return ccReceivers != null && !ccReceivers.isEmpty();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__BCC_RECEIVERS:
			return bccReceivers != null && !bccReceivers.isEmpty();
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__DELIVERY:
			return delivery != null;
		case SoftmodelerPackage.BASIC_NOTIFICATION_DEFINITION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		}
		return super.eIsSet(featureID);
	}

} // BasicNotificationDefinitionImpl
