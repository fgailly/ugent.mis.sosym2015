/**
 */
package BMM.provider;


import BMM.BMMFactory;
import BMM.BMMPackage;
import BMM.BMMmodel;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BMM.BMMmodel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BMMmodelItemProvider
	extends ItemProviderAdapter
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
	public BMMmodelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addOntologyNSPropertyDescriptor(object);
			addOntologyURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BMMmodel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BMMmodel_name_feature", "_UI_BMMmodel_type"),
				 BMMPackage.Literals.BM_MMODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ontology NS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOntologyNSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BMMmodel_ontologyNS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BMMmodel_ontologyNS_feature", "_UI_BMMmodel_type"),
				 BMMPackage.Literals.BM_MMODEL__ONTOLOGY_NS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ontology URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOntologyURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BMMmodel_ontologyURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BMMmodel_ontologyURI_feature", "_UI_BMMmodel_type"),
				 BMMPackage.Literals.BM_MMODEL__ONTOLOGY_URI,
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
			childrenFeatures.add(BMMPackage.Literals.BM_MMODEL__CONTAINS);
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
	 * This returns BMMmodel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BMMmodel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BMMmodel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BMMmodel_type") :
			getString("_UI_BMMmodel_type") + " " + label;
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

		switch (notification.getFeatureID(BMMmodel.class)) {
			case BMMPackage.BM_MMODEL__NAME:
			case BMMPackage.BM_MMODEL__ONTOLOGY_NS:
			case BMMPackage.BM_MMODEL__ONTOLOGY_URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BMMPackage.BM_MMODEL__CONTAINS:
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
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createMotivationElement()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createInfluencer()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createInfluencingOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createMeans()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createPotentialImpact()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createAssessmentCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createInfluencerCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createOrganizationCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createOrganizationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createBusinessProcess()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createAsset()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createLiability()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createMission()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createCourseOfAction()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createFixedAsset()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createOffering()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createDirective()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createTactic()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createBusinessRule()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createBusinessPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createRegulation()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createVision()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createDesiredResult()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createPotentialReward()));

		newChildDescriptors.add
			(createChildParameter
				(BMMPackage.Literals.BM_MMODEL__CONTAINS,
				 BMMFactory.eINSTANCE.createRisk()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BMMEditPlugin.INSTANCE;
	}

}
