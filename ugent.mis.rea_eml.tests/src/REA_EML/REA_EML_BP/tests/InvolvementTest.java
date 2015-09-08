/**
 */
package REA_EML.REA_EML_BP.tests;

import REA_EML.REA_EML_BP.Involvement;
import REA_EML.REA_EML_BP.REA_EML_BPFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvolvementTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InvolvementTest.class);
	}

	/**
	 * Constructs a new Involvement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Involvement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Involvement getFixture() {
		return (Involvement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPFactory.eINSTANCE.createInvolvement());
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

} //InvolvementTest
