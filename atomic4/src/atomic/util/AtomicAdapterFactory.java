/**
 */
package atomic.util;

import atomic.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see atomic.AtomicPackage
 * @generated
 */
public class AtomicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtomicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtomicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicSwitch<Adapter> modelSwitch =
		new AtomicSwitch<Adapter>() {
			@Override
			public Adapter caseAGraph(AGraph object) {
				return createAGraphAdapter();
			}
			@Override
			public Adapter caseAToken(AToken object) {
				return createATokenAdapter();
			}
			@Override
			public Adapter caseANode(ANode object) {
				return createANodeAdapter();
			}
			@Override
			public Adapter caseXAnnotable(XAnnotable object) {
				return createXAnnotableAdapter();
			}
			@Override
			public Adapter caseAStructured(AStructured object) {
				return createAStructuredAdapter();
			}
			@Override
			public Adapter caseAEdge(AEdge object) {
				return createAEdgeAdapter();
			}
			@Override
			public Adapter caseATargetEdge(ATargetEdge object) {
				return createATargetEdgeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link atomic.AGraph <em>AGraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.AGraph
	 * @generated
	 */
	public Adapter createAGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.AToken <em>AToken</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.AToken
	 * @generated
	 */
	public Adapter createATokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.ANode <em>ANode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.ANode
	 * @generated
	 */
	public Adapter createANodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.XAnnotable <em>XAnnotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.XAnnotable
	 * @generated
	 */
	public Adapter createXAnnotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.AStructured <em>AStructured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.AStructured
	 * @generated
	 */
	public Adapter createAStructuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.AEdge <em>AEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.AEdge
	 * @generated
	 */
	public Adapter createAEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link atomic.ATargetEdge <em>ATarget Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see atomic.ATargetEdge
	 * @generated
	 */
	public Adapter createATargetEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtomicAdapterFactory
