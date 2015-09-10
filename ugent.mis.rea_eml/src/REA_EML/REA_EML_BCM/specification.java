/**
 */
package REA_EML.REA_EML_BCM;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.specification#getCommitment <em>Commitment</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.specification#getEconomicResouce <em>Economic Resouce</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getspecification()
 * @model
 * @generated
 */
public interface specification extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitment</em>' reference.
	 * @see #setCommitment(Commitment)
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getspecification_Commitment()
	 * @model required="true"
	 * @generated
	 */
	Commitment getCommitment();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.specification#getCommitment <em>Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commitment</em>' reference.
	 * @see #getCommitment()
	 * @generated
	 */
	void setCommitment(Commitment value);

	/**
	 * Returns the value of the '<em><b>Economic Resouce</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Resouce</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Resouce</em>' reference.
	 * @see #setEconomicResouce(EconomicResource)
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getspecification_EconomicResouce()
	 * @model required="true"
	 * @generated
	 */
	EconomicResource getEconomicResouce();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.specification#getEconomicResouce <em>Economic Resouce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Resouce</em>' reference.
	 * @see #getEconomicResouce()
	 * @generated
	 */
	void setEconomicResouce(EconomicResource value);

} // specification
