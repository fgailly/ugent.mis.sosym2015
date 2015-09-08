/**
 */
package BMM.impl;

import BMM.Asset;
import BMM.BMMPackage;
import BMM.BusinessProcess;
import BMM.CourseOfAction;
import BMM.Offering;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.BusinessProcessImpl#getBusinessProcessRealizesCourseOfAction <em>Business Process Realizes Course Of Action</em>}</li>
 *   <li>{@link BMM.impl.BusinessProcessImpl#getBusinessProcessManagerAsset <em>Business Process Manager Asset</em>}</li>
 *   <li>{@link BMM.impl.BusinessProcessImpl#getBusinessProcessDeliversOfeering <em>Business Process Delivers Ofeering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusinessProcessImpl extends MotivationElementImpl implements BusinessProcess {
	/**
	 * The cached value of the '{@link #getBusinessProcessRealizesCourseOfAction() <em>Business Process Realizes Course Of Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessRealizesCourseOfAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfAction> businessProcessRealizesCourseOfAction;

	/**
	 * The cached value of the '{@link #getBusinessProcessManagerAsset() <em>Business Process Manager Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessManagerAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> businessProcessManagerAsset;

	/**
	 * The cached value of the '{@link #getBusinessProcessDeliversOfeering() <em>Business Process Delivers Ofeering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessDeliversOfeering()
	 * @generated
	 * @ordered
	 */
	protected EList<Offering> businessProcessDeliversOfeering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.BUSINESS_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfAction> getBusinessProcessRealizesCourseOfAction() {
		if (businessProcessRealizesCourseOfAction == null) {
			businessProcessRealizesCourseOfAction = new EObjectResolvingEList<CourseOfAction>(CourseOfAction.class, this, BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION);
		}
		return businessProcessRealizesCourseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getBusinessProcessManagerAsset() {
		if (businessProcessManagerAsset == null) {
			businessProcessManagerAsset = new EObjectResolvingEList<Asset>(Asset.class, this, BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET);
		}
		return businessProcessManagerAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offering> getBusinessProcessDeliversOfeering() {
		if (businessProcessDeliversOfeering == null) {
			businessProcessDeliversOfeering = new EObjectResolvingEList<Offering>(Offering.class, this, BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING);
		}
		return businessProcessDeliversOfeering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION:
				return getBusinessProcessRealizesCourseOfAction();
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET:
				return getBusinessProcessManagerAsset();
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING:
				return getBusinessProcessDeliversOfeering();
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
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION:
				getBusinessProcessRealizesCourseOfAction().clear();
				getBusinessProcessRealizesCourseOfAction().addAll((Collection<? extends CourseOfAction>)newValue);
				return;
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET:
				getBusinessProcessManagerAsset().clear();
				getBusinessProcessManagerAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING:
				getBusinessProcessDeliversOfeering().clear();
				getBusinessProcessDeliversOfeering().addAll((Collection<? extends Offering>)newValue);
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
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION:
				getBusinessProcessRealizesCourseOfAction().clear();
				return;
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET:
				getBusinessProcessManagerAsset().clear();
				return;
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING:
				getBusinessProcessDeliversOfeering().clear();
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
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_REALIZES_COURSE_OF_ACTION:
				return businessProcessRealizesCourseOfAction != null && !businessProcessRealizesCourseOfAction.isEmpty();
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_MANAGER_ASSET:
				return businessProcessManagerAsset != null && !businessProcessManagerAsset.isEmpty();
			case BMMPackage.BUSINESS_PROCESS__BUSINESS_PROCESS_DELIVERS_OFEERING:
				return businessProcessDeliversOfeering != null && !businessProcessDeliversOfeering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BusinessProcessImpl
