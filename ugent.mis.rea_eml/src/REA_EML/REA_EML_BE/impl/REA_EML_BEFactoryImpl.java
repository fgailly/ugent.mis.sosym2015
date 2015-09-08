/**
 */
package REA_EML.REA_EML_BE.impl;

import REA_EML.REA_EML_BE.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class REA_EML_BEFactoryImpl extends EFactoryImpl implements REA_EML_BEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BEFactory init() {
		try {
			REA_EML_BEFactory theREA_EML_BEFactory = (REA_EML_BEFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BEPackage.eNS_URI);
			if (theREA_EML_BEFactory != null) {
				return theREA_EML_BEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BEFactoryImpl() {
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
			case REA_EML_BEPackage.REA_EML_BE_M: return createREA_EML_BEM();
			case REA_EML_BEPackage.BUSINESS_ENTITY: return createBusinessEntity();
			case REA_EML_BEPackage.BUSINESS_RELATIONSHIP: return createBusinessRelationship();
			case REA_EML_BEPackage.ATTRIBUTE: return createAttribute();
			case REA_EML_BEPackage.POLICY_ENTITY: return createPolicyEntity();
			case REA_EML_BEPackage.POLICY_RELATIONSHIP: return createPolicyRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case REA_EML_BEPackage.POLICY_RELATIONSHIP_TYPE:
				return createPolicyRelationshipTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case REA_EML_BEPackage.POLICY_RELATIONSHIP_TYPE:
				return convertPolicyRelationshipTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BEM createREA_EML_BEM() {
		REA_EML_BEMImpl reA_EML_BEM = new REA_EML_BEMImpl();
		return reA_EML_BEM;
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
	public PolicyEntity createPolicyEntity() {
		PolicyEntityImpl policyEntity = new PolicyEntityImpl();
		return policyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyRelationship createPolicyRelationship() {
		PolicyRelationshipImpl policyRelationship = new PolicyRelationshipImpl();
		return policyRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyRelationshipType createPolicyRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		PolicyRelationshipType result = PolicyRelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolicyRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BEPackage getREA_EML_BEPackage() {
		return (REA_EML_BEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BEPackage getPackage() {
		return REA_EML_BEPackage.eINSTANCE;
	}

} //REA_EML_BEFactoryImpl
