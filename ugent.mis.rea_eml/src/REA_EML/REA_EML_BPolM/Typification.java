/**
 */
package REA_EML.REA_EML_BPolM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.Typification#getPolicyEntityType <em>Policy Entity Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.Typification#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getTypification()
 * @model
 * @generated
 */
public interface Typification extends BusinessRelationship {
	/**
	 * Returns the value of the '<em><b>Policy Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Entity Type</em>' reference.
	 * @see #setPolicyEntityType(PolicyEntityType)
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getTypification_PolicyEntityType()
	 * @model required="true"
	 * @generated
	 */
	PolicyEntityType getPolicyEntityType();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPolM.Typification#getPolicyEntityType <em>Policy Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Entity Type</em>' reference.
	 * @see #getPolicyEntityType()
	 * @generated
	 */
	void setPolicyEntityType(PolicyEntityType value);

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
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getTypification_BusinessEntity()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getBusinessEntity();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPolM.Typification#getBusinessEntity <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(BusinessEntity value);

} // Typification
