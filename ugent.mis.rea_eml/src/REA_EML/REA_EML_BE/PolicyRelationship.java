/**
 */
package REA_EML.REA_EML_BE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyRelationshipType <em>Policy Relationship Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyEntity <em>Policy Entity</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.PolicyRelationship#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getPolicyRelationship()
 * @model
 * @generated
 */
public interface PolicyRelationship extends BusinessRelationship {
	/**
	 * Returns the value of the '<em><b>Policy Relationship Type</b></em>' attribute.
	 * The literals are from the enumeration {@link REA_EML.REA_EML_BE.PolicyRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Relationship Type</em>' attribute.
	 * @see REA_EML.REA_EML_BE.PolicyRelationshipType
	 * @see #setPolicyRelationshipType(PolicyRelationshipType)
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getPolicyRelationship_PolicyRelationshipType()
	 * @model
	 * @generated
	 */
	PolicyRelationshipType getPolicyRelationshipType();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyRelationshipType <em>Policy Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Relationship Type</em>' attribute.
	 * @see REA_EML.REA_EML_BE.PolicyRelationshipType
	 * @see #getPolicyRelationshipType()
	 * @generated
	 */
	void setPolicyRelationshipType(PolicyRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Policy Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Entity</em>' reference.
	 * @see #setPolicyEntity(PolicyEntity)
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getPolicyRelationship_PolicyEntity()
	 * @model required="true"
	 * @generated
	 */
	PolicyEntity getPolicyEntity();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BE.PolicyRelationship#getPolicyEntity <em>Policy Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Entity</em>' reference.
	 * @see #getPolicyEntity()
	 * @generated
	 */
	void setPolicyEntity(PolicyEntity value);

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
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getPolicyRelationship_BusinessEntity()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getBusinessEntity();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BE.PolicyRelationship#getBusinessEntity <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(BusinessEntity value);

} // PolicyRelationship
