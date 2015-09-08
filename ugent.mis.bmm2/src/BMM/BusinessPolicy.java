/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.BusinessPolicy#getBusinessPolicyIsBasisForBusinessRule <em>Business Policy Is Basis For Business Rule</em>}</li>
 *   <li>{@link BMM.BusinessPolicy#getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy <em>Broader Business Policy Includes More Specific Business Policy</em>}</li>
 *   <li>{@link BMM.BusinessPolicy#getBusinessPolicyGovernsBusinessProcess <em>Business Policy Governs Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getBusinessPolicy()
 * @model
 * @generated
 */
public interface BusinessPolicy extends Directive {
	/**
	 * Returns the value of the '<em><b>Business Policy Is Basis For Business Rule</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Policy Is Basis For Business Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Policy Is Basis For Business Rule</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessPolicy_BusinessPolicyIsBasisForBusinessRule()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessRule> getBusinessPolicyIsBasisForBusinessRule();

	/**
	 * Returns the value of the '<em><b>Broader Business Policy Includes More Specific Business Policy</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broader Business Policy Includes More Specific Business Policy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broader Business Policy Includes More Specific Business Policy</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessPolicy_BroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessPolicy> getBroaderBusinessPolicyIncludesMoreSpecificBusinessPolicy();

	/**
	 * Returns the value of the '<em><b>Business Policy Governs Business Process</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Policy Governs Business Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Policy Governs Business Process</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessPolicy_BusinessPolicyGovernsBusinessProcess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getBusinessPolicyGovernsBusinessProcess();

} // BusinessPolicy
