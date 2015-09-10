/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.REA_EML_BCM.EconomicEvent;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;
import REA_EML.REA_EML_BCM.duality;

import REA_EML.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>duality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.dualityImpl#getEconomicEvent <em>Economic Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dualityImpl extends ModelElementImpl implements duality {
	/**
	 * The cached value of the '{@link #getEconomicEvent() <em>Economic Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EconomicEvent> economicEvent;

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
		return REA_EML_BCMPackage.Literals.DUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EconomicEvent> getEconomicEvent() {
		if (economicEvent == null) {
			economicEvent = new EObjectResolvingEList<EconomicEvent>(EconomicEvent.class, this, REA_EML_BCMPackage.DUALITY__ECONOMIC_EVENT);
		}
		return economicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BCMPackage.DUALITY__ECONOMIC_EVENT:
				return getEconomicEvent();
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
			case REA_EML_BCMPackage.DUALITY__ECONOMIC_EVENT:
				getEconomicEvent().clear();
				getEconomicEvent().addAll((Collection<? extends EconomicEvent>)newValue);
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
			case REA_EML_BCMPackage.DUALITY__ECONOMIC_EVENT:
				getEconomicEvent().clear();
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
			case REA_EML_BCMPackage.DUALITY__ECONOMIC_EVENT:
				return economicEvent != null && !economicEvent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //dualityImpl
