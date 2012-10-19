/**
 */
package atomic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AToken</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.AToken#getNext <em>Next</em>}</li>
 *   <li>{@link atomic.AToken#getPrevious <em>Previous</em>}</li>
 *   <li>{@link atomic.AToken#getText <em>Text</em>}</li>
 *   <li>{@link atomic.AToken#getGraph <em>Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getAToken()
 * @model
 * @generated
 */
public interface AToken extends ANode {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomic.AToken#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(AToken)
	 * @see atomic.AtomicPackage#getAToken_Next()
	 * @see atomic.AToken#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	AToken getNext();

	/**
	 * Sets the value of the '{@link atomic.AToken#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(AToken value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link atomic.AToken#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(AToken)
	 * @see atomic.AtomicPackage#getAToken_Previous()
	 * @see atomic.AToken#getNext
	 * @model opposite="next"
	 * @generated
	 */
	AToken getPrevious();

	/**
	 * Sets the value of the '{@link atomic.AToken#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(AToken value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see atomic.AtomicPackage#getAToken_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link atomic.AToken#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link atomic.AGraph#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(AGraph)
	 * @see atomic.AtomicPackage#getAToken_Graph()
	 * @see atomic.AGraph#getTokens
	 * @model opposite="tokens" transient="false"
	 * @generated
	 */
	AGraph getGraph();

	/**
	 * Sets the value of the '{@link atomic.AToken#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(AGraph value);

} // AToken
