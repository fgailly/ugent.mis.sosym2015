/**
 */
package REA_EML.REA_EML_BE;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BE.BusinessRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.BusinessRelationship#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getBusinessRelationship()
 * @model
 * @generated
 */
public interface BusinessRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(BusinessEntity)
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getBusinessRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getTarget();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BE.BusinessRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(BusinessEntity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(BusinessEntity)
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getBusinessRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getSource();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BE.BusinessRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(BusinessEntity value);

} // BusinessRelationship
