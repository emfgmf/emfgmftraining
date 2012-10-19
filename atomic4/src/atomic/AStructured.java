/**
 */
package atomic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AStructured</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.AStructured#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getAStructured()
 * @model
 * @generated
 */
public interface AStructured extends ANode {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomic.AGraph#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(AGraph)
	 * @see atomic.AtomicPackage#getAStructured_Graph()
	 * @see atomic.AGraph#getStructures
	 * @model opposite="structures" required="true" transient="false"
	 * @generated
	 */
	AGraph getGraph();

	/**
	 * Sets the value of the '{@link atomic.AStructured#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(AGraph value);

} // AStructured
