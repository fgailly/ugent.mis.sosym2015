/**
 */
package REA_EML.REA_EML_BP;

import REA_EML.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessEvents <em>Business Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.REA_EML_BPM#getInvolvements <em>Involvements</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getREA_EML_BPM()
 * @model
 * @generated
 */
public interface REA_EML_BPM extends Model {
	/**
	 * Returns the value of the '<em><b>Business Entities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BP.BusinessEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Entities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getREA_EML_BPM_BusinessEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessEntity> getBusinessEntities();

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
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getREA_EML_BPM_BusinessEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessEvent> getBusinessEvents();

	/**
	 * Returns the value of the '<em><b>Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BP.Involvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involvements</em>' containment reference list.
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getREA_EML_BPM_Involvements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Involvement> getInvolvements();

	/**
	 * Returns the value of the '<em><b>Business Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process</em>' attribute.
	 * @see #setBusinessProcess(String)
	 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage#getREA_EML_BPM_BusinessProcess()
	 * @model
	 * @generated
	 */
	String getBusinessProcess();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BP.REA_EML_BPM#getBusinessProcess <em>Business Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process</em>' attribute.
	 * @see #getBusinessProcess()
	 * @generated
	 */
	void setBusinessProcess(String value);

} // REA_EML_BPM
