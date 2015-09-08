/**
 */
package REA_EML.REA_EML_BC;

import REA_EML.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicResources <em>Economic Resources</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicAgents <em>Economic Agents</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getEconomicEvents <em>Economic Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getDualities <em>Dualities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getStockflows <em>Stockflows</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getParticipations <em>Participations</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BC.REA_EML_BCM#getReciprocities <em>Reciprocities</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM()
 * @model
 * @generated
 */
public interface REA_EML_BCM extends Model {
	/**
	 * Returns the value of the '<em><b>Economic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.EconomicResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Resources</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_EconomicResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicResource> getEconomicResources();

	/**
	 * Returns the value of the '<em><b>Economic Agents</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.EconomicAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Agents</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_EconomicAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicAgent> getEconomicAgents();

	/**
	 * Returns the value of the '<em><b>Economic Events</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Events</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_EconomicEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicEvent> getEconomicEvents();

	/**
	 * Returns the value of the '<em><b>Commitments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.Commitment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Commitments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commitment> getCommitments();

	/**
	 * Returns the value of the '<em><b>Dualities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.duality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dualities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Dualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<duality> getDualities();

	/**
	 * Returns the value of the '<em><b>Stockflows</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.stockflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockflows</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Stockflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<stockflow> getStockflows();

	/**
	 * Returns the value of the '<em><b>Participations</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.participation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Participations()
	 * @model containment="true"
	 * @generated
	 */
	EList<participation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<fulfillment> getFulfillments();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Specifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Reciprocities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BC.recicprocity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciprocities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage#getREA_EML_BCM_Reciprocities()
	 * @model containment="true"
	 * @generated
	 */
	EList<recicprocity> getReciprocities();

} // REA_EML_BCM
