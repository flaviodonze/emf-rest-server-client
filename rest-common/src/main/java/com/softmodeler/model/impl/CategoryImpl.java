/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.Category;
import com.softmodeler.model.SoftmodelerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Category</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.CategoryImpl#getClassifier
 * <em>Classifier</em>}</li>
 * <li>{@link com.softmodeler.model.impl.CategoryImpl#getAssociatedClassifier
 * <em>Associated Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends BasicCodeImpl implements Category {
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classifier;

	/**
	 * The default value of the '{@link #getAssociatedClassifier() <em>Associated
	 * Classifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssociatedClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedClassifier() <em>Associated
	 * Classifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAssociatedClassifier()
	 * @generated
	 * @ordered
	 */
	protected String associatedClassifier = ASSOCIATED_CLASSIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<String> getClassifier() {
		if (classifier == null) {
			classifier = new EDataTypeUniqueEList<String>(String.class, this, SoftmodelerPackage.CATEGORY__CLASSIFIER);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getAssociatedClassifier() {
		return associatedClassifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAssociatedClassifier(String newAssociatedClassifier) {
		String oldAssociatedClassifier = associatedClassifier;
		associatedClassifier = newAssociatedClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.CATEGORY__ASSOCIATED_CLASSIFIER,
					oldAssociatedClassifier, associatedClassifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.CATEGORY__CLASSIFIER:
			return getClassifier();
		case SoftmodelerPackage.CATEGORY__ASSOCIATED_CLASSIFIER:
			return getAssociatedClassifier();
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
		case SoftmodelerPackage.CATEGORY__CLASSIFIER:
			getClassifier().clear();
			getClassifier().addAll((Collection<? extends String>) newValue);
			return;
		case SoftmodelerPackage.CATEGORY__ASSOCIATED_CLASSIFIER:
			setAssociatedClassifier((String) newValue);
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
		case SoftmodelerPackage.CATEGORY__CLASSIFIER:
			getClassifier().clear();
			return;
		case SoftmodelerPackage.CATEGORY__ASSOCIATED_CLASSIFIER:
			setAssociatedClassifier(ASSOCIATED_CLASSIFIER_EDEFAULT);
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
		case SoftmodelerPackage.CATEGORY__CLASSIFIER:
			return classifier != null && !classifier.isEmpty();
		case SoftmodelerPackage.CATEGORY__ASSOCIATED_CLASSIFIER:
			return ASSOCIATED_CLASSIFIER_EDEFAULT == null ? associatedClassifier != null
					: !ASSOCIATED_CLASSIFIER_EDEFAULT.equals(associatedClassifier);
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
		result.append(" (classifier: "); //$NON-NLS-1$
		result.append(classifier);
		result.append(", associatedClassifier: "); //$NON-NLS-1$
		result.append(associatedClassifier);
		result.append(')');
		return result.toString();
	}

} // CategoryImpl
