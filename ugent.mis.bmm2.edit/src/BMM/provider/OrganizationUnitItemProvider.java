/**
 */
package BMM.provider;


import BMM.BMMPackage;
import BMM.OrganizationUnit;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link BMM.OrganizationUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationUnitItemProvider
	extends MotivationElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationUnitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrganizationUnitDefinesEndPropertyDescriptor(object);
			addOrganizationUnitEstablishesMeansPropertyDescriptor(object);
			addOrganizationUnitIsResponsibleForAssetPropertyDescriptor(object);
			addOrganizationUnitIsResponsibleForLiabilityPropertyDescriptor(object);
			addOrganizationUnitRecognizesInfluencerPropertyDescriptor(object);
			addOrganizationUnitActAsInfluencingOrganizationPropertyDescriptor(object);
			addOrganizationUnitMakesAssessmentPropertyDescriptor(object);
			addOrganizationUnitIsResponsibleForBusinessProcessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Organization Unit Defines End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitDefinesEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitDefinesEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitDefinesEnd_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_DEFINES_END,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Establishes Means feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitEstablishesMeansPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitEstablishesMeans_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitEstablishesMeans_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ESTABLISHES_MEANS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Is Responsible For Asset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitIsResponsibleForAssetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitIsResponsibleForAsset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitIsResponsibleForAsset_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_ASSET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Is Responsible For Liability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitIsResponsibleForLiabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitIsResponsibleForLiability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitIsResponsibleForLiability_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_LIABILITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Recognizes Influencer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitRecognizesInfluencerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitRecognizesInfluencer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitRecognizesInfluencer_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_RECOGNIZES_INFLUENCER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Act As Influencing Organization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitActAsInfluencingOrganizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitActAsInfluencingOrganization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitActAsInfluencingOrganization_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_ACT_AS_INFLUENCING_ORGANIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Makes Assessment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitMakesAssessmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitMakesAssessment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitMakesAssessment_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_MAKES_ASSESSMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Organization Unit Is Responsible For Business Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganizationUnitIsResponsibleForBusinessProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationUnit_organizationUnitIsResponsibleForBusinessProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationUnit_organizationUnitIsResponsibleForBusinessProcess_feature", "_UI_OrganizationUnit_type"),
				 BMMPackage.Literals.ORGANIZATION_UNIT__ORGANIZATION_UNIT_IS_RESPONSIBLE_FOR_BUSINESS_PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns OrganizationUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrganizationUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OrganizationUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OrganizationUnit_type") :
			getString("_UI_OrganizationUnit_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
