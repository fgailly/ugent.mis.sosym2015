/**
 */
package REA_EML.REA_EML_AR;

import REA_EML.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reciprocity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_AR.reciprocity#getDecrementCommitment <em>Decrement Commitment</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.reciprocity#getIncrementCommitment <em>Increment Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getreciprocity()
 * @model
 * @generated
 */
public interface reciprocity extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Decrement Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrement Commitment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrement Commitment</em>' reference.
	 * @see #setDecrementCommitment(DecrementCommitment)
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getreciprocity_DecrementCommitment()
	 * @model required="true"
	 * @generated
	 */
	DecrementCommitment getDecrementCommitment();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.reciprocity#getDecrementCommitment <em>Decrement Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decrement Commitment</em>' reference.
	 * @see #getDecrementCommitment()
	 * @generated
	 */
	void setDecrementCommitment(DecrementCommitment value);

	/**
	 * Returns the value of the '<em><b>Increment Commitment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment Commitment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Commitment</em>' reference.
	 * @see #setIncrementCommitment(IncrementCommitment)
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getreciprocity_IncrementCommitment()
	 * @model required="true"
	 * @generated
	 */
	IncrementCommitment getIncrementCommitment();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.reciprocity#getIncrementCommitment <em>Increment Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Commitment</em>' reference.
	 * @see #getIncrementCommitment()
	 * @generated
	 */
	void setIncrementCommitment(IncrementCommitment value);

} // reciprocity
