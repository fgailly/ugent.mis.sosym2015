/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.PotentialImpact#getPotentialImpactProvidesImpetusForDirective <em>Potential Impact Provides Impetus For Directive</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getPotentialImpact()
 * @model
 * @generated
 */
public interface PotentialImpact extends MotivationElement {
	/**
	 * Returns the value of the '<em><b>Potential Impact Provides Impetus For Directive</b></em>' reference list.
	 * The list contents are of type {@link BMM.Directive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potential Impact Provides Impetus For Directive</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Impact Provides Impetus For Directive</em>' reference list.
	 * @see BMM.BMMPackage#getPotentialImpact_PotentialImpactProvidesImpetusForDirective()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Directive> getPotentialImpactProvidesImpetusForDirective();

} // PotentialImpact
