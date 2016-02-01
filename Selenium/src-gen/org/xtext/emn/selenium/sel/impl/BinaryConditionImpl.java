/**
 */
package org.xtext.emn.selenium.sel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.emn.selenium.sel.BinaryCondition;
import org.xtext.emn.selenium.sel.BinaryOp;
import org.xtext.emn.selenium.sel.Elem;
import org.xtext.emn.selenium.sel.SelPackage;
import org.xtext.emn.selenium.sel.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryConditionImpl extends ConditionImpl implements BinaryCondition
{
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
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final BinaryOp OP_EDEFAULT = BinaryOp.CONTAINS;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected BinaryOp op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected Variable param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryConditionImpl()
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
    return SelPackage.Literals.BINARY_CONDITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelPackage.BINARY_CONDITION__ELEM, oldElem, newElem);
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
        msgs = ((InternalEObject)elem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelPackage.BINARY_CONDITION__ELEM, null, msgs);
      if (newElem != null)
        msgs = ((InternalEObject)newElem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelPackage.BINARY_CONDITION__ELEM, null, msgs);
      msgs = basicSetElem(newElem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.BINARY_CONDITION__ELEM, newElem, newElem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(BinaryOp newOp)
  {
    BinaryOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.BINARY_CONDITION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.BINARY_CONDITION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (Variable)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelPackage.BINARY_CONDITION__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Variable newParam)
  {
    Variable oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelPackage.BINARY_CONDITION__PARAM, oldParam, param));
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
      case SelPackage.BINARY_CONDITION__ELEM:
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
      case SelPackage.BINARY_CONDITION__ELEM:
        return getElem();
      case SelPackage.BINARY_CONDITION__OP:
        return getOp();
      case SelPackage.BINARY_CONDITION__VALUE:
        return getValue();
      case SelPackage.BINARY_CONDITION__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
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
      case SelPackage.BINARY_CONDITION__ELEM:
        setElem((Elem)newValue);
        return;
      case SelPackage.BINARY_CONDITION__OP:
        setOp((BinaryOp)newValue);
        return;
      case SelPackage.BINARY_CONDITION__VALUE:
        setValue((String)newValue);
        return;
      case SelPackage.BINARY_CONDITION__PARAM:
        setParam((Variable)newValue);
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
      case SelPackage.BINARY_CONDITION__ELEM:
        setElem((Elem)null);
        return;
      case SelPackage.BINARY_CONDITION__OP:
        setOp(OP_EDEFAULT);
        return;
      case SelPackage.BINARY_CONDITION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case SelPackage.BINARY_CONDITION__PARAM:
        setParam((Variable)null);
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
      case SelPackage.BINARY_CONDITION__ELEM:
        return elem != null;
      case SelPackage.BINARY_CONDITION__OP:
        return op != OP_EDEFAULT;
      case SelPackage.BINARY_CONDITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case SelPackage.BINARY_CONDITION__PARAM:
        return param != null;
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
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //BinaryConditionImpl
