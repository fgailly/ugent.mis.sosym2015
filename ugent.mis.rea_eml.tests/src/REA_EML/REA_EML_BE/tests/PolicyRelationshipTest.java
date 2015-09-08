/**
 */
package REA_EML.REA_EML_BE.tests;

import REA_EML.REA_EML_BE.PolicyRelationship;
import REA_EML.REA_EML_BE.REA_EML_BEFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyRelationshipTest extends BusinessRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PolicyRelationshipTest.class);
	}

	/**
	 * Constructs a new Policy Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Policy Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolicyRelationship getFixture() {
		return (PolicyRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BEFactory.eINSTANCE.createPolicyRelationship());
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

} //PolicyRelationshipTest
