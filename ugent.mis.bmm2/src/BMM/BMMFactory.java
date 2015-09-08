/**
 */
package BMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see BMM.BMMPackage
 * @generated
 */
public interface BMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BMMFactory eINSTANCE = BMM.impl.BMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Motivation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motivation Element</em>'.
	 * @generated
	 */
	MotivationElement createMotivationElement();

	/**
	 * Returns a new object of class '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment</em>'.
	 * @generated
	 */
	Assessment createAssessment();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Influencer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influencer</em>'.
	 * @generated
	 */
	Influencer createInfluencer();

	/**
	 * Returns a new object of class '<em>Influencing Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influencing Organization</em>'.
	 * @generated
	 */
	InfluencingOrganization createInfluencingOrganization();

	/**
	 * Returns a new object of class '<em>Means</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Means</em>'.
	 * @generated
	 */
	Means createMeans();

	/**
	 * Returns a new object of class '<em>Potential Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potential Impact</em>'.
	 * @generated
	 */
	PotentialImpact createPotentialImpact();

	/**
	 * Returns a new object of class '<em>Assessment Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessment Category</em>'.
	 * @generated
	 */
	AssessmentCategory createAssessmentCategory();

	/**
	 * Returns a new object of class '<em>Influencer Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influencer Category</em>'.
	 * @generated
	 */
	InfluencerCategory createInfluencerCategory();

	/**
	 * Returns a new object of class '<em>Organization Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Category</em>'.
	 * @generated
	 */
	OrganizationCategory createOrganizationCategory();

	/**
	 * Returns a new object of class '<em>Organization Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Unit</em>'.
	 * @generated
	 */
	OrganizationUnit createOrganizationUnit();

	/**
	 * Returns a new object of class '<em>Business Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Process</em>'.
	 * @generated
	 */
	BusinessProcess createBusinessProcess();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Liability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liability</em>'.
	 * @generated
	 */
	Liability createLiability();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Course Of Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Of Action</em>'.
	 * @generated
	 */
	CourseOfAction createCourseOfAction();

	/**
	 * Returns a new object of class '<em>Fixed Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Asset</em>'.
	 * @generated
	 */
	FixedAsset createFixedAsset();

	/**
	 * Returns a new object of class '<em>Offering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offering</em>'.
	 * @generated
	 */
	Offering createOffering();

	/**
	 * Returns a new object of class '<em>Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Directive</em>'.
	 * @generated
	 */
	Directive createDirective();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns a new object of class '<em>Tactic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tactic</em>'.
	 * @generated
	 */
	Tactic createTactic();

	/**
	 * Returns a new object of class '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Rule</em>'.
	 * @generated
	 */
	BusinessRule createBusinessRule();

	/**
	 * Returns a new object of class '<em>Business Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Policy</em>'.
	 * @generated
	 */
	BusinessPolicy createBusinessPolicy();

	/**
	 * Returns a new object of class '<em>Regulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regulation</em>'.
	 * @generated
	 */
	Regulation createRegulation();

	/**
	 * Returns a new object of class '<em>Vision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vision</em>'.
	 * @generated
	 */
	Vision createVision();

	/**
	 * Returns a new object of class '<em>Desired Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desired Result</em>'.
	 * @generated
	 */
	DesiredResult createDesiredResult();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective</em>'.
	 * @generated
	 */
	Objective createObjective();

	/**
	 * Returns a new object of class '<em>Potential Reward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potential Reward</em>'.
	 * @generated
	 */
	PotentialReward createPotentialReward();

	/**
	 * Returns a new object of class '<em>Risk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk</em>'.
	 * @generated
	 */
	Risk createRisk();

	/**
	 * Returns a new object of class '<em>BM Mmodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BM Mmodel</em>'.
	 * @generated
	 */
	BMMmodel createBMMmodel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BMMPackage getBMMPackage();

} //BMMFactory
