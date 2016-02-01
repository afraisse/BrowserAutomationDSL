/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.ForAll#getElems <em>Elems</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.ForAll#getIt <em>It</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.ForAll#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getForAll()
 * @model
 * @generated
 */
public interface ForAll extends Instruction
{
  /**
   * Returns the value of the '<em><b>Elems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elems</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elems</em>' containment reference.
   * @see #setElems(Elems)
   * @see org.xtext.emn.selenium.sel.SelPackage#getForAll_Elems()
   * @model containment="true"
   * @generated
   */
  Elems getElems();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.ForAll#getElems <em>Elems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elems</em>' containment reference.
   * @see #getElems()
   * @generated
   */
  void setElems(Elems value);

  /**
   * Returns the value of the '<em><b>It</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>It</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>It</em>' containment reference.
   * @see #setIt(Variable)
   * @see org.xtext.emn.selenium.sel.SelPackage#getForAll_It()
   * @model containment="true"
   * @generated
   */
  Variable getIt();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.ForAll#getIt <em>It</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>It</em>' containment reference.
   * @see #getIt()
   * @generated
   */
  void setIt(Variable value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.emn.selenium.sel.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.emn.selenium.sel.SelPackage#getForAll_Body()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getBody();

} // ForAll
