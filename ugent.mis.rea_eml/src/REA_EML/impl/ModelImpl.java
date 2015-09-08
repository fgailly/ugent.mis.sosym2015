/**
 */
package REA_EML.impl;

import REA_EML.Model;
import REA_EML.REA_EMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link REA_EML.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link REA_EML.impl.ModelImpl#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link REA_EML.impl.ModelImpl#getOntologyNS <em>Ontology NS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REA_EMLPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EMLPackage.MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EMLPackage.MODEL__ONTOLOGY_URI, oldOntologyURI, ontologyURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, REA_EMLPackage.MODEL__ONTOLOGY_NS, oldOntologyNS, ontologyNS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case REA_EMLPackage.MODEL__NAME:
				return getName();
			case REA_EMLPackage.MODEL__ONTOLOGY_URI:
				return getOntologyURI();
			case REA_EMLPackage.MODEL__ONTOLOGY_NS:
				return getOntologyNS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case REA_EMLPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case REA_EMLPackage.MODEL__ONTOLOGY_URI:
				setOntologyURI((String)newValue);
				return;
			case REA_EMLPackage.MODEL__ONTOLOGY_NS:
				setOntologyNS((String)newValue);
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
			case REA_EMLPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case REA_EMLPackage.MODEL__ONTOLOGY_URI:
				setOntologyURI(ONTOLOGY_URI_EDEFAULT);
				return;
			case REA_EMLPackage.MODEL__ONTOLOGY_NS:
				setOntologyNS(ONTOLOGY_NS_EDEFAULT);
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
			case REA_EMLPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case REA_EMLPackage.MODEL__ONTOLOGY_URI:
				return ONTOLOGY_URI_EDEFAULT == null ? ontologyURI != null : !ONTOLOGY_URI_EDEFAULT.equals(ontologyURI);
			case REA_EMLPackage.MODEL__ONTOLOGY_NS:
				return ONTOLOGY_NS_EDEFAULT == null ? ontologyNS != null : !ONTOLOGY_NS_EDEFAULT.equals(ontologyNS);
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
		result.append(", ontologyURI: ");
		result.append(ontologyURI);
		result.append(", ontologyNS: ");
		result.append(ontologyNS);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
