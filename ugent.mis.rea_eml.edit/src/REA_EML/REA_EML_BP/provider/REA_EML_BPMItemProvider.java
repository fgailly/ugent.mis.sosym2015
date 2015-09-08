/**
 */
package REA_EML.REA_EML_BP.provider;


import REA_EML.REA_EML_BP.REA_EML_BPFactory;
import REA_EML.REA_EML_BP.REA_EML_BPM;
import REA_EML.REA_EML_BP.REA_EML_BPPackage;

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
 * This is the item provider adapter for a {@link REA_EML.REA_EML_BP.REA_EML_BPM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BPMItemProvider
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
	public REA_EML_BPMItemProvider(AdapterFactory adapterFactory) {
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

			addBusinessProcessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_REA_EML_BPM_businessProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_REA_EML_BPM_businessProcess_feature", "_UI_REA_EML_BPM_type"),
				 REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_PROCESS,
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
			childrenFeatures.add(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_ENTITIES);
			childrenFeatures.add(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_EVENTS);
			childrenFeatures.add(REA_EML_BPPackage.Literals.REA_EML_BP_M__INVOLVEMENTS);
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
	 * This returns REA_EML_BPM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/REA_EML_BPM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((REA_EML_BPM)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_REA_EML_BPM_type") :
			getString("_UI_REA_EML_BPM_type") + " " + label;
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

		switch (notification.getFeatureID(REA_EML_BPM.class)) {
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_PROCESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_ENTITIES:
			case REA_EML_BPPackage.REA_EML_BP_M__BUSINESS_EVENTS:
			case REA_EML_BPPackage.REA_EML_BP_M__INVOLVEMENTS:
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
				(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_ENTITIES,
				 REA_EML_BPFactory.eINSTANCE.createBusinessEntity()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createBusinessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPPackage.Literals.REA_EML_BP_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BPPackage.Literals.REA_EML_BP_M__INVOLVEMENTS,
				 REA_EML_BPFactory.eINSTANCE.createInvolvement()));
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
