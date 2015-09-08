/**
 */
package REA_EML.REA_EML_BP.tests;

import REA_EML.REA_EML_BP.Commitment;
import REA_EML.REA_EML_BP.REA_EML_BPFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commitment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommitmentTest extends BusinessEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommitmentTest.class);
	}

	/**
	 * Constructs a new Commitment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Commitment getFixture() {
		return (Commitment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPFactory.eINSTANCE.createCommitment());
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

} //CommitmentTest
