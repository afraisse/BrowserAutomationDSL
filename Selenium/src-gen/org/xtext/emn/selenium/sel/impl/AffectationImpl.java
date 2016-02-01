/**
 */
package org.xtext.emn.selenium.sel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.emn.selenium.sel.Affectation;
import org.xtext.emn.selenium.sel.Elem;
import org.xtext.emn.selenium.sel.SelPackage;
import org.xtext.emn.selenium.sel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.AffectationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.AffectationImpl#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectationImpl extends InstructionImpl implements Affectation
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected Variable variable;

  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElem()
   * @generated
   * @ordered
   */
  protected Elem elem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AffectationImpl()
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
    return SelPackage.Literals.AFFECTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs)
  {
    Variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.AFFECTATION__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(Variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.AFFECTATION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.AFFECTATION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.AFFECTATION__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elem getElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElem(Elem newElem, NotificationChain msgs)
  {
    Elem oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.AFFECTATION__ELEM, oldElem, newElem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(Elem newElem)
  {
    if (newElem != elem)
    {
      NotificationChain msgs = null;
      if (elem != null)
        msgs = ((InternalEObject)elem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.AFFECTATION__ELEM, null, msgs);
      if (newElem != null)
        msgs = ((InternalEObject)newElem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.AFFECTATION__ELEM, null, msgs);
      msgs = basicSetElem(newElem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.AFFECTATION__ELEM, newElem, newElem));
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
      case SelPackage.AFFECTATION__VARIABLE:
        return basicSetVariable(null, msgs);
      case SelPackage.AFFECTATION__ELEM:
        return basicSetElem(null, msgs);
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
      case SelPackage.AFFECTATION__VARIABLE:
        return getVariable();
      case SelPackage.AFFECTATION__ELEM:
        return getElem();
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
      case SelPackage.AFFECTATION__VARIABLE:
        setVariable((Variable)newValue);
        return;
      case SelPackage.AFFECTATION__ELEM:
        setElem((Elem)newValue);
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
      case SelPackage.AFFECTATION__VARIABLE:
        setVariable((Variable)null);
        return;
      case SelPackage.AFFECTATION__ELEM:
        setElem((Elem)null);
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
      case SelPackage.AFFECTATION__VARIABLE:
        return variable != null;
      case SelPackage.AFFECTATION__ELEM:
        return elem != null;
    }
    return super.eIsSet(featureID);
  }

} //AffectationImpl
