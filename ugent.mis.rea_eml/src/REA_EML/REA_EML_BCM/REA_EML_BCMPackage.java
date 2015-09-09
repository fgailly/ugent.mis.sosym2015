/**
 */
package REA_EML.REA_EML_BCM;

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
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BCMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BCM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_BCM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BCM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BCMPackage eINSTANCE = REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl <em>Business Collaboration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getBusinessCollaborationModel()
	 * @generated
	 */
	int BUSINESS_COLLABORATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Economic Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Economic Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Economic Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commitments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__COMMITMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__DUALITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stockflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__STOCKFLOWS = REA_EMLPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Participations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fulfillments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__FULFILLMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS = REA_EMLPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reciprocities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL__RECIPROCITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Business Collaboration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Business Collaboration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_COLLABORATION_MODEL_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.EconomicResourceImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicResource()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.EconomicEventImpl <em>Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.EconomicEventImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicEvent()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.EconomicAgentImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicAgent()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.CommitmentImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getCommitment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.specificationImpl <em>specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.specificationImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getspecification()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.stockflowImpl <em>stockflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.stockflowImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getstockflow()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.fulfillmentImpl <em>fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.fulfillmentImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getfulfillment()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.participationImpl <em>participation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.participationImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getparticipation()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION__TYPE = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>participation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPATION_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.dualityImpl <em>duality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.dualityImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getduality()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.recicprocityImpl <em>recicprocity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.recicprocityImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getrecicprocity()
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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.providesImpl <em>provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.providesImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getprovides()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES__TYPE = PARTICIPATION__TYPE;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.impl.receivesImpl <em>receives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.impl.receivesImpl
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getreceives()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVES__TYPE = PARTICIPATION__TYPE;

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
	 * The meta object id for the '{@link REA_EML.REA_EML_BCM.ParticipationType <em>Participation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BCM.ParticipationType
	 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getParticipationType()
	 * @generated
	 */
	int PARTICIPATION_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel <em>Business Collaboration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Collaboration Model</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel
	 * @generated
	 */
	EClass getBusinessCollaborationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicResources <em>Economic Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Resources</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicResources()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_EconomicResources();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicAgents <em>Economic Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Agents</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicAgents()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_EconomicAgents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicEvents <em>Economic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Economic Events</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicEvents()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_EconomicEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getCommitments <em>Commitments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commitments</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getCommitments()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Commitments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getDualities <em>Dualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dualities</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getDualities()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Dualities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getStockflows <em>Stockflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stockflows</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getStockflows()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Stockflows();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getParticipations <em>Participations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participations</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getParticipations()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Participations();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getFulfillments <em>Fulfillments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fulfillments</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getFulfillments()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Fulfillments();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specifications</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getSpecifications()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Specifications();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getReciprocities <em>Reciprocities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reciprocities</em>'.
	 * @see REA_EML.REA_EML_BCM.BusinessCollaborationModel#getReciprocities()
	 * @see #getBusinessCollaborationModel()
	 * @generated
	 */
	EReference getBusinessCollaborationModel_Reciprocities();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Resource</em>'.
	 * @see REA_EML.REA_EML_BCM.EconomicResource
	 * @generated
	 */
	EClass getEconomicResource();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BCM.EconomicEvent
	 * @generated
	 */
	EClass getEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BCM.EconomicAgent
	 * @generated
	 */
	EClass getEconomicAgent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BCM.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specification</em>'.
	 * @see REA_EML.REA_EML_BCM.specification
	 * @generated
	 */
	EClass getspecification();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.specification#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BCM.specification#getCommitment()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_Commitment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.specification#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BCM.specification#getEconomicResouce()
	 * @see #getspecification()
	 * @generated
	 */
	EReference getspecification_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stockflow</em>'.
	 * @see REA_EML.REA_EML_BCM.stockflow
	 * @generated
	 */
	EClass getstockflow();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.stockflow#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BCM.stockflow#getEconomicEvent()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.stockflow#getEconomicResouce <em>Economic Resouce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Resouce</em>'.
	 * @see REA_EML.REA_EML_BCM.stockflow#getEconomicResouce()
	 * @see #getstockflow()
	 * @generated
	 */
	EReference getstockflow_EconomicResouce();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fulfillment</em>'.
	 * @see REA_EML.REA_EML_BCM.fulfillment
	 * @generated
	 */
	EClass getfulfillment();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.fulfillment#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BCM.fulfillment#getEconomicEvent()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_EconomicEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.fulfillment#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BCM.fulfillment#getCommitment()
	 * @see #getfulfillment()
	 * @generated
	 */
	EReference getfulfillment_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>participation</em>'.
	 * @see REA_EML.REA_EML_BCM.participation
	 * @generated
	 */
	EClass getparticipation();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.participation#getEconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Agent</em>'.
	 * @see REA_EML.REA_EML_BCM.participation#getEconomicAgent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicAgent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BCM.participation#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BCM.participation#getEconomicEvent()
	 * @see #getparticipation()
	 * @generated
	 */
	EReference getparticipation_EconomicEvent();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BCM.participation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see REA_EML.REA_EML_BCM.participation#getType()
	 * @see #getparticipation()
	 * @generated
	 */
	EAttribute getparticipation_Type();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duality</em>'.
	 * @see REA_EML.REA_EML_BCM.duality
	 * @generated
	 */
	EClass getduality();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BCM.duality#getEconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BCM.duality#getEconomicEvent()
	 * @see #getduality()
	 * @generated
	 */
	EReference getduality_EconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.recicprocity <em>recicprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>recicprocity</em>'.
	 * @see REA_EML.REA_EML_BCM.recicprocity
	 * @generated
	 */
	EClass getrecicprocity();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BCM.recicprocity#getCommitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BCM.recicprocity#getCommitment()
	 * @see #getrecicprocity()
	 * @generated
	 */
	EReference getrecicprocity_Commitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.provides <em>provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>provides</em>'.
	 * @see REA_EML.REA_EML_BCM.provides
	 * @generated
	 */
	EClass getprovides();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BCM.receives <em>receives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>receives</em>'.
	 * @see REA_EML.REA_EML_BCM.receives
	 * @generated
	 */
	EClass getreceives();

	/**
	 * Returns the meta object for enum '{@link REA_EML.REA_EML_BCM.ParticipationType <em>Participation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Type</em>'.
	 * @see REA_EML.REA_EML_BCM.ParticipationType
	 * @generated
	 */
	EEnum getParticipationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BCMFactory getREA_EML_BCMFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl <em>Business Collaboration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getBusinessCollaborationModel()
		 * @generated
		 */
		EClass BUSINESS_COLLABORATION_MODEL = eINSTANCE.getBusinessCollaborationModel();

		/**
		 * The meta object literal for the '<em><b>Economic Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES = eINSTANCE.getBusinessCollaborationModel_EconomicResources();

		/**
		 * The meta object literal for the '<em><b>Economic Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS = eINSTANCE.getBusinessCollaborationModel_EconomicAgents();

		/**
		 * The meta object literal for the '<em><b>Economic Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS = eINSTANCE.getBusinessCollaborationModel_EconomicEvents();

		/**
		 * The meta object literal for the '<em><b>Commitments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__COMMITMENTS = eINSTANCE.getBusinessCollaborationModel_Commitments();

		/**
		 * The meta object literal for the '<em><b>Dualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__DUALITIES = eINSTANCE.getBusinessCollaborationModel_Dualities();

		/**
		 * The meta object literal for the '<em><b>Stockflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__STOCKFLOWS = eINSTANCE.getBusinessCollaborationModel_Stockflows();

		/**
		 * The meta object literal for the '<em><b>Participations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS = eINSTANCE.getBusinessCollaborationModel_Participations();

		/**
		 * The meta object literal for the '<em><b>Fulfillments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__FULFILLMENTS = eINSTANCE.getBusinessCollaborationModel_Fulfillments();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS = eINSTANCE.getBusinessCollaborationModel_Specifications();

		/**
		 * The meta object literal for the '<em><b>Reciprocities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_COLLABORATION_MODEL__RECIPROCITIES = eINSTANCE.getBusinessCollaborationModel_Reciprocities();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.EconomicResourceImpl <em>Economic Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.EconomicResourceImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicResource()
		 * @generated
		 */
		EClass ECONOMIC_RESOURCE = eINSTANCE.getEconomicResource();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.EconomicEventImpl <em>Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.EconomicEventImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicEvent()
		 * @generated
		 */
		EClass ECONOMIC_EVENT = eINSTANCE.getEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.EconomicAgentImpl <em>Economic Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.EconomicAgentImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getEconomicAgent()
		 * @generated
		 */
		EClass ECONOMIC_AGENT = eINSTANCE.getEconomicAgent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.CommitmentImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.specificationImpl <em>specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.specificationImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getspecification()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.stockflowImpl <em>stockflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.stockflowImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getstockflow()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.fulfillmentImpl <em>fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.fulfillmentImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getfulfillment()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.participationImpl <em>participation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.participationImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getparticipation()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPATION__TYPE = eINSTANCE.getparticipation_Type();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.dualityImpl <em>duality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.dualityImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getduality()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.recicprocityImpl <em>recicprocity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.recicprocityImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getrecicprocity()
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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.providesImpl <em>provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.providesImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getprovides()
		 * @generated
		 */
		EClass PROVIDES = eINSTANCE.getprovides();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.impl.receivesImpl <em>receives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.impl.receivesImpl
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getreceives()
		 * @generated
		 */
		EClass RECEIVES = eINSTANCE.getreceives();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BCM.ParticipationType <em>Participation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BCM.ParticipationType
		 * @see REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl#getParticipationType()
		 * @generated
		 */
		EEnum PARTICIPATION_TYPE = eINSTANCE.getParticipationType();

	}

} //REA_EML_BCMPackage
