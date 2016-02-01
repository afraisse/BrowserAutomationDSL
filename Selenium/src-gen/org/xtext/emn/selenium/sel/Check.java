/**
 */
package org.xtext.emn.selenium.sel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Check#getCheckbox <em>Checkbox</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends Instruction
{
  /**
   * Returns the value of the '<em><b>Checkbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkbox</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkbox</em>' containment reference.
   * @see #setCheckbox(Elem)
   * @see org.xtext.emn.selenium.sel.SelPackage#getCheck_Checkbox()
   * @model containment="true"
   * @generated
   */
  Elem getCheckbox();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Check#getCheckbox <em>Checkbox</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checkbox</em>' containment reference.
   * @see #getCheckbox()
   * @generated
   */
  void setCheckbox(Elem value);

} // Check
