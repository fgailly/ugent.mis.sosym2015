/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.ParticipationType;

import REA_EML.REA_EML_BCM.EconomicAgent;
import REA_EML.REA_EML_BCM.EconomicEvent;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;
import REA_EML.REA_EML_BCM.participation;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>participation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.participationImpl#getEconomicAgent <em>Economic Agent</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.participationImpl#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.participationImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class participationImpl extends ModelElementImpl implements participation {
	/**
	 * The cached value of the '{@link #getEconomicAgent() <em>Economic Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicAgent()
	 * @generated
	 * @ordered
	 */
	protected EconomicAgent economicAgent;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParticipationType TYPE_EDEFAULT = ParticipationType.PROVIDE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParticipationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected participationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BCMPackage.Literals.PARTICIPATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicAgent getEconomicAgent() {
		if (economicAgent != null && economicAgent.eIsProxy()) {
			InternalEObject oldEconomicAgent = (InternalEObject)economicAgent;
			economicAgent = (EconomicAgent)eResolveProxy(oldEconomicAgent);
			if (economicAgent != oldEconomicAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT, oldEconomicAgent, economicAgent));
			}
		}
		return economicAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicAgent basicGetEconomicAgent() {
		return economicAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEconomicAgent(EconomicAgent newEconomicAgent) {
		EconomicAgent oldEconomicAgent = economicAgent;
		economicAgent = newEconomicAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT, oldEconomicAgent, economicAgent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ParticipationType newType) {
		ParticipationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BCMPackage.PARTICIPATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT:
				if (resolve) return getEconomicAgent();
				return basicGetEconomicAgent();
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT:
				if (resolve) return getEconomicEvent();
				return basicGetEconomicEvent();
			case REA_EML_BCMPackage.PARTICIPATION__TYPE:
				return getType();
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
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT:
				setEconomicAgent((EconomicAgent)newValue);
				return;
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)newValue);
				return;
			case REA_EML_BCMPackage.PARTICIPATION__TYPE:
				setType((ParticipationType)newValue);
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
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT:
				setEconomicAgent((EconomicAgent)null);
				return;
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)null);
				return;
			case REA_EML_BCMPackage.PARTICIPATION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_AGENT:
				return economicAgent != null;
			case REA_EML_BCMPackage.PARTICIPATION__ECONOMIC_EVENT:
				return economicEvent != null;
			case REA_EML_BCMPackage.PARTICIPATION__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //participationImpl
