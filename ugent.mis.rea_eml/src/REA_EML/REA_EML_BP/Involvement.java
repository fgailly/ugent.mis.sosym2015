/**
 */
package REA_EML.REA_EML_BP;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.Involvement#getBusinessEvent <em>Business Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.Involvement#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getInvolvement()
 * @model
 * @generated
 */
public interface Involvement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Event</em>' reference.
	 * @see #setBusinessEvent(BusinessEvent)
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getInvolvement_BusinessEvent()
	 * @model required="true"
	 * @generated
	 */
	BusinessEvent getBusinessEvent();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BP.Involvement#getBusinessEvent <em>Business Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Event</em>' reference.
	 * @see #getBusinessEvent()
	 * @generated
	 */
	void setBusinessEvent(BusinessEvent value);

	/**
	 * Returns the value of the '<em><b>Business Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entity</em>' reference.
	 * @see #setBusinessEntity(BusinessEntity)
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getInvolvement_BusinessEntity()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getBusinessEntity();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BP.Involvement#getBusinessEntity <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(BusinessEntity value);

} // Involvement
