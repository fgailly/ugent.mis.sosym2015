/**
 */
package BMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BM Mmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link BMM.BMMmodel#getContains <em>Contains</em>}</li>
 *   <li>{@link BMM.BMMmodel#getName <em>Name</em>}</li>
 *   <li>{@link BMM.BMMmodel#getOntologyNS <em>Ontology NS</em>}</li>
 *   <li>{@link BMM.BMMmodel#getOntologyURI <em>Ontology URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see BMM.BMMPackage#getBMMmodel()
 * @model
 * @generated
 */
public interface BMMmodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link BMM.MotivationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see BMM.BMMPackage#getBMMmodel_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<MotivationElement> getContains();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see BMM.BMMPackage#getBMMmodel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link BMM.BMMmodel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ontology NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology NS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology NS</em>' attribute.
	 * @see #setOntologyNS(String)
	 * @see BMM.BMMPackage#getBMMmodel_OntologyNS()
	 * @model
	 * @generated
	 */
	String getOntologyNS();

	/**
	 * Sets the value of the '{@link BMM.BMMmodel#getOntologyNS <em>Ontology NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology NS</em>' attribute.
	 * @see #getOntologyNS()
	 * @generated
	 */
	void setOntologyNS(String value);

	/**
	 * Returns the value of the '<em><b>Ontology URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology URI</em>' attribute.
	 * @see #setOntologyURI(String)
	 * @see BMM.BMMPackage#getBMMmodel_OntologyURI()
	 * @model
	 * @generated
	 */
	String getOntologyURI();

	/**
	 * Sets the value of the '{@link BMM.BMMmodel#getOntologyURI <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology URI</em>' attribute.
	 * @see #getOntologyURI()
	 * @generated
	 */
	void setOntologyURI(String value);

} // BMMmodel
