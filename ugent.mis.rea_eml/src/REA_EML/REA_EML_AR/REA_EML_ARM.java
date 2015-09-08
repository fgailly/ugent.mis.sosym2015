/**
 */
package REA_EML.REA_EML_AR;

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
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicEvents <em>Economic Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicResources <em>Economic Resources</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getEconomicAgents <em>Economic Agents</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getDualities <em>Dualities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getReciprocities <em>Reciprocities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getStockflows <em>Stockflows</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getParticipations <em>Participations</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getOrganisationalUnit <em>Organisational Unit</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.REA_EML_ARM#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM()
 * @model
 * @generated
 */
public interface REA_EML_ARM extends Model {
	/**
	 * Returns the value of the '<em><b>Economic Events</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Events</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_EconomicEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicEvent> getEconomicEvents();

	/**
	 * Returns the value of the '<em><b>Economic Resources</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.EconomicResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Resources</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_EconomicResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicResource> getEconomicResources();

	/**
	 * Returns the value of the '<em><b>Economic Agents</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.EconomicAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economic Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economic Agents</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_EconomicAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EconomicAgent> getEconomicAgents();

	/**
	 * Returns the value of the '<em><b>Dualities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.duality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dualities</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Dualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<duality> getDualities();

	/**
	 * Returns the value of the '<em><b>Commitments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.Commitment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commitments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commitments</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Commitments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commitment> getCommitments();

	/**
	 * Returns the value of the '<em><b>Reciprocities</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.reciprocity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reciprocities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reciprocities</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Reciprocities()
	 * @model containment="true"
	 * @generated
	 */
	EList<reciprocity> getReciprocities();

	/**
	 * Returns the value of the '<em><b>Stockflows</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.stockflow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stockflows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockflows</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Stockflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<stockflow> getStockflows();

	/**
	 * Returns the value of the '<em><b>Participations</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.participation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Participations()
	 * @model containment="true"
	 * @generated
	 */
	EList<participation> getParticipations();

	/**
	 * Returns the value of the '<em><b>Fulfillments</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.fulfillment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillments</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Fulfillments()
	 * @model containment="true"
	 * @generated
	 */
	EList<fulfillment> getFulfillments();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link REA_EML.REA_EML_AR.specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_Specifications()
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
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_OrganisationalUnit()
	 * @model
	 * @generated
	 */
	String getOrganisationalUnit();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getOrganisationalUnit <em>Organisational Unit</em>}' attribute.
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
	 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage#getREA_EML_ARM_BusinessProcess()
	 * @model
	 * @generated
	 */
	String getBusinessProcess();

	/**
	 * Sets the value of the '{@link REA_EML.REA_EML_AR.REA_EML_ARM#getBusinessProcess <em>Business Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Process</em>' attribute.
	 * @see #getBusinessProcess()
	 * @generated
	 */
	void setBusinessProcess(String value);

} // REA_EML_ARM
