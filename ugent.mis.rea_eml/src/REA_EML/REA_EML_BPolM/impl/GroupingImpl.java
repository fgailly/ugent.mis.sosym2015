/**
 */
package REA_EML.REA_EML_BPolM.impl;

import REA_EML.REA_EML_BPolM.BusinessEntity;
import REA_EML.REA_EML_BPolM.Grouping;
import REA_EML.REA_EML_BPolM.PolicyEntityGroup;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.GroupingImpl#getGroupingEntityType <em>Grouping Entity Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.impl.GroupingImpl#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupingImpl extends BusinessRelationshipImpl implements Grouping {
	/**
	 * The cached value of the '{@link #getGroupingEntityType() <em>Grouping Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupingEntityType()
	 * @generated
	 * @ordered
	 */
	protected PolicyEntityGroup groupingEntityType;

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
	protected GroupingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPolMPackage.Literals.GROUPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityGroup getGroupingEntityType() {
		if (groupingEntityType != null && groupingEntityType.eIsProxy()) {
			InternalEObject oldGroupingEntityType = (InternalEObject)groupingEntityType;
			groupingEntityType = (PolicyEntityGroup)eResolveProxy(oldGroupingEntityType);
			if (groupingEntityType != oldGroupingEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE, oldGroupingEntityType, groupingEntityType));
			}
		}
		return groupingEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityGroup basicGetGroupingEntityType() {
		return groupingEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupingEntityType(PolicyEntityGroup newGroupingEntityType) {
		PolicyEntityGroup oldGroupingEntityType = groupingEntityType;
		groupingEntityType = newGroupingEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE, oldGroupingEntityType, groupingEntityType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE:
				if (resolve) return getGroupingEntityType();
				return basicGetGroupingEntityType();
			case REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE:
				setGroupingEntityType((PolicyEntityGroup)newValue);
				return;
			case REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE:
				setGroupingEntityType((PolicyEntityGroup)null);
				return;
			case REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY:
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
			case REA_EML_BPolMPackage.GROUPING__GROUPING_ENTITY_TYPE:
				return groupingEntityType != null;
			case REA_EML_BPolMPackage.GROUPING__BUSINESS_ENTITY:
				return businessEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupingImpl
