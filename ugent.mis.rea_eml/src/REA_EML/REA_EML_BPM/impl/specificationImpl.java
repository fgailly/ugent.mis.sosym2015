/**
 */
package REA_EML.REA_EML_BPM.impl;

import REA_EML.REA_EML_BPM.Commitment;
import REA_EML.REA_EML_BPM.EconomicResource;
import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;
import REA_EML.REA_EML_BPM.specification;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.specificationImpl#getCommitment <em>Commitment</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BPM.impl.specificationImpl#getEconomicResouce <em>Economic Resouce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class specificationImpl extends ModelElementImpl implements specification {
	/**
	 * The cached value of the '{@link #getCommitment() <em>Commitment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitment()
	 * @generated
	 * @ordered
	 */
	protected Commitment commitment;

	/**
	 * The cached value of the '{@link #getEconomicResouce() <em>Economic Resouce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEconomicResouce()
	 * @generated
	 * @ordered
	 */
	protected EconomicResource economicResouce;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected specificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPMPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment getCommitment() {
		if (commitment != null && commitment.eIsProxy()) {
			InternalEObject oldCommitment = (InternalEObject)commitment;
			commitment = (Commitment)eResolveProxy(oldCommitment);
			if (commitment != oldCommitment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.SPECIFICATION__COMMITMENT, oldCommitment, commitment));
			}
		}
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment basicGetCommitment() {
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitment(Commitment newCommitment) {
		Commitment oldCommitment = commitment;
		commitment = newCommitment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.SPECIFICATION__COMMITMENT, oldCommitment, commitment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResource getEconomicResouce() {
		if (economicResouce != null && economicResouce.eIsProxy()) {
			InternalEObject oldEconomicResouce = (InternalEObject)economicResouce;
			economicResouce = (EconomicResource)eResolveProxy(oldEconomicResouce);
			if (economicResouce != oldEconomicResouce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE, oldEconomicResouce, economicResouce));
			}
		}
		return economicResouce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResource basicGetEconomicResouce() {
		return economicResouce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEconomicResouce(EconomicResource newEconomicResouce) {
		EconomicResource oldEconomicResouce = economicResouce;
		economicResouce = newEconomicResouce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE, oldEconomicResouce, economicResouce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPMPackage.SPECIFICATION__COMMITMENT:
				if (resolve) return getCommitment();
				return basicGetCommitment();
			case REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE:
				if (resolve) return getEconomicResouce();
				return basicGetEconomicResouce();
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
			case REA_EML_BPMPackage.SPECIFICATION__COMMITMENT:
				setCommitment((Commitment)newValue);
				return;
			case REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE:
				setEconomicResouce((EconomicResource)newValue);
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
			case REA_EML_BPMPackage.SPECIFICATION__COMMITMENT:
				setCommitment((Commitment)null);
				return;
			case REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE:
				setEconomicResouce((EconomicResource)null);
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
			case REA_EML_BPMPackage.SPECIFICATION__COMMITMENT:
				return commitment != null;
			case REA_EML_BPMPackage.SPECIFICATION__ECONOMIC_RESOUCE:
				return economicResouce != null;
		}
		return super.eIsSet(featureID);
	}

} //specificationImpl
