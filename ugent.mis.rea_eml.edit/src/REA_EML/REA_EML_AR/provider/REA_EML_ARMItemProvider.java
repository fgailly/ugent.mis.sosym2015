/**
 */
package REA_EML.REA_EML_AR.provider;


import REA_EML.REA_EML_AR.REA_EML_ARFactory;
import REA_EML.REA_EML_AR.REA_EML_ARM;
import REA_EML.REA_EML_AR.REA_EML_ARPackage;

import REA_EML.provider.ModelItemProvider;
import REA_EML.provider.REAEMLEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link REA_EML.REA_EML_AR.REA_EML_ARM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_ARMItemProvider
	extends ModelItemProvider
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
	public REA_EML_ARMItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_REA_EML_ARM_organisationalUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_REA_EML_ARM_organisationalUnit_feature", "_UI_REA_EML_ARM_type"),
				 REA_EML_ARPackage.Literals.REA_EML_AR_M__ORGANISATIONAL_UNIT,
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
				 getString("_UI_REA_EML_ARM_businessProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_REA_EML_ARM_businessProcess_feature", "_UI_REA_EML_ARM_type"),
				 REA_EML_ARPackage.Literals.REA_EML_AR_M__BUSINESS_PROCESS,
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
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_EVENTS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_RESOURCES);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_AGENTS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__DUALITIES);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__COMMITMENTS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__RECIPROCITIES);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__STOCKFLOWS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__PARTICIPATIONS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__FULFILLMENTS);
			childrenFeatures.add(REA_EML_ARPackage.Literals.REA_EML_AR_M__SPECIFICATIONS);
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
	 * This returns REA_EML_ARM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/REA_EML_ARM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((REA_EML_ARM)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_REA_EML_ARM_type") :
			getString("_UI_REA_EML_ARM_type") + " " + label;
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

		switch (notification.getFeatureID(REA_EML_ARM.class)) {
			case REA_EML_ARPackage.REA_EML_AR_M__ORGANISATIONAL_UNIT:
			case REA_EML_ARPackage.REA_EML_AR_M__BUSINESS_PROCESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case REA_EML_ARPackage.REA_EML_AR_M__ECONOMIC_EVENTS:
			case REA_EML_ARPackage.REA_EML_AR_M__ECONOMIC_RESOURCES:
			case REA_EML_ARPackage.REA_EML_AR_M__ECONOMIC_AGENTS:
			case REA_EML_ARPackage.REA_EML_AR_M__DUALITIES:
			case REA_EML_ARPackage.REA_EML_AR_M__COMMITMENTS:
			case REA_EML_ARPackage.REA_EML_AR_M__RECIPROCITIES:
			case REA_EML_ARPackage.REA_EML_AR_M__STOCKFLOWS:
			case REA_EML_ARPackage.REA_EML_AR_M__PARTICIPATIONS:
			case REA_EML_ARPackage.REA_EML_AR_M__FULFILLMENTS:
			case REA_EML_ARPackage.REA_EML_AR_M__SPECIFICATIONS:
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
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_EVENTS,
				 REA_EML_ARFactory.eINSTANCE.createIncrementEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_EVENTS,
				 REA_EML_ARFactory.eINSTANCE.createDecrementEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_RESOURCES,
				 REA_EML_ARFactory.eINSTANCE.createEconomicResource()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__ECONOMIC_AGENTS,
				 REA_EML_ARFactory.eINSTANCE.createEconomicAgent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__DUALITIES,
				 REA_EML_ARFactory.eINSTANCE.createduality()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__COMMITMENTS,
				 REA_EML_ARFactory.eINSTANCE.createCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__COMMITMENTS,
				 REA_EML_ARFactory.eINSTANCE.createIncrementCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__COMMITMENTS,
				 REA_EML_ARFactory.eINSTANCE.createDecrementCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__RECIPROCITIES,
				 REA_EML_ARFactory.eINSTANCE.createreciprocity()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__STOCKFLOWS,
				 REA_EML_ARFactory.eINSTANCE.createstockflow()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__PARTICIPATIONS,
				 REA_EML_ARFactory.eINSTANCE.createparticipation()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__FULFILLMENTS,
				 REA_EML_ARFactory.eINSTANCE.createfulfillment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_ARPackage.Literals.REA_EML_AR_M__SPECIFICATIONS,
				 REA_EML_ARFactory.eINSTANCE.createspecification()));
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
