/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.BusinessPolicy;
import BMM.BusinessProcess;
import BMM.BusinessRule;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.BusinessPolicyImpl#getBusinessPolicyIsBasisForBusinessRule <em>Business Policy Is Basis For Business Rule</em>}</li>
 *   <li>{@link BMM.impl.BusinessPolicyImpl#getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy <em>Broader Business Policy Includes More Specific Business Policy</em>}</li>
 *   <li>{@link BMM.impl.BusinessPolicyImpl#getBusinessPolicyGovernsBusinessProcess <em>Business Policy Governs Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessPolicyImpl extends DirectiveImpl implements BusinessPolicy {
	/**
	 * The cached value of the '{@link #getBusinessPolicyIsBasisForBusinessRule() <em>Business Policy Is Basis For Business Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessPolicyIsBasisForBusinessRule()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessRule> businessPolicyIsBasisForBusinessRule;

	/**
	 * The cached value of the '{@link #getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy() <em>Broader Business Policy Includes More Specific Business Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessPolicy> broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy;

	/**
	 * The cached value of the '{@link #getBusinessPolicyGovernsBusinessProcess() <em>Business Policy Governs Business Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessPolicyGovernsBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> businessPolicyGovernsBusinessProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.BUSINESS_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessRule> getBusinessPolicyIsBasisForBusinessRule() {
		if (businessPolicyIsBasisForBusinessRule == null) {
			businessPolicyIsBasisForBusinessRule = new EObjectResolvingEList<BusinessRule>(BusinessRule.class, this, BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE);
		}
		return businessPolicyIsBasisForBusinessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessPolicy> getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy() {
		if (broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy == null) {
			broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy = new EObjectResolvingEList<BusinessPolicy>(BusinessPolicy.class, this, BMMPackage.BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY);
		}
		return broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getBusinessPolicyGovernsBusinessProcess() {
		if (businessPolicyGovernsBusinessProcess == null) {
			businessPolicyGovernsBusinessProcess = new EObjectResolvingEList<BusinessProcess>(BusinessProcess.class, this, BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS);
		}
		return businessPolicyGovernsBusinessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE:
				return getBusinessPolicyIsBasisForBusinessRule();
			case BMMPackage.BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY:
				return getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy();
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS:
				return getBusinessPolicyGovernsBusinessProcess();
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
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE:
				getBusinessPolicyIsBasisForBusinessRule().clear();
				getBusinessPolicyIsBasisForBusinessRule().addAll((Collection<? extends BusinessRule>)newValue);
				return;
			case BMMPackage.BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY:
				getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy().clear();
				getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy().addAll((Collection<? extends BusinessPolicy>)newValue);
				return;
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS:
				getBusinessPolicyGovernsBusinessProcess().clear();
				getBusinessPolicyGovernsBusinessProcess().addAll((Collection<? extends BusinessProcess>)newValue);
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
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE:
				getBusinessPolicyIsBasisForBusinessRule().clear();
				return;
			case BMMPackage.BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY:
				getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy().clear();
				return;
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS:
				getBusinessPolicyGovernsBusinessProcess().clear();
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
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_IS_BASIS_FOR_BUSINESS_RULE:
				return businessPolicyIsBasisForBusinessRule != null && !businessPolicyIsBasisForBusinessRule.isEmpty();
			case BMMPackage.BUSINESS_POLICY__BROADER_BUSINESS_POLICY_INCLUDES_MORE_SPECIFIC_BUSINESS_POLICY:
				return broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy != null && !broaderBusinessPolicyIncludesMoreSpecificBusinessPolicy.isEmpty();
			case BMMPackage.BUSINESS_POLICY__BUSINESS_POLICY_GOVERNS_BUSINESS_PROCESS:
				return businessPolicyGovernsBusinessProcess != null && !businessPolicyGovernsBusinessProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessPolicyImpl
