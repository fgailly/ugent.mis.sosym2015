/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Mission;
import BMM.Vision;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.MissionImpl#getMissionMakesOperativeVision <em>Mission Makes Operative Vision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MissionImpl extends MeansImpl implements Mission {
	/**
	 * The cached value of the '{@link #getMissionMakesOperativeVision() <em>Mission Makes Operative Vision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionMakesOperativeVision()
	 * @generated
	 * @ordered
	 */
	protected Vision missionMakesOperativeVision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision getMissionMakesOperativeVision() {
		if (missionMakesOperativeVision != null && missionMakesOperativeVision.eIsProxy()) {
			InternalEObject oldMissionMakesOperativeVision = (InternalEObject)missionMakesOperativeVision;
			missionMakesOperativeVision = (Vision)eResolveProxy(oldMissionMakesOperativeVision);
			if (missionMakesOperativeVision != oldMissionMakesOperativeVision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION, oldMissionMakesOperativeVision, missionMakesOperativeVision));
			}
		}
		return missionMakesOperativeVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision basicGetMissionMakesOperativeVision() {
		return missionMakesOperativeVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissionMakesOperativeVision(Vision newMissionMakesOperativeVision) {
		Vision oldMissionMakesOperativeVision = missionMakesOperativeVision;
		missionMakesOperativeVision = newMissionMakesOperativeVision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION, oldMissionMakesOperativeVision, missionMakesOperativeVision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION:
				if (resolve) return getMissionMakesOperativeVision();
				return basicGetMissionMakesOperativeVision();
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
			case BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION:
				setMissionMakesOperativeVision((Vision)newValue);
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
			case BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION:
				setMissionMakesOperativeVision((Vision)null);
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
			case BMMPackage.MISSION__MISSION_MAKES_OPERATIVE_VISION:
				return missionMakesOperativeVision != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionImpl
