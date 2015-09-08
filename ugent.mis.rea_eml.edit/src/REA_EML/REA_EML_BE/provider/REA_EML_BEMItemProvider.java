/**
 */
package REA_EML.REA_EML_BE.provider;


import REA_EML.REA_EML_BE.REA_EML_BEFactory;
import REA_EML.REA_EML_BE.REA_EML_BEM;
import REA_EML.REA_EML_BE.REA_EML_BEPackage;

import REA_EML.REA_EML_BP.REA_EML_BPFactory;

import REA_EML.provider.ModelItemProvider;
import REA_EML.provider.REAEMLEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link REA_EML.REA_EML_BE.REA_EML_BEM} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BEMItemProvider
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
	public REA_EML_BEMItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_ENTITIES);
			childrenFeatures.add(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_RELATIONSHIPS);
			childrenFeatures.add(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_EVENTS);
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
	 * This returns REA_EML_BEM.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/REA_EML_BEM"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((REA_EML_BEM)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_REA_EML_BEM_type") :
			getString("_UI_REA_EML_BEM_type") + " " + label;
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

		switch (notification.getFeatureID(REA_EML_BEM.class)) {
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_ENTITIES:
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_RELATIONSHIPS:
			case REA_EML_BEPackage.REA_EML_BE_M__BUSINESS_EVENTS:
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
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_ENTITIES,
				 REA_EML_BEFactory.eINSTANCE.createBusinessEntity()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_ENTITIES,
				 REA_EML_BEFactory.eINSTANCE.createPolicyEntity()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_RELATIONSHIPS,
				 REA_EML_BEFactory.eINSTANCE.createBusinessRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_RELATIONSHIPS,
				 REA_EML_BEFactory.eINSTANCE.createPolicyRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createBusinessEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BEPackage.Literals.REA_EML_BE_M__BUSINESS_EVENTS,
				 REA_EML_BPFactory.eINSTANCE.createCommitment()));
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
