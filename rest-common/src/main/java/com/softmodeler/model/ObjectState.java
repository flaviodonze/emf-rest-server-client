/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Object State</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see com.softmodeler.model.SoftmodelerPackage#getObjectState()
 * @model
 * @generated
 */
public enum ObjectState implements Enumerator {
	/**
	 * The '<em><b>NEW</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #NEW_VALUE
	 * @generated
	 * @ordered
	 */
	NEW(0, "NEW", "_NEW"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PRODUCTION</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PRODUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCTION(1, "PRODUCTION", "_PROD"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>MODIFICATION</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MODIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFICATION(2, "MODIFICATION", "_MOD"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DELETION</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DELETION_VALUE
	 * @generated
	 * @ordered
	 */
	DELETION(3, "DELETION", "_DEL"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NEW</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #NEW
	 * @model literal="_NEW"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_VALUE = 0;

	/**
	 * The '<em><b>PRODUCTION</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #PRODUCTION
	 * @model literal="_PROD"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCTION_VALUE = 1;

	/**
	 * The '<em><b>MODIFICATION</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #MODIFICATION
	 * @model literal="_MOD"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFICATION_VALUE = 2;

	/**
	 * The '<em><b>DELETION</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #DELETION
	 * @model literal="_DEL"
	 * @generated
	 * @ordered
	 */
	public static final int DELETION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Object State</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ObjectState[] VALUES_ARRAY = new ObjectState[] { NEW, PRODUCTION, MODIFICATION, DELETION, };

	/**
	 * A public read-only list of all the '<em><b>Object State</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ObjectState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object State</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object State</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectState get(int value) {
		switch (value) {
		case NEW_VALUE:
			return NEW;
		case PRODUCTION_VALUE:
			return PRODUCTION;
		case MODIFICATION_VALUE:
			return MODIFICATION;
		case DELETION_VALUE:
			return DELETION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private ObjectState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // ObjectState
