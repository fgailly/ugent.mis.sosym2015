/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Objective#getObjectiveQuantifiesGoal <em>Objective Quantifies Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getObjective()
 * @model
 * @generated
 */
public interface Objective extends DesiredResult {
	/**
	 * Returns the value of the '<em><b>Objective Quantifies Goal</b></em>' reference list.
	 * The list contents are of type {@link BMM.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective Quantifies Goal</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective Quantifies Goal</em>' reference list.
	 * @see BMM.BMMPackage#getObjective_ObjectiveQuantifiesGoal()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Goal> getObjectiveQuantifiesGoal();

} // Objective
