/**
 */
package REA_EML.REA_EML_BPolM;

import REA_EML.REA_EMLPackage;

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
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BPolMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BPolM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_BPolM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BPolM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BPolMPackage eINSTANCE = REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl <em>Business Policy Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessPolicyModel()
	 * @generated
	 */
	int BUSINESS_POLICY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Policy Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Business Policy Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_POLICY_MODEL_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.BusinessEntityImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessEntity()
	 * @generated
	 */
	int BUSINESS_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__ATTRIBUTES = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessRelationshipImpl <em>Business Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.BusinessRelationshipImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessRelationship()
	 * @generated
	 */
	int BUSINESS_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP__BUSINESS_ENTITIES = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.AttributeImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.PolicyEntityTypeImpl <em>Policy Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.PolicyEntityTypeImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getPolicyEntityType()
	 * @generated
	 */
	int POLICY_ENTITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_TYPE__NAME = BUSINESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_TYPE__ATTRIBUTES = BUSINESS_ENTITY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Policy Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_TYPE_FEATURE_COUNT = BUSINESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_TYPE_OPERATION_COUNT = BUSINESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.TypificationImpl <em>Typification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.TypificationImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getTypification()
	 * @generated
	 */
	int TYPIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION__NAME = BUSINESS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION__BUSINESS_ENTITIES = BUSINESS_RELATIONSHIP__BUSINESS_ENTITIES;

	/**
	 * The feature id for the '<em><b>Policy Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION__POLICY_ENTITY_TYPE = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION__BUSINESS_ENTITY = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION_FEATURE_COUNT = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Typification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPIFICATION_OPERATION_COUNT = BUSINESS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.PolicyEntityGroupImpl <em>Policy Entity Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.PolicyEntityGroupImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getPolicyEntityGroup()
	 * @generated
	 */
	int POLICY_ENTITY_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_GROUP__NAME = BUSINESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_GROUP__ATTRIBUTES = BUSINESS_ENTITY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Policy Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_GROUP_FEATURE_COUNT = BUSINESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Entity Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_GROUP_OPERATION_COUNT = BUSINESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPolM.impl.GroupingImpl <em>Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPolM.impl.GroupingImpl
	 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getGrouping()
	 * @generated
	 */
	int GROUPING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__NAME = BUSINESS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__BUSINESS_ENTITIES = BUSINESS_RELATIONSHIP__BUSINESS_ENTITIES;

	/**
	 * The feature id for the '<em><b>Grouping Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__GROUPING_ENTITY_TYPE = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__BUSINESS_ENTITY = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_COUNT = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_OPERATION_COUNT = BUSINESS_RELATIONSHIP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel <em>Business Policy Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Policy Model</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessPolicyModel
	 * @generated
	 */
	EClass getBusinessPolicyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessEntities <em>Business Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Entities</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessEntities()
	 * @see #getBusinessPolicyModel()
	 * @generated
	 */
	EReference getBusinessPolicyModel_BusinessEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessRelationships <em>Business Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Relationships</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessRelationships()
	 * @see #getBusinessPolicyModel()
	 * @generated
	 */
	EReference getBusinessPolicyModel_BusinessRelationships();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessEntity
	 * @generated
	 */
	EClass getBusinessEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPolM.BusinessEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessEntity#getAttributes()
	 * @see #getBusinessEntity()
	 * @generated
	 */
	EReference getBusinessEntity_Attributes();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.BusinessRelationship <em>Business Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Relationship</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessRelationship
	 * @generated
	 */
	EClass getBusinessRelationship();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BPolM.BusinessRelationship#getBusinessEntities <em>Business Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Entities</em>'.
	 * @see REA_EML.REA_EML_BPolM.BusinessRelationship#getBusinessEntities()
	 * @see #getBusinessRelationship()
	 * @generated
	 */
	EReference getBusinessRelationship_BusinessEntities();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see REA_EML.REA_EML_BPolM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.PolicyEntityType <em>Policy Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Entity Type</em>'.
	 * @see REA_EML.REA_EML_BPolM.PolicyEntityType
	 * @generated
	 */
	EClass getPolicyEntityType();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.Typification <em>Typification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typification</em>'.
	 * @see REA_EML.REA_EML_BPolM.Typification
	 * @generated
	 */
	EClass getTypification();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPolM.Typification#getPolicyEntityType <em>Policy Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy Entity Type</em>'.
	 * @see REA_EML.REA_EML_BPolM.Typification#getPolicyEntityType()
	 * @see #getTypification()
	 * @generated
	 */
	EReference getTypification_PolicyEntityType();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPolM.Typification#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BPolM.Typification#getBusinessEntity()
	 * @see #getTypification()
	 * @generated
	 */
	EReference getTypification_BusinessEntity();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.PolicyEntityGroup <em>Policy Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Entity Group</em>'.
	 * @see REA_EML.REA_EML_BPolM.PolicyEntityGroup
	 * @generated
	 */
	EClass getPolicyEntityGroup();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPolM.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping</em>'.
	 * @see REA_EML.REA_EML_BPolM.Grouping
	 * @generated
	 */
	EClass getGrouping();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPolM.Grouping#getGroupingEntityType <em>Grouping Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grouping Entity Type</em>'.
	 * @see REA_EML.REA_EML_BPolM.Grouping#getGroupingEntityType()
	 * @see #getGrouping()
	 * @generated
	 */
	EReference getGrouping_GroupingEntityType();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPolM.Grouping#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BPolM.Grouping#getBusinessEntity()
	 * @see #getGrouping()
	 * @generated
	 */
	EReference getGrouping_BusinessEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BPolMFactory getREA_EML_BPolMFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl <em>Business Policy Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.BusinessPolicyModelImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessPolicyModel()
		 * @generated
		 */
		EClass BUSINESS_POLICY_MODEL = eINSTANCE.getBusinessPolicyModel();

		/**
		 * The meta object literal for the '<em><b>Business Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES = eINSTANCE.getBusinessPolicyModel_BusinessEntities();

		/**
		 * The meta object literal for the '<em><b>Business Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS = eINSTANCE.getBusinessPolicyModel_BusinessRelationships();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.BusinessEntityImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessEntity()
		 * @generated
		 */
		EClass BUSINESS_ENTITY = eINSTANCE.getBusinessEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_ENTITY__ATTRIBUTES = eINSTANCE.getBusinessEntity_Attributes();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.BusinessRelationshipImpl <em>Business Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.BusinessRelationshipImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getBusinessRelationship()
		 * @generated
		 */
		EClass BUSINESS_RELATIONSHIP = eINSTANCE.getBusinessRelationship();

		/**
		 * The meta object literal for the '<em><b>Business Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RELATIONSHIP__BUSINESS_ENTITIES = eINSTANCE.getBusinessRelationship_BusinessEntities();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.AttributeImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.PolicyEntityTypeImpl <em>Policy Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.PolicyEntityTypeImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getPolicyEntityType()
		 * @generated
		 */
		EClass POLICY_ENTITY_TYPE = eINSTANCE.getPolicyEntityType();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.TypificationImpl <em>Typification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.TypificationImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getTypification()
		 * @generated
		 */
		EClass TYPIFICATION = eINSTANCE.getTypification();

		/**
		 * The meta object literal for the '<em><b>Policy Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPIFICATION__POLICY_ENTITY_TYPE = eINSTANCE.getTypification_PolicyEntityType();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPIFICATION__BUSINESS_ENTITY = eINSTANCE.getTypification_BusinessEntity();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.PolicyEntityGroupImpl <em>Policy Entity Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.PolicyEntityGroupImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getPolicyEntityGroup()
		 * @generated
		 */
		EClass POLICY_ENTITY_GROUP = eINSTANCE.getPolicyEntityGroup();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPolM.impl.GroupingImpl <em>Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPolM.impl.GroupingImpl
		 * @see REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl#getGrouping()
		 * @generated
		 */
		EClass GROUPING = eINSTANCE.getGrouping();

		/**
		 * The meta object literal for the '<em><b>Grouping Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING__GROUPING_ENTITY_TYPE = eINSTANCE.getGrouping_GroupingEntityType();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUPING__BUSINESS_ENTITY = eINSTANCE.getGrouping_BusinessEntity();

	}

} //REA_EML_BPolMPackage
