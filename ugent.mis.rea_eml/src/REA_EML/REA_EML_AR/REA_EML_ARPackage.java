/**
 */
package REA_EML.REA_EML_AR;

import REA_EML.REA_EMLPackage;

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
 * @see REA_EML.REA_EML_AR.REA_EML_ARFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_ARPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_AR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_AR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_AR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_ARPackage eINSTANCE = REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.EconomicEventImpl <em>Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.EconomicEventImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicEvent()
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
	 * The number of structural features of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.IncrementEconomicEventImpl <em>Increment Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.IncrementEconomicEventImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getIncrementEconomicEvent()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.DecrementEconomicEventImpl <em>Decrement Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.DecrementEconomicEventImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getDecrementEconomicEvent()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.dualityImpl <em>duality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.dualityImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getduality()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.CommitmentImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getCommitment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.IncrementCommitmentImpl <em>Increment Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.IncrementCommitmentImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getIncrementCommitment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.DecrementCommitmentImpl <em>Decrement Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.DecrementCommitmentImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getDecrementCommitment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.reciprocityImpl <em>reciprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.reciprocityImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getreciprocity()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.REA_EML_ARMImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARMImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getREA_EML_ARM()
	 * @generated
	 */
	int REA_EML_AR_M = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Economic Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ECONOMIC_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ECONOMIC_RESOURCES = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Economic Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ECONOMIC_AGENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__DUALITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commitments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__COMMITMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reciprocities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__RECIPROCITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stockflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__STOCKFLOWS = REA_EMLPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__PARTICIPATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__FULFILLMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__SPECIFICATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organisational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__ORGANISATIONAL_UNIT = REA_EMLPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Business Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M__BUSINESS_PROCESS = REA_EMLPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_AR_M_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.EconomicResourceImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicResource()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.EconomicAgentImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicAgent()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.specificationImpl <em>specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.specificationImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getspecification()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.stockflowImpl <em>stockflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.stockflowImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getstockflow()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.fulfillmentImpl <em>fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.fulfillmentImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getfulfillment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_AR.impl.participationImpl <em>participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_AR.impl.participationImpl
	 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getparticipation()
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
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.IncrementEconomicEvent <em>Increment Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.IncrementEconomicEvent
	 * @generated
	 */
	EClass getIncrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.DecrementEconomicEvent <em>Decrement Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.DecrementEconomicEvent
	 * @generated
	 */
	EClass getDecrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duality</em>'.
	 * @see REA_EML.REA_EML_AR.duality
	 * @generated
	 */
	EClass getduality();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.duality#getDecrementEconomicEvent <em>Decrement Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decrement Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.duality#getDecrementEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_DecrementEconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.duality#getIncrementEconomicEvent <em>Increment Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.duality#getIncrementEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_IncrementEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.IncrementCommitment <em>Increment Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.IncrementCommitment
	 * @generated
	 */
	EClass getIncrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.DecrementCommitment <em>Decrement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decrement Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.DecrementCommitment
	 * @generated
	 */
	EClass getDecrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.reciprocity <em>reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>reciprocity</em>'.
	 * @see REA_EML.REA_EML_AR.reciprocity
	 * @generated
	 */
	EClass getreciprocity();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.reciprocity#getDecrementCommitment <em>Decrement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Decrement Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.reciprocity#getDecrementCommitment()
	 * @see #getreciprocity()
	 * @generated
	 */
	EReference getreciprocity_DecrementCommitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.reciprocity#getIncrementCommitment <em>Increment Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.reciprocity#getIncrementCommitment()
	 * @see #getreciprocity()
	 * @generated
	 */
	EReference getreciprocity_IncrementCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.REA_EML_ARM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM
	 * @generated
	 */
	EClass getREA_EML_ARM();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicEvents <em>Economic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Events</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicEvents()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_EconomicEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicResources <em>Economic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Resources</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicResources()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_EconomicResources();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicAgents <em>Economic Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Agents</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicAgents()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_EconomicAgents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getDualities <em>Dualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dualities</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getDualities()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Dualities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getCommitments <em>Commitments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commitments</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getCommitments()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Commitments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getReciprocities <em>Reciprocities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reciprocities</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getReciprocities()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Reciprocities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getStockflows <em>Stockflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stockflows</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getStockflows()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Stockflows();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getParticipations <em>Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participations</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getParticipations()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Participations();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getFulfillments()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Fulfillments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getSpecifications()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EReference getREA_EML_ARM_Specifications();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getOrganisationalUnit <em>Organisational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisational Unit</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getOrganisationalUnit()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EAttribute getREA_EML_ARM_OrganisationalUnit();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getBusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Process</em>'.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM#getBusinessProcess()
	 * @see #getREA_EML_ARM()
	 * @generated
	 */
	EAttribute getREA_EML_ARM_BusinessProcess();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.EconomicEvent
	 * @generated
	 */
	EClass getEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Resource</em>'.
	 * @see REA_EML.REA_EML_AR.EconomicResource
	 * @generated
	 */
	EClass getEconomicResource();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_AR.EconomicAgent
	 * @generated
	 */
	EClass getEconomicAgent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specification</em>'.
	 * @see REA_EML.REA_EML_AR.specification
	 * @generated
	 */
	EClass getspecification();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.specification#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.specification#getCommitment()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_Commitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.specification#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_AR.specification#getEconomicResouce()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stockflow</em>'.
	 * @see REA_EML.REA_EML_AR.stockflow
	 * @generated
	 */
	EClass getstockflow();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.stockflow#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.stockflow#getEconomicEvent()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.stockflow#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_AR.stockflow#getEconomicResouce()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fulfillment</em>'.
	 * @see REA_EML.REA_EML_AR.fulfillment
	 * @generated
	 */
	EClass getfulfillment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.fulfillment#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.fulfillment#getEconomicEvent()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.fulfillment#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_AR.fulfillment#getCommitment()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_AR.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>participation</em>'.
	 * @see REA_EML.REA_EML_AR.participation
	 * @generated
	 */
	EClass getparticipation();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.participation#getEconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_AR.participation#getEconomicAgent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicAgent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_AR.participation#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_AR.participation#getEconomicEvent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_ARFactory getREA_EML_ARFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.IncrementEconomicEventImpl <em>Increment Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.IncrementEconomicEventImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getIncrementEconomicEvent()
		 * @generated
		 */
		EClass INCREMENT_ECONOMIC_EVENT = eINSTANCE.getIncrementEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.DecrementEconomicEventImpl <em>Decrement Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.DecrementEconomicEventImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getDecrementEconomicEvent()
		 * @generated
		 */
		EClass DECREMENT_ECONOMIC_EVENT = eINSTANCE.getDecrementEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.dualityImpl <em>duality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.dualityImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getduality()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.IncrementCommitmentImpl <em>Increment Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.IncrementCommitmentImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getIncrementCommitment()
		 * @generated
		 */
		EClass INCREMENT_COMMITMENT = eINSTANCE.getIncrementCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.DecrementCommitmentImpl <em>Decrement Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.DecrementCommitmentImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getDecrementCommitment()
		 * @generated
		 */
		EClass DECREMENT_COMMITMENT = eINSTANCE.getDecrementCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.reciprocityImpl <em>reciprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.reciprocityImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getreciprocity()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.REA_EML_ARMImpl <em>M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARMImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getREA_EML_ARM()
		 * @generated
		 */
		EClass REA_EML_AR_M = eINSTANCE.getREA_EML_ARM();

		/**
		 * The meta object literal for the '<em><b>Economic Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__ECONOMIC_EVENTS = eINSTANCE.getREA_EML_ARM_EconomicEvents();

		/**
		 * The meta object literal for the '<em><b>Economic Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__ECONOMIC_RESOURCES = eINSTANCE.getREA_EML_ARM_EconomicResources();

		/**
		 * The meta object literal for the '<em><b>Economic Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__ECONOMIC_AGENTS = eINSTANCE.getREA_EML_ARM_EconomicAgents();

		/**
		 * The meta object literal for the '<em><b>Dualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__DUALITIES = eINSTANCE.getREA_EML_ARM_Dualities();

		/**
		 * The meta object literal for the '<em><b>Commitments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__COMMITMENTS = eINSTANCE.getREA_EML_ARM_Commitments();

		/**
		 * The meta object literal for the '<em><b>Reciprocities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__RECIPROCITIES = eINSTANCE.getREA_EML_ARM_Reciprocities();

		/**
		 * The meta object literal for the '<em><b>Stockflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__STOCKFLOWS = eINSTANCE.getREA_EML_ARM_Stockflows();

		/**
		 * The meta object literal for the '<em><b>Participations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__PARTICIPATIONS = eINSTANCE.getREA_EML_ARM_Participations();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__FULFILLMENTS = eINSTANCE.getREA_EML_ARM_Fulfillments();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_AR_M__SPECIFICATIONS = eINSTANCE.getREA_EML_ARM_Specifications();

		/**
		 * The meta object literal for the '<em><b>Organisational Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REA_EML_AR_M__ORGANISATIONAL_UNIT = eINSTANCE.getREA_EML_ARM_OrganisationalUnit();

		/**
		 * The meta object literal for the '<em><b>Business Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REA_EML_AR_M__BUSINESS_PROCESS = eINSTANCE.getREA_EML_ARM_BusinessProcess();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.EconomicEventImpl <em>Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.EconomicEventImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicEvent()
		 * @generated
		 */
		EClass ECONOMIC_EVENT = eINSTANCE.getEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.EconomicResourceImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicResource()
		 * @generated
		 */
		EClass ECONOMIC_RESOURCE = eINSTANCE.getEconomicResource();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.EconomicAgentImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getEconomicAgent()
		 * @generated
		 */
		EClass ECONOMIC_AGENT = eINSTANCE.getEconomicAgent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.CommitmentImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.specificationImpl <em>specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.specificationImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getspecification()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.stockflowImpl <em>stockflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.stockflowImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getstockflow()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.fulfillmentImpl <em>fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.fulfillmentImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getfulfillment()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_AR.impl.participationImpl <em>participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_AR.impl.participationImpl
		 * @see REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl#getparticipation()
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

	}

} //REA_EML_ARPackage
