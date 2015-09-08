/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.Mission;
import BMM.OrganizationUnit;
import BMM.Strategy;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.StrategyImpl#getStrategyIsAComponentOfThePlanForMission <em>Strategy Is AComponent Of The Plan For Mission</em>}</li>
 *   <li>{@link BMM.impl.StrategyImpl#getStrategyDeterminesOrganizationUnit <em>Strategy Determines Organization Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategyImpl extends CourseOfActionImpl implements Strategy {
	/**
	 * The cached value of the '{@link #getStrategyIsAComponentOfThePlanForMission() <em>Strategy Is AComponent Of The Plan For Mission</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyIsAComponentOfThePlanForMission()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> strategyIsAComponentOfThePlanForMission;

	/**
	 * The cached value of the '{@link #getStrategyDeterminesOrganizationUnit() <em>Strategy Determines Organization Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyDeterminesOrganizationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationUnit> strategyDeterminesOrganizationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getStrategyIsAComponentOfThePlanForMission() {
		if (strategyIsAComponentOfThePlanForMission == null) {
			strategyIsAComponentOfThePlanForMission = new EObjectResolvingEList<Mission>(Mission.class, this, BMMPackage.STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION);
		}
		return strategyIsAComponentOfThePlanForMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationUnit> getStrategyDeterminesOrganizationUnit() {
		if (strategyDeterminesOrganizationUnit == null) {
			strategyDeterminesOrganizationUnit = new EObjectResolvingEList<OrganizationUnit>(OrganizationUnit.class, this, BMMPackage.STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT);
		}
		return strategyDeterminesOrganizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION:
				return getStrategyIsAComponentOfThePlanForMission();
			case BMMPackage.STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT:
				return getStrategyDeterminesOrganizationUnit();
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
			case BMMPackage.STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION:
				getStrategyIsAComponentOfThePlanForMission().clear();
				getStrategyIsAComponentOfThePlanForMission().addAll((Collection<? extends Mission>)newValue);
				return;
			case BMMPackage.STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT:
				getStrategyDeterminesOrganizationUnit().clear();
				getStrategyDeterminesOrganizationUnit().addAll((Collection<? extends OrganizationUnit>)newValue);
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
			case BMMPackage.STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION:
				getStrategyIsAComponentOfThePlanForMission().clear();
				return;
			case BMMPackage.STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT:
				getStrategyDeterminesOrganizationUnit().clear();
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
			case BMMPackage.STRATEGY__STRATEGY_IS_ACOMPONENT_OF_THE_PLAN_FOR_MISSION:
				return strategyIsAComponentOfThePlanForMission != null && !strategyIsAComponentOfThePlanForMission.isEmpty();
			case BMMPackage.STRATEGY__STRATEGY_DETERMINES_ORGANIZATION_UNIT:
				return strategyDeterminesOrganizationUnit != null && !strategyDeterminesOrganizationUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StrategyImpl
