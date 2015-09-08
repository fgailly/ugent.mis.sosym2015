/**
 */
package REA_EML.REA_EML_BE.tests;

import REA_EML.REA_EML_BE.BusinessRelationship;
import REA_EML.REA_EML_BE.REA_EML_BEFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessRelationshipTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessRelationshipTest.class);
	}

	/**
	 * Constructs a new Business Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessRelationship getFixture() {
		return (BusinessRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BEFactory.eINSTANCE.createBusinessRelationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BusinessRelationshipTest
