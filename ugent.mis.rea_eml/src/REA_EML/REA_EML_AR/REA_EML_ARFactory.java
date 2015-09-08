/**
 */
package REA_EML.REA_EML_AR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage
 * @generated
 */
public interface REA_EML_ARFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_ARFactory eINSTANCE = REA_EML.REA_EML_AR.impl.REA_EML_ARFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Increment Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment Economic Event</em>'.
	 * @generated
	 */
	IncrementEconomicEvent createIncrementEconomicEvent();

	/**
	 * Returns a new object of class '<em>Decrement Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decrement Economic Event</em>'.
	 * @generated
	 */
	DecrementEconomicEvent createDecrementEconomicEvent();

	/**
	 * Returns a new object of class '<em>duality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>duality</em>'.
	 * @generated
	 */
	duality createduality();

	/**
	 * Returns a new object of class '<em>Increment Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Increment Commitment</em>'.
	 * @generated
	 */
	IncrementCommitment createIncrementCommitment();

	/**
	 * Returns a new object of class '<em>Decrement Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decrement Commitment</em>'.
	 * @generated
	 */
	DecrementCommitment createDecrementCommitment();

	/**
	 * Returns a new object of class '<em>reciprocity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>reciprocity</em>'.
	 * @generated
	 */
	reciprocity createreciprocity();

	/**
	 * Returns a new object of class '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>M</em>'.
	 * @generated
	 */
	REA_EML_ARM createREA_EML_ARM();

	/**
	 * Returns a new object of class '<em>Economic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Economic Resource</em>'.
	 * @generated
	 */
	EconomicResource createEconomicResource();

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
	 * Returns a new object of class '<em>participation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>participation</em>'.
	 * @generated
	 */
	participation createparticipation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_ARPackage getREA_EML_ARPackage();

} //REA_EML_ARFactory
