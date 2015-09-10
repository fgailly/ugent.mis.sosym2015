/**
 */
package REA_EML.REA_EML_BCM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage
 * @generated
 */
public interface REA_EML_BCMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	REA_EML_BCMFactory eINSTANCE = REA_EML.REA_EML_BCM.impl.REA_EML_BCMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business Collaboration Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Collaboration Model</em>'.
	 * @generated
	 */
	BusinessCollaborationModel createBusinessCollaborationModel();

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
	 * Returns a new object of class '<em>participation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>participation</em>'.
	 * @generated
	 */
	participation createparticipation();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	REA_EML_BCMPackage getREA_EML_BCMPackage();

} //REA_EML_BCMFactory
