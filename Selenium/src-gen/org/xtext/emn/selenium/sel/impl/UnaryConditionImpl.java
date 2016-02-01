/**
 */
package org.xtext.emn.selenium.sel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.emn.selenium.sel.Elem;
import org.xtext.emn.selenium.sel.SelPackage;
import org.xtext.emn.selenium.sel.UnaryCondition;
import org.xtext.emn.selenium.sel.UnaryOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.UnaryConditionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.UnaryConditionImpl#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryConditionImpl extends ConditionImpl implements UnaryCondition
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final UnaryOp OP_EDEFAULT = UnaryOp.IS_CHECKED;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected UnaryOp op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getElem() <em>Elem</em>}' reference.
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
  protected UnaryConditionImpl()
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
    return SelPackage.Literals.UNARY_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(UnaryOp newOp)
  {
    UnaryOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.UNARY_CONDITION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elem getElem()
  {
    if (elem != null && elem.eIsProxy())
    {
      InternalEObject oldElem = (InternalEObject)elem;
      elem = (Elem)eResolveProxy(oldElem);
      if (elem != oldElem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelPackage.UNARY_CONDITION__ELEM, oldElem, elem));
      }
    }
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elem basicGetElem()
  {
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElem(Elem newElem)
  {
    Elem oldElem = elem;
    elem = newElem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.UNARY_CONDITION__ELEM, oldElem, elem));
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
      case SelPackage.UNARY_CONDITION__OP:
        return getOp();
      case SelPackage.UNARY_CONDITION__ELEM:
        if (resolve) return getElem();
        return basicGetElem();
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
      case SelPackage.UNARY_CONDITION__OP:
        setOp((UnaryOp)newValue);
        return;
      case SelPackage.UNARY_CONDITION__ELEM:
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
      case SelPackage.UNARY_CONDITION__OP:
        setOp(OP_EDEFAULT);
        return;
      case SelPackage.UNARY_CONDITION__ELEM:
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
      case SelPackage.UNARY_CONDITION__OP:
        return op != OP_EDEFAULT;
      case SelPackage.UNARY_CONDITION__ELEM:
        return elem != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //UnaryConditionImpl
