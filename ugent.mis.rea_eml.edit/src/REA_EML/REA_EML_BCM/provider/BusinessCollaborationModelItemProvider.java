/**
 */
package REA_EML.REA_EML_BCM.provider;


import REA_EML.REA_EML_BCM.BusinessCollaborationModel;
import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;
import REA_EML.REA_EML_BCM.REA_EML_BCMPackage;

import REA_EML.provider.ModelItemProvider;
import REA_EML.provider.REAEMLEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link REA_EML.REA_EML_BCM.BusinessCollaborationModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessCollaborationModelItemProvider extends ModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCollaborationModelItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__COMMITMENTS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__DUALITIES);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS);
			childrenFeatures.add(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES);
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
	 * This returns BusinessCollaborationModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessCollaborationModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BusinessCollaborationModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusinessCollaborationModel_type") :
			getString("_UI_BusinessCollaborationModel_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessCollaborationModel.class)) {
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__COMMITMENTS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__DUALITIES:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS:
			case REA_EML_BCMPackage.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES:
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
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_RESOURCES,
				 REA_EML_BCMFactory.eINSTANCE.createEconomicResource()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_AGENTS,
				 REA_EML_BCMFactory.eINSTANCE.createEconomicAgent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__ECONOMIC_EVENTS,
				 REA_EML_BCMFactory.eINSTANCE.createEconomicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__COMMITMENTS,
				 REA_EML_BCMFactory.eINSTANCE.createCommitment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__DUALITIES,
				 REA_EML_BCMFactory.eINSTANCE.createduality()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__STOCKFLOWS,
				 REA_EML_BCMFactory.eINSTANCE.createstockflow()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__PARTICIPATIONS,
				 REA_EML_BCMFactory.eINSTANCE.createparticipation()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__FULFILLMENTS,
				 REA_EML_BCMFactory.eINSTANCE.createfulfillment()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__SPECIFICATIONS,
				 REA_EML_BCMFactory.eINSTANCE.createspecification()));

		newChildDescriptors.add
			(createChildParameter
				(REA_EML_BCMPackage.Literals.BUSINESS_COLLABORATION_MODEL__RECIPROCITIES,
				 REA_EML_BCMFactory.eINSTANCE.createrecicprocity()));
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
