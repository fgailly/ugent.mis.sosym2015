/**
 */
package REA_EML.REA_EML_BPM.impl;

import REA_EML.REA_EML_BPM.DecrementCommitment;
import REA_EML.REA_EML_BPM.IncrementCommitment;
import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;
import REA_EML.REA_EML_BPM.reciprocity;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>reciprocity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.reciprocityImpl#getDecrementCommitment <em>Decrement Commitment</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.reciprocityImpl#getIncrementCommitment <em>Increment Commitment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class reciprocityImpl extends ModelElementImpl implements reciprocity {
	/**
	 * The cached value of the '{@link #getDecrementCommitment() <em>Decrement Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecrementCommitment()
	 * @generated
	 * @ordered
	 */
	protected DecrementCommitment decrementCommitment;

	/**
	 * The cached value of the '{@link #getIncrementCommitment() <em>Increment Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementCommitment()
	 * @generated
	 * @ordered
	 */
	protected IncrementCommitment incrementCommitment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected reciprocityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPMPackage.Literals.RECIPROCITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementCommitment getDecrementCommitment() {
		if (decrementCommitment != null && decrementCommitment.eIsProxy()) {
			InternalEObject oldDecrementCommitment = (InternalEObject)decrementCommitment;
			decrementCommitment = (DecrementCommitment)eResolveProxy(oldDecrementCommitment);
			if (decrementCommitment != oldDecrementCommitment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT, oldDecrementCommitment, decrementCommitment));
			}
		}
		return decrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementCommitment basicGetDecrementCommitment() {
		return decrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecrementCommitment(DecrementCommitment newDecrementCommitment) {
		DecrementCommitment oldDecrementCommitment = decrementCommitment;
		decrementCommitment = newDecrementCommitment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT, oldDecrementCommitment, decrementCommitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementCommitment getIncrementCommitment() {
		if (incrementCommitment != null && incrementCommitment.eIsProxy()) {
			InternalEObject oldIncrementCommitment = (InternalEObject)incrementCommitment;
			incrementCommitment = (IncrementCommitment)eResolveProxy(oldIncrementCommitment);
			if (incrementCommitment != oldIncrementCommitment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT, oldIncrementCommitment, incrementCommitment));
			}
		}
		return incrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementCommitment basicGetIncrementCommitment() {
		return incrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementCommitment(IncrementCommitment newIncrementCommitment) {
		IncrementCommitment oldIncrementCommitment = incrementCommitment;
		incrementCommitment = newIncrementCommitment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT, oldIncrementCommitment, incrementCommitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT:
				if (resolve) return getDecrementCommitment();
				return basicGetDecrementCommitment();
			case REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT:
				if (resolve) return getIncrementCommitment();
				return basicGetIncrementCommitment();
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
			case REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT:
				setDecrementCommitment((DecrementCommitment)newValue);
				return;
			case REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT:
				setIncrementCommitment((IncrementCommitment)newValue);
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
			case REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT:
				setDecrementCommitment((DecrementCommitment)null);
				return;
			case REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT:
				setIncrementCommitment((IncrementCommitment)null);
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
			case REA_EML_BPMPackage.RECIPROCITY__DECREMENT_COMMITMENT:
				return decrementCommitment != null;
			case REA_EML_BPMPackage.RECIPROCITY__INCREMENT_COMMITMENT:
				return incrementCommitment != null;
		}
		return super.eIsSet(featureID);
	}

} //reciprocityImpl
