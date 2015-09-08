/**
 */
package REA_EML.REA_EML_BC.tests;

import REA_EML.REA_EML_BC.REA_EML_BCFactory;
import REA_EML.REA_EML_BC.REA_EML_BCM;

import REA_EML.tests.ModelTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_BCMTest extends ModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(REA_EML_BCMTest.class);
	}

	/**
	 * Constructs a new M test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_BCMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this M test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected REA_EML_BCM getFixture() {
		return (REA_EML_BCM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCFactory.eINSTANCE.createREA_EML_BCM());
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

} //REA_EML_BCMTest
