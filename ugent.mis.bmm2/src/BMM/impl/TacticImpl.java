/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.BusinessRule;
import BMM.Strategy;
import BMM.Tactic;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tactic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.TacticImpl#getTacticImplementsStrategy <em>Tactic Implements Strategy</em>}</li>
 *   <li>{@link BMM.impl.TacticImpl#getTacticEffectsEnforcementLevelOfBusinessRule <em>Tactic Effects Enforcement Level Of Business Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TacticImpl extends CourseOfActionImpl implements Tactic {
	/**
	 * The cached value of the '{@link #getTacticImplementsStrategy() <em>Tactic Implements Strategy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTacticImplementsStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> tacticImplementsStrategy;

	/**
	 * The cached value of the '{@link #getTacticEffectsEnforcementLevelOfBusinessRule() <em>Tactic Effects Enforcement Level Of Business Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTacticEffectsEnforcementLevelOfBusinessRule()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> tacticEffectsEnforcementLevelOfBusinessRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TacticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.TACTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getTacticImplementsStrategy() {
		if (tacticImplementsStrategy == null) {
			tacticImplementsStrategy = new EObjectResolvingEList<Strategy>(Strategy.class, this, BMMPackage.TACTIC__TACTIC_IMPLEMENTS_STRATEGY);
		}
		return tacticImplementsStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRule> getTacticEffectsEnforcementLevelOfBusinessRule() {
		if (tacticEffectsEnforcementLevelOfBusinessRule == null) {
			tacticEffectsEnforcementLevelOfBusinessRule = new EObjectResolvingEList<BusinessRule>(BusinessRule.class, this, BMMPackage.TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE);
		}
		return tacticEffectsEnforcementLevelOfBusinessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.TACTIC__TACTIC_IMPLEMENTS_STRATEGY:
				return getTacticImplementsStrategy();
			case BMMPackage.TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE:
				return getTacticEffectsEnforcementLevelOfBusinessRule();
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
			case BMMPackage.TACTIC__TACTIC_IMPLEMENTS_STRATEGY:
				getTacticImplementsStrategy().clear();
				getTacticImplementsStrategy().addAll((Collection<? extends Strategy>)newValue);
				return;
			case BMMPackage.TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE:
				getTacticEffectsEnforcementLevelOfBusinessRule().clear();
				getTacticEffectsEnforcementLevelOfBusinessRule().addAll((Collection<? extends BusinessRule>)newValue);
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
			case BMMPackage.TACTIC__TACTIC_IMPLEMENTS_STRATEGY:
				getTacticImplementsStrategy().clear();
				return;
			case BMMPackage.TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE:
				getTacticEffectsEnforcementLevelOfBusinessRule().clear();
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
			case BMMPackage.TACTIC__TACTIC_IMPLEMENTS_STRATEGY:
				return tacticImplementsStrategy != null && !tacticImplementsStrategy.isEmpty();
			case BMMPackage.TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE:
				return tacticEffectsEnforcementLevelOfBusinessRule != null && !tacticEffectsEnforcementLevelOfBusinessRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TacticImpl
