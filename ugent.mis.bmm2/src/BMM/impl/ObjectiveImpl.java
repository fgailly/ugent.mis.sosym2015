/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Goal;
import BMM.Objective;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.ObjectiveImpl#getObjectiveQuantifiesGoal <em>Objective Quantifies Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectiveImpl extends DesiredResultImpl implements Objective {
	/**
	 * The cached value of the '{@link #getObjectiveQuantifiesGoal() <em>Objective Quantifies Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveQuantifiesGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> objectiveQuantifiesGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getObjectiveQuantifiesGoal() {
		if (objectiveQuantifiesGoal == null) {
			objectiveQuantifiesGoal = new EObjectResolvingEList<Goal>(Goal.class, this, BMMPackage.OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL);
		}
		return objectiveQuantifiesGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL:
				return getObjectiveQuantifiesGoal();
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
			case BMMPackage.OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL:
				getObjectiveQuantifiesGoal().clear();
				getObjectiveQuantifiesGoal().addAll((Collection<? extends Goal>)newValue);
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
			case BMMPackage.OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL:
				getObjectiveQuantifiesGoal().clear();
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
			case BMMPackage.OBJECTIVE__OBJECTIVE_QUANTIFIES_GOAL:
				return objectiveQuantifiesGoal != null && !objectiveQuantifiesGoal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectiveImpl
