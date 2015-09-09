/**
 */
package REA_EML.REA_EML_BPM.tests;

import REA_EML.REA_EML_BPM.IncrementEconomicEvent;
import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Increment Economic Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncrementEconomicEventTest extends EconomicEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IncrementEconomicEventTest.class);
	}

	/**
	 * Constructs a new Increment Economic Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementEconomicEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Increment Economic Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IncrementEconomicEvent getFixture() {
		return (IncrementEconomicEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPMFactory.eINSTANCE.createIncrementEconomicEvent());
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

} //IncrementEconomicEventTest
