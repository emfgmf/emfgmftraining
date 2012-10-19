/**
 */
package atomic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AEdge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.AEdge#getGraph <em>Graph</em>}</li>
 *   <li>{@link atomic.AEdge#getSource <em>Source</em>}</li>
 *   <li>{@link atomic.AEdge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getAEdge()
 * @model
 * @generated
 */
public interface AEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomic.AGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(AGraph)
	 * @see atomic.AtomicPackage#getAEdge_Graph()
	 * @see atomic.AGraph#getEdges
	 * @model opposite="edges" required="true" transient="false"
	 * @generated
	 */
	AGraph getGraph();

	/**
	 * Sets the value of the '{@link atomic.AEdge#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(AGraph value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ANode)
	 * @see atomic.AtomicPackage#getAEdge_Source()
	 * @model required="true"
	 * @generated
	 */
	ANode getSource();

	/**
	 * Sets the value of the '{@link atomic.AEdge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ANode value);

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
	 * @see atomic.AtomicPackage#getAEdge_Target()
	 * @model required="true"
	 * @generated
	 */
	ANode getTarget();

	/**
	 * Sets the value of the '{@link atomic.AEdge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ANode value);

} // AEdge
