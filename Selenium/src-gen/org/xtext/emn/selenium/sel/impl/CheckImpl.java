/**
 */
package org.xtext.emn.selenium.sel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.emn.selenium.sel.Check;
import org.xtext.emn.selenium.sel.SelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.CheckImpl#getCheckbox <em>Checkbox</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckImpl extends InstructionImpl implements Check
{
  /**
   * The cached value of the '{@link #getCheckbox() <em>Checkbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckbox()
   * @generated
   * @ordered
   */
  protected EObject checkbox;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SelPackage.Literals.CHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getCheckbox()
  {
    return checkbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckbox(EObject newCheckbox, NotificationChain msgs)
  {
    EObject oldCheckbox = checkbox;
    checkbox = newCheckbox;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.CHECK__CHECKBOX, oldCheckbox, newCheckbox);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckbox(EObject newCheckbox)
  {
    if (newCheckbox != checkbox)
    {
      NotificationChain msgs = null;
      if (checkbox != null)
        msgs = ((InternalEObject)checkbox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.CHECK__CHECKBOX, null, msgs);
      if (newCheckbox != null)
        msgs = ((InternalEObject)newCheckbox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.CHECK__CHECKBOX, null, msgs);
      msgs = basicSetCheckbox(newCheckbox, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.CHECK__CHECKBOX, newCheckbox, newCheckbox));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SelPackage.CHECK__CHECKBOX:
        return basicSetCheckbox(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SelPackage.CHECK__CHECKBOX:
        return getCheckbox();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelPackage.CHECK__CHECKBOX:
        setCheckbox((EObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SelPackage.CHECK__CHECKBOX:
        setCheckbox((EObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SelPackage.CHECK__CHECKBOX:
        return checkbox != null;
    }
    return super.eIsSet(featureID);
  }

} //CheckImpl
