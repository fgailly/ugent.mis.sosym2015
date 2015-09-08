/**
 */
package REA_EML.REA_EML_BE;

import REA_EML.Model;

import REA_EML.REA_EML_BP.BusinessEvent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessRelationships <em>Business Relationships</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BE.REA_EML_BEM#getBusinessEvents <em>Business Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getREA_EML_BEM()
 * @model
 * @generated
 */
public interface REA_EML_BEM extends Model {
	/**
	 * Returns the value of the '<em><b>Business Entities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BE.BusinessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getREA_EML_BEM_BusinessEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessEntity> getBusinessEntities();

	/**
	 * Returns the value of the '<em><b>Business Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BE.BusinessRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Relationships</em>' containment reference list.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getREA_EML_BEM_BusinessRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessRelationship> getBusinessRelationships();

	/**
	 * Returns the value of the '<em><b>Business Events</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BP.BusinessEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Events</em>' containment reference list.
	 * @see REA_EML.REA_EML_BE.REA_EML_BEPackage#getREA_EML_BEM_BusinessEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessEvent> getBusinessEvents();

} // REA_EML_BEM
