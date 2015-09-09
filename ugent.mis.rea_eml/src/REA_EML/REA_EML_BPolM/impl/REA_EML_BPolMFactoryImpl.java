/**
 */
package REA_EML.REA_EML_BPolM.impl;

import REA_EML.REA_EML_BPolM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BPolMFactoryImpl extends EFactoryImpl implements REA_EML_BPolMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BPolMFactory init() {
		try {
			REA_EML_BPolMFactory theREA_EML_BPolMFactory = (REA_EML_BPolMFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BPolMPackage.eNS_URI);
			if (theREA_EML_BPolMFactory != null) {
				return theREA_EML_BPolMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BPolMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPolMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case REA_EML_BPolMPackage.BUSINESS_POLICY_MODEL: return createBusinessPolicyModel();
			case REA_EML_BPolMPackage.BUSINESS_ENTITY: return createBusinessEntity();
			case REA_EML_BPolMPackage.BUSINESS_RELATIONSHIP: return createBusinessRelationship();
			case REA_EML_BPolMPackage.ATTRIBUTE: return createAttribute();
			case REA_EML_BPolMPackage.POLICY_ENTITY_TYPE: return createPolicyEntityType();
			case REA_EML_BPolMPackage.TYPIFICATION: return createTypification();
			case REA_EML_BPolMPackage.POLICY_ENTITY_GROUP: return createPolicyEntityGroup();
			case REA_EML_BPolMPackage.GROUPING: return createGrouping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPolicyModel createBusinessPolicyModel() {
		BusinessPolicyModelImpl businessPolicyModel = new BusinessPolicyModelImpl();
		return businessPolicyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity createBusinessEntity() {
		BusinessEntityImpl businessEntity = new BusinessEntityImpl();
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRelationship createBusinessRelationship() {
		BusinessRelationshipImpl businessRelationship = new BusinessRelationshipImpl();
		return businessRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityType createPolicyEntityType() {
		PolicyEntityTypeImpl policyEntityType = new PolicyEntityTypeImpl();
		return policyEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typification createTypification() {
		TypificationImpl typification = new TypificationImpl();
		return typification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityGroup createPolicyEntityGroup() {
		PolicyEntityGroupImpl policyEntityGroup = new PolicyEntityGroupImpl();
		return policyEntityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grouping createGrouping() {
		GroupingImpl grouping = new GroupingImpl();
		return grouping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPolMPackage getREA_EML_BPolMPackage() {
		return (REA_EML_BPolMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BPolMPackage getPackage() {
		return REA_EML_BPolMPackage.eINSTANCE;
	}

} //REA_EML_BPolMFactoryImpl
