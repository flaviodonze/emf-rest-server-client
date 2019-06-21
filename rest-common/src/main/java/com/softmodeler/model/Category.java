/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Category</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.Category#getClassifier
 * <em>Classifier</em>}</li>
 * <li>{@link com.softmodeler.model.Category#getAssociatedClassifier
 * <em>Associated Classifier</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getCategory()
 * @model annotation="http:///www.softmodeler.com/model/annotation/REF
 *        enabled='false'"
 * @generated
 */
public interface Category extends BasicCode {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' attribute list. The
	 * list contents are of type {@link java.lang.String}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classifier</em>' attribute list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getCategory_Classifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getClassifier();

	/**
	 * Returns the value of the '<em><b>Associated Classifier</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Associated Classifier</em>' attribute.
	 * @see #setAssociatedClassifier(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getCategory_AssociatedClassifier()
	 * @model transient="true"
	 * @generated
	 */
	String getAssociatedClassifier();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.Category#getAssociatedClassifier <em>Associated
	 * Classifier</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Associated Classifier</em>' attribute.
	 * @see #getAssociatedClassifier()
	 * @generated
	 */
	void setAssociatedClassifier(String value);

} // Category
