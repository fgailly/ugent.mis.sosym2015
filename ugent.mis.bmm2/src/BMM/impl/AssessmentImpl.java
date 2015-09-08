/**
 */
package BMM.impl;

import BMM.Assessment;
import BMM.BMMPackage;
import BMM.Directive;
import BMM.Influencer;
import BMM.PotentialImpact;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.AssessmentImpl#getUsingAssessmentUsesUsedAssessment <em>Using Assessment Uses Used Assessment</em>}</li>
 *   <li>{@link BMM.impl.AssessmentImpl#getAssessmentProvidesImpetusForDirective <em>Assessment Provides Impetus For Directive</em>}</li>
 *   <li>{@link BMM.impl.AssessmentImpl#getAssessmentIdentifiesPotentialImpact <em>Assessment Identifies Potential Impact</em>}</li>
 *   <li>{@link BMM.impl.AssessmentImpl#getAssessmentJudgmentOfInfluencer <em>Assessment Judgment Of Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentImpl extends MotivationElementImpl implements Assessment {
	/**
	 * The cached value of the '{@link #getUsingAssessmentUsesUsedAssessment() <em>Using Assessment Uses Used Assessment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsingAssessmentUsesUsedAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> usingAssessmentUsesUsedAssessment;

	/**
	 * The cached value of the '{@link #getAssessmentProvidesImpetusForDirective() <em>Assessment Provides Impetus For Directive</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentProvidesImpetusForDirective()
	 * @generated
	 * @ordered
	 */
	protected EList<Directive> assessmentProvidesImpetusForDirective;

	/**
	 * The cached value of the '{@link #getAssessmentIdentifiesPotentialImpact() <em>Assessment Identifies Potential Impact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentIdentifiesPotentialImpact()
	 * @generated
	 * @ordered
	 */
	protected EList<PotentialImpact> assessmentIdentifiesPotentialImpact;

	/**
	 * The cached value of the '{@link #getAssessmentJudgmentOfInfluencer() <em>Assessment Judgment Of Influencer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentJudgmentOfInfluencer()
	 * @generated
	 * @ordered
	 */
	protected EList<Influencer> assessmentJudgmentOfInfluencer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assessment> getUsingAssessmentUsesUsedAssessment() {
		if (usingAssessmentUsesUsedAssessment == null) {
			usingAssessmentUsesUsedAssessment = new EObjectResolvingEList<Assessment>(Assessment.class, this, BMMPackage.ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT);
		}
		return usingAssessmentUsesUsedAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Directive> getAssessmentProvidesImpetusForDirective() {
		if (assessmentProvidesImpetusForDirective == null) {
			assessmentProvidesImpetusForDirective = new EObjectResolvingEList<Directive>(Directive.class, this, BMMPackage.ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE);
		}
		return assessmentProvidesImpetusForDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PotentialImpact> getAssessmentIdentifiesPotentialImpact() {
		if (assessmentIdentifiesPotentialImpact == null) {
			assessmentIdentifiesPotentialImpact = new EObjectResolvingEList<PotentialImpact>(PotentialImpact.class, this, BMMPackage.ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT);
		}
		return assessmentIdentifiesPotentialImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Influencer> getAssessmentJudgmentOfInfluencer() {
		if (assessmentJudgmentOfInfluencer == null) {
			assessmentJudgmentOfInfluencer = new EObjectResolvingEList<Influencer>(Influencer.class, this, BMMPackage.ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER);
		}
		return assessmentJudgmentOfInfluencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT:
				return getUsingAssessmentUsesUsedAssessment();
			case BMMPackage.ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				return getAssessmentProvidesImpetusForDirective();
			case BMMPackage.ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT:
				return getAssessmentIdentifiesPotentialImpact();
			case BMMPackage.ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER:
				return getAssessmentJudgmentOfInfluencer();
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
			case BMMPackage.ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT:
				getUsingAssessmentUsesUsedAssessment().clear();
				getUsingAssessmentUsesUsedAssessment().addAll((Collection<? extends Assessment>)newValue);
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				getAssessmentProvidesImpetusForDirective().clear();
				getAssessmentProvidesImpetusForDirective().addAll((Collection<? extends Directive>)newValue);
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT:
				getAssessmentIdentifiesPotentialImpact().clear();
				getAssessmentIdentifiesPotentialImpact().addAll((Collection<? extends PotentialImpact>)newValue);
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER:
				getAssessmentJudgmentOfInfluencer().clear();
				getAssessmentJudgmentOfInfluencer().addAll((Collection<? extends Influencer>)newValue);
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
			case BMMPackage.ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT:
				getUsingAssessmentUsesUsedAssessment().clear();
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				getAssessmentProvidesImpetusForDirective().clear();
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT:
				getAssessmentIdentifiesPotentialImpact().clear();
				return;
			case BMMPackage.ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER:
				getAssessmentJudgmentOfInfluencer().clear();
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
			case BMMPackage.ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT:
				return usingAssessmentUsesUsedAssessment != null && !usingAssessmentUsesUsedAssessment.isEmpty();
			case BMMPackage.ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE:
				return assessmentProvidesImpetusForDirective != null && !assessmentProvidesImpetusForDirective.isEmpty();
			case BMMPackage.ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT:
				return assessmentIdentifiesPotentialImpact != null && !assessmentIdentifiesPotentialImpact.isEmpty();
			case BMMPackage.ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER:
				return assessmentJudgmentOfInfluencer != null && !assessmentJudgmentOfInfluencer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssessmentImpl
