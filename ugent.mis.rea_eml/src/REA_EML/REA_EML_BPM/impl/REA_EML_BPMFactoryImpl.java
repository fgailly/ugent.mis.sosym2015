/**
 */
package REA_EML.REA_EML_BPM.impl;

import REA_EML.REA_EML_BPM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class REA_EML_BPMFactoryImpl extends EFactoryImpl implements REA_EML_BPMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BPMFactory init() {
		try {
			REA_EML_BPMFactory theREA_EML_BPMFactory = (REA_EML_BPMFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BPMPackage.eNS_URI);
			if (theREA_EML_BPMFactory != null) {
				return theREA_EML_BPMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BPMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPMFactoryImpl() {
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
			case REA_EML_BPMPackage.INCREMENT_ECONOMIC_EVENT: return createIncrementEconomicEvent();
			case REA_EML_BPMPackage.DECREMENT_ECONOMIC_EVENT: return createDecrementEconomicEvent();
			case REA_EML_BPMPackage.DUALITY: return createduality();
			case REA_EML_BPMPackage.INCREMENT_COMMITMENT: return createIncrementCommitment();
			case REA_EML_BPMPackage.DECREMENT_COMMITMENT: return createDecrementCommitment();
			case REA_EML_BPMPackage.RECIPROCITY: return createreciprocity();
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL: return createBusinessProcessModel();
			case REA_EML_BPMPackage.ECONOMIC_RESOURCE: return createEconomicResource();
			case REA_EML_BPMPackage.ECONOMIC_AGENT: return createEconomicAgent();
			case REA_EML_BPMPackage.COMMITMENT: return createCommitment();
			case REA_EML_BPMPackage.SPECIFICATION: return createspecification();
			case REA_EML_BPMPackage.STOCKFLOW: return createstockflow();
			case REA_EML_BPMPackage.FULFILLMENT: return createfulfillment();
			case REA_EML_BPMPackage.PARTICIPATION: return createparticipation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case REA_EML_BPMPackage.ECONOMIC_EVENT_TYPE:
				return createEconomicEventTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case REA_EML_BPMPackage.ECONOMIC_EVENT_TYPE:
				return convertEconomicEventTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public BusinessProcessModel createBusinessProcessModel() {
		BusinessProcessModelImpl businessProcessModel = new BusinessProcessModelImpl();
		return businessProcessModel;
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
	public EconomicEventType createEconomicEventTypeFromString(EDataType eDataType, String initialValue) {
		EconomicEventType result = EconomicEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEconomicEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPMPackage getREA_EML_BPMPackage() {
		return (REA_EML_BPMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BPMPackage getPackage() {
		return REA_EML_BPMPackage.eINSTANCE;
	}

} //REA_EML_BPMFactoryImpl
