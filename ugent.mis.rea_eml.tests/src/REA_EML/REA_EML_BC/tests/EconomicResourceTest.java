/**
 */
package REA_EML.REA_EML_BC.tests;

import REA_EML.REA_EML_BC.EconomicResource;
import REA_EML.REA_EML_BC.REA_EML_BCFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Economic Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EconomicResourceTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EconomicResourceTest.class);
	}

	/**
	 * Constructs a new Economic Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EconomicResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Economic Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EconomicResource getFixture() {
		return (EconomicResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCFactory.eINSTANCE.createEconomicResource());
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

} //EconomicResourceTest
