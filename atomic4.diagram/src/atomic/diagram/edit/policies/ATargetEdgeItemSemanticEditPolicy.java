package atomic.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import atomic.diagram.providers.AtomicElementTypes;

/**
 * @generated
 */
public class ATargetEdgeItemSemanticEditPolicy extends
		AtomicBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ATargetEdgeItemSemanticEditPolicy() {
		super(AtomicElementTypes.ATargetEdge_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
