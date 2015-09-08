/**
 */
package BMM.impl;

import BMM.Asset;
import BMM.BMMPackage;
import BMM.CourseOfAction;
import BMM.DesiredResult;
import BMM.Offering;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Of Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.CourseOfActionImpl#getEnablingCourseofActionEnablesEnabledCourseOfAction <em>Enabling Courseof Action Enables Enabled Course Of Action</em>}</li>
 *   <li>{@link BMM.impl.CourseOfActionImpl#getBroaderCourseofActionIncludesMoreSpecificCourseOfAction <em>Broader Courseof Action Includes More Specific Course Of Action</em>}</li>
 *   <li>{@link BMM.impl.CourseOfActionImpl#getCourseOfActionChanneIsEffortsTowardsDesiredResult <em>Course Of Action Channe Is Efforts Towards Desired Result</em>}</li>
 *   <li>{@link BMM.impl.CourseOfActionImpl#getCourseOfActionDeployAsset <em>Course Of Action Deploy Asset</em>}</li>
 *   <li>{@link BMM.impl.CourseOfActionImpl#getCourseOfActionDefiensOffering <em>Course Of Action Defiens Offering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseOfActionImpl extends MeansImpl implements CourseOfAction {
	/**
	 * The cached value of the '{@link #getEnablingCourseofActionEnablesEnabledCourseOfAction() <em>Enabling Courseof Action Enables Enabled Course Of Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnablingCourseofActionEnablesEnabledCourseOfAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfAction> enablingCourseofActionEnablesEnabledCourseOfAction;

	/**
	 * The cached value of the '{@link #getBroaderCourseofActionIncludesMoreSpecificCourseOfAction() <em>Broader Courseof Action Includes More Specific Course Of Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroaderCourseofActionIncludesMoreSpecificCourseOfAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfAction> broaderCourseofActionIncludesMoreSpecificCourseOfAction;

	/**
	 * The cached value of the '{@link #getCourseOfActionChanneIsEffortsTowardsDesiredResult() <em>Course Of Action Channe Is Efforts Towards Desired Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfActionChanneIsEffortsTowardsDesiredResult()
	 * @generated
	 * @ordered
	 */
	protected DesiredResult courseOfActionChanneIsEffortsTowardsDesiredResult;

	/**
	 * The cached value of the '{@link #getCourseOfActionDeployAsset() <em>Course Of Action Deploy Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfActionDeployAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> courseOfActionDeployAsset;

	/**
	 * The cached value of the '{@link #getCourseOfActionDefiensOffering() <em>Course Of Action Defiens Offering</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfActionDefiensOffering()
	 * @generated
	 * @ordered
	 */
	protected EList<Offering> courseOfActionDefiensOffering;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseOfActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.COURSE_OF_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfAction> getEnablingCourseofActionEnablesEnabledCourseOfAction() {
		if (enablingCourseofActionEnablesEnabledCourseOfAction == null) {
			enablingCourseofActionEnablesEnabledCourseOfAction = new EObjectResolvingEList<CourseOfAction>(CourseOfAction.class, this, BMMPackage.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION);
		}
		return enablingCourseofActionEnablesEnabledCourseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfAction> getBroaderCourseofActionIncludesMoreSpecificCourseOfAction() {
		if (broaderCourseofActionIncludesMoreSpecificCourseOfAction == null) {
			broaderCourseofActionIncludesMoreSpecificCourseOfAction = new EObjectResolvingEList<CourseOfAction>(CourseOfAction.class, this, BMMPackage.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION);
		}
		return broaderCourseofActionIncludesMoreSpecificCourseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesiredResult getCourseOfActionChanneIsEffortsTowardsDesiredResult() {
		if (courseOfActionChanneIsEffortsTowardsDesiredResult != null && courseOfActionChanneIsEffortsTowardsDesiredResult.eIsProxy()) {
			InternalEObject oldCourseOfActionChanneIsEffortsTowardsDesiredResult = (InternalEObject)courseOfActionChanneIsEffortsTowardsDesiredResult;
			courseOfActionChanneIsEffortsTowardsDesiredResult = (DesiredResult)eResolveProxy(oldCourseOfActionChanneIsEffortsTowardsDesiredResult);
			if (courseOfActionChanneIsEffortsTowardsDesiredResult != oldCourseOfActionChanneIsEffortsTowardsDesiredResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT, oldCourseOfActionChanneIsEffortsTowardsDesiredResult, courseOfActionChanneIsEffortsTowardsDesiredResult));
			}
		}
		return courseOfActionChanneIsEffortsTowardsDesiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesiredResult basicGetCourseOfActionChanneIsEffortsTowardsDesiredResult() {
		return courseOfActionChanneIsEffortsTowardsDesiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseOfActionChanneIsEffortsTowardsDesiredResult(DesiredResult newCourseOfActionChanneIsEffortsTowardsDesiredResult) {
		DesiredResult oldCourseOfActionChanneIsEffortsTowardsDesiredResult = courseOfActionChanneIsEffortsTowardsDesiredResult;
		courseOfActionChanneIsEffortsTowardsDesiredResult = newCourseOfActionChanneIsEffortsTowardsDesiredResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT, oldCourseOfActionChanneIsEffortsTowardsDesiredResult, courseOfActionChanneIsEffortsTowardsDesiredResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getCourseOfActionDeployAsset() {
		if (courseOfActionDeployAsset == null) {
			courseOfActionDeployAsset = new EObjectResolvingEList<Asset>(Asset.class, this, BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET);
		}
		return courseOfActionDeployAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Offering> getCourseOfActionDefiensOffering() {
		if (courseOfActionDefiensOffering == null) {
			courseOfActionDefiensOffering = new EObjectResolvingEList<Offering>(Offering.class, this, BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING);
		}
		return courseOfActionDefiensOffering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION:
				return getEnablingCourseofActionEnablesEnabledCourseOfAction();
			case BMMPackage.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION:
				return getBroaderCourseofActionIncludesMoreSpecificCourseOfAction();
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT:
				if (resolve) return getCourseOfActionChanneIsEffortsTowardsDesiredResult();
				return basicGetCourseOfActionChanneIsEffortsTowardsDesiredResult();
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET:
				return getCourseOfActionDeployAsset();
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING:
				return getCourseOfActionDefiensOffering();
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
			case BMMPackage.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION:
				getEnablingCourseofActionEnablesEnabledCourseOfAction().clear();
				getEnablingCourseofActionEnablesEnabledCourseOfAction().addAll((Collection<? extends CourseOfAction>)newValue);
				return;
			case BMMPackage.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION:
				getBroaderCourseofActionIncludesMoreSpecificCourseOfAction().clear();
				getBroaderCourseofActionIncludesMoreSpecificCourseOfAction().addAll((Collection<? extends CourseOfAction>)newValue);
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT:
				setCourseOfActionChanneIsEffortsTowardsDesiredResult((DesiredResult)newValue);
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET:
				getCourseOfActionDeployAsset().clear();
				getCourseOfActionDeployAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING:
				getCourseOfActionDefiensOffering().clear();
				getCourseOfActionDefiensOffering().addAll((Collection<? extends Offering>)newValue);
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
			case BMMPackage.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION:
				getEnablingCourseofActionEnablesEnabledCourseOfAction().clear();
				return;
			case BMMPackage.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION:
				getBroaderCourseofActionIncludesMoreSpecificCourseOfAction().clear();
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT:
				setCourseOfActionChanneIsEffortsTowardsDesiredResult((DesiredResult)null);
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET:
				getCourseOfActionDeployAsset().clear();
				return;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING:
				getCourseOfActionDefiensOffering().clear();
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
			case BMMPackage.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION:
				return enablingCourseofActionEnablesEnabledCourseOfAction != null && !enablingCourseofActionEnablesEnabledCourseOfAction.isEmpty();
			case BMMPackage.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION:
				return broaderCourseofActionIncludesMoreSpecificCourseOfAction != null && !broaderCourseofActionIncludesMoreSpecificCourseOfAction.isEmpty();
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT:
				return courseOfActionChanneIsEffortsTowardsDesiredResult != null;
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET:
				return courseOfActionDeployAsset != null && !courseOfActionDeployAsset.isEmpty();
			case BMMPackage.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING:
				return courseOfActionDefiensOffering != null && !courseOfActionDefiensOffering.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CourseOfActionImpl
