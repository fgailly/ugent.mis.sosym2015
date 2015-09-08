/**
 */
package REA_EML.REA_EML_BP;

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
 * @see REA_EML.REA_EML_BP.REA_EML_BPFactory
 * @model kind="package"
 * @generated
 */
public interface REA_EML_BPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "REA_EML_BP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "REA_EML_BP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "REA_EML_BP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BPPackage eINSTANCE = REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl.init();

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl <em>M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getREA_EML_BPM()
	 * @generated
	 */
	int REA_EML_BP_M = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__NAME = REA_EMLPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__ONTOLOGY_URI = REA_EMLPackage.MODEL__ONTOLOGY_URI;

	/**
	 * The feature id for the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__ONTOLOGY_NS = REA_EMLPackage.MODEL__ONTOLOGY_NS;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__BUSINESS_ENTITIES = REA_EMLPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__BUSINESS_EVENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Involvements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__INVOLVEMENTS = REA_EMLPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Business Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M__BUSINESS_PROCESS = REA_EMLPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M_FEATURE_COUNT = REA_EMLPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REA_EML_BP_M_OPERATION_COUNT = REA_EMLPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.BusinessEventImpl <em>Business Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.BusinessEventImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getBusinessEvent()
	 * @generated
	 */
	int BUSINESS_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT__BUSINESS_ENTITIES = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Business Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_EVENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.BusinessEntityImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getBusinessEntity()
	 * @generated
	 */
	int BUSINESS_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Business Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_ENTITY_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.EconomicEventImpl <em>Economic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.EconomicEventImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getEconomicEvent()
	 * @generated
	 */
	int ECONOMIC_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT__NAME = BUSINESS_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT__BUSINESS_ENTITIES = BUSINESS_EVENT__BUSINESS_ENTITIES;

	/**
	 * The number of structural features of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_FEATURE_COUNT = BUSINESS_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Economic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONOMIC_EVENT_OPERATION_COUNT = BUSINESS_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.CommitmentImpl <em>Commitment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.CommitmentImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getCommitment()
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
	int COMMITMENT__NAME = BUSINESS_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT__BUSINESS_ENTITIES = BUSINESS_EVENT__BUSINESS_ENTITIES;

	/**
	 * The number of structural features of the '<em>Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_FEATURE_COUNT = BUSINESS_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commitment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITMENT_OPERATION_COUNT = BUSINESS_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link REA_EML.REA_EML_BP.impl.InvolvementImpl <em>Involvement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see REA_EML.REA_EML_BP.impl.InvolvementImpl
	 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getInvolvement()
	 * @generated
	 */
	int INVOLVEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__NAME = REA_EMLPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Business Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__BUSINESS_EVENT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Business Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT__BUSINESS_ENTITY = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT_FEATURE_COUNT = REA_EMLPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Involvement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVEMENT_OPERATION_COUNT = REA_EMLPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.REA_EML_BPM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>M</em>'.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPM
	 * @generated
	 */
	EClass getREA_EML_BPM();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEntities <em>Business Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Entities</em>'.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEntities()
	 * @see #getREA_EML_BPM()
	 * @generated
	 */
	EReference getREA_EML_BPM_BusinessEntities();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEvents <em>Business Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Events</em>'.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEvents()
	 * @see #getREA_EML_BPM()
	 * @generated
	 */
	EReference getREA_EML_BPM_BusinessEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link REA_EML.REA_EML_BP.REA_EML_BPM#getInvolvements <em>Involvements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Involvements</em>'.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPM#getInvolvements()
	 * @see #getREA_EML_BPM()
	 * @generated
	 */
	EReference getREA_EML_BPM_Involvements();

	/**
	 * Returns the meta object for the attribute '{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessProcess <em>Business Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Process</em>'.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessProcess()
	 * @see #getREA_EML_BPM()
	 * @generated
	 */
	EAttribute getREA_EML_BPM_BusinessProcess();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.BusinessEvent <em>Business Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Event</em>'.
	 * @see REA_EML.REA_EML_BP.BusinessEvent
	 * @generated
	 */
	EClass getBusinessEvent();

	/**
	 * Returns the meta object for the reference list '{@link REA_EML.REA_EML_BP.BusinessEvent#getBusinessEntities <em>Business Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Entities</em>'.
	 * @see REA_EML.REA_EML_BP.BusinessEvent#getBusinessEntities()
	 * @see #getBusinessEvent()
	 * @generated
	 */
	EReference getBusinessEvent_BusinessEntities();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BP.BusinessEntity
	 * @generated
	 */
	EClass getBusinessEntity();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Economic Event</em>'.
	 * @see REA_EML.REA_EML_BP.EconomicEvent
	 * @generated
	 */
	EClass getEconomicEvent();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commitment</em>'.
	 * @see REA_EML.REA_EML_BP.Commitment
	 * @generated
	 */
	EClass getCommitment();

	/**
	 * Returns the meta object for class '{@link REA_EML.REA_EML_BP.Involvement <em>Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvement</em>'.
	 * @see REA_EML.REA_EML_BP.Involvement
	 * @generated
	 */
	EClass getInvolvement();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BP.Involvement#getBusinessEvent <em>Business Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Event</em>'.
	 * @see REA_EML.REA_EML_BP.Involvement#getBusinessEvent()
	 * @see #getInvolvement()
	 * @generated
	 */
	EReference getInvolvement_BusinessEvent();

	/**
	 * Returns the meta object for the reference '{@link REA_EML.REA_EML_BP.Involvement#getBusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Business Entity</em>'.
	 * @see REA_EML.REA_EML_BP.Involvement#getBusinessEntity()
	 * @see #getInvolvement()
	 * @generated
	 */
	EReference getInvolvement_BusinessEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	REA_EML_BPFactory getREA_EML_BPFactory();

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
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl <em>M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getREA_EML_BPM()
		 * @generated
		 */
		EClass REA_EML_BP_M = eINSTANCE.getREA_EML_BPM();

		/**
		 * The meta object literal for the '<em><b>Business Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BP_M__BUSINESS_ENTITIES = eINSTANCE.getREA_EML_BPM_BusinessEntities();

		/**
		 * The meta object literal for the '<em><b>Business Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BP_M__BUSINESS_EVENTS = eINSTANCE.getREA_EML_BPM_BusinessEvents();

		/**
		 * The meta object literal for the '<em><b>Involvements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REA_EML_BP_M__INVOLVEMENTS = eINSTANCE.getREA_EML_BPM_Involvements();

		/**
		 * The meta object literal for the '<em><b>Business Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REA_EML_BP_M__BUSINESS_PROCESS = eINSTANCE.getREA_EML_BPM_BusinessProcess();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.BusinessEventImpl <em>Business Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.BusinessEventImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getBusinessEvent()
		 * @generated
		 */
		EClass BUSINESS_EVENT = eINSTANCE.getBusinessEvent();

		/**
		 * The meta object literal for the '<em><b>Business Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_EVENT__BUSINESS_ENTITIES = eINSTANCE.getBusinessEvent_BusinessEntities();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.BusinessEntityImpl <em>Business Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.BusinessEntityImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getBusinessEntity()
		 * @generated
		 */
		EClass BUSINESS_ENTITY = eINSTANCE.getBusinessEntity();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.EconomicEventImpl <em>Economic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.EconomicEventImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getEconomicEvent()
		 * @generated
		 */
		EClass ECONOMIC_EVENT = eINSTANCE.getEconomicEvent();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.CommitmentImpl <em>Commitment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.CommitmentImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getCommitment()
		 * @generated
		 */
		EClass COMMITMENT = eINSTANCE.getCommitment();

		/**
		 * The meta object literal for the '{@link REA_EML.REA_EML_BP.impl.InvolvementImpl <em>Involvement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see REA_EML.REA_EML_BP.impl.InvolvementImpl
		 * @see REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl#getInvolvement()
		 * @generated
		 */
		EClass INVOLVEMENT = eINSTANCE.getInvolvement();

		/**
		 * The meta object literal for the '<em><b>Business Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVEMENT__BUSINESS_EVENT = eINSTANCE.getInvolvement_BusinessEvent();

		/**
		 * The meta object literal for the '<em><b>Business Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVEMENT__BUSINESS_ENTITY = eINSTANCE.getInvolvement_BusinessEntity();

	}

} //REA_EML_BPPackage
