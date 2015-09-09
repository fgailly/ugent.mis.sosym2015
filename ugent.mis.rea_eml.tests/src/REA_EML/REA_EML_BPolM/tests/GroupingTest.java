/**
 */
package REA_EML.REA_EML_BPolM.tests;

import REA_EML.REA_EML_BPolM.Grouping;
import REA_EML.REA_EML_BPolM.REA_EML_BPolMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupingTest extends BusinessRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupingTest.class);
	}

	/**
	 * Constructs a new Grouping test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Grouping test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Grouping getFixture() {
		return (Grouping)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(REA_EML_BPolMFactory.eINSTANCE.createGrouping());
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

} //GroupingTest
