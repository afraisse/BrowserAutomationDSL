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

import org.xtext.emn.selenium.sel.ForAll;
import org.xtext.emn.selenium.sel.SelFactory;
import org.xtext.emn.selenium.sel.SelPackage;

/**
 * This is the item provider adapter for a {@link org.xtext.emn.selenium.sel.ForAll} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForAllItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SelPackage.Literals.FOR_ALL__ELEMS);
			childrenFeatures.add(SelPackage.Literals.FOR_ALL__IT);
			childrenFeatures.add(SelPackage.Literals.FOR_ALL__BODY);
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
	 * This returns ForAll.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForAll"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ForAll_type");
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

		switch (notification.getFeatureID(ForAll.class)) {
			case SelPackage.FOR_ALL__ELEMS:
			case SelPackage.FOR_ALL__IT:
			case SelPackage.FOR_ALL__BODY:
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
				(SelPackage.Literals.FOR_ALL__ELEMS,
				 SelFactory.eINSTANCE.createElems()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__ELEMS,
				 SelFactory.eINSTANCE.createGetButtons()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__ELEMS,
				 SelFactory.eINSTANCE.createGetCheckboxes()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__ELEMS,
				 SelFactory.eINSTANCE.createGetLinks()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__IT,
				 SelFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createForAll()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createDoWhile()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createIfThenElse()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createExec()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createFill()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createCheck()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createClick()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createGoTo()));

		newChildDescriptors.add
			(createChildParameter
				(SelPackage.Literals.FOR_ALL__BODY,
				 SelFactory.eINSTANCE.createVerify()));
	}

}
