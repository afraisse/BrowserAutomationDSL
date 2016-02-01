/**
 */
package org.xtext.emn.selenium.sel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.emn.selenium.sel.Affectation#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.emn.selenium.sel.Affectation#getElem <em>Elem</em>}</li>
 * </ul>
 *
 * @see org.xtext.emn.selenium.sel.SelPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends Instruction
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.emn.selenium.sel.SelPackage#getAffectation_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Affectation#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

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
   * @see org.xtext.emn.selenium.sel.SelPackage#getAffectation_Elem()
   * @model containment="true"
   * @generated
   */
  Elem getElem();

  /**
   * Sets the value of the '{@link org.xtext.emn.selenium.sel.Affectation#getElem <em>Elem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem</em>' containment reference.
   * @see #getElem()
   * @generated
   */
  void setElem(Elem value);

} // Affectation
