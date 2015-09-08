/**
 */
package REA_EML.REA_EML_BC;

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
 * @see REA_EML.REA_EML_BC.REA_EML_BCFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_BC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BCPackage eINSTANCE = REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.REA_EML_BCMImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCMImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getREA_EML_BCM()
	 * @generated
	 */
	int REA_EML_BC_M = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Economic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__ECONOMIC_RESOURCES = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__ECONOMIC_AGENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Economic Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__ECONOMIC_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commitments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__COMMITMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__DUALITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stockflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__STOCKFLOWS = REA_EMLPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__PARTICIPATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__FULFILLMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__SPECIFICATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reciprocities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M__RECIPROCITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BC_M_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.EconomicResourceImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicResource()
	 * @generated
	 */
	int ECONOMIC_RESOURCE = 1;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.EconomicEventImpl <em>Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.EconomicEventImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicEvent()
	 * @generated
	 */
	int ECONOMIC_EVENT = 2;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.EconomicAgentImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicAgent()
	 * @generated
	 */
	int ECONOMIC_AGENT = 3;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.CommitmentImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getCommitment()
	 * @generated
	 */
	int COMMITMENT = 4;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.specificationImpl <em>specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.specificationImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getspecification()
	 * @generated
	 */
	int SPECIFICATION = 5;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.stockflowImpl <em>stockflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.stockflowImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getstockflow()
	 * @generated
	 */
	int STOCKFLOW = 6;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.fulfillmentImpl <em>fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.fulfillmentImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getfulfillment()
	 * @generated
	 */
	int FULFILLMENT = 7;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.participationImpl <em>participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.participationImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getparticipation()
	 * @generated
	 */
	int PARTICIPATION = 8;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.dualityImpl <em>duality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.dualityImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getduality()
	 * @generated
	 */
	int DUALITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY__ECONOMIC_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>duality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>duality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUALITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.recicprocityImpl <em>recicprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.recicprocityImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getrecicprocity()
	 * @generated
	 */
	int RECICPROCITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECICPROCITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Commitment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECICPROCITY__COMMITMENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>recicprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECICPROCITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>recicprocity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECICPROCITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.providesImpl <em>provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.providesImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getprovides()
	 * @generated
	 */
	int PROVIDES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__NAME = PARTICIPATION__NAME;

	/**
	 * The feature id for the '<em><b>Economic Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__ECONOMIC_AGENT = PARTICIPATION__ECONOMIC_AGENT;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__ECONOMIC_EVENT = PARTICIPATION__ECONOMIC_EVENT;

	/**
	 * The number of structural features of the '<em>provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_FEATURE_COUNT = PARTICIPATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_OPERATION_COUNT = PARTICIPATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BC.impl.receivesImpl <em>receives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BC.impl.receivesImpl
	 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getreceives()
	 * @generated
	 */
	int RECEIVES = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES__NAME = PARTICIPATION__NAME;

	/**
	 * The feature id for the '<em><b>Economic Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES__ECONOMIC_AGENT = PARTICIPATION__ECONOMIC_AGENT;

	/**
	 * The feature id for the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES__ECONOMIC_EVENT = PARTICIPATION__ECONOMIC_EVENT;

	/**
	 * The number of structural features of the '<em>receives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES_FEATURE_COUNT = PARTICIPATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>receives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES_OPERATION_COUNT = PARTICIPATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.REA_EML_BCM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM
	 * @generated
	 */
	EClass getREA_EML_BCM();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicResources <em>Economic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Resources</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicResources()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_EconomicResources();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicAgents <em>Economic Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Agents</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicAgents()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_EconomicAgents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicEvents <em>Economic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Events</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicEvents()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_EconomicEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getCommitments <em>Commitments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commitments</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getCommitments()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Commitments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getDualities <em>Dualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dualities</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getDualities()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Dualities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getStockflows <em>Stockflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stockflows</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getStockflows()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Stockflows();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getParticipations <em>Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participations</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getParticipations()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Participations();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getFulfillments()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Fulfillments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getSpecifications()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Specifications();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BC.REA_EML_BCM#getReciprocities <em>Reciprocities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reciprocities</em>'.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM#getReciprocities()
	 * @see #getREA_EML_BCM()
	 * @generated
	 */
	EReference getREA_EML_BCM_Reciprocities();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Resource</em>'.
	 * @see REA_EML.REA_EML_BC.EconomicResource
	 * @generated
	 */
	EClass getEconomicResource();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BC.EconomicEvent
	 * @generated
	 */
	EClass getEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BC.EconomicAgent
	 * @generated
	 */
	EClass getEconomicAgent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BC.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specification</em>'.
	 * @see REA_EML.REA_EML_BC.specification
	 * @generated
	 */
	EClass getspecification();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.specification#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BC.specification#getCommitment()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_Commitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.specification#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BC.specification#getEconomicResouce()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stockflow</em>'.
	 * @see REA_EML.REA_EML_BC.stockflow
	 * @generated
	 */
	EClass getstockflow();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.stockflow#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BC.stockflow#getEconomicEvent()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.stockflow#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BC.stockflow#getEconomicResouce()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fulfillment</em>'.
	 * @see REA_EML.REA_EML_BC.fulfillment
	 * @generated
	 */
	EClass getfulfillment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.fulfillment#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BC.fulfillment#getEconomicEvent()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.fulfillment#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BC.fulfillment#getCommitment()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>participation</em>'.
	 * @see REA_EML.REA_EML_BC.participation
	 * @generated
	 */
	EClass getparticipation();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.participation#getEconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BC.participation#getEconomicAgent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicAgent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BC.participation#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BC.participation#getEconomicEvent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duality</em>'.
	 * @see REA_EML.REA_EML_BC.duality
	 * @generated
	 */
	EClass getduality();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BC.duality#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BC.duality#getEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_EconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.recicprocity <em>recicprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recicprocity</em>'.
	 * @see REA_EML.REA_EML_BC.recicprocity
	 * @generated
	 */
	EClass getrecicprocity();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BC.recicprocity#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BC.recicprocity#getCommitment()
	 * @see #getrecicprocity()
	 * @generated
	 */
	EReference getrecicprocity_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.provides <em>provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>provides</em>'.
	 * @see REA_EML.REA_EML_BC.provides
	 * @generated
	 */
	EClass getprovides();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BC.receives <em>receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>receives</em>'.
	 * @see REA_EML.REA_EML_BC.receives
	 * @generated
	 */
	EClass getreceives();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BCFactory getREA_EML_BCFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.REA_EML_BCMImpl <em>M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCMImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getREA_EML_BCM()
		 * @generated
		 */
		EClass REA_EML_BC_M = eINSTANCE.getREA_EML_BCM();

		/**
		 * The meta object literal for the '<em><b>Economic Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__ECONOMIC_RESOURCES = eINSTANCE.getREA_EML_BCM_EconomicResources();

		/**
		 * The meta object literal for the '<em><b>Economic Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__ECONOMIC_AGENTS = eINSTANCE.getREA_EML_BCM_EconomicAgents();

		/**
		 * The meta object literal for the '<em><b>Economic Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__ECONOMIC_EVENTS = eINSTANCE.getREA_EML_BCM_EconomicEvents();

		/**
		 * The meta object literal for the '<em><b>Commitments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__COMMITMENTS = eINSTANCE.getREA_EML_BCM_Commitments();

		/**
		 * The meta object literal for the '<em><b>Dualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__DUALITIES = eINSTANCE.getREA_EML_BCM_Dualities();

		/**
		 * The meta object literal for the '<em><b>Stockflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__STOCKFLOWS = eINSTANCE.getREA_EML_BCM_Stockflows();

		/**
		 * The meta object literal for the '<em><b>Participations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__PARTICIPATIONS = eINSTANCE.getREA_EML_BCM_Participations();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__FULFILLMENTS = eINSTANCE.getREA_EML_BCM_Fulfillments();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__SPECIFICATIONS = eINSTANCE.getREA_EML_BCM_Specifications();

		/**
		 * The meta object literal for the '<em><b>Reciprocities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BC_M__RECIPROCITIES = eINSTANCE.getREA_EML_BCM_Reciprocities();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.EconomicResourceImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicResource()
		 * @generated
		 */
		EClass ECONOMIC_RESOURCE = eINSTANCE.getEconomicResource();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.EconomicEventImpl <em>Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.EconomicEventImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicEvent()
		 * @generated
		 */
		EClass ECONOMIC_EVENT = eINSTANCE.getEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.EconomicAgentImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getEconomicAgent()
		 * @generated
		 */
		EClass ECONOMIC_AGENT = eINSTANCE.getEconomicAgent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.CommitmentImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.specificationImpl <em>specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.specificationImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getspecification()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.stockflowImpl <em>stockflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.stockflowImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getstockflow()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.fulfillmentImpl <em>fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.fulfillmentImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getfulfillment()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.participationImpl <em>participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.participationImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getparticipation()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.dualityImpl <em>duality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.dualityImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getduality()
		 * @generated
		 */
		EClass DUALITY = eINSTANCE.getduality();

		/**
		 * The meta object literal for the '<em><b>Economic Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUALITY__ECONOMIC_EVENT = eINSTANCE.getduality_EconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.recicprocityImpl <em>recicprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.recicprocityImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getrecicprocity()
		 * @generated
		 */
		EClass RECICPROCITY = eINSTANCE.getrecicprocity();

		/**
		 * The meta object literal for the '<em><b>Commitment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECICPROCITY__COMMITMENT = eINSTANCE.getrecicprocity_Commitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.providesImpl <em>provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.providesImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getprovides()
		 * @generated
		 */
		EClass PROVIDES = eINSTANCE.getprovides();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BC.impl.receivesImpl <em>receives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BC.impl.receivesImpl
		 * @see REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl#getreceives()
		 * @generated
		 */
		EClass RECEIVES = eINSTANCE.getreceives();

	}

} //REA_EML_BCPackage
