/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.ObjectState;
import com.softmodeler.model.SoftmodelerPackage;

import com.softmodeler.model.type.LabelsType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object
 * Ref</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getDomain
 * <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getState
 * <em>State</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getLabels
 * <em>Labels</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getAppId <em>App
 * Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link com.softmodeler.model.impl.ObjectRefImpl#getNature
 * <em>Nature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectRefImpl extends EObjectImpl implements ObjectRef {
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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final int DOMAIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected int domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectState STATE_EDEFAULT = ObjectState.NEW;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ObjectState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected static final LabelsType LABELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected LabelsType labels = LABELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppId() <em>App Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppId() <em>App Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAppId()
	 * @generated
	 * @ordered
	 */
	protected String appId = APP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected String nature = NATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObjectRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.OBJECT_REF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDomain(int newDomain) {
		int oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__DOMAIN, oldDomain,
					domain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ObjectState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setState(ObjectState newState) {
		ObjectState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LabelsType getLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabels(LabelsType newLabels) {
		LabelsType oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__LABELS, oldLabels,
					labels));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getAppId() {
		return appId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAppId(String newAppId) {
		String oldAppId = appId;
		appId = newAppId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__APP_ID, oldAppId,
					appId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNature(String newNature) {
		String oldNature = nature;
		nature = newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.OBJECT_REF__NATURE, oldNature,
					nature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return getDefaultLabel();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getWorkingId() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDefaultLocale() {
		return getLabels().getDefaultLocale();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDefaultLabel() {
		return getLabels().getDefaultLabel();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.OBJECT_REF__ID:
			return getId();
		case SoftmodelerPackage.OBJECT_REF__DOMAIN:
			return getDomain();
		case SoftmodelerPackage.OBJECT_REF__STATE:
			return getState();
		case SoftmodelerPackage.OBJECT_REF__LABELS:
			return getLabels();
		case SoftmodelerPackage.OBJECT_REF__APP_ID:
			return getAppId();
		case SoftmodelerPackage.OBJECT_REF__TYPE:
			return getType();
		case SoftmodelerPackage.OBJECT_REF__NATURE:
			return getNature();
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
		case SoftmodelerPackage.OBJECT_REF__ID:
			setId((String) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__DOMAIN:
			setDomain((Integer) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__STATE:
			setState((ObjectState) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__LABELS:
			setLabels((LabelsType) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__APP_ID:
			setAppId((String) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__TYPE:
			setType((String) newValue);
			return;
		case SoftmodelerPackage.OBJECT_REF__NATURE:
			setNature((String) newValue);
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
		case SoftmodelerPackage.OBJECT_REF__ID:
			setId(ID_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__STATE:
			setState(STATE_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__LABELS:
			setLabels(LABELS_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__APP_ID:
			setAppId(APP_ID_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SoftmodelerPackage.OBJECT_REF__NATURE:
			setNature(NATURE_EDEFAULT);
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
		case SoftmodelerPackage.OBJECT_REF__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SoftmodelerPackage.OBJECT_REF__DOMAIN:
			return domain != DOMAIN_EDEFAULT;
		case SoftmodelerPackage.OBJECT_REF__STATE:
			return state != STATE_EDEFAULT;
		case SoftmodelerPackage.OBJECT_REF__LABELS:
			return LABELS_EDEFAULT == null ? labels != null : !LABELS_EDEFAULT.equals(labels);
		case SoftmodelerPackage.OBJECT_REF__APP_ID:
			return APP_ID_EDEFAULT == null ? appId != null : !APP_ID_EDEFAULT.equals(appId);
		case SoftmodelerPackage.OBJECT_REF__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case SoftmodelerPackage.OBJECT_REF__NATURE:
			return NATURE_EDEFAULT == null ? nature != null : !NATURE_EDEFAULT.equals(nature);
		}
		return super.eIsSet(featureID);
	}

} // ObjectRefImpl
