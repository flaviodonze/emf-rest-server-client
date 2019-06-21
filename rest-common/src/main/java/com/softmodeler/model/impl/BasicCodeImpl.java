/**
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 */
package com.softmodeler.model.impl;

import com.softmodeler.model.BasicCode;
import com.softmodeler.model.CodeEntry;
import com.softmodeler.model.SoftmodelerPackage;

import com.softmodeler.model.type.LabelsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Basic
 * Code</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getId <em>Id</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getParent
 * <em>Parent</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getNames
 * <em>Names</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getDescriptions
 * <em>Descriptions</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getEntries
 * <em>Entries</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getSortHint <em>Sort
 * Hint</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#getDomain
 * <em>Domain</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#isActive
 * <em>Active</em>}</li>
 * <li>{@link com.softmodeler.model.impl.BasicCodeImpl#isStructure
 * <em>Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasicCodeImpl extends EObjectImpl implements BasicCode {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected BasicCode parent;

	/**
	 * The default value of the '{@link #getNames() <em>Names</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected static final LabelsType NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected LabelsType names = NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescriptions() <em>Descriptions</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected static final LabelsType DESCRIPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected LabelsType descriptions = DESCRIPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeEntry> entries;

	/**
	 * The default value of the '{@link #getSortHint() <em>Sort Hint</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSortHint()
	 * @generated
	 * @ordered
	 */
	protected static final int SORT_HINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortHint() <em>Sort Hint</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSortHint()
	 * @generated
	 * @ordered
	 */
	protected int sortHint = SORT_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final int DOMAIN_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected int domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStructure() <em>Structure</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isStructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRUCTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStructure() <em>Structure</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isStructure()
	 * @generated
	 * @ordered
	 */
	protected boolean structure = STRUCTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BasicCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftmodelerPackage.Literals.BASIC_CODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BasicCode getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (BasicCode) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftmodelerPackage.BASIC_CODE__PARENT,
							oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BasicCode basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setParent(BasicCode newParent) {
		BasicCode oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__PARENT, oldParent,
					parent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LabelsType getNames() {
		return names;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNames(LabelsType newNames) {
		LabelsType oldNames = names;
		names = newNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__NAMES, oldNames,
					names));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LabelsType getDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDescriptions(LabelsType newDescriptions) {
		LabelsType oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__DESCRIPTIONS,
					oldDescriptions, descriptions));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<CodeEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<CodeEntry>(CodeEntry.class, this,
					SoftmodelerPackage.BASIC_CODE__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getSortHint() {
		return sortHint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSortHint(int newSortHint) {
		int oldSortHint = sortHint;
		sortHint = newSortHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__SORT_HINT, oldSortHint,
					sortHint));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDomain(int newDomain) {
		int oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__DOMAIN, oldDomain,
					domain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__ACTIVE, oldActive,
					active));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStructure(boolean newStructure) {
		boolean oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftmodelerPackage.BASIC_CODE__STRUCTURE,
					oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<String> getSegments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLastSegment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPureLastSegment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFirstSegment() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setParentPath(BasicCode parent) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_CODE__ENTRIES:
			return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SoftmodelerPackage.BASIC_CODE__ID:
			return getId();
		case SoftmodelerPackage.BASIC_CODE__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case SoftmodelerPackage.BASIC_CODE__NAMES:
			return getNames();
		case SoftmodelerPackage.BASIC_CODE__DESCRIPTIONS:
			return getDescriptions();
		case SoftmodelerPackage.BASIC_CODE__ENTRIES:
			return getEntries();
		case SoftmodelerPackage.BASIC_CODE__SORT_HINT:
			return getSortHint();
		case SoftmodelerPackage.BASIC_CODE__DOMAIN:
			return getDomain();
		case SoftmodelerPackage.BASIC_CODE__ACTIVE:
			return isActive();
		case SoftmodelerPackage.BASIC_CODE__STRUCTURE:
			return isStructure();
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
		case SoftmodelerPackage.BASIC_CODE__ID:
			setId((String) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__PARENT:
			setParent((BasicCode) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__NAMES:
			setNames((LabelsType) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__DESCRIPTIONS:
			setDescriptions((LabelsType) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__ENTRIES:
			getEntries().clear();
			getEntries().addAll((Collection<? extends CodeEntry>) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__SORT_HINT:
			setSortHint((Integer) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__DOMAIN:
			setDomain((Integer) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__ACTIVE:
			setActive((Boolean) newValue);
			return;
		case SoftmodelerPackage.BASIC_CODE__STRUCTURE:
			setStructure((Boolean) newValue);
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
		case SoftmodelerPackage.BASIC_CODE__ID:
			setId(ID_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__PARENT:
			setParent((BasicCode) null);
			return;
		case SoftmodelerPackage.BASIC_CODE__NAMES:
			setNames(NAMES_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__DESCRIPTIONS:
			setDescriptions(DESCRIPTIONS_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__ENTRIES:
			getEntries().clear();
			return;
		case SoftmodelerPackage.BASIC_CODE__SORT_HINT:
			setSortHint(SORT_HINT_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__DOMAIN:
			setDomain(DOMAIN_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case SoftmodelerPackage.BASIC_CODE__STRUCTURE:
			setStructure(STRUCTURE_EDEFAULT);
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
		case SoftmodelerPackage.BASIC_CODE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SoftmodelerPackage.BASIC_CODE__PARENT:
			return parent != null;
		case SoftmodelerPackage.BASIC_CODE__NAMES:
			return NAMES_EDEFAULT == null ? names != null : !NAMES_EDEFAULT.equals(names);
		case SoftmodelerPackage.BASIC_CODE__DESCRIPTIONS:
			return DESCRIPTIONS_EDEFAULT == null ? descriptions != null : !DESCRIPTIONS_EDEFAULT.equals(descriptions);
		case SoftmodelerPackage.BASIC_CODE__ENTRIES:
			return entries != null && !entries.isEmpty();
		case SoftmodelerPackage.BASIC_CODE__SORT_HINT:
			return sortHint != SORT_HINT_EDEFAULT;
		case SoftmodelerPackage.BASIC_CODE__DOMAIN:
			return domain != DOMAIN_EDEFAULT;
		case SoftmodelerPackage.BASIC_CODE__ACTIVE:
			return active != ACTIVE_EDEFAULT;
		case SoftmodelerPackage.BASIC_CODE__STRUCTURE:
			return structure != STRUCTURE_EDEFAULT;
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", names: "); //$NON-NLS-1$
		result.append(names);
		result.append(", descriptions: "); //$NON-NLS-1$
		result.append(descriptions);
		result.append(", sortHint: "); //$NON-NLS-1$
		result.append(sortHint);
		result.append(", domain: "); //$NON-NLS-1$
		result.append(domain);
		result.append(", active: "); //$NON-NLS-1$
		result.append(active);
		result.append(", structure: "); //$NON-NLS-1$
		result.append(structure);
		result.append(')');
		return result.toString();
	}

} // BasicCodeImpl
