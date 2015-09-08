/**
 */
package BMM.tests;

import BMM.BMMFactory;
import BMM.InfluencingOrganization;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Influencing Organization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfluencingOrganizationTest extends MotivationElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InfluencingOrganizationTest.class);
	}

	/**
	 * Constructs a new Influencing Organization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluencingOrganizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Influencing Organization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InfluencingOrganization getFixture() {
		return (InfluencingOrganization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BMMFactory.eINSTANCE.createInfluencingOrganization());
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

} //InfluencingOrganizationTest
