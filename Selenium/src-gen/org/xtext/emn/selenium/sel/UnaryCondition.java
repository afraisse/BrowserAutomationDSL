/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.UnaryCondition#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.UnaryCondition#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getUnaryCondition()
 * @model
 * @generated
 */
public interface UnaryCondition extends Condition
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.emn.selenium.sel.UnaryOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.xtext.emn.selenium.sel.UnaryOp
   * @see #setOp(UnaryOp)
   * @see org.xtext.emn.selenium.sel.SelPackage#getUnaryCondition_Op()
   * @model
   * @generated
   */
  UnaryOp getOp();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.UnaryCondition#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.xtext.emn.selenium.sel.UnaryOp
   * @see #getOp()
   * @generated
   */
  void setOp(UnaryOp value);

  /**
   * Returns the value of the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' containment reference.
   * @see #setElem(EObject)
   * @see org.xtext.emn.selenium.sel.SelPackage#getUnaryCondition_Elem()
   * @model containment="true"
   * @generated
   */
  EObject getElem();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.UnaryCondition#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(EObject value);

} // UnaryCondition
