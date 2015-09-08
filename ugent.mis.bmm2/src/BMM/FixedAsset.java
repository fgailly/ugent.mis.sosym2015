/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.FixedAsset#getFixedAssetProvidesResource <em>Fixed Asset Provides Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getFixedAsset()
 * @model
 * @generated
 */
public interface FixedAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Fixed Asset Provides Resource</b></em>' reference list.
	 * The list contents are of type {@link BMM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Provides Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Provides Resource</em>' reference list.
	 * @see BMM.BMMPackage#getFixedAsset_FixedAssetProvidesResource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Resource> getFixedAssetProvidesResource();

} // FixedAsset
