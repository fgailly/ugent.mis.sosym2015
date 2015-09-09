/**
 */
package REA_EML.REA_EML_BPM.tests;

import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;
import REA_EML.REA_EML_BPM.reciprocity;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>reciprocity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class reciprocityTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(reciprocityTest.class);
	}

	/**
	 * Constructs a new reciprocity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public reciprocityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this reciprocity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected reciprocity getFixture() {
		return (reciprocity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPMFactory.eINSTANCE.createreciprocity());
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

} //reciprocityTest
