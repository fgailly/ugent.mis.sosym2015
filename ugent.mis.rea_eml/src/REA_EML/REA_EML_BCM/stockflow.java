/**
 */
package REA_EML.REA_EML_BCM;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stockflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.stockflow#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.stockflow#getEconomicResouce <em>Economic Resouce</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getstockflow()
 * @model
 * @generated
 */
public interface stockflow extends ModelElement {
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
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getstockflow_EconomicEvent()
	 * @model required="true"
	 * @generated
	 */
	EconomicEvent getEconomicEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.stockflow#getEconomicEvent <em>Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Event</em>' reference.
	 * @see #getEconomicEvent()
	 * @generated
	 */
	void setEconomicEvent(EconomicEvent value);

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
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getstockflow_EconomicResouce()
	 * @model required="true"
	 * @generated
	 */
	EconomicResource getEconomicResouce();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BCM.stockflow#getEconomicResouce <em>Economic Resouce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economic Resouce</em>' reference.
	 * @see #getEconomicResouce()
	 * @generated
	 */
	void setEconomicResouce(EconomicResource value);

} // stockflow
