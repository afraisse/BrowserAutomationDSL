/**
 */
package org.xtext.emn.selenium.sel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.emn.selenium.sel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelFactoryImpl extends EFactoryImpl implements SelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SelFactory init()
  {
    try
    {
      SelFactory theSelFactory = (SelFactory)EPackage.Registry.INSTANCE.getEFactory(SelPackage.eNS_URI);
      if (theSelFactory != null)
      {
        return theSelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SelPackage.PROGRAM: return createProgram();
      case SelPackage.TEST: return createTest();
      case SelPackage.SEQUENCE: return createSequence();
      case SelPackage.VARIABLE: return createVariable();
      case SelPackage.INSTRUCTION: return createInstruction();
      case SelPackage.FOR_ALL: return createForAll();
      case SelPackage.DO_WHILE: return createDoWhile();
      case SelPackage.IF_THEN_ELSE: return createIfThenElse();
      case SelPackage.AFFECTATION: return createAffectation();
      case SelPackage.EXEC: return createExec();
      case SelPackage.FILL: return createFill();
      case SelPackage.CHECK: return createCheck();
      case SelPackage.CLICK: return createClick();
      case SelPackage.VERIFY: return createVerify();
      case SelPackage.GO_TO: return createGoTo();
      case SelPackage.CONDITION: return createCondition();
      case SelPackage.UNARY_CONDITION: return createUnaryCondition();
      case SelPackage.BINARY_CONDITION: return createBinaryCondition();
      case SelPackage.ELEM: return createElem();
      case SelPackage.GET_BUTTON: return createGetButton();
      case SelPackage.GET_LINK: return createGetLink();
      case SelPackage.GET_CHECKBOX: return createGetCheckbox();
      case SelPackage.GET_TEXT: return createGetText();
      case SelPackage.ELEMS: return createElems();
      case SelPackage.GET_BUTTONS: return createGetButtons();
      case SelPackage.GET_CHECKBOXES: return createGetCheckboxes();
      case SelPackage.GET_LINKS: return createGetLinks();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SelPackage.BINARY_OP:
        return createBinaryOpFromString(eDataType, initialValue);
      case SelPackage.UNARY_OP:
        return createUnaryOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SelPackage.BINARY_OP:
        return convertBinaryOpToString(eDataType, instanceValue);
      case SelPackage.UNARY_OP:
        return convertUnaryOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Test createTest()
  {
    TestImpl test = new TestImpl();
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForAll createForAll()
  {
    ForAllImpl forAll = new ForAllImpl();
    return forAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoWhile createDoWhile()
  {
    DoWhileImpl doWhile = new DoWhileImpl();
    return doWhile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElse createIfThenElse()
  {
    IfThenElseImpl ifThenElse = new IfThenElseImpl();
    return ifThenElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation createAffectation()
  {
    AffectationImpl affectation = new AffectationImpl();
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exec createExec()
  {
    ExecImpl exec = new ExecImpl();
    return exec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill createFill()
  {
    FillImpl fill = new FillImpl();
    return fill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check createCheck()
  {
    CheckImpl check = new CheckImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Click createClick()
  {
    ClickImpl click = new ClickImpl();
    return click;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verify createVerify()
  {
    VerifyImpl verify = new VerifyImpl();
    return verify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoTo createGoTo()
  {
    GoToImpl goTo = new GoToImpl();
    return goTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryCondition createUnaryCondition()
  {
    UnaryConditionImpl unaryCondition = new UnaryConditionImpl();
    return unaryCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryCondition createBinaryCondition()
  {
    BinaryConditionImpl binaryCondition = new BinaryConditionImpl();
    return binaryCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elem createElem()
  {
    ElemImpl elem = new ElemImpl();
    return elem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetButton createGetButton()
  {
    GetButtonImpl getButton = new GetButtonImpl();
    return getButton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetLink createGetLink()
  {
    GetLinkImpl getLink = new GetLinkImpl();
    return getLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetCheckbox createGetCheckbox()
  {
    GetCheckboxImpl getCheckbox = new GetCheckboxImpl();
    return getCheckbox;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetText createGetText()
  {
    GetTextImpl getText = new GetTextImpl();
    return getText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elems createElems()
  {
    ElemsImpl elems = new ElemsImpl();
    return elems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetButtons createGetButtons()
  {
    GetButtonsImpl getButtons = new GetButtonsImpl();
    return getButtons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetCheckboxes createGetCheckboxes()
  {
    GetCheckboxesImpl getCheckboxes = new GetCheckboxesImpl();
    return getCheckboxes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetLinks createGetLinks()
  {
    GetLinksImpl getLinks = new GetLinksImpl();
    return getLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOp createBinaryOpFromString(EDataType eDataType, String initialValue)
  {
    BinaryOp result = BinaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOp createUnaryOpFromString(EDataType eDataType, String initialValue)
  {
    UnaryOp result = UnaryOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelPackage getSelPackage()
  {
    return (SelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SelPackage getPackage()
  {
    return SelPackage.eINSTANCE;
  }

} //SelFactoryImpl
