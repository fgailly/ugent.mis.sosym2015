/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Influencer;
import BMM.InfluencerCategory;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influencer Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.InfluencerCategoryImpl#getInfluencerCategoryCategorizesInfluencer <em>Influencer Category Categorizes Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluencerCategoryImpl extends MotivationElementImpl implements InfluencerCategory {
	/**
	 * The cached value of the '{@link #getInfluencerCategoryCategorizesInfluencer() <em>Influencer Category Categorizes Influencer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluencerCategoryCategorizesInfluencer()
	 * @generated
	 * @ordered
	 */
	protected EList<Influencer> influencerCategoryCategorizesInfluencer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluencerCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.INFLUENCER_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Influencer> getInfluencerCategoryCategorizesInfluencer() {
		if (influencerCategoryCategorizesInfluencer == null) {
			influencerCategoryCategorizesInfluencer = new EObjectResolvingEList<Influencer>(Influencer.class, this, BMMPackage.INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER);
		}
		return influencerCategoryCategorizesInfluencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER:
				return getInfluencerCategoryCategorizesInfluencer();
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
			case BMMPackage.INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER:
				getInfluencerCategoryCategorizesInfluencer().clear();
				getInfluencerCategoryCategorizesInfluencer().addAll((Collection<? extends Influencer>)newValue);
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
			case BMMPackage.INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER:
				getInfluencerCategoryCategorizesInfluencer().clear();
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
			case BMMPackage.INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER:
				return influencerCategoryCategorizesInfluencer != null && !influencerCategoryCategorizesInfluencer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluencerCategoryImpl
