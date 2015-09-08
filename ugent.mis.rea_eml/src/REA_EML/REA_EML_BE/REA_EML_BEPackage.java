/**
 */
package REA_EML.REA_EML_BE;

import REA_EML.REA_EMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see REA_EML.REA_EML_BE.REA_EML_BEFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_BE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BEPackage eINSTANCE = REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getREA_EML_BEM()
	 * @generated
	 */
	int REA_EML_BE_M = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__BUSINESS_ENTITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__BUSINESS_RELATIONSHIPS = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M__BUSINESS_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BE_M_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.BusinessEntityImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getBusinessEntity()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.BusinessRelationshipImpl <em>Business Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.BusinessRelationshipImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getBusinessRelationship()
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
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP__TARGET = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP__SOURCE = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Business Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RELATIONSHIP_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.AttributeImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.PolicyEntityImpl <em>Policy Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.PolicyEntityImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyEntity()
	 * @generated
	 */
	int POLICY_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY__NAME = BUSINESS_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY__ATTRIBUTES = BUSINESS_ENTITY__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Policy Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_FEATURE_COUNT = BUSINESS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Policy Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_ENTITY_OPERATION_COUNT = BUSINESS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl <em>Policy Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyRelationship()
	 * @generated
	 */
	int POLICY_RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__NAME = BUSINESS_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__TARGET = BUSINESS_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__SOURCE = BUSINESS_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Policy Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__POLICY_ENTITY = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP__BUSINESS_ENTITY = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Policy Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP_FEATURE_COUNT = BUSINESS_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Policy Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_RELATIONSHIP_OPERATION_COUNT = BUSINESS_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BE.PolicyRelationshipType <em>Policy Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BE.PolicyRelationshipType
	 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyRelationshipType()
	 * @generated
	 */
	int POLICY_RELATIONSHIP_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.REA_EML_BEM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEM
	 * @generated
	 */
	EClass getREA_EML_BEM();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEntities <em>Business Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Entities</em>'.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEntities()
	 * @see #getREA_EML_BEM()
	 * @generated
	 */
	EReference getREA_EML_BEM_BusinessEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessRelationships <em>Business Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Relationships</em>'.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessRelationships()
	 * @see #getREA_EML_BEM()
	 * @generated
	 */
	EReference getREA_EML_BEM_BusinessRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEvents <em>Business Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Events</em>'.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEvents()
	 * @see #getREA_EML_BEM()
	 * @generated
	 */
	EReference getREA_EML_BEM_BusinessEvents();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BE.BusinessEntity
	 * @generated
	 */
	EClass getBusinessEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BE.BusinessEntity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see REA_EML.REA_EML_BE.BusinessEntity#getAttributes()
	 * @see #getBusinessEntity()
	 * @generated
	 */
	EReference getBusinessEntity_Attributes();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.BusinessRelationship <em>Business Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Relationship</em>'.
	 * @see REA_EML.REA_EML_BE.BusinessRelationship
	 * @generated
	 */
	EClass getBusinessRelationship();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BE.BusinessRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see REA_EML.REA_EML_BE.BusinessRelationship#getTarget()
	 * @see #getBusinessRelationship()
	 * @generated
	 */
	EReference getBusinessRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BE.BusinessRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see REA_EML.REA_EML_BE.BusinessRelationship#getSource()
	 * @see #getBusinessRelationship()
	 * @generated
	 */
	EReference getBusinessRelationship_Source();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see REA_EML.REA_EML_BE.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.PolicyEntity <em>Policy Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Entity</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyEntity
	 * @generated
	 */
	EClass getPolicyEntity();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BE.PolicyRelationship <em>Policy Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy Relationship</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyRelationship
	 * @generated
	 */
	EClass getPolicyRelationship();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyRelationshipType <em>Policy Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Relationship Type</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyRelationship#getPolicyRelationshipType()
	 * @see #getPolicyRelationship()
	 * @generated
	 */
	EAttribute getPolicyRelationship_PolicyRelationshipType();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyEntity <em>Policy Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy Entity</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyRelationship#getPolicyEntity()
	 * @see #getPolicyRelationship()
	 * @generated
	 */
	EReference getPolicyRelationship_PolicyEntity();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BE.PolicyRelationship#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyRelationship#getBusinessEntity()
	 * @see #getPolicyRelationship()
	 * @generated
	 */
	EReference getPolicyRelationship_BusinessEntity();

	/**
	 * Returns the meta object for enum '{@link REA_EML.REA_EML_BE.PolicyRelationshipType <em>Policy Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Policy Relationship Type</em>'.
	 * @see REA_EML.REA_EML_BE.PolicyRelationshipType
	 * @generated
	 */
	EEnum getPolicyRelationshipType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BEFactory getREA_EML_BEFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl <em>M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEMImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getREA_EML_BEM()
		 * @generated
		 */
		EClass REA_EML_BE_M = eINSTANCE.getREA_EML_BEM();

		/**
		 * The meta object literal for the '<em><b>Business Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BE_M__BUSINESS_ENTITIES = eINSTANCE.getREA_EML_BEM_BusinessEntities();

		/**
		 * The meta object literal for the '<em><b>Business Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BE_M__BUSINESS_RELATIONSHIPS = eINSTANCE.getREA_EML_BEM_BusinessRelationships();

		/**
		 * The meta object literal for the '<em><b>Business Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BE_M__BUSINESS_EVENTS = eINSTANCE.getREA_EML_BEM_BusinessEvents();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.BusinessEntityImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getBusinessEntity()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.BusinessRelationshipImpl <em>Business Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.BusinessRelationshipImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getBusinessRelationship()
		 * @generated
		 */
		EClass BUSINESS_RELATIONSHIP = eINSTANCE.getBusinessRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RELATIONSHIP__TARGET = eINSTANCE.getBusinessRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_RELATIONSHIP__SOURCE = eINSTANCE.getBusinessRelationship_Source();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.AttributeImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.PolicyEntityImpl <em>Policy Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.PolicyEntityImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyEntity()
		 * @generated
		 */
		EClass POLICY_ENTITY = eINSTANCE.getPolicyEntity();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl <em>Policy Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.impl.PolicyRelationshipImpl
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyRelationship()
		 * @generated
		 */
		EClass POLICY_RELATIONSHIP = eINSTANCE.getPolicyRelationship();

		/**
		 * The meta object literal for the '<em><b>Policy Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE = eINSTANCE.getPolicyRelationship_PolicyRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Policy Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_RELATIONSHIP__POLICY_ENTITY = eINSTANCE.getPolicyRelationship_PolicyEntity();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY_RELATIONSHIP__BUSINESS_ENTITY = eINSTANCE.getPolicyRelationship_BusinessEntity();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BE.PolicyRelationshipType <em>Policy Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BE.PolicyRelationshipType
		 * @see REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl#getPolicyRelationshipType()
		 * @generated
		 */
		EEnum POLICY_RELATIONSHIP_TYPE = eINSTANCE.getPolicyRelationshipType();

	}

} //REA_EML_BEPackage
