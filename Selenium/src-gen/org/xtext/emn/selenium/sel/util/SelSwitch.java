/**
 */
package org.xtext.emn.selenium.sel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.emn.selenium.sel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.emn.selenium.sel.SelPackage
 * @generated
 */
public class SelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SelPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.TEST:
      {
        Test test = (Test)theEObject;
        T result = caseTest(test);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = caseInstruction(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseElem(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.FOR_ALL:
      {
        ForAll forAll = (ForAll)theEObject;
        T result = caseForAll(forAll);
        if (result == null) result = caseInstruction(forAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.DO_WHILE:
      {
        DoWhile doWhile = (DoWhile)theEObject;
        T result = caseDoWhile(doWhile);
        if (result == null) result = caseInstruction(doWhile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.IF_THEN_ELSE:
      {
        IfThenElse ifThenElse = (IfThenElse)theEObject;
        T result = caseIfThenElse(ifThenElse);
        if (result == null) result = caseInstruction(ifThenElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.AFFECTATION:
      {
        Affectation affectation = (Affectation)theEObject;
        T result = caseAffectation(affectation);
        if (result == null) result = caseInstruction(affectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.EXEC:
      {
        Exec exec = (Exec)theEObject;
        T result = caseExec(exec);
        if (result == null) result = caseInstruction(exec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.FILL:
      {
        Fill fill = (Fill)theEObject;
        T result = caseFill(fill);
        if (result == null) result = caseInstruction(fill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.CHECK:
      {
        Check check = (Check)theEObject;
        T result = caseCheck(check);
        if (result == null) result = caseInstruction(check);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.CLICK:
      {
        Click click = (Click)theEObject;
        T result = caseClick(click);
        if (result == null) result = caseInstruction(click);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.VERIFY:
      {
        Verify verify = (Verify)theEObject;
        T result = caseVerify(verify);
        if (result == null) result = caseInstruction(verify);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GO_TO:
      {
        GoTo goTo = (GoTo)theEObject;
        T result = caseGoTo(goTo);
        if (result == null) result = caseInstruction(goTo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.UNARY_CONDITION:
      {
        UnaryCondition unaryCondition = (UnaryCondition)theEObject;
        T result = caseUnaryCondition(unaryCondition);
        if (result == null) result = caseCondition(unaryCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.BINARY_CONDITION:
      {
        BinaryCondition binaryCondition = (BinaryCondition)theEObject;
        T result = caseBinaryCondition(binaryCondition);
        if (result == null) result = caseCondition(binaryCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.ELEM:
      {
        Elem elem = (Elem)theEObject;
        T result = caseElem(elem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_BUTTON:
      {
        GetButton getButton = (GetButton)theEObject;
        T result = caseGetButton(getButton);
        if (result == null) result = caseElem(getButton);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_LINK:
      {
        GetLink getLink = (GetLink)theEObject;
        T result = caseGetLink(getLink);
        if (result == null) result = caseElem(getLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_CHECKBOX:
      {
        GetCheckbox getCheckbox = (GetCheckbox)theEObject;
        T result = caseGetCheckbox(getCheckbox);
        if (result == null) result = caseElem(getCheckbox);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_TEXT:
      {
        GetText getText = (GetText)theEObject;
        T result = caseGetText(getText);
        if (result == null) result = caseElem(getText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.ELEMS:
      {
        Elems elems = (Elems)theEObject;
        T result = caseElems(elems);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_BUTTONS:
      {
        GetButtons getButtons = (GetButtons)theEObject;
        T result = caseGetButtons(getButtons);
        if (result == null) result = caseElems(getButtons);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_CHECKBOXES:
      {
        GetCheckboxes getCheckboxes = (GetCheckboxes)theEObject;
        T result = caseGetCheckboxes(getCheckboxes);
        if (result == null) result = caseElems(getCheckboxes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SelPackage.GET_LINKS:
      {
        GetLinks getLinks = (GetLinks)theEObject;
        T result = caseGetLinks(getLinks);
        if (result == null) result = caseElems(getLinks);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTest(Test object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForAll(ForAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWhile(DoWhile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElse(IfThenElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectation(Affectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExec(Exec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFill(Fill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheck(Check object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClick(Click object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verify</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verify</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerify(Verify object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoTo(GoTo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryCondition(UnaryCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryCondition(BinaryCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elem</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elem</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElem(Elem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetButton(GetButton object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetLink(GetLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Checkbox</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Checkbox</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetCheckbox(GetCheckbox object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetText(GetText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Elems</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Elems</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElems(Elems object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Buttons</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Buttons</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetButtons(GetButtons object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Checkboxes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Checkboxes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetCheckboxes(GetCheckboxes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Links</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Links</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetLinks(GetLinks object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SelSwitch
