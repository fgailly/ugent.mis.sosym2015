/**
 */
package REA_EML.REA_EML_BC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage
 * @generated
 */
public interface REA_EML_BCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BCFactory eINSTANCE = REA_EML.REA_EML_BC.impl.REA_EML_BCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	REA_EML_BCM createREA_EML_BCM();

	/**
	 * Returns a new object of class '<em>Economic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Economic Resource</em>'.
	 * @generated
	 */
	EconomicResource createEconomicResource();

	/**
	 * Returns a new object of class '<em>Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Economic Event</em>'.
	 * @generated
	 */
	EconomicEvent createEconomicEvent();

	/**
	 * Returns a new object of class '<em>Economic Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Economic Agent</em>'.
	 * @generated
	 */
	EconomicAgent createEconomicAgent();

	/**
	 * Returns a new object of class '<em>Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commitment</em>'.
	 * @generated
	 */
	Commitment createCommitment();

	/**
	 * Returns a new object of class '<em>specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>specification</em>'.
	 * @generated
	 */
	specification createspecification();

	/**
	 * Returns a new object of class '<em>stockflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stockflow</em>'.
	 * @generated
	 */
	stockflow createstockflow();

	/**
	 * Returns a new object of class '<em>fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>fulfillment</em>'.
	 * @generated
	 */
	fulfillment createfulfillment();

	/**
	 * Returns a new object of class '<em>duality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>duality</em>'.
	 * @generated
	 */
	duality createduality();

	/**
	 * Returns a new object of class '<em>recicprocity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>recicprocity</em>'.
	 * @generated
	 */
	recicprocity createrecicprocity();

	/**
	 * Returns a new object of class '<em>provides</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>provides</em>'.
	 * @generated
	 */
	provides createprovides();

	/**
	 * Returns a new object of class '<em>receives</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>receives</em>'.
	 * @generated
	 */
	receives createreceives();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_BCPackage getREA_EML_BCPackage();

} //REA_EML_BCFactory
