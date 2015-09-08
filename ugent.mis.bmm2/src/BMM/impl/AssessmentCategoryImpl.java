/**
 */
package BMM.impl;

import BMM.Assessment;
import BMM.AssessmentCategory;
import BMM.BMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.AssessmentCategoryImpl#getAssessmentCategoryCategoriesAssessment <em>Assessment Category Categories Assessment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentCategoryImpl extends MotivationElementImpl implements AssessmentCategory {
	/**
	 * The cached value of the '{@link #getAssessmentCategoryCategoriesAssessment() <em>Assessment Category Categories Assessment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentCategoryCategoriesAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> assessmentCategoryCategoriesAssessment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.ASSESSMENT_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assessment> getAssessmentCategoryCategoriesAssessment() {
		if (assessmentCategoryCategoriesAssessment == null) {
			assessmentCategoryCategoriesAssessment = new EObjectResolvingEList<Assessment>(Assessment.class, this, BMMPackage.ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT);
		}
		return assessmentCategoryCategoriesAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT:
				return getAssessmentCategoryCategoriesAssessment();
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
			case BMMPackage.ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT:
				getAssessmentCategoryCategoriesAssessment().clear();
				getAssessmentCategoryCategoriesAssessment().addAll((Collection<? extends Assessment>)newValue);
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
			case BMMPackage.ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT:
				getAssessmentCategoryCategoriesAssessment().clear();
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
			case BMMPackage.ASSESSMENT_CATEGORY__ASSESSMENT_CATEGORY_CATEGORIES_ASSESSMENT:
				return assessmentCategoryCategoriesAssessment != null && !assessmentCategoryCategoriesAssessment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssessmentCategoryImpl
