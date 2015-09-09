/**
 */
package REA_EML.REA_EML_BPM;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Economic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPM.EconomicEvent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getEconomicEvent()
 * @model abstract="true"
 * @generated
 */
public interface EconomicEvent extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link REA_EML.REA_EML_BPM.EconomicEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see REA_EML.REA_EML_BPM.EconomicEventType
	 * @see #setType(EconomicEventType)
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getEconomicEvent_Type()
	 * @model
	 * @generated
	 */
	EconomicEventType getType();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPM.EconomicEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see REA_EML.REA_EML_BPM.EconomicEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EconomicEventType value);

} // EconomicEvent
