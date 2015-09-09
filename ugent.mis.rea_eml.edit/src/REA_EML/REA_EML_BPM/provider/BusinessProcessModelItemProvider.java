/**
 */
package REA_EML.REA_EML_BPM.provider;


import REA_EML.REA_EML_BPM.BusinessProcessModel;
import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;
import REA_EML.REA_EML_BPM.REA_EML_BPMPackage;

import REA_EML.provider.ModelItemProvider;
import REA_EML.provider.REAEMLEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link REA_EML.REA_EML_BPM.BusinessProcessModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessProcessModelItemProvider extends ModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessModelItemProvider(AdapterFactory adapterFactory) {
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

			addOrganisationalUnitPropertyDescriptor(object);
			addBusinessProcessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Organisational Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrganisationalUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessProcessModel_organisationalUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessProcessModel_organisationalUnit_feature", "_UI_BusinessProcessModel_type"),
				 REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ORGANISATIONAL_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusinessProcessModel_businessProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusinessProcessModel_businessProcess_feature", "_UI_BusinessProcessModel_type"),
				 REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__BUSINESS_PROCESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__DUALITIES);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__COMMITMENTS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__RECIPROCITIES);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__STOCKFLOWS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__PARTICIPATIONS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__FULFILLMENTS);
			childrenFeatures.add(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__SPECIFICATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BusinessProcessModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessProcessModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessProcessModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessProcessModel_type") :
			getString("_UI_BusinessProcessModel_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessProcessModel.class)) {
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__ORGANISATIONAL_UNIT:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__BUSINESS_PROCESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__DUALITIES:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__COMMITMENTS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__RECIPROCITIES:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__STOCKFLOWS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__PARTICIPATIONS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__FULFILLMENTS:
			case REA_EML_BPMPackage.BUSINESS_PROCESS_MODEL__SPECIFICATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS,
				 REA_EML_BPMFactory.eINSTANCE.createIncrementEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_EVENTS,
				 REA_EML_BPMFactory.eINSTANCE.createDecrementEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_RESOURCES,
				 REA_EML_BPMFactory.eINSTANCE.createEconomicResource()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__ECONOMIC_AGENTS,
				 REA_EML_BPMFactory.eINSTANCE.createEconomicAgent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__DUALITIES,
				 REA_EML_BPMFactory.eINSTANCE.createduality()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__COMMITMENTS,
				 REA_EML_BPMFactory.eINSTANCE.createCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__COMMITMENTS,
				 REA_EML_BPMFactory.eINSTANCE.createIncrementCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__COMMITMENTS,
				 REA_EML_BPMFactory.eINSTANCE.createDecrementCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__RECIPROCITIES,
				 REA_EML_BPMFactory.eINSTANCE.createreciprocity()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__STOCKFLOWS,
				 REA_EML_BPMFactory.eINSTANCE.createstockflow()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__PARTICIPATIONS,
				 REA_EML_BPMFactory.eINSTANCE.createparticipation()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__FULFILLMENTS,
				 REA_EML_BPMFactory.eINSTANCE.createfulfillment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPMPackage.Literals.BUSINESS_PROCESS_MODEL__SPECIFICATIONS,
				 REA_EML_BPMFactory.eINSTANCE.createspecification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return REAEMLEditPlugin.INSTANCE;
	}

}
