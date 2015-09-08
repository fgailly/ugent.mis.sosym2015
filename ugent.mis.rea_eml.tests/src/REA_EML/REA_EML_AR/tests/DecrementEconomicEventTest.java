/**
 */
package REA_EML.REA_EML_AR.tests;

import REA_EML.REA_EML_AR.DecrementEconomicEvent;
import REA_EML.REA_EML_AR.REA_EML_ARFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decrement Economic Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecrementEconomicEventTest extends EconomicEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DecrementEconomicEventTest.class);
	}

	/**
	 * Constructs a new Decrement Economic Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecrementEconomicEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decrement Economic Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DecrementEconomicEvent getFixture() {
		return (DecrementEconomicEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_ARFactory.eINSTANCE.createDecrementEconomicEvent());
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

} //DecrementEconomicEventTest
