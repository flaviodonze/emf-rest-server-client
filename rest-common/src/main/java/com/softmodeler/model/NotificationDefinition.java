/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Notification Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.NotificationDefinition#getIncludeFilter
 * <em>Include Filter</em>}</li>
 * <li>{@link com.softmodeler.model.NotificationDefinition#getExcludeFilter
 * <em>Exclude Filter</em>}</li>
 * <li>{@link com.softmodeler.model.NotificationDefinition#isTemplate
 * <em>Template</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationDefinition()
 * @model annotation="http:///www.softmodeler.com/model/annotation/NLS
 *        enabled='false'"
 *        annotation="http:///www.softmodeler.com/model/annotation/REF
 *        enabled='false'"
 * @generated
 */
public interface NotificationDefinition extends BasicNotificationDefinition {
	/**
	 * Returns the value of the '<em><b>Include Filter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Include Filter</em>' attribute.
	 * @see #setIncludeFilter(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationDefinition_IncludeFilter()
	 * @model annotation="teneo.jpa value='@Column(length=2000)'"
	 * @generated
	 */
	String getIncludeFilter();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationDefinition#getIncludeFilter
	 * <em>Include Filter</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Include Filter</em>' attribute.
	 * @see #getIncludeFilter()
	 * @generated
	 */
	void setIncludeFilter(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Filter</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Exclude Filter</em>' attribute.
	 * @see #setExcludeFilter(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationDefinition_ExcludeFilter()
	 * @model annotation="teneo.jpa value='@Column(length=2000)'"
	 * @generated
	 */
	String getExcludeFilter();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationDefinition#getExcludeFilter
	 * <em>Exclude Filter</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Exclude Filter</em>' attribute.
	 * @see #getExcludeFilter()
	 * @generated
	 */
	void setExcludeFilter(String value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template</em>' attribute.
	 * @see #setTemplate(boolean)
	 * @see com.softmodeler.model.SoftmodelerPackage#getNotificationDefinition_Template()
	 * @model default="false"
	 * @generated
	 */
	boolean isTemplate();

	/**
	 * Sets the value of the
	 * '{@link com.softmodeler.model.NotificationDefinition#isTemplate
	 * <em>Template</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Template</em>' attribute.
	 * @see #isTemplate()
	 * @generated
	 */
	void setTemplate(boolean value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        super.toString();'"
	 * @generated
	 */
	@Override
	String toString();

} // NotificationDefinition
