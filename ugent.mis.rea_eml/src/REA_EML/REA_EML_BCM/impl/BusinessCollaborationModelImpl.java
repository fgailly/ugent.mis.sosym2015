/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.REA_EML_BCM.BusinessCollaborationModel;
import REA_EML.REA_EML_BCM.Commitment;
import REA_EML.REA_EML_BCM.EconomicAgent;
import REA_EML.REA_EML_BCM.EconomicEvent;
import REA_EML.REA_EML_BCM.EconomicResource;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;
import REA_EML.REA_EML_BCM.duality;
import REA_EML.REA_EML_BCM.fulfillment;
import REA_EML.REA_EML_BCM.participation;
import REA_EML.REA_EML_BCM.recicprocity;
import REA_EML.REA_EML_BCM.specification;
import REA_EML.REA_EML_BCM.stockflow;

import REA_EML.impl.ModelImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Collaboration Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getEconomicResources <em>Economic Resources</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getEconomicAgents <em>Economic Agents</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getEconomicEvents <em>Economic Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getCommitments <em>Commitments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getDualities <em>Dualities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getStockflows <em>Stockflows</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getParticipations <em>Participations</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getFulfillments <em>Fulfillments</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.BusinessCollaborationModelImpl#getReciprocities <em>Reciprocities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessCollaborationModelImpl extends ModelImpl implements BusinessCollaborationModel {
	/**
	 * The cached value of the '{@link #getEconomicResources() <em>Economic Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EconomicResource> economicResources;

	/**
	 * The cached value of the '{@link #getEconomicAgents() <em>Economic Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<EconomicAgent> economicAgents;

	/**
	 * The cached value of the '{@link #getEconomicEvents() <em>Economic Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EconomicEvent> economicEvents;

	/**
	 * The cached value of the '{@link #getCommitments() <em>Commitments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitments()
	 * @generated
	 * @ordered
	 */
	protected EList<Commitment> commitments;

	/**
	 * The cached value of the '{@link #getDualities() <em>Dualities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDualities()
	 * @generated
	 * @ordered
	 */
	protected EList<duality> dualities;

	/**
	 * The cached value of the '{@link #getStockflows() <em>Stockflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockflows()
	 * @generated
	 * @ordered
	 */
	protected EList<stockflow> stockflows;

	/**
	 * The cached value of the '{@link #getParticipations() <em>Participations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipations()
	 * @generated
	 * @ordered
	 */
	protected EList<participation> participations;

	/**
	 * The cached value of the '{@link #getFulfillments() <em>Fulfillments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillments()
	 * @generated
	 * @ordered
	 */
	protected EList<fulfillment> fulfillments;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<specification> specifications;

	/**
	 * The cached value of the '{@link #getReciprocities() <em>Reciprocities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReciprocities()
	 * @generated
	 * @ordered
	 */
	protected EList<recicprocity> reciprocities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessCollaborationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EconomicResource> getEconomicResources() {
		if (economicResources == null) {
			economicResources = new EObjectContainmentEList<EconomicResource>(EconomicResource.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES);
		}
		return economicResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EconomicAgent> getEconomicAgents() {
		if (economicAgents == null) {
			economicAgents = new EObjectContainmentEList<EconomicAgent>(EconomicAgent.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS);
		}
		return economicAgents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EconomicEvent> getEconomicEvents() {
		if (economicEvents == null) {
			economicEvents = new EObjectContainmentEList<EconomicEvent>(EconomicEvent.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS);
		}
		return economicEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commitment> getCommitments() {
		if (commitments == null) {
			commitments = new EObjectContainmentEList<Commitment>(Commitment.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS);
		}
		return commitments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<duality> getDualities() {
		if (dualities == null) {
			dualities = new EObjectContainmentEList<duality>(duality.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES);
		}
		return dualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<stockflow> getStockflows() {
		if (stockflows == null) {
			stockflows = new EObjectContainmentEList<stockflow>(stockflow.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS);
		}
		return stockflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<participation> getParticipations() {
		if (participations == null) {
			participations = new EObjectContainmentEList<participation>(participation.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS);
		}
		return participations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fulfillment> getFulfillments() {
		if (fulfillments == null) {
			fulfillments = new EObjectContainmentEList<fulfillment>(fulfillment.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS);
		}
		return fulfillments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentEList<specification>(specification.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<recicprocity> getReciprocities() {
		if (reciprocities == null) {
			reciprocities = new EObjectContainmentEList<recicprocity>(recicprocity.class, this, REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES);
		}
		return reciprocities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
				return ((InternalEList<?>)getEconomicResources()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
				return ((InternalEList<?>)getEconomicAgents()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
				return ((InternalEList<?>)getEconomicEvents()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
				return ((InternalEList<?>)getCommitments()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
				return ((InternalEList<?>)getDualities()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
				return ((InternalEList<?>)getStockflows()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
				return ((InternalEList<?>)getParticipations()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
				return ((InternalEList<?>)getFulfillments()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
				return ((InternalEList<?>)getReciprocities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
				return getEconomicResources();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
				return getEconomicAgents();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
				return getEconomicEvents();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
				return getCommitments();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
				return getDualities();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
				return getStockflows();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
				return getParticipations();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
				return getFulfillments();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
				return getSpecifications();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
				return getReciprocities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
				getEconomicResources().clear();
				getEconomicResources().addAll((Collection<? extends EconomicResource>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
				getEconomicAgents().clear();
				getEconomicAgents().addAll((Collection<? extends EconomicAgent>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
				getEconomicEvents().clear();
				getEconomicEvents().addAll((Collection<? extends EconomicEvent>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
				getCommitments().clear();
				getCommitments().addAll((Collection<? extends Commitment>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
				getDualities().clear();
				getDualities().addAll((Collection<? extends duality>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
				getStockflows().clear();
				getStockflows().addAll((Collection<? extends stockflow>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
				getParticipations().clear();
				getParticipations().addAll((Collection<? extends participation>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
				getFulfillments().clear();
				getFulfillments().addAll((Collection<? extends fulfillment>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends specification>)newValue);
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
				getReciprocities().clear();
				getReciprocities().addAll((Collection<? extends recicprocity>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
				getEconomicResources().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
				getEconomicAgents().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
				getEconomicEvents().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
				getCommitments().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
				getDualities().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
				getStockflows().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
				getParticipations().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
				getFulfillments().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
				getSpecifications().clear();
				return;
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
				getReciprocities().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
				return economicResources != null && !economicResources.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
				return economicAgents != null && !economicAgents.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
				return economicEvents != null && !economicEvents.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
				return commitments != null && !commitments.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
				return dualities != null && !dualities.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
				return stockflows != null && !stockflows.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
				return participations != null && !participations.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
				return fulfillments != null && !fulfillments.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
				return reciprocities != null && !reciprocities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessCollaborationModelImpl
