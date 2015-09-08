/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.Offering#getOfferingRequiresResource <em>Offering Requires Resource</em>}</li>
 *   <li>{@link BMM.Offering#getOfferingUsesFixedAsset <em>Offering Uses Fixed Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getOffering()
 * @model
 * @generated
 */
public interface Offering extends FixedAsset {
	/**
	 * Returns the value of the '<em><b>Offering Requires Resource</b></em>' reference list.
	 * The list contents are of type {@link BMM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offering Requires Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offering Requires Resource</em>' reference list.
	 * @see BMM.BMMPackage#getOffering_OfferingRequiresResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Resource> getOfferingRequiresResource();

	/**
	 * Returns the value of the '<em><b>Offering Uses Fixed Asset</b></em>' reference list.
	 * The list contents are of type {@link BMM.FixedAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offering Uses Fixed Asset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offering Uses Fixed Asset</em>' reference list.
	 * @see BMM.BMMPackage#getOffering_OfferingUsesFixedAsset()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FixedAsset> getOfferingUsesFixedAsset();

} // Offering
