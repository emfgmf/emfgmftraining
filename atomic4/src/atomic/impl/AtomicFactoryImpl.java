/**
 */
package atomic.impl;

import atomic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicFactoryImpl extends EFactoryImpl implements AtomicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtomicFactory init() {
		try {
			AtomicFactory theAtomicFactory = (AtomicFactory)EPackage.Registry.INSTANCE.getEFactory("http://atomic/1.0"); 
			if (theAtomicFactory != null) {
				return theAtomicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtomicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AtomicPackage.AGRAPH: return createAGraph();
			case AtomicPackage.ATOKEN: return createAToken();
			case AtomicPackage.ASTRUCTURED: return createAStructured();
			case AtomicPackage.AEDGE: return createAEdge();
			case AtomicPackage.ATARGET_EDGE: return createATargetEdge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AGraph createAGraph() {
		AGraphImpl aGraph = new AGraphImpl();
		return aGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AToken createAToken() {
		ATokenImpl aToken = new ATokenImpl();
		return aToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AStructured createAStructured() {
		AStructuredImpl aStructured = new AStructuredImpl();
		return aStructured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEdge createAEdge() {
		AEdgeImpl aEdge = new AEdgeImpl();
		return aEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATargetEdge createATargetEdge() {
		ATargetEdgeImpl aTargetEdge = new ATargetEdgeImpl();
		return aTargetEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicPackage getAtomicPackage() {
		return (AtomicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtomicPackage getPackage() {
		return AtomicPackage.eINSTANCE;
	}

} //AtomicFactoryImpl
