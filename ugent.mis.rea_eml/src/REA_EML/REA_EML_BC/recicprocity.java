/**
 */
package REA_EML.REA_EML_BC;

import REA_EML.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>recicprocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BC.recicprocity#getCommitment <em>Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getrecicprocity()
 * @model
 * @generated
 */
public interface recicprocity extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Commitment</b></em>' reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.Commitment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitment</em>' reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getrecicprocity_Commitment()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Commitment> getCommitment();

} // recicprocity
