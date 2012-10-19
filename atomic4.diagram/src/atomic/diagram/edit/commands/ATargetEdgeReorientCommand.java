package atomic.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import atomic.ANode;
import atomic.ATargetEdge;
import atomic.diagram.edit.policies.AtomicBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ATargetEdgeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ATargetEdgeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ATargetEdge) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ANode && newEnd instanceof ANode)) {
			return false;
		}
		ANode target = getLink().getTarget();
		return AtomicBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistATargetEdge_4001(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ANode && newEnd instanceof ANode)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof ANode)) {
			return false;
		}
		ANode source = (ANode) getLink().eContainer();
		return AtomicBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistATargetEdge_4001(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getTargetedges().remove(getLink());
		getNewSource().getTargetedges().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected ATargetEdge getLink() {
		return (ATargetEdge) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ANode getOldSource() {
		return (ANode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ANode getNewSource() {
		return (ANode) newEnd;
	}

	/**
	 * @generated
	 */
	protected ANode getOldTarget() {
		return (ANode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ANode getNewTarget() {
		return (ANode) newEnd;
	}
}
