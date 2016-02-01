/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Test#getBrowser <em>Browser</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.Test#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends EObject
{
  /**
   * Returns the value of the '<em><b>Browser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Browser</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Browser</em>' attribute.
   * @see #setBrowser(String)
   * @see org.xtext.emn.selenium.sel.SelPackage#getTest_Browser()
   * @model
   * @generated
   */
  String getBrowser();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Test#getBrowser <em>Browser</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Browser</em>' attribute.
   * @see #getBrowser()
   * @generated
   */
  void setBrowser(String value);

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
   * @see org.xtext.emn.selenium.sel.SelPackage#getTest_Body()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getBody();

} // Test
