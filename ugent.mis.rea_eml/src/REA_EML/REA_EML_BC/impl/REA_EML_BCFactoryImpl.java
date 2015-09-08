/**
 */
package REA_EML.REA_EML_BC.impl;

import REA_EML.REA_EML_BC.*;

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
public class REA_EML_BCFactoryImpl extends EFactoryImpl implements REA_EML_BCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BCFactory init() {
		try {
			REA_EML_BCFactory theREA_EML_BCFactory = (REA_EML_BCFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BCPackage.eNS_URI);
			if (theREA_EML_BCFactory != null) {
				return theREA_EML_BCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCFactoryImpl() {
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
			case REA_EML_BCPackage.REA_EML_BC_M: return createREA_EML_BCM();
			case REA_EML_BCPackage.ECONOMIC_RESOURCE: return createEconomicResource();
			case REA_EML_BCPackage.ECONOMIC_EVENT: return createEconomicEvent();
			case REA_EML_BCPackage.ECONOMIC_AGENT: return createEconomicAgent();
			case REA_EML_BCPackage.COMMITMENT: return createCommitment();
			case REA_EML_BCPackage.SPECIFICATION: return createspecification();
			case REA_EML_BCPackage.STOCKFLOW: return createstockflow();
			case REA_EML_BCPackage.FULFILLMENT: return createfulfillment();
			case REA_EML_BCPackage.DUALITY: return createduality();
			case REA_EML_BCPackage.RECICPROCITY: return createrecicprocity();
			case REA_EML_BCPackage.PROVIDES: return createprovides();
			case REA_EML_BCPackage.RECEIVES: return createreceives();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCM createREA_EML_BCM() {
		REA_EML_BCMImpl reA_EML_BCM = new REA_EML_BCMImpl();
		return reA_EML_BCM;
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
	public provides createprovides() {
		providesImpl provides = new providesImpl();
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public receives createreceives() {
		receivesImpl receives = new receivesImpl();
		return receives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCPackage getREA_EML_BCPackage() {
		return (REA_EML_BCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BCPackage getPackage() {
		return REA_EML_BCPackage.eINSTANCE;
	}

} //REA_EML_BCFactoryImpl
