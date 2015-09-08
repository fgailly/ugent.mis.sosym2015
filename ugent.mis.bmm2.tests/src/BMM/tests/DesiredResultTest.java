/**
 */
package BMM.tests;

import BMM.BMMFactory;
import BMM.DesiredResult;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desired Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesiredResultTest extends EndTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DesiredResultTest.class);
	}

	/**
	 * Constructs a new Desired Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesiredResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Desired Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DesiredResult getFixture() {
		return (DesiredResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BMMFactory.eINSTANCE.createDesiredResult());
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

} //DesiredResultTest
