/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Liability#getLiabilityClaimsResource <em>Liability Claims Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getLiability()
 * @model
 * @generated
 */
public interface Liability extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Liability Claims Resource</b></em>' reference list.
	 * The list contents are of type {@link BMM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liability Claims Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liability Claims Resource</em>' reference list.
	 * @see BMM.BMMPackage#getLiability_LiabilityClaimsResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Resource> getLiabilityClaimsResource();

} // Liability
