package atomic.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import atomic.AEdge;
import atomic.AGraph;
import atomic.ANode;
import atomic.AStructured;
import atomic.ATargetEdge;
import atomic.AToken;
import atomic.AtomicPackage;
import atomic.diagram.edit.parts.AEdgeEditPart;
import atomic.diagram.edit.parts.AGraphEditPart;
import atomic.diagram.edit.parts.AStructuredEditPart;
import atomic.diagram.edit.parts.ATargetEdgeEditPart;
import atomic.diagram.edit.parts.ATokenEditPart;
import atomic.diagram.edit.parts.ATokenNextEditPart;
import atomic.diagram.providers.AtomicElementTypes;

/**
 * @generated
 */
public class AtomicDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<AtomicNodeDescriptor> getSemanticChildren(View view) {
		switch (AtomicVisualIDRegistry.getVisualID(view)) {
		case AGraphEditPart.VISUAL_ID:
			return getAGraph_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicNodeDescriptor> getAGraph_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AGraph modelElement = (AGraph) view.getElement();
		LinkedList<AtomicNodeDescriptor> result = new LinkedList<AtomicNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStructures().iterator(); it
				.hasNext();) {
			AStructured childElement = (AStructured) it.next();
			int visualID = AtomicVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AStructuredEditPart.VISUAL_ID) {
				result.add(new AtomicNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTokens().iterator(); it.hasNext();) {
			AToken childElement = (AToken) it.next();
			int visualID = AtomicVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ATokenEditPart.VISUAL_ID) {
				result.add(new AtomicNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getContainedLinks(View view) {
		switch (AtomicVisualIDRegistry.getVisualID(view)) {
		case AGraphEditPart.VISUAL_ID:
			return getAGraph_1000ContainedLinks(view);
		case AStructuredEditPart.VISUAL_ID:
			return getAStructured_2001ContainedLinks(view);
		case ATokenEditPart.VISUAL_ID:
			return getAToken_2002ContainedLinks(view);
		case ATargetEdgeEditPart.VISUAL_ID:
			return getATargetEdge_4001ContainedLinks(view);
		case AEdgeEditPart.VISUAL_ID:
			return getAEdge_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getIncomingLinks(View view) {
		switch (AtomicVisualIDRegistry.getVisualID(view)) {
		case AStructuredEditPart.VISUAL_ID:
			return getAStructured_2001IncomingLinks(view);
		case ATokenEditPart.VISUAL_ID:
			return getAToken_2002IncomingLinks(view);
		case ATargetEdgeEditPart.VISUAL_ID:
			return getATargetEdge_4001IncomingLinks(view);
		case AEdgeEditPart.VISUAL_ID:
			return getAEdge_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getOutgoingLinks(View view) {
		switch (AtomicVisualIDRegistry.getVisualID(view)) {
		case AStructuredEditPart.VISUAL_ID:
			return getAStructured_2001OutgoingLinks(view);
		case ATokenEditPart.VISUAL_ID:
			return getAToken_2002OutgoingLinks(view);
		case ATargetEdgeEditPart.VISUAL_ID:
			return getATargetEdge_4001OutgoingLinks(view);
		case AEdgeEditPart.VISUAL_ID:
			return getAEdge_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAGraph_1000ContainedLinks(
			View view) {
		AGraph modelElement = (AGraph) view.getElement();
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AEdge_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAStructured_2001ContainedLinks(
			View view) {
		AStructured modelElement = (AStructured) view.getElement();
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ATargetEdge_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAToken_2002ContainedLinks(
			View view) {
		AToken modelElement = (AToken) view.getElement();
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ATargetEdge_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AToken_Next_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getATargetEdge_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAEdge_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAStructured_2001IncomingLinks(
			View view) {
		AStructured modelElement = (AStructured) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ATargetEdge_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AEdge_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAToken_2002IncomingLinks(
			View view) {
		AToken modelElement = (AToken) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ATargetEdge_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_AToken_Next_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AEdge_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getATargetEdge_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAEdge_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAStructured_2001OutgoingLinks(
			View view) {
		AStructured modelElement = (AStructured) view.getElement();
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ATargetEdge_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AEdge_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAToken_2002OutgoingLinks(
			View view) {
		AToken modelElement = (AToken) view.getElement();
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ATargetEdge_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_AToken_Next_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AEdge_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getATargetEdge_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AtomicLinkDescriptor> getAEdge_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getContainedTypeModelFacetLinks_ATargetEdge_4001(
			ANode container) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		for (Iterator<?> links = container.getTargetedges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ATargetEdge) {
				continue;
			}
			ATargetEdge link = (ATargetEdge) linkObject;
			if (ATargetEdgeEditPart.VISUAL_ID != AtomicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ANode dst = link.getTarget();
			result.add(new AtomicLinkDescriptor(container, dst, link,
					AtomicElementTypes.ATargetEdge_4001,
					ATargetEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getContainedTypeModelFacetLinks_AEdge_4003(
			AGraph container) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AEdge) {
				continue;
			}
			AEdge link = (AEdge) linkObject;
			if (AEdgeEditPart.VISUAL_ID != AtomicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ANode dst = link.getTarget();
			ANode src = link.getSource();
			result.add(new AtomicLinkDescriptor(src, dst, link,
					AtomicElementTypes.AEdge_4003, AEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getIncomingTypeModelFacetLinks_ATargetEdge_4001(
			ANode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AtomicPackage.eINSTANCE
					.getATargetEdge_Target()
					|| false == setting.getEObject() instanceof ATargetEdge) {
				continue;
			}
			ATargetEdge link = (ATargetEdge) setting.getEObject();
			if (ATargetEdgeEditPart.VISUAL_ID != AtomicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof ANode) {
				continue;
			}
			ANode container = (ANode) link.eContainer();
			result.add(new AtomicLinkDescriptor(container, target, link,
					AtomicElementTypes.ATargetEdge_4001,
					ATargetEdgeEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getIncomingFeatureModelFacetLinks_AToken_Next_4002(
			AToken target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == AtomicPackage.eINSTANCE
					.getAToken_Next()) {
				result.add(new AtomicLinkDescriptor(setting.getEObject(),
						target, AtomicElementTypes.ATokenNext_4002,
						ATokenNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getIncomingTypeModelFacetLinks_AEdge_4003(
			ANode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AtomicPackage.eINSTANCE
					.getAEdge_Target()
					|| false == setting.getEObject() instanceof AEdge) {
				continue;
			}
			AEdge link = (AEdge) setting.getEObject();
			if (AEdgeEditPart.VISUAL_ID != AtomicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ANode src = link.getSource();
			result.add(new AtomicLinkDescriptor(src, target, link,
					AtomicElementTypes.AEdge_4003, AEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getOutgoingFeatureModelFacetLinks_AToken_Next_4002(
			AToken source) {
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		AToken destination = source.getNext();
		if (destination == null) {
			return result;
		}
		result.add(new AtomicLinkDescriptor(source, destination,
				AtomicElementTypes.ATokenNext_4002,
				ATokenNextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AtomicLinkDescriptor> getOutgoingTypeModelFacetLinks_AEdge_4003(
			ANode source) {
		AGraph container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof AGraph) {
				container = (AGraph) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AtomicLinkDescriptor> result = new LinkedList<AtomicLinkDescriptor>();
		for (Iterator<?> links = container.getEdges().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AEdge) {
				continue;
			}
			AEdge link = (AEdge) linkObject;
			if (AEdgeEditPart.VISUAL_ID != AtomicVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ANode dst = link.getTarget();
			ANode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new AtomicLinkDescriptor(src, dst, link,
					AtomicElementTypes.AEdge_4003, AEdgeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<AtomicNodeDescriptor> getSemanticChildren(View view) {
			return AtomicDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AtomicLinkDescriptor> getContainedLinks(View view) {
			return AtomicDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AtomicLinkDescriptor> getIncomingLinks(View view) {
			return AtomicDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AtomicLinkDescriptor> getOutgoingLinks(View view) {
			return AtomicDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
