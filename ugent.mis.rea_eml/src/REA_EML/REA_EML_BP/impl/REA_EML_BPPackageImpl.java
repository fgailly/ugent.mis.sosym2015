/**
 */
package REA_EML.REA_EML_BP.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_AR.REA_EML_ARPackage;

import REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl;

import REA_EML.REA_EML_BC.REA_EML_BCPackage;

import REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl;

import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl;

import REA_EML.REA_EML_BP.BusinessEntity;
import REA_EML.REA_EML_BP.BusinessEvent;
import REA_EML.REA_EML_BP.Commitment;
import REA_EML.REA_EML_BP.EconomicEvent;
import REA_EML.REA_EML_BP.Involvement;
import REA_EML.REA_EML_BP.REA_EML_BPFactory;
import REA_EML.REA_EML_BP.REA_EML_BPM;
import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.impl.REA_EMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class REA_EML_BPPackageImpl extends EPackageImpl implements REA_EML_BPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reA_EML_BPMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessEntityEClass = null;

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
	private EClass commitmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involvementEClass = null;

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
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BPPackageImpl() {
		super(eNS_URI, REA_EML_BPFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BPPackage init() {
		if (isInited) return (REA_EML_BPPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BPPackageImpl theREA_EML_BPPackage = (REA_EML_BPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BPPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_ARPackageImpl theREA_EML_ARPackage = (REA_EML_ARPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) instanceof REA_EML_ARPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) : REA_EML_ARPackage.eINSTANCE);
		REA_EML_BCPackageImpl theREA_EML_BCPackage = (REA_EML_BCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) instanceof REA_EML_BCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) : REA_EML_BCPackage.eINSTANCE);
		REA_EML_BEPackageImpl theREA_EML_BEPackage = (REA_EML_BEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) instanceof REA_EML_BEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) : REA_EML_BEPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BPPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_ARPackage.createPackageContents();
		theREA_EML_BCPackage.createPackageContents();
		theREA_EML_BEPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BPPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_ARPackage.initializePackageContents();
		theREA_EML_BCPackage.initializePackageContents();
		theREA_EML_BEPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BPPackage.eNS_URI, theREA_EML_BPPackage);
		return theREA_EML_BPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREA_EML_BPM() {
		return reA_EML_BPMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BPM_BusinessEntities() {
		return (EReference)reA_EML_BPMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BPM_BusinessEvents() {
		return (EReference)reA_EML_BPMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BPM_Involvements() {
		return (EReference)reA_EML_BPMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREA_EML_BPM_BusinessProcess() {
		return (EAttribute)reA_EML_BPMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessEvent() {
		return businessEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessEvent_BusinessEntities() {
		return (EReference)businessEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessEntity() {
		return businessEntityEClass;
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
	public EClass getCommitment() {
		return commitmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolvement() {
		return involvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvement_BusinessEvent() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvement_BusinessEntity() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPFactory getREA_EML_BPFactory() {
		return (REA_EML_BPFactory)getEFactoryInstance();
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
		reA_EML_BPMEClass = createEClass(REA_EML_BP_M);
		createEReference(reA_EML_BPMEClass, REA_EML_BP_M__BUSINESS_ENTITIES);
		createEReference(reA_EML_BPMEClass, REA_EML_BP_M__BUSINESS_EVENTS);
		createEReference(reA_EML_BPMEClass, REA_EML_BP_M__INVOLVEMENTS);
		createEAttribute(reA_EML_BPMEClass, REA_EML_BP_M__BUSINESS_PROCESS);

		businessEventEClass = createEClass(BUSINESS_EVENT);
		createEReference(businessEventEClass, BUSINESS_EVENT__BUSINESS_ENTITIES);

		businessEntityEClass = createEClass(BUSINESS_ENTITY);

		economicEventEClass = createEClass(ECONOMIC_EVENT);

		commitmentEClass = createEClass(COMMITMENT);

		involvementEClass = createEClass(INVOLVEMENT);
		createEReference(involvementEClass, INVOLVEMENT__BUSINESS_EVENT);
		createEReference(involvementEClass, INVOLVEMENT__BUSINESS_ENTITY);
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
		reA_EML_BPMEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
		businessEventEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		businessEntityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		economicEventEClass.getESuperTypes().add(this.getBusinessEvent());
		commitmentEClass.getESuperTypes().add(this.getBusinessEvent());
		involvementEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(reA_EML_BPMEClass, REA_EML_BPM.class, "REA_EML_BPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREA_EML_BPM_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 0, -1, REA_EML_BPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BPM_BusinessEvents(), this.getBusinessEvent(), null, "businessEvents", null, 0, -1, REA_EML_BPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BPM_Involvements(), this.getInvolvement(), null, "involvements", null, 0, -1, REA_EML_BPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREA_EML_BPM_BusinessProcess(), ecorePackage.getEString(), "businessProcess", null, 0, 1, REA_EML_BPM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessEventEClass, BusinessEvent.class, "BusinessEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessEvent_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 0, -1, BusinessEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessEntityEClass, BusinessEntity.class, "BusinessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(economicEventEClass, EconomicEvent.class, "EconomicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commitmentEClass, Commitment.class, "Commitment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(involvementEClass, Involvement.class, "Involvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolvement_BusinessEvent(), this.getBusinessEvent(), null, "businessEvent", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvolvement_BusinessEntity(), this.getBusinessEntity(), null, "businessEntity", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //REA_EML_BPPackageImpl
