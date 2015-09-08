/**
 */
package BMM.impl;

import BMM.BMMPackage;
import BMM.BMMmodel;
import BMM.MotivationElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BM Mmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BMM.impl.BMMmodelImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link BMM.impl.BMMmodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link BMM.impl.BMMmodelImpl#getOntologyNS <em>Ontology NS</em>}</li>
 *   <li>{@link BMM.impl.BMMmodelImpl#getOntologyURI <em>Ontology URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BMMmodelImpl extends MinimalEObjectImpl.Container implements BMMmodel {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<MotivationElement> contains;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntologyNS() <em>Ontology NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyNS()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntologyNS() <em>Ontology NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyNS()
	 * @generated
	 * @ordered
	 */
	protected String ontologyNS = ONTOLOGY_NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntologyURI() <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyURI()
	 * @generated
	 * @ordered
	 */
	protected String ontologyURI = ONTOLOGY_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BMMmodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BMMPackage.Literals.BM_MMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MotivationElement> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<MotivationElement>(MotivationElement.class, this, BMMPackage.BM_MMODEL__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.BM_MMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntologyNS() {
		return ontologyNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologyNS(String newOntologyNS) {
		String oldOntologyNS = ontologyNS;
		ontologyNS = newOntologyNS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.BM_MMODEL__ONTOLOGY_NS, oldOntologyNS, ontologyNS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntologyURI() {
		return ontologyURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntologyURI(String newOntologyURI) {
		String oldOntologyURI = ontologyURI;
		ontologyURI = newOntologyURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BMMPackage.BM_MMODEL__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BMMPackage.BM_MMODEL__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BMMPackage.BM_MMODEL__CONTAINS:
				return getContains();
			case BMMPackage.BM_MMODEL__NAME:
				return getName();
			case BMMPackage.BM_MMODEL__ONTOLOGY_NS:
				return getOntologyNS();
			case BMMPackage.BM_MMODEL__ONTOLOGY_URI:
				return getOntologyURI();
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
			case BMMPackage.BM_MMODEL__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends MotivationElement>)newValue);
				return;
			case BMMPackage.BM_MMODEL__NAME:
				setName((String)newValue);
				return;
			case BMMPackage.BM_MMODEL__ONTOLOGY_NS:
				setOntologyNS((String)newValue);
				return;
			case BMMPackage.BM_MMODEL__ONTOLOGY_URI:
				setOntologyURI((String)newValue);
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
			case BMMPackage.BM_MMODEL__CONTAINS:
				getContains().clear();
				return;
			case BMMPackage.BM_MMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BMMPackage.BM_MMODEL__ONTOLOGY_NS:
				setOntologyNS(ONTOLOGY_NS_EDEFAULT);
				return;
			case BMMPackage.BM_MMODEL__ONTOLOGY_URI:
				setOntologyURI(ONTOLOGY_URI_EDEFAULT);
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
			case BMMPackage.BM_MMODEL__CONTAINS:
				return contains != null && !contains.isEmpty();
			case BMMPackage.BM_MMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BMMPackage.BM_MMODEL__ONTOLOGY_NS:
				return ONTOLOGY_NS_EDEFAULT == null ? ontologyNS != null : !ONTOLOGY_NS_EDEFAULT.equals(ontologyNS);
			case BMMPackage.BM_MMODEL__ONTOLOGY_URI:
				return ONTOLOGY_URI_EDEFAULT == null ? ontologyURI != null : !ONTOLOGY_URI_EDEFAULT.equals(ontologyURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ontologyNS: ");
		result.append(ontologyNS);
		result.append(", ontologyURI: ");
		result.append(ontologyURI);
		result.append(')');
		return result.toString();
	}

} //BMMmodelImpl
