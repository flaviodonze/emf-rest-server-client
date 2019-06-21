/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tree
 * Node Child</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.TreeNodeChild#getNodeId <em>Node
 * Id</em>}</li>
 * <li>{@link com.softmodeler.model.TreeNodeChild#getParent
 * <em>Parent</em>}</li>
 * </ul>
 *
 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNodeChild()
 * @model
 * @generated
 */
public interface TreeNodeChild extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNodeChild_NodeId()
	 * @model id="true"
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.TreeNodeChild#getNodeId
	 * <em>Node Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference. It is
	 * bidirectional and its opposite is
	 * '{@link com.softmodeler.model.TreeNode#getChilds <em>Childs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TreeNode)
	 * @see com.softmodeler.model.SoftmodelerPackage#getTreeNodeChild_Parent()
	 * @see com.softmodeler.model.TreeNode#getChilds
	 * @model opposite="childs" transient="false" annotation="teneo.jpa
	 *        appinfo='@ManyToOne(cascade={MERGE,PERSIST,REFRESH})'"
	 * @generated
	 */
	TreeNode getParent();

	/**
	 * Sets the value of the '{@link com.softmodeler.model.TreeNodeChild#getParent
	 * <em>Parent</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TreeNode value);

} // TreeNodeChild
