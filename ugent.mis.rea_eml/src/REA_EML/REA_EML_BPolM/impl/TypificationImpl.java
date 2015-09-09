/**
 */
package REA_EML.REA_EML_BPolM.impl;

import REA_EML.REA_EML_BPolM.BusinessEntity;
import REA_EML.REA_EML_BPolM.PolicyEntityType;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage;
import REA_EML.REA_EML_BPolM.Typification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.TypificationImpl#getPolicyEntityType <em>Policy Entity Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.TypificationImpl#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypificationImpl extends BusinessRelationshipImpl implements Typification {
	/**
	 * The cached value of the '{@link #getPolicyEntityType() <em>Policy Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyEntityType()
	 * @generated
	 * @ordered
	 */
	protected PolicyEntityType policyEntityType;

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
	protected TypificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPolMPackage.Literals.TYPIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityType getPolicyEntityType() {
		if (policyEntityType != null && policyEntityType.eIsProxy()) {
			InternalEObject oldPolicyEntityType = (InternalEObject)policyEntityType;
			policyEntityType = (PolicyEntityType)eResolveProxy(oldPolicyEntityType);
			if (policyEntityType != oldPolicyEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE, oldPolicyEntityType, policyEntityType));
			}
		}
		return policyEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityType basicGetPolicyEntityType() {
		return policyEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyEntityType(PolicyEntityType newPolicyEntityType) {
		PolicyEntityType oldPolicyEntityType = policyEntityType;
		policyEntityType = newPolicyEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE, oldPolicyEntityType, policyEntityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE:
				if (resolve) return getPolicyEntityType();
				return basicGetPolicyEntityType();
			case REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE:
				setPolicyEntityType((PolicyEntityType)newValue);
				return;
			case REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE:
				setPolicyEntityType((PolicyEntityType)null);
				return;
			case REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.TYPIFICATION__POLICY_ENTITY_TYPE:
				return policyEntityType != null;
			case REA_EML_BPolMPackage.TYPIFICATION__BUSINESS_ENTITY:
				return businessEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //TypificationImpl
