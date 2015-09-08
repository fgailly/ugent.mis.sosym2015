/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Influencer;
import BMM.InfluencingOrganization;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influencing Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.InfluencingOrganizationImpl#getInfluencingOrganizationIsSourceOfInfluencer <em>Influencing Organization Is Source Of Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluencingOrganizationImpl extends MotivationElementImpl implements InfluencingOrganization {
	/**
	 * The cached value of the '{@link #getInfluencingOrganizationIsSourceOfInfluencer() <em>Influencing Organization Is Source Of Influencer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencingOrganizationIsSourceOfInfluencer()
	 * @generated
	 * @ordered
	 */
	protected EList<Influencer> influencingOrganizationIsSourceOfInfluencer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluencingOrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.INFLUENCING_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Influencer> getInfluencingOrganizationIsSourceOfInfluencer() {
		if (influencingOrganizationIsSourceOfInfluencer == null) {
			influencingOrganizationIsSourceOfInfluencer = new EObjectResolvingEList<Influencer>(Influencer.class, this, BMMPackage.INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER);
		}
		return influencingOrganizationIsSourceOfInfluencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER:
				return getInfluencingOrganizationIsSourceOfInfluencer();
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
			case BMMPackage.INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER:
				getInfluencingOrganizationIsSourceOfInfluencer().clear();
				getInfluencingOrganizationIsSourceOfInfluencer().addAll((Collection<? extends Influencer>)newValue);
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
			case BMMPackage.INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER:
				getInfluencingOrganizationIsSourceOfInfluencer().clear();
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
			case BMMPackage.INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER:
				return influencingOrganizationIsSourceOfInfluencer != null && !influencingOrganizationIsSourceOfInfluencer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluencingOrganizationImpl
