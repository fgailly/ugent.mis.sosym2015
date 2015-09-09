/**
 */
package REA_EML.REA_EML_BPM.tests;

import REA_EML.REA_EML_BPM.BusinessProcessModel;
import REA_EML.REA_EML_BPM.REA_EML_BPMFactory;

import REA_EML.tests.ModelTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Process Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessProcessModelTest extends ModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessProcessModelTest.class);
	}

	/**
	 * Constructs a new Business Process Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessProcessModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Process Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessProcessModel getFixture() {
		return (BusinessProcessModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPMFactory.eINSTANCE.createBusinessProcessModel());
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

} //BusinessProcessModelTest
