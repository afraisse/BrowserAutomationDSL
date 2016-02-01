/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Exec#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.Exec#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getExec()
 * @model
 * @generated
 */
public interface Exec extends Instruction
{
  /**
   * Returns the value of the '<em><b>Sequence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' reference.
   * @see #setSequence(Sequence)
   * @see org.xtext.emn.selenium.sel.SelPackage#getExec_Sequence()
   * @model
   * @generated
   */
  Sequence getSequence();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Exec#getSequence <em>Sequence</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequence</em>' reference.
   * @see #getSequence()
   * @generated
   */
  void setSequence(Sequence value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' attribute list.
   * @see org.xtext.emn.selenium.sel.SelPackage#getExec_Params()
   * @model unique="false"
   * @generated
   */
  EList<String> getParams();

} // Exec
