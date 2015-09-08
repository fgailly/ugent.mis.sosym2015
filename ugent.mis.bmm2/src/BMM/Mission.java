/**
 */
package BMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Mission#getMissionMakesOperativeVision <em>Mission Makes Operative Vision</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends Means {
	/**
	 * Returns the value of the '<em><b>Mission Makes Operative Vision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Makes Operative Vision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Makes Operative Vision</em>' reference.
	 * @see #setMissionMakesOperativeVision(Vision)
	 * @see BMM.BMMPackage#getMission_MissionMakesOperativeVision()
	 * @model ordered="false"
	 * @generated
	 */
	Vision getMissionMakesOperativeVision();

	/**
	 * Sets the value of the '{@link BMM.Mission#getMissionMakesOperativeVision <em>Mission Makes Operative Vision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Makes Operative Vision</em>' reference.
	 * @see #getMissionMakesOperativeVision()
	 * @generated
	 */
	void setMissionMakesOperativeVision(Vision value);

} // Mission
