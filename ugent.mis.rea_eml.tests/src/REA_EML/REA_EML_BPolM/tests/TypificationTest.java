/**
 */
package REA_EML.REA_EML_BPolM.tests;

import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;
import REA_EML.REA_EML_BPolM.Typification;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypificationTest extends BusinessRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypificationTest.class);
	}

	/**
	 * Constructs a new Typification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypificationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Typification getFixture() {
		return (Typification)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPolMFactory.eINSTANCE.createTypification());
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

} //TypificationTest
