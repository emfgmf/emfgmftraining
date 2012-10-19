/**
 */
package atomic.tests;

import atomic.AStructured;
import atomic.AtomicFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AStructured</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AStructuredTest extends ANodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AStructuredTest.class);
	}

	/**
	 * Constructs a new AStructured test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AStructuredTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AStructured test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AStructured getFixture() {
		return (AStructured)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AtomicFactory.eINSTANCE.createAStructured());
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

} //AStructuredTest
