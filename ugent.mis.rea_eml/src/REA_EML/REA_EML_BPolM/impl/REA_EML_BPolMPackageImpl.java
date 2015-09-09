/**
 */
package REA_EML.REA_EML_BPolM.impl;

import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;

import REA_EML.REA_EML_BCM.impl.REA_EML_BCMPackageImpl;

import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;

import REA_EML.REA_EML_BPM.impl.REA_EML_BPMPackageImpl;

import REA_EML.REA_EML_BPolM.Attribute;
import REA_EML.REA_EML_BPolM.BusinessEntity;
import REA_EML.REA_EML_BPolM.BusinessPolicyModel;
import REA_EML.REA_EML_BPolM.BusinessRelationship;
import REA_EML.REA_EML_BPolM.Grouping;
import REA_EML.REA_EML_BPolM.PolicyEntityGroup;
import REA_EML.REA_EML_BPolM.PolicyEntityType;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage;
import REA_EML.REA_EML_BPolM.Typification;

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
public class REA_EML_BPolMPackageImpl extends EPackageImpl implements REA_EML_BPolMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessPolicyModelEClass = null;

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
	private EClass policyEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEntityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingEClass = null;

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
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EML_BPolMPackageImpl() {
		super(eNS_URI, REA_EML_BPolMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EML_BPolMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EML_BPolMPackage init() {
		if (isInited) return (REA_EML_BPolMPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPolMPackage.eNS_URI);

		// Obtain or create and register package
		REA_EML_BPolMPackageImpl theREA_EML_BPolMPackage = (REA_EML_BPolMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EML_BPolMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EML_BPolMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI) : REA_EMLPackage.eINSTANCE);
		REA_EML_BPMPackageImpl theREA_EML_BPMPackage = (REA_EML_BPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPMPackage.eNS_URI) instanceof REA_EML_BPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPMPackage.eNS_URI) : REA_EML_BPMPackage.eINSTANCE);
		REA_EML_BCMPackageImpl theREA_EML_BCMPackage = (REA_EML_BCMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCMPackage.eNS_URI) instanceof REA_EML_BCMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCMPackage.eNS_URI) : REA_EML_BCMPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EML_BPolMPackage.createPackageContents();
		theREA_EMLPackage.createPackageContents();
		theREA_EML_BPMPackage.createPackageContents();
		theREA_EML_BCMPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EML_BPolMPackage.initializePackageContents();
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_BPMPackage.initializePackageContents();
		theREA_EML_BCMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EML_BPolMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EML_BPolMPackage.eNS_URI, theREA_EML_BPolMPackage);
		return theREA_EML_BPolMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessPolicyModel() {
		return businessPolicyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPolicyModel_BusinessEntities() {
		return (EReference)businessPolicyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessPolicyModel_BusinessRelationships() {
		return (EReference)businessPolicyModelEClass.getEStructuralFeatures().get(1);
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
	public EReference getBusinessRelationship_BusinessEntities() {
		return (EReference)businessRelationshipEClass.getEStructuralFeatures().get(0);
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
	public EClass getPolicyEntityType() {
		return policyEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypification() {
		return typificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypification_PolicyEntityType() {
		return (EReference)typificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypification_BusinessEntity() {
		return (EReference)typificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicyEntityGroup() {
		return policyEntityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrouping() {
		return groupingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrouping_GroupingEntityType() {
		return (EReference)groupingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrouping_BusinessEntity() {
		return (EReference)groupingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPolMFactory getREA_EML_BPolMFactory() {
		return (REA_EML_BPolMFactory)getEFactoryInstance();
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
		businessPolicyModelEClass = createEClass(BUSINESS_POLICY_MODEL);
		createEReference(businessPolicyModelEClass, BUSINESS_POLICY_MODEL__BUSINESS_ENTITIES);
		createEReference(businessPolicyModelEClass, BUSINESS_POLICY_MODEL__BUSINESS_RELATIONSHIPS);

		businessEntityEClass = createEClass(BUSINESS_ENTITY);
		createEReference(businessEntityEClass, BUSINESS_ENTITY__ATTRIBUTES);

		businessRelationshipEClass = createEClass(BUSINESS_RELATIONSHIP);
		createEReference(businessRelationshipEClass, BUSINESS_RELATIONSHIP__BUSINESS_ENTITIES);

		attributeEClass = createEClass(ATTRIBUTE);

		policyEntityTypeEClass = createEClass(POLICY_ENTITY_TYPE);

		typificationEClass = createEClass(TYPIFICATION);
		createEReference(typificationEClass, TYPIFICATION__POLICY_ENTITY_TYPE);
		createEReference(typificationEClass, TYPIFICATION__BUSINESS_ENTITY);

		policyEntityGroupEClass = createEClass(POLICY_ENTITY_GROUP);

		groupingEClass = createEClass(GROUPING);
		createEReference(groupingEClass, GROUPING__GROUPING_ENTITY_TYPE);
		createEReference(groupingEClass, GROUPING__BUSINESS_ENTITY);
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
		businessPolicyModelEClass.getESuperTypes().add(theREA_EMLPackage.getModel());
		businessEntityEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		businessRelationshipEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		attributeEClass.getESuperTypes().add(theREA_EMLPackage.getModelElement());
		policyEntityTypeEClass.getESuperTypes().add(this.getBusinessEntity());
		typificationEClass.getESuperTypes().add(this.getBusinessRelationship());
		policyEntityGroupEClass.getESuperTypes().add(this.getBusinessEntity());
		groupingEClass.getESuperTypes().add(this.getBusinessRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(businessPolicyModelEClass, BusinessPolicyModel.class, "BusinessPolicyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessPolicyModel_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 0, -1, BusinessPolicyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessPolicyModel_BusinessRelationships(), this.getBusinessRelationship(), null, "businessRelationships", null, 0, -1, BusinessPolicyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessEntityEClass, BusinessEntity.class, "BusinessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, BusinessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessRelationshipEClass, BusinessRelationship.class, "BusinessRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessRelationship_BusinessEntities(), this.getBusinessEntity(), null, "businessEntities", null, 2, 2, BusinessRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(policyEntityTypeEClass, PolicyEntityType.class, "PolicyEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typificationEClass, Typification.class, "Typification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypification_PolicyEntityType(), this.getPolicyEntityType(), null, "policyEntityType", null, 1, 1, Typification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypification_BusinessEntity(), this.getBusinessEntity(), null, "businessEntity", null, 1, 1, Typification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEntityGroupEClass, PolicyEntityGroup.class, "PolicyEntityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrouping_GroupingEntityType(), this.getPolicyEntityGroup(), null, "groupingEntityType", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrouping_BusinessEntity(), this.getBusinessEntity(), null, "businessEntity", null, 1, 1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //REA_EML_BPolMPackageImpl
