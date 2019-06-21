/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tree
 * Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.TreeNode#getName <em>Name</em>}</li>
 * <li>{@link com.softmodeler.model.TreeNode#getChilds <em>Childs</em>}</li>
 * <li>{@link com.softmodeler.model.TreeNode#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNode()
 * @model annotation="http:///www.softmodeler.com/model/annotation/REF
 *        enabled='false'"
 * @generated
 */
public interface TreeNode extends BasicObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNode_Name()
	 * @model annotation="http:///www.softmodeler.com/model/annotation/NLS
	 *        enabled='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.TreeNode#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link com.softmodeler.model.TreeNodeChild}. It
	 * is bidirectional and its opposite is
	 * '{@link com.softmodeler.model.TreeNodeChild#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNode_Childs()
	 * @see com.softmodeler.model.TreeNodeChild#getParent
	 * @model opposite="parent" containment="true" keys="nodeId"
	 *        annotation="teneo.jpa
	 *        appinfo='@OneToMany(cascade={MERGE,PERSIST,REFRESH} fetch=EAGER)'"
	 * @generated
	 */
	EList<TreeNodeChild> getChilds();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectRef)
	 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNode_Object()
	 * @model
	 * @generated
	 */
	ObjectRef getObject();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.TreeNode#getObject
	 * <em>Object</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectRef value);

} // TreeNode
