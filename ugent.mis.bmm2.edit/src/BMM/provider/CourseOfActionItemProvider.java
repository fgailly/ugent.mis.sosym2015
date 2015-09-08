/**
 */
package BMM.provider;


import BMM.BMMPackage;
import BMM.CourseOfAction;

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
 * This is the item provider adapter for a {@link BMM.CourseOfAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseOfActionItemProvider
	extends MeansItemProvider
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
	public CourseOfActionItemProvider(AdapterFactory adapterFactory) {
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

			addEnablingCourseofActionEnablesEnabledCourseOfActionPropertyDescriptor(object);
			addBroaderCourseofActionIncludesMoreSpecificCourseOfActionPropertyDescriptor(object);
			addCourseOfActionChanneIsEffortsTowardsDesiredResultPropertyDescriptor(object);
			addCourseOfActionDeployAssetPropertyDescriptor(object);
			addCourseOfActionDefiensOfferingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enabling Courseof Action Enables Enabled Course Of Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnablingCourseofActionEnablesEnabledCourseOfActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CourseOfAction_enablingCourseofActionEnablesEnabledCourseOfAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CourseOfAction_enablingCourseofActionEnablesEnabledCourseOfAction_feature", "_UI_CourseOfAction_type"),
				 BMMPackage.Literals.COURSE_OF_ACTION__ENABLING_COURSEOF_ACTION_ENABLES_ENABLED_COURSE_OF_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Broader Courseof Action Includes More Specific Course Of Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBroaderCourseofActionIncludesMoreSpecificCourseOfActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CourseOfAction_broaderCourseofActionIncludesMoreSpecificCourseOfAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CourseOfAction_broaderCourseofActionIncludesMoreSpecificCourseOfAction_feature", "_UI_CourseOfAction_type"),
				 BMMPackage.Literals.COURSE_OF_ACTION__BROADER_COURSEOF_ACTION_INCLUDES_MORE_SPECIFIC_COURSE_OF_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Course Of Action Channe Is Efforts Towards Desired Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCourseOfActionChanneIsEffortsTowardsDesiredResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CourseOfAction_courseOfActionChanneIsEffortsTowardsDesiredResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CourseOfAction_courseOfActionChanneIsEffortsTowardsDesiredResult_feature", "_UI_CourseOfAction_type"),
				 BMMPackage.Literals.COURSE_OF_ACTION__COURSE_OF_ACTION_CHANNE_IS_EFFORTS_TOWARDS_DESIRED_RESULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Course Of Action Deploy Asset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCourseOfActionDeployAssetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CourseOfAction_courseOfActionDeployAsset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CourseOfAction_courseOfActionDeployAsset_feature", "_UI_CourseOfAction_type"),
				 BMMPackage.Literals.COURSE_OF_ACTION__COURSE_OF_ACTION_DEPLOY_ASSET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Course Of Action Defiens Offering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCourseOfActionDefiensOfferingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CourseOfAction_courseOfActionDefiensOffering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CourseOfAction_courseOfActionDefiensOffering_feature", "_UI_CourseOfAction_type"),
				 BMMPackage.Literals.COURSE_OF_ACTION__COURSE_OF_ACTION_DEFIENS_OFFERING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns CourseOfAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CourseOfAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CourseOfAction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CourseOfAction_type") :
			getString("_UI_CourseOfAction_type") + " " + label;
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
