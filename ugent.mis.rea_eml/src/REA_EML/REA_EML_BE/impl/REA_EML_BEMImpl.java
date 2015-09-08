/**
 */
package REA_EML.REA_EML_BE.impl;

import REA_EML.REA_EML_BE.BusinessEntity;
import REA_EML.REA_EML_BE.BusinessRelationship;
import REA_EML.REA_EML_BE.REA_EML_BEM;
import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BP.BusinessEvent;

import REA_EML.impl.ModelImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl#getBusinessRelationships <em>Business Relationships</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl#getBusinessEvents <em>Business Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REA_EML_BEMImpl extends ModelImpl implements REA_EML_BEM {
	/**
	 * The cached value of the '{@link #getBusinessEntities() <em>Business Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEntity> businessEntities;

	/**
	 * The cached value of the '{@link #getBusinessRelationships() <em>Business Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRelationship> businessRelationships;

	/**
	 * The cached value of the '{@link #getBusinessEvents() <em>Business Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEvent> businessEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REA_EML_BEMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BEPackage.Literals.REA_EML_BE_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEntity> getBusinessEntities() {
		if (businessEntities == null) {
			businessEntities = new EObjectContainmentEList<BusinessEntity>(BusinessEntity.class, this, REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES);
		}
		return businessEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRelationship> getBusinessRelationships() {
		if (businessRelationships == null) {
			businessRelationships = new EObjectContainmentEList<BusinessRelationship>(BusinessRelationship.class, this, REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS);
		}
		return businessRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEvent> getBusinessEvents() {
		if (businessEvents == null) {
			businessEvents = new EObjectContainmentEList<BusinessEvent>(BusinessEvent.class, this, REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS);
		}
		return businessEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
				return ((InternalEList<?>)getBusinessEntities()).basicRemove(otherEnd, msgs);
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
				return ((InternalEList<?>)getBusinessRelationships()).basicRemove(otherEnd, msgs);
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
				return ((InternalEList<?>)getBusinessEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
				return getBusinessEntities();
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
				return getBusinessRelationships();
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
				return getBusinessEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				getBusinessEntities().addAll((Collection<? extends BusinessEntity>)newValue);
				return;
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
				getBusinessRelationships().clear();
				getBusinessRelationships().addAll((Collection<? extends BusinessRelationship>)newValue);
				return;
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
				getBusinessEvents().clear();
				getBusinessEvents().addAll((Collection<? extends BusinessEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				return;
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
				getBusinessRelationships().clear();
				return;
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
				getBusinessEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
				return businessEntities != null && !businessEntities.isEmpty();
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
				return businessRelationships != null && !businessRelationships.isEmpty();
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
				return businessEvents != null && !businessEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //REA_EML_BEMImpl
