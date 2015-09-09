/**
 */
package REA_EML.REA_EML_BPolM.util;

import REA_EML.Model;
import REA_EML.ModelElement;

import REA_EML.REA_EML_BPolM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BPolM.REA_EML_BPolMPackage
 * @generated
 */
public class REA_EML_BPolMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REA_EML_BPolMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPolMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = REA_EML_BPolMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REA_EML_BPolMSwitch<Adapter> modelSwitch =
		new REA_EML_BPolMSwitch<Adapter>() {
			@Override
			public Adapter caseBusinessPolicyModel(BusinessPolicyModel object) {
				return createBusinessPolicyModelAdapter();
			}
			@Override
			public Adapter caseBusinessEntity(BusinessEntity object) {
				return createBusinessEntityAdapter();
			}
			@Override
			public Adapter caseBusinessRelationship(BusinessRelationship object) {
				return createBusinessRelationshipAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter casePolicyEntityType(PolicyEntityType object) {
				return createPolicyEntityTypeAdapter();
			}
			@Override
			public Adapter caseTypification(Typification object) {
				return createTypificationAdapter();
			}
			@Override
			public Adapter casePolicyEntityGroup(PolicyEntityGroup object) {
				return createPolicyEntityGroupAdapter();
			}
			@Override
			public Adapter caseGrouping(Grouping object) {
				return createGroupingAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.BusinessPolicyModel <em>Business Policy Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.BusinessPolicyModel
	 * @generated
	 */
	public Adapter createBusinessPolicyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.BusinessEntity <em>Business Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.BusinessEntity
	 * @generated
	 */
	public Adapter createBusinessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.BusinessRelationship <em>Business Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.BusinessRelationship
	 * @generated
	 */
	public Adapter createBusinessRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.PolicyEntityType <em>Policy Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.PolicyEntityType
	 * @generated
	 */
	public Adapter createPolicyEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.Typification <em>Typification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.Typification
	 * @generated
	 */
	public Adapter createTypificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.PolicyEntityGroup <em>Policy Entity Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.PolicyEntityGroup
	 * @generated
	 */
	public Adapter createPolicyEntityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BPolM.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BPolM.Grouping
	 * @generated
	 */
	public Adapter createGroupingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //REA_EML_BPolMAdapterFactory
