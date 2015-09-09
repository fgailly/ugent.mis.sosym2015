/**
 */
package REA_EML.REA_EML_BPolM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage
 * @generated
 */
public interface REA_EML_BPolMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BPolMFactory eINSTANCE = REA_EML.REA_EML_BPolM.impl.REA_EML_BPolMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business Policy Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Policy Model</em>'.
	 * @generated
	 */
	BusinessPolicyModel createBusinessPolicyModel();

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
	 * Returns a new object of class '<em>Policy Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Entity Type</em>'.
	 * @generated
	 */
	PolicyEntityType createPolicyEntityType();

	/**
	 * Returns a new object of class '<em>Typification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typification</em>'.
	 * @generated
	 */
	Typification createTypification();

	/**
	 * Returns a new object of class '<em>Policy Entity Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy Entity Group</em>'.
	 * @generated
	 */
	PolicyEntityGroup createPolicyEntityGroup();

	/**
	 * Returns a new object of class '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping</em>'.
	 * @generated
	 */
	Grouping createGrouping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_BPolMPackage getREA_EML_BPolMPackage();

} //REA_EML_BPolMFactory
