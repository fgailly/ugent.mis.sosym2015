/**
 */
package REA_EML.REA_EML_BCM;

import REA_EML.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Collaboration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicResources <em>Economic Resources</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicAgents <em>Economic Agents</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getEconomicEvents <em>Economic Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getDualities <em>Dualities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getStockflows <em>Stockflows</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getParticipations <em>Participations</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.BusinessCollaborationModel#getReciprocities <em>Reciprocities</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel()
 * @model
 * @generated
 */
public interface BusinessCollaborationModel extends Model {
	/**
	 * Returns the value of the '<em><b>Economic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.EconomicResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Resources</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_EconomicResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicResource> getEconomicResources();

	/**
	 * Returns the value of the '<em><b>Economic Agents</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.EconomicAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Agents</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_EconomicAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicAgent> getEconomicAgents();

	/**
	 * Returns the value of the '<em><b>Economic Events</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Events</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_EconomicEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicEvent> getEconomicEvents();

	/**
	 * Returns the value of the '<em><b>Commitments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.Commitment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Commitments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commitment> getCommitments();

	/**
	 * Returns the value of the '<em><b>Dualities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.duality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dualities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Dualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<duality> getDualities();

	/**
	 * Returns the value of the '<em><b>Stockflows</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.stockflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockflows</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Stockflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<stockflow> getStockflows();

	/**
	 * Returns the value of the '<em><b>Participations</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.participation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Participations()
	 * @model containment="true"
	 * @generated
	 */
	EList<participation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<fulfillment> getFulfillments();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Specifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Reciprocities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BCM.recicprocity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciprocities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BCM.REA_EML_BCMPackage#getBusinessCollaborationModel_Reciprocities()
	 * @model containment="true"
	 * @generated
	 */
	EList<recicprocity> getReciprocities();

} // BusinessCollaborationModel
