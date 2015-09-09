/**
 */
package REA_EML.REA_EML_BPolM.tests;

import REA_EML.REA_EML_BPolM.BusinessEntity;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;

import REA_EML.tests.ModelElementTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessEntityTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessEntityTest.class);
	}

	/**
	 * Constructs a new Business Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessEntityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessEntity getFixture() {
		return (BusinessEntity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPolMFactory.eINSTANCE.createBusinessEntity());
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

} //BusinessEntityTest
