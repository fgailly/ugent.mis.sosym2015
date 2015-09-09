/**
 */
package REA_EML.REA_EML_BCM.tests;

import REA_EML.REA_EML_BCM.BusinessCollaborationModel;
import REA_EML.REA_EML_BCM.REA_EML_BCMFactory;

import REA_EML.tests.ModelTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Collaboration Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessCollaborationModelTest extends ModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessCollaborationModelTest.class);
	}

	/**
	 * Constructs a new Business Collaboration Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessCollaborationModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Collaboration Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessCollaborationModel getFixture() {
		return (BusinessCollaborationModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BCMFactory.eINSTANCE.createBusinessCollaborationModel());
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

} //BusinessCollaborationModelTest
