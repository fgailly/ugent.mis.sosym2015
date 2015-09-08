/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Goal;
import BMM.Vision;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.GoalImpl#getGoalAmplifiesVision <em>Goal Amplifies Vision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends DesiredResultImpl implements Goal {
	/**
	 * The cached value of the '{@link #getGoalAmplifiesVision() <em>Goal Amplifies Vision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalAmplifiesVision()
	 * @generated
	 * @ordered
	 */
	protected Vision goalAmplifiesVision;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision getGoalAmplifiesVision() {
		if (goalAmplifiesVision != null && goalAmplifiesVision.eIsProxy()) {
			InternalEObject oldGoalAmplifiesVision = (InternalEObject)goalAmplifiesVision;
			goalAmplifiesVision = (Vision)eResolveProxy(oldGoalAmplifiesVision);
			if (goalAmplifiesVision != oldGoalAmplifiesVision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BMMPackage.GOAL__GOAL_AMPLIFIES_VISION, oldGoalAmplifiesVision, goalAmplifiesVision));
			}
		}
		return goalAmplifiesVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vision basicGetGoalAmplifiesVision() {
		return goalAmplifiesVision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalAmplifiesVision(Vision newGoalAmplifiesVision) {
		Vision oldGoalAmplifiesVision = goalAmplifiesVision;
		goalAmplifiesVision = newGoalAmplifiesVision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.GOAL__GOAL_AMPLIFIES_VISION, oldGoalAmplifiesVision, goalAmplifiesVision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.GOAL__GOAL_AMPLIFIES_VISION:
				if (resolve) return getGoalAmplifiesVision();
				return basicGetGoalAmplifiesVision();
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
			case BMMPackage.GOAL__GOAL_AMPLIFIES_VISION:
				setGoalAmplifiesVision((Vision)newValue);
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
			case BMMPackage.GOAL__GOAL_AMPLIFIES_VISION:
				setGoalAmplifiesVision((Vision)null);
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
			case BMMPackage.GOAL__GOAL_AMPLIFIES_VISION:
				return goalAmplifiesVision != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
