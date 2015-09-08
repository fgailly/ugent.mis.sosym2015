/**
 */
package REA_EML.REA_EML_BP.impl;

import REA_EML.REA_EML_BP.BusinessEntity;
import REA_EML.REA_EML_BP.BusinessEvent;
import REA_EML.REA_EML_BP.Involvement;
import REA_EML.REA_EML_BP.REA_EML_BPM;
import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.impl.ModelImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl#getBusinessEntities <em>Business Entities</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl#getBusinessEvents <em>Business Events</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl#getInvolvements <em>Involvements</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.impl.REA_EML_BPMImpl#getBusinessProcess <em>Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REA_EML_BPMImpl extends ModelImpl implements REA_EML_BPM {
	/**
	 * The cached value of the '{@link #getBusinessEntities() <em>Business Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEntity> businessEntities;

	/**
	 * The cached value of the '{@link #getBusinessEvents() <em>Business Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessEvent> businessEvents;

	/**
	 * The cached value of the '{@link #getInvolvements() <em>Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<Involvement> involvements;

	/**
	 * The default value of the '{@link #getBusinessProcess() <em>Business Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_PROCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessProcess() <em>Business Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected String businessProcess = BUSINESS_PROCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REA_EML_BPMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPPackage.Literals.REA_EML_BP_M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEntity> getBusinessEntities() {
		if (businessEntities == null) {
			businessEntities = new EObjectContainmentEList<BusinessEntity>(BusinessEntity.class, this, REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES);
		}
		return businessEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessEvent> getBusinessEvents() {
		if (businessEvents == null) {
			businessEvents = new EObjectContainmentEList<BusinessEvent>(BusinessEvent.class, this, REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS);
		}
		return businessEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvements() {
		if (involvements == null) {
			involvements = new EObjectContainmentEList<Involvement>(Involvement.class, this, REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS);
		}
		return involvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusinessProcess() {
		return businessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessProcess(String newBusinessProcess) {
		String oldBusinessProcess = businessProcess;
		businessProcess = newBusinessProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS, oldBusinessProcess, businessProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
				return ((InternalEList<?>)getBusinessEntities()).basicRemove(otherEnd, msgs);
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
				return ((InternalEList<?>)getBusinessEvents()).basicRemove(otherEnd, msgs);
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
				return ((InternalEList<?>)getInvolvements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
				return getBusinessEntities();
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
				return getBusinessEvents();
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
				return getInvolvements();
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS:
				return getBusinessProcess();
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
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				getBusinessEntities().addAll((Collection<? extends BusinessEntity>)newValue);
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
				getBusinessEvents().clear();
				getBusinessEvents().addAll((Collection<? extends BusinessEvent>)newValue);
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
				getInvolvements().clear();
				getInvolvements().addAll((Collection<? extends Involvement>)newValue);
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS:
				setBusinessProcess((String)newValue);
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
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
				getBusinessEntities().clear();
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
				getBusinessEvents().clear();
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
				getInvolvements().clear();
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS:
				setBusinessProcess(BUSINESS_PROCESS_EDEFAULT);
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
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
				return businessEntities != null && !businessEntities.isEmpty();
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
				return businessEvents != null && !businessEvents.isEmpty();
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
				return involvements != null && !involvements.isEmpty();
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS:
				return BUSINESS_PROCESS_EDEFAULT == null ? businessProcess != null : !BUSINESS_PROCESS_EDEFAULT.equals(businessProcess);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (businessProcess: ");
		result.append(businessProcess);
		result.append(')');
		return result.toString();
	}

} //REA_EML_BPMImpl
