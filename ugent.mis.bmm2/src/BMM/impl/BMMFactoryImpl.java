/**
 */
package BMM.impl;

import BMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BMMFactoryImpl extends EFactoryImpl implements BMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BMMFactory init() {
		try {
			BMMFactory theBMMFactory = (BMMFactory)EPackage.Registry.INSTANCE.getEFactory(BMMPackage.eNS_URI);
			if (theBMMFactory != null) {
				return theBMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BMMPackage.MOTIVATION_ELEMENT: return createMotivationElement();
			case BMMPackage.ASSESSMENT: return createAssessment();
			case BMMPackage.END: return createEnd();
			case BMMPackage.INFLUENCER: return createInfluencer();
			case BMMPackage.INFLUENCING_ORGANIZATION: return createInfluencingOrganization();
			case BMMPackage.MEANS: return createMeans();
			case BMMPackage.POTENTIAL_IMPACT: return createPotentialImpact();
			case BMMPackage.ASSESSMENT_CATEGORY: return createAssessmentCategory();
			case BMMPackage.INFLUENCER_CATEGORY: return createInfluencerCategory();
			case BMMPackage.ORGANIZATION_CATEGORY: return createOrganizationCategory();
			case BMMPackage.ORGANIZATION_UNIT: return createOrganizationUnit();
			case BMMPackage.BUSINESS_PROCESS: return createBusinessProcess();
			case BMMPackage.ASSET: return createAsset();
			case BMMPackage.LIABILITY: return createLiability();
			case BMMPackage.RESOURCE: return createResource();
			case BMMPackage.MISSION: return createMission();
			case BMMPackage.COURSE_OF_ACTION: return createCourseOfAction();
			case BMMPackage.FIXED_ASSET: return createFixedAsset();
			case BMMPackage.OFFERING: return createOffering();
			case BMMPackage.DIRECTIVE: return createDirective();
			case BMMPackage.STRATEGY: return createStrategy();
			case BMMPackage.TACTIC: return createTactic();
			case BMMPackage.BUSINESS_RULE: return createBusinessRule();
			case BMMPackage.BUSINESS_POLICY: return createBusinessPolicy();
			case BMMPackage.REGULATION: return createRegulation();
			case BMMPackage.VISION: return createVision();
			case BMMPackage.DESIRED_RESULT: return createDesiredResult();
			case BMMPackage.GOAL: return createGoal();
			case BMMPackage.OBJECTIVE: return createObjective();
			case BMMPackage.POTENTIAL_REWARD: return createPotentialReward();
			case BMMPackage.RISK: return createRisk();
			case BMMPackage.BM_MMODEL: return createBMMmodel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotivationElement createMotivationElement() {
		MotivationElementImpl motivationElement = new MotivationElementImpl();
		return motivationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Influencer createInfluencer() {
		InfluencerImpl influencer = new InfluencerImpl();
		return influencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluencingOrganization createInfluencingOrganization() {
		InfluencingOrganizationImpl influencingOrganization = new InfluencingOrganizationImpl();
		return influencingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Means createMeans() {
		MeansImpl means = new MeansImpl();
		return means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialImpact createPotentialImpact() {
		PotentialImpactImpl potentialImpact = new PotentialImpactImpl();
		return potentialImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentCategory createAssessmentCategory() {
		AssessmentCategoryImpl assessmentCategory = new AssessmentCategoryImpl();
		return assessmentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluencerCategory createInfluencerCategory() {
		InfluencerCategoryImpl influencerCategory = new InfluencerCategoryImpl();
		return influencerCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationCategory createOrganizationCategory() {
		OrganizationCategoryImpl organizationCategory = new OrganizationCategoryImpl();
		return organizationCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnit createOrganizationUnit() {
		OrganizationUnitImpl organizationUnit = new OrganizationUnitImpl();
		return organizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcess createBusinessProcess() {
		BusinessProcessImpl businessProcess = new BusinessProcessImpl();
		return businessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liability createLiability() {
		LiabilityImpl liability = new LiabilityImpl();
		return liability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseOfAction createCourseOfAction() {
		CourseOfActionImpl courseOfAction = new CourseOfActionImpl();
		return courseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset createFixedAsset() {
		FixedAssetImpl fixedAsset = new FixedAssetImpl();
		return fixedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offering createOffering() {
		OfferingImpl offering = new OfferingImpl();
		return offering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directive createDirective() {
		DirectiveImpl directive = new DirectiveImpl();
		return directive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tactic createTactic() {
		TacticImpl tactic = new TacticImpl();
		return tactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRule createBusinessRule() {
		BusinessRuleImpl businessRule = new BusinessRuleImpl();
		return businessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPolicy createBusinessPolicy() {
		BusinessPolicyImpl businessPolicy = new BusinessPolicyImpl();
		return businessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulation createRegulation() {
		RegulationImpl regulation = new RegulationImpl();
		return regulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision createVision() {
		VisionImpl vision = new VisionImpl();
		return vision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesiredResult createDesiredResult() {
		DesiredResultImpl desiredResult = new DesiredResultImpl();
		return desiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialReward createPotentialReward() {
		PotentialRewardImpl potentialReward = new PotentialRewardImpl();
		return potentialReward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Risk createRisk() {
		RiskImpl risk = new RiskImpl();
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMmodel createBMMmodel() {
		BMMmodelImpl bmMmodel = new BMMmodelImpl();
		return bmMmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMPackage getBMMPackage() {
		return (BMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BMMPackage getPackage() {
		return BMMPackage.eINSTANCE;
	}

} //BMMFactoryImpl
