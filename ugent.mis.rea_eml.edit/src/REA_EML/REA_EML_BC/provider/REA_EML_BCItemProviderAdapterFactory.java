/**
 */
package REA_EML.REA_EML_BC.provider;

import REA_EML.REA_EML_BC.util.REA_EML_BCAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BCItemProviderAdapterFactory extends REA_EML_BCAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.REA_EML_BCM} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REA_EML_BCMItemProvider reA_EML_BCMItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.REA_EML_BCM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createREA_EML_BCMAdapter() {
		if (reA_EML_BCMItemProvider == null) {
			reA_EML_BCMItemProvider = new REA_EML_BCMItemProvider(this);
		}

		return reA_EML_BCMItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.EconomicResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EconomicResourceItemProvider economicResourceItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.EconomicResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEconomicResourceAdapter() {
		if (economicResourceItemProvider == null) {
			economicResourceItemProvider = new EconomicResourceItemProvider(this);
		}

		return economicResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.EconomicEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EconomicEventItemProvider economicEventItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.EconomicEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEconomicEventAdapter() {
		if (economicEventItemProvider == null) {
			economicEventItemProvider = new EconomicEventItemProvider(this);
		}

		return economicEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.EconomicAgent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EconomicAgentItemProvider economicAgentItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.EconomicAgent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEconomicAgentAdapter() {
		if (economicAgentItemProvider == null) {
			economicAgentItemProvider = new EconomicAgentItemProvider(this);
		}

		return economicAgentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.Commitment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitmentItemProvider commitmentItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.Commitment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommitmentAdapter() {
		if (commitmentItemProvider == null) {
			commitmentItemProvider = new CommitmentItemProvider(this);
		}

		return commitmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.specification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected specificationItemProvider specificationItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.specification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createspecificationAdapter() {
		if (specificationItemProvider == null) {
			specificationItemProvider = new specificationItemProvider(this);
		}

		return specificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.stockflow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stockflowItemProvider stockflowItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.stockflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createstockflowAdapter() {
		if (stockflowItemProvider == null) {
			stockflowItemProvider = new stockflowItemProvider(this);
		}

		return stockflowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.fulfillment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected fulfillmentItemProvider fulfillmentItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.fulfillment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createfulfillmentAdapter() {
		if (fulfillmentItemProvider == null) {
			fulfillmentItemProvider = new fulfillmentItemProvider(this);
		}

		return fulfillmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.duality} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dualityItemProvider dualityItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.duality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createdualityAdapter() {
		if (dualityItemProvider == null) {
			dualityItemProvider = new dualityItemProvider(this);
		}

		return dualityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.recicprocity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected recicprocityItemProvider recicprocityItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.recicprocity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createrecicprocityAdapter() {
		if (recicprocityItemProvider == null) {
			recicprocityItemProvider = new recicprocityItemProvider(this);
		}

		return recicprocityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.provides} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected providesItemProvider providesItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.provides}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createprovidesAdapter() {
		if (providesItemProvider == null) {
			providesItemProvider = new providesItemProvider(this);
		}

		return providesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link REA_EML.REA_EML_BC.receives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected receivesItemProvider receivesItemProvider;

	/**
	 * This creates an adapter for a {@link REA_EML.REA_EML_BC.receives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createreceivesAdapter() {
		if (receivesItemProvider == null) {
			receivesItemProvider = new receivesItemProvider(this);
		}

		return receivesItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (reA_EML_BCMItemProvider != null) reA_EML_BCMItemProvider.dispose();
		if (economicResourceItemProvider != null) economicResourceItemProvider.dispose();
		if (economicEventItemProvider != null) economicEventItemProvider.dispose();
		if (economicAgentItemProvider != null) economicAgentItemProvider.dispose();
		if (commitmentItemProvider != null) commitmentItemProvider.dispose();
		if (specificationItemProvider != null) specificationItemProvider.dispose();
		if (stockflowItemProvider != null) stockflowItemProvider.dispose();
		if (fulfillmentItemProvider != null) fulfillmentItemProvider.dispose();
		if (dualityItemProvider != null) dualityItemProvider.dispose();
		if (recicprocityItemProvider != null) recicprocityItemProvider.dispose();
		if (providesItemProvider != null) providesItemProvider.dispose();
		if (receivesItemProvider != null) receivesItemProvider.dispose();
	}

}