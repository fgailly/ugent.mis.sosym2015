/**
 */
package REA_EML.REA_EML_AR.impl;

import REA_EML.REA_EML_AR.DecrementEconomicEvent;
import REA_EML.REA_EML_AR.IncrementEconomicEvent;
import REA_EML.REA_EML_AR.REA_EML_ARPackage;
import REA_EML.REA_EML_AR.duality;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>duality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_AR.impl.dualityImpl#getDecrementEconomicEvent <em>Decrement Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.impl.dualityImpl#getIncrementEconomicEvent <em>Increment Economic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dualityImpl extends ModelElementImpl implements duality {
	/**
	 * The cached value of the '{@link #getDecrementEconomicEvent() <em>Decrement Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecrementEconomicEvent()
	 * @generated
	 * @ordered
	 */
	protected DecrementEconomicEvent decrementEconomicEvent;

	/**
	 * The cached value of the '{@link #getIncrementEconomicEvent() <em>Increment Economic Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementEconomicEvent()
	 * @generated
	 * @ordered
	 */
	protected IncrementEconomicEvent incrementEconomicEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_ARPackage.Literals.DUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementEconomicEvent getDecrementEconomicEvent() {
		if (decrementEconomicEvent != null && decrementEconomicEvent.eIsProxy()) {
			InternalEObject oldDecrementEconomicEvent = (InternalEObject)decrementEconomicEvent;
			decrementEconomicEvent = (DecrementEconomicEvent)eResolveProxy(oldDecrementEconomicEvent);
			if (decrementEconomicEvent != oldDecrementEconomicEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT, oldDecrementEconomicEvent, decrementEconomicEvent));
			}
		}
		return decrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementEconomicEvent basicGetDecrementEconomicEvent() {
		return decrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecrementEconomicEvent(DecrementEconomicEvent newDecrementEconomicEvent) {
		DecrementEconomicEvent oldDecrementEconomicEvent = decrementEconomicEvent;
		decrementEconomicEvent = newDecrementEconomicEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT, oldDecrementEconomicEvent, decrementEconomicEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementEconomicEvent getIncrementEconomicEvent() {
		if (incrementEconomicEvent != null && incrementEconomicEvent.eIsProxy()) {
			InternalEObject oldIncrementEconomicEvent = (InternalEObject)incrementEconomicEvent;
			incrementEconomicEvent = (IncrementEconomicEvent)eResolveProxy(oldIncrementEconomicEvent);
			if (incrementEconomicEvent != oldIncrementEconomicEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT, oldIncrementEconomicEvent, incrementEconomicEvent));
			}
		}
		return incrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementEconomicEvent basicGetIncrementEconomicEvent() {
		return incrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementEconomicEvent(IncrementEconomicEvent newIncrementEconomicEvent) {
		IncrementEconomicEvent oldIncrementEconomicEvent = incrementEconomicEvent;
		incrementEconomicEvent = newIncrementEconomicEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT, oldIncrementEconomicEvent, incrementEconomicEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT:
				if (resolve) return getDecrementEconomicEvent();
				return basicGetDecrementEconomicEvent();
			case REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT:
				if (resolve) return getIncrementEconomicEvent();
				return basicGetIncrementEconomicEvent();
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
			case REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT:
				setDecrementEconomicEvent((DecrementEconomicEvent)newValue);
				return;
			case REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT:
				setIncrementEconomicEvent((IncrementEconomicEvent)newValue);
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
			case REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT:
				setDecrementEconomicEvent((DecrementEconomicEvent)null);
				return;
			case REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT:
				setIncrementEconomicEvent((IncrementEconomicEvent)null);
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
			case REA_EML_ARPackage.DUALITY__DECREMENT_ECONOMIC_EVENT:
				return decrementEconomicEvent != null;
			case REA_EML_ARPackage.DUALITY__INCREMENT_ECONOMIC_EVENT:
				return incrementEconomicEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //dualityImpl
