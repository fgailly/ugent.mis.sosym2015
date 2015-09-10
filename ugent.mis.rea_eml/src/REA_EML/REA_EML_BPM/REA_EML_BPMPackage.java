/**
 */
package REA_EML.REA_EML_BPM;

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
 * @see REA_EML.REA_EML_BPM.REA_EML_BPMFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BPMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BPM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mis.ugent.be/rea_eml_bpm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BPM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BPMPackage eINSTANCE = REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.EconomicEventImpl <em>Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.EconomicEventImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicEvent()
	 * @generated
	 */
	int ECONOMIC_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT__TYPE = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.IncrementEconomicEventImpl <em>Increment Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.IncrementEconomicEventImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getIncrementEconomicEvent()
	 * @generated
	 */
	int INCREMENT_ECONOMIC_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_ECONOMIC_EVENT__NAME = ECONOMIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_ECONOMIC_EVENT__TYPE = ECONOMIC_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Increment Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_ECONOMIC_EVENT_FEATURE_COUNT = ECONOMIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Increment Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_ECONOMIC_EVENT_OPERATION_COUNT = ECONOMIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.DecrementEconomicEventImpl <em>Decrement Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.DecrementEconomicEventImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getDecrementEconomicEvent()
	 * @generated
	 */
	int DECREMENT_ECONOMIC_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_ECONOMIC_EVENT__NAME = ECONOMIC_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_ECONOMIC_EVENT__TYPE = ECONOMIC_EVENT__TYPE;

	/**
	 * The number of structural features of the '<em>Decrement Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_ECONOMIC_EVENT_FEATURE_COUNT = ECONOMIC_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decrement Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_ECONOMIC_EVENT_OPERATION_COUNT = ECONOMIC_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.dualityImpl <em>duality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.dualityImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getduality()
	 * @generated
	 */
	int DUALITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Decrement Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY__DECREMENT_ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increment Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY__INCREMENT_ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>duality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>duality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.CommitmentImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getCommitment()
	 * @generated
	 */
	int COMMITMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.IncrementCommitmentImpl <em>Increment Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.IncrementCommitmentImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getIncrementCommitment()
	 * @generated
	 */
	int INCREMENT_COMMITMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMITMENT__NAME = COMMITMENT__NAME;

	/**
	 * The number of structural features of the '<em>Increment Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMITMENT_FEATURE_COUNT = COMMITMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Increment Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_COMMITMENT_OPERATION_COUNT = COMMITMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.DecrementCommitmentImpl <em>Decrement Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.DecrementCommitmentImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getDecrementCommitment()
	 * @generated
	 */
	int DECREMENT_COMMITMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_COMMITMENT__NAME = COMMITMENT__NAME;

	/**
	 * The number of structural features of the '<em>Decrement Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_COMMITMENT_FEATURE_COUNT = COMMITMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decrement Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECREMENT_COMMITMENT_OPERATION_COUNT = COMMITMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.reciprocityImpl <em>reciprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.reciprocityImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getreciprocity()
	 * @generated
	 */
	int RECIPROCITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Decrement Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__DECREMENT_COMMITMENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increment Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY__INCREMENT_COMMITMENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>reciprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECIPROCITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.BusinessProcessModelImpl <em>Business Process Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.BusinessProcessModelImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getBusinessProcessModel()
	 * @generated
	 */
	int BUSINESS_PROCESS_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Economic Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Economic Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__DUALITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commitments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__COMMITMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reciprocities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__RECIPROCITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stockflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__STOCKFLOWS = REA_EMLPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__PARTICIPATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__FULFILLMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__SPECIFICATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organisational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__ORGANISATIONAL_UNIT = REA_EMLPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Business Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL__BUSINESS_PROCESS = REA_EMLPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Business Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Business Process Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_PROCESS_MODEL_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.EconomicResourceImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicResource()
	 * @generated
	 */
	int ECONOMIC_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_RESOURCE__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Economic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_RESOURCE_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Economic Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_RESOURCE_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.EconomicAgentImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicAgent()
	 * @generated
	 */
	int ECONOMIC_AGENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_AGENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Economic Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_AGENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Economic Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_AGENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.specificationImpl <em>specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.specificationImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getspecification()
	 * @generated
	 */
	int SPECIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__COMMITMENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Resouce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ECONOMIC_RESOUCE = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.stockflowImpl <em>stockflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.stockflowImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getstockflow()
	 * @generated
	 */
	int STOCKFLOW = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCKFLOW__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCKFLOW__ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Resouce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCKFLOW__ECONOMIC_RESOUCE = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>stockflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCKFLOW_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>stockflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCKFLOW_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.fulfillmentImpl <em>fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.fulfillmentImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getfulfillment()
	 * @generated
	 */
	int FULFILLMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT__COMMITMENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULFILLMENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.impl.participationImpl <em>participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.impl.participationImpl
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getparticipation()
	 * @generated
	 */
	int PARTICIPATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Economic Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__ECONOMIC_AGENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BPM.EconomicEventType <em>Economic Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BPM.EconomicEventType
	 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicEventType()
	 * @generated
	 */
	int ECONOMIC_EVENT_TYPE = 15;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.IncrementEconomicEvent <em>Increment Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.IncrementEconomicEvent
	 * @generated
	 */
	EClass getIncrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.DecrementEconomicEvent <em>Decrement Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.DecrementEconomicEvent
	 * @generated
	 */
	EClass getDecrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duality</em>'.
	 * @see REA_EML.REA_EML_BPM.duality
	 * @generated
	 */
	EClass getduality();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.duality#getDecrementEconomicEvent <em>Decrement Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decrement Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.duality#getDecrementEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_DecrementEconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.duality#getIncrementEconomicEvent <em>Increment Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.duality#getIncrementEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_IncrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.IncrementCommitment <em>Increment Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.IncrementCommitment
	 * @generated
	 */
	EClass getIncrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.DecrementCommitment <em>Decrement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.DecrementCommitment
	 * @generated
	 */
	EClass getDecrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.reciprocity <em>reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reciprocity</em>'.
	 * @see REA_EML.REA_EML_BPM.reciprocity
	 * @generated
	 */
	EClass getreciprocity();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.reciprocity#getDecrementCommitment <em>Decrement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decrement Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.reciprocity#getDecrementCommitment()
	 * @see #getreciprocity()
	 * @generated
	 */
	EReference getreciprocity_DecrementCommitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.reciprocity#getIncrementCommitment <em>Increment Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.reciprocity#getIncrementCommitment()
	 * @see #getreciprocity()
	 * @generated
	 */
	EReference getreciprocity_IncrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.BusinessProcessModel <em>Business Process Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Process Model</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel
	 * @generated
	 */
	EClass getBusinessProcessModel();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicEvents <em>Economic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Events</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicEvents()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_EconomicEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicResources <em>Economic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Resources</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicResources()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_EconomicResources();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicAgents <em>Economic Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Agents</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicAgents()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_EconomicAgents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getDualities <em>Dualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dualities</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getDualities()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Dualities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getCommitments <em>Commitments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commitments</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getCommitments()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Commitments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getReciprocities <em>Reciprocities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reciprocities</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getReciprocities()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Reciprocities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getStockflows <em>Stockflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stockflows</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getStockflows()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Stockflows();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getParticipations <em>Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participations</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getParticipations()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Participations();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getFulfillments()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Fulfillments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getSpecifications()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EReference getBusinessProcessModel_Specifications();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getOrganisationalUnit <em>Organisational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisational Unit</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getOrganisationalUnit()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EAttribute getBusinessProcessModel_OrganisationalUnit();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getBusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Process</em>'.
	 * @see REA_EML.REA_EML_BPM.BusinessProcessModel#getBusinessProcess()
	 * @see #getBusinessProcessModel()
	 * @generated
	 */
	EAttribute getBusinessProcessModel_BusinessProcess();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.EconomicEvent
	 * @generated
	 */
	EClass getEconomicEvent();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BPM.EconomicEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see REA_EML.REA_EML_BPM.EconomicEvent#getType()
	 * @see #getEconomicEvent()
	 * @generated
	 */
	EAttribute getEconomicEvent_Type();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Resource</em>'.
	 * @see REA_EML.REA_EML_BPM.EconomicResource
	 * @generated
	 */
	EClass getEconomicResource();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BPM.EconomicAgent
	 * @generated
	 */
	EClass getEconomicAgent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specification</em>'.
	 * @see REA_EML.REA_EML_BPM.specification
	 * @generated
	 */
	EClass getspecification();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.specification#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.specification#getCommitment()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_Commitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.specification#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BPM.specification#getEconomicResouce()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stockflow</em>'.
	 * @see REA_EML.REA_EML_BPM.stockflow
	 * @generated
	 */
	EClass getstockflow();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.stockflow#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.stockflow#getEconomicEvent()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.stockflow#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BPM.stockflow#getEconomicResouce()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fulfillment</em>'.
	 * @see REA_EML.REA_EML_BPM.fulfillment
	 * @generated
	 */
	EClass getfulfillment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.fulfillment#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.fulfillment#getEconomicEvent()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.fulfillment#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BPM.fulfillment#getCommitment()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BPM.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>participation</em>'.
	 * @see REA_EML.REA_EML_BPM.participation
	 * @generated
	 */
	EClass getparticipation();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.participation#getEconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BPM.participation#getEconomicAgent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicAgent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BPM.participation#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BPM.participation#getEconomicEvent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicEvent();

	/**
	 * Returns the meta object for enum '{@link REA_EML.REA_EML_BPM.EconomicEventType <em>Economic Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Economic Event Type</em>'.
	 * @see REA_EML.REA_EML_BPM.EconomicEventType
	 * @generated
	 */
	EEnum getEconomicEventType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BPMFactory getREA_EML_BPMFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.IncrementEconomicEventImpl <em>Increment Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.IncrementEconomicEventImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getIncrementEconomicEvent()
		 * @generated
		 */
		EClass INCREMENT_ECONOMIC_EVENT = eINSTANCE.getIncrementEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.DecrementEconomicEventImpl <em>Decrement Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.DecrementEconomicEventImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getDecrementEconomicEvent()
		 * @generated
		 */
		EClass DECREMENT_ECONOMIC_EVENT = eINSTANCE.getDecrementEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.dualityImpl <em>duality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.dualityImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getduality()
		 * @generated
		 */
		EClass DUALITY = eINSTANCE.getduality();

		/**
		 * The meta object literal for the '<em><b>Decrement Economic Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUALITY__DECREMENT_ECONOMIC_EVENT = eINSTANCE.getduality_DecrementEconomicEvent();

		/**
		 * The meta object literal for the '<em><b>Increment Economic Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUALITY__INCREMENT_ECONOMIC_EVENT = eINSTANCE.getduality_IncrementEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.IncrementCommitmentImpl <em>Increment Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.IncrementCommitmentImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getIncrementCommitment()
		 * @generated
		 */
		EClass INCREMENT_COMMITMENT = eINSTANCE.getIncrementCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.DecrementCommitmentImpl <em>Decrement Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.DecrementCommitmentImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getDecrementCommitment()
		 * @generated
		 */
		EClass DECREMENT_COMMITMENT = eINSTANCE.getDecrementCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.reciprocityImpl <em>reciprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.reciprocityImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getreciprocity()
		 * @generated
		 */
		EClass RECIPROCITY = eINSTANCE.getreciprocity();

		/**
		 * The meta object literal for the '<em><b>Decrement Commitment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPROCITY__DECREMENT_COMMITMENT = eINSTANCE.getreciprocity_DecrementCommitment();

		/**
		 * The meta object literal for the '<em><b>Increment Commitment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECIPROCITY__INCREMENT_COMMITMENT = eINSTANCE.getreciprocity_IncrementCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.BusinessProcessModelImpl <em>Business Process Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.BusinessProcessModelImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getBusinessProcessModel()
		 * @generated
		 */
		EClass BUSINESS_PROCESS_MODEL = eINSTANCE.getBusinessProcessModel();

		/**
		 * The meta object literal for the '<em><b>Economic Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS = eINSTANCE.getBusinessProcessModel_EconomicEvents();

		/**
		 * The meta object literal for the '<em><b>Economic Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES = eINSTANCE.getBusinessProcessModel_EconomicResources();

		/**
		 * The meta object literal for the '<em><b>Economic Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS = eINSTANCE.getBusinessProcessModel_EconomicAgents();

		/**
		 * The meta object literal for the '<em><b>Dualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__DUALITIES = eINSTANCE.getBusinessProcessModel_Dualities();

		/**
		 * The meta object literal for the '<em><b>Commitments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__COMMITMENTS = eINSTANCE.getBusinessProcessModel_Commitments();

		/**
		 * The meta object literal for the '<em><b>Reciprocities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__RECIPROCITIES = eINSTANCE.getBusinessProcessModel_Reciprocities();

		/**
		 * The meta object literal for the '<em><b>Stockflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__STOCKFLOWS = eINSTANCE.getBusinessProcessModel_Stockflows();

		/**
		 * The meta object literal for the '<em><b>Participations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__PARTICIPATIONS = eINSTANCE.getBusinessProcessModel_Participations();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__FULFILLMENTS = eINSTANCE.getBusinessProcessModel_Fulfillments();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_PROCESS_MODEL__SPECIFICATIONS = eINSTANCE.getBusinessProcessModel_Specifications();

		/**
		 * The meta object literal for the '<em><b>Organisational Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_MODEL__ORGANISATIONAL_UNIT = eINSTANCE.getBusinessProcessModel_OrganisationalUnit();

		/**
		 * The meta object literal for the '<em><b>Business Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_PROCESS_MODEL__BUSINESS_PROCESS = eINSTANCE.getBusinessProcessModel_BusinessProcess();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.EconomicEventImpl <em>Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.EconomicEventImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicEvent()
		 * @generated
		 */
		EClass ECONOMIC_EVENT = eINSTANCE.getEconomicEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONOMIC_EVENT__TYPE = eINSTANCE.getEconomicEvent_Type();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.EconomicResourceImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicResource()
		 * @generated
		 */
		EClass ECONOMIC_RESOURCE = eINSTANCE.getEconomicResource();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.EconomicAgentImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicAgent()
		 * @generated
		 */
		EClass ECONOMIC_AGENT = eINSTANCE.getEconomicAgent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.CommitmentImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.specificationImpl <em>specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.specificationImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getspecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getspecification();

		/**
		 * The meta object literal for the '<em><b>Commitment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__COMMITMENT = eINSTANCE.getspecification_Commitment();

		/**
		 * The meta object literal for the '<em><b>Economic Resouce</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ECONOMIC_RESOUCE = eINSTANCE.getspecification_EconomicResouce();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.stockflowImpl <em>stockflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.stockflowImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getstockflow()
		 * @generated
		 */
		EClass STOCKFLOW = eINSTANCE.getstockflow();

		/**
		 * The meta object literal for the '<em><b>Economic Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCKFLOW__ECONOMIC_EVENT = eINSTANCE.getstockflow_EconomicEvent();

		/**
		 * The meta object literal for the '<em><b>Economic Resouce</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCKFLOW__ECONOMIC_RESOUCE = eINSTANCE.getstockflow_EconomicResouce();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.fulfillmentImpl <em>fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.fulfillmentImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getfulfillment()
		 * @generated
		 */
		EClass FULFILLMENT = eINSTANCE.getfulfillment();

		/**
		 * The meta object literal for the '<em><b>Economic Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__ECONOMIC_EVENT = eINSTANCE.getfulfillment_EconomicEvent();

		/**
		 * The meta object literal for the '<em><b>Commitment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FULFILLMENT__COMMITMENT = eINSTANCE.getfulfillment_Commitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.impl.participationImpl <em>participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.impl.participationImpl
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getparticipation()
		 * @generated
		 */
		EClass PARTICIPATION = eINSTANCE.getparticipation();

		/**
		 * The meta object literal for the '<em><b>Economic Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPATION__ECONOMIC_AGENT = eINSTANCE.getparticipation_EconomicAgent();

		/**
		 * The meta object literal for the '<em><b>Economic Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPATION__ECONOMIC_EVENT = eINSTANCE.getparticipation_EconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BPM.EconomicEventType <em>Economic Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BPM.EconomicEventType
		 * @see REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl#getEconomicEventType()
		 * @generated
		 */
		EEnum ECONOMIC_EVENT_TYPE = eINSTANCE.getEconomicEventType();

	}

} //REA_EML_BPMPackage
