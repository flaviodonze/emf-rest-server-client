/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.SoftmodelerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Notification Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.NotificationDefinitionImpl#getIncludeFilter
 * <em>Include Filter</em>}</li>
 * <li>{@link com.softmodeler.model.impl.NotificationDefinitionImpl#getExcludeFilter
 * <em>Exclude Filter</em>}</li>
 * <li>{@link com.softmodeler.model.impl.NotificationDefinitionImpl#isTemplate
 * <em>Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationDefinitionImpl extends BasicNotificationDefinitionImpl implements NotificationDefinition {
	/**
	 * The default value of the '{@link #getIncludeFilter() <em>Include
	 * Filter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludeFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeFilter() <em>Include Filter</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncludeFilter()
	 * @generated
	 * @ordered
	 */
	protected String includeFilter = INCLUDE_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeFilter() <em>Exclude
	 * Filter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExcludeFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeFilter() <em>Exclude Filter</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExcludeFilter()
	 * @generated
	 * @ordered
	 */
	protected String excludeFilter = EXCLUDE_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemplate() <em>Template</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected boolean template = TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected NotificationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.NOTIFICATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getIncludeFilter() {
		return includeFilter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIncludeFilter(String newIncludeFilter) {
		String oldIncludeFilter = includeFilter;
		includeFilter = newIncludeFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.NOTIFICATION_DEFINITION__INCLUDE_FILTER, oldIncludeFilter, includeFilter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getExcludeFilter() {
		return excludeFilter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExcludeFilter(String newExcludeFilter) {
		String oldExcludeFilter = excludeFilter;
		excludeFilter = newExcludeFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SoftmodelerPackage.NOTIFICATION_DEFINITION__EXCLUDE_FILTER, oldExcludeFilter, excludeFilter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTemplate(boolean newTemplate) {
		boolean oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.NOTIFICATION_DEFINITION__TEMPLATE,
					oldTemplate, template));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__INCLUDE_FILTER:
			return getIncludeFilter();
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__EXCLUDE_FILTER:
			return getExcludeFilter();
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__TEMPLATE:
			return isTemplate();
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
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__INCLUDE_FILTER:
			setIncludeFilter((String) newValue);
			return;
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__EXCLUDE_FILTER:
			setExcludeFilter((String) newValue);
			return;
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__TEMPLATE:
			setTemplate((Boolean) newValue);
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
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__INCLUDE_FILTER:
			setIncludeFilter(INCLUDE_FILTER_EDEFAULT);
			return;
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__EXCLUDE_FILTER:
			setExcludeFilter(EXCLUDE_FILTER_EDEFAULT);
			return;
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__TEMPLATE:
			setTemplate(TEMPLATE_EDEFAULT);
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
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__INCLUDE_FILTER:
			return INCLUDE_FILTER_EDEFAULT == null ? includeFilter != null
					: !INCLUDE_FILTER_EDEFAULT.equals(includeFilter);
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__EXCLUDE_FILTER:
			return EXCLUDE_FILTER_EDEFAULT == null ? excludeFilter != null
					: !EXCLUDE_FILTER_EDEFAULT.equals(excludeFilter);
		case SoftmodelerPackage.NOTIFICATION_DEFINITION__TEMPLATE:
			return template != TEMPLATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // NotificationDefinitionImpl
