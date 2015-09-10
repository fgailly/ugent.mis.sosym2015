/**
 */
package REA_EML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link REA_EML.Model#getName <em>Name</em>}</li>
 *   <li>{@link REA_EML.Model#getOntologyURI <em>Ontology URI</em>}</li>
 *   <li>{@link REA_EML.Model#getOntologyNS <em>Ontology NS</em>}</li>
 * </ul>
 * </p>
 *
 * @see REA_EML.REA_EMLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
	 * @see REA_EML.REA_EMLPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link REA_EML.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see REA_EML.REA_EMLPackage#getModel_OntologyURI()
	 * @model
	 * @generated
	 */
	String getOntologyURI();

	/**
	 * Sets the value of the '{@link REA_EML.Model#getOntologyURI <em>Ontology URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology URI</em>' attribute.
	 * @see #getOntologyURI()
	 * @generated
	 */
	void setOntologyURI(String value);

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
	 * @see REA_EML.REA_EMLPackage#getModel_OntologyNS()
	 * @model
	 * @generated
	 */
	String getOntologyNS();

	/**
	 * Sets the value of the '{@link REA_EML.Model#getOntologyNS <em>Ontology NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology NS</em>' attribute.
	 * @see #getOntologyNS()
	 * @generated
	 */
	void setOntologyNS(String value);

} // Model
