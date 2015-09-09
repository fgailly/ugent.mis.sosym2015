/**
 */
package REA_EML.REA_EML_BCM.tests;

import REA_EML.REA_EML_BCM.EconomicEvent;
import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Economic Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EconomicEventTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EconomicEventTest.class);
	}

	/**
	 * Constructs a new Economic Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Economic Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EconomicEvent getFixture() {
		return (EconomicEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCMFactory.eINSTANCE.createEconomicEvent());
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

} //EconomicEventTest
