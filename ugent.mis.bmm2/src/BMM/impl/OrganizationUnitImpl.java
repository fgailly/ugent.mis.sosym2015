/**
 */
package BMM.impl;

import BMM.Assessment;
import BMM.Asset;
import BMM.BMMPackage;
import BMM.BusinessProcess;
import BMM.End;
import BMM.Influencer;
import BMM.InfluencingOrganization;
import BMM.Liability;
import BMM.Means;
import BMM.OrganizationUnit;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitDefinesEnd <em>Organization Unit Defines End</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitEstablishesMeans <em>Organization Unit Establishes Means</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitIsResponsibleForAsset <em>Organization Unit Is Responsible For Asset</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitIsResponsibleForLiability <em>Organization Unit Is Responsible For Liability</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitRecognizesInfluencer <em>Organization Unit Recognizes Influencer</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitActAsInfluencingOrganization <em>Organization Unit Act As Influencing Organization</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitMakesAssessment <em>Organization Unit Makes Assessment</em>}</li>
 *   <li>{@link BMM.impl.OrganizationUnitImpl#getOrganizationUnitIsResponsibleForBusinessProcess <em>Organization Unit Is Responsible For Business Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationUnitImpl extends MotivationElementImpl implements OrganizationUnit {
	/**
	 * The cached value of the '{@link #getOrganizationUnitDefinesEnd() <em>Organization Unit Defines End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitDefinesEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<End> organizationUnitDefinesEnd;

	/**
	 * The cached value of the '{@link #getOrganizationUnitEstablishesMeans() <em>Organization Unit Establishes Means</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitEstablishesMeans()
	 * @generated
	 * @ordered
	 */
	protected EList<Means> organizationUnitEstablishesMeans;

	/**
	 * The cached value of the '{@link #getOrganizationUnitIsResponsibleForAsset() <em>Organization Unit Is Responsible For Asset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitIsResponsibleForAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> organizationUnitIsResponsibleForAsset;

	/**
	 * The cached value of the '{@link #getOrganizationUnitIsResponsibleForLiability() <em>Organization Unit Is Responsible For Liability</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitIsResponsibleForLiability()
	 * @generated
	 * @ordered
	 */
	protected EList<Liability> organizationUnitIsResponsibleForLiability;

	/**
	 * The cached value of the '{@link #getOrganizationUnitRecognizesInfluencer() <em>Organization Unit Recognizes Influencer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitRecognizesInfluencer()
	 * @generated
	 * @ordered
	 */
	protected EList<Influencer> organizationUnitRecognizesInfluencer;

	/**
	 * The cached value of the '{@link #getOrganizationUnitActAsInfluencingOrganization() <em>Organization Unit Act As Influencing Organization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitActAsInfluencingOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<InfluencingOrganization> organizationUnitActAsInfluencingOrganization;

	/**
	 * The cached value of the '{@link #getOrganizationUnitMakesAssessment() <em>Organization Unit Makes Assessment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitMakesAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> organizationUnitMakesAssessment;

	/**
	 * The cached value of the '{@link #getOrganizationUnitIsResponsibleForBusinessProcess() <em>Organization Unit Is Responsible For Business Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitIsResponsibleForBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessProcess> organizationUnitIsResponsibleForBusinessProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.ORGANIZATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<End> getOrganizationUnitDefinesEnd() {
		if (organizationUnitDefinesEnd == null) {
			organizationUnitDefinesEnd = new EObjectResolvingEList<End>(End.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END);
		}
		return organizationUnitDefinesEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Means> getOrganizationUnitEstablishesMeans() {
		if (organizationUnitEstablishesMeans == null) {
			organizationUnitEstablishesMeans = new EObjectResolvingEList<Means>(Means.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS);
		}
		return organizationUnitEstablishesMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getOrganizationUnitIsResponsibleForAsset() {
		if (organizationUnitIsResponsibleForAsset == null) {
			organizationUnitIsResponsibleForAsset = new EObjectResolvingEList<Asset>(Asset.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET);
		}
		return organizationUnitIsResponsibleForAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Liability> getOrganizationUnitIsResponsibleForLiability() {
		if (organizationUnitIsResponsibleForLiability == null) {
			organizationUnitIsResponsibleForLiability = new EObjectResolvingEList<Liability>(Liability.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY);
		}
		return organizationUnitIsResponsibleForLiability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Influencer> getOrganizationUnitRecognizesInfluencer() {
		if (organizationUnitRecognizesInfluencer == null) {
			organizationUnitRecognizesInfluencer = new EObjectResolvingEList<Influencer>(Influencer.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER);
		}
		return organizationUnitRecognizesInfluencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfluencingOrganization> getOrganizationUnitActAsInfluencingOrganization() {
		if (organizationUnitActAsInfluencingOrganization == null) {
			organizationUnitActAsInfluencingOrganization = new EObjectResolvingEList<InfluencingOrganization>(InfluencingOrganization.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION);
		}
		return organizationUnitActAsInfluencingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assessment> getOrganizationUnitMakesAssessment() {
		if (organizationUnitMakesAssessment == null) {
			organizationUnitMakesAssessment = new EObjectResolvingEList<Assessment>(Assessment.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT);
		}
		return organizationUnitMakesAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessProcess> getOrganizationUnitIsResponsibleForBusinessProcess() {
		if (organizationUnitIsResponsibleForBusinessProcess == null) {
			organizationUnitIsResponsibleForBusinessProcess = new EObjectResolvingEList<BusinessProcess>(BusinessProcess.class, this, BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS);
		}
		return organizationUnitIsResponsibleForBusinessProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END:
				return getOrganizationUnitDefinesEnd();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS:
				return getOrganizationUnitEstablishesMeans();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET:
				return getOrganizationUnitIsResponsibleForAsset();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY:
				return getOrganizationUnitIsResponsibleForLiability();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER:
				return getOrganizationUnitRecognizesInfluencer();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION:
				return getOrganizationUnitActAsInfluencingOrganization();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT:
				return getOrganizationUnitMakesAssessment();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS:
				return getOrganizationUnitIsResponsibleForBusinessProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END:
				getOrganizationUnitDefinesEnd().clear();
				getOrganizationUnitDefinesEnd().addAll((Collection<? extends End>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS:
				getOrganizationUnitEstablishesMeans().clear();
				getOrganizationUnitEstablishesMeans().addAll((Collection<? extends Means>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET:
				getOrganizationUnitIsResponsibleForAsset().clear();
				getOrganizationUnitIsResponsibleForAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY:
				getOrganizationUnitIsResponsibleForLiability().clear();
				getOrganizationUnitIsResponsibleForLiability().addAll((Collection<? extends Liability>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER:
				getOrganizationUnitRecognizesInfluencer().clear();
				getOrganizationUnitRecognizesInfluencer().addAll((Collection<? extends Influencer>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION:
				getOrganizationUnitActAsInfluencingOrganization().clear();
				getOrganizationUnitActAsInfluencingOrganization().addAll((Collection<? extends InfluencingOrganization>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT:
				getOrganizationUnitMakesAssessment().clear();
				getOrganizationUnitMakesAssessment().addAll((Collection<? extends Assessment>)newValue);
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS:
				getOrganizationUnitIsResponsibleForBusinessProcess().clear();
				getOrganizationUnitIsResponsibleForBusinessProcess().addAll((Collection<? extends BusinessProcess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END:
				getOrganizationUnitDefinesEnd().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS:
				getOrganizationUnitEstablishesMeans().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET:
				getOrganizationUnitIsResponsibleForAsset().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY:
				getOrganizationUnitIsResponsibleForLiability().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER:
				getOrganizationUnitRecognizesInfluencer().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION:
				getOrganizationUnitActAsInfluencingOrganization().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT:
				getOrganizationUnitMakesAssessment().clear();
				return;
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS:
				getOrganizationUnitIsResponsibleForBusinessProcess().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END:
				return organizationUnitDefinesEnd != null && !organizationUnitDefinesEnd.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS:
				return organizationUnitEstablishesMeans != null && !organizationUnitEstablishesMeans.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET:
				return organizationUnitIsResponsibleForAsset != null && !organizationUnitIsResponsibleForAsset.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY:
				return organizationUnitIsResponsibleForLiability != null && !organizationUnitIsResponsibleForLiability.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER:
				return organizationUnitRecognizesInfluencer != null && !organizationUnitRecognizesInfluencer.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION:
				return organizationUnitActAsInfluencingOrganization != null && !organizationUnitActAsInfluencingOrganization.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT:
				return organizationUnitMakesAssessment != null && !organizationUnitMakesAssessment.isEmpty();
			case BMMPackage.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS:
				return organizationUnitIsResponsibleForBusinessProcess != null && !organizationUnitIsResponsibleForBusinessProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationUnitImpl
