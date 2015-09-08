/**
 */
package BMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Goal#getGoalAmplifiesVision <em>Goal Amplifies Vision</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends DesiredResult {
	/**
	 * Returns the value of the '<em><b>Goal Amplifies Vision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Amplifies Vision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Amplifies Vision</em>' reference.
	 * @see #setGoalAmplifiesVision(Vision)
	 * @see BMM.BMMPackage#getGoal_GoalAmplifiesVision()
	 * @model ordered="false"
	 * @generated
	 */
	Vision getGoalAmplifiesVision();

	/**
	 * Sets the value of the '{@link BMM.Goal#getGoalAmplifiesVision <em>Goal Amplifies Vision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Amplifies Vision</em>' reference.
	 * @see #getGoalAmplifiesVision()
	 * @generated
	 */
	void setGoalAmplifiesVision(Vision value);

} // Goal
