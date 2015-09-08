/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.FixedAsset;
import BMM.Offering;
import BMM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.OfferingImpl#getOfferingRequiresResource <em>Offering Requires Resource</em>}</li>
 *   <li>{@link BMM.impl.OfferingImpl#getOfferingUsesFixedAsset <em>Offering Uses Fixed Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfferingImpl extends FixedAssetImpl implements Offering {
	/**
	 * The cached value of the '{@link #getOfferingRequiresResource() <em>Offering Requires Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferingRequiresResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> offeringRequiresResource;

	/**
	 * The cached value of the '{@link #getOfferingUsesFixedAsset() <em>Offering Uses Fixed Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferingUsesFixedAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<FixedAsset> offeringUsesFixedAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfferingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.OFFERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOfferingRequiresResource() {
		if (offeringRequiresResource == null) {
			offeringRequiresResource = new EObjectResolvingEList<Resource>(Resource.class, this, BMMPackage.OFFERING__OFFERING_REQUIRES_RESOURCE);
		}
		return offeringRequiresResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedAsset> getOfferingUsesFixedAsset() {
		if (offeringUsesFixedAsset == null) {
			offeringUsesFixedAsset = new EObjectResolvingEList<FixedAsset>(FixedAsset.class, this, BMMPackage.OFFERING__OFFERING_USES_FIXED_ASSET);
		}
		return offeringUsesFixedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.OFFERING__OFFERING_REQUIRES_RESOURCE:
				return getOfferingRequiresResource();
			case BMMPackage.OFFERING__OFFERING_USES_FIXED_ASSET:
				return getOfferingUsesFixedAsset();
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
			case BMMPackage.OFFERING__OFFERING_REQUIRES_RESOURCE:
				getOfferingRequiresResource().clear();
				getOfferingRequiresResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case BMMPackage.OFFERING__OFFERING_USES_FIXED_ASSET:
				getOfferingUsesFixedAsset().clear();
				getOfferingUsesFixedAsset().addAll((Collection<? extends FixedAsset>)newValue);
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
			case BMMPackage.OFFERING__OFFERING_REQUIRES_RESOURCE:
				getOfferingRequiresResource().clear();
				return;
			case BMMPackage.OFFERING__OFFERING_USES_FIXED_ASSET:
				getOfferingUsesFixedAsset().clear();
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
			case BMMPackage.OFFERING__OFFERING_REQUIRES_RESOURCE:
				return offeringRequiresResource != null && !offeringRequiresResource.isEmpty();
			case BMMPackage.OFFERING__OFFERING_USES_FIXED_ASSET:
				return offeringUsesFixedAsset != null && !offeringUsesFixedAsset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OfferingImpl
