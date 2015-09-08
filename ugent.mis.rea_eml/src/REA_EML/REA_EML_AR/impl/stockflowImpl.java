/**
 */
package REA_EML.REA_EML_AR.impl;

import REA_EML.REA_EML_AR.EconomicEvent;
import REA_EML.REA_EML_AR.EconomicResource;
import REA_EML.REA_EML_AR.REA_EML_ARPackage;
import REA_EML.REA_EML_AR.stockflow;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stockflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_AR.impl.stockflowImpl#getEconomicEvent <em>Economic Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_AR.impl.stockflowImpl#getEconomicResouce <em>Economic Resouce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stockflowImpl extends ModelElementImpl implements stockflow {
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
	 * The cached value of the '{@link #getEconomicResouce() <em>Economic Resouce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicResouce()
	 * @generated
	 * @ordered
	 */
	protected EconomicResource economicResouce;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stockflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_ARPackage.Literals.STOCKFLOW;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT, oldEconomicEvent, economicEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResource getEconomicResouce() {
		if (economicResouce != null && economicResouce.eIsProxy()) {
			InternalEObject oldEconomicResouce = (InternalEObject)economicResouce;
			economicResouce = (EconomicResource)eResolveProxy(oldEconomicResouce);
			if (economicResouce != oldEconomicResouce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE, oldEconomicResouce, economicResouce));
			}
		}
		return economicResouce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResource basicGetEconomicResouce() {
		return economicResouce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEconomicResouce(EconomicResource newEconomicResouce) {
		EconomicResource oldEconomicResouce = economicResouce;
		economicResouce = newEconomicResouce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE, oldEconomicResouce, economicResouce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT:
				if (resolve) return getEconomicEvent();
				return basicGetEconomicEvent();
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE:
				if (resolve) return getEconomicResouce();
				return basicGetEconomicResouce();
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
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)newValue);
				return;
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE:
				setEconomicResouce((EconomicResource)newValue);
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
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT:
				setEconomicEvent((EconomicEvent)null);
				return;
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE:
				setEconomicResouce((EconomicResource)null);
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
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_EVENT:
				return economicEvent != null;
			case REA_EML_ARPackage.STOCKFLOW__ECONOMIC_RESOUCE:
				return economicResouce != null;
		}
		return super.eIsSet(featureID);
	}

} //stockflowImpl
