/**
 */
package REA_EML.REA_EML_BE;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage
 * @generated
 */
public interface REA_EML_BEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BEFactory eINSTANCE = REA_EML.REA_EML_BE.impl.REA_EML_BEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	REA_EML_BEM createREA_EML_BEM();

	/**
	 * Returns a new object of class '<em>Business Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Entity</em>'.
	 * @generated
	 */
	BusinessEntity createBusinessEntity();

	/**
	 * Returns a new object of class '<em>Business Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Relationship</em>'.
	 * @generated
	 */
	BusinessRelationship createBusinessRelationship();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Policy Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Entity</em>'.
	 * @generated
	 */
	PolicyEntity createPolicyEntity();

	/**
	 * Returns a new object of class '<em>Policy Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Relationship</em>'.
	 * @generated
	 */
	PolicyRelationship createPolicyRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_BEPackage getREA_EML_BEPackage();

} //REA_EML_BEFactory
