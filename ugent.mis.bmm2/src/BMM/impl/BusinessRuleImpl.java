/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.BusinessProcess;
import BMM.BusinessRule;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.BusinessRuleImpl#getBusinessRuleGuidesBusinessProcess <em>Business Rule Guides Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessRuleImpl extends DirectiveImpl implements BusinessRule {
	/**
	 * The cached value of the '{@link #getBusinessRuleGuidesBusinessProcess() <em>Business Rule Guides Business Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessRuleGuidesBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> businessRuleGuidesBusinessProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.BUSINESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getBusinessRuleGuidesBusinessProcess() {
		if (businessRuleGuidesBusinessProcess == null) {
			businessRuleGuidesBusinessProcess = new EObjectResolvingEList<BusinessProcess>(BusinessProcess.class, this, BMMPackage.BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS);
		}
		return businessRuleGuidesBusinessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS:
				return getBusinessRuleGuidesBusinessProcess();
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
			case BMMPackage.BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS:
				getBusinessRuleGuidesBusinessProcess().clear();
				getBusinessRuleGuidesBusinessProcess().addAll((Collection<? extends BusinessProcess>)newValue);
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
			case BMMPackage.BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS:
				getBusinessRuleGuidesBusinessProcess().clear();
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
			case BMMPackage.BUSINESS_RULE__BUSINESS_RULE_GUIDES_BUSINESS_PROCESS:
				return businessRuleGuidesBusinessProcess != null && !businessRuleGuidesBusinessProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessRuleImpl
