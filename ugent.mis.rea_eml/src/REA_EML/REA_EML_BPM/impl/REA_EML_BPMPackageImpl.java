/**
 */
package REA_EML.REA_EML_BPM.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;

import REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl;

import REA_EML.REA_EML_BPM.BusinessProcessModel;
import REA_EML.REA_EML_BPM.Commitment;
import REA_EML.REA_EML_BPM.DecrementCommitment;
import REA_EML.REA_EML_BPM.DecrementEconomicEvent;
import REA_EML.REA_EML_BPM.EconomicAgent;
import REA_EML.REA_EML_BPM.EconomicEvent;
import REA_EML.REA_EML_BPM.EconomicEventType;
import REA_EML.REA_EML_BPM.EconomicResource;
import REA_EML.REA_EML_BPM.IncrementCommitment;
import REA_EML.REA_EML_BPM.IncrementEconomicEvent;
import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;
import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;
import REA_EML.REA_EML_BPM.duality;
import REA_EML.REA_EML_BPM.fulfillment;
import REA_EML.REA_EML_BPM.participation;
import REA_EML.REA_EML_BPM.reciprocity;
import REA_EML.REA_EML_BPM.specification;
import REA_EML.REA_EML_BPM.stockflow;

import REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage;

import REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMPackageImpl;

