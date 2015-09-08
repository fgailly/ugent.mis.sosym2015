/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Directive#getDirectiveGovernsCourseOfAction <em>Directive Governs Course Of Action</em>}</li>
 *   <li>{@link BMM.Directive#getDirectiveIsSourceOfCourseOfAction <em>Directive Is Source Of Course Of Action</em>}</li>
 *   <li>{@link BMM.Directive#getDirectiveActAsRegulation <em>Directive Act As Regulation</em>}</li>
 *   <li>{@link BMM.Directive#getDirectiveSupportsAchievementOfDesiredResult <em>Directive Supports Achievement Of Desired Result</em>}</li>
 *   <li>{@link BMM.Directive#getDirectiveGovernsUseOfAsset <em>Directive Governs Use Of Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getDirective()
 * @model
 * @generated
 */
public interface Directive extends Means {
	/**
	 * Returns the value of the '<em><b>Directive Governs Course Of Action</b></em>' reference list.
	 * The list contents are of type {@link BMM.CourseOfAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Governs Course Of Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Governs Course Of Action</em>' reference list.
	 * @see BMM.BMMPackage#getDirective_DirectiveGovernsCourseOfAction()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CourseOfAction> getDirectiveGovernsCourseOfAction();

	/**
	 * Returns the value of the '<em><b>Directive Is Source Of Course Of Action</b></em>' reference list.
	 * The list contents are of type {@link BMM.CourseOfAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Is Source Of Course Of Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Is Source Of Course Of Action</em>' reference list.
	 * @see BMM.BMMPackage#getDirective_DirectiveIsSourceOfCourseOfAction()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CourseOfAction> getDirectiveIsSourceOfCourseOfAction();

	/**
	 * Returns the value of the '<em><b>Directive Act As Regulation</b></em>' reference list.
	 * The list contents are of type {@link BMM.Regulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Act As Regulation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Act As Regulation</em>' reference list.
	 * @see BMM.BMMPackage#getDirective_DirectiveActAsRegulation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Regulation> getDirectiveActAsRegulation();

	/**
	 * Returns the value of the '<em><b>Directive Supports Achievement Of Desired Result</b></em>' reference list.
	 * The list contents are of type {@link BMM.DesiredResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Supports Achievement Of Desired Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Supports Achievement Of Desired Result</em>' reference list.
	 * @see BMM.BMMPackage#getDirective_DirectiveSupportsAchievementOfDesiredResult()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DesiredResult> getDirectiveSupportsAchievementOfDesiredResult();

	/**
	 * Returns the value of the '<em><b>Directive Governs Use Of Asset</b></em>' reference list.
	 * The list contents are of type {@link BMM.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directive Governs Use Of Asset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directive Governs Use Of Asset</em>' reference list.
	 * @see BMM.BMMPackage#getDirective_DirectiveGovernsUseOfAsset()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Asset> getDirectiveGovernsUseOfAsset();

} // Directive
