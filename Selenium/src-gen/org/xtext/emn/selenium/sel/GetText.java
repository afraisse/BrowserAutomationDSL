/**
 */
package org.xtext.emn.selenium.sel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.GetText#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.GetText#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getGetText()
 * @model
 * @generated
 */
public interface GetText extends Elem
{
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
   * @see org.xtext.emn.selenium.sel.SelPackage#getGetText_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.GetText#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see org.xtext.emn.selenium.sel.SelPackage#getGetText_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.GetText#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

} // GetText
