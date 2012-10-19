/**
 */
package atomic;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ANode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link atomic.ANode#getTargetedges <em>Targetedges</em>}</li>
 * </ul>
 * </p>
 *
 * @see atomic.AtomicPackage#getANode()
 * @model abstract="true"
 * @generated
 */
public interface ANode extends XAnnotable {

	/**
	 * Returns the value of the '<em><b>Targetedges</b></em>' containment reference list.
	 * The list contents are of type {@link atomic.ATargetEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetedges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetedges</em>' containment reference list.
	 * @see atomic.AtomicPackage#getANode_Targetedges()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATargetEdge> getTargetedges();
} // ANode
