/**
 */
package org.xtext.emn.selenium.sel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.xtext.emn.selenium.sel.Click;
import org.xtext.emn.selenium.sel.SelFactory;
import org.xtext.emn.selenium.sel.SelPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.emn.selenium.sel.Click} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClickItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SelPackage.Literals.CLICK__BUTTON);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Click.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Click"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Click_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Click.class)) {
			case SelPackage.CLICK__BUTTON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createTest()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createForAll()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createCheck()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createClick()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createVerify()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createNotCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createUnaryCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createBinaryCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetButton()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetLink()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetText()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetInput()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createElems()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetButtons()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetCheckboxes()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CLICK__BUTTON,
				 SelFactory.eINSTANCE.createGetLinks()));
	}

}
