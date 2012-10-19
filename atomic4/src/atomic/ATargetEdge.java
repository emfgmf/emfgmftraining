/**
 */
package atomic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATarget Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.ATargetEdge#getTarget <em>Target</em>}</li>
 *   <li>{@link atomic.ATargetEdge#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getATargetEdge()
 * @model
 * @generated
 */
public interface ATargetEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ANode)
	 * @see atomic.AtomicPackage#getATargetEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	ANode getTarget();

	/**
	 * Sets the value of the '{@link atomic.ATargetEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ANode value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' reference.
	 * @see #setGraph(AGraph)
	 * @see atomic.AtomicPackage#getATargetEdge_Graph()
	 * @model required="true"
	 * @generated
	 */
	AGraph getGraph();

	/**
	 * Sets the value of the '{@link atomic.ATargetEdge#getGraph <em>Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(AGraph value);

} // ATargetEdge
