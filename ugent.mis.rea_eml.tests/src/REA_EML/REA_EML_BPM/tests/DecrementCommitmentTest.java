/**
 */
package REA_EML.REA_EML_BPM.tests;

import REA_EML.REA_EML_BPM.DecrementCommitment;
import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decrement Commitment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecrementCommitmentTest extends CommitmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecrementCommitmentTest.class);
	}

	/**
	 * Constructs a new Decrement Commitment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementCommitmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decrement Commitment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DecrementCommitment getFixture() {
		return (DecrementCommitment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPMFactory.eINSTANCE.createDecrementCommitment());
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

} //DecrementCommitmentTest
