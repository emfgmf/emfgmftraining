/**
 */
package atomic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see atomic.AtomicPackage
 * @generated
 */
public interface AtomicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomicFactory eINSTANCE = atomic.impl.AtomicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AGraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AGraph</em>'.
	 * @generated
	 */
	AGraph createAGraph();

	/**
	 * Returns a new object of class '<em>AToken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AToken</em>'.
	 * @generated
	 */
	AToken createAToken();

	/**
	 * Returns a new object of class '<em>AStructured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AStructured</em>'.
	 * @generated
	 */
	AStructured createAStructured();

	/**
	 * Returns a new object of class '<em>AEdge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AEdge</em>'.
	 * @generated
	 */
	AEdge createAEdge();

	/**
	 * Returns a new object of class '<em>ATarget Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATarget Edge</em>'.
	 * @generated
	 */
	ATargetEdge createATargetEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtomicPackage getAtomicPackage();

} //AtomicFactory
