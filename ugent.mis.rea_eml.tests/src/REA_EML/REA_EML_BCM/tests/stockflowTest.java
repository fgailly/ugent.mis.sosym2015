/**
 */
package REA_EML.REA_EML_BCM.tests;

import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;
import REA_EML.REA_EML_BCM.stockflow;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>stockflow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class stockflowTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(stockflowTest.class);
	}

	/**
	 * Constructs a new stockflow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stockflowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this stockflow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected stockflow getFixture() {
		return (stockflow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCMFactory.eINSTANCE.createstockflow());
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

} //stockflowTest
