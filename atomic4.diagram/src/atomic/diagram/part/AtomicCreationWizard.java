package atomic.diagram.part;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class AtomicCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected AtomicCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected AtomicCreationWizardPage domainModelFilePage;

	/**
	 * @generated NOT
	 */
	protected AtomicCreationWizardPage corpusFilePage;
	
	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.AtomicCreationWizardTitle);
		setDefaultPageImageDescriptor(AtomicDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewAtomicWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated NOT
	 */
	public void addPages() {
		diagramModelFilePage = new AtomicCreationWizardPage(
				"DiagramModelFile", getSelection(), "atomic_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.AtomicCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.AtomicCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new AtomicCreationWizardPage(
				"DomainModelFile", getSelection(), "atomic") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".atomic_diagram".length()); //$NON-NLS-1$
					setFileName(AtomicDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "atomic")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.AtomicCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.AtomicCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
		
		corpusFilePage = new AtomicCreationWizardPage(
				"CorpusFile", getSelection(), "txt"); //$NON-NLS-1$ //$NON-NLS-2$
		corpusFilePage
				.setTitle("Load Corpus File");
		corpusFilePage
				.setDescription("Select a Corpus File");
		addPage(corpusFilePage);
	}

	/**
	 * @generated NOT
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {

				String path = corpusFilePage.getContainerFullPath().toOSString();
				if (!new File(path).exists())
					ErrorDialog.openError(getContainer().getShell(),
							Messages.AtomicCreationWizardOpenEditorError,
							"",
							new Status(IStatus.ERROR, "atomic4.diagram",  path + "does not exist!"));
				File file = new File(path + corpusFilePage.getFileName());
				if (!file.exists())
					ErrorDialog.openError(getContainer().getShell(),
							Messages.AtomicCreationWizardOpenEditorError,
							"",
							new Status(IStatus.ERROR, "atomic4.diagram",  file.toString() + "does not exist!"));
				
				diagram = AtomicDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(),
						file, 
						monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						AtomicDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.AtomicCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.AtomicCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				AtomicDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
