/**
 */
package REA_EML.REA_EML_BCM.impl;

import REA_EML.REA_EML_BCM.*;

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
public class REA_EML_BCMFactoryImpl extends EFactoryImpl implements REA_EML_BCMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BCMFactory init() {
		try {
			REA_EML_BCMFactory theREA_EML_BCMFactory = (REA_EML_BCMFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BCMPackage.eNS_URI);
			if (theREA_EML_BCMFactory != null) {
				return theREA_EML_BCMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BCMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCMFactoryImpl() {
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
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL: return createBusinessCollaborationModel();
			case REA_EML_BCMPackage.ECONOMIC_RESOURCE: return createEconomicResource();
			case REA_EML_BCMPackage.ECONOMIC_EVENT: return createEconomicEvent();
			case REA_EML_BCMPackage.ECONOMIC_AGENT: return createEconomicAgent();
			case REA_EML_BCMPackage.COMMITMENT: return createCommitment();
			case REA_EML_BCMPackage.SPECIFICATION: return createspecification();
			case REA_EML_BCMPackage.STOCKFLOW: return createstockflow();
			case REA_EML_BCMPackage.FULFILLMENT: return createfulfillment();
			case REA_EML_BCMPackage.PARTICIPATION: return createparticipation();
			case REA_EML_BCMPackage.DUALITY: return createduality();
			case REA_EML_BCMPackage.RECICPROCITY: return createrecicprocity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCollaborationModel createBusinessCollaborationModel() {
		BusinessCollaborationModelImpl businessCollaborationModel = new BusinessCollaborationModelImpl();
		return businessCollaborationModel;
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
	public EconomicEvent createEconomicEvent() {
		EconomicEventImpl economicEvent = new EconomicEventImpl();
		return economicEvent;
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
	public duality createduality() {
		dualityImpl duality = new dualityImpl();
		return duality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public recicprocity createrecicprocity() {
		recicprocityImpl recicprocity = new recicprocityImpl();
		return recicprocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCMPackage getREA_EML_BCMPackage() {
		return (REA_EML_BCMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BCMPackage getPackage() {
		return REA_EML_BCMPackage.eINSTANCE;
	}

} //REA_EML_BCMFactoryImpl
