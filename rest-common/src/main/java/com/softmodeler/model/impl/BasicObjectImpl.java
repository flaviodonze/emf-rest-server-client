/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.BasicObject;
import com.softmodeler.model.SoftmodelerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic
 * Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.BasicObjectImpl#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicObjectImpl#getDomain
 * <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicObjectImpl#getLocale
 * <em>Locale</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasicObjectImpl extends EObjectImpl implements BasicObject {
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
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BasicObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.BASIC_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_OBJECT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_OBJECT__DOMAIN, oldDomain,
					domain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_OBJECT__LOCALE, oldLocale,
					locale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return getId() + " " + getLocale();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_OBJECT__ID:
			return getId();
		case SoftmodelerPackage.BASIC_OBJECT__DOMAIN:
			return getDomain();
		case SoftmodelerPackage.BASIC_OBJECT__LOCALE:
			return getLocale();
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
		case SoftmodelerPackage.BASIC_OBJECT__ID:
			setId((String) newValue);
			return;
		case SoftmodelerPackage.BASIC_OBJECT__DOMAIN:
			setDomain((Integer) newValue);
			return;
		case SoftmodelerPackage.BASIC_OBJECT__LOCALE:
			setLocale((String) newValue);
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
		case SoftmodelerPackage.BASIC_OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_OBJECT__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_OBJECT__LOCALE:
			setLocale(LOCALE_EDEFAULT);
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
		case SoftmodelerPackage.BASIC_OBJECT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SoftmodelerPackage.BASIC_OBJECT__DOMAIN:
			return domain != DOMAIN_EDEFAULT;
		case SoftmodelerPackage.BASIC_OBJECT__LOCALE:
			return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
		}
		return super.eIsSet(featureID);
	}

} // BasicObjectImpl
