/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import com.softmodeler.model.type.LabelsType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object
 * Ref</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.ObjectRef#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getDomain <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getState <em>State</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getLabels <em>Labels</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getAppId <em>App Id</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getType <em>Type</em>}</li>
 * <li>{@link com.softmodeler.model.ObjectRef#getNature <em>Nature</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef()
 * @model
 * @generated
 */
public interface ObjectRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getId
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
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_Domain()
	 * @model
	 * @generated
	 */
	int getDomain();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getDomain
	 * <em>Domain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute. The literals are
	 * from the enumeration {@link com.softmodeler.model.ObjectState}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' attribute.
	 * @see com.softmodeler.model.ObjectState
	 * @see #setState(ObjectState)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_State()
	 * @model
	 * @generated
	 */
	ObjectState getState();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getState
	 * <em>State</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see com.softmodeler.model.ObjectState
	 * @see #getState()
	 * @generated
	 */
	void setState(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(LabelsType)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_Labels()
	 * @model dataType="com.softmodeler.model.LabelsType" annotation="teneo.jpa
	 *        value='@Column(length=2000)\r\n'"
	 * @generated
	 */
	LabelsType getLabels();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getLabels
	 * <em>Labels</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(LabelsType value);

	/**
	 * Returns the value of the '<em><b>App Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>App Id</em>' attribute.
	 * @see #setAppId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_AppId()
	 * @model annotation="teneo.jpa value='@Column(length=10)\r\n'"
	 * @generated
	 */
	String getAppId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getAppId
	 * <em>App Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>App Id</em>' attribute.
	 * @see #getAppId()
	 * @generated
	 */
	void setAppId(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see #setNature(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getObjectRef_Nature()
	 * @model annotation="teneo.jpa value='@Column(length=25)\r\n'"
	 * @generated
	 */
	String getNature();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.ObjectRef#getNature
	 * <em>Nature</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see #getNature()
	 * @generated
	 */
	void setNature(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        getDefaultLabel();'"
	 * @generated
	 */
	@Override
	String toString();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getWorkingId();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation="http://www.eclipse.org/emf/2002/GenModel
	 *        body='return getLabels().getDefaultLocale();'"
	 * @generated
	 */
	String getDefaultLocale();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" annotation="http://www.eclipse.org/emf/2002/GenModel
	 *        body='return getLabels().getDefaultLabel();'"
	 * @generated
	 */
	String getDefaultLabel();

} // ObjectRef
