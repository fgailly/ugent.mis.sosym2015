/**
 */
package REA_EML.REA_EML_AR.tests;

import REA_EML.REA_EML_AR.REA_EML_ARFactory;
import REA_EML.REA_EML_AR.REA_EML_ARM;

import REA_EML.tests.ModelTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>M</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class REA_EML_ARMTest extends ModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(REA_EML_ARMTest.class);
	}

	/**
	 * Constructs a new M test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REA_EML_ARMTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this M test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected REA_EML_ARM getFixture() {
		return (REA_EML_ARM)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_ARFactory.eINSTANCE.createREA_EML_ARM());
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

} //REA_EML_ARMTest
