/**
 */
package atomic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see atomic.AtomicFactory
 * @model kind="package"
 * @generated
 */
public interface AtomicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atomic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atomic/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atomic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtomicPackage eINSTANCE = atomic.impl.AtomicPackageImpl.init();

	/**
	 * The meta object id for the '{@link atomic.impl.AGraphImpl <em>AGraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.AGraphImpl
	 * @see atomic.impl.AtomicPackageImpl#getAGraph()
	 * @generated
	 */
	int AGRAPH = 0;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRAPH__TOKENS = 0;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRAPH__STRUCTURES = 1;

	/**
	 * The feature id for the '<em><b>Corpus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRAPH__CORPUS = 2;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRAPH__EDGES = 3;

	/**
	 * The number of structural features of the '<em>AGraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRAPH_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link atomic.impl.XAnnotableImpl <em>XAnnotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.XAnnotableImpl
	 * @see atomic.impl.AtomicPackageImpl#getXAnnotable()
	 * @generated
	 */
	int XANNOTABLE = 3;

	/**
	 * The number of structural features of the '<em>XAnnotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XANNOTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link atomic.impl.ANodeImpl <em>ANode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.ANodeImpl
	 * @see atomic.impl.AtomicPackageImpl#getANode()
	 * @generated
	 */
	int ANODE = 2;

	/**
	 * The feature id for the '<em><b>Targetedges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE__TARGETEDGES = XANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ANode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANODE_FEATURE_COUNT = XANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link atomic.impl.ATokenImpl <em>AToken</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.ATokenImpl
	 * @see atomic.impl.AtomicPackageImpl#getAToken()
	 * @generated
	 */
	int ATOKEN = 1;

	/**
	 * The feature id for the '<em><b>Targetedges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN__TARGETEDGES = ANODE__TARGETEDGES;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN__NEXT = ANODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN__PREVIOUS = ANODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN__TEXT = ANODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN__GRAPH = ANODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AToken</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOKEN_FEATURE_COUNT = ANODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link atomic.impl.AStructuredImpl <em>AStructured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.AStructuredImpl
	 * @see atomic.impl.AtomicPackageImpl#getAStructured()
	 * @generated
	 */
	int ASTRUCTURED = 4;

	/**
	 * The feature id for the '<em><b>Targetedges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRUCTURED__TARGETEDGES = ANODE__TARGETEDGES;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRUCTURED__GRAPH = ANODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AStructured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTRUCTURED_FEATURE_COUNT = ANODE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link atomic.impl.AEdgeImpl <em>AEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.AEdgeImpl
	 * @see atomic.impl.AtomicPackageImpl#getAEdge()
	 * @generated
	 */
	int AEDGE = 5;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEDGE__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEDGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEDGE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>AEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEDGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link atomic.impl.ATargetEdgeImpl <em>ATarget Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see atomic.impl.ATargetEdgeImpl
	 * @see atomic.impl.AtomicPackageImpl#getATargetEdge()
	 * @generated
	 */
	int ATARGET_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATARGET_EDGE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATARGET_EDGE__GRAPH = 1;

	/**
	 * The number of structural features of the '<em>ATarget Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATARGET_EDGE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link atomic.AGraph <em>AGraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AGraph</em>'.
	 * @see atomic.AGraph
	 * @generated
	 */
	EClass getAGraph();

	/**
	 * Returns the meta object for the attribute '{@link atomic.AGraph#getCorpus <em>Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corpus</em>'.
	 * @see atomic.AGraph#getCorpus()
	 * @see #getAGraph()
	 * @generated
	 */
	EAttribute getAGraph_Corpus();

	/**
	 * Returns the meta object for the containment reference list '{@link atomic.AGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see atomic.AGraph#getEdges()
	 * @see #getAGraph()
	 * @generated
	 */
	EReference getAGraph_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link atomic.AGraph#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see atomic.AGraph#getTokens()
	 * @see #getAGraph()
	 * @generated
	 */
	EReference getAGraph_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link atomic.AGraph#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see atomic.AGraph#getStructures()
	 * @see #getAGraph()
	 * @generated
	 */
	EReference getAGraph_Structures();

	/**
	 * Returns the meta object for class '{@link atomic.AToken <em>AToken</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AToken</em>'.
	 * @see atomic.AToken
	 * @generated
	 */
	EClass getAToken();

	/**
	 * Returns the meta object for the reference '{@link atomic.AToken#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see atomic.AToken#getNext()
	 * @see #getAToken()
	 * @generated
	 */
	EReference getAToken_Next();

	/**
	 * Returns the meta object for the reference '{@link atomic.AToken#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see atomic.AToken#getPrevious()
	 * @see #getAToken()
	 * @generated
	 */
	EReference getAToken_Previous();

	/**
	 * Returns the meta object for the attribute '{@link atomic.AToken#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see atomic.AToken#getText()
	 * @see #getAToken()
	 * @generated
	 */
	EAttribute getAToken_Text();

	/**
	 * Returns the meta object for the container reference '{@link atomic.AToken#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see atomic.AToken#getGraph()
	 * @see #getAToken()
	 * @generated
	 */
	EReference getAToken_Graph();

	/**
	 * Returns the meta object for class '{@link atomic.ANode <em>ANode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANode</em>'.
	 * @see atomic.ANode
	 * @generated
	 */
	EClass getANode();

	/**
	 * Returns the meta object for the containment reference list '{@link atomic.ANode#getTargetedges <em>Targetedges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targetedges</em>'.
	 * @see atomic.ANode#getTargetedges()
	 * @see #getANode()
	 * @generated
	 */
	EReference getANode_Targetedges();

	/**
	 * Returns the meta object for class '{@link atomic.XAnnotable <em>XAnnotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAnnotable</em>'.
	 * @see atomic.XAnnotable
	 * @generated
	 */
	EClass getXAnnotable();

	/**
	 * Returns the meta object for class '{@link atomic.AStructured <em>AStructured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AStructured</em>'.
	 * @see atomic.AStructured
	 * @generated
	 */
	EClass getAStructured();

	/**
	 * Returns the meta object for the container reference '{@link atomic.AStructured#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see atomic.AStructured#getGraph()
	 * @see #getAStructured()
	 * @generated
	 */
	EReference getAStructured_Graph();

	/**
	 * Returns the meta object for class '{@link atomic.AEdge <em>AEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AEdge</em>'.
	 * @see atomic.AEdge
	 * @generated
	 */
	EClass getAEdge();

	/**
	 * Returns the meta object for the container reference '{@link atomic.AEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see atomic.AEdge#getGraph()
	 * @see #getAEdge()
	 * @generated
	 */
	EReference getAEdge_Graph();

	/**
	 * Returns the meta object for the reference '{@link atomic.AEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see atomic.AEdge#getSource()
	 * @see #getAEdge()
	 * @generated
	 */
	EReference getAEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link atomic.AEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see atomic.AEdge#getTarget()
	 * @see #getAEdge()
	 * @generated
	 */
	EReference getAEdge_Target();

	/**
	 * Returns the meta object for class '{@link atomic.ATargetEdge <em>ATarget Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATarget Edge</em>'.
	 * @see atomic.ATargetEdge
	 * @generated
	 */
	EClass getATargetEdge();

	/**
	 * Returns the meta object for the reference '{@link atomic.ATargetEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see atomic.ATargetEdge#getTarget()
	 * @see #getATargetEdge()
	 * @generated
	 */
	EReference getATargetEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link atomic.ATargetEdge#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Graph</em>'.
	 * @see atomic.ATargetEdge#getGraph()
	 * @see #getATargetEdge()
	 * @generated
	 */
	EReference getATargetEdge_Graph();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtomicFactory getAtomicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link atomic.impl.AGraphImpl <em>AGraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.AGraphImpl
		 * @see atomic.impl.AtomicPackageImpl#getAGraph()
		 * @generated
		 */
		EClass AGRAPH = eINSTANCE.getAGraph();

		/**
		 * The meta object literal for the '<em><b>Corpus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGRAPH__CORPUS = eINSTANCE.getAGraph_Corpus();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRAPH__EDGES = eINSTANCE.getAGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRAPH__TOKENS = eINSTANCE.getAGraph_Tokens();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGRAPH__STRUCTURES = eINSTANCE.getAGraph_Structures();

		/**
		 * The meta object literal for the '{@link atomic.impl.ATokenImpl <em>AToken</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.ATokenImpl
		 * @see atomic.impl.AtomicPackageImpl#getAToken()
		 * @generated
		 */
		EClass ATOKEN = eINSTANCE.getAToken();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOKEN__NEXT = eINSTANCE.getAToken_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOKEN__PREVIOUS = eINSTANCE.getAToken_Previous();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOKEN__TEXT = eINSTANCE.getAToken_Text();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOKEN__GRAPH = eINSTANCE.getAToken_Graph();

		/**
		 * The meta object literal for the '{@link atomic.impl.ANodeImpl <em>ANode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.ANodeImpl
		 * @see atomic.impl.AtomicPackageImpl#getANode()
		 * @generated
		 */
		EClass ANODE = eINSTANCE.getANode();

		/**
		 * The meta object literal for the '<em><b>Targetedges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANODE__TARGETEDGES = eINSTANCE.getANode_Targetedges();

		/**
		 * The meta object literal for the '{@link atomic.impl.XAnnotableImpl <em>XAnnotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.XAnnotableImpl
		 * @see atomic.impl.AtomicPackageImpl#getXAnnotable()
		 * @generated
		 */
		EClass XANNOTABLE = eINSTANCE.getXAnnotable();

		/**
		 * The meta object literal for the '{@link atomic.impl.AStructuredImpl <em>AStructured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.AStructuredImpl
		 * @see atomic.impl.AtomicPackageImpl#getAStructured()
		 * @generated
		 */
		EClass ASTRUCTURED = eINSTANCE.getAStructured();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASTRUCTURED__GRAPH = eINSTANCE.getAStructured_Graph();

		/**
		 * The meta object literal for the '{@link atomic.impl.AEdgeImpl <em>AEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.AEdgeImpl
		 * @see atomic.impl.AtomicPackageImpl#getAEdge()
		 * @generated
		 */
		EClass AEDGE = eINSTANCE.getAEdge();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEDGE__GRAPH = eINSTANCE.getAEdge_Graph();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEDGE__SOURCE = eINSTANCE.getAEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AEDGE__TARGET = eINSTANCE.getAEdge_Target();

		/**
		 * The meta object literal for the '{@link atomic.impl.ATargetEdgeImpl <em>ATarget Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see atomic.impl.ATargetEdgeImpl
		 * @see atomic.impl.AtomicPackageImpl#getATargetEdge()
		 * @generated
		 */
		EClass ATARGET_EDGE = eINSTANCE.getATargetEdge();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATARGET_EDGE__TARGET = eINSTANCE.getATargetEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATARGET_EDGE__GRAPH = eINSTANCE.getATargetEdge_Graph();

	}

} //AtomicPackage
