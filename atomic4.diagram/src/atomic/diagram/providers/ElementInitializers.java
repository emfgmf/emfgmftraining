package atomic.diagram.providers;

import atomic.diagram.part.AtomicDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AtomicDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			AtomicDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
