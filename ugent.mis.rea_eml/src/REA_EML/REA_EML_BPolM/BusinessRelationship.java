/**
 */
package REA_EML.REA_EML_BPolM;

import REA_EML.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.BusinessRelationship#getBusinessEntities <em>Business Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessRelationship()
 * @model
 * @generated
 */
public interface BusinessRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Entities</b></em>' reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPolM.BusinessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entities</em>' reference list.
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessRelationship_BusinessEntities()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<BusinessEntity> getBusinessEntities();

} // BusinessRelationship
