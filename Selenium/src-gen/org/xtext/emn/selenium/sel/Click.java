/**
 */
package org.xtext.emn.selenium.sel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Click#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getClick()
 * @model
 * @generated
 */
public interface Click extends Instruction
{
  /**
   * Returns the value of the '<em><b>Elem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem</em>' reference.
   * @see #setElem(Elem)
   * @see org.xtext.emn.selenium.sel.SelPackage#getClick_Elem()
   * @model
   * @generated
   */
  Elem getElem();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Click#getElem <em>Elem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Elem value);

} // Click
