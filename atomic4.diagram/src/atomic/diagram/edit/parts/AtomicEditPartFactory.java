package atomic.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import atomic.diagram.part.AtomicVisualIDRegistry;

/**
 * @generated
 */
public class AtomicEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AtomicVisualIDRegistry.getVisualID(view)) {

			case AGraphEditPart.VISUAL_ID:
				return new AGraphEditPart(view);

			case AStructuredEditPart.VISUAL_ID:
				return new AStructuredEditPart(view);

			case ATokenEditPart.VISUAL_ID:
				return new ATokenEditPart(view);

			case ATokenTextEditPart.VISUAL_ID:
				return new ATokenTextEditPart(view);

			case ATargetEdgeEditPart.VISUAL_ID:
				return new ATargetEdgeEditPart(view);

			case ATokenNextEditPart.VISUAL_ID:
				return new ATokenNextEditPart(view);

			case AEdgeEditPart.VISUAL_ID:
				return new AEdgeEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
