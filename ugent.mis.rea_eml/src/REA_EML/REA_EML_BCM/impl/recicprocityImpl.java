/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.REA_EML_BCM.Commitment;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;
import REA_EML.REA_EML_BCM.recicprocity;

import REA_EML.impl.ModelElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>recicprocity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BCM.impl.recicprocityImpl#getCommitment <em>Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class recicprocityImpl extends ModelElementImpl implements recicprocity {
	/**
	 * The cached value of the '{@link #getCommitment() <em>Commitment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitment()
	 * @generated
	 * @ordered
	 */
	protected EList<Commitment> commitment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected recicprocityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BCMPackage.Literals.RECICPROCITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commitment> getCommitment() {
		if (commitment == null) {
			commitment = new EObjectResolvingEList<Commitment>(Commitment.class, this, REA_EML_BCMPackage.RECICPROCITY__COMMITMENT);
		}
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BCMPackage.RECICPROCITY__COMMITMENT:
				return getCommitment();
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
			case REA_EML_BCMPackage.RECICPROCITY__COMMITMENT:
				getCommitment().clear();
				getCommitment().addAll((Collection<? extends Commitment>)newValue);
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
			case REA_EML_BCMPackage.RECICPROCITY__COMMITMENT:
				getCommitment().clear();
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
			case REA_EML_BCMPackage.RECICPROCITY__COMMITMENT:
				return commitment != null && !commitment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //recicprocityImpl
