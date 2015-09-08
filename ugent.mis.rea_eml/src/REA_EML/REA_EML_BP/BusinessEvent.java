/**
 */
package REA_EML.REA_EML_BP;

import REA_EML.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.BusinessEvent#getBusinessEntities <em>Business Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getBusinessEvent()
 * @model
 * @generated
 */
public interface BusinessEvent extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Business Entities</b></em>' reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BP.BusinessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entities</em>' reference list.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getBusinessEvent_BusinessEntities()
	 * @model
	 * @generated
	 */
	EList<BusinessEntity> getBusinessEntities();

} // BusinessEvent
