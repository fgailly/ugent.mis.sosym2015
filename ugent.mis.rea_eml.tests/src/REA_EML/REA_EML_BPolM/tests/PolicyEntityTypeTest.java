/**
 */
package REA_EML.REA_EML_BPolM.tests;

import REA_EML.REA_EML_BPolM.PolicyEntityType;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyEntityTypeTest extends BusinessEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PolicyEntityTypeTest.class);
	}

	/**
	 * Constructs a new Policy Entity Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Policy Entity Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolicyEntityType getFixture() {
		return (PolicyEntityType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPolMFactory.eINSTANCE.createPolicyEntityType());
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

} //PolicyEntityTypeTest
