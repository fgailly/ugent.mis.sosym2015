/**
 */
package REA_EML.REA_EML_BC;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BC.participation#getEconomicAgent <em>Economic Agent</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.participation#getEconomicEvent <em>Economic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getparticipation()
 * @model abstract="true"
 * @generated
 */
public interface participation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Economic Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Agent</em>' reference.
	 * @see #setEconomicAgent(EconomicAgent)
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getparticipation_EconomicAgent()
	 * @model required="true"
	 * @generated
	 */
	EconomicAgent getEconomicAgent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BC.participation#getEconomicAgent <em>Economic Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Agent</em>' reference.
	 * @see #getEconomicAgent()
	 * @generated
	 */
	void setEconomicAgent(EconomicAgent value);

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
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getparticipation_EconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	EconomicEvent getEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BC.participation#getEconomicEvent <em>Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Event</em>' reference.
	 * @see #getEconomicEvent()
	 * @generated
	 */
	void setEconomicEvent(EconomicEvent value);

} // participation
