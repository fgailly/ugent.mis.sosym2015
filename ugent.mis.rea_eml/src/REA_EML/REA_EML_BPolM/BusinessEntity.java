/**
 */
package REA_EML.REA_EML_BPolM;

import REA_EML.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPolM.BusinessEntity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessEntity()
 * @model
 * @generated
 */
public interface BusinessEntity extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPolM.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage#getBusinessEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // BusinessEntity
