/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.OrganizationCategory#getOrganizationCategoryCategorizesInfluencingOrganization <em>Organization Category Categorizes Influencing Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getOrganizationCategory()
 * @model
 * @generated
 */
public interface OrganizationCategory extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Organization Category Categorizes Influencing Organization</b></em>' reference list.
	 * The list contents are of type {@link BMM.InfluencingOrganization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Category Categorizes Influencing Organization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Category Categorizes Influencing Organization</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationCategory_OrganizationCategoryCategorizesInfluencingOrganization()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InfluencingOrganization> getOrganizationCategoryCategorizesInfluencingOrganization();

} // OrganizationCategory
