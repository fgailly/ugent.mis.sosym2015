/**
 */
package REA_EML.REA_EML_AR.util;

import REA_EML.Model;
import REA_EML.ModelElement;

import REA_EML.REA_EML_AR.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see REA_EML.REA_EML_AR.REA_EML_ARPackage
 * @generated
 */
public class REA_EML_ARSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REA_EML_ARPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARSwitch() {
		if (modelPackage == null) {
			modelPackage = REA_EML_ARPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case REA_EML_ARPackage.INCREMENT_ECONOMIC_EVENT: {
				IncrementEconomicEvent incrementEconomicEvent = (IncrementEconomicEvent)theEObject;
				T result = caseIncrementEconomicEvent(incrementEconomicEvent);
				if (result == null) result = caseEconomicEvent(incrementEconomicEvent);
				if (result == null) result = caseModelElement(incrementEconomicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.DECREMENT_ECONOMIC_EVENT: {
				DecrementEconomicEvent decrementEconomicEvent = (DecrementEconomicEvent)theEObject;
				T result = caseDecrementEconomicEvent(decrementEconomicEvent);
				if (result == null) result = caseEconomicEvent(decrementEconomicEvent);
				if (result == null) result = caseModelElement(decrementEconomicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.DUALITY: {
				duality duality = (duality)theEObject;
				T result = caseduality(duality);
				if (result == null) result = caseModelElement(duality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.INCREMENT_COMMITMENT: {
				IncrementCommitment incrementCommitment = (IncrementCommitment)theEObject;
				T result = caseIncrementCommitment(incrementCommitment);
				if (result == null) result = caseCommitment(incrementCommitment);
				if (result == null) result = caseModelElement(incrementCommitment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.DECREMENT_COMMITMENT: {
				DecrementCommitment decrementCommitment = (DecrementCommitment)theEObject;
				T result = caseDecrementCommitment(decrementCommitment);
				if (result == null) result = caseCommitment(decrementCommitment);
				if (result == null) result = caseModelElement(decrementCommitment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.RECIPROCITY: {
				reciprocity reciprocity = (reciprocity)theEObject;
				T result = casereciprocity(reciprocity);
				if (result == null) result = caseModelElement(reciprocity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.REA_EML_AR_M: {
				REA_EML_ARM reA_EML_ARM = (REA_EML_ARM)theEObject;
				T result = caseREA_EML_ARM(reA_EML_ARM);
				if (result == null) result = caseModel(reA_EML_ARM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.ECONOMIC_EVENT: {
				EconomicEvent economicEvent = (EconomicEvent)theEObject;
				T result = caseEconomicEvent(economicEvent);
				if (result == null) result = caseModelElement(economicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.ECONOMIC_RESOURCE: {
				EconomicResource economicResource = (EconomicResource)theEObject;
				T result = caseEconomicResource(economicResource);
				if (result == null) result = caseModelElement(economicResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.ECONOMIC_AGENT: {
				EconomicAgent economicAgent = (EconomicAgent)theEObject;
				T result = caseEconomicAgent(economicAgent);
				if (result == null) result = caseModelElement(economicAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.COMMITMENT: {
				Commitment commitment = (Commitment)theEObject;
				T result = caseCommitment(commitment);
				if (result == null) result = caseModelElement(commitment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.SPECIFICATION: {
				specification specification = (specification)theEObject;
				T result = casespecification(specification);
				if (result == null) result = caseModelElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.STOCKFLOW: {
				stockflow stockflow = (stockflow)theEObject;
				T result = casestockflow(stockflow);
				if (result == null) result = caseModelElement(stockflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.FULFILLMENT: {
				fulfillment fulfillment = (fulfillment)theEObject;
				T result = casefulfillment(fulfillment);
				if (result == null) result = caseModelElement(fulfillment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_ARPackage.PARTICIPATION: {
				participation participation = (participation)theEObject;
				T result = caseparticipation(participation);
				if (result == null) result = caseModelElement(participation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment Economic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementEconomicEvent(IncrementEconomicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decrement Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decrement Economic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecrementEconomicEvent(DecrementEconomicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>duality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>duality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseduality(duality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment Commitment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncrementCommitment(IncrementCommitment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decrement Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decrement Commitment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecrementCommitment(DecrementCommitment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>reciprocity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>reciprocity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereciprocity(reciprocity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREA_EML_ARM(REA_EML_ARM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Economic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Economic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEconomicEvent(EconomicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Economic Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Economic Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEconomicResource(EconomicResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Economic Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Economic Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEconomicAgent(EconomicAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commitment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commitment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitment(Commitment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casespecification(specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>stockflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>stockflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestockflow(stockflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>fulfillment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefulfillment(fulfillment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparticipation(participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //REA_EML_ARSwitch
