/**
 */
package BMM.util;

import BMM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see BMM.BMMPackage
 * @generated
 */
public class BMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMSwitch() {
		if (modelPackage == null) {
			modelPackage = BMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BMMPackage.MOTIVATION_ELEMENT: {
				MotivationElement motivationElement = (MotivationElement)theEObject;
				T result = caseMotivationElement(motivationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.ASSESSMENT: {
				Assessment assessment = (Assessment)theEObject;
				T result = caseAssessment(assessment);
				if (result == null) result = caseMotivationElement(assessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseMotivationElement(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.INFLUENCER: {
				Influencer influencer = (Influencer)theEObject;
				T result = caseInfluencer(influencer);
				if (result == null) result = caseMotivationElement(influencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.INFLUENCING_ORGANIZATION: {
				InfluencingOrganization influencingOrganization = (InfluencingOrganization)theEObject;
				T result = caseInfluencingOrganization(influencingOrganization);
				if (result == null) result = caseMotivationElement(influencingOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.MEANS: {
				Means means = (Means)theEObject;
				T result = caseMeans(means);
				if (result == null) result = caseMotivationElement(means);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.POTENTIAL_IMPACT: {
				PotentialImpact potentialImpact = (PotentialImpact)theEObject;
				T result = casePotentialImpact(potentialImpact);
				if (result == null) result = caseMotivationElement(potentialImpact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.ASSESSMENT_CATEGORY: {
				AssessmentCategory assessmentCategory = (AssessmentCategory)theEObject;
				T result = caseAssessmentCategory(assessmentCategory);
				if (result == null) result = caseMotivationElement(assessmentCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.INFLUENCER_CATEGORY: {
				InfluencerCategory influencerCategory = (InfluencerCategory)theEObject;
				T result = caseInfluencerCategory(influencerCategory);
				if (result == null) result = caseMotivationElement(influencerCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.ORGANIZATION_CATEGORY: {
				OrganizationCategory organizationCategory = (OrganizationCategory)theEObject;
				T result = caseOrganizationCategory(organizationCategory);
				if (result == null) result = caseMotivationElement(organizationCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.ORGANIZATION_UNIT: {
				OrganizationUnit organizationUnit = (OrganizationUnit)theEObject;
				T result = caseOrganizationUnit(organizationUnit);
				if (result == null) result = caseMotivationElement(organizationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.BUSINESS_PROCESS: {
				BusinessProcess businessProcess = (BusinessProcess)theEObject;
				T result = caseBusinessProcess(businessProcess);
				if (result == null) result = caseMotivationElement(businessProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseMotivationElement(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.LIABILITY: {
				Liability liability = (Liability)theEObject;
				T result = caseLiability(liability);
				if (result == null) result = caseMotivationElement(liability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseAsset(resource);
				if (result == null) result = caseMotivationElement(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = caseMeans(mission);
				if (result == null) result = caseMotivationElement(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.COURSE_OF_ACTION: {
				CourseOfAction courseOfAction = (CourseOfAction)theEObject;
				T result = caseCourseOfAction(courseOfAction);
				if (result == null) result = caseMeans(courseOfAction);
				if (result == null) result = caseMotivationElement(courseOfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.FIXED_ASSET: {
				FixedAsset fixedAsset = (FixedAsset)theEObject;
				T result = caseFixedAsset(fixedAsset);
				if (result == null) result = caseAsset(fixedAsset);
				if (result == null) result = caseMotivationElement(fixedAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.OFFERING: {
				Offering offering = (Offering)theEObject;
				T result = caseOffering(offering);
				if (result == null) result = caseFixedAsset(offering);
				if (result == null) result = caseAsset(offering);
				if (result == null) result = caseMotivationElement(offering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.DIRECTIVE: {
				Directive directive = (Directive)theEObject;
				T result = caseDirective(directive);
				if (result == null) result = caseMeans(directive);
				if (result == null) result = caseMotivationElement(directive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseCourseOfAction(strategy);
				if (result == null) result = caseMeans(strategy);
				if (result == null) result = caseMotivationElement(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.TACTIC: {
				Tactic tactic = (Tactic)theEObject;
				T result = caseTactic(tactic);
				if (result == null) result = caseCourseOfAction(tactic);
				if (result == null) result = caseMeans(tactic);
				if (result == null) result = caseMotivationElement(tactic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.BUSINESS_RULE: {
				BusinessRule businessRule = (BusinessRule)theEObject;
				T result = caseBusinessRule(businessRule);
				if (result == null) result = caseDirective(businessRule);
				if (result == null) result = caseMeans(businessRule);
				if (result == null) result = caseMotivationElement(businessRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.BUSINESS_POLICY: {
				BusinessPolicy businessPolicy = (BusinessPolicy)theEObject;
				T result = caseBusinessPolicy(businessPolicy);
				if (result == null) result = caseDirective(businessPolicy);
				if (result == null) result = caseMeans(businessPolicy);
				if (result == null) result = caseMotivationElement(businessPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.REGULATION: {
				Regulation regulation = (Regulation)theEObject;
				T result = caseRegulation(regulation);
				if (result == null) result = caseInfluencer(regulation);
				if (result == null) result = caseMotivationElement(regulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.VISION: {
				Vision vision = (Vision)theEObject;
				T result = caseVision(vision);
				if (result == null) result = caseEnd(vision);
				if (result == null) result = caseMotivationElement(vision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.DESIRED_RESULT: {
				DesiredResult desiredResult = (DesiredResult)theEObject;
				T result = caseDesiredResult(desiredResult);
				if (result == null) result = caseEnd(desiredResult);
				if (result == null) result = caseMotivationElement(desiredResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDesiredResult(goal);
				if (result == null) result = caseEnd(goal);
				if (result == null) result = caseMotivationElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = caseDesiredResult(objective);
				if (result == null) result = caseEnd(objective);
				if (result == null) result = caseMotivationElement(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.POTENTIAL_REWARD: {
				PotentialReward potentialReward = (PotentialReward)theEObject;
				T result = casePotentialReward(potentialReward);
				if (result == null) result = casePotentialImpact(potentialReward);
				if (result == null) result = caseMotivationElement(potentialReward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.RISK: {
				Risk risk = (Risk)theEObject;
				T result = caseRisk(risk);
				if (result == null) result = casePotentialImpact(risk);
				if (result == null) result = caseMotivationElement(risk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BMMPackage.BM_MMODEL: {
				BMMmodel bmMmodel = (BMMmodel)theEObject;
				T result = caseBMMmodel(bmMmodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivationElement(MotivationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessment(Assessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluencer(Influencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influencing Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influencing Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluencingOrganization(InfluencingOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Means</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Means</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeans(Means object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potential Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potential Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentialImpact(PotentialImpact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentCategory(AssessmentCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influencer Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influencer Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluencerCategory(InfluencerCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationCategory(OrganizationCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationUnit(OrganizationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessProcess(BusinessProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Liability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Liability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiability(Liability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course Of Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course Of Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseOfAction(CourseOfAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedAsset(FixedAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffering(Offering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirective(Directive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tactic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tactic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTactic(Tactic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessRule(BusinessRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessPolicy(BusinessPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulation(Regulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVision(Vision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desired Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desired Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesiredResult(DesiredResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potential Reward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potential Reward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotentialReward(PotentialReward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRisk(Risk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BM Mmodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BM Mmodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMMmodel(BMMmodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BMMSwitch
