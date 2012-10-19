package atomic.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import atomic.diagram.providers.AtomicElementTypes;

/**
 * @generated
 */
public class AtomicPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAtomic1Group());
	}

	/**
	 * Creates "atomic" palette tool group
	 * @generated
	 */
	private PaletteContainer createAtomic1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Atomic1Group_title);
		paletteContainer.setId("createAtomic1Group"); //$NON-NLS-1$
		paletteContainer.add(createAToken1CreationTool());
		paletteContainer.add(createATokenNext2CreationTool());
		paletteContainer.add(createAStructured3CreationTool());
		paletteContainer.add(createAEdge4CreationTool());
		paletteContainer.add(createATargetEdge5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAToken1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AToken1CreationTool_title,
				Messages.AToken1CreationTool_desc,
				Collections.singletonList(AtomicElementTypes.AToken_2002));
		entry.setId("createAToken1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AtomicElementTypes
				.getImageDescriptor(AtomicElementTypes.AToken_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createATokenNext2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ATokenNext2CreationTool_title,
				Messages.ATokenNext2CreationTool_desc,
				Collections.singletonList(AtomicElementTypes.ATokenNext_4002));
		entry.setId("createATokenNext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AtomicElementTypes
				.getImageDescriptor(AtomicElementTypes.ATokenNext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAStructured3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AStructured3CreationTool_title,
				Messages.AStructured3CreationTool_desc,
				Collections.singletonList(AtomicElementTypes.AStructured_2001));
		entry.setId("createAStructured3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AtomicElementTypes
				.getImageDescriptor(AtomicElementTypes.AStructured_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAEdge4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AEdge4CreationTool_title,
				Messages.AEdge4CreationTool_desc,
				Collections.singletonList(AtomicElementTypes.AEdge_4003));
		entry.setId("createAEdge4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AtomicElementTypes
				.getImageDescriptor(AtomicElementTypes.AEdge_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createATargetEdge5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ATargetEdge5CreationTool_title,
				Messages.ATargetEdge5CreationTool_desc,
				Collections.singletonList(AtomicElementTypes.ATargetEdge_4001));
		entry.setId("createATargetEdge5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AtomicElementTypes
				.getImageDescriptor(AtomicElementTypes.ATargetEdge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
