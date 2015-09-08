/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tactic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Tactic#getTacticImplementsStrategy <em>Tactic Implements Strategy</em>}</li>
 *   <li>{@link BMM.Tactic#getTacticEffectsEnforcementLevelOfBusinessRule <em>Tactic Effects Enforcement Level Of Business Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getTactic()
 * @model
 * @generated
 */
public interface Tactic extends CourseOfAction {
	/**
	 * Returns the value of the '<em><b>Tactic Implements Strategy</b></em>' reference list.
	 * The list contents are of type {@link BMM.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactic Implements Strategy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tactic Implements Strategy</em>' reference list.
	 * @see BMM.BMMPackage#getTactic_TacticImplementsStrategy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Strategy> getTacticImplementsStrategy();

	/**
	 * Returns the value of the '<em><b>Tactic Effects Enforcement Level Of Business Rule</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactic Effects Enforcement Level Of Business Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tactic Effects Enforcement Level Of Business Rule</em>' reference list.
	 * @see BMM.BMMPackage#getTactic_TacticEffectsEnforcementLevelOfBusinessRule()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessRule> getTacticEffectsEnforcementLevelOfBusinessRule();

} // Tactic
