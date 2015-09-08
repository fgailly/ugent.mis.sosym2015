/**
 */
package REA_EML.REA_EML_BP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage
 * @generated
 */
public interface REA_EML_BPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BPFactory eINSTANCE = REA_EML.REA_EML_BP.impl.REA_EML_BPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	REA_EML_BPM createREA_EML_BPM();

	/**
	 * Returns a new object of class '<em>Business Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Event</em>'.
	 * @generated
	 */
	BusinessEvent createBusinessEvent();

	/**
	 * Returns a new object of class '<em>Business Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Entity</em>'.
	 * @generated
	 */
	BusinessEntity createBusinessEntity();

	/**
	 * Returns a new object of class '<em>Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Economic Event</em>'.
	 * @generated
	 */
	EconomicEvent createEconomicEvent();

	/**
	 * Returns a new object of class '<em>Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commitment</em>'.
	 * @generated
	 */
	Commitment createCommitment();

	/**
	 * Returns a new object of class '<em>Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Involvement</em>'.
	 * @generated
	 */
	Involvement createInvolvement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_BPPackage getREA_EML_BPPackage();

} //REA_EML_BPFactory
