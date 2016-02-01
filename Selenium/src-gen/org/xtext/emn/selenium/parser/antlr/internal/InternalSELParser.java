package org.xtext.emn.selenium.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.emn.selenium.services.SELGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSELParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'{'", "'}'", "'Sequence'", "'('", "','", "')'", "'ForAll'", "'Do {'", "'} While ('", "'If'", "'Else {'", "'='", "'Exec'", "'Fill'", "'with'", "'Check'", "'Click'", "'Verify'", "'GoTo'", "'Not'", "'GetButton'", "'GetLink'", "'GetCheckbox'", "'GetText'", "'GetButtons'", "'GetCheckboxes'", "'GetLinks'", "'Contains'", "'Equals'", "'IsChecked'", "'IsEnabled'", "'Exists'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSELParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSELParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSELParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g"; }



     	private SELGrammarAccess grammarAccess;
     	
        public InternalSELParser(TokenStream input, SELGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected SELGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:68:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:69:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:70:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:77:1: ruleProgram returns [EObject current=null] : ( ( (lv_sequences_0_0= ruleSequence ) ) | ( (lv_tests_1_0= ruleTest ) ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_sequences_0_0 = null;

        EObject lv_tests_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:80:28: ( ( ( (lv_sequences_0_0= ruleSequence ) ) | ( (lv_tests_1_0= ruleTest ) ) )* )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:81:1: ( ( (lv_sequences_0_0= ruleSequence ) ) | ( (lv_tests_1_0= ruleTest ) ) )*
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:81:1: ( ( (lv_sequences_0_0= ruleSequence ) ) | ( (lv_tests_1_0= ruleTest ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:81:2: ( (lv_sequences_0_0= ruleSequence ) )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:81:2: ( (lv_sequences_0_0= ruleSequence ) )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:82:1: (lv_sequences_0_0= ruleSequence )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:82:1: (lv_sequences_0_0= ruleSequence )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:83:3: lv_sequences_0_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getSequencesSequenceParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleProgram131);
            	    lv_sequences_0_0=ruleSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequences",
            	            		lv_sequences_0_0, 
            	            		"Sequence");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:100:6: ( (lv_tests_1_0= ruleTest ) )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:100:6: ( (lv_tests_1_0= ruleTest ) )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:101:1: (lv_tests_1_0= ruleTest )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:101:1: (lv_tests_1_0= ruleTest )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:102:3: lv_tests_1_0= ruleTest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getTestsTestParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_in_ruleProgram158);
            	    lv_tests_1_0=ruleTest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tests",
            	            		lv_tests_1_0, 
            	            		"Test");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleTest"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:126:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:127:2: (iv_ruleTest= ruleTest EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:128:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest195);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:135:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_browser_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_browser_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:138:28: ( (otherlv_0= 'Test' ( (lv_browser_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:139:1: (otherlv_0= 'Test' ( (lv_browser_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:139:1: (otherlv_0= 'Test' ( (lv_browser_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:139:3: otherlv_0= 'Test' ( (lv_browser_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTest242); 

                	newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:143:1: ( (lv_browser_1_0= RULE_STRING ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:144:1: (lv_browser_1_0= RULE_STRING )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:144:1: (lv_browser_1_0= RULE_STRING )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:145:3: lv_browser_1_0= RULE_STRING
            {
            lv_browser_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTest259); 

            			newLeafNode(lv_browser_1_0, grammarAccess.getTestAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"browser",
                    		lv_browser_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTest276); 

                	newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:165:1: ( (lv_body_3_0= ruleInstruction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14||(LA2_0>=18 && LA2_0<=19)||LA2_0==21||(LA2_0>=24 && LA2_0<=25)||(LA2_0>=27 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:166:1: (lv_body_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:166:1: (lv_body_3_0= ruleInstruction )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:167:3: lv_body_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestAccess().getBodyInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleTest297);
            	    lv_body_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTest310); 

                	newLeafNode(otherlv_4, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleSequence"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:195:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:196:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:197:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence346);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence356); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:204:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_body_8_0= ruleInstruction ) )* otherlv_9= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:207:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_body_8_0= ruleInstruction ) )* otherlv_9= '}' ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:208:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_body_8_0= ruleInstruction ) )* otherlv_9= '}' )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:208:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_body_8_0= ruleInstruction ) )* otherlv_9= '}' )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:208:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_body_8_0= ruleInstruction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSequence393); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:213:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence410); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:230:2: (otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:230:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleVariable ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSequence428); 

                        	newLeafNode(otherlv_2, grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:234:1: ( (lv_parameters_3_0= ruleVariable ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:235:1: (lv_parameters_3_0= ruleVariable )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:235:1: (lv_parameters_3_0= ruleVariable )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:236:3: lv_parameters_3_0= ruleVariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariable_in_ruleSequence449);
                    lv_parameters_3_0=ruleVariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"Variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:252:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:252:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleVariable ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleSequence462); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:256:1: ( (lv_parameters_5_0= ruleVariable ) )
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:257:1: (lv_parameters_5_0= ruleVariable )
                    	    {
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:257:1: (lv_parameters_5_0= ruleVariable )
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:258:3: lv_parameters_5_0= ruleVariable
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariable_in_ruleSequence483);
                    	    lv_parameters_5_0=ruleVariable();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"Variable");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSequence497); 

                        	newLeafNode(otherlv_6, grammarAccess.getSequenceAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleSequence511); 

                	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:282:1: ( (lv_body_8_0= ruleInstruction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==14||(LA5_0>=18 && LA5_0<=19)||LA5_0==21||(LA5_0>=24 && LA5_0<=25)||(LA5_0>=27 && LA5_0<=30)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:283:1: (lv_body_8_0= ruleInstruction )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:283:1: (lv_body_8_0= ruleInstruction )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:284:3: lv_body_8_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getBodyInstructionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleSequence532);
            	    lv_body_8_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_8_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleSequence545); 

                	newLeafNode(otherlv_9, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleVariable"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:312:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:313:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:314:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable581);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:321:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:324:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:325:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:325:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:326:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:326:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:327:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable632); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInstruction"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:351:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:352:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:353:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction672);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:360:1: ruleInstruction returns [EObject current=null] : (this_Sequence_0= ruleSequence | this_ForAll_1= ruleForAll | this_DoWhile_2= ruleDoWhile | this_IfThenElse_3= ruleIfThenElse | this_Affectation_4= ruleAffectation | this_Exec_5= ruleExec | this_Fill_6= ruleFill | this_Check_7= ruleCheck | this_Click_8= ruleClick | this_Verify_9= ruleVerify | this_GoTo_10= ruleGoTo ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Sequence_0 = null;

        EObject this_ForAll_1 = null;

        EObject this_DoWhile_2 = null;

        EObject this_IfThenElse_3 = null;

        EObject this_Affectation_4 = null;

        EObject this_Exec_5 = null;

        EObject this_Fill_6 = null;

        EObject this_Check_7 = null;

        EObject this_Click_8 = null;

        EObject this_Verify_9 = null;

        EObject this_GoTo_10 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:363:28: ( (this_Sequence_0= ruleSequence | this_ForAll_1= ruleForAll | this_DoWhile_2= ruleDoWhile | this_IfThenElse_3= ruleIfThenElse | this_Affectation_4= ruleAffectation | this_Exec_5= ruleExec | this_Fill_6= ruleFill | this_Check_7= ruleCheck | this_Click_8= ruleClick | this_Verify_9= ruleVerify | this_GoTo_10= ruleGoTo ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:364:1: (this_Sequence_0= ruleSequence | this_ForAll_1= ruleForAll | this_DoWhile_2= ruleDoWhile | this_IfThenElse_3= ruleIfThenElse | this_Affectation_4= ruleAffectation | this_Exec_5= ruleExec | this_Fill_6= ruleFill | this_Check_7= ruleCheck | this_Click_8= ruleClick | this_Verify_9= ruleVerify | this_GoTo_10= ruleGoTo )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:364:1: (this_Sequence_0= ruleSequence | this_ForAll_1= ruleForAll | this_DoWhile_2= ruleDoWhile | this_IfThenElse_3= ruleIfThenElse | this_Affectation_4= ruleAffectation | this_Exec_5= ruleExec | this_Fill_6= ruleFill | this_Check_7= ruleCheck | this_Click_8= ruleClick | this_Verify_9= ruleVerify | this_GoTo_10= ruleGoTo )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            case 28:
                {
                alt6=9;
                }
                break;
            case 29:
                {
                alt6=10;
                }
                break;
            case 30:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:365:5: this_Sequence_0= ruleSequence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSequenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequence_in_ruleInstruction729);
                    this_Sequence_0=ruleSequence();

                    state._fsp--;

                     
                            current = this_Sequence_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:375:5: this_ForAll_1= ruleForAll
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getForAllParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForAll_in_ruleInstruction756);
                    this_ForAll_1=ruleForAll();

                    state._fsp--;

                     
                            current = this_ForAll_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:385:5: this_DoWhile_2= ruleDoWhile
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getDoWhileParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDoWhile_in_ruleInstruction783);
                    this_DoWhile_2=ruleDoWhile();

                    state._fsp--;

                     
                            current = this_DoWhile_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:395:5: this_IfThenElse_3= ruleIfThenElse
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleInstruction810);
                    this_IfThenElse_3=ruleIfThenElse();

                    state._fsp--;

                     
                            current = this_IfThenElse_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:405:5: this_Affectation_4= ruleAffectation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAffectationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAffectation_in_ruleInstruction837);
                    this_Affectation_4=ruleAffectation();

                    state._fsp--;

                     
                            current = this_Affectation_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:415:5: this_Exec_5= ruleExec
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExecParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleExec_in_ruleInstruction864);
                    this_Exec_5=ruleExec();

                    state._fsp--;

                     
                            current = this_Exec_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:425:5: this_Fill_6= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFillParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleInstruction891);
                    this_Fill_6=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:435:5: this_Check_7= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCheckParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleInstruction918);
                    this_Check_7=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:445:5: this_Click_8= ruleClick
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleClick_in_ruleInstruction945);
                    this_Click_8=ruleClick();

                    state._fsp--;

                     
                            current = this_Click_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:455:5: this_Verify_9= ruleVerify
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleVerify_in_ruleInstruction972);
                    this_Verify_9=ruleVerify();

                    state._fsp--;

                     
                            current = this_Verify_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:465:5: this_GoTo_10= ruleGoTo
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGoToParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleGoTo_in_ruleInstruction999);
                    this_GoTo_10=ruleGoTo();

                    state._fsp--;

                     
                            current = this_GoTo_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleForAll"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:481:1: entryRuleForAll returns [EObject current=null] : iv_ruleForAll= ruleForAll EOF ;
    public final EObject entryRuleForAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForAll = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:482:2: (iv_ruleForAll= ruleForAll EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:483:2: iv_ruleForAll= ruleForAll EOF
            {
             newCompositeNode(grammarAccess.getForAllRule()); 
            pushFollow(FOLLOW_ruleForAll_in_entryRuleForAll1034);
            iv_ruleForAll=ruleForAll();

            state._fsp--;

             current =iv_ruleForAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAll1044); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForAll"


    // $ANTLR start "ruleForAll"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:490:1: ruleForAll returns [EObject current=null] : (otherlv_0= 'ForAll' ( (lv_elems_1_0= ruleElems ) ) ( (lv_it_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_body_4_0= ruleInstruction ) )* otherlv_5= '}' ) ;
    public final EObject ruleForAll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elems_1_0 = null;

        EObject lv_it_2_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:493:28: ( (otherlv_0= 'ForAll' ( (lv_elems_1_0= ruleElems ) ) ( (lv_it_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_body_4_0= ruleInstruction ) )* otherlv_5= '}' ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:494:1: (otherlv_0= 'ForAll' ( (lv_elems_1_0= ruleElems ) ) ( (lv_it_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_body_4_0= ruleInstruction ) )* otherlv_5= '}' )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:494:1: (otherlv_0= 'ForAll' ( (lv_elems_1_0= ruleElems ) ) ( (lv_it_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_body_4_0= ruleInstruction ) )* otherlv_5= '}' )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:494:3: otherlv_0= 'ForAll' ( (lv_elems_1_0= ruleElems ) ) ( (lv_it_2_0= ruleVariable ) ) otherlv_3= '{' ( (lv_body_4_0= ruleInstruction ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleForAll1081); 

                	newLeafNode(otherlv_0, grammarAccess.getForAllAccess().getForAllKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:498:1: ( (lv_elems_1_0= ruleElems ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:499:1: (lv_elems_1_0= ruleElems )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:499:1: (lv_elems_1_0= ruleElems )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:500:3: lv_elems_1_0= ruleElems
            {
             
            	        newCompositeNode(grammarAccess.getForAllAccess().getElemsElemsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleElems_in_ruleForAll1102);
            lv_elems_1_0=ruleElems();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForAllRule());
            	        }
                   		set(
                   			current, 
                   			"elems",
                    		lv_elems_1_0, 
                    		"Elems");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:516:2: ( (lv_it_2_0= ruleVariable ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:517:1: (lv_it_2_0= ruleVariable )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:517:1: (lv_it_2_0= ruleVariable )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:518:3: lv_it_2_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getForAllAccess().getItVariableParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleForAll1123);
            lv_it_2_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForAllRule());
            	        }
                   		set(
                   			current, 
                   			"it",
                    		lv_it_2_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleForAll1135); 

                	newLeafNode(otherlv_3, grammarAccess.getForAllAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:538:1: ( (lv_body_4_0= ruleInstruction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14||(LA7_0>=18 && LA7_0<=19)||LA7_0==21||(LA7_0>=24 && LA7_0<=25)||(LA7_0>=27 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:539:1: (lv_body_4_0= ruleInstruction )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:539:1: (lv_body_4_0= ruleInstruction )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:540:3: lv_body_4_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForAllAccess().getBodyInstructionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleForAll1156);
            	    lv_body_4_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForAllRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_4_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleForAll1169); 

                	newLeafNode(otherlv_5, grammarAccess.getForAllAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForAll"


    // $ANTLR start "entryRuleDoWhile"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:568:1: entryRuleDoWhile returns [EObject current=null] : iv_ruleDoWhile= ruleDoWhile EOF ;
    public final EObject entryRuleDoWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhile = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:569:2: (iv_ruleDoWhile= ruleDoWhile EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:570:2: iv_ruleDoWhile= ruleDoWhile EOF
            {
             newCompositeNode(grammarAccess.getDoWhileRule()); 
            pushFollow(FOLLOW_ruleDoWhile_in_entryRuleDoWhile1205);
            iv_ruleDoWhile=ruleDoWhile();

            state._fsp--;

             current =iv_ruleDoWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhile1215); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoWhile"


    // $ANTLR start "ruleDoWhile"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:577:1: ruleDoWhile returns [EObject current=null] : (otherlv_0= 'Do {' ( (lv_body_1_0= ruleInstruction ) )* otherlv_2= '} While (' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) ;
    public final EObject ruleDoWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_1_0 = null;

        EObject lv_condition_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:580:28: ( (otherlv_0= 'Do {' ( (lv_body_1_0= ruleInstruction ) )* otherlv_2= '} While (' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:581:1: (otherlv_0= 'Do {' ( (lv_body_1_0= ruleInstruction ) )* otherlv_2= '} While (' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:581:1: (otherlv_0= 'Do {' ( (lv_body_1_0= ruleInstruction ) )* otherlv_2= '} While (' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')' )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:581:3: otherlv_0= 'Do {' ( (lv_body_1_0= ruleInstruction ) )* otherlv_2= '} While (' ( (lv_condition_3_0= ruleCondition ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDoWhile1252); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileAccess().getDoKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:585:1: ( (lv_body_1_0= ruleInstruction ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==14||(LA8_0>=18 && LA8_0<=19)||LA8_0==21||(LA8_0>=24 && LA8_0<=25)||(LA8_0>=27 && LA8_0<=30)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:586:1: (lv_body_1_0= ruleInstruction )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:586:1: (lv_body_1_0= ruleInstruction )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:587:3: lv_body_1_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDoWhileAccess().getBodyInstructionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleDoWhile1273);
            	    lv_body_1_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDoWhileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"body",
            	            		lv_body_1_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleDoWhile1286); 

                	newLeafNode(otherlv_2, grammarAccess.getDoWhileAccess().getWhileKeyword_2());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:607:1: ( (lv_condition_3_0= ruleCondition ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:608:1: (lv_condition_3_0= ruleCondition )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:608:1: (lv_condition_3_0= ruleCondition )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:609:3: lv_condition_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileAccess().getConditionConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleDoWhile1307);
            lv_condition_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDoWhile1319); 

                	newLeafNode(otherlv_4, grammarAccess.getDoWhileAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoWhile"


    // $ANTLR start "entryRuleIfThenElse"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:637:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:638:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:639:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1355);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse1365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:646:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleInstruction ) )* otherlv_4= '}' (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:649:28: ( (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleInstruction ) )* otherlv_4= '}' (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )? ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:650:1: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleInstruction ) )* otherlv_4= '}' (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )? )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:650:1: (otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleInstruction ) )* otherlv_4= '}' (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )? )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:650:3: otherlv_0= 'If' ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_then_3_0= ruleInstruction ) )* otherlv_4= '}' (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleIfThenElse1402); 

                	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:654:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:655:1: (lv_condition_1_0= ruleCondition )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:655:1: (lv_condition_1_0= ruleCondition )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:656:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleIfThenElse1423);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleIfThenElse1435); 

                	newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:676:1: ( (lv_then_3_0= ruleInstruction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==14||(LA9_0>=18 && LA9_0<=19)||LA9_0==21||(LA9_0>=24 && LA9_0<=25)||(LA9_0>=27 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:677:1: (lv_then_3_0= ruleInstruction )
            	    {
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:677:1: (lv_then_3_0= ruleInstruction )
            	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:678:3: lv_then_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleIfThenElse1456);
            	    lv_then_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"then",
            	            		lv_then_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleIfThenElse1469); 

                	newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:698:1: (otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:698:3: otherlv_5= 'Else {' ( (lv_else_6_0= ruleInstruction ) )* otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleIfThenElse1482); 

                        	newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getElseKeyword_5_0());
                        
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:702:1: ( (lv_else_6_0= ruleInstruction ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID||LA10_0==14||(LA10_0>=18 && LA10_0<=19)||LA10_0==21||(LA10_0>=24 && LA10_0<=25)||(LA10_0>=27 && LA10_0<=30)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:703:1: (lv_else_6_0= ruleInstruction )
                    	    {
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:703:1: (lv_else_6_0= ruleInstruction )
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:704:3: lv_else_6_0= ruleInstruction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleIfThenElse1503);
                    	    lv_else_6_0=ruleInstruction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"else",
                    	            		lv_else_6_0, 
                    	            		"Instruction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleIfThenElse1516); 

                        	newLeafNode(otherlv_7, grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleAffectation"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:732:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:733:2: (iv_ruleAffectation= ruleAffectation EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:734:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation1554);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation1564); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:741:1: ruleAffectation returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_elem_2_0= ruleElem ) ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_elem_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:744:28: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_elem_2_0= ruleElem ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:745:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_elem_2_0= ruleElem ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:745:1: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_elem_2_0= ruleElem ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:745:2: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= '=' ( (lv_elem_2_0= ruleElem ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:745:2: ( (lv_variable_0_0= ruleVariable ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:746:1: (lv_variable_0_0= ruleVariable )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:746:1: (lv_variable_0_0= ruleVariable )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:747:3: lv_variable_0_0= ruleVariable
            {
             
            	        newCompositeNode(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariable_in_ruleAffectation1610);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAffectationRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"Variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAffectation1622); 

                	newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:767:1: ( (lv_elem_2_0= ruleElem ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:768:1: (lv_elem_2_0= ruleElem )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:768:1: (lv_elem_2_0= ruleElem )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:769:3: lv_elem_2_0= ruleElem
            {
             
            	        newCompositeNode(grammarAccess.getAffectationAccess().getElemElemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleElem_in_ruleAffectation1643);
            lv_elem_2_0=ruleElem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAffectationRule());
            	        }
                   		set(
                   			current, 
                   			"elem",
                    		lv_elem_2_0, 
                    		"Elem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleExec"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:793:1: entryRuleExec returns [EObject current=null] : iv_ruleExec= ruleExec EOF ;
    public final EObject entryRuleExec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExec = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:794:2: (iv_ruleExec= ruleExec EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:795:2: iv_ruleExec= ruleExec EOF
            {
             newCompositeNode(grammarAccess.getExecRule()); 
            pushFollow(FOLLOW_ruleExec_in_entryRuleExec1679);
            iv_ruleExec=ruleExec();

            state._fsp--;

             current =iv_ruleExec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExec1689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExec"


    // $ANTLR start "ruleExec"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:802:1: ruleExec returns [EObject current=null] : (otherlv_0= 'Exec' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleExec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_params_3_0=null;
        Token otherlv_4=null;
        Token lv_params_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:805:28: ( (otherlv_0= 'Exec' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:806:1: (otherlv_0= 'Exec' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:806:1: (otherlv_0= 'Exec' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )? )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:806:3: otherlv_0= 'Exec' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExec1726); 

                	newLeafNode(otherlv_0, grammarAccess.getExecAccess().getExecKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:810:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:811:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:811:1: (otherlv_1= RULE_ID )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:812:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExec1746); 

            		newLeafNode(otherlv_1, grammarAccess.getExecAccess().getSequenceSequenceCrossReference_1_0()); 
            	

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:823:2: (otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:823:4: otherlv_2= '(' ( (lv_params_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExec1759); 

                        	newLeafNode(otherlv_2, grammarAccess.getExecAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:827:1: ( (lv_params_3_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:828:1: (lv_params_3_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:828:1: (lv_params_3_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:829:3: lv_params_3_0= RULE_STRING
                    {
                    lv_params_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExec1776); 

                    			newLeafNode(lv_params_3_0, grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExecRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:845:2: (otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:845:4: otherlv_4= ',' ( (lv_params_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExec1794); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getExecAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:849:1: ( (lv_params_5_0= RULE_STRING ) )
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:850:1: (lv_params_5_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:850:1: (lv_params_5_0= RULE_STRING )
                    	    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:851:3: lv_params_5_0= RULE_STRING
                    	    {
                    	    lv_params_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExec1811); 

                    	    			newLeafNode(lv_params_5_0, grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getExecRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleExec1830); 

                        	newLeafNode(otherlv_6, grammarAccess.getExecAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExec"


    // $ANTLR start "entryRuleFill"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:879:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:880:2: (iv_ruleFill= ruleFill EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:881:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill1868);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill1878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:888:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_field_1_0= RULE_STRING ) ) otherlv_2= 'with' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_field_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:891:28: ( (otherlv_0= 'Fill' ( (lv_field_1_0= RULE_STRING ) ) otherlv_2= 'with' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:892:1: (otherlv_0= 'Fill' ( (lv_field_1_0= RULE_STRING ) ) otherlv_2= 'with' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:892:1: (otherlv_0= 'Fill' ( (lv_field_1_0= RULE_STRING ) ) otherlv_2= 'with' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:892:3: otherlv_0= 'Fill' ( (lv_field_1_0= RULE_STRING ) ) otherlv_2= 'with' ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFill1915); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:896:1: ( (lv_field_1_0= RULE_STRING ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:897:1: (lv_field_1_0= RULE_STRING )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:897:1: (lv_field_1_0= RULE_STRING )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:898:3: lv_field_1_0= RULE_STRING
            {
            lv_field_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill1932); 

            			newLeafNode(lv_field_1_0, grammarAccess.getFillAccess().getFieldSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFillRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"field",
                    		lv_field_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleFill1949); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getWithKeyword_2());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:918:1: ( ( (lv_value_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:918:2: ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:918:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:919:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:919:1: (lv_value_3_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:920:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFill1967); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFillRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:937:6: ( (otherlv_4= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:937:6: ( (otherlv_4= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:938:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:938:1: (otherlv_4= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:939:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFillRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFill1998); 

                    		newLeafNode(otherlv_4, grammarAccess.getFillAccess().getParamVariableCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleCheck"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:958:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:959:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:960:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck2035);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck2045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:967:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_checkbox_1_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:970:28: ( (otherlv_0= 'Check' ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:971:1: (otherlv_0= 'Check' ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:971:1: (otherlv_0= 'Check' ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:971:3: otherlv_0= 'Check' ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCheck2082); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:975:1: ( ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:976:1: ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:976:1: ( (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:977:1: (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:977:1: (lv_checkbox_1_1= ruleGetCheckbox | otherlv_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:978:3: lv_checkbox_1_1= ruleGetCheckbox
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getCheckboxGetCheckboxParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGetCheckbox_in_ruleCheck2105);
                    lv_checkbox_1_1=ruleGetCheckbox();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"checkbox",
                            		lv_checkbox_1_1, 
                            		"GetCheckbox");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:993:8: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCheck2123); 

                    		newLeafNode(otherlv_1, grammarAccess.getCheckAccess().getCheckboxVariableCrossReference_1_0_1()); 
                    	

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleClick"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1014:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1015:2: (iv_ruleClick= ruleClick EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1016:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick2162);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick2172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1023:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_elem_1_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1026:28: ( (otherlv_0= 'Click' ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1027:1: (otherlv_0= 'Click' ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1027:1: (otherlv_0= 'Click' ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1027:3: otherlv_0= 'Click' ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleClick2209); 

                	newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1031:1: ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1032:1: ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1032:1: ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1033:1: (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1033:1: (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=32 && LA16_0<=35)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1034:3: lv_elem_1_1= ruleElem
                    {
                     
                    	        newCompositeNode(grammarAccess.getClickAccess().getElemElemParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElem_in_ruleClick2232);
                    lv_elem_1_1=ruleElem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClickRule());
                    	        }
                           		set(
                           			current, 
                           			"elem",
                            		lv_elem_1_1, 
                            		"Elem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1049:8: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClickRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClick2250); 

                    		newLeafNode(otherlv_1, grammarAccess.getClickAccess().getElemVariableCrossReference_1_0_1()); 
                    	

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleVerify"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1070:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1071:2: (iv_ruleVerify= ruleVerify EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1072:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify2289);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify2299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1079:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'Verify' ( (lv_condition_1_0= ruleCondition ) ) ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_condition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1082:28: ( (otherlv_0= 'Verify' ( (lv_condition_1_0= ruleCondition ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1083:1: (otherlv_0= 'Verify' ( (lv_condition_1_0= ruleCondition ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1083:1: (otherlv_0= 'Verify' ( (lv_condition_1_0= ruleCondition ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1083:3: otherlv_0= 'Verify' ( (lv_condition_1_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleVerify2336); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1087:1: ( (lv_condition_1_0= ruleCondition ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1088:1: (lv_condition_1_0= ruleCondition )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1088:1: (lv_condition_1_0= ruleCondition )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1089:3: lv_condition_1_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getVerifyAccess().getConditionConditionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleVerify2357);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerifyRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleGoTo"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1113:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1114:2: (iv_ruleGoTo= ruleGoTo EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1115:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo2393);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo2403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1122:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GoTo' ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        EObject lv_link_2_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1125:28: ( (otherlv_0= 'GoTo' ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1126:1: (otherlv_0= 'GoTo' ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1126:1: (otherlv_0= 'GoTo' ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1126:3: otherlv_0= 'GoTo' ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGoTo2440); 

                	newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1130:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||LA18_0==33) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1130:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1130:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1131:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1131:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1132:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoTo2458); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGoToAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGoToRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1149:6: ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1149:6: ( ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1150:1: ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1150:1: ( (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1151:1: (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1151:1: (otherlv_2= RULE_ID | lv_link_2_4= ruleGetLink )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==33) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1152:3: otherlv_2= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getGoToRule());
                            	        }
                                    
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoTo2491); 

                            		newLeafNode(otherlv_2, grammarAccess.getGoToAccess().getLinkVariableCrossReference_1_1_0_0()); 
                            	

                            }
                            break;
                        case 2 :
                            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1162:8: lv_link_2_4= ruleGetLink
                            {
                             
                            	        newCompositeNode(grammarAccess.getGoToAccess().getLinkGetLinkParserRuleCall_1_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleGetLink_in_ruleGoTo2510);
                            lv_link_2_4=ruleGetLink();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGoToRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"link",
                                    		lv_link_2_4, 
                                    		"GetLink");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1188:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1189:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1190:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition2550);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition2560); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1197:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'Not' )? (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_UnaryCondition_1 = null;

        EObject this_BinaryCondition_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1200:28: ( ( (otherlv_0= 'Not' )? (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1201:1: ( (otherlv_0= 'Not' )? (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1201:1: ( (otherlv_0= 'Not' )? (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1201:2: (otherlv_0= 'Not' )? (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1201:2: (otherlv_0= 'Not' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1201:4: otherlv_0= 'Not'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCondition2598); 

                        	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getNotKeyword_0());
                        

                    }
                    break;

            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1205:3: (this_UnaryCondition_1= ruleUnaryCondition | this_BinaryCondition_2= ruleBinaryCondition )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=41 && LA20_0<=43)) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=32 && LA20_0<=35)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1206:5: this_UnaryCondition_1= ruleUnaryCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleUnaryCondition_in_ruleCondition2623);
                    this_UnaryCondition_1=ruleUnaryCondition();

                    state._fsp--;

                     
                            current = this_UnaryCondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1216:5: this_BinaryCondition_2= ruleBinaryCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleBinaryCondition_in_ruleCondition2650);
                    this_BinaryCondition_2=ruleBinaryCondition();

                    state._fsp--;

                     
                            current = this_BinaryCondition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleUnaryCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1232:1: entryRuleUnaryCondition returns [EObject current=null] : iv_ruleUnaryCondition= ruleUnaryCondition EOF ;
    public final EObject entryRuleUnaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCondition = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1233:2: (iv_ruleUnaryCondition= ruleUnaryCondition EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1234:2: iv_ruleUnaryCondition= ruleUnaryCondition EOF
            {
             newCompositeNode(grammarAccess.getUnaryConditionRule()); 
            pushFollow(FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition2686);
            iv_ruleUnaryCondition=ruleUnaryCondition();

            state._fsp--;

             current =iv_ruleUnaryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryCondition2696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryCondition"


    // $ANTLR start "ruleUnaryCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1241:1: ruleUnaryCondition returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOp ) ) ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) ) ;
    public final EObject ruleUnaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_op_0_0 = null;

        EObject lv_elem_1_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1244:28: ( ( ( (lv_op_0_0= ruleUnaryOp ) ) ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1245:1: ( ( (lv_op_0_0= ruleUnaryOp ) ) ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1245:1: ( ( (lv_op_0_0= ruleUnaryOp ) ) ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1245:2: ( (lv_op_0_0= ruleUnaryOp ) ) ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1245:2: ( (lv_op_0_0= ruleUnaryOp ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1246:1: (lv_op_0_0= ruleUnaryOp )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1246:1: (lv_op_0_0= ruleUnaryOp )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1247:3: lv_op_0_0= ruleUnaryOp
            {
             
            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryOp_in_ruleUnaryCondition2742);
            lv_op_0_0=ruleUnaryOp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"UnaryOp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1263:2: ( ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1264:1: ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1264:1: ( (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1265:1: (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1265:1: (lv_elem_1_1= ruleElem | otherlv_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=32 && LA21_0<=35)) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1266:3: lv_elem_1_1= ruleElem
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getElemElemParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElem_in_ruleUnaryCondition2765);
                    lv_elem_1_1=ruleElem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
                    	        }
                           		set(
                           			current, 
                           			"elem",
                            		lv_elem_1_1, 
                            		"Elem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1281:8: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryConditionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnaryCondition2783); 

                    		newLeafNode(otherlv_1, grammarAccess.getUnaryConditionAccess().getElemVariableCrossReference_1_0_1()); 
                    	

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1302:1: entryRuleBinaryCondition returns [EObject current=null] : iv_ruleBinaryCondition= ruleBinaryCondition EOF ;
    public final EObject entryRuleBinaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCondition = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1303:2: (iv_ruleBinaryCondition= ruleBinaryCondition EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1304:2: iv_ruleBinaryCondition= ruleBinaryCondition EOF
            {
             newCompositeNode(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition2822);
            iv_ruleBinaryCondition=ruleBinaryCondition();

            state._fsp--;

             current =iv_ruleBinaryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryCondition2832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1311:1: ruleBinaryCondition returns [EObject current=null] : ( ( (lv_elem_0_0= ruleElem ) ) ( (lv_op_1_0= ruleBinaryOp ) ) ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleBinaryCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Token otherlv_3=null;
        EObject lv_elem_0_0 = null;

        Enumerator lv_op_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1314:28: ( ( ( (lv_elem_0_0= ruleElem ) ) ( (lv_op_1_0= ruleBinaryOp ) ) ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1315:1: ( ( (lv_elem_0_0= ruleElem ) ) ( (lv_op_1_0= ruleBinaryOp ) ) ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1315:1: ( ( (lv_elem_0_0= ruleElem ) ) ( (lv_op_1_0= ruleBinaryOp ) ) ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1315:2: ( (lv_elem_0_0= ruleElem ) ) ( (lv_op_1_0= ruleBinaryOp ) ) ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1315:2: ( (lv_elem_0_0= ruleElem ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1316:1: (lv_elem_0_0= ruleElem )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1316:1: (lv_elem_0_0= ruleElem )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1317:3: lv_elem_0_0= ruleElem
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConditionAccess().getElemElemParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleElem_in_ruleBinaryCondition2878);
            lv_elem_0_0=ruleElem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
            	        }
                   		set(
                   			current, 
                   			"elem",
                    		lv_elem_0_0, 
                    		"Elem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1333:2: ( (lv_op_1_0= ruleBinaryOp ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1334:1: (lv_op_1_0= ruleBinaryOp )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1334:1: (lv_op_1_0= ruleBinaryOp )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1335:3: lv_op_1_0= ruleBinaryOp
            {
             
            	        newCompositeNode(grammarAccess.getBinaryConditionAccess().getOpBinaryOpEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryOp_in_ruleBinaryCondition2899);
            lv_op_1_0=ruleBinaryOp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_1_0, 
                    		"BinaryOp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1351:2: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1351:3: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1351:3: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1352:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1352:1: (lv_value_2_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1353:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBinaryCondition2917); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getBinaryConditionAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConditionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1370:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1370:6: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1371:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1371:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1372:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryConditionRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBinaryCondition2948); 

                    		newLeafNode(otherlv_3, grammarAccess.getBinaryConditionAccess().getParamVariableCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleElem"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1391:1: entryRuleElem returns [EObject current=null] : iv_ruleElem= ruleElem EOF ;
    public final EObject entryRuleElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElem = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1392:2: (iv_ruleElem= ruleElem EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1393:2: iv_ruleElem= ruleElem EOF
            {
             newCompositeNode(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_ruleElem_in_entryRuleElem2985);
            iv_ruleElem=ruleElem();

            state._fsp--;

             current =iv_ruleElem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElem2995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1400:1: ruleElem returns [EObject current=null] : (this_GetButton_0= ruleGetButton | this_GetLink_1= ruleGetLink | this_GetCheckbox_2= ruleGetCheckbox | this_GetText_3= ruleGetText ) ;
    public final EObject ruleElem() throws RecognitionException {
        EObject current = null;

        EObject this_GetButton_0 = null;

        EObject this_GetLink_1 = null;

        EObject this_GetCheckbox_2 = null;

        EObject this_GetText_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1403:28: ( (this_GetButton_0= ruleGetButton | this_GetLink_1= ruleGetLink | this_GetCheckbox_2= ruleGetCheckbox | this_GetText_3= ruleGetText ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1404:1: (this_GetButton_0= ruleGetButton | this_GetLink_1= ruleGetLink | this_GetCheckbox_2= ruleGetCheckbox | this_GetText_3= ruleGetText )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1404:1: (this_GetButton_0= ruleGetButton | this_GetLink_1= ruleGetLink | this_GetCheckbox_2= ruleGetCheckbox | this_GetText_3= ruleGetText )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt23=1;
                }
                break;
            case 33:
                {
                alt23=2;
                }
                break;
            case 34:
                {
                alt23=3;
                }
                break;
            case 35:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1405:5: this_GetButton_0= ruleGetButton
                    {
                     
                            newCompositeNode(grammarAccess.getElemAccess().getGetButtonParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGetButton_in_ruleElem3042);
                    this_GetButton_0=ruleGetButton();

                    state._fsp--;

                     
                            current = this_GetButton_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1415:5: this_GetLink_1= ruleGetLink
                    {
                     
                            newCompositeNode(grammarAccess.getElemAccess().getGetLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGetLink_in_ruleElem3069);
                    this_GetLink_1=ruleGetLink();

                    state._fsp--;

                     
                            current = this_GetLink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1425:5: this_GetCheckbox_2= ruleGetCheckbox
                    {
                     
                            newCompositeNode(grammarAccess.getElemAccess().getGetCheckboxParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGetCheckbox_in_ruleElem3096);
                    this_GetCheckbox_2=ruleGetCheckbox();

                    state._fsp--;

                     
                            current = this_GetCheckbox_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1435:5: this_GetText_3= ruleGetText
                    {
                     
                            newCompositeNode(grammarAccess.getElemAccess().getGetTextParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetText_in_ruleElem3123);
                    this_GetText_3=ruleGetText();

                    state._fsp--;

                     
                            current = this_GetText_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRuleGetButton"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1451:1: entryRuleGetButton returns [EObject current=null] : iv_ruleGetButton= ruleGetButton EOF ;
    public final EObject entryRuleGetButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetButton = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1452:2: (iv_ruleGetButton= ruleGetButton EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1453:2: iv_ruleGetButton= ruleGetButton EOF
            {
             newCompositeNode(grammarAccess.getGetButtonRule()); 
            pushFollow(FOLLOW_ruleGetButton_in_entryRuleGetButton3158);
            iv_ruleGetButton=ruleGetButton();

            state._fsp--;

             current =iv_ruleGetButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetButton3168); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetButton"


    // $ANTLR start "ruleGetButton"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1460:1: ruleGetButton returns [EObject current=null] : (otherlv_0= 'GetButton' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGetButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1463:28: ( (otherlv_0= 'GetButton' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1464:1: (otherlv_0= 'GetButton' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1464:1: (otherlv_0= 'GetButton' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1464:3: otherlv_0= 'GetButton' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGetButton3205); 

                	newLeafNode(otherlv_0, grammarAccess.getGetButtonAccess().getGetButtonKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1468:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1468:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1468:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1469:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1469:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1470:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetButton3223); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetButtonAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetButtonRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1487:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1487:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1488:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1488:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1489:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetButtonRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetButton3254); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetButtonAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetButton"


    // $ANTLR start "entryRuleGetLink"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1508:1: entryRuleGetLink returns [EObject current=null] : iv_ruleGetLink= ruleGetLink EOF ;
    public final EObject entryRuleGetLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetLink = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1509:2: (iv_ruleGetLink= ruleGetLink EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1510:2: iv_ruleGetLink= ruleGetLink EOF
            {
             newCompositeNode(grammarAccess.getGetLinkRule()); 
            pushFollow(FOLLOW_ruleGetLink_in_entryRuleGetLink3291);
            iv_ruleGetLink=ruleGetLink();

            state._fsp--;

             current =iv_ruleGetLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetLink3301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetLink"


    // $ANTLR start "ruleGetLink"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1517:1: ruleGetLink returns [EObject current=null] : (otherlv_0= 'GetLink' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGetLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1520:28: ( (otherlv_0= 'GetLink' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1521:1: (otherlv_0= 'GetLink' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1521:1: (otherlv_0= 'GetLink' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1521:3: otherlv_0= 'GetLink' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleGetLink3338); 

                	newLeafNode(otherlv_0, grammarAccess.getGetLinkAccess().getGetLinkKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1525:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1525:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1525:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1526:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1526:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1527:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetLink3356); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetLinkAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetLinkRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1544:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1544:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1545:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1545:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1546:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetLinkRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetLink3387); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetLinkAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetLink"


    // $ANTLR start "entryRuleGetCheckbox"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1565:1: entryRuleGetCheckbox returns [EObject current=null] : iv_ruleGetCheckbox= ruleGetCheckbox EOF ;
    public final EObject entryRuleGetCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetCheckbox = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1566:2: (iv_ruleGetCheckbox= ruleGetCheckbox EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1567:2: iv_ruleGetCheckbox= ruleGetCheckbox EOF
            {
             newCompositeNode(grammarAccess.getGetCheckboxRule()); 
            pushFollow(FOLLOW_ruleGetCheckbox_in_entryRuleGetCheckbox3424);
            iv_ruleGetCheckbox=ruleGetCheckbox();

            state._fsp--;

             current =iv_ruleGetCheckbox; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetCheckbox3434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetCheckbox"


    // $ANTLR start "ruleGetCheckbox"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1574:1: ruleGetCheckbox returns [EObject current=null] : (otherlv_0= 'GetCheckbox' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGetCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1577:28: ( (otherlv_0= 'GetCheckbox' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1578:1: (otherlv_0= 'GetCheckbox' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1578:1: (otherlv_0= 'GetCheckbox' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1578:3: otherlv_0= 'GetCheckbox' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleGetCheckbox3471); 

                	newLeafNode(otherlv_0, grammarAccess.getGetCheckboxAccess().getGetCheckboxKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1582:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1582:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1582:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1583:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1583:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1584:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetCheckbox3489); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetCheckboxAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetCheckboxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1601:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1601:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1602:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1602:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1603:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetCheckboxRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetCheckbox3520); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetCheckboxAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetCheckbox"


    // $ANTLR start "entryRuleGetText"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1622:1: entryRuleGetText returns [EObject current=null] : iv_ruleGetText= ruleGetText EOF ;
    public final EObject entryRuleGetText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetText = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1623:2: (iv_ruleGetText= ruleGetText EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1624:2: iv_ruleGetText= ruleGetText EOF
            {
             newCompositeNode(grammarAccess.getGetTextRule()); 
            pushFollow(FOLLOW_ruleGetText_in_entryRuleGetText3557);
            iv_ruleGetText=ruleGetText();

            state._fsp--;

             current =iv_ruleGetText; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetText3567); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetText"


    // $ANTLR start "ruleGetText"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1631:1: ruleGetText returns [EObject current=null] : (otherlv_0= 'GetText' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleGetText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1634:28: ( (otherlv_0= 'GetText' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1635:1: (otherlv_0= 'GetText' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1635:1: (otherlv_0= 'GetText' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1635:3: otherlv_0= 'GetText' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleGetText3604); 

                	newLeafNode(otherlv_0, grammarAccess.getGetTextAccess().getGetTextKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1639:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ID) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1639:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1639:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1640:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1640:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1641:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetText3622); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetTextAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetTextRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1658:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1658:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1659:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1659:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1660:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetTextRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetText3653); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetTextAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetText"


    // $ANTLR start "entryRuleElems"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1679:1: entryRuleElems returns [EObject current=null] : iv_ruleElems= ruleElems EOF ;
    public final EObject entryRuleElems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElems = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1680:2: (iv_ruleElems= ruleElems EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1681:2: iv_ruleElems= ruleElems EOF
            {
             newCompositeNode(grammarAccess.getElemsRule()); 
            pushFollow(FOLLOW_ruleElems_in_entryRuleElems3690);
            iv_ruleElems=ruleElems();

            state._fsp--;

             current =iv_ruleElems; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElems3700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElems"


    // $ANTLR start "ruleElems"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1688:1: ruleElems returns [EObject current=null] : (this_GetButtons_0= ruleGetButtons | this_GetCheckboxes_1= ruleGetCheckboxes | this_GetLinks_2= ruleGetLinks ) ;
    public final EObject ruleElems() throws RecognitionException {
        EObject current = null;

        EObject this_GetButtons_0 = null;

        EObject this_GetCheckboxes_1 = null;

        EObject this_GetLinks_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1691:28: ( (this_GetButtons_0= ruleGetButtons | this_GetCheckboxes_1= ruleGetCheckboxes | this_GetLinks_2= ruleGetLinks ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1692:1: (this_GetButtons_0= ruleGetButtons | this_GetCheckboxes_1= ruleGetCheckboxes | this_GetLinks_2= ruleGetLinks )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1692:1: (this_GetButtons_0= ruleGetButtons | this_GetCheckboxes_1= ruleGetCheckboxes | this_GetLinks_2= ruleGetLinks )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt28=1;
                }
                break;
            case 37:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1693:5: this_GetButtons_0= ruleGetButtons
                    {
                     
                            newCompositeNode(grammarAccess.getElemsAccess().getGetButtonsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGetButtons_in_ruleElems3747);
                    this_GetButtons_0=ruleGetButtons();

                    state._fsp--;

                     
                            current = this_GetButtons_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1703:5: this_GetCheckboxes_1= ruleGetCheckboxes
                    {
                     
                            newCompositeNode(grammarAccess.getElemsAccess().getGetCheckboxesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGetCheckboxes_in_ruleElems3774);
                    this_GetCheckboxes_1=ruleGetCheckboxes();

                    state._fsp--;

                     
                            current = this_GetCheckboxes_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1713:5: this_GetLinks_2= ruleGetLinks
                    {
                     
                            newCompositeNode(grammarAccess.getElemsAccess().getGetLinksParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGetLinks_in_ruleElems3801);
                    this_GetLinks_2=ruleGetLinks();

                    state._fsp--;

                     
                            current = this_GetLinks_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElems"


    // $ANTLR start "entryRuleGetButtons"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1729:1: entryRuleGetButtons returns [EObject current=null] : iv_ruleGetButtons= ruleGetButtons EOF ;
    public final EObject entryRuleGetButtons() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetButtons = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1730:2: (iv_ruleGetButtons= ruleGetButtons EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1731:2: iv_ruleGetButtons= ruleGetButtons EOF
            {
             newCompositeNode(grammarAccess.getGetButtonsRule()); 
            pushFollow(FOLLOW_ruleGetButtons_in_entryRuleGetButtons3836);
            iv_ruleGetButtons=ruleGetButtons();

            state._fsp--;

             current =iv_ruleGetButtons; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetButtons3846); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetButtons"


    // $ANTLR start "ruleGetButtons"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1738:1: ruleGetButtons returns [EObject current=null] : (otherlv_0= 'GetButtons' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleGetButtons() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1741:28: ( (otherlv_0= 'GetButtons' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1742:1: (otherlv_0= 'GetButtons' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1742:1: (otherlv_0= 'GetButtons' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1742:3: otherlv_0= 'GetButtons' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleGetButtons3883); 

                	newLeafNode(otherlv_0, grammarAccess.getGetButtonsAccess().getGetButtonsKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1746:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==EOF||LA29_2==RULE_ID) ) {
                    alt29=2;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1746:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1746:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1747:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1747:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1748:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetButtons3901); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetButtonsAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetButtonsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1765:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1765:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1766:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1766:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1767:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetButtonsRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetButtons3932); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetButtonsAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetButtons"


    // $ANTLR start "entryRuleGetCheckboxes"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1786:1: entryRuleGetCheckboxes returns [EObject current=null] : iv_ruleGetCheckboxes= ruleGetCheckboxes EOF ;
    public final EObject entryRuleGetCheckboxes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetCheckboxes = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1787:2: (iv_ruleGetCheckboxes= ruleGetCheckboxes EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1788:2: iv_ruleGetCheckboxes= ruleGetCheckboxes EOF
            {
             newCompositeNode(grammarAccess.getGetCheckboxesRule()); 
            pushFollow(FOLLOW_ruleGetCheckboxes_in_entryRuleGetCheckboxes3970);
            iv_ruleGetCheckboxes=ruleGetCheckboxes();

            state._fsp--;

             current =iv_ruleGetCheckboxes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetCheckboxes3980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetCheckboxes"


    // $ANTLR start "ruleGetCheckboxes"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1795:1: ruleGetCheckboxes returns [EObject current=null] : (otherlv_0= 'GetCheckboxes' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleGetCheckboxes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1798:28: ( (otherlv_0= 'GetCheckboxes' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1799:1: (otherlv_0= 'GetCheckboxes' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1799:1: (otherlv_0= 'GetCheckboxes' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1799:3: otherlv_0= 'GetCheckboxes' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleGetCheckboxes4017); 

                	newLeafNode(otherlv_0, grammarAccess.getGetCheckboxesAccess().getGetCheckboxesKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1803:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==EOF||LA30_2==RULE_ID) ) {
                    alt30=2;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1803:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1803:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1804:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1804:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1805:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetCheckboxes4035); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetCheckboxesAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetCheckboxesRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1822:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1822:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1823:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1823:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1824:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetCheckboxesRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetCheckboxes4066); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetCheckboxesAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetCheckboxes"


    // $ANTLR start "entryRuleGetLinks"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1843:1: entryRuleGetLinks returns [EObject current=null] : iv_ruleGetLinks= ruleGetLinks EOF ;
    public final EObject entryRuleGetLinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetLinks = null;


        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1844:2: (iv_ruleGetLinks= ruleGetLinks EOF )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1845:2: iv_ruleGetLinks= ruleGetLinks EOF
            {
             newCompositeNode(grammarAccess.getGetLinksRule()); 
            pushFollow(FOLLOW_ruleGetLinks_in_entryRuleGetLinks4104);
            iv_ruleGetLinks=ruleGetLinks();

            state._fsp--;

             current =iv_ruleGetLinks; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetLinks4114); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetLinks"


    // $ANTLR start "ruleGetLinks"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1852:1: ruleGetLinks returns [EObject current=null] : (otherlv_0= 'GetLinks' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleGetLinks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1855:28: ( (otherlv_0= 'GetLinks' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1856:1: (otherlv_0= 'GetLinks' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1856:1: (otherlv_0= 'GetLinks' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )? )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1856:3: otherlv_0= 'GetLinks' ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleGetLinks4151); 

                	newLeafNode(otherlv_0, grammarAccess.getGetLinksAccess().getGetLinksKeyword_0());
                
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1860:1: ( ( (lv_value_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )?
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==EOF||LA31_2==RULE_ID) ) {
                    alt31=2;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1860:2: ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1860:2: ( (lv_value_1_0= RULE_STRING ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1861:1: (lv_value_1_0= RULE_STRING )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1861:1: (lv_value_1_0= RULE_STRING )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1862:3: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGetLinks4169); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getGetLinksAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetLinksRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1879:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1879:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1880:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1880:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1881:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGetLinksRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGetLinks4200); 

                    		newLeafNode(otherlv_2, grammarAccess.getGetLinksAccess().getVarVariableCrossReference_1_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetLinks"


    // $ANTLR start "ruleBinaryOp"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1900:1: ruleBinaryOp returns [Enumerator current=null] : ( (enumLiteral_0= 'Contains' ) | (enumLiteral_1= 'Equals' ) ) ;
    public final Enumerator ruleBinaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1902:28: ( ( (enumLiteral_0= 'Contains' ) | (enumLiteral_1= 'Equals' ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1903:1: ( (enumLiteral_0= 'Contains' ) | (enumLiteral_1= 'Equals' ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1903:1: ( (enumLiteral_0= 'Contains' ) | (enumLiteral_1= 'Equals' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            else if ( (LA32_0==40) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1903:2: (enumLiteral_0= 'Contains' )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1903:2: (enumLiteral_0= 'Contains' )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1903:4: enumLiteral_0= 'Contains'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleBinaryOp4252); 

                            current = grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1909:6: (enumLiteral_1= 'Equals' )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1909:6: (enumLiteral_1= 'Equals' )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1909:8: enumLiteral_1= 'Equals'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleBinaryOp4269); 

                            current = grammarAccess.getBinaryOpAccess().getEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOpAccess().getEqualsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOp"


    // $ANTLR start "ruleUnaryOp"
    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1919:1: ruleUnaryOp returns [Enumerator current=null] : ( (enumLiteral_0= 'IsChecked' ) | (enumLiteral_1= 'IsEnabled' ) | (enumLiteral_2= 'Exists' ) ) ;
    public final Enumerator ruleUnaryOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1921:28: ( ( (enumLiteral_0= 'IsChecked' ) | (enumLiteral_1= 'IsEnabled' ) | (enumLiteral_2= 'Exists' ) ) )
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1922:1: ( (enumLiteral_0= 'IsChecked' ) | (enumLiteral_1= 'IsEnabled' ) | (enumLiteral_2= 'Exists' ) )
            {
            // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1922:1: ( (enumLiteral_0= 'IsChecked' ) | (enumLiteral_1= 'IsEnabled' ) | (enumLiteral_2= 'Exists' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt33=1;
                }
                break;
            case 42:
                {
                alt33=2;
                }
                break;
            case 43:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1922:2: (enumLiteral_0= 'IsChecked' )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1922:2: (enumLiteral_0= 'IsChecked' )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1922:4: enumLiteral_0= 'IsChecked'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleUnaryOp4314); 

                            current = grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1928:6: (enumLiteral_1= 'IsEnabled' )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1928:6: (enumLiteral_1= 'IsEnabled' )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1928:8: enumLiteral_1= 'IsEnabled'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleUnaryOp4331); 

                            current = grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1934:6: (enumLiteral_2= 'Exists' )
                    {
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1934:6: (enumLiteral_2= 'Exists' )
                    // ../org.xtext.emn.selenium/src-gen/org/xtext/emn/selenium/parser/antlr/internal/InternalSEL.g:1934:8: enumLiteral_2= 'Exists'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleUnaryOp4348); 

                            current = grammarAccess.getUnaryOpAccess().getExistsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUnaryOpAccess().getExistsEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOp"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleProgram131 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleTest_in_ruleProgram158 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTest242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTest259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTest276 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleTest297 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_13_in_ruleTest310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSequence393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence410 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_15_in_ruleSequence428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSequence449 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSequence462 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleSequence483 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleSequence497 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSequence511 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleSequence532 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_13_in_ruleSequence545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleInstruction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_ruleInstruction756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_ruleInstruction783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleInstruction810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_ruleInstruction837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExec_in_ruleInstruction864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleInstruction891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleInstruction918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_ruleInstruction945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_ruleInstruction972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_ruleInstruction999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_entryRuleForAll1034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAll1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleForAll1081 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_ruleElems_in_ruleForAll1102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleForAll1123 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForAll1135 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleForAll1156 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_13_in_ruleForAll1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_entryRuleDoWhile1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhile1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDoWhile1252 = new BitSet(new long[]{0x000000007B3C4020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleDoWhile1273 = new BitSet(new long[]{0x000000007B3C4020L});
    public static final BitSet FOLLOW_20_in_ruleDoWhile1286 = new BitSet(new long[]{0x00000E0F80000000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleDoWhile1307 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDoWhile1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleIfThenElse1402 = new BitSet(new long[]{0x00000E0F80000000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleIfThenElse1423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfThenElse1435 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleIfThenElse1456 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_13_in_ruleIfThenElse1469 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleIfThenElse1482 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleIfThenElse1503 = new BitSet(new long[]{0x000000007B2C6020L});
    public static final BitSet FOLLOW_13_in_ruleIfThenElse1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation1554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAffectation1610 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAffectation1622 = new BitSet(new long[]{0x00000E0F80000000L});
    public static final BitSet FOLLOW_ruleElem_in_ruleAffectation1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExec_in_entryRuleExec1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExec1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExec1726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExec1746 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleExec1759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExec1776 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleExec1794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExec1811 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleExec1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFill1915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill1932 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFill1949 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFill1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFill1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck2035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCheck2082 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_ruleCheck2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCheck2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick2162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleClick2209 = new BitSet(new long[]{0x00000E0F80000020L});
    public static final BitSet FOLLOW_ruleElem_in_ruleClick2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClick2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVerify2336 = new BitSet(new long[]{0x00000E0F80000000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleVerify2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGoTo2440 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoTo2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoTo2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_ruleGoTo2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCondition2598 = new BitSet(new long[]{0x00000E0F80000000L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_ruleCondition2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_ruleCondition2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryCondition2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleUnaryCondition2742 = new BitSet(new long[]{0x00000E0F80000020L});
    public static final BitSet FOLLOW_ruleElem_in_ruleUnaryCondition2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnaryCondition2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition2822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryCondition2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_ruleBinaryCondition2878 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_ruleBinaryCondition2899 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBinaryCondition2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryCondition2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_entryRuleElem2985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElem2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButton_in_ruleElem3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_ruleElem3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_ruleElem3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetText_in_ruleElem3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButton_in_entryRuleGetButton3158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetButton3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGetButton3205 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetButton3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetButton3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_entryRuleGetLink3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetLink3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGetLink3338 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetLink3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetLink3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_entryRuleGetCheckbox3424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetCheckbox3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGetCheckbox3471 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetCheckbox3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetCheckbox3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetText_in_entryRuleGetText3557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetText3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleGetText3604 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetText3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetText3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElems_in_entryRuleElems3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElems3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButtons_in_ruleElems3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckboxes_in_ruleElems3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLinks_in_ruleElems3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButtons_in_entryRuleGetButtons3836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetButtons3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGetButtons3883 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetButtons3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetButtons3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckboxes_in_entryRuleGetCheckboxes3970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetCheckboxes3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGetCheckboxes4017 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetCheckboxes4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetCheckboxes4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLinks_in_entryRuleGetLinks4104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetLinks4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleGetLinks4151 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGetLinks4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGetLinks4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBinaryOp4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBinaryOp4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUnaryOp4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleUnaryOp4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUnaryOp4348 = new BitSet(new long[]{0x0000000000000002L});

}