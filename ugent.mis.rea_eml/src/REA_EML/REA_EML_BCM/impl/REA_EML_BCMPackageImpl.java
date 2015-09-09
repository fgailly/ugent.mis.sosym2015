/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_BCM.BusinessCollaborationModel;
import REA_EML.REA_EML_BCM.Commitment;
import REA_EML.REA_EML_BCM.EconomicAgent;
import REA_EML.REA_EML_BCM.EconomicEvent;
import REA_EML.REA_EML_BCM.EconomicResource;
import REA_EML.REA_EML_BCM.ParticipationType;
import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;
import REA_EML.REA_EML_BCM.duality;
import REA_EML.REA_EML_BCM.fulfillment;
import REA_EML.REA_EML_BCM.participation;
import REA_EML.REA_EML_BCM.recicprocity;
import REA_EML.REA_EML_BCM.specification;
import REA_EML.REA_EML_BCM.stockflow;

import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;

import REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl;

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
public class REA_EML_BCMPackageImpl extends EPackageImpl implements REA_EML_BCMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessCollaborationModelEClass = null;

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
	private EEnum participationTypeEEnum = null;

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
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BCMPackageImpl() {
		super(eNS_URI, REA_EML_BCMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BCMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BCMPackage init() {
		if (isInited) return (REA_EML_BCMPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCMPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BCMPackageImpl theREA_EML_BCMPackage = (REA_EML_BCMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BCMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BCMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_BPMPackageImpl theREA_EML_BPMPackage = (REA_EML_BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPMPackage.eNS_URI) instanceof REA_EML_BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPMPackage.eNS_URI) : REA_EML_BPMPackage.eINSTANCE);
		REA_EML_BPolMPackageImpl theREA_EML_BPolMPackage = (REA_EML_BPolMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPolMPackage.eNS_URI) instanceof REA_EML_BPolMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPolMPackage.eNS_URI) : REA_EML_BPolMPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BCMPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_BPMPackage.createPackageContents();
		theREA_EML_BPolMPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BCMPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_BPMPackage.initializePackageContents();
		theREA_EML_BPolMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BCMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BCMPackage.eNS_URI, theREA_EML_BCMPackage);
		return theREA_EML_BCMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessCollaborationModel() {
		return businessCollaborationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_EconomicResources() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_EconomicAgents() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_EconomicEvents() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Commitments() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Dualities() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Stockflows() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Participations() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Fulfillments() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Specifications() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessCollaborationModel_Reciprocities() {
		return (EReference)businessCollaborationModelEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getparticipation_Type() {
		return (EAttribute)participationEClass.getEStructuralFeatures().get(2);
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
	public EEnum getParticipationType() {
		return participationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCMFactory getREA_EML_BCMFactory() {
		return (REA_EML_BCMFactory)getEFactoryInstance();
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
		businessCollaborationModelEClass = createEClass(BUSINESS_COLLABORATION_MODEL);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__COMMITMENTS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__DUALITIES);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__STOCKFLOWS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__FULFILLMENTS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS);
		createEReference(businessCollaborationModelEClass, BUSINESS_COLLABORATION_MODEL__RECIPROCITIES);

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
		createEAttribute(participationEClass, PARTICIPATION__TYPE);

		dualityEClass = createEClass(DUALITY);
		createEReference(dualityEClass, DUALITY__ECONOMIC_EVENT);

		recicprocityEClass = createEClass(RECICPROCITY);
		createEReference(recicprocityEClass, RECICPROCITY__COMMITMENT);

		// Create enums
		participationTypeEEnum = createEEnum(PARTICIPATION_TYPE);
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
		businessCollaborationModelEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
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

		// Initialize classes, features, and operations; add parameters
		initEClass(businessCollaborationModelEClass, BusinessCollaborationModel.class, "BusinessCollaborationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessCollaborationModel_EconomicResources(), this.getEconomicResource(), null, "economicResources", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_EconomicAgents(), this.getEconomicAgent(), null, "economicAgents", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_EconomicEvents(), this.getEconomicEvent(), null, "economicEvents", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Commitments(), this.getCommitment(), null, "commitments", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Dualities(), this.getduality(), null, "dualities", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Stockflows(), this.getstockflow(), null, "stockflows", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Participations(), this.getparticipation(), null, "participations", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Fulfillments(), this.getfulfillment(), null, "fulfillments", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Specifications(), this.getspecification(), null, "specifications", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessCollaborationModel_Reciprocities(), this.getrecicprocity(), null, "reciprocities", null, 0, -1, BusinessCollaborationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(participationEClass, participation.class, "participation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getparticipation_EconomicAgent(), this.getEconomicAgent(), null, "economicAgent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getparticipation_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 1, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getparticipation_Type(), this.getParticipationType(), "type", null, 0, 1, participation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dualityEClass, duality.class, "duality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getduality_EconomicEvent(), this.getEconomicEvent(), null, "economicEvent", null, 2, 2, duality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recicprocityEClass, recicprocity.class, "recicprocity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getrecicprocity_Commitment(), this.getCommitment(), null, "commitment", null, 2, 2, recicprocity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(participationTypeEEnum, ParticipationType.class, "ParticipationType");
		addEEnumLiteral(participationTypeEEnum, ParticipationType.PROVIDE);
		addEEnumLiteral(participationTypeEEnum, ParticipationType.RECEIVE);
	}

} //REA_EML_BCMPackageImpl
