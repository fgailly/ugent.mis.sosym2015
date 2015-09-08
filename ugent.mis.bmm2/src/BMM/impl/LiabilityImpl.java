/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Liability;
import BMM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.LiabilityImpl#getLiabilityClaimsResource <em>Liability Claims Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiabilityImpl extends MotivationElementImpl implements Liability {
	/**
	 * The cached value of the '{@link #getLiabilityClaimsResource() <em>Liability Claims Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiabilityClaimsResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> liabilityClaimsResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.LIABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getLiabilityClaimsResource() {
		if (liabilityClaimsResource == null) {
			liabilityClaimsResource = new EObjectResolvingEList<Resource>(Resource.class, this, BMMPackage.LIABILITY__LIABILITY_CLAIMS_RESOURCE);
		}
		return liabilityClaimsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.LIABILITY__LIABILITY_CLAIMS_RESOURCE:
				return getLiabilityClaimsResource();
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
			case BMMPackage.LIABILITY__LIABILITY_CLAIMS_RESOURCE:
				getLiabilityClaimsResource().clear();
				getLiabilityClaimsResource().addAll((Collection<? extends Resource>)newValue);
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
			case BMMPackage.LIABILITY__LIABILITY_CLAIMS_RESOURCE:
				getLiabilityClaimsResource().clear();
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
			case BMMPackage.LIABILITY__LIABILITY_CLAIMS_RESOURCE:
				return liabilityClaimsResource != null && !liabilityClaimsResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LiabilityImpl
