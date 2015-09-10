/**
 */
package REA_EML.REA_EML_BCM;

import REA_EML.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>duality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.duality#getEconomicEvent <em>Economic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getduality()
 * @model
 * @generated
 */
public interface duality extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Economic Event</b></em>' reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Event</em>' reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getduality_EconomicEvent()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<EconomicEvent> getEconomicEvent();

} // duality
