/**
 */
package REA_EML.REA_EML_BE.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_AR.REA_EML_ARPackage;

import REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl;

import REA_EML.REA_EML_BC.REA_EML_BCPackage;

import REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl;

import REA_EML.REA_EML_BE.Attribute;
import REA_EML.REA_EML_BE.BusinessEntity;
import REA_EML.REA_EML_BE.BusinessRelationship;
import REA_EML.REA_EML_BE.PolicyEntity;
import REA_EML.REA_EML_BE.PolicyRelationship;
import REA_EML.REA_EML_BE.PolicyRelationshipType;
import REA_EML.REA_EML_BE.REA_EML_BEFactory;
import REA_EML.REA_EML_BE.REA_EML_BEM;
import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl;

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
public class REA_EML_BEPackageImpl extends EPackageImpl implements REA_EML_BEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reA_EML_BEMEClass = null;

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
	private EClass businessRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyRelationshipTypeEEnum = null;

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
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BEPackageImpl() {
		super(eNS_URI, REA_EML_BEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BEPackage init() {
		if (isInited) return (REA_EML_BEPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BEPackageImpl theREA_EML_BEPackage = (REA_EML_BEPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BEPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BEPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_ARPackageImpl theREA_EML_ARPackage = (REA_EML_ARPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) instanceof REA_EML_ARPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) : REA_EML_ARPackage.eINSTANCE);
		REA_EML_BCPackageImpl theREA_EML_BCPackage = (REA_EML_BCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) instanceof REA_EML_BCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) : REA_EML_BCPackage.eINSTANCE);
		REA_EML_BPPackageImpl theREA_EML_BPPackage = (REA_EML_BPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) instanceof REA_EML_BPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) : REA_EML_BPPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BEPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_ARPackage.createPackageContents();
		theREA_EML_BCPackage.createPackageContents();
		theREA_EML_BPPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BEPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_ARPackage.initializePackageContents();
		theREA_EML_BCPackage.initializePackageContents();
		theREA_EML_BPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BEPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BEPackage.eNS_URI, theREA_EML_BEPackage);
		return theREA_EML_BEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREA_EML_BEM() {
		return reA_EML_BEMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BEM_BusinessEntities() {
		return (EReference)reA_EML_BEMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BEM_BusinessRelationships() {
		return (EReference)reA_EML_BEMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREA_EML_BEM_BusinessEvents() {
		return (EReference)reA_EML_BEMEClass.getEStructuralFeatures().get(2);
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
	public EReference getBusinessEntity_Attributes() {
		return (EReference)businessEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRelationship() {
		return businessRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRelationship_Target() {
		return (EReference)businessRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRelationship_Source() {
		return (EReference)businessRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEntity() {
		return policyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyRelationship() {
		return policyRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicyRelationship_PolicyRelationshipType() {
		return (EAttribute)policyRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyRelationship_PolicyEntity() {
		return (EReference)policyRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicyRelationship_BusinessEntity() {
		return (EReference)policyRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicyRelationshipType() {
		return policyRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BEFactory getREA_EML_BEFactory() {
		return (REA_EML_BEFactory)getEFactoryInstance();
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
		reA_EML_BEMEClass = createEClass(REA_EML_BE_M);
		createEReference(reA_EML_BEMEClass, REA_EML_BE_M__BUSINESS_ENTITIES);
		createEReference(reA_EML_BEMEClass, REA_EML_BE_M__BUSINESS_RELATIONSHIPS);
		createEReference(reA_EML_BEMEClass, REA_EML_BE_M__BUSINESS_EVENTS);

		businessEntityEClass = createEClass(BUSINESS_ENTITY);
		createEReference(businessEntityEClass, BUSINESS_ENTITY__ATTRIBUTES);

		businessRelationshipEClass = createEClass(BUSINESS_RELATIONSHIP);
		createEReference(businessRelationshipEClass, BUSINESS_RELATIONSHIP__TARGET);
		createEReference(businessRelationshipEClass, BUSINESS_RELATIONSHIP__SOURCE);

		attributeEClass = createEClass(ATTRIBUTE);

		policyEntityEClass = createEClass(POLICY_ENTITY);

		policyRelationshipEClass = createEClass(POLICY_RELATIONSHIP);
		createEAttribute(policyRelationshipEClass, POLICY_RELATIONSHIP__POLICY_RELATIONSHIP_TYPE);
		createEReference(policyRelationshipEClass, POLICY_RELATIONSHIP__POLICY_ENTITY);
		createEReference(policyRelationshipEClass, POLICY_RELATIONSHIP__BUSINESS_ENTITY);

		// Create enums
		policyRelationshipTypeEEnum = createEEnum(POLICY_RELATIONSHIP_TYPE);
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
		REA_EML_BPPackage theREA_EML_BPPackage = (REA_EML_BPPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		reA_EML_BEMEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
		businessEntityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		businessRelationshipEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		attributeEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		policyEntityEClass.getESuperTypes().add(this.getBusinessEntity());
		policyRelationshipEClass.getESuperTypes().add(this.getBusinessRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(reA_EML_BEMEClass, REA_EML_BEM.class, "REA_EML_BEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREA_EML_BEM_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 0, -1, REA_EML_BEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BEM_BusinessRelationships(), this.getBusinessRelationship(), null, "businessRelationships", null, 0, -1, REA_EML_BEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREA_EML_BEM_BusinessEvents(), theREA_EML_BPPackage.getBusinessEvent(), null, "businessEvents", null, 0, -1, REA_EML_BEM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessEntityEClass, BusinessEntity.class, "BusinessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessRelationshipEClass, BusinessRelationship.class, "BusinessRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessRelationship_Target(), this.getBusinessEntity(), null, "target", null, 1, 1, BusinessRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessRelationship_Source(), this.getBusinessEntity(), null, "source", null, 1, 1, BusinessRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyEntityEClass, PolicyEntity.class, "PolicyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyRelationshipEClass, PolicyRelationship.class, "PolicyRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicyRelationship_PolicyRelationshipType(), this.getPolicyRelationshipType(), "policyRelationshipType", null, 0, 1, PolicyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyRelationship_PolicyEntity(), this.getPolicyEntity(), null, "policyEntity", null, 1, 1, PolicyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicyRelationship_BusinessEntity(), this.getBusinessEntity(), null, "businessEntity", null, 1, 1, PolicyRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(policyRelationshipTypeEEnum, PolicyRelationshipType.class, "PolicyRelationshipType");
		addEEnumLiteral(policyRelationshipTypeEEnum, PolicyRelationshipType.TYPIFICATION);
		addEEnumLiteral(policyRelationshipTypeEEnum, PolicyRelationshipType.GROUPING);
	}

} //REA_EML_BEPackageImpl
