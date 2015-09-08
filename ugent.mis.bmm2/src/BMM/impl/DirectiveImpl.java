/**
 */
package BMM.impl;

import BMM.Asset;
import BMM.BMMPackage;
import BMM.CourseOfAction;
import BMM.DesiredResult;
import BMM.Directive;
import BMM.Regulation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.DirectiveImpl#getDirectiveGovernsCourseOfAction <em>Directive Governs Course Of Action</em>}</li>
 *   <li>{@link BMM.impl.DirectiveImpl#getDirectiveIsSourceOfCourseOfAction <em>Directive Is Source Of Course Of Action</em>}</li>
 *   <li>{@link BMM.impl.DirectiveImpl#getDirectiveActAsRegulation <em>Directive Act As Regulation</em>}</li>
 *   <li>{@link BMM.impl.DirectiveImpl#getDirectiveSupportsAchievementOfDesiredResult <em>Directive Supports Achievement Of Desired Result</em>}</li>
 *   <li>{@link BMM.impl.DirectiveImpl#getDirectiveGovernsUseOfAsset <em>Directive Governs Use Of Asset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectiveImpl extends MeansImpl implements Directive {
	/**
	 * The cached value of the '{@link #getDirectiveGovernsCourseOfAction() <em>Directive Governs Course Of Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveGovernsCourseOfAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfAction> directiveGovernsCourseOfAction;

	/**
	 * The cached value of the '{@link #getDirectiveIsSourceOfCourseOfAction() <em>Directive Is Source Of Course Of Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveIsSourceOfCourseOfAction()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfAction> directiveIsSourceOfCourseOfAction;

	/**
	 * The cached value of the '{@link #getDirectiveActAsRegulation() <em>Directive Act As Regulation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveActAsRegulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulation> directiveActAsRegulation;

	/**
	 * The cached value of the '{@link #getDirectiveSupportsAchievementOfDesiredResult() <em>Directive Supports Achievement Of Desired Result</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveSupportsAchievementOfDesiredResult()
	 * @generated
	 * @ordered
	 */
	protected EList<DesiredResult> directiveSupportsAchievementOfDesiredResult;

	/**
	 * The cached value of the '{@link #getDirectiveGovernsUseOfAsset() <em>Directive Governs Use Of Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectiveGovernsUseOfAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> directiveGovernsUseOfAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfAction> getDirectiveGovernsCourseOfAction() {
		if (directiveGovernsCourseOfAction == null) {
			directiveGovernsCourseOfAction = new EObjectResolvingEList<CourseOfAction>(CourseOfAction.class, this, BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION);
		}
		return directiveGovernsCourseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseOfAction> getDirectiveIsSourceOfCourseOfAction() {
		if (directiveIsSourceOfCourseOfAction == null) {
			directiveIsSourceOfCourseOfAction = new EObjectResolvingEList<CourseOfAction>(CourseOfAction.class, this, BMMPackage.DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION);
		}
		return directiveIsSourceOfCourseOfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulation> getDirectiveActAsRegulation() {
		if (directiveActAsRegulation == null) {
			directiveActAsRegulation = new EObjectResolvingEList<Regulation>(Regulation.class, this, BMMPackage.DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION);
		}
		return directiveActAsRegulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesiredResult> getDirectiveSupportsAchievementOfDesiredResult() {
		if (directiveSupportsAchievementOfDesiredResult == null) {
			directiveSupportsAchievementOfDesiredResult = new EObjectResolvingEList<DesiredResult>(DesiredResult.class, this, BMMPackage.DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT);
		}
		return directiveSupportsAchievementOfDesiredResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getDirectiveGovernsUseOfAsset() {
		if (directiveGovernsUseOfAsset == null) {
			directiveGovernsUseOfAsset = new EObjectResolvingEList<Asset>(Asset.class, this, BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET);
		}
		return directiveGovernsUseOfAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION:
				return getDirectiveGovernsCourseOfAction();
			case BMMPackage.DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION:
				return getDirectiveIsSourceOfCourseOfAction();
			case BMMPackage.DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION:
				return getDirectiveActAsRegulation();
			case BMMPackage.DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT:
				return getDirectiveSupportsAchievementOfDesiredResult();
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET:
				return getDirectiveGovernsUseOfAsset();
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
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION:
				getDirectiveGovernsCourseOfAction().clear();
				getDirectiveGovernsCourseOfAction().addAll((Collection<? extends CourseOfAction>)newValue);
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION:
				getDirectiveIsSourceOfCourseOfAction().clear();
				getDirectiveIsSourceOfCourseOfAction().addAll((Collection<? extends CourseOfAction>)newValue);
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION:
				getDirectiveActAsRegulation().clear();
				getDirectiveActAsRegulation().addAll((Collection<? extends Regulation>)newValue);
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT:
				getDirectiveSupportsAchievementOfDesiredResult().clear();
				getDirectiveSupportsAchievementOfDesiredResult().addAll((Collection<? extends DesiredResult>)newValue);
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET:
				getDirectiveGovernsUseOfAsset().clear();
				getDirectiveGovernsUseOfAsset().addAll((Collection<? extends Asset>)newValue);
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
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION:
				getDirectiveGovernsCourseOfAction().clear();
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION:
				getDirectiveIsSourceOfCourseOfAction().clear();
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION:
				getDirectiveActAsRegulation().clear();
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT:
				getDirectiveSupportsAchievementOfDesiredResult().clear();
				return;
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET:
				getDirectiveGovernsUseOfAsset().clear();
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
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_COURSE_OF_ACTION:
				return directiveGovernsCourseOfAction != null && !directiveGovernsCourseOfAction.isEmpty();
			case BMMPackage.DIRECTIVE__DIRECTIVE_IS_SOURCE_OF_COURSE_OF_ACTION:
				return directiveIsSourceOfCourseOfAction != null && !directiveIsSourceOfCourseOfAction.isEmpty();
			case BMMPackage.DIRECTIVE__DIRECTIVE_ACT_AS_REGULATION:
				return directiveActAsRegulation != null && !directiveActAsRegulation.isEmpty();
			case BMMPackage.DIRECTIVE__DIRECTIVE_SUPPORTS_ACHIEVEMENT_OF_DESIRED_RESULT:
				return directiveSupportsAchievementOfDesiredResult != null && !directiveSupportsAchievementOfDesiredResult.isEmpty();
			case BMMPackage.DIRECTIVE__DIRECTIVE_GOVERNS_USE_OF_ASSET:
				return directiveGovernsUseOfAsset != null && !directiveGovernsUseOfAsset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectiveImpl
