/**
 */
package atomic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AGraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.AGraph#getTokens <em>Tokens</em>}</li>
 *   <li>{@link atomic.AGraph#getStructures <em>Structures</em>}</li>
 *   <li>{@link atomic.AGraph#getCorpus <em>Corpus</em>}</li>
 *   <li>{@link atomic.AGraph#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getAGraph()
 * @model
 * @generated
 */
public interface AGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Corpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corpus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corpus</em>' attribute.
	 * @see #setCorpus(String)
	 * @see atomic.AtomicPackage#getAGraph_Corpus()
	 * @model required="true"
	 * @generated
	 */
	String getCorpus();

	/**
	 * Sets the value of the '{@link atomic.AGraph#getCorpus <em>Corpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corpus</em>' attribute.
	 * @see #getCorpus()
	 * @generated
	 */
	void setCorpus(String value);

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link atomic.AEdge}.
	 * It is bidirectional and its opposite is '{@link atomic.AEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see atomic.AtomicPackage#getAGraph_Edges()
	 * @see atomic.AEdge#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<AEdge> getEdges();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link atomic.AToken}.
	 * It is bidirectional and its opposite is '{@link atomic.AToken#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see atomic.AtomicPackage#getAGraph_Tokens()
	 * @see atomic.AToken#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<AToken> getTokens();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link atomic.AStructured}.
	 * It is bidirectional and its opposite is '{@link atomic.AStructured#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see atomic.AtomicPackage#getAGraph_Structures()
	 * @see atomic.AStructured#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<AStructured> getStructures();

} // AGraph
