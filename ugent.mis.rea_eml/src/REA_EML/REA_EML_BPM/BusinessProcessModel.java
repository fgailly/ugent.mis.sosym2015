/**
 */
package REA_EML.REA_EML_BPM;

import REA_EML.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Process Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicEvents <em>Economic Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicResources <em>Economic Resources</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getEconomicAgents <em>Economic Agents</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getDualities <em>Dualities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getReciprocities <em>Reciprocities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getStockflows <em>Stockflows</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getParticipations <em>Participations</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getOrganisationalUnit <em>Organisational Unit</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel()
 * @model
 * @generated
 */
public interface BusinessProcessModel extends Model {
	/**
	 * Returns the value of the '<em><b>Economic Events</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Events</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_EconomicEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicEvent> getEconomicEvents();

	/**
	 * Returns the value of the '<em><b>Economic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.EconomicResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Resources</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_EconomicResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicResource> getEconomicResources();

	/**
	 * Returns the value of the '<em><b>Economic Agents</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.EconomicAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Agents</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_EconomicAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicAgent> getEconomicAgents();

	/**
	 * Returns the value of the '<em><b>Dualities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.duality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dualities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Dualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<duality> getDualities();

	/**
	 * Returns the value of the '<em><b>Commitments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.Commitment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Commitments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commitment> getCommitments();

	/**
	 * Returns the value of the '<em><b>Reciprocities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.reciprocity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciprocities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocities</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Reciprocities()
	 * @model containment="true"
	 * @generated
	 */
	EList<reciprocity> getReciprocities();

	/**
	 * Returns the value of the '<em><b>Stockflows</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.stockflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockflows</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Stockflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<stockflow> getStockflows();

	/**
	 * Returns the value of the '<em><b>Participations</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.participation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Participations()
	 * @model containment="true"
	 * @generated
	 */
	EList<participation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<fulfillment> getFulfillments();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_BPM.specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_Specifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Organisational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisational Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisational Unit</em>' attribute.
	 * @see #setOrganisationalUnit(String)
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_OrganisationalUnit()
	 * @model
	 * @generated
	 */
	String getOrganisationalUnit();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getOrganisationalUnit <em>Organisational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisational Unit</em>' attribute.
	 * @see #getOrganisationalUnit()
	 * @generated
	 */
	void setOrganisationalUnit(String value);

	/**
	 * Returns the value of the '<em><b>Business Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process</em>' attribute.
	 * @see #setBusinessProcess(String)
	 * @see REA_EML.REA_EML_BPM.REA_EML_BPMPackage#getBusinessProcessModel_BusinessProcess()
	 * @model
	 * @generated
	 */
	String getBusinessProcess();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_BPM.BusinessProcessModel#getBusinessProcess <em>Business Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process</em>' attribute.
	 * @see #getBusinessProcess()
	 * @generated
	 */
	void setBusinessProcess(String value);

} // BusinessProcessModel
