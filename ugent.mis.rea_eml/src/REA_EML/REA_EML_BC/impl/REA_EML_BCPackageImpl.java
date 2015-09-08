/**
 */
package REA_EML.REA_EML_BC.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_AR.REA_EML_ARPackage;

import REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl;

import REA_EML.REA_EML_BC.Commitment;
import REA_EML.REA_EML_BC.EconomicAgent;
import REA_EML.REA_EML_BC.EconomicEvent;
import REA_EML.REA_EML_BC.EconomicResource;
import REA_EML.REA_EML_BC.REA_EML_BCFactory;
import REA_EML.REA_EML_BC.REA_EML_BCM;
import REA_EML.REA_EML_BC.REA_EML_BCPackage;
import REA_EML.REA_EML_BC.duality;
import REA_EML.REA_EML_BC.fulfillment;
import REA_EML.REA_EML_BC.participation;
import REA_EML.REA_EML_BC.provides;
import REA_EML.REA_EML_BC.receives;
import REA_EML.REA_EML_BC.recicprocity;
import REA_EML.REA_EML_BC.specification;
import REA_EML.REA_EML_BC.stockflow;

import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl;

import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl;

import REA_EML.impl.REA_EMLPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BCPackageImpl extends EPackageImpl implements REA_EML_BCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reA_EML_BCMEClass = null;

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
	private EClass economicEventEClass = null;

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
	private EClass dualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recicprocityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receivesEClass = null;

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
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BCPackageImpl() {
		super(eNS_URI, REA_EML_BCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BCPackage init() {
		if (isInited) return (REA_EML_BCPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BCPackageImpl theREA_EML_BCPackage = (REA_EML_BCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BCPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_ARPackageImpl theREA_EML_ARPackage = (REA_EML_ARPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) instanceof REA_EML_ARPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) : REA_EML_ARPackage.eINSTANCE);
		REA_EML_BEPackageImpl theREA_EML_BEPackage = (REA_EML_BEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) instanceof REA_EML_BEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) : REA_EML_BEPackage.eINSTANCE);
		REA_EML_BPPackageImpl theREA_EML_BPPackage = (REA_EML_BPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) instanceof REA_EML_BPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) : REA_EML_BPPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BCPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_ARPackage.createPackageContents();
		theREA_EML_BEPackage.createPackageContents();
		theREA_EML_BPPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BCPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_ARPackage.initializePackageContents();
		theREA_EML_BEPackage.initializePackageContents();
		theREA_EML_BPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BCPackage.eNS_URI, theREA_EML_BCPackage);
		return theREA_EML_BCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREA_EML_BCM() {
		return reA_EML_BCMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_EconomicResources() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_EconomicAgents() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_EconomicEvents() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Commitments() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Dualities() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Stockflows() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Participations() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Fulfillments() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Specifications() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BCM_Reciprocities() {
		return (EReference)reA_EML_BCMEClass.getEStructuralFeatures().get(9);
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
	public EClass getEconomicEvent() {
		return economicEventEClass;
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
	public EClass getduality() {
		return dualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getduality_EconomicEvent() {
		return (EReference)dualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrecicprocity() {
		return recicprocityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getrecicprocity_Commitment() {
		return (EReference)recicprocityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprovides() {
		return providesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreceives() {
		return receivesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCFactory getREA_EML_BCFactory() {
		return (REA_EML_BCFactory)getEFactoryInstance();
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
		reA_EML_BCMEClass = createEClass(REA_EML_BC_M);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__ECONOMIC_RESOURCES);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__ECONOMIC_AGENTS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__ECONOMIC_EVENTS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__COMMITMENTS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__DUALITIES);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__STOCKFLOWS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__PARTICIPATIONS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__FULFILLMENTS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__SPECIFICATIONS);
		createEReference(reA_EML_BCMEClass, REA_EML_BC_M__RECIPROCITIES);

		economicResourceEClass = createEClass(ECONOMIC_RESOURCE);

		economicEventEClass = createEClass(ECONOMIC_EVENT);

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

		dualityEClass = createEClass(DUALITY);
		createEReference(dualityEClass, DUALITY__ECONOMIC_EVENT);

		recicprocityEClass = createEClass(RECICPROCITY);
		createEReference(recicprocityEClass, RECICPROCITY__COMMITMENT);

		providesEClass = createEClass(PROVIDES);

		receivesEClass = createEClass(RECEIVES);
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
		reA_EML_BCMEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
		economicResourceEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		economicEventEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		economicAgentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		commitmentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		specificationEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		stockflowEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		fulfillmentEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		participationEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		dualityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		recicprocityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		providesEClass.getESuperTypes().add(this.getparticipation());
		receivesEClass.getESuperTypes().add(this.getparticipation());

		// Initialize classes, features, and operations; add parameters
		initEClass(reA_EML_BCMEClass, REA_EML_BCM.class, "REA_EML_BCM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREA_EML_BCM_EconomicResources(), this.getEconomicResource(), null, "economicResources", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_EconomicAgents(), this.getEconomicAgent(), null, "economicAgents", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_EconomicEvents(), this.getEconomicEvent(), null, "economicEvents", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Commitments(), this.getCommitment(), null, "commitments", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Dualities(), this.getduality(), null, "dualities", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Stockflows(), this.getstockflow(), null, "stockflows", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Participations(), this.getparticipation(), null, "participations", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Fulfillments(), this.getfulfillment(), null, "fulfillments", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Specifications(), this.getspecification(), null, "specifications", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BCM_Reciprocities(), this.getrecicprocity(), null, "reciprocities", null, 0, -1, REA_EML_BCM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(economicResourceEClass, EconomicResource.class, "EconomicResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(economicEventEClass, EconomicEvent.class, "EconomicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(participationEClass, participation.class, "participation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getparticipation_EconomicAgent(), this.getEconomicAgent(), null, "economicAgent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getparticipation_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dualityEClass, duality.class, "duality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getduality_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 2, 2, duality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recicprocityEClass, recicprocity.class, "recicprocity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getrecicprocity_Commitment(), this.getCommitment(), null, "commitment", null, 2, 2, recicprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providesEClass, provides.class, "provides", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receivesEClass, receives.class, "receives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //REA_EML_BCPackageImpl
