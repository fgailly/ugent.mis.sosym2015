/**
 */
package BMM.tests;

import BMM.BMMFactory;
import BMM.PotentialReward;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Potential Reward</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PotentialRewardTest extends PotentialImpactTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PotentialRewardTest.class);
	}

	/**
	 * Constructs a new Potential Reward test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialRewardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Potential Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PotentialReward getFixture() {
		return (PotentialReward)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BMMFactory.eINSTANCE.createPotentialReward());
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

} //PotentialRewardTest
