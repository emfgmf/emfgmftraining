/**
 */
package atomic.util;

import atomic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see atomic.AtomicPackage
 * @generated
 */
public class AtomicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtomicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSwitch() {
		if (modelPackage == null) {
			modelPackage = AtomicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AtomicPackage.AGRAPH: {
				AGraph aGraph = (AGraph)theEObject;
				T result = caseAGraph(aGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.ATOKEN: {
				AToken aToken = (AToken)theEObject;
				T result = caseAToken(aToken);
				if (result == null) result = caseANode(aToken);
				if (result == null) result = caseXAnnotable(aToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.ANODE: {
				ANode aNode = (ANode)theEObject;
				T result = caseANode(aNode);
				if (result == null) result = caseXAnnotable(aNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.XANNOTABLE: {
				XAnnotable xAnnotable = (XAnnotable)theEObject;
				T result = caseXAnnotable(xAnnotable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.ASTRUCTURED: {
				AStructured aStructured = (AStructured)theEObject;
				T result = caseAStructured(aStructured);
				if (result == null) result = caseANode(aStructured);
				if (result == null) result = caseXAnnotable(aStructured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.AEDGE: {
				AEdge aEdge = (AEdge)theEObject;
				T result = caseAEdge(aEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtomicPackage.ATARGET_EDGE: {
				ATargetEdge aTargetEdge = (ATargetEdge)theEObject;
				T result = caseATargetEdge(aTargetEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGraph(AGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AToken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AToken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAToken(AToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANode(ANode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XAnnotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XAnnotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXAnnotable(XAnnotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AStructured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AStructured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAStructured(AStructured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AEdge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AEdge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAEdge(AEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATarget Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATarget Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATargetEdge(ATargetEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AtomicSwitch
