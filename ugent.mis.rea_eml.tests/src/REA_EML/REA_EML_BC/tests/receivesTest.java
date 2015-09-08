/**
 */
package REA_EML.REA_EML_BC.tests;

import REA_EML.REA_EML_BC.REA_EML_BCFactory;
import REA_EML.REA_EML_BC.receives;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>receives</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class receivesTest extends participationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(receivesTest.class);
	}

	/**
	 * Constructs a new receives test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public receivesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this receives test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected receives getFixture() {
		return (receives)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCFactory.eINSTANCE.createreceives());
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

} //receivesTest
