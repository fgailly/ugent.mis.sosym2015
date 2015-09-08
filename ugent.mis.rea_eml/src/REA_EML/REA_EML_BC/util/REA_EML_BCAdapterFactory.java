/**
 */
package REA_EML.REA_EML_BC.util;

import REA_EML.Model;
import REA_EML.ModelElement;

import REA_EML.REA_EML_BC.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_BC.REA_EML_BCPackage
 * @generated
 */
public class REA_EML_BCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REA_EML_BCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = REA_EML_BCPackage.eINSTANCE;
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
	protected REA_EML_BCSwitch<Adapter> modelSwitch =
		new REA_EML_BCSwitch<Adapter>() {
			@Override
			public Adapter caseREA_EML_BCM(REA_EML_BCM object) {
				return createREA_EML_BCMAdapter();
			}
			@Override
			public Adapter caseEconomicResource(EconomicResource object) {
				return createEconomicResourceAdapter();
			}
			@Override
			public Adapter caseEconomicEvent(EconomicEvent object) {
				return createEconomicEventAdapter();
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
			public Adapter caseduality(duality object) {
				return createdualityAdapter();
			}
			@Override
			public Adapter caserecicprocity(recicprocity object) {
				return createrecicprocityAdapter();
			}
			@Override
			public Adapter caseprovides(provides object) {
				return createprovidesAdapter();
			}
			@Override
			public Adapter casereceives(receives object) {
				return createreceivesAdapter();
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
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.REA_EML_BCM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.REA_EML_BCM
	 * @generated
	 */
	public Adapter createREA_EML_BCMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.EconomicResource <em>Economic Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.EconomicResource
	 * @generated
	 */
	public Adapter createEconomicResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.EconomicEvent <em>Economic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.EconomicEvent
	 * @generated
	 */
	public Adapter createEconomicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.EconomicAgent <em>Economic Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.EconomicAgent
	 * @generated
	 */
	public Adapter createEconomicAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.Commitment <em>Commitment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.Commitment
	 * @generated
	 */
	public Adapter createCommitmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.specification <em>specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.specification
	 * @generated
	 */
	public Adapter createspecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.stockflow <em>stockflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.stockflow
	 * @generated
	 */
	public Adapter createstockflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.fulfillment <em>fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.fulfillment
	 * @generated
	 */
	public Adapter createfulfillmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.participation <em>participation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.participation
	 * @generated
	 */
	public Adapter createparticipationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.duality <em>duality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.duality
	 * @generated
	 */
	public Adapter createdualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.recicprocity <em>recicprocity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.recicprocity
	 * @generated
	 */
	public Adapter createrecicprocityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.provides <em>provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.provides
	 * @generated
	 */
	public Adapter createprovidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link REA_EML.REA_EML_BC.receives <em>receives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see REA_EML.REA_EML_BC.receives
	 * @generated
	 */
	public Adapter createreceivesAdapter() {
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

} //REA_EML_BCAdapterFactory
