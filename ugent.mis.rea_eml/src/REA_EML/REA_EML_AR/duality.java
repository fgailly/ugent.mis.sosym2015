/**
 */
package REA_EML.REA_EML_AR;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>duality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_AR.duality#getDecrementEconomicEvent <em>Decrement Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.duality#getIncrementEconomicEvent <em>Increment Economic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getduality()
 * @model
 * @generated
 */
public interface duality extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Decrement Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrement Economic Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrement Economic Event</em>' reference.
	 * @see #setDecrementEconomicEvent(DecrementEconomicEvent)
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getduality_DecrementEconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	DecrementEconomicEvent getDecrementEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.duality#getDecrementEconomicEvent <em>Decrement Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decrement Economic Event</em>' reference.
	 * @see #getDecrementEconomicEvent()
	 * @generated
	 */
	void setDecrementEconomicEvent(DecrementEconomicEvent value);

	/**
	 * Returns the value of the '<em><b>Increment Economic Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Economic Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Economic Event</em>' reference.
	 * @see #setIncrementEconomicEvent(IncrementEconomicEvent)
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getduality_IncrementEconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	IncrementEconomicEvent getIncrementEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.duality#getIncrementEconomicEvent <em>Increment Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Economic Event</em>' reference.
	 * @see #getIncrementEconomicEvent()
	 * @generated
	 */
	void setIncrementEconomicEvent(IncrementEconomicEvent value);

} // duality
