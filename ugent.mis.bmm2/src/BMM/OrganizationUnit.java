/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitDefinesEnd <em>Organization Unit Defines End</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitEstablishesMeans <em>Organization Unit Establishes Means</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForAsset <em>Organization Unit Is Responsible For Asset</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForLiability <em>Organization Unit Is Responsible For Liability</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitRecognizesInfluencer <em>Organization Unit Recognizes Influencer</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitActAsInfluencingOrganization <em>Organization Unit Act As Influencing Organization</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitMakesAssessment <em>Organization Unit Makes Assessment</em>}</li>
 *   <li>{@link BMM.OrganizationUnit#getOrganizationUnitIsResponsibleForBusinessProcess <em>Organization Unit Is Responsible For Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getOrganizationUnit()
 * @model
 * @generated
 */
public interface OrganizationUnit extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Organization Unit Defines End</b></em>' reference list.
	 * The list contents are of type {@link BMM.End}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Defines End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Defines End</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitDefinesEnd()
	 * @model ordered="false"
	 * @generated
	 */
	EList<End> getOrganizationUnitDefinesEnd();

	/**
	 * Returns the value of the '<em><b>Organization Unit Establishes Means</b></em>' reference list.
	 * The list contents are of type {@link BMM.Means}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Establishes Means</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Establishes Means</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitEstablishesMeans()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Means> getOrganizationUnitEstablishesMeans();

	/**
	 * Returns the value of the '<em><b>Organization Unit Is Responsible For Asset</b></em>' reference list.
	 * The list contents are of type {@link BMM.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Is Responsible For Asset</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Is Responsible For Asset</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitIsResponsibleForAsset()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Asset> getOrganizationUnitIsResponsibleForAsset();

	/**
	 * Returns the value of the '<em><b>Organization Unit Is Responsible For Liability</b></em>' reference list.
	 * The list contents are of type {@link BMM.Liability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Is Responsible For Liability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Is Responsible For Liability</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitIsResponsibleForLiability()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Liability> getOrganizationUnitIsResponsibleForLiability();

	/**
	 * Returns the value of the '<em><b>Organization Unit Recognizes Influencer</b></em>' reference list.
	 * The list contents are of type {@link BMM.Influencer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Recognizes Influencer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Recognizes Influencer</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitRecognizesInfluencer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Influencer> getOrganizationUnitRecognizesInfluencer();

	/**
	 * Returns the value of the '<em><b>Organization Unit Act As Influencing Organization</b></em>' reference list.
	 * The list contents are of type {@link BMM.InfluencingOrganization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Act As Influencing Organization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Act As Influencing Organization</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitActAsInfluencingOrganization()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InfluencingOrganization> getOrganizationUnitActAsInfluencingOrganization();

	/**
	 * Returns the value of the '<em><b>Organization Unit Makes Assessment</b></em>' reference list.
	 * The list contents are of type {@link BMM.Assessment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Makes Assessment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Makes Assessment</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitMakesAssessment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assessment> getOrganizationUnitMakesAssessment();

	/**
	 * Returns the value of the '<em><b>Organization Unit Is Responsible For Business Process</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Unit Is Responsible For Business Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit Is Responsible For Business Process</em>' reference list.
	 * @see BMM.BMMPackage#getOrganizationUnit_OrganizationUnitIsResponsibleForBusinessProcess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getOrganizationUnitIsResponsibleForBusinessProcess();

} // OrganizationUnit
