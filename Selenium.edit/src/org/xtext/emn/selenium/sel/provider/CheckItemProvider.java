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

import org.xtext.emn.selenium.sel.Check;
import org.xtext.emn.selenium.sel.SelFactory;
import org.xtext.emn.selenium.sel.SelPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.emn.selenium.sel.Check} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SelPackage.Literals.CHECK__CHECKBOX);
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
	 * This returns Check.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Check"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Check_type");
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

		switch (notification.getFeatureID(Check.class)) {
			case SelPackage.CHECK__CHECKBOX:
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
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createProgram()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createTest()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createForAll()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createCheck()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createClick()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createVerify()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createNotCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createUnaryCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createBinaryCondition()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetButton()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetLink()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetCheckbox()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetText()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetInput()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createElems()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetButtons()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetCheckboxes()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.CHECK__CHECKBOX,
				 SelFactory.eINSTANCE.createGetLinks()));
	}

}
