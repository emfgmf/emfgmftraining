package atomic.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import atomic.AGraph;
import atomic.AtomicPackage;
import atomic.diagram.edit.parts.AEdgeEditPart;
import atomic.diagram.edit.parts.AGraphEditPart;
import atomic.diagram.edit.parts.AStructuredEditPart;
import atomic.diagram.edit.parts.ATargetEdgeEditPart;
import atomic.diagram.edit.parts.ATokenEditPart;
import atomic.diagram.edit.parts.ATokenTextEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AtomicVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "atomic4.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AGraphEditPart.MODEL_ID.equals(view.getType())) {
				return AGraphEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return atomic.diagram.part.AtomicVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AtomicDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AtomicPackage.eINSTANCE.getAGraph().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((AGraph) domainElement)) {
			return AGraphEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = atomic.diagram.part.AtomicVisualIDRegistry
				.getModelID(containerView);
		if (!AGraphEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (AGraphEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = atomic.diagram.part.AtomicVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AGraphEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case AGraphEditPart.VISUAL_ID:
			if (AtomicPackage.eINSTANCE.getAStructured().isSuperTypeOf(
					domainElement.eClass())) {
				return AStructuredEditPart.VISUAL_ID;
			}
			if (AtomicPackage.eINSTANCE.getAToken().isSuperTypeOf(
					domainElement.eClass())) {
				return ATokenEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = atomic.diagram.part.AtomicVisualIDRegistry
				.getModelID(containerView);
		if (!AGraphEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (AGraphEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = atomic.diagram.part.AtomicVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AGraphEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case AGraphEditPart.VISUAL_ID:
			if (AStructuredEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ATokenEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ATokenEditPart.VISUAL_ID:
			if (ATokenTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AtomicPackage.eINSTANCE.getATargetEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return ATargetEdgeEditPart.VISUAL_ID;
		}
		if (AtomicPackage.eINSTANCE.getAEdge().isSuperTypeOf(
				domainElement.eClass())) {
			return AEdgeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(AGraph element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case AGraphEditPart.VISUAL_ID:
			return false;
		case AStructuredEditPart.VISUAL_ID:
		case ATokenEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return atomic.diagram.part.AtomicVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return atomic.diagram.part.AtomicVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return atomic.diagram.part.AtomicVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return atomic.diagram.part.AtomicVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return atomic.diagram.part.AtomicVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return atomic.diagram.part.AtomicVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
