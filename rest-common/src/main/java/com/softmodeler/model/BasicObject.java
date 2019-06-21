/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Basic
 * Object</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.BasicObject#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.BasicObject#getDomain <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.BasicObject#getLocale <em>Locale</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getBasicObject()
 * @model abstract="true"
 * @generated
 */
public interface BasicObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicObject_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicObject#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(int)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicObject_Domain()
	 * @model
	 * @generated
	 */
	int getDomain();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicObject#getDomain
	 * <em>Domain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(int value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicObject_Locale()
	 * @model annotation="http:///www.softmodeler.com/model/annotation/Validate
	 *        validator='required'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicObject#getLocale
	 * <em>Locale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        getId() + \" \" + getLocale();'"
	 * @generated
	 */
	@Override
	String toString();

} // BasicObject
