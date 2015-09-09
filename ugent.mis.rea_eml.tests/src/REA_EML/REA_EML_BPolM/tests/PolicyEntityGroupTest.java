/**
 */
package REA_EML.REA_EML_BPolM.tests;

import REA_EML.REA_EML_BPolM.PolicyEntityGroup;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Policy Entity Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolicyEntityGroupTest extends BusinessEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PolicyEntityGroupTest.class);
	}

	/**
	 * Constructs a new Policy Entity Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEntityGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Policy Entity Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolicyEntityGroup getFixture() {
		return (PolicyEntityGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPolMFactory.eINSTANCE.createPolicyEntityGroup());
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

} //PolicyEntityGroupTest
