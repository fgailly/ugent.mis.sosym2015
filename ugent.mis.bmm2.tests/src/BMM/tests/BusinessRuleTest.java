/**
 */
package BMM.tests;

import BMM.BMMFactory;
import BMM.BusinessRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessRuleTest extends DirectiveTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BusinessRuleTest.class);
	}

	/**
	 * Constructs a new Business Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Business Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BusinessRule getFixture() {
		return (BusinessRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BMMFactory.eINSTANCE.createBusinessRule());
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

} //BusinessRuleTest
