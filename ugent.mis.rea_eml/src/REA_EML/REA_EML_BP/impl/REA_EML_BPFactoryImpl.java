/**
 */
package REA_EML.REA_EML_BP.impl;

import REA_EML.REA_EML_BP.*;

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
public class REA_EML_BPFactoryImpl extends EFactoryImpl implements REA_EML_BPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static REA_EML_BPFactory init() {
		try {
			REA_EML_BPFactory theREA_EML_BPFactory = (REA_EML_BPFactory)EPackage.Registry.INSTANCE.getEFactory(REA_EML_BPPackage.eNS_URI);
			if (theREA_EML_BPFactory != null) {
				return theREA_EML_BPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new REA_EML_BPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPFactoryImpl() {
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
			case REA_EML_BPPackage.REA_EML_BP_M: return createREA_EML_BPM();
			case REA_EML_BPPackage.BUSINESS_EVENT: return createBusinessEvent();
			case REA_EML_BPPackage.BUSINESS_ENTITY: return createBusinessEntity();
			case REA_EML_BPPackage.ECONOMIC_EVENT: return createEconomicEvent();
			case REA_EML_BPPackage.COMMITMENT: return createCommitment();
			case REA_EML_BPPackage.INVOLVEMENT: return createInvolvement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPM createREA_EML_BPM() {
		REA_EML_BPMImpl reA_EML_BPM = new REA_EML_BPMImpl();
		return reA_EML_BPM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEvent createBusinessEvent() {
		BusinessEventImpl businessEvent = new BusinessEventImpl();
		return businessEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntity createBusinessEntity() {
		BusinessEntityImpl businessEntity = new BusinessEntityImpl();
		return businessEntity;
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
	public Commitment createCommitment() {
		CommitmentImpl commitment = new CommitmentImpl();
		return commitment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Involvement createInvolvement() {
		InvolvementImpl involvement = new InvolvementImpl();
		return involvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BPPackage getREA_EML_BPPackage() {
		return (REA_EML_BPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static REA_EML_BPPackage getPackage() {
		return REA_EML_BPPackage.eINSTANCE;
	}

} //REA_EML_BPFactoryImpl
