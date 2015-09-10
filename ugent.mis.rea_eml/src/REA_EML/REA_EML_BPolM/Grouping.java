/**
 */
package REA_EML.REA_EML_BPolM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.Grouping#getGroupingEntityType <em>Grouping Entity Type</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.Grouping#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getGrouping()
 * @model
 * @generated
 */
public interface Grouping extends BusinessRelationship {
	/**
	 * Returns the value of the '<em><b>Grouping Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grouping Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Entity Type</em>' reference.
	 * @see #setGroupingEntityType(PolicyEntityGroup)
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getGrouping_GroupingEntityType()
	 * @model required="true"
	 * @generated
	 */
	PolicyEntityGroup getGroupingEntityType();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPolM.Grouping#getGroupingEntityType <em>Grouping Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Entity Type</em>' reference.
	 * @see #getGroupingEntityType()
	 * @generated
	 */
	void setGroupingEntityType(PolicyEntityGroup value);

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
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getGrouping_BusinessEntity()
	 * @model required="true"
	 * @generated
	 */
	BusinessEntity getBusinessEntity();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPolM.Grouping#getBusinessEntity <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Entity</em>' reference.
	 * @see #getBusinessEntity()
	 * @generated
	 */
	void setBusinessEntity(BusinessEntity value);

} // Grouping
