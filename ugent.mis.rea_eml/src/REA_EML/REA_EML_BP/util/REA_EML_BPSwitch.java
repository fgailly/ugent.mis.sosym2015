/**
 */
package REA_EML.REA_EML_BP.util;

import REA_EML.Model;
import REA_EML.ModelElement;

import REA_EML.REA_EML_BP.*;

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
 * @see REA_EML.REA_EML_BP.REA_EML_BPPackage
 * @generated
 */
public class REA_EML_BPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REA_EML_BPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPSwitch() {
		if (modelPackage == null) {
			modelPackage = REA_EML_BPPackage.eINSTANCE;
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
			case REA_EML_BPPackage.REA_EML_BP_M: {
				REA_EML_BPM reA_EML_BPM = (REA_EML_BPM)theEObject;
				T result = caseREA_EML_BPM(reA_EML_BPM);
				if (result == null) result = caseModel(reA_EML_BPM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_BPPackage.BUSINESS_EVENT: {
				BusinessEvent businessEvent = (BusinessEvent)theEObject;
				T result = caseBusinessEvent(businessEvent);
				if (result == null) result = caseModelElement(businessEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_BPPackage.BUSINESS_ENTITY: {
				BusinessEntity businessEntity = (BusinessEntity)theEObject;
				T result = caseBusinessEntity(businessEntity);
				if (result == null) result = caseModelElement(businessEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_BPPackage.ECONOMIC_EVENT: {
				EconomicEvent economicEvent = (EconomicEvent)theEObject;
				T result = caseEconomicEvent(economicEvent);
				if (result == null) result = caseBusinessEvent(economicEvent);
				if (result == null) result = caseModelElement(economicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_BPPackage.COMMITMENT: {
				Commitment commitment = (Commitment)theEObject;
				T result = caseCommitment(commitment);
				if (result == null) result = caseBusinessEvent(commitment);
				if (result == null) result = caseModelElement(commitment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case REA_EML_BPPackage.INVOLVEMENT: {
				Involvement involvement = (Involvement)theEObject;
				T result = caseInvolvement(involvement);
				if (result == null) result = caseModelElement(involvement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseREA_EML_BPM(REA_EML_BPM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessEvent(BusinessEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessEntity(BusinessEntity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Involvement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Involvement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvolvement(Involvement object) {
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

} //REA_EML_BPSwitch
