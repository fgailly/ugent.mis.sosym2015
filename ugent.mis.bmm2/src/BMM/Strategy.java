/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Strategy#getStrategyIsAComponentOfThePlanForMission <em>Strategy Is AComponent Of The Plan For Mission</em>}</li>
 *   <li>{@link BMM.Strategy#getStrategyDeterminesOrganizationUnit <em>Strategy Determines Organization Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends CourseOfAction {
	/**
	 * Returns the value of the '<em><b>Strategy Is AComponent Of The Plan For Mission</b></em>' reference list.
	 * The list contents are of type {@link BMM.Mission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Is AComponent Of The Plan For Mission</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Is AComponent Of The Plan For Mission</em>' reference list.
	 * @see BMM.BMMPackage#getStrategy_StrategyIsAComponentOfThePlanForMission()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Mission> getStrategyIsAComponentOfThePlanForMission();

	/**
	 * Returns the value of the '<em><b>Strategy Determines Organization Unit</b></em>' reference list.
	 * The list contents are of type {@link BMM.OrganizationUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Determines Organization Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Determines Organization Unit</em>' reference list.
	 * @see BMM.BMMPackage#getStrategy_StrategyDeterminesOrganizationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OrganizationUnit> getStrategyDeterminesOrganizationUnit();

} // Strategy
