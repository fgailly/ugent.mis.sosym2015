/**
 */
package REA_EML.REA_EML_BP.impl;

import REA_EML.REA_EML_BP.BusinessEntity;
import REA_EML.REA_EML_BP.BusinessEvent;
import REA_EML.REA_EML_BP.Involvement;
import REA_EML.REA_EML_BP.REA_EML_BPPackage;

import REA_EML.impl.ModelElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.REA_EML_BP.impl.InvolvementImpl#getBusinessEvent <em>Business Event</em>}</li>
 *   <li>{@link REA_EML.REA_EML_BP.impl.InvolvementImpl#getBusinessEntity <em>Business Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvolvementImpl extends ModelElementImpl implements Involvement {
	/**
	 * The cached value of the '{@link #getBusinessEvent() <em>Business Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEvent()
	 * @generated
	 * @ordered
	 */
	protected BusinessEvent businessEvent;

	/**
	 * The cached value of the '{@link #getBusinessEntity() <em>Business Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessEntity()
	 * @generated
	 * @ordered
	 */
	protected BusinessEntity businessEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EML_BPPackage.Literals.INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEvent getBusinessEvent() {
		if (businessEvent != null && businessEvent.eIsProxy()) {
			InternalEObject oldBusinessEvent = (InternalEObject)businessEvent;
			businessEvent = (BusinessEvent)eResolveProxy(oldBusinessEvent);
			if (businessEvent != oldBusinessEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT, oldBusinessEvent, businessEvent));
			}
		}
		return businessEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEvent basicGetBusinessEvent() {
		return businessEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessEvent(BusinessEvent newBusinessEvent) {
		BusinessEvent oldBusinessEvent = businessEvent;
		businessEvent = newBusinessEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT, oldBusinessEvent, businessEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity getBusinessEntity() {
		if (businessEntity != null && businessEntity.eIsProxy()) {
			InternalEObject oldBusinessEntity = (InternalEObject)businessEntity;
			businessEntity = (BusinessEntity)eResolveProxy(oldBusinessEntity);
			if (businessEntity != oldBusinessEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
			}
		}
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity basicGetBusinessEntity() {
		return businessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessEntity(BusinessEntity newBusinessEntity) {
		BusinessEntity oldBusinessEntity = businessEntity;
		businessEntity = newBusinessEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY, oldBusinessEntity, businessEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT:
				if (resolve) return getBusinessEvent();
				return basicGetBusinessEvent();
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY:
				if (resolve) return getBusinessEntity();
				return basicGetBusinessEntity();
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
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT:
				setBusinessEvent((BusinessEvent)newValue);
				return;
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntity)newValue);
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
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT:
				setBusinessEvent((BusinessEvent)null);
				return;
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY:
				setBusinessEntity((BusinessEntity)null);
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
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_EVENT:
				return businessEvent != null;
			case REA_EML_BPPackage.INVOLVEMENT__BUSINESS_ENTITY:
				return businessEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //InvolvementImpl
