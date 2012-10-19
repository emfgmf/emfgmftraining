/**
 */
package atomic.impl;

import atomic.AEdge;
import atomic.AGraph;
import atomic.AStructured;
import atomic.AToken;
import atomic.AtomicPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AGraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link atomic.impl.AGraphImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link atomic.impl.AGraphImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link atomic.impl.AGraphImpl#getCorpus <em>Corpus</em>}</li>
 *   <li>{@link atomic.impl.AGraphImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AGraphImpl extends EObjectImpl implements AGraph {
	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<AToken> tokens;

	/**
	 * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<AStructured> structures;

	/**
	 * The default value of the '{@link #getCorpus() <em>Corpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpus()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorpus() <em>Corpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpus()
	 * @generated
	 * @ordered
	 */
	protected String corpus = CORPUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<AEdge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomicPackage.Literals.AGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorpus() {
		return corpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorpus(String newCorpus) {
		String oldCorpus = corpus;
		corpus = newCorpus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomicPackage.AGRAPH__CORPUS, oldCorpus, corpus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentWithInverseEList<AEdge>(AEdge.class, this, AtomicPackage.AGRAPH__EDGES, AtomicPackage.AEDGE__GRAPH);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AToken> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentWithInverseEList<AToken>(AToken.class, this, AtomicPackage.AGRAPH__TOKENS, AtomicPackage.ATOKEN__GRAPH);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AStructured> getStructures() {
		if (structures == null) {
			structures = new EObjectContainmentWithInverseEList<AStructured>(AStructured.class, this, AtomicPackage.AGRAPH__STRUCTURES, AtomicPackage.ASTRUCTURED__GRAPH);
		}
		return structures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTokens()).basicAdd(otherEnd, msgs);
			case AtomicPackage.AGRAPH__STRUCTURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructures()).basicAdd(otherEnd, msgs);
			case AtomicPackage.AGRAPH__EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case AtomicPackage.AGRAPH__STRUCTURES:
				return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
			case AtomicPackage.AGRAPH__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				return getTokens();
			case AtomicPackage.AGRAPH__STRUCTURES:
				return getStructures();
			case AtomicPackage.AGRAPH__CORPUS:
				return getCorpus();
			case AtomicPackage.AGRAPH__EDGES:
				return getEdges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends AToken>)newValue);
				return;
			case AtomicPackage.AGRAPH__STRUCTURES:
				getStructures().clear();
				getStructures().addAll((Collection<? extends AStructured>)newValue);
				return;
			case AtomicPackage.AGRAPH__CORPUS:
				setCorpus((String)newValue);
				return;
			case AtomicPackage.AGRAPH__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends AEdge>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				getTokens().clear();
				return;
			case AtomicPackage.AGRAPH__STRUCTURES:
				getStructures().clear();
				return;
			case AtomicPackage.AGRAPH__CORPUS:
				setCorpus(CORPUS_EDEFAULT);
				return;
			case AtomicPackage.AGRAPH__EDGES:
				getEdges().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AtomicPackage.AGRAPH__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case AtomicPackage.AGRAPH__STRUCTURES:
				return structures != null && !structures.isEmpty();
			case AtomicPackage.AGRAPH__CORPUS:
				return CORPUS_EDEFAULT == null ? corpus != null : !CORPUS_EDEFAULT.equals(corpus);
			case AtomicPackage.AGRAPH__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (corpus: ");
		result.append(corpus);
		result.append(')');
		return result.toString();
	}

} //AGraphImpl
