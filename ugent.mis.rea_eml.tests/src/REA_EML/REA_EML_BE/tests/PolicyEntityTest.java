/**
 */
package REA_EML.REA_EML_BE.tests;

import REA_EML.REA_EML_BE.PolicyEntity;
import REA_EML.REA_EML_BE.REA_EML_BEFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyEntityTest extends BusinessEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PolicyEntityTest.class);
	}

	/**
	 * Constructs a new Policy Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Policy Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolicyEntity getFixture() {
		return (PolicyEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BEFactory.eINSTANCE.createPolicyEntity());
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

} //PolicyEntityTest
