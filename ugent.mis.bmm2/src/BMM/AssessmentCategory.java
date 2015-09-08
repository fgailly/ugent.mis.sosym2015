/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.AssessmentCategory#getAssessmentCategoryCategoriesAssessment <em>Assessment Category Categories Assessment</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getAssessmentCategory()
 * @model
 * @generated
 */
public interface AssessmentCategory extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Assessment Category Categories Assessment</b></em>' reference list.
	 * The list contents are of type {@link BMM.Assessment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Category Categories Assessment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Category Categories Assessment</em>' reference list.
	 * @see BMM.BMMPackage#getAssessmentCategory_AssessmentCategoryCategoriesAssessment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assessment> getAssessmentCategoryCategoriesAssessment();

} // AssessmentCategory
