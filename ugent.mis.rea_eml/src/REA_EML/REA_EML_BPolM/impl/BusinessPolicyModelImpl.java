/**
 */
package REA_EML.REA_EML_BPolM.impl;

import REA_EML.REA_EML_BPolM.BusinessEntity;
import REA_EML.REA_EML_BPolM.BusinessPolicyModel;
import REA_EML.REA_EML_BPolM.BusinessRelationship;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage;

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
 * An implementation of the model object '<em><b>Business Policy Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl#getBusinessRelationships <em>Business Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessPolicyModelImpl extends ModelImpl implements BusinessPolicyModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessPolicyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPolMPackage.Literals.BUSINESS_POLICY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEntity> getBusinessEntities() {
		if (businessEntities == null) {
			businessEntities = new EObjectContainmentEList<BusinessEntity>(BusinessEntity.class, this, REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES);
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
			businessRelationships = new EObjectContainmentEList<BusinessRelationship>(BusinessRelationship.class, this, REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS);
		}
		return businessRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES:
				return ((InternalEList<?>)getBusinessEntities()).basicRemove(otherEnd, msgs);
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS:
				return ((InternalEList<?>)getBusinessRelationships()).basicRemove(otherEnd, msgs);
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
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES:
				return getBusinessEntities();
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS:
				return getBusinessRelationships();
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
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				getBusinessEntities().addAll((Collection<? extends BusinessEntity>)newValue);
				return;
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS:
				getBusinessRelationships().clear();
				getBusinessRelationships().addAll((Collection<? extends BusinessRelationship>)newValue);
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
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				return;
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS:
				getBusinessRelationships().clear();
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
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES:
				return businessEntities != null && !businessEntities.isEmpty();
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS:
				return businessRelationships != null && !businessRelationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessPolicyModelImpl
