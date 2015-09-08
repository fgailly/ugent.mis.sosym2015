/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Directive;
import BMM.PotentialImpact;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potential Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.PotentialImpactImpl#getPotentialImpactProvidesImpetusForDirective <em>Potential Impact Provides Impetus For Directive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotentialImpactImpl extends MotivationElementImpl implements PotentialImpact {
	/**
	 * The cached value of the '{@link #getPotentialImpactProvidesImpetusForDirective() <em>Potential Impact Provides Impetus For Directive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentialImpactProvidesImpetusForDirective()
	 * @generated
	 * @ordered
	 */
	protected EList<Directive> potentialImpactProvidesImpetusForDirective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotentialImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.POTENTIAL_IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directive> getPotentialImpactProvidesImpetusForDirective() {
		if (potentialImpactProvidesImpetusForDirective == null) {
			potentialImpactProvidesImpetusForDirective = new EObjectResolvingEList<Directive>(Directive.class, this, BMMPackage.POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE);
		}
		return potentialImpactProvidesImpetusForDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				return getPotentialImpactProvidesImpetusForDirective();
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
			case BMMPackage.POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				getPotentialImpactProvidesImpetusForDirective().clear();
				getPotentialImpactProvidesImpetusForDirective().addAll((Collection<? extends Directive>)newValue);
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
			case BMMPackage.POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				getPotentialImpactProvidesImpetusForDirective().clear();
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
			case BMMPackage.POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				return potentialImpactProvidesImpetusForDirective != null && !potentialImpactProvidesImpetusForDirective.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PotentialImpactImpl
