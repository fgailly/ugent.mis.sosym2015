/**
 */
package REA_EML.REA_EML_BPM.impl;

import REA_EML.REA_EML_BPM.Commitment;
import REA_EML.REA_EML_BPM.EconomicEvent;
import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;
import REA_EML.REA_EML_BPM.fulfillment;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.fulfillmentImpl#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.fulfillmentImpl#getCommitment <em>Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class fulfillmentImpl extends ModelElementImpl implements fulfillment {
	/**
	 * The cached value of the '{@link #getEconomicEvent() <em>Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicEvent()
	 * @generated
	 * @ordered
	 */
	protected EconomicEvent economicEvent;

	/**
	 * The cached value of the '{@link #getCommitment() <em>Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitment()
	 * @generated
	 * @ordered
	 */
	protected Commitment commitment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected fulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPMPackage.Literals.FULFILLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicEvent getEconomicEvent() {
		if (economicEvent != null && economicEvent.eIsProxy()) {
			InternalEObject oldEconomicEvent = (InternalEObject)economicEvent;
			economicEvent = (EconomicEvent)eResolveProxy(oldEconomicEvent);
			if (economicEvent != oldEconomicEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
			}
		}
		return economicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicEvent basicGetEconomicEvent() {
		return economicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEconomicEvent(EconomicEvent newEconomicEvent) {
		EconomicEvent oldEconomicEvent = economicEvent;
		economicEvent = newEconomicEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment getCommitment() {
		if (commitment != null && commitment.eIsProxy()) {
			InternalEObject oldCommitment = (InternalEObject)commitment;
			commitment = (Commitment)eResolveProxy(oldCommitment);
			if (commitment != oldCommitment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.FULFILLMENT__COMMITMENT, oldCommitment, commitment));
			}
		}
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment basicGetCommitment() {
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitment(Commitment newCommitment) {
		Commitment oldCommitment = commitment;
		commitment = newCommitment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.FULFILLMENT__COMMITMENT, oldCommitment, commitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT:
				if (resolve) return getEconomicEvent();
				return basicGetEconomicEvent();
			case REA_EML_BPMPackage.FULFILLMENT__COMMITMENT:
				if (resolve) return getCommitment();
				return basicGetCommitment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)newValue);
				return;
			case REA_EML_BPMPackage.FULFILLMENT__COMMITMENT:
				setCommitment((Commitment)newValue);
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
			case REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)null);
				return;
			case REA_EML_BPMPackage.FULFILLMENT__COMMITMENT:
				setCommitment((Commitment)null);
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
			case REA_EML_BPMPackage.FULFILLMENT__ECONOMIC_EVENT:
				return economicEvent != null;
			case REA_EML_BPMPackage.FULFILLMENT__COMMITMENT:
				return commitment != null;
		}
		return super.eIsSet(featureID);
	}

} //fulfillmentImpl
