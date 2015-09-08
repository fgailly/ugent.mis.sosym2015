/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.BusinessProcess#getBusinessProcessRealizesCourseOfAction <em>Business Process Realizes Course Of Action</em>}</li>
 *   <li>{@link BMM.BusinessProcess#getBusinessProcessManagerAsset <em>Business Process Manager Asset</em>}</li>
 *   <li>{@link BMM.BusinessProcess#getBusinessProcessDeliversOfeering <em>Business Process Delivers Ofeering</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getBusinessProcess()
 * @model
 * @generated
 */
public interface BusinessProcess extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Business Process Realizes Course Of Action</b></em>' reference list.
	 * The list contents are of type {@link BMM.CourseOfAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Realizes Course Of Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Realizes Course Of Action</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessProcess_BusinessProcessRealizesCourseOfAction()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CourseOfAction> getBusinessProcessRealizesCourseOfAction();

	/**
	 * Returns the value of the '<em><b>Business Process Manager Asset</b></em>' reference list.
	 * The list contents are of type {@link BMM.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Manager Asset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Manager Asset</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessProcess_BusinessProcessManagerAsset()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Asset> getBusinessProcessManagerAsset();

	/**
	 * Returns the value of the '<em><b>Business Process Delivers Ofeering</b></em>' reference list.
	 * The list contents are of type {@link BMM.Offering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process Delivers Ofeering</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Delivers Ofeering</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessProcess_BusinessProcessDeliversOfeering()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Offering> getBusinessProcessDeliversOfeering();

} // BusinessProcess
