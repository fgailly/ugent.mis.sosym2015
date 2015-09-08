/**
 */
package BMM.impl;

import BMM.Assessment;
import BMM.AssessmentCategory;
import BMM.Asset;
import BMM.BMMFactory;
import BMM.BMMPackage;
import BMM.BMMmodel;
import BMM.BusinessPolicy;
import BMM.BusinessProcess;
import BMM.BusinessRule;
import BMM.CourseOfAction;
import BMM.DesiredResult;
import BMM.Directive;
import BMM.End;
import BMM.FixedAsset;
import BMM.Goal;
import BMM.Influencer;
import BMM.InfluencerCategory;
import BMM.InfluencingOrganization;
import BMM.Liability;
import BMM.Means;
import BMM.Mission;
import BMM.MotivationElement;
import BMM.Objective;
import BMM.Offering;
import BMM.OrganizationCategory;
import BMM.OrganizationUnit;
import BMM.PotentialImpact;
import BMM.PotentialReward;
import BMM.Regulation;
import BMM.Resource;
import BMM.Risk;
import BMM.Strategy;
import BMM.Tactic;
import BMM.Vision;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BMMPackageImpl extends EPackageImpl implements BMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motivationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influencerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influencingOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentialImpactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influencerCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseOfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tacticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desiredResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentialRewardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmMmodelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see BMM.BMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BMMPackageImpl() {
		super(eNS_URI, BMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BMMPackage init() {
		if (isInited) return (BMMPackage)EPackage.Registry.INSTANCE.getEPackage(BMMPackage.eNS_URI);

		// Obtain or create and register package
		BMMPackageImpl theBMMPackage = (BMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BMMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theBMMPackage.createPackageContents();

		// Initialize created meta-data
		theBMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BMMPackage.eNS_URI, theBMMPackage);
		return theBMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotivationElement() {
		return motivationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivationElement_Name() {
		return (EAttribute)motivationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotivationElement_Description() {
		return (EAttribute)motivationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessment() {
		return assessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_UsingAssessmentUsesUsedAssessment() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_AssessmentProvidesImpetusForDirective() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_AssessmentIdentifiesPotentialImpact() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessment_AssessmentJudgmentOfInfluencer() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluencer() {
		return influencerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluencingOrganization() {
		return influencingOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluencingOrganization_InfluencingOrganizationIsSourceOfInfluencer() {
		return (EReference)influencingOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeans() {
		return meansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentialImpact() {
		return potentialImpactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPotentialImpact_PotentialImpactProvidesImpetusForDirective() {
		return (EReference)potentialImpactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssessmentCategory() {
		return assessmentCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssessmentCategory_AssessmentCategoryCategoriesAssessment() {
		return (EReference)assessmentCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfluencerCategory() {
		return influencerCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfluencerCategory_InfluencerCategoryCategorizesInfluencer() {
		return (EReference)influencerCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationCategory() {
		return organizationCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationCategory_OrganizationCategoryCategorizesInfluencingOrganization() {
		return (EReference)organizationCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationUnit() {
		return organizationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitDefinesEnd() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitEstablishesMeans() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitIsResponsibleForAsset() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitIsResponsibleForLiability() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitRecognizesInfluencer() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitActAsInfluencingOrganization() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitMakesAssessment() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationUnit_OrganizationUnitIsResponsibleForBusinessProcess() {
		return (EReference)organizationUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcess() {
		return businessProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_BusinessProcessRealizesCourseOfAction() {
		return (EReference)businessProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_BusinessProcessManagerAsset() {
		return (EReference)businessProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcess_BusinessProcessDeliversOfeering() {
		return (EReference)businessProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiability() {
		return liabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiability_LiabilityClaimsResource() {
		return (EReference)liabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_MissionMakesOperativeVision() {
		return (EReference)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseOfAction() {
		return courseOfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseOfAction_EnablingCourseofActionEnablesEnabledCourseOfAction() {
		return (EReference)courseOfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseOfAction_BroaderCourseofActionIncludesMoreSpecificCourseOfAction() {
		return (EReference)courseOfActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseOfAction_CourseOfActionChanneIsEffortsTowardsDesiredResult() {
		return (EReference)courseOfActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseOfAction_CourseOfActionDeployAsset() {
		return (EReference)courseOfActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseOfAction_CourseOfActionDefiensOffering() {
		return (EReference)courseOfActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedAsset() {
		return fixedAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedAsset_FixedAssetProvidesResource() {
		return (EReference)fixedAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffering() {
		return offeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffering_OfferingRequiresResource() {
		return (EReference)offeringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOffering_OfferingUsesFixedAsset() {
		return (EReference)offeringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirective() {
		return directiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_DirectiveGovernsCourseOfAction() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_DirectiveIsSourceOfCourseOfAction() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_DirectiveActAsRegulation() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_DirectiveSupportsAchievementOfDesiredResult() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirective_DirectiveGovernsUseOfAsset() {
		return (EReference)directiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyIsAComponentOfThePlanForMission() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyDeterminesOrganizationUnit() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTactic() {
		return tacticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTactic_TacticImplementsStrategy() {
		return (EReference)tacticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTactic_TacticEffectsEnforcementLevelOfBusinessRule() {
		return (EReference)tacticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRule() {
		return businessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRule_BusinessRuleGuidesBusinessProcess() {
		return (EReference)businessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessPolicy() {
		return businessPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPolicy_BusinessPolicyIsBasisForBusinessRule() {
		return (EReference)businessPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPolicy_BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy() {
		return (EReference)businessPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPolicy_BusinessPolicyGovernsBusinessProcess() {
		return (EReference)businessPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegulation() {
		return regulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVision() {
		return visionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesiredResult() {
		return desiredResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesiredResult_BroaderDesiredResultIncludesMoreSpecificDesiredResult() {
		return (EReference)desiredResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_GoalAmplifiesVision() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_ObjectiveQuantifiesGoal() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentialReward() {
		return potentialRewardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRisk() {
		return riskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBMMmodel() {
		return bmMmodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBMMmodel_Contains() {
		return (EReference)bmMmodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBMMmodel_Name() {
		return (EAttribute)bmMmodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBMMmodel_OntologyNS() {
		return (EAttribute)bmMmodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBMMmodel_OntologyURI() {
		return (EAttribute)bmMmodelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMMFactory getBMMFactory() {
		return (BMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		motivationElementEClass = createEClass(MOTIVATION_ELEMENT);
		createEAttribute(motivationElementEClass, MOTIVATION_ELEMENT__NAME);
		createEAttribute(motivationElementEClass, MOTIVATION_ELEMENT__DESCRIPTION);

		assessmentEClass = createEClass(ASSESSMENT);
		createEReference(assessmentEClass, ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT);
		createEReference(assessmentEClass, ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE);
		createEReference(assessmentEClass, ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT);
		createEReference(assessmentEClass, ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER);

		endEClass = createEClass(END);

		influencerEClass = createEClass(INFLUENCER);

		influencingOrganizationEClass = createEClass(INFLUENCING_ORGANIZATION);
		createEReference(influencingOrganizationEClass, INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER);

		meansEClass = createEClass(MEANS);

		potentialImpactEClass = createEClass(POTENTIAL_IMPACT);
		createEReference(potentialImpactEClass, POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE);

		assessmentCategoryEClass = createEClass(ASSESSMENT_CATEGORY);
		createEReference(assessmentCategoryEClass, ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT);

		influencerCategoryEClass = createEClass(INFLUENCER_CATEGORY);
		createEReference(influencerCategoryEClass, INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER);

		organizationCategoryEClass = createEClass(ORGANIZATION_CATEGORY);
		createEReference(organizationCategoryEClass, ORGANIZATION_CATEGORY__ORGANIZATION_CATEGORY_CATEGORIZES_INFLUENCING_ORGANIZATION);

		organizationUnitEClass = createEClass(ORGANIZATION_UNIT);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT);
		createEReference(organizationUnitEClass, ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS);

		businessProcessEClass = createEClass(BUSINESS_PROCESS);
		createEReference(businessProcessEClass, BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION);
		createEReference(businessProcessEClass, BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET);
		createEReference(businessProcessEClass, BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING);

		assetEClass = createEClass(ASSET);

		liabilityEClass = createEClass(LIABILITY);
		createEReference(liabilityEClass, LIABILITY__LIABILITY_CLAIMS_RESOURCE);

		resourceEClass = createEClass(RESOURCE);

		missionEClass = createEClass(MISSION);
		createEReference(missionEClass, MISSION__MISSION_MAKES_OPERATIVE_VISION);

		courseOfActionEClass = createEClass(COURSE_OF_ACTION);
		createEReference(courseOfActionEClass, COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION);
		createEReference(courseOfActionEClass, COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION);
		createEReference(courseOfActionEClass, COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT);
		createEReference(courseOfActionEClass, COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET);
		createEReference(courseOfActionEClass, COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING);

		fixedAssetEClass = createEClass(FIXED_ASSET);
		createEReference(fixedAssetEClass, FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE);

		offeringEClass = createEClass(OFFERING);
		createEReference(offeringEClass, OFFERING__OFFERING_REQUIRES_RESOURCE);
		createEReference(offeringEClass, OFFERING__OFFERING_USES_FIXED_ASSET);

		directiveEClass = createEClass(DIRECTIVE);
		createEReference(directiveEClass, DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION);
		createEReference(directiveEClass, DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION);
		createEReference(directiveEClass, DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION);
		createEReference(directiveEClass, DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT);
		createEReference(directiveEClass, DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION);
		createEReference(strategyEClass, STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT);

		tacticEClass = createEClass(TACTIC);
		createEReference(tacticEClass, TACTIC__TACTIC_IMPLEMENTS_STRATEGY);
		createEReference(tacticEClass, TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE);

		businessRuleEClass = createEClass(BUSINESS_RULE);
		createEReference(businessRuleEClass, BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS);

		businessPolicyEClass = createEClass(BUSINESS_POLICY);
		createEReference(businessPolicyEClass, BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE);
		createEReference(businessPolicyEClass, BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY);
		createEReference(businessPolicyEClass, BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS);

		regulationEClass = createEClass(REGULATION);

		visionEClass = createEClass(VISION);

		desiredResultEClass = createEClass(DESIRED_RESULT);
		createEReference(desiredResultEClass, DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__GOAL_AMPLIFIES_VISION);

		objectiveEClass = createEClass(OBJECTIVE);
		createEReference(objectiveEClass, OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL);

		potentialRewardEClass = createEClass(POTENTIAL_REWARD);

		riskEClass = createEClass(RISK);

		bmMmodelEClass = createEClass(BM_MMODEL);
		createEReference(bmMmodelEClass, BM_MMODEL__CONTAINS);
		createEAttribute(bmMmodelEClass, BM_MMODEL__NAME);
		createEAttribute(bmMmodelEClass, BM_MMODEL__ONTOLOGY_NS);
		createEAttribute(bmMmodelEClass, BM_MMODEL__ONTOLOGY_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assessmentEClass.getESuperTypes().add(this.getMotivationElement());
		endEClass.getESuperTypes().add(this.getMotivationElement());
		influencerEClass.getESuperTypes().add(this.getMotivationElement());
		influencingOrganizationEClass.getESuperTypes().add(this.getMotivationElement());
		meansEClass.getESuperTypes().add(this.getMotivationElement());
		potentialImpactEClass.getESuperTypes().add(this.getMotivationElement());
		assessmentCategoryEClass.getESuperTypes().add(this.getMotivationElement());
		influencerCategoryEClass.getESuperTypes().add(this.getMotivationElement());
		organizationCategoryEClass.getESuperTypes().add(this.getMotivationElement());
		organizationUnitEClass.getESuperTypes().add(this.getMotivationElement());
		businessProcessEClass.getESuperTypes().add(this.getMotivationElement());
		assetEClass.getESuperTypes().add(this.getMotivationElement());
		liabilityEClass.getESuperTypes().add(this.getMotivationElement());
		resourceEClass.getESuperTypes().add(this.getAsset());
		missionEClass.getESuperTypes().add(this.getMeans());
		courseOfActionEClass.getESuperTypes().add(this.getMeans());
		fixedAssetEClass.getESuperTypes().add(this.getAsset());
		offeringEClass.getESuperTypes().add(this.getFixedAsset());
		directiveEClass.getESuperTypes().add(this.getMeans());
		strategyEClass.getESuperTypes().add(this.getCourseOfAction());
		tacticEClass.getESuperTypes().add(this.getCourseOfAction());
		businessRuleEClass.getESuperTypes().add(this.getDirective());
		businessPolicyEClass.getESuperTypes().add(this.getDirective());
		regulationEClass.getESuperTypes().add(this.getInfluencer());
		visionEClass.getESuperTypes().add(this.getEnd());
		desiredResultEClass.getESuperTypes().add(this.getEnd());
		goalEClass.getESuperTypes().add(this.getDesiredResult());
		objectiveEClass.getESuperTypes().add(this.getDesiredResult());
		potentialRewardEClass.getESuperTypes().add(this.getPotentialImpact());
		riskEClass.getESuperTypes().add(this.getPotentialImpact());

		// Initialize classes, features, and operations; add parameters
		initEClass(motivationElementEClass, MotivationElement.class, "MotivationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotivationElement_Name(), ecorePackage.getEString(), "name", "", 1, 1, MotivationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMotivationElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, MotivationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssessment_UsingAssessmentUsesUsedAssessment(), this.getAssessment(), null, "usingAssessmentUsesUsedAssessment", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssessment_AssessmentProvidesImpetusForDirective(), this.getDirective(), null, "assessmentProvidesImpetusForDirective", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssessment_AssessmentIdentifiesPotentialImpact(), this.getPotentialImpact(), null, "assessmentIdentifiesPotentialImpact", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssessment_AssessmentJudgmentOfInfluencer(), this.getInfluencer(), null, "assessmentJudgmentOfInfluencer", null, 1, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influencerEClass, Influencer.class, "Influencer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(influencingOrganizationEClass, InfluencingOrganization.class, "InfluencingOrganization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluencingOrganization_InfluencingOrganizationIsSourceOfInfluencer(), this.getInfluencer(), null, "influencingOrganizationIsSourceOfInfluencer", null, 0, -1, InfluencingOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(meansEClass, Means.class, "Means", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(potentialImpactEClass, PotentialImpact.class, "PotentialImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPotentialImpact_PotentialImpactProvidesImpetusForDirective(), this.getDirective(), null, "potentialImpactProvidesImpetusForDirective", null, 0, -1, PotentialImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assessmentCategoryEClass, AssessmentCategory.class, "AssessmentCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssessmentCategory_AssessmentCategoryCategoriesAssessment(), this.getAssessment(), null, "assessmentCategoryCategoriesAssessment", null, 0, -1, AssessmentCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(influencerCategoryEClass, InfluencerCategory.class, "InfluencerCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluencerCategory_InfluencerCategoryCategorizesInfluencer(), this.getInfluencer(), null, "influencerCategoryCategorizesInfluencer", null, 0, -1, InfluencerCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(organizationCategoryEClass, OrganizationCategory.class, "OrganizationCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationCategory_OrganizationCategoryCategorizesInfluencingOrganization(), this.getInfluencingOrganization(), null, "organizationCategoryCategorizesInfluencingOrganization", null, 0, -1, OrganizationCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(organizationUnitEClass, OrganizationUnit.class, "OrganizationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationUnit_OrganizationUnitDefinesEnd(), this.getEnd(), null, "organizationUnitDefinesEnd", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitEstablishesMeans(), this.getMeans(), null, "organizationUnitEstablishesMeans", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitIsResponsibleForAsset(), this.getAsset(), null, "organizationUnitIsResponsibleForAsset", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitIsResponsibleForLiability(), this.getLiability(), null, "organizationUnitIsResponsibleForLiability", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitRecognizesInfluencer(), this.getInfluencer(), null, "organizationUnitRecognizesInfluencer", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitActAsInfluencingOrganization(), this.getInfluencingOrganization(), null, "organizationUnitActAsInfluencingOrganization", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitMakesAssessment(), this.getAssessment(), null, "organizationUnitMakesAssessment", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrganizationUnit_OrganizationUnitIsResponsibleForBusinessProcess(), this.getBusinessProcess(), null, "organizationUnitIsResponsibleForBusinessProcess", null, 0, -1, OrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessProcessEClass, BusinessProcess.class, "BusinessProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcess_BusinessProcessRealizesCourseOfAction(), this.getCourseOfAction(), null, "businessProcessRealizesCourseOfAction", null, 0, -1, BusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessProcess_BusinessProcessManagerAsset(), this.getAsset(), null, "businessProcessManagerAsset", null, 0, -1, BusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessProcess_BusinessProcessDeliversOfeering(), this.getOffering(), null, "businessProcessDeliversOfeering", null, 0, -1, BusinessProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liabilityEClass, Liability.class, "Liability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiability_LiabilityClaimsResource(), this.getResource(), null, "liabilityClaimsResource", null, 0, -1, Liability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMission_MissionMakesOperativeVision(), this.getVision(), null, "missionMakesOperativeVision", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(courseOfActionEClass, CourseOfAction.class, "CourseOfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseOfAction_EnablingCourseofActionEnablesEnabledCourseOfAction(), this.getCourseOfAction(), null, "enablingCourseofActionEnablesEnabledCourseOfAction", null, 0, -1, CourseOfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCourseOfAction_BroaderCourseofActionIncludesMoreSpecificCourseOfAction(), this.getCourseOfAction(), null, "broaderCourseofActionIncludesMoreSpecificCourseOfAction", null, 0, -1, CourseOfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCourseOfAction_CourseOfActionChanneIsEffortsTowardsDesiredResult(), this.getDesiredResult(), null, "courseOfActionChanneIsEffortsTowardsDesiredResult", null, 0, 1, CourseOfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCourseOfAction_CourseOfActionDeployAsset(), this.getAsset(), null, "courseOfActionDeployAsset", null, 0, -1, CourseOfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCourseOfAction_CourseOfActionDefiensOffering(), this.getOffering(), null, "courseOfActionDefiensOffering", null, 0, -1, CourseOfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fixedAssetEClass, FixedAsset.class, "FixedAsset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedAsset_FixedAssetProvidesResource(), this.getResource(), null, "fixedAssetProvidesResource", null, 0, -1, FixedAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(offeringEClass, Offering.class, "Offering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOffering_OfferingRequiresResource(), this.getResource(), null, "offeringRequiresResource", null, 0, -1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOffering_OfferingUsesFixedAsset(), this.getFixedAsset(), null, "offeringUsesFixedAsset", null, 0, -1, Offering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directiveEClass, Directive.class, "Directive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirective_DirectiveGovernsCourseOfAction(), this.getCourseOfAction(), null, "directiveGovernsCourseOfAction", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDirective_DirectiveIsSourceOfCourseOfAction(), this.getCourseOfAction(), null, "directiveIsSourceOfCourseOfAction", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDirective_DirectiveActAsRegulation(), this.getRegulation(), null, "directiveActAsRegulation", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDirective_DirectiveSupportsAchievementOfDesiredResult(), this.getDesiredResult(), null, "directiveSupportsAchievementOfDesiredResult", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDirective_DirectiveGovernsUseOfAsset(), this.getAsset(), null, "directiveGovernsUseOfAsset", null, 0, -1, Directive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategy_StrategyIsAComponentOfThePlanForMission(), this.getMission(), null, "strategyIsAComponentOfThePlanForMission", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStrategy_StrategyDeterminesOrganizationUnit(), this.getOrganizationUnit(), null, "strategyDeterminesOrganizationUnit", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tacticEClass, Tactic.class, "Tactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTactic_TacticImplementsStrategy(), this.getStrategy(), null, "tacticImplementsStrategy", null, 0, -1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTactic_TacticEffectsEnforcementLevelOfBusinessRule(), this.getBusinessRule(), null, "tacticEffectsEnforcementLevelOfBusinessRule", null, 0, -1, Tactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessRuleEClass, BusinessRule.class, "BusinessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessRule_BusinessRuleGuidesBusinessProcess(), this.getBusinessProcess(), null, "businessRuleGuidesBusinessProcess", null, 0, -1, BusinessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(businessPolicyEClass, BusinessPolicy.class, "BusinessPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessPolicy_BusinessPolicyIsBasisForBusinessRule(), this.getBusinessRule(), null, "businessPolicyIsBasisForBusinessRule", null, 0, -1, BusinessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessPolicy_BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy(), this.getBusinessPolicy(), null, "broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy", null, 0, -1, BusinessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBusinessPolicy_BusinessPolicyGovernsBusinessProcess(), this.getBusinessProcess(), null, "businessPolicyGovernsBusinessProcess", null, 0, -1, BusinessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(regulationEClass, Regulation.class, "Regulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visionEClass, Vision.class, "Vision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desiredResultEClass, DesiredResult.class, "DesiredResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesiredResult_BroaderDesiredResultIncludesMoreSpecificDesiredResult(), this.getDesiredResult(), null, "broaderDesiredResultIncludesMoreSpecificDesiredResult", null, 0, -1, DesiredResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_GoalAmplifiesVision(), this.getVision(), null, "goalAmplifiesVision", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjective_ObjectiveQuantifiesGoal(), this.getGoal(), null, "objectiveQuantifiesGoal", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(potentialRewardEClass, PotentialReward.class, "PotentialReward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(riskEClass, Risk.class, "Risk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bmMmodelEClass, BMMmodel.class, "BMMmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBMMmodel_Contains(), this.getMotivationElement(), null, "contains", null, 0, -1, BMMmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBMMmodel_Name(), ecorePackage.getEString(), "name", null, 0, 1, BMMmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBMMmodel_OntologyNS(), ecorePackage.getEString(), "ontologyNS", null, 0, 1, BMMmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBMMmodel_OntologyURI(), ecorePackage.getEString(), "ontologyURI", null, 0, 1, BMMmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BMMPackageImpl