import REA_EML.impl.REA_EMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BPMPackageImpl extends EPackageImpl implements REA_EML_BPMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEconomicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decrementEconomicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementCommitmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decrementCommitmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reciprocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessProcessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass economicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass economicResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass economicAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fulfillmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum economicEventTypeEEnum = null;

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
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BPMPackageImpl() {
		super(eNS_URI, REA_EML_BPMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BPMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BPMPackage init() {
		if (isInited) return (REA_EML_BPMPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPMPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BPMPackageImpl theREA_EML_BPMPackage = (REA_EML_BPMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BPMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BPMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_BCMPackageImpl theREA_EML_BCMPackage = (REA_EML_BCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCMPackage.eNS_URI) instanceof REA_EML_BCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCMPackage.eNS_URI) : REA_EML_BCMPackage.eINSTANCE);
		REA_EML_BPolMPackageImpl theREA_EML_BPolMPackage = (REA_EML_BPolMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPolMPackage.eNS_URI) instanceof REA_EML_BPolMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPolMPackage.eNS_URI) : REA_EML_BPolMPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BPMPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_BCMPackage.createPackageContents();
		theREA_EML_BPolMPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BPMPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_BCMPackage.initializePackageContents();
		theREA_EML_BPolMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BPMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BPMPackage.eNS_URI, theREA_EML_BPMPackage);
		return theREA_EML_BPMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrementEconomicEvent() {
		return incrementEconomicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecrementEconomicEvent() {
		return decrementEconomicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getduality() {
		return dualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getduality_DecrementEconomicEvent() {
		return (EReference)dualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getduality_IncrementEconomicEvent() {
		return (EReference)dualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrementCommitment() {
		return incrementCommitmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecrementCommitment() {
		return decrementCommitmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreciprocity() {
		return reciprocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreciprocity_DecrementCommitment() {
		return (EReference)reciprocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreciprocity_IncrementCommitment() {
		return (EReference)reciprocityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessProcessModel() {
		return businessProcessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_EconomicEvents() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_EconomicResources() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_EconomicAgents() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Dualities() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Commitments() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Reciprocities() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Stockflows() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Participations() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Fulfillments() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessProcessModel_Specifications() {
		return (EReference)businessProcessModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessModel_OrganisationalUnit() {
		return (EAttribute)businessProcessModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessProcessModel_BusinessProcess() {
		return (EAttribute)businessProcessModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEconomicEvent() {
		return economicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEconomicEvent_Type() {
		return (EAttribute)economicEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEconomicResource() {
		return economicResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEconomicAgent() {
		return economicAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitment() {
		return commitmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getspecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getspecification_Commitment() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getspecification_EconomicResouce() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstockflow() {
		return stockflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstockflow_EconomicEvent() {
		return (EReference)stockflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getstockflow_EconomicResouce() {
		return (EReference)stockflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfulfillment() {
		return fulfillmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfulfillment_EconomicEvent() {
		return (EReference)fulfillmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfulfillment_Commitment() {
		return (EReference)fulfillmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparticipation() {
		return participationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparticipation_EconomicAgent() {
		return (EReference)participationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparticipation_EconomicEvent() {
		return (EReference)participationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEconomicEventType() {
		return economicEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPMFactory getREA_EML_BPMFactory() {
		return (REA_EML_BPMFactory)getEFactoryInstance();
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
		incrementEconomicEventEClass = createEClass(INCREMENT_ECONOMIC_EVENT);

		decrementEconomicEventEClass = createEClass(DECREMENT_ECONOMIC_EVENT);

		dualityEClass = createEClass(DUALITY);
		createEReference(dualityEClass, DUALITY__DECREMENT_ECONOMIC_EVENT);
		createEReference(dualityEClass, DUALITY__INCREMENT_ECONOMIC_EVENT);

		incrementCommitmentEClass = createEClass(INCREMENT_COMMITMENT);

		decrementCommitmentEClass = createEClass(DECREMENT_COMMITMENT);

		reciprocityEClass = createEClass(RECIPROCITY);
		createEReference(reciprocityEClass, RECIPROCITY__DECREMENT_COMMITMENT);
		createEReference(reciprocityEClass, RECIPROCITY__INCREMENT_COMMITMENT);

		businessProcessModelEClass = createEClass(BUSINESS_PROCESS_MODEL);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__DUALITIES);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__COMMITMENTS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__RECIPROCITIES);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__STOCKFLOWS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__PARTICIPATIONS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__FULFILLMENTS);
		createEReference(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__SPECIFICATIONS);
		createEAttribute(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__ORGANISATIONAL_UNIT);
		createEAttribute(businessProcessModelEClass, BUSINESS_PROCESS_MODEL__BUSINESS_PROCESS);

		economicEventEClass = createEClass(ECONOMIC_EVENT);
		createEAttribute(economicEventEClass, ECONOMIC_EVENT__TYPE);

		economicResourceEClass = createEClass(ECONOMIC_RESOURCE);

		economicAgentEClass = createEClass(ECONOMIC_AGENT);

		commitmentEClass = createEClass(COMMITMENT);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__COMMITMENT);
		createEReference(specificationEClass, SPECIFICATION__ECONOMIC_RESOUCE);

		stockflowEClass = createEClass(STOCKFLOW);
		createEReference(stockflowEClass, STOCKFLOW__ECONOMIC_EVENT);
		createEReference(stockflowEClass, STOCKFLOW__ECONOMIC_RESOUCE);

		fulfillmentEClass = createEClass(FULFILLMENT);
		createEReference(fulfillmentEClass, FULFILLMENT__ECONOMIC_EVENT);
		createEReference(fulfillmentEClass, FULFILLMENT__COMMITMENT);

		participationEClass = createEClass(PARTICIPATION);
		createEReference(participationEClass, PARTICIPATION__ECONOMIC_AGENT);
		createEReference(participationEClass, PARTICIPATION__ECONOMIC_EVENT);

		// Create enums
		economicEventTypeEEnum = createEEnum(ECONOMIC_EVENT_TYPE);
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

		// Obtain other dependent packages
		REA_EMLPackage theREA_EMLPackage = (REA_EMLPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		incrementEconomicEventEClass.getESuperTypes().add(this.getEconomicEvent());
		decrementEconomicEventEClass.getESuperTypes().add(this.getEconomicEvent());
		dualityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		incrementCommitmentEClass.getESuperTypes().add(this.getCommitment());
		decrementCommitmentEClass.getESuperTypes().add(this.getCommitment());
		reciprocityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		businessProcessModelEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
		economicEventEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		economicResourceEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		economicAgentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		commitmentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		specificationEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		stockflowEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		fulfillmentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		participationEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(incrementEconomicEventEClass, IncrementEconomicEvent.class, "IncrementEconomicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decrementEconomicEventEClass, DecrementEconomicEvent.class, "DecrementEconomicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dualityEClass, duality.class, "duality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getduality_DecrementEconomicEvent(), this.getDecrementEconomicEvent(), null, "decrementEconomicEvent", null, 1, 1, duality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getduality_IncrementEconomicEvent(), this.getIncrementEconomicEvent(), null, "incrementEconomicEvent", null, 1, 1, duality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementCommitmentEClass, IncrementCommitment.class, "IncrementCommitment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decrementCommitmentEClass, DecrementCommitment.class, "DecrementCommitment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reciprocityEClass, reciprocity.class, "reciprocity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreciprocity_DecrementCommitment(), this.getDecrementCommitment(), null, "DecrementCommitment", null, 1, 1, reciprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreciprocity_IncrementCommitment(), this.getIncrementCommitment(), null, "IncrementCommitment", null, 1, 1, reciprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessProcessModelEClass, BusinessProcessModel.class, "BusinessProcessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessProcessModel_EconomicEvents(), this.getEconomicEvent(), null, "economicEvents", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_EconomicResources(), this.getEconomicResource(), null, "economicResources", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_EconomicAgents(), this.getEconomicAgent(), null, "economicAgents", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Dualities(), this.getduality(), null, "dualities", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Commitments(), this.getCommitment(), null, "commitments", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Reciprocities(), this.getreciprocity(), null, "reciprocities", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Stockflows(), this.getstockflow(), null, "stockflows", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Participations(), this.getparticipation(), null, "participations", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Fulfillments(), this.getfulfillment(), null, "fulfillments", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessProcessModel_Specifications(), this.getspecification(), null, "specifications", null, 0, -1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessModel_OrganisationalUnit(), ecorePackage.getEString(), "organisationalUnit", null, 0, 1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessProcessModel_BusinessProcess(), ecorePackage.getEString(), "businessProcess", null, 0, 1, BusinessProcessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(economicEventEClass, EconomicEvent.class, "EconomicEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEconomicEvent_Type(), this.getEconomicEventType(), "type", null, 0, 1, EconomicEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(economicResourceEClass, EconomicResource.class, "EconomicResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(economicAgentEClass, EconomicAgent.class, "EconomicAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commitmentEClass, Commitment.class, "Commitment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificationEClass, specification.class, "specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getspecification_Commitment(), this.getCommitment(), null, "commitment", null, 1, 1, specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getspecification_EconomicResouce(), this.getEconomicResource(), null, "economicResouce", null, 1, 1, specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockflowEClass, stockflow.class, "stockflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getstockflow_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 1, 1, stockflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getstockflow_EconomicResouce(), this.getEconomicResource(), null, "economicResouce", null, 1, 1, stockflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fulfillmentEClass, fulfillment.class, "fulfillment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfulfillment_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 1, 1, fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfulfillment_Commitment(), this.getCommitment(), null, "commitment", null, 1, 1, fulfillment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participationEClass, participation.class, "participation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getparticipation_EconomicAgent(), this.getEconomicAgent(), null, "economicAgent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getparticipation_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(economicEventTypeEEnum, EconomicEventType.class, "EconomicEventType");
		addEEnumLiteral(economicEventTypeEEnum, EconomicEventType.TRANSFER);
		addEEnumLiteral(economicEventTypeEEnum, EconomicEventType.TRANSFORMATION);
	}

} //REA_EML_BPMPackageImpl
