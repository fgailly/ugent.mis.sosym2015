/**
 */
package REA_EML.REA_EML_BPolM;

import REA_EML.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Policy Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel#getBusinessRelationships <em>Business Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessPolicyModel()
 * @model
 * @generated
 */
public interface BusinessPolicyModel extends Model {
	/**
	 * Returns the value of the '<em><b>Business Entities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPolM.BusinessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessPolicyModel_BusinessEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessEntity> getBusinessEntities();

	/**
	 * Returns the value of the '<em><b>Business Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPolM.BusinessRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Relationships</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessPolicyModel_BusinessRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessRelationship> getBusinessRelationships();

} // BusinessPolicyModel
