/**
 */
package REA_EML.REA_EML_BC.tests;

import REA_EML.REA_EML_BC.REA_EML_BCFactory;
import REA_EML.REA_EML_BC.provides;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>provides</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class providesTest extends participationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(providesTest.class);
	}

	/**
	 * Constructs a new provides test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public providesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this provides test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected provides getFixture() {
		return (provides)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCFactory.eINSTANCE.createprovides());
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

} //providesTest
