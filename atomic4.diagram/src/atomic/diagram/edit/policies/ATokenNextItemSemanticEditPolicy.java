package atomic.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import atomic.diagram.providers.AtomicElementTypes;

/**
 * @generated
 */
public class ATokenNextItemSemanticEditPolicy extends
		AtomicBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ATokenNextItemSemanticEditPolicy() {
		super(AtomicElementTypes.ATokenNext_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
