/**
 */
package BMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see BMM.BMMFactory
 * @model kind="package"
 * @generated
 */
public interface BMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mis.ugent.be/bmm_eml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ugent.mis.bmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BMMPackage eINSTANCE = BMM.impl.BMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link BMM.impl.MotivationElementImpl <em>Motivation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.MotivationElementImpl
	 * @see BMM.impl.BMMPackageImpl#getMotivationElement()
	 * @generated
	 */
	int MOTIVATION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Motivation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Motivation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link BMM.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.AssessmentImpl
	 * @see BMM.impl.BMMPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Using Assessment Uses Used Assessment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessment Provides Impetus For Directive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assessment Identifies Potential Impact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT = MOTIVATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assessment Judgment Of Influencer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER = MOTIVATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.EndImpl
	 * @see BMM.impl.BMMPackageImpl#getEnd()
	 * @generated
	 */
	int END = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.InfluencerImpl <em>Influencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.InfluencerImpl
	 * @see BMM.impl.BMMPackageImpl#getInfluencer()
	 * @generated
	 */
	int INFLUENCER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Influencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Influencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.InfluencingOrganizationImpl <em>Influencing Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.InfluencingOrganizationImpl
	 * @see BMM.impl.BMMPackageImpl#getInfluencingOrganization()
	 * @generated
	 */
	int INFLUENCING_ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCING_ORGANIZATION__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCING_ORGANIZATION__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Influencing Organization Is Source Of Influencer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Influencing Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCING_ORGANIZATION_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Influencing Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCING_ORGANIZATION_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.MeansImpl <em>Means</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.MeansImpl
	 * @see BMM.impl.BMMPackageImpl#getMeans()
	 * @generated
	 */
	int MEANS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Means</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Means</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.PotentialImpactImpl <em>Potential Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.PotentialImpactImpl
	 * @see BMM.impl.BMMPackageImpl#getPotentialImpact()
	 * @generated
	 */
	int POTENTIAL_IMPACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_IMPACT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_IMPACT__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Potential Impact Provides Impetus For Directive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potential Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_IMPACT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Potential Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_IMPACT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.AssessmentCategoryImpl <em>Assessment Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.AssessmentCategoryImpl
	 * @see BMM.impl.BMMPackageImpl#getAssessmentCategory()
	 * @generated
	 */
	int ASSESSMENT_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_CATEGORY__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_CATEGORY__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Assessment Category Categories Assessment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assessment Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_CATEGORY_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assessment Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_CATEGORY_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.InfluencerCategoryImpl <em>Influencer Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.InfluencerCategoryImpl
	 * @see BMM.impl.BMMPackageImpl#getInfluencerCategory()
	 * @generated
	 */
	int INFLUENCER_CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_CATEGORY__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_CATEGORY__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Influencer Category Categorizes Influencer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Influencer Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_CATEGORY_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Influencer Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCER_CATEGORY_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.OrganizationCategoryImpl <em>Organization Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.OrganizationCategoryImpl
	 * @see BMM.impl.BMMPackageImpl#getOrganizationCategory()
	 * @generated
	 */
	int ORGANIZATION_CATEGORY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CATEGORY__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CATEGORY__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Organization Category Categorizes Influencing Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CATEGORY__ORGANIZATION_CATEGORY_CATEGORIZES_INFLUENCING_ORGANIZATION = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organization Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CATEGORY_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Organization Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CATEGORY_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.OrganizationUnitImpl <em>Organization Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.OrganizationUnitImpl
	 * @see BMM.impl.BMMPackageImpl#getOrganizationUnit()
	 * @generated
	 */
	int ORGANIZATION_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Organization Unit Defines End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Unit Establishes Means</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organization Unit Is Responsible For Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET = MOTIVATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization Unit Is Responsible For Liability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY = MOTIVATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organization Unit Recognizes Influencer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER = MOTIVATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Unit Act As Influencing Organization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION = MOTIVATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Organization Unit Makes Assessment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT = MOTIVATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Organization Unit Is Responsible For Business Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS = MOTIVATION_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Organization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Organization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_UNIT_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.BusinessProcessImpl <em>Business Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.BusinessProcessImpl
	 * @see BMM.impl.BMMPackageImpl#getBusinessProcess()
	 * @generated
	 */
	int BUSINESS_PROCESS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Business Process Realizes Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Process Manager Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Process Delivers Ofeering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING = MOTIVATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Business Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.AssetImpl
	 * @see BMM.impl.BMMPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.LiabilityImpl <em>Liability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.LiabilityImpl
	 * @see BMM.impl.BMMPackageImpl#getLiability()
	 * @generated
	 */
	int LIABILITY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIABILITY__NAME = MOTIVATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIABILITY__DESCRIPTION = MOTIVATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Liability Claims Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIABILITY__LIABILITY_CLAIMS_RESOURCE = MOTIVATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Liability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIABILITY_FEATURE_COUNT = MOTIVATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Liability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIABILITY_OPERATION_COUNT = MOTIVATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.ResourceImpl
	 * @see BMM.impl.BMMPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.MissionImpl
	 * @see BMM.impl.BMMPackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__NAME = MEANS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__DESCRIPTION = MEANS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mission Makes Operative Vision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__MISSION_MAKES_OPERATIVE_VISION = MEANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = MEANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = MEANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.CourseOfActionImpl <em>Course Of Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.CourseOfActionImpl
	 * @see BMM.impl.BMMPackageImpl#getCourseOfAction()
	 * @generated
	 */
	int COURSE_OF_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__NAME = MEANS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__DESCRIPTION = MEANS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabling Courseof Action Enables Enabled Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION = MEANS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Broader Courseof Action Includes More Specific Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION = MEANS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Course Of Action Channe Is Efforts Towards Desired Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT = MEANS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Course Of Action Deploy Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET = MEANS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Course Of Action Defiens Offering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING = MEANS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Course Of Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION_FEATURE_COUNT = MEANS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Course Of Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_ACTION_OPERATION_COUNT = MEANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.FixedAssetImpl <em>Fixed Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.FixedAssetImpl
	 * @see BMM.impl.BMMPackageImpl#getFixedAsset()
	 * @generated
	 */
	int FIXED_ASSET = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fixed Asset Provides Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.OfferingImpl <em>Offering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.OfferingImpl
	 * @see BMM.impl.BMMPackageImpl#getOffering()
	 * @generated
	 */
	int OFFERING = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__NAME = FIXED_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__DESCRIPTION = FIXED_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fixed Asset Provides Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__FIXED_ASSET_PROVIDES_RESOURCE = FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE;

	/**
	 * The feature id for the '<em><b>Offering Requires Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__OFFERING_REQUIRES_RESOURCE = FIXED_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offering Uses Fixed Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING__OFFERING_USES_FIXED_ASSET = FIXED_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_FEATURE_COUNT = FIXED_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Offering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERING_OPERATION_COUNT = FIXED_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.DirectiveImpl <em>Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.DirectiveImpl
	 * @see BMM.impl.BMMPackageImpl#getDirective()
	 * @generated
	 */
	int DIRECTIVE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__NAME = MEANS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DESCRIPTION = MEANS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Directive Governs Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION = MEANS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directive Is Source Of Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION = MEANS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Directive Act As Regulation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION = MEANS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Directive Supports Achievement Of Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT = MEANS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Directive Governs Use Of Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET = MEANS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_FEATURE_COUNT = MEANS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTIVE_OPERATION_COUNT = MEANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.StrategyImpl
	 * @see BMM.impl.BMMPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__NAME = COURSE_OF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = COURSE_OF_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabling Courseof Action Enables Enabled Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION = COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Broader Courseof Action Includes More Specific Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION = COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Course Of Action Channe Is Efforts Towards Desired Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT = COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Course Of Action Deploy Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__COURSE_OF_ACTION_DEPLOY_ASSET = COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET;

	/**
	 * The feature id for the '<em><b>Course Of Action Defiens Offering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__COURSE_OF_ACTION_DEFIENS_OFFERING = COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING;

	/**
	 * The feature id for the '<em><b>Strategy Is AComponent Of The Plan For Mission</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION = COURSE_OF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Determines Organization Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT = COURSE_OF_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = COURSE_OF_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = COURSE_OF_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.TacticImpl <em>Tactic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.TacticImpl
	 * @see BMM.impl.BMMPackageImpl#getTactic()
	 * @generated
	 */
	int TACTIC = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__NAME = COURSE_OF_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__DESCRIPTION = COURSE_OF_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabling Courseof Action Enables Enabled Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION = COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Broader Courseof Action Includes More Specific Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION = COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Course Of Action Channe Is Efforts Towards Desired Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT = COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Course Of Action Deploy Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__COURSE_OF_ACTION_DEPLOY_ASSET = COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET;

	/**
	 * The feature id for the '<em><b>Course Of Action Defiens Offering</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__COURSE_OF_ACTION_DEFIENS_OFFERING = COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING;

	/**
	 * The feature id for the '<em><b>Tactic Implements Strategy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__TACTIC_IMPLEMENTS_STRATEGY = COURSE_OF_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tactic Effects Enforcement Level Of Business Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE = COURSE_OF_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_FEATURE_COUNT = COURSE_OF_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tactic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIC_OPERATION_COUNT = COURSE_OF_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.BusinessRuleImpl
	 * @see BMM.impl.BMMPackageImpl#getBusinessRule()
	 * @generated
	 */
	int BUSINESS_RULE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__NAME = DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DESCRIPTION = DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Directive Governs Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION = DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Directive Is Source Of Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION = DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Directive Act As Regulation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DIRECTIVE_ACT_AS_REGULATION = DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION;

	/**
	 * The feature id for the '<em><b>Directive Supports Achievement Of Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT = DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Directive Governs Use Of Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__DIRECTIVE_GOVERNS_USE_OF_ASSET = DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET;

	/**
	 * The feature id for the '<em><b>Business Rule Guides Business Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.BusinessPolicyImpl <em>Business Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.BusinessPolicyImpl
	 * @see BMM.impl.BMMPackageImpl#getBusinessPolicy()
	 * @generated
	 */
	int BUSINESS_POLICY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__NAME = DIRECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DESCRIPTION = DIRECTIVE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Directive Governs Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DIRECTIVE_GOVERNS_COURSE_OF_ACTION = DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Directive Is Source Of Course Of Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION = DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION;

	/**
	 * The feature id for the '<em><b>Directive Act As Regulation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DIRECTIVE_ACT_AS_REGULATION = DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION;

	/**
	 * The feature id for the '<em><b>Directive Supports Achievement Of Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT = DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Directive Governs Use Of Asset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__DIRECTIVE_GOVERNS_USE_OF_ASSET = DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET;

	/**
	 * The feature id for the '<em><b>Business Policy Is Basis For Business Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE = DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Broader Business Policy Includes More Specific Business Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY = DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Policy Governs Business Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS = DIRECTIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Business Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_FEATURE_COUNT = DIRECTIVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Business Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_OPERATION_COUNT = DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.RegulationImpl <em>Regulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.RegulationImpl
	 * @see BMM.impl.BMMPackageImpl#getRegulation()
	 * @generated
	 */
	int REGULATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__NAME = INFLUENCER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION__DESCRIPTION = INFLUENCER__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_FEATURE_COUNT = INFLUENCER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATION_OPERATION_COUNT = INFLUENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.VisionImpl <em>Vision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.VisionImpl
	 * @see BMM.impl.BMMPackageImpl#getVision()
	 * @generated
	 */
	int VISION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION__NAME = END__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION__DESCRIPTION = END__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Vision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_FEATURE_COUNT = END_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISION_OPERATION_COUNT = END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.DesiredResultImpl <em>Desired Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.DesiredResultImpl
	 * @see BMM.impl.BMMPackageImpl#getDesiredResult()
	 * @generated
	 */
	int DESIRED_RESULT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_RESULT__NAME = END__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_RESULT__DESCRIPTION = END__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Broader Desired Result Includes More Specific Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT = END_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Desired Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_RESULT_FEATURE_COUNT = END_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Desired Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIRED_RESULT_OPERATION_COUNT = END_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.GoalImpl
	 * @see BMM.impl.BMMPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = DESIRED_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = DESIRED_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Broader Desired Result Includes More Specific Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT = DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Goal Amplifies Vision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_AMPLIFIES_VISION = DESIRED_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = DESIRED_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = DESIRED_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.ObjectiveImpl
	 * @see BMM.impl.BMMPackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = DESIRED_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__DESCRIPTION = DESIRED_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Broader Desired Result Includes More Specific Desired Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT = DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT;

	/**
	 * The feature id for the '<em><b>Objective Quantifies Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL = DESIRED_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = DESIRED_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_OPERATION_COUNT = DESIRED_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.PotentialRewardImpl <em>Potential Reward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.PotentialRewardImpl
	 * @see BMM.impl.BMMPackageImpl#getPotentialReward()
	 * @generated
	 */
	int POTENTIAL_REWARD = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_REWARD__NAME = POTENTIAL_IMPACT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_REWARD__DESCRIPTION = POTENTIAL_IMPACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Potential Impact Provides Impetus For Directive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_REWARD__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE = POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE;

	/**
	 * The number of structural features of the '<em>Potential Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_REWARD_FEATURE_COUNT = POTENTIAL_IMPACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Potential Reward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_REWARD_OPERATION_COUNT = POTENTIAL_IMPACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.RiskImpl <em>Risk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.RiskImpl
	 * @see BMM.impl.BMMPackageImpl#getRisk()
	 * @generated
	 */
	int RISK = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__NAME = POTENTIAL_IMPACT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__DESCRIPTION = POTENTIAL_IMPACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Potential Impact Provides Impetus For Directive</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE = POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE;

	/**
	 * The number of structural features of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_FEATURE_COUNT = POTENTIAL_IMPACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Risk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_OPERATION_COUNT = POTENTIAL_IMPACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link BMM.impl.BMMmodelImpl <em>BM Mmodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see BMM.impl.BMMmodelImpl
	 * @see BMM.impl.BMMPackageImpl#getBMMmodel()
	 * @generated
	 */
	int BM_MMODEL = 31;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL__ONTOLOGY_NS = 2;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL__ONTOLOGY_URI = 3;

	/**
	 * The number of structural features of the '<em>BM Mmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BM Mmodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BM_MMODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link BMM.MotivationElement <em>Motivation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motivation Element</em>'.
	 * @see BMM.MotivationElement
	 * @generated
	 */
	EClass getMotivationElement();

	/**
	 * Returns the meta object for the attribute '{@link BMM.MotivationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BMM.MotivationElement#getName()
	 * @see #getMotivationElement()
	 * @generated
	 */
	EAttribute getMotivationElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link BMM.MotivationElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see BMM.MotivationElement#getDescription()
	 * @see #getMotivationElement()
	 * @generated
	 */
	EAttribute getMotivationElement_Description();

	/**
	 * Returns the meta object for class '{@link BMM.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see BMM.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Assessment#getUsingAssessmentUsesUsedAssessment <em>Using Assessment Uses Used Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Using Assessment Uses Used Assessment</em>'.
	 * @see BMM.Assessment#getUsingAssessmentUsesUsedAssessment()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_UsingAssessmentUsesUsedAssessment();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Assessment#getAssessmentProvidesImpetusForDirective <em>Assessment Provides Impetus For Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assessment Provides Impetus For Directive</em>'.
	 * @see BMM.Assessment#getAssessmentProvidesImpetusForDirective()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_AssessmentProvidesImpetusForDirective();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Assessment#getAssessmentIdentifiesPotentialImpact <em>Assessment Identifies Potential Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assessment Identifies Potential Impact</em>'.
	 * @see BMM.Assessment#getAssessmentIdentifiesPotentialImpact()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_AssessmentIdentifiesPotentialImpact();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Assessment#getAssessmentJudgmentOfInfluencer <em>Assessment Judgment Of Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assessment Judgment Of Influencer</em>'.
	 * @see BMM.Assessment#getAssessmentJudgmentOfInfluencer()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_AssessmentJudgmentOfInfluencer();

	/**
	 * Returns the meta object for class '{@link BMM.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see BMM.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link BMM.Influencer <em>Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influencer</em>'.
	 * @see BMM.Influencer
	 * @generated
	 */
	EClass getInfluencer();

	/**
	 * Returns the meta object for class '{@link BMM.InfluencingOrganization <em>Influencing Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influencing Organization</em>'.
	 * @see BMM.InfluencingOrganization
	 * @generated
	 */
	EClass getInfluencingOrganization();

	/**
	 * Returns the meta object for the reference list '{@link BMM.InfluencingOrganization#getInfluencingOrganizationIsSourceOfInfluencer <em>Influencing Organization Is Source Of Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Influencing Organization Is Source Of Influencer</em>'.
	 * @see BMM.InfluencingOrganization#getInfluencingOrganizationIsSourceOfInfluencer()
	 * @see #getInfluencingOrganization()
	 * @generated
	 */
	EReference getInfluencingOrganization_InfluencingOrganizationIsSourceOfInfluencer();

	/**
	 * Returns the meta object for class '{@link BMM.Means <em>Means</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means</em>'.
	 * @see BMM.Means
	 * @generated
	 */
	EClass getMeans();

	/**
	 * Returns the meta object for class '{@link BMM.PotentialImpact <em>Potential Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Impact</em>'.
	 * @see BMM.PotentialImpact
	 * @generated
	 */
	EClass getPotentialImpact();

	/**
	 * Returns the meta object for the reference list '{@link BMM.PotentialImpact#getPotentialImpactProvidesImpetusForDirective <em>Potential Impact Provides Impetus For Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Potential Impact Provides Impetus For Directive</em>'.
	 * @see BMM.PotentialImpact#getPotentialImpactProvidesImpetusForDirective()
	 * @see #getPotentialImpact()
	 * @generated
	 */
	EReference getPotentialImpact_PotentialImpactProvidesImpetusForDirective();

	/**
	 * Returns the meta object for class '{@link BMM.AssessmentCategory <em>Assessment Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Category</em>'.
	 * @see BMM.AssessmentCategory
	 * @generated
	 */
	EClass getAssessmentCategory();

	/**
	 * Returns the meta object for the reference list '{@link BMM.AssessmentCategory#getAssessmentCategoryCategoriesAssessment <em>Assessment Category Categories Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assessment Category Categories Assessment</em>'.
	 * @see BMM.AssessmentCategory#getAssessmentCategoryCategoriesAssessment()
	 * @see #getAssessmentCategory()
	 * @generated
	 */
	EReference getAssessmentCategory_AssessmentCategoryCategoriesAssessment();

	/**
	 * Returns the meta object for class '{@link BMM.InfluencerCategory <em>Influencer Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influencer Category</em>'.
	 * @see BMM.InfluencerCategory
	 * @generated
	 */
	EClass getInfluencerCategory();

	/**
	 * Returns the meta object for the reference list '{@link BMM.InfluencerCategory#getInfluencerCategoryCategorizesInfluencer <em>Influencer Category Categorizes Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Influencer Category Categorizes Influencer</em>'.
	 * @see BMM.InfluencerCategory#getInfluencerCategoryCategorizesInfluencer()
	 * @see #getInfluencerCategory()
	 * @generated
	 */
	EReference getInfluencerCategory_InfluencerCategoryCategorizesInfluencer();

	/**
	 * Returns the meta object for class '{@link BMM.OrganizationCategory <em>Organization Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Category</em>'.
	 * @see BMM.OrganizationCategory
	 * @generated
	 */
	EClass getOrganizationCategory();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationCategory#getOrganizationCategoryCategorizesInfluencingOrganization <em>Organization Category Categorizes Influencing Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Category Categorizes Influencing Organization</em>'.
	 * @see BMM.OrganizationCategory#getOrganizationCategoryCategorizesInfluencingOrganization()
	 * @see #getOrganizationCategory()
	 * @generated
	 */
	EReference getOrganizationCategory_OrganizationCategoryCategorizesInfluencingOrganization();

	/**
	 * Returns the meta object for class '{@link BMM.OrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Unit</em>'.
	 * @see BMM.OrganizationUnit
	 * @generated
	 */
	EClass getOrganizationUnit();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitDefinesEnd <em>Organization Unit Defines End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Defines End</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitDefinesEnd()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitDefinesEnd();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitEstablishesMeans <em>Organization Unit Establishes Means</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Establishes Means</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitEstablishesMeans()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitEstablishesMeans();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForAsset <em>Organization Unit Is Responsible For Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Is Responsible For Asset</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForAsset()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitIsResponsibleForAsset();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForLiability <em>Organization Unit Is Responsible For Liability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Is Responsible For Liability</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForLiability()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitIsResponsibleForLiability();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitRecognizesInfluencer <em>Organization Unit Recognizes Influencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Recognizes Influencer</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitRecognizesInfluencer()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitRecognizesInfluencer();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitActAsInfluencingOrganization <em>Organization Unit Act As Influencing Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Act As Influencing Organization</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitActAsInfluencingOrganization()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitActAsInfluencingOrganization();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitMakesAssessment <em>Organization Unit Makes Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Makes Assessment</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitMakesAssessment()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitMakesAssessment();

	/**
	 * Returns the meta object for the reference list '{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForBusinessProcess <em>Organization Unit Is Responsible For Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organization Unit Is Responsible For Business Process</em>'.
	 * @see BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForBusinessProcess()
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	EReference getOrganizationUnit_OrganizationUnitIsResponsibleForBusinessProcess();

	/**
	 * Returns the meta object for class '{@link BMM.BusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process</em>'.
	 * @see BMM.BusinessProcess
	 * @generated
	 */
	EClass getBusinessProcess();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessProcess#getBusinessProcessRealizesCourseOfAction <em>Business Process Realizes Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Process Realizes Course Of Action</em>'.
	 * @see BMM.BusinessProcess#getBusinessProcessRealizesCourseOfAction()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_BusinessProcessRealizesCourseOfAction();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessProcess#getBusinessProcessManagerAsset <em>Business Process Manager Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Process Manager Asset</em>'.
	 * @see BMM.BusinessProcess#getBusinessProcessManagerAsset()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_BusinessProcessManagerAsset();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessProcess#getBusinessProcessDeliversOfeering <em>Business Process Delivers Ofeering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Process Delivers Ofeering</em>'.
	 * @see BMM.BusinessProcess#getBusinessProcessDeliversOfeering()
	 * @see #getBusinessProcess()
	 * @generated
	 */
	EReference getBusinessProcess_BusinessProcessDeliversOfeering();

	/**
	 * Returns the meta object for class '{@link BMM.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see BMM.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link BMM.Liability <em>Liability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liability</em>'.
	 * @see BMM.Liability
	 * @generated
	 */
	EClass getLiability();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Liability#getLiabilityClaimsResource <em>Liability Claims Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Liability Claims Resource</em>'.
	 * @see BMM.Liability#getLiabilityClaimsResource()
	 * @see #getLiability()
	 * @generated
	 */
	EReference getLiability_LiabilityClaimsResource();

	/**
	 * Returns the meta object for class '{@link BMM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see BMM.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link BMM.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see BMM.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the reference '{@link BMM.Mission#getMissionMakesOperativeVision <em>Mission Makes Operative Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mission Makes Operative Vision</em>'.
	 * @see BMM.Mission#getMissionMakesOperativeVision()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_MissionMakesOperativeVision();

	/**
	 * Returns the meta object for class '{@link BMM.CourseOfAction <em>Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Of Action</em>'.
	 * @see BMM.CourseOfAction
	 * @generated
	 */
	EClass getCourseOfAction();

	/**
	 * Returns the meta object for the reference list '{@link BMM.CourseOfAction#getEnablingCourseofActionEnablesEnabledCourseOfAction <em>Enabling Courseof Action Enables Enabled Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabling Courseof Action Enables Enabled Course Of Action</em>'.
	 * @see BMM.CourseOfAction#getEnablingCourseofActionEnablesEnabledCourseOfAction()
	 * @see #getCourseOfAction()
	 * @generated
	 */
	EReference getCourseOfAction_EnablingCourseofActionEnablesEnabledCourseOfAction();

	/**
	 * Returns the meta object for the reference list '{@link BMM.CourseOfAction#getBroaderCourseofActionIncludesMoreSpecificCourseOfAction <em>Broader Courseof Action Includes More Specific Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Broader Courseof Action Includes More Specific Course Of Action</em>'.
	 * @see BMM.CourseOfAction#getBroaderCourseofActionIncludesMoreSpecificCourseOfAction()
	 * @see #getCourseOfAction()
	 * @generated
	 */
	EReference getCourseOfAction_BroaderCourseofActionIncludesMoreSpecificCourseOfAction();

	/**
	 * Returns the meta object for the reference '{@link BMM.CourseOfAction#getCourseOfActionChanneIsEffortsTowardsDesiredResult <em>Course Of Action Channe Is Efforts Towards Desired Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course Of Action Channe Is Efforts Towards Desired Result</em>'.
	 * @see BMM.CourseOfAction#getCourseOfActionChanneIsEffortsTowardsDesiredResult()
	 * @see #getCourseOfAction()
	 * @generated
	 */
	EReference getCourseOfAction_CourseOfActionChanneIsEffortsTowardsDesiredResult();

	/**
	 * Returns the meta object for the reference list '{@link BMM.CourseOfAction#getCourseOfActionDeployAsset <em>Course Of Action Deploy Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course Of Action Deploy Asset</em>'.
	 * @see BMM.CourseOfAction#getCourseOfActionDeployAsset()
	 * @see #getCourseOfAction()
	 * @generated
	 */
	EReference getCourseOfAction_CourseOfActionDeployAsset();

	/**
	 * Returns the meta object for the reference list '{@link BMM.CourseOfAction#getCourseOfActionDefiensOffering <em>Course Of Action Defiens Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Course Of Action Defiens Offering</em>'.
	 * @see BMM.CourseOfAction#getCourseOfActionDefiensOffering()
	 * @see #getCourseOfAction()
	 * @generated
	 */
	EReference getCourseOfAction_CourseOfActionDefiensOffering();

	/**
	 * Returns the meta object for class '{@link BMM.FixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset</em>'.
	 * @see BMM.FixedAsset
	 * @generated
	 */
	EClass getFixedAsset();

	/**
	 * Returns the meta object for the reference list '{@link BMM.FixedAsset#getFixedAssetProvidesResource <em>Fixed Asset Provides Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Provides Resource</em>'.
	 * @see BMM.FixedAsset#getFixedAssetProvidesResource()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetProvidesResource();

	/**
	 * Returns the meta object for class '{@link BMM.Offering <em>Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offering</em>'.
	 * @see BMM.Offering
	 * @generated
	 */
	EClass getOffering();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Offering#getOfferingRequiresResource <em>Offering Requires Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offering Requires Resource</em>'.
	 * @see BMM.Offering#getOfferingRequiresResource()
	 * @see #getOffering()
	 * @generated
	 */
	EReference getOffering_OfferingRequiresResource();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Offering#getOfferingUsesFixedAsset <em>Offering Uses Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offering Uses Fixed Asset</em>'.
	 * @see BMM.Offering#getOfferingUsesFixedAsset()
	 * @see #getOffering()
	 * @generated
	 */
	EReference getOffering_OfferingUsesFixedAsset();

	/**
	 * Returns the meta object for class '{@link BMM.Directive <em>Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directive</em>'.
	 * @see BMM.Directive
	 * @generated
	 */
	EClass getDirective();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Directive#getDirectiveGovernsCourseOfAction <em>Directive Governs Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directive Governs Course Of Action</em>'.
	 * @see BMM.Directive#getDirectiveGovernsCourseOfAction()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_DirectiveGovernsCourseOfAction();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Directive#getDirectiveIsSourceOfCourseOfAction <em>Directive Is Source Of Course Of Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directive Is Source Of Course Of Action</em>'.
	 * @see BMM.Directive#getDirectiveIsSourceOfCourseOfAction()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_DirectiveIsSourceOfCourseOfAction();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Directive#getDirectiveActAsRegulation <em>Directive Act As Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directive Act As Regulation</em>'.
	 * @see BMM.Directive#getDirectiveActAsRegulation()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_DirectiveActAsRegulation();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Directive#getDirectiveSupportsAchievementOfDesiredResult <em>Directive Supports Achievement Of Desired Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directive Supports Achievement Of Desired Result</em>'.
	 * @see BMM.Directive#getDirectiveSupportsAchievementOfDesiredResult()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_DirectiveSupportsAchievementOfDesiredResult();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Directive#getDirectiveGovernsUseOfAsset <em>Directive Governs Use Of Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directive Governs Use Of Asset</em>'.
	 * @see BMM.Directive#getDirectiveGovernsUseOfAsset()
	 * @see #getDirective()
	 * @generated
	 */
	EReference getDirective_DirectiveGovernsUseOfAsset();

	/**
	 * Returns the meta object for class '{@link BMM.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see BMM.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Strategy#getStrategyIsAComponentOfThePlanForMission <em>Strategy Is AComponent Of The Plan For Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Is AComponent Of The Plan For Mission</em>'.
	 * @see BMM.Strategy#getStrategyIsAComponentOfThePlanForMission()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyIsAComponentOfThePlanForMission();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Strategy#getStrategyDeterminesOrganizationUnit <em>Strategy Determines Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Determines Organization Unit</em>'.
	 * @see BMM.Strategy#getStrategyDeterminesOrganizationUnit()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyDeterminesOrganizationUnit();

	/**
	 * Returns the meta object for class '{@link BMM.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tactic</em>'.
	 * @see BMM.Tactic
	 * @generated
	 */
	EClass getTactic();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Tactic#getTacticImplementsStrategy <em>Tactic Implements Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tactic Implements Strategy</em>'.
	 * @see BMM.Tactic#getTacticImplementsStrategy()
	 * @see #getTactic()
	 * @generated
	 */
	EReference getTactic_TacticImplementsStrategy();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Tactic#getTacticEffectsEnforcementLevelOfBusinessRule <em>Tactic Effects Enforcement Level Of Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tactic Effects Enforcement Level Of Business Rule</em>'.
	 * @see BMM.Tactic#getTacticEffectsEnforcementLevelOfBusinessRule()
	 * @see #getTactic()
	 * @generated
	 */
	EReference getTactic_TacticEffectsEnforcementLevelOfBusinessRule();

	/**
	 * Returns the meta object for class '{@link BMM.BusinessRule <em>Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule</em>'.
	 * @see BMM.BusinessRule
	 * @generated
	 */
	EClass getBusinessRule();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessRule#getBusinessRuleGuidesBusinessProcess <em>Business Rule Guides Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Rule Guides Business Process</em>'.
	 * @see BMM.BusinessRule#getBusinessRuleGuidesBusinessProcess()
	 * @see #getBusinessRule()
	 * @generated
	 */
	EReference getBusinessRule_BusinessRuleGuidesBusinessProcess();

	/**
	 * Returns the meta object for class '{@link BMM.BusinessPolicy <em>Business Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Policy</em>'.
	 * @see BMM.BusinessPolicy
	 * @generated
	 */
	EClass getBusinessPolicy();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessPolicy#getBusinessPolicyIsBasisForBusinessRule <em>Business Policy Is Basis For Business Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Policy Is Basis For Business Rule</em>'.
	 * @see BMM.BusinessPolicy#getBusinessPolicyIsBasisForBusinessRule()
	 * @see #getBusinessPolicy()
	 * @generated
	 */
	EReference getBusinessPolicy_BusinessPolicyIsBasisForBusinessRule();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessPolicy#getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy <em>Broader Business Policy Includes More Specific Business Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Broader Business Policy Includes More Specific Business Policy</em>'.
	 * @see BMM.BusinessPolicy#getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy()
	 * @see #getBusinessPolicy()
	 * @generated
	 */
	EReference getBusinessPolicy_BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy();

	/**
	 * Returns the meta object for the reference list '{@link BMM.BusinessPolicy#getBusinessPolicyGovernsBusinessProcess <em>Business Policy Governs Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Policy Governs Business Process</em>'.
	 * @see BMM.BusinessPolicy#getBusinessPolicyGovernsBusinessProcess()
	 * @see #getBusinessPolicy()
	 * @generated
	 */
	EReference getBusinessPolicy_BusinessPolicyGovernsBusinessProcess();

	/**
	 * Returns the meta object for class '{@link BMM.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulation</em>'.
	 * @see BMM.Regulation
	 * @generated
	 */
	EClass getRegulation();

	/**
	 * Returns the meta object for class '{@link BMM.Vision <em>Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vision</em>'.
	 * @see BMM.Vision
	 * @generated
	 */
	EClass getVision();

	/**
	 * Returns the meta object for class '{@link BMM.DesiredResult <em>Desired Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desired Result</em>'.
	 * @see BMM.DesiredResult
	 * @generated
	 */
	EClass getDesiredResult();

	/**
	 * Returns the meta object for the reference list '{@link BMM.DesiredResult#getBroaderDesiredResultIncludesMoreSpecificDesiredResult <em>Broader Desired Result Includes More Specific Desired Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Broader Desired Result Includes More Specific Desired Result</em>'.
	 * @see BMM.DesiredResult#getBroaderDesiredResultIncludesMoreSpecificDesiredResult()
	 * @see #getDesiredResult()
	 * @generated
	 */
	EReference getDesiredResult_BroaderDesiredResultIncludesMoreSpecificDesiredResult();

	/**
	 * Returns the meta object for class '{@link BMM.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see BMM.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference '{@link BMM.Goal#getGoalAmplifiesVision <em>Goal Amplifies Vision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal Amplifies Vision</em>'.
	 * @see BMM.Goal#getGoalAmplifiesVision()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_GoalAmplifiesVision();

	/**
	 * Returns the meta object for class '{@link BMM.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see BMM.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the reference list '{@link BMM.Objective#getObjectiveQuantifiesGoal <em>Objective Quantifies Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objective Quantifies Goal</em>'.
	 * @see BMM.Objective#getObjectiveQuantifiesGoal()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_ObjectiveQuantifiesGoal();

	/**
	 * Returns the meta object for class '{@link BMM.PotentialReward <em>Potential Reward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Reward</em>'.
	 * @see BMM.PotentialReward
	 * @generated
	 */
	EClass getPotentialReward();

	/**
	 * Returns the meta object for class '{@link BMM.Risk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk</em>'.
	 * @see BMM.Risk
	 * @generated
	 */
	EClass getRisk();

	/**
	 * Returns the meta object for class '{@link BMM.BMMmodel <em>BM Mmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BM Mmodel</em>'.
	 * @see BMM.BMMmodel
	 * @generated
	 */
	EClass getBMMmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link BMM.BMMmodel#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see BMM.BMMmodel#getContains()
	 * @see #getBMMmodel()
	 * @generated
	 */
	EReference getBMMmodel_Contains();

	/**
	 * Returns the meta object for the attribute '{@link BMM.BMMmodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see BMM.BMMmodel#getName()
	 * @see #getBMMmodel()
	 * @generated
	 */
	EAttribute getBMMmodel_Name();

	/**
	 * Returns the meta object for the attribute '{@link BMM.BMMmodel#getOntologyNS <em>Ontology NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology NS</em>'.
	 * @see BMM.BMMmodel#getOntologyNS()
	 * @see #getBMMmodel()
	 * @generated
	 */
	EAttribute getBMMmodel_OntologyNS();

	/**
	 * Returns the meta object for the attribute '{@link BMM.BMMmodel#getOntologyURI <em>Ontology URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology URI</em>'.
	 * @see BMM.BMMmodel#getOntologyURI()
	 * @see #getBMMmodel()
	 * @generated
	 */
	EAttribute getBMMmodel_OntologyURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BMMFactory getBMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link BMM.impl.MotivationElementImpl <em>Motivation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.MotivationElementImpl
		 * @see BMM.impl.BMMPackageImpl#getMotivationElement()
		 * @generated
		 */
		EClass MOTIVATION_ELEMENT = eINSTANCE.getMotivationElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION_ELEMENT__NAME = eINSTANCE.getMotivationElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVATION_ELEMENT__DESCRIPTION = eINSTANCE.getMotivationElement_Description();

		/**
		 * The meta object literal for the '{@link BMM.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.AssessmentImpl
		 * @see BMM.impl.BMMPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Using Assessment Uses Used Assessment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__USING_ASSESSMENT_USES_USED_ASSESSMENT = eINSTANCE.getAssessment_UsingAssessmentUsesUsedAssessment();

		/**
		 * The meta object literal for the '<em><b>Assessment Provides Impetus For Directive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__ASSESSMENT_PROVIDES_IMPETUS_FOR_DIRECTIVE = eINSTANCE.getAssessment_AssessmentProvidesImpetusForDirective();

		/**
		 * The meta object literal for the '<em><b>Assessment Identifies Potential Impact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__ASSESSMENT_IDENTIFIES_POTENTIAL_IMPACT = eINSTANCE.getAssessment_AssessmentIdentifiesPotentialImpact();

		/**
		 * The meta object literal for the '<em><b>Assessment Judgment Of Influencer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__ASSESSMENT_JUDGMENT_OF_INFLUENCER = eINSTANCE.getAssessment_AssessmentJudgmentOfInfluencer();

		/**
		 * The meta object literal for the '{@link BMM.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.EndImpl
		 * @see BMM.impl.BMMPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link BMM.impl.InfluencerImpl <em>Influencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.InfluencerImpl
		 * @see BMM.impl.BMMPackageImpl#getInfluencer()
		 * @generated
		 */
		EClass INFLUENCER = eINSTANCE.getInfluencer();

		/**
		 * The meta object literal for the '{@link BMM.impl.InfluencingOrganizationImpl <em>Influencing Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.InfluencingOrganizationImpl
		 * @see BMM.impl.BMMPackageImpl#getInfluencingOrganization()
		 * @generated
		 */
		EClass INFLUENCING_ORGANIZATION = eINSTANCE.getInfluencingOrganization();

		/**
		 * The meta object literal for the '<em><b>Influencing Organization Is Source Of Influencer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCING_ORGANIZATION__INFLUENCING_ORGANIZATION_IS_SOURCE_OF_INFLUENCER = eINSTANCE.getInfluencingOrganization_InfluencingOrganizationIsSourceOfInfluencer();

		/**
		 * The meta object literal for the '{@link BMM.impl.MeansImpl <em>Means</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.MeansImpl
		 * @see BMM.impl.BMMPackageImpl#getMeans()
		 * @generated
		 */
		EClass MEANS = eINSTANCE.getMeans();

		/**
		 * The meta object literal for the '{@link BMM.impl.PotentialImpactImpl <em>Potential Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.PotentialImpactImpl
		 * @see BMM.impl.BMMPackageImpl#getPotentialImpact()
		 * @generated
		 */
		EClass POTENTIAL_IMPACT = eINSTANCE.getPotentialImpact();

		/**
		 * The meta object literal for the '<em><b>Potential Impact Provides Impetus For Directive</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POTENTIAL_IMPACT__POTENTIAL_IMPACT_PROVIDES_IMPETUS_FOR_DIRECTIVE = eINSTANCE.getPotentialImpact_PotentialImpactProvidesImpetusForDirective();

		/**
		 * The meta object literal for the '{@link BMM.impl.AssessmentCategoryImpl <em>Assessment Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.AssessmentCategoryImpl
		 * @see BMM.impl.BMMPackageImpl#getAssessmentCategory()
		 * @generated
		 */
		EClass ASSESSMENT_CATEGORY = eINSTANCE.getAssessmentCategory();

		/**
		 * The meta object literal for the '<em><b>Assessment Category Categories Assessment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT = eINSTANCE.getAssessmentCategory_AssessmentCategoryCategoriesAssessment();

		/**
		 * The meta object literal for the '{@link BMM.impl.InfluencerCategoryImpl <em>Influencer Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.InfluencerCategoryImpl
		 * @see BMM.impl.BMMPackageImpl#getInfluencerCategory()
		 * @generated
		 */
		EClass INFLUENCER_CATEGORY = eINSTANCE.getInfluencerCategory();

		/**
		 * The meta object literal for the '<em><b>Influencer Category Categorizes Influencer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCER_CATEGORY__INFLUENCER_CATEGORY_CATEGORIZES_INFLUENCER = eINSTANCE.getInfluencerCategory_InfluencerCategoryCategorizesInfluencer();

		/**
		 * The meta object literal for the '{@link BMM.impl.OrganizationCategoryImpl <em>Organization Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.OrganizationCategoryImpl
		 * @see BMM.impl.BMMPackageImpl#getOrganizationCategory()
		 * @generated
		 */
		EClass ORGANIZATION_CATEGORY = eINSTANCE.getOrganizationCategory();

		/**
		 * The meta object literal for the '<em><b>Organization Category Categorizes Influencing Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CATEGORY__ORGANIZATION_CATEGORY_CATEGORIZES_INFLUENCING_ORGANIZATION = eINSTANCE.getOrganizationCategory_OrganizationCategoryCategorizesInfluencingOrganization();

		/**
		 * The meta object literal for the '{@link BMM.impl.OrganizationUnitImpl <em>Organization Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.OrganizationUnitImpl
		 * @see BMM.impl.BMMPackageImpl#getOrganizationUnit()
		 * @generated
		 */
		EClass ORGANIZATION_UNIT = eINSTANCE.getOrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Defines End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END = eINSTANCE.getOrganizationUnit_OrganizationUnitDefinesEnd();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Establishes Means</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS = eINSTANCE.getOrganizationUnit_OrganizationUnitEstablishesMeans();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Is Responsible For Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET = eINSTANCE.getOrganizationUnit_OrganizationUnitIsResponsibleForAsset();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Is Responsible For Liability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY = eINSTANCE.getOrganizationUnit_OrganizationUnitIsResponsibleForLiability();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Recognizes Influencer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER = eINSTANCE.getOrganizationUnit_OrganizationUnitRecognizesInfluencer();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Act As Influencing Organization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION = eINSTANCE.getOrganizationUnit_OrganizationUnitActAsInfluencingOrganization();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Makes Assessment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT = eINSTANCE.getOrganizationUnit_OrganizationUnitMakesAssessment();

		/**
		 * The meta object literal for the '<em><b>Organization Unit Is Responsible For Business Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS = eINSTANCE.getOrganizationUnit_OrganizationUnitIsResponsibleForBusinessProcess();

		/**
		 * The meta object literal for the '{@link BMM.impl.BusinessProcessImpl <em>Business Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.BusinessProcessImpl
		 * @see BMM.impl.BMMPackageImpl#getBusinessProcess()
		 * @generated
		 */
		EClass BUSINESS_PROCESS = eINSTANCE.getBusinessProcess();

		/**
		 * The meta object literal for the '<em><b>Business Process Realizes Course Of Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION = eINSTANCE.getBusinessProcess_BusinessProcessRealizesCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Business Process Manager Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET = eINSTANCE.getBusinessProcess_BusinessProcessManagerAsset();

		/**
		 * The meta object literal for the '<em><b>Business Process Delivers Ofeering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING = eINSTANCE.getBusinessProcess_BusinessProcessDeliversOfeering();

		/**
		 * The meta object literal for the '{@link BMM.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.AssetImpl
		 * @see BMM.impl.BMMPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '{@link BMM.impl.LiabilityImpl <em>Liability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.LiabilityImpl
		 * @see BMM.impl.BMMPackageImpl#getLiability()
		 * @generated
		 */
		EClass LIABILITY = eINSTANCE.getLiability();

		/**
		 * The meta object literal for the '<em><b>Liability Claims Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIABILITY__LIABILITY_CLAIMS_RESOURCE = eINSTANCE.getLiability_LiabilityClaimsResource();

		/**
		 * The meta object literal for the '{@link BMM.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.ResourceImpl
		 * @see BMM.impl.BMMPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link BMM.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.MissionImpl
		 * @see BMM.impl.BMMPackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Mission Makes Operative Vision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__MISSION_MAKES_OPERATIVE_VISION = eINSTANCE.getMission_MissionMakesOperativeVision();

		/**
		 * The meta object literal for the '{@link BMM.impl.CourseOfActionImpl <em>Course Of Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.CourseOfActionImpl
		 * @see BMM.impl.BMMPackageImpl#getCourseOfAction()
		 * @generated
		 */
		EClass COURSE_OF_ACTION = eINSTANCE.getCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Enabling Courseof Action Enables Enabled Course Of Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION = eINSTANCE.getCourseOfAction_EnablingCourseofActionEnablesEnabledCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Broader Courseof Action Includes More Specific Course Of Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION = eINSTANCE.getCourseOfAction_BroaderCourseofActionIncludesMoreSpecificCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Course Of Action Channe Is Efforts Towards Desired Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT = eINSTANCE.getCourseOfAction_CourseOfActionChanneIsEffortsTowardsDesiredResult();

		/**
		 * The meta object literal for the '<em><b>Course Of Action Deploy Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET = eINSTANCE.getCourseOfAction_CourseOfActionDeployAsset();

		/**
		 * The meta object literal for the '<em><b>Course Of Action Defiens Offering</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING = eINSTANCE.getCourseOfAction_CourseOfActionDefiensOffering();

		/**
		 * The meta object literal for the '{@link BMM.impl.FixedAssetImpl <em>Fixed Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.FixedAssetImpl
		 * @see BMM.impl.BMMPackageImpl#getFixedAsset()
		 * @generated
		 */
		EClass FIXED_ASSET = eINSTANCE.getFixedAsset();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Provides Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_PROVIDES_RESOURCE = eINSTANCE.getFixedAsset_FixedAssetProvidesResource();

		/**
		 * The meta object literal for the '{@link BMM.impl.OfferingImpl <em>Offering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.OfferingImpl
		 * @see BMM.impl.BMMPackageImpl#getOffering()
		 * @generated
		 */
		EClass OFFERING = eINSTANCE.getOffering();

		/**
		 * The meta object literal for the '<em><b>Offering Requires Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFERING__OFFERING_REQUIRES_RESOURCE = eINSTANCE.getOffering_OfferingRequiresResource();

		/**
		 * The meta object literal for the '<em><b>Offering Uses Fixed Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OFFERING__OFFERING_USES_FIXED_ASSET = eINSTANCE.getOffering_OfferingUsesFixedAsset();

		/**
		 * The meta object literal for the '{@link BMM.impl.DirectiveImpl <em>Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.DirectiveImpl
		 * @see BMM.impl.BMMPackageImpl#getDirective()
		 * @generated
		 */
		EClass DIRECTIVE = eINSTANCE.getDirective();

		/**
		 * The meta object literal for the '<em><b>Directive Governs Course Of Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION = eINSTANCE.getDirective_DirectiveGovernsCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Directive Is Source Of Course Of Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION = eINSTANCE.getDirective_DirectiveIsSourceOfCourseOfAction();

		/**
		 * The meta object literal for the '<em><b>Directive Act As Regulation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION = eINSTANCE.getDirective_DirectiveActAsRegulation();

		/**
		 * The meta object literal for the '<em><b>Directive Supports Achievement Of Desired Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT = eINSTANCE.getDirective_DirectiveSupportsAchievementOfDesiredResult();

		/**
		 * The meta object literal for the '<em><b>Directive Governs Use Of Asset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET = eINSTANCE.getDirective_DirectiveGovernsUseOfAsset();

		/**
		 * The meta object literal for the '{@link BMM.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.StrategyImpl
		 * @see BMM.impl.BMMPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Strategy Is AComponent Of The Plan For Mission</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION = eINSTANCE.getStrategy_StrategyIsAComponentOfThePlanForMission();

		/**
		 * The meta object literal for the '<em><b>Strategy Determines Organization Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT = eINSTANCE.getStrategy_StrategyDeterminesOrganizationUnit();

		/**
		 * The meta object literal for the '{@link BMM.impl.TacticImpl <em>Tactic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.TacticImpl
		 * @see BMM.impl.BMMPackageImpl#getTactic()
		 * @generated
		 */
		EClass TACTIC = eINSTANCE.getTactic();

		/**
		 * The meta object literal for the '<em><b>Tactic Implements Strategy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACTIC__TACTIC_IMPLEMENTS_STRATEGY = eINSTANCE.getTactic_TacticImplementsStrategy();

		/**
		 * The meta object literal for the '<em><b>Tactic Effects Enforcement Level Of Business Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TACTIC__TACTIC_EFFECTS_ENFORCEMENT_LEVEL_OF_BUSINESS_RULE = eINSTANCE.getTactic_TacticEffectsEnforcementLevelOfBusinessRule();

		/**
		 * The meta object literal for the '{@link BMM.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.BusinessRuleImpl
		 * @see BMM.impl.BMMPackageImpl#getBusinessRule()
		 * @generated
		 */
		EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Business Rule Guides Business Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS = eINSTANCE.getBusinessRule_BusinessRuleGuidesBusinessProcess();

		/**
		 * The meta object literal for the '{@link BMM.impl.BusinessPolicyImpl <em>Business Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.BusinessPolicyImpl
		 * @see BMM.impl.BMMPackageImpl#getBusinessPolicy()
		 * @generated
		 */
		EClass BUSINESS_POLICY = eINSTANCE.getBusinessPolicy();

		/**
		 * The meta object literal for the '<em><b>Business Policy Is Basis For Business Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE = eINSTANCE.getBusinessPolicy_BusinessPolicyIsBasisForBusinessRule();

		/**
		 * The meta object literal for the '<em><b>Broader Business Policy Includes More Specific Business Policy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY = eINSTANCE.getBusinessPolicy_BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy();

		/**
		 * The meta object literal for the '<em><b>Business Policy Governs Business Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS = eINSTANCE.getBusinessPolicy_BusinessPolicyGovernsBusinessProcess();

		/**
		 * The meta object literal for the '{@link BMM.impl.RegulationImpl <em>Regulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.RegulationImpl
		 * @see BMM.impl.BMMPackageImpl#getRegulation()
		 * @generated
		 */
		EClass REGULATION = eINSTANCE.getRegulation();

		/**
		 * The meta object literal for the '{@link BMM.impl.VisionImpl <em>Vision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.VisionImpl
		 * @see BMM.impl.BMMPackageImpl#getVision()
		 * @generated
		 */
		EClass VISION = eINSTANCE.getVision();

		/**
		 * The meta object literal for the '{@link BMM.impl.DesiredResultImpl <em>Desired Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.DesiredResultImpl
		 * @see BMM.impl.BMMPackageImpl#getDesiredResult()
		 * @generated
		 */
		EClass DESIRED_RESULT = eINSTANCE.getDesiredResult();

		/**
		 * The meta object literal for the '<em><b>Broader Desired Result Includes More Specific Desired Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT = eINSTANCE.getDesiredResult_BroaderDesiredResultIncludesMoreSpecificDesiredResult();

		/**
		 * The meta object literal for the '{@link BMM.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.GoalImpl
		 * @see BMM.impl.BMMPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Goal Amplifies Vision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_AMPLIFIES_VISION = eINSTANCE.getGoal_GoalAmplifiesVision();

		/**
		 * The meta object literal for the '{@link BMM.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.ObjectiveImpl
		 * @see BMM.impl.BMMPackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Objective Quantifies Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL = eINSTANCE.getObjective_ObjectiveQuantifiesGoal();

		/**
		 * The meta object literal for the '{@link BMM.impl.PotentialRewardImpl <em>Potential Reward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.PotentialRewardImpl
		 * @see BMM.impl.BMMPackageImpl#getPotentialReward()
		 * @generated
		 */
		EClass POTENTIAL_REWARD = eINSTANCE.getPotentialReward();

		/**
		 * The meta object literal for the '{@link BMM.impl.RiskImpl <em>Risk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.RiskImpl
		 * @see BMM.impl.BMMPackageImpl#getRisk()
		 * @generated
		 */
		EClass RISK = eINSTANCE.getRisk();

		/**
		 * The meta object literal for the '{@link BMM.impl.BMMmodelImpl <em>BM Mmodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see BMM.impl.BMMmodelImpl
		 * @see BMM.impl.BMMPackageImpl#getBMMmodel()
		 * @generated
		 */
		EClass BM_MMODEL = eINSTANCE.getBMMmodel();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BM_MMODEL__CONTAINS = eINSTANCE.getBMMmodel_Contains();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BM_MMODEL__NAME = eINSTANCE.getBMMmodel_Name();

		/**
		 * The meta object literal for the '<em><b>Ontology NS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BM_MMODEL__ONTOLOGY_NS = eINSTANCE.getBMMmodel_OntologyNS();

		/**
		 * The meta object literal for the '<em><b>Ontology URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BM_MMODEL__ONTOLOGY_URI = eINSTANCE.getBMMmodel_OntologyURI();

	}

} //BMMPackage
