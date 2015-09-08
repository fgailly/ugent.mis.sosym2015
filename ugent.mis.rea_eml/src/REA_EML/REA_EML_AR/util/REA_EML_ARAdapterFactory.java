/**
 */
package REA_EML.REA_EML_AR.util;

import REA_EML.Model;
import REA_EML.ModelElement;

import REA_EML.REA_EML_AR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage
 * @generated
 */
public class REA_EML_ARAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REA_EML_ARPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = REA_EML_ARPackage.eINSTANCE;
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
	protected REA_EML_ARSwitch<Adapter> modelSwitch =
		new REA_EML_ARSwitch<Adapter>() {
			@Override
			public Adapter caseIncrementEconomicEvent(IncrementEconomicEvent object) {
				return createIncrementEconomicEventAdapter();
			}
			@Override
			public Adapter caseDecrementEconomicEvent(DecrementEconomicEvent object) {
				return createDecrementEconomicEventAdapter();
			}
			@Override
			public Adapter caseduality(duality object) {
				return createdualityAdapter();
			}
			@Override
			public Adapter caseIncrementCommitment(IncrementCommitment object) {
				return createIncrementCommitmentAdapter();
			}
			@Override
			public Adapter caseDecrementCommitment(DecrementCommitment object) {
				return createDecrementCommitmentAdapter();
			}
			@Override
			public Adapter casereciprocity(reciprocity object) {
				return createreciprocityAdapter();
			}
			@Override
			public Adapter caseREA_EML_ARM(REA_EML_ARM object) {
				return createREA_EML_ARMAdapter();
			}
			@Override
			public Adapter caseEconomicEvent(EconomicEvent object) {
				return createEconomicEventAdapter();
			}
			@Override
			public Adapter caseEconomicResource(EconomicResource object) {
				return createEconomicResourceAdapter();
			}
			@Override
			public Adapter caseEconomicAgent(EconomicAgent object) {
				return createEconomicAgentAdapter();
			}
			@Override
			public Adapter caseCommitment(Commitment object) {
				return createCommitmentAdapter();
			}
			@Override
			public Adapter casespecification(specification object) {
				return createspecificationAdapter();
			}
			@Override
			public Adapter casestockflow(stockflow object) {
				return createstockflowAdapter();
			}
			@Override
			public Adapter casefulfillment(fulfillment object) {
				return createfulfillmentAdapter();
			}
			@Override
			public Adapter caseparticipation(participation object) {
				return createparticipationAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
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
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.IncrementEconomicEvent <em>Increment Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.IncrementEconomicEvent
	 * @generated
	 */
	public Adapter createIncrementEconomicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.DecrementEconomicEvent <em>Decrement Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.DecrementEconomicEvent
	 * @generated
	 */
	public Adapter createDecrementEconomicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.duality
	 * @generated
	 */
	public Adapter createdualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.IncrementCommitment <em>Increment Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.IncrementCommitment
	 * @generated
	 */
	public Adapter createIncrementCommitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.DecrementCommitment <em>Decrement Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.DecrementCommitment
	 * @generated
	 */
	public Adapter createDecrementCommitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.reciprocity <em>reciprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.reciprocity
	 * @generated
	 */
	public Adapter createreciprocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.REA_EML_ARM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.REA_EML_ARM
	 * @generated
	 */
	public Adapter createREA_EML_ARMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.EconomicEvent
	 * @generated
	 */
	public Adapter createEconomicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.EconomicResource
	 * @generated
	 */
	public Adapter createEconomicResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.EconomicAgent
	 * @generated
	 */
	public Adapter createEconomicAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.Commitment
	 * @generated
	 */
	public Adapter createCommitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.specification
	 * @generated
	 */
	public Adapter createspecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.stockflow
	 * @generated
	 */
	public Adapter createstockflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.fulfillment
	 * @generated
	 */
	public Adapter createfulfillmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_AR.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_AR.participation
	 * @generated
	 */
	public Adapter createparticipationAdapter() {
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

} //REA_EML_ARAdapterFactory
