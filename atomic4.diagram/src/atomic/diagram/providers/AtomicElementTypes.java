package atomic.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import atomic.AtomicPackage;
import atomic.diagram.edit.parts.AEdgeEditPart;
import atomic.diagram.edit.parts.AGraphEditPart;
import atomic.diagram.edit.parts.AStructuredEditPart;
import atomic.diagram.edit.parts.ATargetEdgeEditPart;
import atomic.diagram.edit.parts.ATokenEditPart;
import atomic.diagram.edit.parts.ATokenNextEditPart;
import atomic.diagram.part.AtomicDiagramEditorPlugin;

/**
 * @generated
 */
public class AtomicElementTypes {

	/**
	 * @generated
	 */
	private AtomicElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType AGraph_1000 = getElementType("atomic4.diagram.AGraph_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AStructured_2001 = getElementType("atomic4.diagram.AStructured_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AToken_2002 = getElementType("atomic4.diagram.AToken_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ATargetEdge_4001 = getElementType("atomic4.diagram.ATargetEdge_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ATokenNext_4002 = getElementType("atomic4.diagram.ATokenNext_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AEdge_4003 = getElementType("atomic4.diagram.AEdge_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return AtomicDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(AGraph_1000, AtomicPackage.eINSTANCE.getAGraph());

			elements.put(AStructured_2001,
					AtomicPackage.eINSTANCE.getAStructured());

			elements.put(AToken_2002, AtomicPackage.eINSTANCE.getAToken());

			elements.put(ATargetEdge_4001,
					AtomicPackage.eINSTANCE.getATargetEdge());

			elements.put(ATokenNext_4002,
					AtomicPackage.eINSTANCE.getAToken_Next());

			elements.put(AEdge_4003, AtomicPackage.eINSTANCE.getAEdge());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(AGraph_1000);
			KNOWN_ELEMENT_TYPES.add(AStructured_2001);
			KNOWN_ELEMENT_TYPES.add(AToken_2002);
			KNOWN_ELEMENT_TYPES.add(ATargetEdge_4001);
			KNOWN_ELEMENT_TYPES.add(ATokenNext_4002);
			KNOWN_ELEMENT_TYPES.add(AEdge_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AGraphEditPart.VISUAL_ID:
			return AGraph_1000;
		case AStructuredEditPart.VISUAL_ID:
			return AStructured_2001;
		case ATokenEditPart.VISUAL_ID:
			return AToken_2002;
		case ATargetEdgeEditPart.VISUAL_ID:
			return ATargetEdge_4001;
		case ATokenNextEditPart.VISUAL_ID:
			return ATokenNext_4002;
		case AEdgeEditPart.VISUAL_ID:
			return AEdge_4003;
		}
		return null;
	}

}
