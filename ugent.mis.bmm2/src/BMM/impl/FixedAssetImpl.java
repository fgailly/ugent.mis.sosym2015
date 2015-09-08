/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.FixedAsset;
import BMM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.FixedAssetImpl#getFixedAssetProvidesResource <em>Fixed Asset Provides Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedAssetImpl extends AssetImpl implements FixedAsset {
	/**
	 * The cached value of the '{@link #getFixedAssetProvidesResource() <em>Fixed Asset Provides Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetProvidesResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> fixedAssetProvidesResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.FIXED_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getFixedAssetProvidesResource() {
		if (fixedAssetProvidesResource == null) {
			fixedAssetProvidesResource = new EObjectResolvingEList<Resource>(Resource.class, this, BMMPackage.FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE);
		}
		return fixedAssetProvidesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE:
				return getFixedAssetProvidesResource();
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
			case BMMPackage.FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE:
				getFixedAssetProvidesResource().clear();
				getFixedAssetProvidesResource().addAll((Collection<? extends Resource>)newValue);
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
			case BMMPackage.FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE:
				getFixedAssetProvidesResource().clear();
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
			case BMMPackage.FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE:
				return fixedAssetProvidesResource != null && !fixedAssetProvidesResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FixedAssetImpl
