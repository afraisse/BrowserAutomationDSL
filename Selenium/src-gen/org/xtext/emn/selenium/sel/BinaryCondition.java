/**
 */
package org.xtext.emn.selenium.sel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.BinaryCondition#getElem <em>Elem</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.BinaryCondition#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.BinaryCondition#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.BinaryCondition#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getBinaryCondition()
 * @model
 * @generated
 */
public interface BinaryCondition extends Condition
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference.
   * @see #setElem(Elem)
   * @see org.xtext.emn.selenium.sel.SelPackage#getBinaryCondition_Elem()
   * @model containment="true"
   * @generated
   */
  Elem getElem();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.BinaryCondition#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Elem value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.emn.selenium.sel.BinaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.xtext.emn.selenium.sel.BinaryOp
   * @see #setOp(BinaryOp)
   * @see org.xtext.emn.selenium.sel.SelPackage#getBinaryCondition_Op()
   * @model
   * @generated
   */
  BinaryOp getOp();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.BinaryCondition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.xtext.emn.selenium.sel.BinaryOp
   * @see #getOp()
   * @generated
   */
  void setOp(BinaryOp value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.emn.selenium.sel.SelPackage#getBinaryCondition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.BinaryCondition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(Variable)
   * @see org.xtext.emn.selenium.sel.SelPackage#getBinaryCondition_Param()
   * @model
   * @generated
   */
  Variable getParam();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.BinaryCondition#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Variable value);

} // BinaryCondition
