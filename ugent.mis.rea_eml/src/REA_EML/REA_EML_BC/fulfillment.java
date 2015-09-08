/**
 */
package REA_EML.REA_EML_BC;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BC.fulfillment#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.fulfillment#getCommitment <em>Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getfulfillment()
 * @model
 * @generated
 */
public interface fulfillment extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Event</em>' reference.
	 * @see #setEconomicEvent(EconomicEvent)
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getfulfillment_EconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	EconomicEvent getEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BC.fulfillment#getEconomicEvent <em>Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Event</em>' reference.
	 * @see #getEconomicEvent()
	 * @generated
	 */
	void setEconomicEvent(EconomicEvent value);

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
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getfulfillment_Commitment()
	 * @model required="true"
	 * @generated
	 */
	Commitment getCommitment();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BC.fulfillment#getCommitment <em>Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commitment</em>' reference.
	 * @see #getCommitment()
	 * @generated
	 */
	void setCommitment(Commitment value);

} // fulfillment