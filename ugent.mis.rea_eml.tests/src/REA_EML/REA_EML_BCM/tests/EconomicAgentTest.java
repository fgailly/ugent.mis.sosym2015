/**
 */
package REA_EML.REA_EML_BCM.tests;

import REA_EML.REA_EML_BCM.EconomicAgent;
import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Economic Agent</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EconomicAgentTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EconomicAgentTest.class);
	}

	/**
	 * Constructs a new Economic Agent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicAgentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Economic Agent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EconomicAgent getFixture() {
		return (EconomicAgent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCMFactory.eINSTANCE.createEconomicAgent());
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

} //EconomicAgentTest
