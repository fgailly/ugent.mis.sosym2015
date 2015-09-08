/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influencing Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.InfluencingOrganization#getInfluencingOrganizationIsSourceOfInfluencer <em>Influencing Organization Is Source Of Influencer</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getInfluencingOrganization()
 * @model
 * @generated
 */
public interface InfluencingOrganization extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Influencing Organization Is Source Of Influencer</b></em>' reference list.
	 * The list contents are of type {@link BMM.Influencer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influencing Organization Is Source Of Influencer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influencing Organization Is Source Of Influencer</em>' reference list.
	 * @see BMM.BMMPackage#getInfluencingOrganization_InfluencingOrganizationIsSourceOfInfluencer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Influencer> getInfluencingOrganizationIsSourceOfInfluencer();

} // InfluencingOrganization
