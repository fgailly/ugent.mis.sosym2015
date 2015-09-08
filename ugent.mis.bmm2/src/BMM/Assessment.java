/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Assessment#getUsingAssessmentUsesUsedAssessment <em>Using Assessment Uses Used Assessment</em>}</li>
 *   <li>{@link BMM.Assessment#getAssessmentProvidesImpetusForDirective <em>Assessment Provides Impetus For Directive</em>}</li>
 *   <li>{@link BMM.Assessment#getAssessmentIdentifiesPotentialImpact <em>Assessment Identifies Potential Impact</em>}</li>
 *   <li>{@link BMM.Assessment#getAssessmentJudgmentOfInfluencer <em>Assessment Judgment Of Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Using Assessment Uses Used Assessment</b></em>' reference list.
	 * The list contents are of type {@link BMM.Assessment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using Assessment Uses Used Assessment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using Assessment Uses Used Assessment</em>' reference list.
	 * @see BMM.BMMPackage#getAssessment_UsingAssessmentUsesUsedAssessment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assessment> getUsingAssessmentUsesUsedAssessment();

	/**
	 * Returns the value of the '<em><b>Assessment Provides Impetus For Directive</b></em>' reference list.
	 * The list contents are of type {@link BMM.Directive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Provides Impetus For Directive</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Provides Impetus For Directive</em>' reference list.
	 * @see BMM.BMMPackage#getAssessment_AssessmentProvidesImpetusForDirective()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Directive> getAssessmentProvidesImpetusForDirective();

	/**
	 * Returns the value of the '<em><b>Assessment Identifies Potential Impact</b></em>' reference list.
	 * The list contents are of type {@link BMM.PotentialImpact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Identifies Potential Impact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Identifies Potential Impact</em>' reference list.
	 * @see BMM.BMMPackage#getAssessment_AssessmentIdentifiesPotentialImpact()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PotentialImpact> getAssessmentIdentifiesPotentialImpact();

	/**
	 * Returns the value of the '<em><b>Assessment Judgment Of Influencer</b></em>' reference list.
	 * The list contents are of type {@link BMM.Influencer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Judgment Of Influencer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Judgment Of Influencer</em>' reference list.
	 * @see BMM.BMMPackage#getAssessment_AssessmentJudgmentOfInfluencer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Influencer> getAssessmentJudgmentOfInfluencer();

} // Assessment
