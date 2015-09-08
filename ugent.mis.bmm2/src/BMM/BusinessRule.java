/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.BusinessRule#getBusinessRuleGuidesBusinessProcess <em>Business Rule Guides Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getBusinessRule()
 * @model
 * @generated
 */
public interface BusinessRule extends Directive {
	/**
	 * Returns the value of the '<em><b>Business Rule Guides Business Process</b></em>' reference list.
	 * The list contents are of type {@link BMM.BusinessProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Rule Guides Business Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Rule Guides Business Process</em>' reference list.
	 * @see BMM.BMMPackage#getBusinessRule_BusinessRuleGuidesBusinessProcess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BusinessProcess> getBusinessRuleGuidesBusinessProcess();

} // BusinessRule
