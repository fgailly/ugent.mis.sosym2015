/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.DesiredResult;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desired Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.DesiredResultImpl#getBroaderDesiredResultIncludesMoreSpecificDesiredResult <em>Broader Desired Result Includes More Specific Desired Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesiredResultImpl extends EndImpl implements DesiredResult {
	/**
	 * The cached value of the '{@link #getBroaderDesiredResultIncludesMoreSpecificDesiredResult() <em>Broader Desired Result Includes More Specific Desired Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroaderDesiredResultIncludesMoreSpecificDesiredResult()
	 * @generated
	 * @ordered
	 */
	protected EList<DesiredResult> broaderDesiredResultIncludesMoreSpecificDesiredResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesiredResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.DESIRED_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesiredResult> getBroaderDesiredResultIncludesMoreSpecificDesiredResult() {
		if (broaderDesiredResultIncludesMoreSpecificDesiredResult == null) {
			broaderDesiredResultIncludesMoreSpecificDesiredResult = new EObjectResolvingEList<DesiredResult>(DesiredResult.class, this, BMMPackage.DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT);
		}
		return broaderDesiredResultIncludesMoreSpecificDesiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT:
				return getBroaderDesiredResultIncludesMoreSpecificDesiredResult();
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
			case BMMPackage.DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT:
				getBroaderDesiredResultIncludesMoreSpecificDesiredResult().clear();
				getBroaderDesiredResultIncludesMoreSpecificDesiredResult().addAll((Collection<? extends DesiredResult>)newValue);
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
			case BMMPackage.DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT:
				getBroaderDesiredResultIncludesMoreSpecificDesiredResult().clear();
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
			case BMMPackage.DESIRED_RESULT__BROADER_DESIRED_RESULT_INCLUDES_MORE_SPECIFIC_DESIRED_RESULT:
				return broaderDesiredResultIncludesMoreSpecificDesiredResult != null && !broaderDesiredResultIncludesMoreSpecificDesiredResult.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesiredResultImpl
