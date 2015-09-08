/**
 */
package REA_EML.REA_EML_AR.impl;

import REA_EML.REA_EML_AR.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_ARFactoryImpl extends EFactoryImpl implements REA_EML_ARFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_ARFactory init() {
		try {
			REA_EML_ARFactory theREA_EML_ARFactory = (REA_EML_ARFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_ARPackage.eNS_URI);
			if (theREA_EML_ARFactory != null) {
				return theREA_EML_ARFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_ARFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case REA_EML_ARPackage.INCREMENT_ECONOMIC_EVENT: return createIncrementEconomicEvent();
			case REA_EML_ARPackage.DECREMENT_ECONOMIC_EVENT: return createDecrementEconomicEvent();
			case REA_EML_ARPackage.DUALITY: return createduality();
			case REA_EML_ARPackage.INCREMENT_COMMITMENT: return createIncrementCommitment();
			case REA_EML_ARPackage.DECREMENT_COMMITMENT: return createDecrementCommitment();
			case REA_EML_ARPackage.RECIPROCITY: return createreciprocity();
			case REA_EML_ARPackage.REA_EML_AR_M: return createREA_EML_ARM();
			case REA_EML_ARPackage.ECONOMIC_RESOURCE: return createEconomicResource();
			case REA_EML_ARPackage.ECONOMIC_AGENT: return createEconomicAgent();
			case REA_EML_ARPackage.COMMITMENT: return createCommitment();
			case REA_EML_ARPackage.SPECIFICATION: return createspecification();
			case REA_EML_ARPackage.STOCKFLOW: return createstockflow();
			case REA_EML_ARPackage.FULFILLMENT: return createfulfillment();
			case REA_EML_ARPackage.PARTICIPATION: return createparticipation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementEconomicEvent createIncrementEconomicEvent() {
		IncrementEconomicEventImpl incrementEconomicEvent = new IncrementEconomicEventImpl();
		return incrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementEconomicEvent createDecrementEconomicEvent() {
		DecrementEconomicEventImpl decrementEconomicEvent = new DecrementEconomicEventImpl();
		return decrementEconomicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public duality createduality() {
		dualityImpl duality = new dualityImpl();
		return duality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementCommitment createIncrementCommitment() {
		IncrementCommitmentImpl incrementCommitment = new IncrementCommitmentImpl();
		return incrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementCommitment createDecrementCommitment() {
		DecrementCommitmentImpl decrementCommitment = new DecrementCommitmentImpl();
		return decrementCommitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reciprocity createreciprocity() {
		reciprocityImpl reciprocity = new reciprocityImpl();
		return reciprocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARM createREA_EML_ARM() {
		REA_EML_ARMImpl reA_EML_ARM = new REA_EML_ARMImpl();
		return reA_EML_ARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResource createEconomicResource() {
		EconomicResourceImpl economicResource = new EconomicResourceImpl();
		return economicResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicAgent createEconomicAgent() {
		EconomicAgentImpl economicAgent = new EconomicAgentImpl();
		return economicAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commitment createCommitment() {
		CommitmentImpl commitment = new CommitmentImpl();
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public specification createspecification() {
		specificationImpl specification = new specificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stockflow createstockflow() {
		stockflowImpl stockflow = new stockflowImpl();
		return stockflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fulfillment createfulfillment() {
		fulfillmentImpl fulfillment = new fulfillmentImpl();
		return fulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public participation createparticipation() {
		participationImpl participation = new participationImpl();
		return participation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARPackage getREA_EML_ARPackage() {
		return (REA_EML_ARPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_ARPackage getPackage() {
		return REA_EML_ARPackage.eINSTANCE;
	}

} //REA_EML_ARFactoryImpl
