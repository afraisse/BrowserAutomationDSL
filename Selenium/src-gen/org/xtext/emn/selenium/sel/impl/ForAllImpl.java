/**
 */
package org.xtext.emn.selenium.sel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.emn.selenium.sel.Elems;
import org.xtext.emn.selenium.sel.ForAll;
import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.SelPackage;
import org.xtext.emn.selenium.sel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.ForAllImpl#getElems <em>Elems</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.ForAllImpl#getIt <em>It</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.ForAllImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForAllImpl extends InstructionImpl implements ForAll
{
  /**
   * The cached value of the '{@link #getElems() <em>Elems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElems()
   * @generated
   * @ordered
   */
  protected Elems elems;

  /**
   * The cached value of the '{@link #getIt() <em>It</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIt()
   * @generated
   * @ordered
   */
  protected Variable it;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected EList<Instruction> body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForAllImpl()
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
    return SelPackage.Literals.FOR_ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elems getElems()
  {
    return elems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElems(Elems newElems, NotificationChain msgs)
  {
    Elems oldElems = elems;
    elems = newElems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.FOR_ALL__ELEMS, oldElems, newElems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElems(Elems newElems)
  {
    if (newElems != elems)
    {
      NotificationChain msgs = null;
      if (elems != null)
        msgs = ((InternalEObject)elems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.FOR_ALL__ELEMS, null, msgs);
      if (newElems != null)
        msgs = ((InternalEObject)newElems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.FOR_ALL__ELEMS, null, msgs);
      msgs = basicSetElems(newElems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.FOR_ALL__ELEMS, newElems, newElems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getIt()
  {
    return it;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIt(Variable newIt, NotificationChain msgs)
  {
    Variable oldIt = it;
    it = newIt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.FOR_ALL__IT, oldIt, newIt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIt(Variable newIt)
  {
    if (newIt != it)
    {
      NotificationChain msgs = null;
      if (it != null)
        msgs = ((InternalEObject)it).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.FOR_ALL__IT, null, msgs);
      if (newIt != null)
        msgs = ((InternalEObject)newIt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.FOR_ALL__IT, null, msgs);
      msgs = basicSetIt(newIt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.FOR_ALL__IT, newIt, newIt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instruction> getBody()
  {
    if (body == null)
    {
      body = new EObjectContainmentEList<Instruction>(Instruction.class, this, SelPackage.FOR_ALL__BODY);
    }
    return body;
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
      case SelPackage.FOR_ALL__ELEMS:
        return basicSetElems(null, msgs);
      case SelPackage.FOR_ALL__IT:
        return basicSetIt(null, msgs);
      case SelPackage.FOR_ALL__BODY:
        return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
      case SelPackage.FOR_ALL__ELEMS:
        return getElems();
      case SelPackage.FOR_ALL__IT:
        return getIt();
      case SelPackage.FOR_ALL__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelPackage.FOR_ALL__ELEMS:
        setElems((Elems)newValue);
        return;
      case SelPackage.FOR_ALL__IT:
        setIt((Variable)newValue);
        return;
      case SelPackage.FOR_ALL__BODY:
        getBody().clear();
        getBody().addAll((Collection<? extends Instruction>)newValue);
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
      case SelPackage.FOR_ALL__ELEMS:
        setElems((Elems)null);
        return;
      case SelPackage.FOR_ALL__IT:
        setIt((Variable)null);
        return;
      case SelPackage.FOR_ALL__BODY:
        getBody().clear();
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
      case SelPackage.FOR_ALL__ELEMS:
        return elems != null;
      case SelPackage.FOR_ALL__IT:
        return it != null;
      case SelPackage.FOR_ALL__BODY:
        return body != null && !body.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForAllImpl
