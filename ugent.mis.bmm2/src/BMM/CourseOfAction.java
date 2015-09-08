/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Of Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.CourseOfAction#getEnablingCourseofActionEnablesEnabledCourseOfAction <em>Enabling Courseof Action Enables Enabled Course Of Action</em>}</li>
 *   <li>{@link BMM.CourseOfAction#getBroaderCourseofActionIncludesMoreSpecificCourseOfAction <em>Broader Courseof Action Includes More Specific Course Of Action</em>}</li>
 *   <li>{@link BMM.CourseOfAction#getCourseOfActionChanneIsEffortsTowardsDesiredResult <em>Course Of Action Channe Is Efforts Towards Desired Result</em>}</li>
 *   <li>{@link BMM.CourseOfAction#getCourseOfActionDeployAsset <em>Course Of Action Deploy Asset</em>}</li>
 *   <li>{@link BMM.CourseOfAction#getCourseOfActionDefiensOffering <em>Course Of Action Defiens Offering</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getCourseOfAction()
 * @model
 * @generated
 */
public interface CourseOfAction extends Means {
	/**
	 * Returns the value of the '<em><b>Enabling Courseof Action Enables Enabled Course Of Action</b></em>' reference list.
	 * The list contents are of type {@link BMM.CourseOfAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabling Courseof Action Enables Enabled Course Of Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabling Courseof Action Enables Enabled Course Of Action</em>' reference list.
	 * @see BMM.BMMPackage#getCourseOfAction_EnablingCourseofActionEnablesEnabledCourseOfAction()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CourseOfAction> getEnablingCourseofActionEnablesEnabledCourseOfAction();

	/**
	 * Returns the value of the '<em><b>Broader Courseof Action Includes More Specific Course Of Action</b></em>' reference list.
	 * The list contents are of type {@link BMM.CourseOfAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broader Courseof Action Includes More Specific Course Of Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broader Courseof Action Includes More Specific Course Of Action</em>' reference list.
	 * @see BMM.BMMPackage#getCourseOfAction_BroaderCourseofActionIncludesMoreSpecificCourseOfAction()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CourseOfAction> getBroaderCourseofActionIncludesMoreSpecificCourseOfAction();

	/**
	 * Returns the value of the '<em><b>Course Of Action Channe Is Efforts Towards Desired Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Of Action Channe Is Efforts Towards Desired Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Of Action Channe Is Efforts Towards Desired Result</em>' reference.
	 * @see #setCourseOfActionChanneIsEffortsTowardsDesiredResult(DesiredResult)
	 * @see BMM.BMMPackage#getCourseOfAction_CourseOfActionChanneIsEffortsTowardsDesiredResult()
	 * @model ordered="false"
	 * @generated
	 */
	DesiredResult getCourseOfActionChanneIsEffortsTowardsDesiredResult();

	/**
	 * Sets the value of the '{@link BMM.CourseOfAction#getCourseOfActionChanneIsEffortsTowardsDesiredResult <em>Course Of Action Channe Is Efforts Towards Desired Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Of Action Channe Is Efforts Towards Desired Result</em>' reference.
	 * @see #getCourseOfActionChanneIsEffortsTowardsDesiredResult()
	 * @generated
	 */
	void setCourseOfActionChanneIsEffortsTowardsDesiredResult(DesiredResult value);

	/**
	 * Returns the value of the '<em><b>Course Of Action Deploy Asset</b></em>' reference list.
	 * The list contents are of type {@link BMM.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Of Action Deploy Asset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Of Action Deploy Asset</em>' reference list.
	 * @see BMM.BMMPackage#getCourseOfAction_CourseOfActionDeployAsset()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Asset> getCourseOfActionDeployAsset();

	/**
	 * Returns the value of the '<em><b>Course Of Action Defiens Offering</b></em>' reference list.
	 * The list contents are of type {@link BMM.Offering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Of Action Defiens Offering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Of Action Defiens Offering</em>' reference list.
	 * @see BMM.BMMPackage#getCourseOfAction_CourseOfActionDefiensOffering()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Offering> getCourseOfActionDefiensOffering();

} // CourseOfAction
