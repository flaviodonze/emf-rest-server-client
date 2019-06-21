/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import com.softmodeler.model.type.LabelsType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Basic
 * Code</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.BasicCode#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getParent <em>Parent</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getNames <em>Names</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getDescriptions
 * <em>Descriptions</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getEntries <em>Entries</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getSortHint <em>Sort
 * Hint</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#getDomain <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#isActive <em>Active</em>}</li>
 * <li>{@link com.softmodeler.model.BasicCode#isStructure
 * <em>Structure</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode()
 * @model abstract="true"
 * @generated
 */
public interface BasicCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Id()
	 * @model id="true"
	 *        annotation="http:///www.softmodeler.com/model/annotation/Validate
	 *        validator='required'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(BasicCode)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Parent()
	 * @model
	 * @generated
	 */
	BasicCode getParent();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getParent
	 * <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BasicCode value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Names</em>' attribute.
	 * @see #setNames(LabelsType)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Names()
	 * @model dataType="com.softmodeler.model.LabelsType"
	 *        annotation="http:///www.softmodeler.com/model/annotation/Validate
	 *        validator='required'" annotation="teneo.jpa
	 *        value='@Column(length=2000)\r\n'"
	 * @generated
	 */
	LabelsType getNames();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getNames
	 * <em>Names</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Names</em>' attribute.
	 * @see #getNames()
	 * @generated
	 */
	void setNames(LabelsType value);

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Descriptions</em>' attribute.
	 * @see #setDescriptions(LabelsType)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Descriptions()
	 * @model dataType="com.softmodeler.model.LabelsType" annotation="teneo.jpa
	 *        value='@Column(length=2000)\r\n'"
	 * @generated
	 */
	LabelsType getDescriptions();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getDescriptions
	 * <em>Descriptions</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Descriptions</em>' attribute.
	 * @see #getDescriptions()
	 * @generated
	 */
	void setDescriptions(LabelsType value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference
	 * list. The list contents are of type {@link com.softmodeler.model.CodeEntry}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Sort Hint</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sort Hint</em>' attribute.
	 * @see #setSortHint(int)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_SortHint()
	 * @model
	 * @generated
	 */
	int getSortHint();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getSortHint
	 * <em>Sort Hint</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Sort Hint</em>' attribute.
	 * @see #getSortHint()
	 * @generated
	 */
	void setSortHint(int value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute. The default
	 * value is <code>"-1"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(int)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Domain()
	 * @model default="-1"
	 * @generated
	 */
	int getDomain();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#getDomain
	 * <em>Domain</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(int value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute. The default
	 * value is <code>"true"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Active()
	 * @model default="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#isActive
	 * <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see #setStructure(boolean)
	 * @see com.softmodeler.model.SoftmodelerPackage#getBasicCode_Structure()
	 * @model default="false"
	 * @generated
	 */
	boolean isStructure();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.BasicCode#isStructure
	 * <em>Structure</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see #isStructure()
	 * @generated
	 */
	void setStructure(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSegments();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getLastSegment();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getPureLastSegment();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getFirstSegment();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void setParentPath(BasicCode parent);

} // BasicCode
