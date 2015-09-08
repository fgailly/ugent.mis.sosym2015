/**
 */
package REA_EML.REA_EML_AR.tests;

import REA_EML.REA_EML_AR.IncrementCommitment;
import REA_EML.REA_EML_AR.REA_EML_ARFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Increment Commitment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncrementCommitmentTest extends CommitmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncrementCommitmentTest.class);
	}

	/**
	 * Constructs a new Increment Commitment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementCommitmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Increment Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IncrementCommitment getFixture() {
		return (IncrementCommitment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_ARFactory.eINSTANCE.createIncrementCommitment());
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

} //IncrementCommitmentTest
