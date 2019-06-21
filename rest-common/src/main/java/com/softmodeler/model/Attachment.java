/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import com.softmodeler.model.type.ResourceType;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Attachment</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.Attachment#getKey <em>Key</em>}</li>
 * <li>{@link com.softmodeler.model.Attachment#getObjectId <em>Object
 * Id</em>}</li>
 * <li>{@link com.softmodeler.model.Attachment#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getAttachment()
 * @model annotation="http:///www.softmodeler.com/model/annotation/REF
 *        enabled='false'"
 *        annotation="http:///www.softmodeler.com/model/annotation/NLS
 *        enabled='false'"
 * @generated
 */
public interface Attachment extends BasicObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getAttachment_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.Attachment#getKey
	 * <em>Key</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getAttachment_ObjectId()
	 * @model
	 * @generated
	 */
	String getObjectId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.Attachment#getObjectId
	 * <em>Object Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(ResourceType)
	 * @see com.softmodeler.model.SoftmodelerPackage#getAttachment_Data()
	 * @model dataType="com.softmodeler.model.ResourceType"
	 * @generated
	 */
	ResourceType getData();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.Attachment#getData
	 * <em>Data</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(ResourceType value);

} // Attachment
