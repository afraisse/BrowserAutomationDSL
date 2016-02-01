/**
 */
package org.xtext.emn.selenium.sel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.emn.selenium.sel.SelFactory
 * @model kind="package"
 * @generated
 */
public interface SelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/emn/selenium/SEL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SelPackage eINSTANCE = org.xtext.emn.selenium.sel.impl.SelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ProgramImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SEQUENCES = 0;

  /**
   * The feature id for the '<em><b>Tests</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__TESTS = 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.TestImpl <em>Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.TestImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getTest()
   * @generated
   */
  int TEST = 1;

  /**
   * The feature id for the '<em><b>Browser</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__BROWSER = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST__BODY = 1;

  /**
   * The number of structural features of the '<em>Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.InstructionImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 4;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.SequenceImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__NAME = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__PARAMETERS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__BODY = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.VariableImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ForAllImpl <em>For All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ForAllImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getForAll()
   * @generated
   */
  int FOR_ALL = 5;

  /**
   * The feature id for the '<em><b>Elems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__ELEMS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>It</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__IT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL__BODY = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.DoWhileImpl <em>Do While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.DoWhileImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getDoWhile()
   * @generated
   */
  int DO_WHILE = 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE__BODY = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE__CONDITION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_WHILE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.IfThenElseImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.AffectationImpl <em>Affectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.AffectationImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getAffectation()
   * @generated
   */
  int AFFECTATION = 8;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__ELEM = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Affectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ExecImpl <em>Exec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ExecImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getExec()
   * @generated
   */
  int EXEC = 9;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__SEQUENCE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC__PARAMS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.FillImpl <em>Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.FillImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getFill()
   * @generated
   */
  int FILL = 10;

  /**
   * The feature id for the '<em><b>Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__FIELD = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL__PARAM = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.CheckImpl <em>Check</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.CheckImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getCheck()
   * @generated
   */
  int CHECK = 11;

  /**
   * The feature id for the '<em><b>Checkbox</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHECKBOX = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Check</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ClickImpl <em>Click</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ClickImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getClick()
   * @generated
   */
  int CLICK = 12;

  /**
   * The feature id for the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK__ELEM = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Click</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLICK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.VerifyImpl <em>Verify</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.VerifyImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getVerify()
   * @generated
   */
  int VERIFY = 13;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verify</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GoToImpl <em>Go To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GoToImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGoTo()
   * @generated
   */
  int GO_TO = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO__LINK = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Go To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GO_TO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ConditionImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 15;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.UnaryConditionImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getUnaryCondition()
   * @generated
   */
  int UNARY_CONDITION = 16;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__OP = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__ELEM = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.BinaryConditionImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getBinaryCondition()
   * @generated
   */
  int BINARY_CONDITION = 17;

  /**
   * The feature id for the '<em><b>Elem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__ELEM = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__OP = CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION__PARAM = CONDITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Binary Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ElemImpl <em>Elem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ElemImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getElem()
   * @generated
   */
  int ELEM = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM__VALUE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM__VAR = 1;

  /**
   * The number of structural features of the '<em>Elem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetButtonImpl <em>Get Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetButtonImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetButton()
   * @generated
   */
  int GET_BUTTON = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTON__VALUE = ELEM__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTON__VAR = ELEM__VAR;

  /**
   * The number of structural features of the '<em>Get Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTON_FEATURE_COUNT = ELEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetLinkImpl <em>Get Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetLinkImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetLink()
   * @generated
   */
  int GET_LINK = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINK__VALUE = ELEM__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINK__VAR = ELEM__VAR;

  /**
   * The number of structural features of the '<em>Get Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINK_FEATURE_COUNT = ELEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetCheckboxImpl <em>Get Checkbox</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetCheckboxImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetCheckbox()
   * @generated
   */
  int GET_CHECKBOX = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOX__VALUE = ELEM__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOX__VAR = ELEM__VAR;

  /**
   * The number of structural features of the '<em>Get Checkbox</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOX_FEATURE_COUNT = ELEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetTextImpl <em>Get Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetTextImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetText()
   * @generated
   */
  int GET_TEXT = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_TEXT__VALUE = ELEM__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_TEXT__VAR = ELEM__VAR;

  /**
   * The number of structural features of the '<em>Get Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_TEXT_FEATURE_COUNT = ELEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.ElemsImpl <em>Elems</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.ElemsImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getElems()
   * @generated
   */
  int ELEMS = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMS__VALUE = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMS__VAR = 1;

  /**
   * The number of structural features of the '<em>Elems</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetButtonsImpl <em>Get Buttons</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetButtonsImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetButtons()
   * @generated
   */
  int GET_BUTTONS = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTONS__VALUE = ELEMS__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTONS__VAR = ELEMS__VAR;

  /**
   * The number of structural features of the '<em>Get Buttons</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_BUTTONS_FEATURE_COUNT = ELEMS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetCheckboxesImpl <em>Get Checkboxes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetCheckboxesImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetCheckboxes()
   * @generated
   */
  int GET_CHECKBOXES = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOXES__VALUE = ELEMS__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOXES__VAR = ELEMS__VAR;

  /**
   * The number of structural features of the '<em>Get Checkboxes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_CHECKBOXES_FEATURE_COUNT = ELEMS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.impl.GetLinksImpl <em>Get Links</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.impl.GetLinksImpl
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetLinks()
   * @generated
   */
  int GET_LINKS = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINKS__VALUE = ELEMS__VALUE;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINKS__VAR = ELEMS__VAR;

  /**
   * The number of structural features of the '<em>Get Links</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_LINKS_FEATURE_COUNT = ELEMS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.BinaryOp <em>Binary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.BinaryOp
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getBinaryOp()
   * @generated
   */
  int BINARY_OP = 27;

  /**
   * The meta object id for the '{@link org.xtext.emn.selenium.sel.UnaryOp <em>Unary Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.emn.selenium.sel.UnaryOp
   * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getUnaryOp()
   * @generated
   */
  int UNARY_OP = 28;


  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.emn.selenium.sel.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.Program#getSequences <em>Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequences</em>'.
   * @see org.xtext.emn.selenium.sel.Program#getSequences()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Sequences();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.Program#getTests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tests</em>'.
   * @see org.xtext.emn.selenium.sel.Program#getTests()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Tests();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Test <em>Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test</em>'.
   * @see org.xtext.emn.selenium.sel.Test
   * @generated
   */
  EClass getTest();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Test#getBrowser <em>Browser</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Browser</em>'.
   * @see org.xtext.emn.selenium.sel.Test#getBrowser()
   * @see #getTest()
   * @generated
   */
  EAttribute getTest_Browser();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.Test#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.emn.selenium.sel.Test#getBody()
   * @see #getTest()
   * @generated
   */
  EReference getTest_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see org.xtext.emn.selenium.sel.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Sequence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.emn.selenium.sel.Sequence#getName()
   * @see #getSequence()
   * @generated
   */
  EAttribute getSequence_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.Sequence#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.emn.selenium.sel.Sequence#getParameters()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.Sequence#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.emn.selenium.sel.Sequence#getBody()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.xtext.emn.selenium.sel.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.emn.selenium.sel.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.xtext.emn.selenium.sel.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.ForAll <em>For All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For All</em>'.
   * @see org.xtext.emn.selenium.sel.ForAll
   * @generated
   */
  EClass getForAll();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.ForAll#getElems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elems</em>'.
   * @see org.xtext.emn.selenium.sel.ForAll#getElems()
   * @see #getForAll()
   * @generated
   */
  EReference getForAll_Elems();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.ForAll#getIt <em>It</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>It</em>'.
   * @see org.xtext.emn.selenium.sel.ForAll#getIt()
   * @see #getForAll()
   * @generated
   */
  EReference getForAll_It();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.ForAll#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.emn.selenium.sel.ForAll#getBody()
   * @see #getForAll()
   * @generated
   */
  EReference getForAll_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.DoWhile <em>Do While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do While</em>'.
   * @see org.xtext.emn.selenium.sel.DoWhile
   * @generated
   */
  EClass getDoWhile();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.DoWhile#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Body</em>'.
   * @see org.xtext.emn.selenium.sel.DoWhile#getBody()
   * @see #getDoWhile()
   * @generated
   */
  EReference getDoWhile_Body();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.DoWhile#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.emn.selenium.sel.DoWhile#getCondition()
   * @see #getDoWhile()
   * @generated
   */
  EReference getDoWhile_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.xtext.emn.selenium.sel.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.emn.selenium.sel.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.IfThenElse#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Then</em>'.
   * @see org.xtext.emn.selenium.sel.IfThenElse#getThen()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Then();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.emn.selenium.sel.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else</em>'.
   * @see org.xtext.emn.selenium.sel.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affectation</em>'.
   * @see org.xtext.emn.selenium.sel.Affectation
   * @generated
   */
  EClass getAffectation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.Affectation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.emn.selenium.sel.Affectation#getVariable()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.Affectation#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem</em>'.
   * @see org.xtext.emn.selenium.sel.Affectation#getElem()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_Elem();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Exec <em>Exec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec</em>'.
   * @see org.xtext.emn.selenium.sel.Exec
   * @generated
   */
  EClass getExec();

  /**
   * Returns the meta object for the reference '{@link org.xtext.emn.selenium.sel.Exec#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sequence</em>'.
   * @see org.xtext.emn.selenium.sel.Exec#getSequence()
   * @see #getExec()
   * @generated
   */
  EReference getExec_Sequence();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.emn.selenium.sel.Exec#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see org.xtext.emn.selenium.sel.Exec#getParams()
   * @see #getExec()
   * @generated
   */
  EAttribute getExec_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Fill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fill</em>'.
   * @see org.xtext.emn.selenium.sel.Fill
   * @generated
   */
  EClass getFill();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Fill#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field</em>'.
   * @see org.xtext.emn.selenium.sel.Fill#getField()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Field();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Fill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.emn.selenium.sel.Fill#getValue()
   * @see #getFill()
   * @generated
   */
  EAttribute getFill_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.emn.selenium.sel.Fill#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see org.xtext.emn.selenium.sel.Fill#getParam()
   * @see #getFill()
   * @generated
   */
  EReference getFill_Param();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Check <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Check</em>'.
   * @see org.xtext.emn.selenium.sel.Check
   * @generated
   */
  EClass getCheck();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.Check#getCheckbox <em>Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Checkbox</em>'.
   * @see org.xtext.emn.selenium.sel.Check#getCheckbox()
   * @see #getCheck()
   * @generated
   */
  EReference getCheck_Checkbox();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Click <em>Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Click</em>'.
   * @see org.xtext.emn.selenium.sel.Click
   * @generated
   */
  EClass getClick();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.Click#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem</em>'.
   * @see org.xtext.emn.selenium.sel.Click#getElem()
   * @see #getClick()
   * @generated
   */
  EReference getClick_Elem();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Verify <em>Verify</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify</em>'.
   * @see org.xtext.emn.selenium.sel.Verify
   * @generated
   */
  EClass getVerify();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.Verify#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.emn.selenium.sel.Verify#getCondition()
   * @see #getVerify()
   * @generated
   */
  EReference getVerify_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Go To</em>'.
   * @see org.xtext.emn.selenium.sel.GoTo
   * @generated
   */
  EClass getGoTo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.GoTo#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.emn.selenium.sel.GoTo#getValue()
   * @see #getGoTo()
   * @generated
   */
  EAttribute getGoTo_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.GoTo#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see org.xtext.emn.selenium.sel.GoTo#getLink()
   * @see #getGoTo()
   * @generated
   */
  EReference getGoTo_Link();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.xtext.emn.selenium.sel.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.UnaryCondition <em>Unary Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Condition</em>'.
   * @see org.xtext.emn.selenium.sel.UnaryCondition
   * @generated
   */
  EClass getUnaryCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.UnaryCondition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.emn.selenium.sel.UnaryCondition#getOp()
   * @see #getUnaryCondition()
   * @generated
   */
  EAttribute getUnaryCondition_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.UnaryCondition#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem</em>'.
   * @see org.xtext.emn.selenium.sel.UnaryCondition#getElem()
   * @see #getUnaryCondition()
   * @generated
   */
  EReference getUnaryCondition_Elem();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.BinaryCondition <em>Binary Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Condition</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryCondition
   * @generated
   */
  EClass getBinaryCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.emn.selenium.sel.BinaryCondition#getElem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elem</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryCondition#getElem()
   * @see #getBinaryCondition()
   * @generated
   */
  EReference getBinaryCondition_Elem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.BinaryCondition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryCondition#getOp()
   * @see #getBinaryCondition()
   * @generated
   */
  EAttribute getBinaryCondition_Op();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.BinaryCondition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryCondition#getValue()
   * @see #getBinaryCondition()
   * @generated
   */
  EAttribute getBinaryCondition_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.emn.selenium.sel.BinaryCondition#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryCondition#getParam()
   * @see #getBinaryCondition()
   * @generated
   */
  EReference getBinaryCondition_Param();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Elem <em>Elem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elem</em>'.
   * @see org.xtext.emn.selenium.sel.Elem
   * @generated
   */
  EClass getElem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Elem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.emn.selenium.sel.Elem#getValue()
   * @see #getElem()
   * @generated
   */
  EAttribute getElem_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.emn.selenium.sel.Elem#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.emn.selenium.sel.Elem#getVar()
   * @see #getElem()
   * @generated
   */
  EReference getElem_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetButton <em>Get Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Button</em>'.
   * @see org.xtext.emn.selenium.sel.GetButton
   * @generated
   */
  EClass getGetButton();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetLink <em>Get Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Link</em>'.
   * @see org.xtext.emn.selenium.sel.GetLink
   * @generated
   */
  EClass getGetLink();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetCheckbox <em>Get Checkbox</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Checkbox</em>'.
   * @see org.xtext.emn.selenium.sel.GetCheckbox
   * @generated
   */
  EClass getGetCheckbox();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetText <em>Get Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Text</em>'.
   * @see org.xtext.emn.selenium.sel.GetText
   * @generated
   */
  EClass getGetText();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.Elems <em>Elems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elems</em>'.
   * @see org.xtext.emn.selenium.sel.Elems
   * @generated
   */
  EClass getElems();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.emn.selenium.sel.Elems#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.emn.selenium.sel.Elems#getValue()
   * @see #getElems()
   * @generated
   */
  EAttribute getElems_Value();

  /**
   * Returns the meta object for the reference '{@link org.xtext.emn.selenium.sel.Elems#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.xtext.emn.selenium.sel.Elems#getVar()
   * @see #getElems()
   * @generated
   */
  EReference getElems_Var();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetButtons <em>Get Buttons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Buttons</em>'.
   * @see org.xtext.emn.selenium.sel.GetButtons
   * @generated
   */
  EClass getGetButtons();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetCheckboxes <em>Get Checkboxes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Checkboxes</em>'.
   * @see org.xtext.emn.selenium.sel.GetCheckboxes
   * @generated
   */
  EClass getGetCheckboxes();

  /**
   * Returns the meta object for class '{@link org.xtext.emn.selenium.sel.GetLinks <em>Get Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Links</em>'.
   * @see org.xtext.emn.selenium.sel.GetLinks
   * @generated
   */
  EClass getGetLinks();

  /**
   * Returns the meta object for enum '{@link org.xtext.emn.selenium.sel.BinaryOp <em>Binary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Op</em>'.
   * @see org.xtext.emn.selenium.sel.BinaryOp
   * @generated
   */
  EEnum getBinaryOp();

  /**
   * Returns the meta object for enum '{@link org.xtext.emn.selenium.sel.UnaryOp <em>Unary Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Op</em>'.
   * @see org.xtext.emn.selenium.sel.UnaryOp
   * @generated
   */
  EEnum getUnaryOp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SelFactory getSelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ProgramImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SEQUENCES = eINSTANCE.getProgram_Sequences();

    /**
     * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__TESTS = eINSTANCE.getProgram_Tests();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.TestImpl <em>Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.TestImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getTest()
     * @generated
     */
    EClass TEST = eINSTANCE.getTest();

    /**
     * The meta object literal for the '<em><b>Browser</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST__BROWSER = eINSTANCE.getTest_Browser();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST__BODY = eINSTANCE.getTest_Body();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.SequenceImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__PARAMETERS = eINSTANCE.getSequence_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__BODY = eINSTANCE.getSequence_Body();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.VariableImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.InstructionImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ForAllImpl <em>For All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ForAllImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getForAll()
     * @generated
     */
    EClass FOR_ALL = eINSTANCE.getForAll();

    /**
     * The meta object literal for the '<em><b>Elems</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ALL__ELEMS = eINSTANCE.getForAll_Elems();

    /**
     * The meta object literal for the '<em><b>It</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ALL__IT = eINSTANCE.getForAll_It();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ALL__BODY = eINSTANCE.getForAll_Body();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.DoWhileImpl <em>Do While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.DoWhileImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getDoWhile()
     * @generated
     */
    EClass DO_WHILE = eINSTANCE.getDoWhile();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE__BODY = eINSTANCE.getDoWhile_Body();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_WHILE__CONDITION = eINSTANCE.getDoWhile_Condition();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.IfThenElseImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.AffectationImpl <em>Affectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.AffectationImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getAffectation()
     * @generated
     */
    EClass AFFECTATION = eINSTANCE.getAffectation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__VARIABLE = eINSTANCE.getAffectation_Variable();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__ELEM = eINSTANCE.getAffectation_Elem();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ExecImpl <em>Exec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ExecImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getExec()
     * @generated
     */
    EClass EXEC = eINSTANCE.getExec();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC__SEQUENCE = eINSTANCE.getExec_Sequence();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC__PARAMS = eINSTANCE.getExec_Params();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.FillImpl <em>Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.FillImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getFill()
     * @generated
     */
    EClass FILL = eINSTANCE.getFill();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__FIELD = eINSTANCE.getFill_Field();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILL__VALUE = eINSTANCE.getFill_Value();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILL__PARAM = eINSTANCE.getFill_Param();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.CheckImpl <em>Check</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.CheckImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getCheck()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCheck();

    /**
     * The meta object literal for the '<em><b>Checkbox</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHECK__CHECKBOX = eINSTANCE.getCheck_Checkbox();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ClickImpl <em>Click</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ClickImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getClick()
     * @generated
     */
    EClass CLICK = eINSTANCE.getClick();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLICK__ELEM = eINSTANCE.getClick_Elem();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.VerifyImpl <em>Verify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.VerifyImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getVerify()
     * @generated
     */
    EClass VERIFY = eINSTANCE.getVerify();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY__CONDITION = eINSTANCE.getVerify_Condition();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GoToImpl <em>Go To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GoToImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGoTo()
     * @generated
     */
    EClass GO_TO = eINSTANCE.getGoTo();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GO_TO__VALUE = eINSTANCE.getGoTo_Value();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GO_TO__LINK = eINSTANCE.getGoTo_Link();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ConditionImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.UnaryConditionImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getUnaryCondition()
     * @generated
     */
    EClass UNARY_CONDITION = eINSTANCE.getUnaryCondition();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_CONDITION__OP = eINSTANCE.getUnaryCondition_Op();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_CONDITION__ELEM = eINSTANCE.getUnaryCondition_Elem();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.BinaryConditionImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getBinaryCondition()
     * @generated
     */
    EClass BINARY_CONDITION = eINSTANCE.getBinaryCondition();

    /**
     * The meta object literal for the '<em><b>Elem</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_CONDITION__ELEM = eINSTANCE.getBinaryCondition_Elem();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_CONDITION__OP = eINSTANCE.getBinaryCondition_Op();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_CONDITION__VALUE = eINSTANCE.getBinaryCondition_Value();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_CONDITION__PARAM = eINSTANCE.getBinaryCondition_Param();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ElemImpl <em>Elem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ElemImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getElem()
     * @generated
     */
    EClass ELEM = eINSTANCE.getElem();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEM__VALUE = eINSTANCE.getElem_Value();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEM__VAR = eINSTANCE.getElem_Var();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetButtonImpl <em>Get Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetButtonImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetButton()
     * @generated
     */
    EClass GET_BUTTON = eINSTANCE.getGetButton();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetLinkImpl <em>Get Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetLinkImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetLink()
     * @generated
     */
    EClass GET_LINK = eINSTANCE.getGetLink();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetCheckboxImpl <em>Get Checkbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetCheckboxImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetCheckbox()
     * @generated
     */
    EClass GET_CHECKBOX = eINSTANCE.getGetCheckbox();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetTextImpl <em>Get Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetTextImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetText()
     * @generated
     */
    EClass GET_TEXT = eINSTANCE.getGetText();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.ElemsImpl <em>Elems</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.ElemsImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getElems()
     * @generated
     */
    EClass ELEMS = eINSTANCE.getElems();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMS__VALUE = eINSTANCE.getElems_Value();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMS__VAR = eINSTANCE.getElems_Var();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetButtonsImpl <em>Get Buttons</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetButtonsImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetButtons()
     * @generated
     */
    EClass GET_BUTTONS = eINSTANCE.getGetButtons();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetCheckboxesImpl <em>Get Checkboxes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetCheckboxesImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetCheckboxes()
     * @generated
     */
    EClass GET_CHECKBOXES = eINSTANCE.getGetCheckboxes();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.impl.GetLinksImpl <em>Get Links</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.impl.GetLinksImpl
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getGetLinks()
     * @generated
     */
    EClass GET_LINKS = eINSTANCE.getGetLinks();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.BinaryOp <em>Binary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.BinaryOp
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getBinaryOp()
     * @generated
     */
    EEnum BINARY_OP = eINSTANCE.getBinaryOp();

    /**
     * The meta object literal for the '{@link org.xtext.emn.selenium.sel.UnaryOp <em>Unary Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.emn.selenium.sel.UnaryOp
     * @see org.xtext.emn.selenium.sel.impl.SelPackageImpl#getUnaryOp()
     * @generated
     */
    EEnum UNARY_OP = eINSTANCE.getUnaryOp();

  }

} //SelPackage
