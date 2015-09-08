/**
 */
package BMM.util;

import BMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see BMM.BMMPackage
 * @generated
 */
public class BMMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BMMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BMMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BMMSwitch<Adapter> modelSwitch =
		new BMMSwitch<Adapter>() {
			@Override
			public Adapter caseMotivationElement(MotivationElement object) {
				return createMotivationElementAdapter();
			}
			@Override
			public Adapter caseAssessment(Assessment object) {
				return createAssessmentAdapter();
			}
			@Override
			public Adapter caseEnd(End object) {
				return createEndAdapter();
			}
			@Override
			public Adapter caseInfluencer(Influencer object) {
				return createInfluencerAdapter();
			}
			@Override
			public Adapter caseInfluencingOrganization(InfluencingOrganization object) {
				return createInfluencingOrganizationAdapter();
			}
			@Override
			public Adapter caseMeans(Means object) {
				return createMeansAdapter();
			}
			@Override
			public Adapter casePotentialImpact(PotentialImpact object) {
				return createPotentialImpactAdapter();
			}
			@Override
			public Adapter caseAssessmentCategory(AssessmentCategory object) {
				return createAssessmentCategoryAdapter();
			}
			@Override
			public Adapter caseInfluencerCategory(InfluencerCategory object) {
				return createInfluencerCategoryAdapter();
			}
			@Override
			public Adapter caseOrganizationCategory(OrganizationCategory object) {
				return createOrganizationCategoryAdapter();
			}
			@Override
			public Adapter caseOrganizationUnit(OrganizationUnit object) {
				return createOrganizationUnitAdapter();
			}
			@Override
			public Adapter caseBusinessProcess(BusinessProcess object) {
				return createBusinessProcessAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseLiability(Liability object) {
				return createLiabilityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseCourseOfAction(CourseOfAction object) {
				return createCourseOfActionAdapter();
			}
			@Override
			public Adapter caseFixedAsset(FixedAsset object) {
				return createFixedAssetAdapter();
			}
			@Override
			public Adapter caseOffering(Offering object) {
				return createOfferingAdapter();
			}
			@Override
			public Adapter caseDirective(Directive object) {
				return createDirectiveAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseTactic(Tactic object) {
				return createTacticAdapter();
			}
			@Override
			public Adapter caseBusinessRule(BusinessRule object) {
				return createBusinessRuleAdapter();
			}
			@Override
			public Adapter caseBusinessPolicy(BusinessPolicy object) {
				return createBusinessPolicyAdapter();
			}
			@Override
			public Adapter caseRegulation(Regulation object) {
				return createRegulationAdapter();
			}
			@Override
			public Adapter caseVision(Vision object) {
				return createVisionAdapter();
			}
			@Override
			public Adapter caseDesiredResult(DesiredResult object) {
				return createDesiredResultAdapter();
			}
			@Override
			public Adapter caseGoal(Goal object) {
				return createGoalAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			@Override
			public Adapter casePotentialReward(PotentialReward object) {
				return createPotentialRewardAdapter();
			}
			@Override
			public Adapter caseRisk(Risk object) {
				return createRiskAdapter();
			}
			@Override
			public Adapter caseBMMmodel(BMMmodel object) {
				return createBMMmodelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link BMM.MotivationElement <em>Motivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.MotivationElement
	 * @generated
	 */
	public Adapter createMotivationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Assessment
	 * @generated
	 */
	public Adapter createAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Influencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Influencer
	 * @generated
	 */
	public Adapter createInfluencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.InfluencingOrganization <em>Influencing Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.InfluencingOrganization
	 * @generated
	 */
	public Adapter createInfluencingOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Means <em>Means</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Means
	 * @generated
	 */
	public Adapter createMeansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.PotentialImpact <em>Potential Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.PotentialImpact
	 * @generated
	 */
	public Adapter createPotentialImpactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.AssessmentCategory <em>Assessment Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.AssessmentCategory
	 * @generated
	 */
	public Adapter createAssessmentCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.InfluencerCategory <em>Influencer Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.InfluencerCategory
	 * @generated
	 */
	public Adapter createInfluencerCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.OrganizationCategory <em>Organization Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.OrganizationCategory
	 * @generated
	 */
	public Adapter createOrganizationCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.OrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.OrganizationUnit
	 * @generated
	 */
	public Adapter createOrganizationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.BusinessProcess
	 * @generated
	 */
	public Adapter createBusinessProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Liability <em>Liability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Liability
	 * @generated
	 */
	public Adapter createLiabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.CourseOfAction <em>Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.CourseOfAction
	 * @generated
	 */
	public Adapter createCourseOfActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.FixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.FixedAsset
	 * @generated
	 */
	public Adapter createFixedAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Offering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Offering
	 * @generated
	 */
	public Adapter createOfferingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Directive
	 * @generated
	 */
	public Adapter createDirectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Tactic
	 * @generated
	 */
	public Adapter createTacticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.BusinessRule
	 * @generated
	 */
	public Adapter createBusinessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.BusinessPolicy <em>Business Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.BusinessPolicy
	 * @generated
	 */
	public Adapter createBusinessPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Regulation
	 * @generated
	 */
	public Adapter createRegulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Vision <em>Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Vision
	 * @generated
	 */
	public Adapter createVisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.DesiredResult <em>Desired Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.DesiredResult
	 * @generated
	 */
	public Adapter createDesiredResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Goal
	 * @generated
	 */
	public Adapter createGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.PotentialReward <em>Potential Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.PotentialReward
	 * @generated
	 */
	public Adapter createPotentialRewardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.Risk
	 * @generated
	 */
	public Adapter createRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link BMM.BMMmodel <em>BM Mmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BMM.BMMmodel
	 * @generated
	 */
	public Adapter createBMMmodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BMMAdapterFactory
