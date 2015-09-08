/**
 */
package REA_EML.REA_EML_BP.impl;

import REA_EML.REA_EML_BP.BusinessEntity;
import REA_EML.REA_EML_BP.BusinessEvent;
import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.impl.BusinessEventImpl#getBusinessEntities <em>Business Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessEventImpl extends ModelElementImpl implements BusinessEvent {
	/**
	 * The cached value of the '{@link #getBusinessEntities() <em>Business Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEntity> businessEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPPackage.Literals.BUSINESS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEntity> getBusinessEntities() {
		if (businessEntities == null) {
			businessEntities = new EObjectResolvingEList<BusinessEntity>(BusinessEntity.class, this, REA_EML_BPPackage.BUSINESS_EVENT__BUSINESS_ENTITIES);
		}
		return businessEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPPackage.BUSINESS_EVENT__BUSINESS_ENTITIES:
				return getBusinessEntities();
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
			case REA_EML_BPPackage.BUSINESS_EVENT__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				getBusinessEntities().addAll((Collection<? extends BusinessEntity>)newValue);
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
			case REA_EML_BPPackage.BUSINESS_EVENT__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
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
			case REA_EML_BPPackage.BUSINESS_EVENT__BUSINESS_ENTITIES:
				return businessEntities != null && !businessEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessEventImpl
