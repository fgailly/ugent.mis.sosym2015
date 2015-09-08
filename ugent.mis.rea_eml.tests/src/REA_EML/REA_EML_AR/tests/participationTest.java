/**
 */
package REA_EML.REA_EML_AR.tests;

import REA_EML.REA_EML_AR.REA_EML_ARFactory;
import REA_EML.REA_EML_AR.participation;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>participation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class participationTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(participationTest.class);
	}

	/**
	 * Constructs a new participation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public participationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this participation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected participation getFixture() {
		return (participation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_ARFactory.eINSTANCE.createparticipation());
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

} //participationTest
