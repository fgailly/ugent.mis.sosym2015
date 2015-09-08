/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desired Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.DesiredResult#getBroaderDesiredResultIncludesMoreSpecificDesiredResult <em>Broader Desired Result Includes More Specific Desired Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getDesiredResult()
 * @model
 * @generated
 */
public interface DesiredResult extends End {
	/**
	 * Returns the value of the '<em><b>Broader Desired Result Includes More Specific Desired Result</b></em>' reference list.
	 * The list contents are of type {@link BMM.DesiredResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broader Desired Result Includes More Specific Desired Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broader Desired Result Includes More Specific Desired Result</em>' reference list.
	 * @see BMM.BMMPackage#getDesiredResult_BroaderDesiredResultIncludesMoreSpecificDesiredResult()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DesiredResult> getBroaderDesiredResultIncludesMoreSpecificDesiredResult();

} // DesiredResult
