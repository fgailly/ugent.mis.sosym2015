/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influencer Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.InfluencerCategory#getInfluencerCategoryCategorizesInfluencer <em>Influencer Category Categorizes Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getInfluencerCategory()
 * @model
 * @generated
 */
public interface InfluencerCategory extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Influencer Category Categorizes Influencer</b></em>' reference list.
	 * The list contents are of type {@link BMM.Influencer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencer Category Categorizes Influencer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencer Category Categorizes Influencer</em>' reference list.
	 * @see BMM.BMMPackage#getInfluencerCategory_InfluencerCategoryCategorizesInfluencer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Influencer> getInfluencerCategoryCategorizesInfluencer();

} // InfluencerCategory
