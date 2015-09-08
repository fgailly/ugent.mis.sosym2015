/**
 */
package REA_EML.impl;

import REA_EML.Model;
import REA_EML.ModelElement;
import REA_EML.Operator;
import REA_EML.REA_EMLFactory;
import REA_EML.REA_EMLPackage;

import REA_EML.REA_EML_AR.REA_EML_ARPackage;

import REA_EML.REA_EML_AR.impl.REA_EML_ARPackageImpl;

import REA_EML.REA_EML_BC.REA_EML_BCPackage;

import REA_EML.REA_EML_BC.impl.REA_EML_BCPackageImpl;

import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BE.impl.REA_EML_BEPackageImpl;

import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.REA_EML_BP.impl.REA_EML_BPPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EMLPackageImpl extends EPackageImpl implements REA_EMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

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
	 * @see REA_EML.REA_EMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private REA_EMLPackageImpl() {
		super(eNS_URI, REA_EMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link REA_EMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static REA_EMLPackage init() {
		if (isInited) return (REA_EMLPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EMLPackage.eNS_URI);

		// Obtain or create and register package
		REA_EMLPackageImpl theREA_EMLPackage = (REA_EMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof REA_EMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new REA_EMLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		REA_EML_ARPackageImpl theREA_EML_ARPackage = (REA_EML_ARPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) instanceof REA_EML_ARPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI) : REA_EML_ARPackage.eINSTANCE);
		REA_EML_BCPackageImpl theREA_EML_BCPackage = (REA_EML_BCPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) instanceof REA_EML_BCPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI) : REA_EML_BCPackage.eINSTANCE);
		REA_EML_BEPackageImpl theREA_EML_BEPackage = (REA_EML_BEPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) instanceof REA_EML_BEPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI) : REA_EML_BEPackage.eINSTANCE);
		REA_EML_BPPackageImpl theREA_EML_BPPackage = (REA_EML_BPPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) instanceof REA_EML_BPPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI) : REA_EML_BPPackage.eINSTANCE);

		// Create package meta-data objects
		theREA_EMLPackage.createPackageContents();
		theREA_EML_ARPackage.createPackageContents();
		theREA_EML_BCPackage.createPackageContents();
		theREA_EML_BEPackage.createPackageContents();
		theREA_EML_BPPackage.createPackageContents();

		// Initialize created meta-data
		theREA_EMLPackage.initializePackageContents();
		theREA_EML_ARPackage.initializePackageContents();
		theREA_EML_BCPackage.initializePackageContents();
		theREA_EML_BEPackage.initializePackageContents();
		theREA_EML_BPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theREA_EMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(REA_EMLPackage.eNS_URI, theREA_EMLPackage);
		return theREA_EMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_OntologyURI() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_OntologyNS() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EMLFactory getREA_EMLFactory() {
		return (REA_EMLFactory)getEFactoryInstance();
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
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__ONTOLOGY_URI);
		createEAttribute(modelEClass, MODEL__ONTOLOGY_NS);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
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
		REA_EML_ARPackage theREA_EML_ARPackage = (REA_EML_ARPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_ARPackage.eNS_URI);
		REA_EML_BCPackage theREA_EML_BCPackage = (REA_EML_BCPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BCPackage.eNS_URI);
		REA_EML_BEPackage theREA_EML_BEPackage = (REA_EML_BEPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BEPackage.eNS_URI);
		REA_EML_BPPackage theREA_EML_BPPackage = (REA_EML_BPPackage)EPackage.Registry.INSTANCE.getEPackage(REA_EML_BPPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theREA_EML_ARPackage);
		getESubpackages().add(theREA_EML_BCPackage);
		getESubpackages().add(theREA_EML_BEPackage);
		getESubpackages().add(theREA_EML_BPPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_OntologyURI(), ecorePackage.getEString(), "ontologyURI", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_OntologyNS(), ecorePackage.getEString(), "ontologyNS", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.EQUALS);
		addEEnumLiteral(operatorEEnum, Operator.LESS_THAN);
		addEEnumLiteral(operatorEEnum, Operator.GREATER_THAN);
		addEEnumLiteral(operatorEEnum, Operator.MEMBER_OF);

		// Create resource
		createResource(eNS_URI);
	}

} //REA_EMLPackageImpl
