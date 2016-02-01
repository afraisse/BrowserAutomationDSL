/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Program#getSequences <em>Sequences</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.Program#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.emn.selenium.sel.Sequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequences</em>' containment reference list.
   * @see org.xtext.emn.selenium.sel.SelPackage#getProgram_Sequences()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getSequences();

  /**
   * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.emn.selenium.sel.Test}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tests</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tests</em>' containment reference list.
   * @see org.xtext.emn.selenium.sel.SelPackage#getProgram_Tests()
   * @model containment="true"
   * @generated
   */
  EList<Test> getTests();

} // Program
