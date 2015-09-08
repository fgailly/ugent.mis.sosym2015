/**
 */
package REA_EML.REA_EML_BE.impl;

import REA_EML.REA_EML_BE.BusinessEntity;
import REA_EML.REA_EML_BE.PolicyEntity;
import REA_EML.REA_EML_BE.PolicyRelationship;
import REA_EML.REA_EML_BE.PolicyRelationshipType;
import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl#getPolicyRelationshipType <em>Policy Relationship Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl#getPolicyEntity <em>Policy Entity</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyRelationshipImpl extends BusinessRelationshipImpl implements PolicyRelationship {
	/**
	 * The default value of the '{@link #getPolicyRelationshipType() <em>Policy Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final PolicyRelationshipType POLICY_RELATIONSHIP_TYPE_EDEFAULT = PolicyRelationshipType.TYPIFICATION;

	/**
	 * The cached value of the '{@link #getPolicyRelationshipType() <em>Policy Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected PolicyRelationshipType policyRelationshipType = POLICY_RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicyEntity() <em>Policy Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyEntity()
	 * @generated
	 * @ordered
	 */
	protected PolicyEntity policyEntity;

	/**
	 * The cached value of the '{@link #getBusinessEntity() <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntity()
	 * @generated
	 * @ordered
	 */
	protected BusinessEntity businessEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BEPackage.Literals.POLICY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyRelationshipType getPolicyRelationshipType() {
		return policyRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyRelationshipType(PolicyRelationshipType newPolicyRelationshipType) {
		PolicyRelationshipType oldPolicyRelationshipType = policyRelationshipType;
		policyRelationshipType = newPolicyRelationshipType == null ? POLICY_RELATIONSHIP_TYPE_EDEFAULT : newPolicyRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE, oldPolicyRelationshipType, policyRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntity getPolicyEntity() {
		if (policyEntity != null && policyEntity.eIsProxy()) {
			InternalEObject oldPolicyEntity = (InternalEObject)policyEntity;
			policyEntity = (PolicyEntity)eResolveProxy(oldPolicyEntity);
			if (policyEntity != oldPolicyEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY, oldPolicyEntity, policyEntity));
			}
		}
		return policyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntity basicGetPolicyEntity() {
		return policyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyEntity(PolicyEntity newPolicyEntity) {
		PolicyEntity oldPolicyEntity = policyEntity;
		policyEntity = newPolicyEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY, oldPolicyEntity, policyEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity getBusinessEntity() {
		if (businessEntity != null && businessEntity.eIsProxy()) {
			InternalEObject oldBusinessEntity = (InternalEObject)businessEntity;
			businessEntity = (BusinessEntity)eResolveProxy(oldBusinessEntity);
			if (businessEntity != oldBusinessEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
			}
		}
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity basicGetBusinessEntity() {
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessEntity(BusinessEntity newBusinessEntity) {
		BusinessEntity oldBusinessEntity = businessEntity;
		businessEntity = newBusinessEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE:
				return getPolicyRelationshipType();
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY:
				if (resolve) return getPolicyEntity();
				return basicGetPolicyEntity();
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY:
				if (resolve) return getBusinessEntity();
				return basicGetBusinessEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE:
				setPolicyRelationshipType((PolicyRelationshipType)newValue);
				return;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY:
				setPolicyEntity((PolicyEntity)newValue);
				return;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntity)newValue);
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
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE:
				setPolicyRelationshipType(POLICY_RELATIONSHIP_TYPE_EDEFAULT);
				return;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY:
				setPolicyEntity((PolicyEntity)null);
				return;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntity)null);
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
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE:
				return policyRelationshipType != POLICY_RELATIONSHIP_TYPE_EDEFAULT;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__POLICY_ENTITY:
				return policyEntity != null;
			case REA_EML_BEPackage.POLICY_RELATIONSHIP__BUSINESS_ENTITY:
				return businessEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (policyRelationshipType: ");
		result.append(policyRelationshipType);
		result.append(')');
		return result.toString();
	}

} //PolicyRelationshipImpl
