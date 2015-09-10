/**
 */
package REA_EML.REA_EML_BCM;

import REA_EML.ModelElement;
import REA_EML.ParticipationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>participation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.participation#getEconomicAgent <em>Economic Agent</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.participation#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.participation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getparticipation()
 * @model
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
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getparticipation_EconomicAgent()
	 * @model required="true"
	 * @generated
	 */
	EconomicAgent getEconomicAgent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.participation#getEconomicAgent <em>Economic Agent</em>}' reference.
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
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getparticipation_EconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	EconomicEvent getEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.participation#getEconomicEvent <em>Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Event</em>' reference.
	 * @see #getEconomicEvent()
	 * @generated
	 */
	void setEconomicEvent(EconomicEvent value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link REA_EML.ParticipationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see REA_EML.ParticipationType
	 * @see #setType(ParticipationType)
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getparticipation_Type()
	 * @model
	 * @generated
	 */
	ParticipationType getType();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.participation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see REA_EML.ParticipationType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParticipationType value);

} // participation
