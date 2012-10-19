package atomic.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import atomic.diagram.edit.commands.AEdgeCreateCommand;
import atomic.diagram.edit.commands.AEdgeReorientCommand;
import atomic.diagram.edit.commands.ATargetEdgeCreateCommand;
import atomic.diagram.edit.commands.ATargetEdgeReorientCommand;
import atomic.diagram.edit.commands.ATokenNextCreateCommand;
import atomic.diagram.edit.commands.ATokenNextReorientCommand;
import atomic.diagram.edit.parts.AEdgeEditPart;
import atomic.diagram.edit.parts.ATargetEdgeEditPart;
import atomic.diagram.edit.parts.ATokenNextEditPart;
import atomic.diagram.part.AtomicVisualIDRegistry;
import atomic.diagram.providers.AtomicElementTypes;

/**
 * @generated
 */
public class ATokenItemSemanticEditPolicy extends
		AtomicBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ATokenItemSemanticEditPolicy() {
		super(AtomicElementTypes.AToken_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (AtomicVisualIDRegistry.getVisualID(incomingLink) == ATargetEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AtomicVisualIDRegistry.getVisualID(incomingLink) == ATokenNextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AtomicVisualIDRegistry.getVisualID(incomingLink) == AEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AtomicVisualIDRegistry.getVisualID(outgoingLink) == ATargetEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AtomicVisualIDRegistry.getVisualID(outgoingLink) == ATokenNextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AtomicVisualIDRegistry.getVisualID(outgoingLink) == AEdgeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AtomicElementTypes.ATargetEdge_4001 == req.getElementType()) {
			return getGEFWrapper(new ATargetEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AtomicElementTypes.ATokenNext_4002 == req.getElementType()) {
			return getGEFWrapper(new ATokenNextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AtomicElementTypes.AEdge_4003 == req.getElementType()) {
			return getGEFWrapper(new AEdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (AtomicElementTypes.ATargetEdge_4001 == req.getElementType()) {
			return getGEFWrapper(new ATargetEdgeCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AtomicElementTypes.ATokenNext_4002 == req.getElementType()) {
			return getGEFWrapper(new ATokenNextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (AtomicElementTypes.AEdge_4003 == req.getElementType()) {
			return getGEFWrapper(new AEdgeCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ATargetEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new ATargetEdgeReorientCommand(req));
		case AEdgeEditPart.VISUAL_ID:
			return getGEFWrapper(new AEdgeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ATokenNextEditPart.VISUAL_ID:
			return getGEFWrapper(new ATokenNextReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
