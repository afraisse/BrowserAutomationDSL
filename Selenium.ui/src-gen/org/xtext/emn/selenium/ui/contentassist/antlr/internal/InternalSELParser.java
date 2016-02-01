package org.xtext.emn.selenium.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.emn.selenium.services.SELGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSELParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Contains'", "'Equals'", "'IsChecked'", "'IsEnabled'", "'Exists'", "'Test'", "'{'", "'}'", "'Sequence'", "'('", "')'", "','", "'ForAll'", "'Do {'", "'} While ('", "'If'", "'Else {'", "'='", "'Exec'", "'Fill'", "'with'", "'Check'", "'Click'", "'Verify'", "'GoTo'", "'Not'", "'GetButton'", "'GetLink'", "'GetCheckbox'", "'GetText'", "'GetButtons'", "'GetCheckboxes'", "'GetLinks'"
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
    public String getGrammarFileName() { return "../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g"; }


     
     	private SELGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SELGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:61:1: ( ruleProgram EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:69:1: ruleProgram : ( ( rule__Program__Alternatives )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:73:2: ( ( ( rule__Program__Alternatives )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:74:1: ( ( rule__Program__Alternatives )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:74:1: ( ( rule__Program__Alternatives )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:75:1: ( rule__Program__Alternatives )*
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:76:1: ( rule__Program__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:76:2: rule__Program__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Program__Alternatives_in_ruleProgram94);
            	    rule__Program__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleTest"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:88:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:89:1: ( ruleTest EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:90:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest122);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:97:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:101:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:102:1: ( ( rule__Test__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:102:1: ( ( rule__Test__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:103:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:104:1: ( rule__Test__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:104:2: rule__Test__Group__0
            {
            pushFollow(FOLLOW_rule__Test__Group__0_in_ruleTest155);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleSequence"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:116:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:117:1: ( ruleSequence EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:118:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence182);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:125:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:129:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:130:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:130:1: ( ( rule__Sequence__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:131:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:132:1: ( rule__Sequence__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:132:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence215);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleVariable"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:144:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:145:1: ( ruleVariable EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:146:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable242);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:153:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:157:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:158:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:158:1: ( ( rule__Variable__NameAssignment ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:159:1: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:160:1: ( rule__Variable__NameAssignment )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:160:2: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__NameAssignment_in_ruleVariable275);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleInstruction"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:172:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:173:1: ( ruleInstruction EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:174:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction302);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:181:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:185:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:186:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:186:1: ( ( rule__Instruction__Alternatives ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:187:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:188:1: ( rule__Instruction__Alternatives )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:188:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction335);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleForAll"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:200:1: entryRuleForAll : ruleForAll EOF ;
    public final void entryRuleForAll() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:201:1: ( ruleForAll EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:202:1: ruleForAll EOF
            {
             before(grammarAccess.getForAllRule()); 
            pushFollow(FOLLOW_ruleForAll_in_entryRuleForAll362);
            ruleForAll();

            state._fsp--;

             after(grammarAccess.getForAllRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForAll369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForAll"


    // $ANTLR start "ruleForAll"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:209:1: ruleForAll : ( ( rule__ForAll__Group__0 ) ) ;
    public final void ruleForAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:213:2: ( ( ( rule__ForAll__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:214:1: ( ( rule__ForAll__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:214:1: ( ( rule__ForAll__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:215:1: ( rule__ForAll__Group__0 )
            {
             before(grammarAccess.getForAllAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:216:1: ( rule__ForAll__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:216:2: rule__ForAll__Group__0
            {
            pushFollow(FOLLOW_rule__ForAll__Group__0_in_ruleForAll395);
            rule__ForAll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAllAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForAll"


    // $ANTLR start "entryRuleDoWhile"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:228:1: entryRuleDoWhile : ruleDoWhile EOF ;
    public final void entryRuleDoWhile() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:229:1: ( ruleDoWhile EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:230:1: ruleDoWhile EOF
            {
             before(grammarAccess.getDoWhileRule()); 
            pushFollow(FOLLOW_ruleDoWhile_in_entryRuleDoWhile422);
            ruleDoWhile();

            state._fsp--;

             after(grammarAccess.getDoWhileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhile429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoWhile"


    // $ANTLR start "ruleDoWhile"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:237:1: ruleDoWhile : ( ( rule__DoWhile__Group__0 ) ) ;
    public final void ruleDoWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:241:2: ( ( ( rule__DoWhile__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:242:1: ( ( rule__DoWhile__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:242:1: ( ( rule__DoWhile__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:243:1: ( rule__DoWhile__Group__0 )
            {
             before(grammarAccess.getDoWhileAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:244:1: ( rule__DoWhile__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:244:2: rule__DoWhile__Group__0
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__0_in_ruleDoWhile455);
            rule__DoWhile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoWhile"


    // $ANTLR start "entryRuleIfThenElse"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:256:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:257:1: ( ruleIfThenElse EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:258:1: ruleIfThenElse EOF
            {
             before(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse482);
            ruleIfThenElse();

            state._fsp--;

             after(grammarAccess.getIfThenElseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:265:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:269:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:270:1: ( ( rule__IfThenElse__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:270:1: ( ( rule__IfThenElse__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:271:1: ( rule__IfThenElse__Group__0 )
            {
             before(grammarAccess.getIfThenElseAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:272:1: ( rule__IfThenElse__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:272:2: rule__IfThenElse__Group__0
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse515);
            rule__IfThenElse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleAffectation"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:284:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:285:1: ( ruleAffectation EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:286:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_ruleAffectation_in_entryRuleAffectation542);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAffectation549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:293:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:297:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:298:1: ( ( rule__Affectation__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:298:1: ( ( rule__Affectation__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:299:1: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:300:1: ( rule__Affectation__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:300:2: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0_in_ruleAffectation575);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleExec"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:312:1: entryRuleExec : ruleExec EOF ;
    public final void entryRuleExec() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:313:1: ( ruleExec EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:314:1: ruleExec EOF
            {
             before(grammarAccess.getExecRule()); 
            pushFollow(FOLLOW_ruleExec_in_entryRuleExec602);
            ruleExec();

            state._fsp--;

             after(grammarAccess.getExecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExec609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExec"


    // $ANTLR start "ruleExec"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:321:1: ruleExec : ( ( rule__Exec__Group__0 ) ) ;
    public final void ruleExec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:325:2: ( ( ( rule__Exec__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:326:1: ( ( rule__Exec__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:326:1: ( ( rule__Exec__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:327:1: ( rule__Exec__Group__0 )
            {
             before(grammarAccess.getExecAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:328:1: ( rule__Exec__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:328:2: rule__Exec__Group__0
            {
            pushFollow(FOLLOW_rule__Exec__Group__0_in_ruleExec635);
            rule__Exec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExec"


    // $ANTLR start "entryRuleFill"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:340:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:341:1: ( ruleFill EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:342:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill662);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:349:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:353:2: ( ( ( rule__Fill__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:354:1: ( ( rule__Fill__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:354:1: ( ( rule__Fill__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:355:1: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:356:1: ( rule__Fill__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:356:2: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_rule__Fill__Group__0_in_ruleFill695);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleCheck"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:368:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:369:1: ( ruleCheck EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:370:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck722);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:377:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:381:2: ( ( ( rule__Check__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:382:1: ( ( rule__Check__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:382:1: ( ( rule__Check__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:383:1: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:384:1: ( rule__Check__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:384:2: rule__Check__Group__0
            {
            pushFollow(FOLLOW_rule__Check__Group__0_in_ruleCheck755);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleClick"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:396:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:397:1: ( ruleClick EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:398:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_ruleClick_in_entryRuleClick782);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClick789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:405:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:409:2: ( ( ( rule__Click__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:410:1: ( ( rule__Click__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:410:1: ( ( rule__Click__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:411:1: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:412:1: ( rule__Click__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:412:2: rule__Click__Group__0
            {
            pushFollow(FOLLOW_rule__Click__Group__0_in_ruleClick815);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleVerify"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:424:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:425:1: ( ruleVerify EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:426:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_ruleVerify_in_entryRuleVerify842);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerify849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:433:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:437:2: ( ( ( rule__Verify__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:438:1: ( ( rule__Verify__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:438:1: ( ( rule__Verify__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:439:1: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:440:1: ( rule__Verify__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:440:2: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_rule__Verify__Group__0_in_ruleVerify875);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleGoTo"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:452:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:453:1: ( ruleGoTo EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:454:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_ruleGoTo_in_entryRuleGoTo902);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoTo909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:461:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:465:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:466:1: ( ( rule__GoTo__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:466:1: ( ( rule__GoTo__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:467:1: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:468:1: ( rule__GoTo__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:468:2: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_rule__GoTo__Group__0_in_ruleGoTo935);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:480:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:481:1: ( ruleCondition EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:482:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition962);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:489:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:493:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:494:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:494:1: ( ( rule__Condition__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:495:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:496:1: ( rule__Condition__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:496:2: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_rule__Condition__Group__0_in_ruleCondition995);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleUnaryCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:508:1: entryRuleUnaryCondition : ruleUnaryCondition EOF ;
    public final void entryRuleUnaryCondition() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:509:1: ( ruleUnaryCondition EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:510:1: ruleUnaryCondition EOF
            {
             before(grammarAccess.getUnaryConditionRule()); 
            pushFollow(FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition1022);
            ruleUnaryCondition();

            state._fsp--;

             after(grammarAccess.getUnaryConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryCondition1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryCondition"


    // $ANTLR start "ruleUnaryCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:517:1: ruleUnaryCondition : ( ( rule__UnaryCondition__Group__0 ) ) ;
    public final void ruleUnaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:521:2: ( ( ( rule__UnaryCondition__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:522:1: ( ( rule__UnaryCondition__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:522:1: ( ( rule__UnaryCondition__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:523:1: ( rule__UnaryCondition__Group__0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:524:1: ( rule__UnaryCondition__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:524:2: rule__UnaryCondition__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryCondition__Group__0_in_ruleUnaryCondition1055);
            rule__UnaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:536:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:537:1: ( ruleBinaryCondition EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:538:1: ruleBinaryCondition EOF
            {
             before(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition1082);
            ruleBinaryCondition();

            state._fsp--;

             after(grammarAccess.getBinaryConditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryCondition1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:545:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Group__0 ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:549:2: ( ( ( rule__BinaryCondition__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:550:1: ( ( rule__BinaryCondition__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:550:1: ( ( rule__BinaryCondition__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:551:1: ( rule__BinaryCondition__Group__0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:552:1: ( rule__BinaryCondition__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:552:2: rule__BinaryCondition__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__0_in_ruleBinaryCondition1115);
            rule__BinaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleElem"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:564:1: entryRuleElem : ruleElem EOF ;
    public final void entryRuleElem() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:565:1: ( ruleElem EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:566:1: ruleElem EOF
            {
             before(grammarAccess.getElemRule()); 
            pushFollow(FOLLOW_ruleElem_in_entryRuleElem1142);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getElemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElem1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElem"


    // $ANTLR start "ruleElem"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:573:1: ruleElem : ( ( rule__Elem__Alternatives ) ) ;
    public final void ruleElem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:577:2: ( ( ( rule__Elem__Alternatives ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:578:1: ( ( rule__Elem__Alternatives ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:578:1: ( ( rule__Elem__Alternatives ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:579:1: ( rule__Elem__Alternatives )
            {
             before(grammarAccess.getElemAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:580:1: ( rule__Elem__Alternatives )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:580:2: rule__Elem__Alternatives
            {
            pushFollow(FOLLOW_rule__Elem__Alternatives_in_ruleElem1175);
            rule__Elem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElem"


    // $ANTLR start "entryRuleGetButton"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:592:1: entryRuleGetButton : ruleGetButton EOF ;
    public final void entryRuleGetButton() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:593:1: ( ruleGetButton EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:594:1: ruleGetButton EOF
            {
             before(grammarAccess.getGetButtonRule()); 
            pushFollow(FOLLOW_ruleGetButton_in_entryRuleGetButton1202);
            ruleGetButton();

            state._fsp--;

             after(grammarAccess.getGetButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetButton1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetButton"


    // $ANTLR start "ruleGetButton"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:601:1: ruleGetButton : ( ( rule__GetButton__Group__0 ) ) ;
    public final void ruleGetButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:605:2: ( ( ( rule__GetButton__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:606:1: ( ( rule__GetButton__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:606:1: ( ( rule__GetButton__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:607:1: ( rule__GetButton__Group__0 )
            {
             before(grammarAccess.getGetButtonAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:608:1: ( rule__GetButton__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:608:2: rule__GetButton__Group__0
            {
            pushFollow(FOLLOW_rule__GetButton__Group__0_in_ruleGetButton1235);
            rule__GetButton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetButton"


    // $ANTLR start "entryRuleGetLink"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:620:1: entryRuleGetLink : ruleGetLink EOF ;
    public final void entryRuleGetLink() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:621:1: ( ruleGetLink EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:622:1: ruleGetLink EOF
            {
             before(grammarAccess.getGetLinkRule()); 
            pushFollow(FOLLOW_ruleGetLink_in_entryRuleGetLink1262);
            ruleGetLink();

            state._fsp--;

             after(grammarAccess.getGetLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetLink1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetLink"


    // $ANTLR start "ruleGetLink"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:629:1: ruleGetLink : ( ( rule__GetLink__Group__0 ) ) ;
    public final void ruleGetLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:633:2: ( ( ( rule__GetLink__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:634:1: ( ( rule__GetLink__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:634:1: ( ( rule__GetLink__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:635:1: ( rule__GetLink__Group__0 )
            {
             before(grammarAccess.getGetLinkAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:636:1: ( rule__GetLink__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:636:2: rule__GetLink__Group__0
            {
            pushFollow(FOLLOW_rule__GetLink__Group__0_in_ruleGetLink1295);
            rule__GetLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetLink"


    // $ANTLR start "entryRuleGetCheckbox"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:648:1: entryRuleGetCheckbox : ruleGetCheckbox EOF ;
    public final void entryRuleGetCheckbox() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:649:1: ( ruleGetCheckbox EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:650:1: ruleGetCheckbox EOF
            {
             before(grammarAccess.getGetCheckboxRule()); 
            pushFollow(FOLLOW_ruleGetCheckbox_in_entryRuleGetCheckbox1322);
            ruleGetCheckbox();

            state._fsp--;

             after(grammarAccess.getGetCheckboxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetCheckbox1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetCheckbox"


    // $ANTLR start "ruleGetCheckbox"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:657:1: ruleGetCheckbox : ( ( rule__GetCheckbox__Group__0 ) ) ;
    public final void ruleGetCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:661:2: ( ( ( rule__GetCheckbox__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:662:1: ( ( rule__GetCheckbox__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:662:1: ( ( rule__GetCheckbox__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:663:1: ( rule__GetCheckbox__Group__0 )
            {
             before(grammarAccess.getGetCheckboxAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:664:1: ( rule__GetCheckbox__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:664:2: rule__GetCheckbox__Group__0
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Group__0_in_ruleGetCheckbox1355);
            rule__GetCheckbox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetCheckboxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetCheckbox"


    // $ANTLR start "entryRuleGetText"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:676:1: entryRuleGetText : ruleGetText EOF ;
    public final void entryRuleGetText() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:677:1: ( ruleGetText EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:678:1: ruleGetText EOF
            {
             before(grammarAccess.getGetTextRule()); 
            pushFollow(FOLLOW_ruleGetText_in_entryRuleGetText1382);
            ruleGetText();

            state._fsp--;

             after(grammarAccess.getGetTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetText1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetText"


    // $ANTLR start "ruleGetText"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:685:1: ruleGetText : ( ( rule__GetText__Group__0 ) ) ;
    public final void ruleGetText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:689:2: ( ( ( rule__GetText__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:690:1: ( ( rule__GetText__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:690:1: ( ( rule__GetText__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:691:1: ( rule__GetText__Group__0 )
            {
             before(grammarAccess.getGetTextAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:692:1: ( rule__GetText__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:692:2: rule__GetText__Group__0
            {
            pushFollow(FOLLOW_rule__GetText__Group__0_in_ruleGetText1415);
            rule__GetText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetText"


    // $ANTLR start "entryRuleElems"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:704:1: entryRuleElems : ruleElems EOF ;
    public final void entryRuleElems() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:705:1: ( ruleElems EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:706:1: ruleElems EOF
            {
             before(grammarAccess.getElemsRule()); 
            pushFollow(FOLLOW_ruleElems_in_entryRuleElems1442);
            ruleElems();

            state._fsp--;

             after(grammarAccess.getElemsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElems1449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElems"


    // $ANTLR start "ruleElems"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:713:1: ruleElems : ( ( rule__Elems__Alternatives ) ) ;
    public final void ruleElems() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:717:2: ( ( ( rule__Elems__Alternatives ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:718:1: ( ( rule__Elems__Alternatives ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:718:1: ( ( rule__Elems__Alternatives ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:719:1: ( rule__Elems__Alternatives )
            {
             before(grammarAccess.getElemsAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:720:1: ( rule__Elems__Alternatives )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:720:2: rule__Elems__Alternatives
            {
            pushFollow(FOLLOW_rule__Elems__Alternatives_in_ruleElems1475);
            rule__Elems__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElemsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElems"


    // $ANTLR start "entryRuleGetButtons"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:732:1: entryRuleGetButtons : ruleGetButtons EOF ;
    public final void entryRuleGetButtons() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:733:1: ( ruleGetButtons EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:734:1: ruleGetButtons EOF
            {
             before(grammarAccess.getGetButtonsRule()); 
            pushFollow(FOLLOW_ruleGetButtons_in_entryRuleGetButtons1502);
            ruleGetButtons();

            state._fsp--;

             after(grammarAccess.getGetButtonsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetButtons1509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetButtons"


    // $ANTLR start "ruleGetButtons"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:741:1: ruleGetButtons : ( ( rule__GetButtons__Group__0 ) ) ;
    public final void ruleGetButtons() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:745:2: ( ( ( rule__GetButtons__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:746:1: ( ( rule__GetButtons__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:746:1: ( ( rule__GetButtons__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:747:1: ( rule__GetButtons__Group__0 )
            {
             before(grammarAccess.getGetButtonsAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:748:1: ( rule__GetButtons__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:748:2: rule__GetButtons__Group__0
            {
            pushFollow(FOLLOW_rule__GetButtons__Group__0_in_ruleGetButtons1535);
            rule__GetButtons__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetButtonsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetButtons"


    // $ANTLR start "entryRuleGetCheckboxes"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:760:1: entryRuleGetCheckboxes : ruleGetCheckboxes EOF ;
    public final void entryRuleGetCheckboxes() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:761:1: ( ruleGetCheckboxes EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:762:1: ruleGetCheckboxes EOF
            {
             before(grammarAccess.getGetCheckboxesRule()); 
            pushFollow(FOLLOW_ruleGetCheckboxes_in_entryRuleGetCheckboxes1562);
            ruleGetCheckboxes();

            state._fsp--;

             after(grammarAccess.getGetCheckboxesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetCheckboxes1569); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetCheckboxes"


    // $ANTLR start "ruleGetCheckboxes"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:769:1: ruleGetCheckboxes : ( ( rule__GetCheckboxes__Group__0 ) ) ;
    public final void ruleGetCheckboxes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:773:2: ( ( ( rule__GetCheckboxes__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:774:1: ( ( rule__GetCheckboxes__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:774:1: ( ( rule__GetCheckboxes__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:775:1: ( rule__GetCheckboxes__Group__0 )
            {
             before(grammarAccess.getGetCheckboxesAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:776:1: ( rule__GetCheckboxes__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:776:2: rule__GetCheckboxes__Group__0
            {
            pushFollow(FOLLOW_rule__GetCheckboxes__Group__0_in_ruleGetCheckboxes1595);
            rule__GetCheckboxes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetCheckboxesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetCheckboxes"


    // $ANTLR start "entryRuleGetLinks"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:788:1: entryRuleGetLinks : ruleGetLinks EOF ;
    public final void entryRuleGetLinks() throws RecognitionException {
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:789:1: ( ruleGetLinks EOF )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:790:1: ruleGetLinks EOF
            {
             before(grammarAccess.getGetLinksRule()); 
            pushFollow(FOLLOW_ruleGetLinks_in_entryRuleGetLinks1622);
            ruleGetLinks();

            state._fsp--;

             after(grammarAccess.getGetLinksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetLinks1629); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGetLinks"


    // $ANTLR start "ruleGetLinks"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:797:1: ruleGetLinks : ( ( rule__GetLinks__Group__0 ) ) ;
    public final void ruleGetLinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:801:2: ( ( ( rule__GetLinks__Group__0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:802:1: ( ( rule__GetLinks__Group__0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:802:1: ( ( rule__GetLinks__Group__0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:803:1: ( rule__GetLinks__Group__0 )
            {
             before(grammarAccess.getGetLinksAccess().getGroup()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:804:1: ( rule__GetLinks__Group__0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:804:2: rule__GetLinks__Group__0
            {
            pushFollow(FOLLOW_rule__GetLinks__Group__0_in_ruleGetLinks1655);
            rule__GetLinks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGetLinksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGetLinks"


    // $ANTLR start "ruleBinaryOp"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:817:1: ruleBinaryOp : ( ( rule__BinaryOp__Alternatives ) ) ;
    public final void ruleBinaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:821:1: ( ( ( rule__BinaryOp__Alternatives ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:822:1: ( ( rule__BinaryOp__Alternatives ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:822:1: ( ( rule__BinaryOp__Alternatives ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:823:1: ( rule__BinaryOp__Alternatives )
            {
             before(grammarAccess.getBinaryOpAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:824:1: ( rule__BinaryOp__Alternatives )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:824:2: rule__BinaryOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1692);
            rule__BinaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOp"


    // $ANTLR start "ruleUnaryOp"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:836:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:840:1: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:841:1: ( ( rule__UnaryOp__Alternatives ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:841:1: ( ( rule__UnaryOp__Alternatives ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:842:1: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:843:1: ( rule__UnaryOp__Alternatives )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:843:2: rule__UnaryOp__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryOp__Alternatives_in_ruleUnaryOp1728);
            rule__UnaryOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "rule__Program__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:854:1: rule__Program__Alternatives : ( ( ( rule__Program__SequencesAssignment_0 ) ) | ( ( rule__Program__TestsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:858:1: ( ( ( rule__Program__SequencesAssignment_0 ) ) | ( ( rule__Program__TestsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:859:1: ( ( rule__Program__SequencesAssignment_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:859:1: ( ( rule__Program__SequencesAssignment_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:860:1: ( rule__Program__SequencesAssignment_0 )
                    {
                     before(grammarAccess.getProgramAccess().getSequencesAssignment_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:861:1: ( rule__Program__SequencesAssignment_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:861:2: rule__Program__SequencesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Program__SequencesAssignment_0_in_rule__Program__Alternatives1763);
                    rule__Program__SequencesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getSequencesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:865:6: ( ( rule__Program__TestsAssignment_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:865:6: ( ( rule__Program__TestsAssignment_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:866:1: ( rule__Program__TestsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getTestsAssignment_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:867:1: ( rule__Program__TestsAssignment_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:867:2: rule__Program__TestsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__TestsAssignment_1_in_rule__Program__Alternatives1781);
                    rule__Program__TestsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getTestsAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:876:1: rule__Instruction__Alternatives : ( ( ruleSequence ) | ( ruleForAll ) | ( ruleDoWhile ) | ( ruleIfThenElse ) | ( ruleAffectation ) | ( ruleExec ) | ( ruleFill ) | ( ruleCheck ) | ( ruleClick ) | ( ruleVerify ) | ( ruleGoTo ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:880:1: ( ( ruleSequence ) | ( ruleForAll ) | ( ruleDoWhile ) | ( ruleIfThenElse ) | ( ruleAffectation ) | ( ruleExec ) | ( ruleFill ) | ( ruleCheck ) | ( ruleClick ) | ( ruleVerify ) | ( ruleGoTo ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case RULE_ID:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            case 32:
                {
                alt3=8;
                }
                break;
            case 33:
                {
                alt3=9;
                }
                break;
            case 34:
                {
                alt3=10;
                }
                break;
            case 35:
                {
                alt3=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:881:1: ( ruleSequence )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:881:1: ( ruleSequence )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:882:1: ruleSequence
                    {
                     before(grammarAccess.getInstructionAccess().getSequenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSequence_in_rule__Instruction__Alternatives1814);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSequenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:887:6: ( ruleForAll )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:887:6: ( ruleForAll )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:888:1: ruleForAll
                    {
                     before(grammarAccess.getInstructionAccess().getForAllParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForAll_in_rule__Instruction__Alternatives1831);
                    ruleForAll();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getForAllParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:893:6: ( ruleDoWhile )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:893:6: ( ruleDoWhile )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:894:1: ruleDoWhile
                    {
                     before(grammarAccess.getInstructionAccess().getDoWhileParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDoWhile_in_rule__Instruction__Alternatives1848);
                    ruleDoWhile();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDoWhileParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:899:6: ( ruleIfThenElse )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:899:6: ( ruleIfThenElse )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:900:1: ruleIfThenElse
                    {
                     before(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleIfThenElse_in_rule__Instruction__Alternatives1865);
                    ruleIfThenElse();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:905:6: ( ruleAffectation )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:905:6: ( ruleAffectation )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:906:1: ruleAffectation
                    {
                     before(grammarAccess.getInstructionAccess().getAffectationParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAffectation_in_rule__Instruction__Alternatives1882);
                    ruleAffectation();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAffectationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:911:6: ( ruleExec )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:911:6: ( ruleExec )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:912:1: ruleExec
                    {
                     before(grammarAccess.getInstructionAccess().getExecParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleExec_in_rule__Instruction__Alternatives1899);
                    ruleExec();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExecParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:917:6: ( ruleFill )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:917:6: ( ruleFill )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:918:1: ruleFill
                    {
                     before(grammarAccess.getInstructionAccess().getFillParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFill_in_rule__Instruction__Alternatives1916);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFillParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:923:6: ( ruleCheck )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:923:6: ( ruleCheck )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:924:1: ruleCheck
                    {
                     before(grammarAccess.getInstructionAccess().getCheckParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleCheck_in_rule__Instruction__Alternatives1933);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCheckParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:929:6: ( ruleClick )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:929:6: ( ruleClick )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:930:1: ruleClick
                    {
                     before(grammarAccess.getInstructionAccess().getClickParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleClick_in_rule__Instruction__Alternatives1950);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getClickParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:935:6: ( ruleVerify )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:935:6: ( ruleVerify )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:936:1: ruleVerify
                    {
                     before(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleVerify_in_rule__Instruction__Alternatives1967);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:941:6: ( ruleGoTo )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:941:6: ( ruleGoTo )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:942:1: ruleGoTo
                    {
                     before(grammarAccess.getInstructionAccess().getGoToParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleGoTo_in_rule__Instruction__Alternatives1984);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getGoToParserRuleCall_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Fill__Alternatives_3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:952:1: rule__Fill__Alternatives_3 : ( ( ( rule__Fill__ValueAssignment_3_0 ) ) | ( ( rule__Fill__ParamAssignment_3_1 ) ) );
    public final void rule__Fill__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:956:1: ( ( ( rule__Fill__ValueAssignment_3_0 ) ) | ( ( rule__Fill__ParamAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:957:1: ( ( rule__Fill__ValueAssignment_3_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:957:1: ( ( rule__Fill__ValueAssignment_3_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:958:1: ( rule__Fill__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getFillAccess().getValueAssignment_3_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:959:1: ( rule__Fill__ValueAssignment_3_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:959:2: rule__Fill__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Fill__ValueAssignment_3_0_in_rule__Fill__Alternatives_32016);
                    rule__Fill__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:963:6: ( ( rule__Fill__ParamAssignment_3_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:963:6: ( ( rule__Fill__ParamAssignment_3_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:964:1: ( rule__Fill__ParamAssignment_3_1 )
                    {
                     before(grammarAccess.getFillAccess().getParamAssignment_3_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:965:1: ( rule__Fill__ParamAssignment_3_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:965:2: rule__Fill__ParamAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Fill__ParamAssignment_3_1_in_rule__Fill__Alternatives_32034);
                    rule__Fill__ParamAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillAccess().getParamAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Alternatives_3"


    // $ANTLR start "rule__Check__CheckboxAlternatives_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:974:1: rule__Check__CheckboxAlternatives_1_0 : ( ( ruleGetCheckbox ) | ( () ) );
    public final void rule__Check__CheckboxAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:978:1: ( ( ruleGetCheckbox ) | ( () ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==39) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==RULE_ID||(LA5_0>=18 && LA5_0<=19)||(LA5_0>=23 && LA5_0<=26)||(LA5_0>=29 && LA5_0<=30)||(LA5_0>=32 && LA5_0<=35)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:979:1: ( ruleGetCheckbox )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:979:1: ( ruleGetCheckbox )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:980:1: ruleGetCheckbox
                    {
                     before(grammarAccess.getCheckAccess().getCheckboxGetCheckboxParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleGetCheckbox_in_rule__Check__CheckboxAlternatives_1_02067);
                    ruleGetCheckbox();

                    state._fsp--;

                     after(grammarAccess.getCheckAccess().getCheckboxGetCheckboxParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:985:6: ( () )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:985:6: ( () )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:986:1: ()
                    {
                     before(grammarAccess.getCheckAccess().getCheckboxVariableCrossReference_1_0_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:987:1: ()
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:989:1: 
                    {
                    }

                     after(grammarAccess.getCheckAccess().getCheckboxVariableCrossReference_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__CheckboxAlternatives_1_0"


    // $ANTLR start "rule__GoTo__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:998:1: rule__GoTo__Alternatives_1 : ( ( ( rule__GoTo__ValueAssignment_1_0 ) ) | ( ( rule__GoTo__LinkAssignment_1_1 ) ) );
    public final void rule__GoTo__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1002:1: ( ( ( rule__GoTo__ValueAssignment_1_0 ) ) | ( ( rule__GoTo__LinkAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==RULE_ID||(LA6_0>=18 && LA6_0<=19)||(LA6_0>=23 && LA6_0<=26)||(LA6_0>=29 && LA6_0<=30)||(LA6_0>=32 && LA6_0<=35)||LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1003:1: ( ( rule__GoTo__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1003:1: ( ( rule__GoTo__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1004:1: ( rule__GoTo__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGoToAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1005:1: ( rule__GoTo__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1005:2: rule__GoTo__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GoTo__ValueAssignment_1_0_in_rule__GoTo__Alternatives_12118);
                    rule__GoTo__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoToAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1009:6: ( ( rule__GoTo__LinkAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1009:6: ( ( rule__GoTo__LinkAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1010:1: ( rule__GoTo__LinkAssignment_1_1 )
                    {
                     before(grammarAccess.getGoToAccess().getLinkAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1011:1: ( rule__GoTo__LinkAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1011:2: rule__GoTo__LinkAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GoTo__LinkAssignment_1_1_in_rule__GoTo__Alternatives_12136);
                    rule__GoTo__LinkAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoToAccess().getLinkAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Alternatives_1"


    // $ANTLR start "rule__GoTo__LinkAlternatives_1_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1020:1: rule__GoTo__LinkAlternatives_1_1_0 : ( ( () ) | ( ruleGetLink ) );
    public final void rule__GoTo__LinkAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1024:1: ( ( () ) | ( ruleGetLink ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==RULE_ID||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=23 && LA7_0<=26)||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=32 && LA7_0<=35)) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1025:1: ( () )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1025:1: ( () )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1026:1: ()
                    {
                     before(grammarAccess.getGoToAccess().getLinkVariableCrossReference_1_1_0_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1027:1: ()
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1029:1: 
                    {
                    }

                     after(grammarAccess.getGoToAccess().getLinkVariableCrossReference_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1033:6: ( ruleGetLink )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1033:6: ( ruleGetLink )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1034:1: ruleGetLink
                    {
                     before(grammarAccess.getGoToAccess().getLinkGetLinkParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleGetLink_in_rule__GoTo__LinkAlternatives_1_1_02188);
                    ruleGetLink();

                    state._fsp--;

                     after(grammarAccess.getGoToAccess().getLinkGetLinkParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__LinkAlternatives_1_1_0"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1044:1: rule__Condition__Alternatives_1 : ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1048:1: ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=13 && LA8_0<=15)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||(LA8_0>=37 && LA8_0<=40)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1049:1: ( ruleUnaryCondition )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1049:1: ( ruleUnaryCondition )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1050:1: ruleUnaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleUnaryCondition_in_rule__Condition__Alternatives_12220);
                    ruleUnaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1055:6: ( ruleBinaryCondition )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1055:6: ( ruleBinaryCondition )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1056:1: ruleBinaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives_12237);
                    ruleBinaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__BinaryCondition__Alternatives_2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1066:1: rule__BinaryCondition__Alternatives_2 : ( ( ( rule__BinaryCondition__ValueAssignment_2_0 ) ) | ( ( rule__BinaryCondition__ParamAssignment_2_1 ) ) );
    public final void rule__BinaryCondition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1070:1: ( ( ( rule__BinaryCondition__ValueAssignment_2_0 ) ) | ( ( rule__BinaryCondition__ParamAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1071:1: ( ( rule__BinaryCondition__ValueAssignment_2_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1071:1: ( ( rule__BinaryCondition__ValueAssignment_2_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1072:1: ( rule__BinaryCondition__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getBinaryConditionAccess().getValueAssignment_2_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1073:1: ( rule__BinaryCondition__ValueAssignment_2_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1073:2: rule__BinaryCondition__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BinaryCondition__ValueAssignment_2_0_in_rule__BinaryCondition__Alternatives_22269);
                    rule__BinaryCondition__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConditionAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1077:6: ( ( rule__BinaryCondition__ParamAssignment_2_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1077:6: ( ( rule__BinaryCondition__ParamAssignment_2_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1078:1: ( rule__BinaryCondition__ParamAssignment_2_1 )
                    {
                     before(grammarAccess.getBinaryConditionAccess().getParamAssignment_2_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1079:1: ( rule__BinaryCondition__ParamAssignment_2_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1079:2: rule__BinaryCondition__ParamAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__BinaryCondition__ParamAssignment_2_1_in_rule__BinaryCondition__Alternatives_22287);
                    rule__BinaryCondition__ParamAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConditionAccess().getParamAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Alternatives_2"


    // $ANTLR start "rule__Elem__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1088:1: rule__Elem__Alternatives : ( ( ruleGetButton ) | ( ruleGetLink ) | ( ruleGetCheckbox ) | ( ruleGetText ) | ( ruleVariable ) );
    public final void rule__Elem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1092:1: ( ( ruleGetButton ) | ( ruleGetLink ) | ( ruleGetCheckbox ) | ( ruleGetText ) | ( ruleVariable ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1093:1: ( ruleGetButton )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1093:1: ( ruleGetButton )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1094:1: ruleGetButton
                    {
                     before(grammarAccess.getElemAccess().getGetButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetButton_in_rule__Elem__Alternatives2320);
                    ruleGetButton();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1099:6: ( ruleGetLink )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1099:6: ( ruleGetLink )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1100:1: ruleGetLink
                    {
                     before(grammarAccess.getElemAccess().getGetLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGetLink_in_rule__Elem__Alternatives2337);
                    ruleGetLink();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetLinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1105:6: ( ruleGetCheckbox )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1105:6: ( ruleGetCheckbox )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1106:1: ruleGetCheckbox
                    {
                     before(grammarAccess.getElemAccess().getGetCheckboxParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGetCheckbox_in_rule__Elem__Alternatives2354);
                    ruleGetCheckbox();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetCheckboxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1111:6: ( ruleGetText )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1111:6: ( ruleGetText )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1112:1: ruleGetText
                    {
                     before(grammarAccess.getElemAccess().getGetTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGetText_in_rule__Elem__Alternatives2371);
                    ruleGetText();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetTextParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1117:6: ( ruleVariable )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1117:6: ( ruleVariable )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1118:1: ruleVariable
                    {
                     before(grammarAccess.getElemAccess().getVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleVariable_in_rule__Elem__Alternatives2388);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getVariableParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elem__Alternatives"


    // $ANTLR start "rule__GetButton__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1128:1: rule__GetButton__Alternatives_1 : ( ( ( rule__GetButton__ValueAssignment_1_0 ) ) | ( ( rule__GetButton__VarAssignment_1_1 ) ) );
    public final void rule__GetButton__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1132:1: ( ( ( rule__GetButton__ValueAssignment_1_0 ) ) | ( ( rule__GetButton__VarAssignment_1_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1133:1: ( ( rule__GetButton__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1133:1: ( ( rule__GetButton__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1134:1: ( rule__GetButton__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetButtonAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1135:1: ( rule__GetButton__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1135:2: rule__GetButton__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetButton__ValueAssignment_1_0_in_rule__GetButton__Alternatives_12420);
                    rule__GetButton__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1139:6: ( ( rule__GetButton__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1139:6: ( ( rule__GetButton__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1140:1: ( rule__GetButton__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetButtonAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1141:1: ( rule__GetButton__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1141:2: rule__GetButton__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetButton__VarAssignment_1_1_in_rule__GetButton__Alternatives_12438);
                    rule__GetButton__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__Alternatives_1"


    // $ANTLR start "rule__GetLink__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1150:1: rule__GetLink__Alternatives_1 : ( ( ( rule__GetLink__ValueAssignment_1_0 ) ) | ( ( rule__GetLink__VarAssignment_1_1 ) ) );
    public final void rule__GetLink__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1154:1: ( ( ( rule__GetLink__ValueAssignment_1_0 ) ) | ( ( rule__GetLink__VarAssignment_1_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1155:1: ( ( rule__GetLink__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1155:1: ( ( rule__GetLink__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1156:1: ( rule__GetLink__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetLinkAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1157:1: ( rule__GetLink__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1157:2: rule__GetLink__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetLink__ValueAssignment_1_0_in_rule__GetLink__Alternatives_12471);
                    rule__GetLink__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinkAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1161:6: ( ( rule__GetLink__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1161:6: ( ( rule__GetLink__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1162:1: ( rule__GetLink__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetLinkAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1163:1: ( rule__GetLink__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1163:2: rule__GetLink__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetLink__VarAssignment_1_1_in_rule__GetLink__Alternatives_12489);
                    rule__GetLink__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinkAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__Alternatives_1"


    // $ANTLR start "rule__GetCheckbox__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1172:1: rule__GetCheckbox__Alternatives_1 : ( ( ( rule__GetCheckbox__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckbox__VarAssignment_1_1 ) ) );
    public final void rule__GetCheckbox__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1176:1: ( ( ( rule__GetCheckbox__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckbox__VarAssignment_1_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1177:1: ( ( rule__GetCheckbox__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1177:1: ( ( rule__GetCheckbox__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1178:1: ( rule__GetCheckbox__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetCheckboxAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1179:1: ( rule__GetCheckbox__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1179:2: rule__GetCheckbox__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetCheckbox__ValueAssignment_1_0_in_rule__GetCheckbox__Alternatives_12522);
                    rule__GetCheckbox__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1183:6: ( ( rule__GetCheckbox__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1183:6: ( ( rule__GetCheckbox__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1184:1: ( rule__GetCheckbox__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetCheckboxAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1185:1: ( rule__GetCheckbox__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1185:2: rule__GetCheckbox__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckbox__VarAssignment_1_1_in_rule__GetCheckbox__Alternatives_12540);
                    rule__GetCheckbox__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__Alternatives_1"


    // $ANTLR start "rule__GetText__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1194:1: rule__GetText__Alternatives_1 : ( ( ( rule__GetText__ValueAssignment_1_0 ) ) | ( ( rule__GetText__VarAssignment_1_1 ) ) );
    public final void rule__GetText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1198:1: ( ( ( rule__GetText__ValueAssignment_1_0 ) ) | ( ( rule__GetText__VarAssignment_1_1 ) ) )
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
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1199:1: ( ( rule__GetText__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1199:1: ( ( rule__GetText__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1200:1: ( rule__GetText__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetTextAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1201:1: ( rule__GetText__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1201:2: rule__GetText__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetText__ValueAssignment_1_0_in_rule__GetText__Alternatives_12573);
                    rule__GetText__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetTextAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1205:6: ( ( rule__GetText__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1205:6: ( ( rule__GetText__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1206:1: ( rule__GetText__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetTextAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1207:1: ( rule__GetText__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1207:2: rule__GetText__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetText__VarAssignment_1_1_in_rule__GetText__Alternatives_12591);
                    rule__GetText__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetTextAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__Alternatives_1"


    // $ANTLR start "rule__Elems__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1216:1: rule__Elems__Alternatives : ( ( ruleGetButtons ) | ( ruleGetCheckboxes ) | ( ruleGetLinks ) );
    public final void rule__Elems__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1220:1: ( ( ruleGetButtons ) | ( ruleGetCheckboxes ) | ( ruleGetLinks ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt15=1;
                }
                break;
            case 42:
                {
                alt15=2;
                }
                break;
            case 43:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1221:1: ( ruleGetButtons )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1221:1: ( ruleGetButtons )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1222:1: ruleGetButtons
                    {
                     before(grammarAccess.getElemsAccess().getGetButtonsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetButtons_in_rule__Elems__Alternatives2624);
                    ruleGetButtons();

                    state._fsp--;

                     after(grammarAccess.getElemsAccess().getGetButtonsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1227:6: ( ruleGetCheckboxes )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1227:6: ( ruleGetCheckboxes )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1228:1: ruleGetCheckboxes
                    {
                     before(grammarAccess.getElemsAccess().getGetCheckboxesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGetCheckboxes_in_rule__Elems__Alternatives2641);
                    ruleGetCheckboxes();

                    state._fsp--;

                     after(grammarAccess.getElemsAccess().getGetCheckboxesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1233:6: ( ruleGetLinks )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1233:6: ( ruleGetLinks )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1234:1: ruleGetLinks
                    {
                     before(grammarAccess.getElemsAccess().getGetLinksParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGetLinks_in_rule__Elems__Alternatives2658);
                    ruleGetLinks();

                    state._fsp--;

                     after(grammarAccess.getElemsAccess().getGetLinksParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elems__Alternatives"


    // $ANTLR start "rule__GetButtons__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1244:1: rule__GetButtons__Alternatives_1 : ( ( ( rule__GetButtons__ValueAssignment_1_0 ) ) | ( ( rule__GetButtons__VarAssignment_1_1 ) ) );
    public final void rule__GetButtons__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1248:1: ( ( ( rule__GetButtons__ValueAssignment_1_0 ) ) | ( ( rule__GetButtons__VarAssignment_1_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
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
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1249:1: ( ( rule__GetButtons__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1249:1: ( ( rule__GetButtons__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1250:1: ( rule__GetButtons__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetButtonsAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1251:1: ( rule__GetButtons__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1251:2: rule__GetButtons__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetButtons__ValueAssignment_1_0_in_rule__GetButtons__Alternatives_12690);
                    rule__GetButtons__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonsAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1255:6: ( ( rule__GetButtons__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1255:6: ( ( rule__GetButtons__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1256:1: ( rule__GetButtons__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetButtonsAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1257:1: ( rule__GetButtons__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1257:2: rule__GetButtons__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetButtons__VarAssignment_1_1_in_rule__GetButtons__Alternatives_12708);
                    rule__GetButtons__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonsAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__Alternatives_1"


    // $ANTLR start "rule__GetCheckboxes__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1266:1: rule__GetCheckboxes__Alternatives_1 : ( ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckboxes__VarAssignment_1_1 ) ) );
    public final void rule__GetCheckboxes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1270:1: ( ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckboxes__VarAssignment_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1271:1: ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1271:1: ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1272:1: ( rule__GetCheckboxes__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetCheckboxesAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1273:1: ( rule__GetCheckboxes__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1273:2: rule__GetCheckboxes__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__ValueAssignment_1_0_in_rule__GetCheckboxes__Alternatives_12741);
                    rule__GetCheckboxes__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxesAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1277:6: ( ( rule__GetCheckboxes__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1277:6: ( ( rule__GetCheckboxes__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1278:1: ( rule__GetCheckboxes__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetCheckboxesAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1279:1: ( rule__GetCheckboxes__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1279:2: rule__GetCheckboxes__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__VarAssignment_1_1_in_rule__GetCheckboxes__Alternatives_12759);
                    rule__GetCheckboxes__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxesAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__Alternatives_1"


    // $ANTLR start "rule__GetLinks__Alternatives_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1288:1: rule__GetLinks__Alternatives_1 : ( ( ( rule__GetLinks__ValueAssignment_1_0 ) ) | ( ( rule__GetLinks__VarAssignment_1_1 ) ) );
    public final void rule__GetLinks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1292:1: ( ( ( rule__GetLinks__ValueAssignment_1_0 ) ) | ( ( rule__GetLinks__VarAssignment_1_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1293:1: ( ( rule__GetLinks__ValueAssignment_1_0 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1293:1: ( ( rule__GetLinks__ValueAssignment_1_0 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1294:1: ( rule__GetLinks__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetLinksAccess().getValueAssignment_1_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1295:1: ( rule__GetLinks__ValueAssignment_1_0 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1295:2: rule__GetLinks__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetLinks__ValueAssignment_1_0_in_rule__GetLinks__Alternatives_12792);
                    rule__GetLinks__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinksAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1299:6: ( ( rule__GetLinks__VarAssignment_1_1 ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1299:6: ( ( rule__GetLinks__VarAssignment_1_1 ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1300:1: ( rule__GetLinks__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetLinksAccess().getVarAssignment_1_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1301:1: ( rule__GetLinks__VarAssignment_1_1 )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1301:2: rule__GetLinks__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetLinks__VarAssignment_1_1_in_rule__GetLinks__Alternatives_12810);
                    rule__GetLinks__VarAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinksAccess().getVarAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__Alternatives_1"


    // $ANTLR start "rule__BinaryOp__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1310:1: rule__BinaryOp__Alternatives : ( ( ( 'Contains' ) ) | ( ( 'Equals' ) ) );
    public final void rule__BinaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1314:1: ( ( ( 'Contains' ) ) | ( ( 'Equals' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            else if ( (LA19_0==12) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1315:1: ( ( 'Contains' ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1315:1: ( ( 'Contains' ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1316:1: ( 'Contains' )
                    {
                     before(grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1317:1: ( 'Contains' )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1317:3: 'Contains'
                    {
                    match(input,11,FOLLOW_11_in_rule__BinaryOp__Alternatives2844); 

                    }

                     after(grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1322:6: ( ( 'Equals' ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1322:6: ( ( 'Equals' ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1323:1: ( 'Equals' )
                    {
                     before(grammarAccess.getBinaryOpAccess().getEqualsEnumLiteralDeclaration_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1324:1: ( 'Equals' )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1324:3: 'Equals'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryOp__Alternatives2865); 

                    }

                     after(grammarAccess.getBinaryOpAccess().getEqualsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOp__Alternatives"


    // $ANTLR start "rule__UnaryOp__Alternatives"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1334:1: rule__UnaryOp__Alternatives : ( ( ( 'IsChecked' ) ) | ( ( 'IsEnabled' ) ) | ( ( 'Exists' ) ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1338:1: ( ( ( 'IsChecked' ) ) | ( ( 'IsEnabled' ) ) | ( ( 'Exists' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case 14:
                {
                alt20=2;
                }
                break;
            case 15:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1339:1: ( ( 'IsChecked' ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1339:1: ( ( 'IsChecked' ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1340:1: ( 'IsChecked' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1341:1: ( 'IsChecked' )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1341:3: 'IsChecked'
                    {
                    match(input,13,FOLLOW_13_in_rule__UnaryOp__Alternatives2901); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1346:6: ( ( 'IsEnabled' ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1346:6: ( ( 'IsEnabled' ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1347:1: ( 'IsEnabled' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1348:1: ( 'IsEnabled' )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1348:3: 'IsEnabled'
                    {
                    match(input,14,FOLLOW_14_in_rule__UnaryOp__Alternatives2922); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1353:6: ( ( 'Exists' ) )
                    {
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1353:6: ( ( 'Exists' ) )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1354:1: ( 'Exists' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getExistsEnumLiteralDeclaration_2()); 
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1355:1: ( 'Exists' )
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1355:3: 'Exists'
                    {
                    match(input,15,FOLLOW_15_in_rule__UnaryOp__Alternatives2943); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getExistsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOp__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1367:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1371:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1372:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__02976);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__1_in_rule__Test__Group__02979);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1379:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1383:1: ( ( 'Test' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1384:1: ( 'Test' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1384:1: ( 'Test' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1385:1: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Test__Group__0__Impl3007); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1398:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1402:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1403:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__13038);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__2_in_rule__Test__Group__13041);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1410:1: rule__Test__Group__1__Impl : ( ( rule__Test__BrowserAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1414:1: ( ( ( rule__Test__BrowserAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1415:1: ( ( rule__Test__BrowserAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1415:1: ( ( rule__Test__BrowserAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1416:1: ( rule__Test__BrowserAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getBrowserAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1417:1: ( rule__Test__BrowserAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1417:2: rule__Test__BrowserAssignment_1
            {
            pushFollow(FOLLOW_rule__Test__BrowserAssignment_1_in_rule__Test__Group__1__Impl3068);
            rule__Test__BrowserAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getBrowserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1427:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1431:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1432:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__23098);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__3_in_rule__Test__Group__23101);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1439:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1443:1: ( ( '{' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1444:1: ( '{' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1444:1: ( '{' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1445:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Test__Group__2__Impl3129); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1458:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1462:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1463:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__33160);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__4_in_rule__Test__Group__33163);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1470:1: rule__Test__Group__3__Impl : ( ( rule__Test__BodyAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1474:1: ( ( ( rule__Test__BodyAssignment_3 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1475:1: ( ( rule__Test__BodyAssignment_3 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1475:1: ( ( rule__Test__BodyAssignment_3 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1476:1: ( rule__Test__BodyAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getBodyAssignment_3()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1477:1: ( rule__Test__BodyAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==19||(LA21_0>=23 && LA21_0<=24)||LA21_0==26||(LA21_0>=29 && LA21_0<=30)||(LA21_0>=32 && LA21_0<=35)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1477:2: rule__Test__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Test__BodyAssignment_3_in_rule__Test__Group__3__Impl3190);
            	    rule__Test__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1487:1: rule__Test__Group__4 : rule__Test__Group__4__Impl ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1491:1: ( rule__Test__Group__4__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1492:2: rule__Test__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__43221);
            rule__Test__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1498:1: rule__Test__Group__4__Impl : ( '}' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1502:1: ( ( '}' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1503:1: ( '}' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1503:1: ( '}' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1504:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Test__Group__4__Impl3249); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1527:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1531:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1532:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03290);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03293);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1539:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1543:1: ( ( 'Sequence' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1544:1: ( 'Sequence' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1544:1: ( 'Sequence' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1545:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__0__Impl3321); 
             after(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1558:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1562:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1563:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13352);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__13355);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1570:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1574:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1575:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1575:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1576:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1577:1: ( rule__Sequence__NameAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1577:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl3382);
            rule__Sequence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1587:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1591:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1592:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__23412);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__23415);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1599:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__Group_2__0 )? ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1603:1: ( ( ( rule__Sequence__Group_2__0 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1604:1: ( ( rule__Sequence__Group_2__0 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1604:1: ( ( rule__Sequence__Group_2__0 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1605:1: ( rule__Sequence__Group_2__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1606:1: ( rule__Sequence__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1606:2: rule__Sequence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_2__0_in_rule__Sequence__Group__2__Impl3442);
                    rule__Sequence__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1616:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1620:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1621:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__33473);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__33476);
            rule__Sequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1628:1: rule__Sequence__Group__3__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1632:1: ( ( '{' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1633:1: ( '{' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1633:1: ( '{' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1634:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Sequence__Group__3__Impl3504); 
             after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1647:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1651:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1652:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43535);
            rule__Sequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__43538);
            rule__Sequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1659:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__BodyAssignment_4 )* ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1663:1: ( ( ( rule__Sequence__BodyAssignment_4 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1664:1: ( ( rule__Sequence__BodyAssignment_4 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1664:1: ( ( rule__Sequence__BodyAssignment_4 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1665:1: ( rule__Sequence__BodyAssignment_4 )*
            {
             before(grammarAccess.getSequenceAccess().getBodyAssignment_4()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1666:1: ( rule__Sequence__BodyAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==19||(LA23_0>=23 && LA23_0<=24)||LA23_0==26||(LA23_0>=29 && LA23_0<=30)||(LA23_0>=32 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1666:2: rule__Sequence__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__BodyAssignment_4_in_rule__Sequence__Group__4__Impl3565);
            	    rule__Sequence__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group__5"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1676:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1680:1: ( rule__Sequence__Group__5__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1681:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__53596);
            rule__Sequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5"


    // $ANTLR start "rule__Sequence__Group__5__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1687:1: rule__Sequence__Group__5__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1691:1: ( ( '}' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1692:1: ( '}' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1692:1: ( '}' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1693:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Sequence__Group__5__Impl3624); 
             after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5__Impl"


    // $ANTLR start "rule__Sequence__Group_2__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1718:1: rule__Sequence__Group_2__0 : rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1 ;
    public final void rule__Sequence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1722:1: ( rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1723:2: rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__0__Impl_in_rule__Sequence__Group_2__03667);
            rule__Sequence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__1_in_rule__Sequence__Group_2__03670);
            rule__Sequence__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__0"


    // $ANTLR start "rule__Sequence__Group_2__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1730:1: rule__Sequence__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Sequence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1734:1: ( ( '(' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1735:1: ( '(' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1735:1: ( '(' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1736:1: '('
            {
             before(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Sequence__Group_2__0__Impl3698); 
             after(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__0__Impl"


    // $ANTLR start "rule__Sequence__Group_2__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1749:1: rule__Sequence__Group_2__1 : rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2 ;
    public final void rule__Sequence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1753:1: ( rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1754:2: rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__1__Impl_in_rule__Sequence__Group_2__13729);
            rule__Sequence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__2_in_rule__Sequence__Group_2__13732);
            rule__Sequence__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__1"


    // $ANTLR start "rule__Sequence__Group_2__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1761:1: rule__Sequence__Group_2__1__Impl : ( ( rule__Sequence__ParametersAssignment_2_1 ) ) ;
    public final void rule__Sequence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1765:1: ( ( ( rule__Sequence__ParametersAssignment_2_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1766:1: ( ( rule__Sequence__ParametersAssignment_2_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1766:1: ( ( rule__Sequence__ParametersAssignment_2_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1767:1: ( rule__Sequence__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getParametersAssignment_2_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1768:1: ( rule__Sequence__ParametersAssignment_2_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1768:2: rule__Sequence__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__ParametersAssignment_2_1_in_rule__Sequence__Group_2__1__Impl3759);
            rule__Sequence__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__1__Impl"


    // $ANTLR start "rule__Sequence__Group_2__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1778:1: rule__Sequence__Group_2__2 : rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3 ;
    public final void rule__Sequence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1782:1: ( rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1783:2: rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__2__Impl_in_rule__Sequence__Group_2__23789);
            rule__Sequence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__3_in_rule__Sequence__Group_2__23792);
            rule__Sequence__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__2"


    // $ANTLR start "rule__Sequence__Group_2__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1790:1: rule__Sequence__Group_2__2__Impl : ( ( rule__Sequence__Group_2_2__0 )* ) ;
    public final void rule__Sequence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1794:1: ( ( ( rule__Sequence__Group_2_2__0 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1795:1: ( ( rule__Sequence__Group_2_2__0 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1795:1: ( ( rule__Sequence__Group_2_2__0 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1796:1: ( rule__Sequence__Group_2_2__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_2_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1797:1: ( rule__Sequence__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==22) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1797:2: rule__Sequence__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__Group_2_2__0_in_rule__Sequence__Group_2__2__Impl3819);
            	    rule__Sequence__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__2__Impl"


    // $ANTLR start "rule__Sequence__Group_2__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1807:1: rule__Sequence__Group_2__3 : rule__Sequence__Group_2__3__Impl ;
    public final void rule__Sequence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1811:1: ( rule__Sequence__Group_2__3__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1812:2: rule__Sequence__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__3__Impl_in_rule__Sequence__Group_2__33850);
            rule__Sequence__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__3"


    // $ANTLR start "rule__Sequence__Group_2__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1818:1: rule__Sequence__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Sequence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1822:1: ( ( ')' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1823:1: ( ')' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1823:1: ( ')' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1824:1: ')'
            {
             before(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Sequence__Group_2__3__Impl3878); 
             after(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2__3__Impl"


    // $ANTLR start "rule__Sequence__Group_2_2__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1845:1: rule__Sequence__Group_2_2__0 : rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1 ;
    public final void rule__Sequence__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1849:1: ( rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1850:2: rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2_2__0__Impl_in_rule__Sequence__Group_2_2__03917);
            rule__Sequence__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2_2__1_in_rule__Sequence__Group_2_2__03920);
            rule__Sequence__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2_2__0"


    // $ANTLR start "rule__Sequence__Group_2_2__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1857:1: rule__Sequence__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Sequence__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1861:1: ( ( ',' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1862:1: ( ',' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1862:1: ( ',' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1863:1: ','
            {
             before(grammarAccess.getSequenceAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Sequence__Group_2_2__0__Impl3948); 
             after(grammarAccess.getSequenceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2_2__0__Impl"


    // $ANTLR start "rule__Sequence__Group_2_2__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1876:1: rule__Sequence__Group_2_2__1 : rule__Sequence__Group_2_2__1__Impl ;
    public final void rule__Sequence__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1880:1: ( rule__Sequence__Group_2_2__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1881:2: rule__Sequence__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2_2__1__Impl_in_rule__Sequence__Group_2_2__13979);
            rule__Sequence__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2_2__1"


    // $ANTLR start "rule__Sequence__Group_2_2__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1887:1: rule__Sequence__Group_2_2__1__Impl : ( ( rule__Sequence__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Sequence__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1891:1: ( ( ( rule__Sequence__ParametersAssignment_2_2_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1892:1: ( ( rule__Sequence__ParametersAssignment_2_2_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1892:1: ( ( rule__Sequence__ParametersAssignment_2_2_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1893:1: ( rule__Sequence__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getParametersAssignment_2_2_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1894:1: ( rule__Sequence__ParametersAssignment_2_2_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1894:2: rule__Sequence__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__ParametersAssignment_2_2_1_in_rule__Sequence__Group_2_2__1__Impl4006);
            rule__Sequence__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_2_2__1__Impl"


    // $ANTLR start "rule__ForAll__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1908:1: rule__ForAll__Group__0 : rule__ForAll__Group__0__Impl rule__ForAll__Group__1 ;
    public final void rule__ForAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1912:1: ( rule__ForAll__Group__0__Impl rule__ForAll__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1913:2: rule__ForAll__Group__0__Impl rule__ForAll__Group__1
            {
            pushFollow(FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04040);
            rule__ForAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04043);
            rule__ForAll__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__0"


    // $ANTLR start "rule__ForAll__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1920:1: rule__ForAll__Group__0__Impl : ( 'ForAll' ) ;
    public final void rule__ForAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1924:1: ( ( 'ForAll' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1925:1: ( 'ForAll' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1925:1: ( 'ForAll' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1926:1: 'ForAll'
            {
             before(grammarAccess.getForAllAccess().getForAllKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ForAll__Group__0__Impl4071); 
             after(grammarAccess.getForAllAccess().getForAllKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__0__Impl"


    // $ANTLR start "rule__ForAll__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1939:1: rule__ForAll__Group__1 : rule__ForAll__Group__1__Impl rule__ForAll__Group__2 ;
    public final void rule__ForAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1943:1: ( rule__ForAll__Group__1__Impl rule__ForAll__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1944:2: rule__ForAll__Group__1__Impl rule__ForAll__Group__2
            {
            pushFollow(FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14102);
            rule__ForAll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__2_in_rule__ForAll__Group__14105);
            rule__ForAll__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__1"


    // $ANTLR start "rule__ForAll__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1951:1: rule__ForAll__Group__1__Impl : ( ( rule__ForAll__ElemsAssignment_1 ) ) ;
    public final void rule__ForAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1955:1: ( ( ( rule__ForAll__ElemsAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1956:1: ( ( rule__ForAll__ElemsAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1956:1: ( ( rule__ForAll__ElemsAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1957:1: ( rule__ForAll__ElemsAssignment_1 )
            {
             before(grammarAccess.getForAllAccess().getElemsAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1958:1: ( rule__ForAll__ElemsAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1958:2: rule__ForAll__ElemsAssignment_1
            {
            pushFollow(FOLLOW_rule__ForAll__ElemsAssignment_1_in_rule__ForAll__Group__1__Impl4132);
            rule__ForAll__ElemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForAllAccess().getElemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__1__Impl"


    // $ANTLR start "rule__ForAll__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1968:1: rule__ForAll__Group__2 : rule__ForAll__Group__2__Impl rule__ForAll__Group__3 ;
    public final void rule__ForAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1972:1: ( rule__ForAll__Group__2__Impl rule__ForAll__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1973:2: rule__ForAll__Group__2__Impl rule__ForAll__Group__3
            {
            pushFollow(FOLLOW_rule__ForAll__Group__2__Impl_in_rule__ForAll__Group__24162);
            rule__ForAll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__3_in_rule__ForAll__Group__24165);
            rule__ForAll__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__2"


    // $ANTLR start "rule__ForAll__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1980:1: rule__ForAll__Group__2__Impl : ( ( rule__ForAll__ItAssignment_2 ) ) ;
    public final void rule__ForAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1984:1: ( ( ( rule__ForAll__ItAssignment_2 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1985:1: ( ( rule__ForAll__ItAssignment_2 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1985:1: ( ( rule__ForAll__ItAssignment_2 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1986:1: ( rule__ForAll__ItAssignment_2 )
            {
             before(grammarAccess.getForAllAccess().getItAssignment_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1987:1: ( rule__ForAll__ItAssignment_2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1987:2: rule__ForAll__ItAssignment_2
            {
            pushFollow(FOLLOW_rule__ForAll__ItAssignment_2_in_rule__ForAll__Group__2__Impl4192);
            rule__ForAll__ItAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForAllAccess().getItAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__2__Impl"


    // $ANTLR start "rule__ForAll__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1997:1: rule__ForAll__Group__3 : rule__ForAll__Group__3__Impl rule__ForAll__Group__4 ;
    public final void rule__ForAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2001:1: ( rule__ForAll__Group__3__Impl rule__ForAll__Group__4 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2002:2: rule__ForAll__Group__3__Impl rule__ForAll__Group__4
            {
            pushFollow(FOLLOW_rule__ForAll__Group__3__Impl_in_rule__ForAll__Group__34222);
            rule__ForAll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__4_in_rule__ForAll__Group__34225);
            rule__ForAll__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__3"


    // $ANTLR start "rule__ForAll__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2009:1: rule__ForAll__Group__3__Impl : ( '{' ) ;
    public final void rule__ForAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2013:1: ( ( '{' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2014:1: ( '{' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2014:1: ( '{' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2015:1: '{'
            {
             before(grammarAccess.getForAllAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__ForAll__Group__3__Impl4253); 
             after(grammarAccess.getForAllAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__3__Impl"


    // $ANTLR start "rule__ForAll__Group__4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2028:1: rule__ForAll__Group__4 : rule__ForAll__Group__4__Impl rule__ForAll__Group__5 ;
    public final void rule__ForAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2032:1: ( rule__ForAll__Group__4__Impl rule__ForAll__Group__5 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2033:2: rule__ForAll__Group__4__Impl rule__ForAll__Group__5
            {
            pushFollow(FOLLOW_rule__ForAll__Group__4__Impl_in_rule__ForAll__Group__44284);
            rule__ForAll__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__5_in_rule__ForAll__Group__44287);
            rule__ForAll__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__4"


    // $ANTLR start "rule__ForAll__Group__4__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2040:1: rule__ForAll__Group__4__Impl : ( ( rule__ForAll__BodyAssignment_4 )* ) ;
    public final void rule__ForAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2044:1: ( ( ( rule__ForAll__BodyAssignment_4 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2045:1: ( ( rule__ForAll__BodyAssignment_4 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2045:1: ( ( rule__ForAll__BodyAssignment_4 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2046:1: ( rule__ForAll__BodyAssignment_4 )*
            {
             before(grammarAccess.getForAllAccess().getBodyAssignment_4()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2047:1: ( rule__ForAll__BodyAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==19||(LA25_0>=23 && LA25_0<=24)||LA25_0==26||(LA25_0>=29 && LA25_0<=30)||(LA25_0>=32 && LA25_0<=35)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2047:2: rule__ForAll__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ForAll__BodyAssignment_4_in_rule__ForAll__Group__4__Impl4314);
            	    rule__ForAll__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getForAllAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__4__Impl"


    // $ANTLR start "rule__ForAll__Group__5"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2057:1: rule__ForAll__Group__5 : rule__ForAll__Group__5__Impl ;
    public final void rule__ForAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2061:1: ( rule__ForAll__Group__5__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2062:2: rule__ForAll__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ForAll__Group__5__Impl_in_rule__ForAll__Group__54345);
            rule__ForAll__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__5"


    // $ANTLR start "rule__ForAll__Group__5__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2068:1: rule__ForAll__Group__5__Impl : ( '}' ) ;
    public final void rule__ForAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2072:1: ( ( '}' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2073:1: ( '}' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2073:1: ( '}' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2074:1: '}'
            {
             before(grammarAccess.getForAllAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__ForAll__Group__5__Impl4373); 
             after(grammarAccess.getForAllAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__Group__5__Impl"


    // $ANTLR start "rule__DoWhile__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2099:1: rule__DoWhile__Group__0 : rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1 ;
    public final void rule__DoWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2103:1: ( rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2104:2: rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__0__Impl_in_rule__DoWhile__Group__04416);
            rule__DoWhile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__1_in_rule__DoWhile__Group__04419);
            rule__DoWhile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__0"


    // $ANTLR start "rule__DoWhile__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2111:1: rule__DoWhile__Group__0__Impl : ( 'Do {' ) ;
    public final void rule__DoWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2115:1: ( ( 'Do {' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2116:1: ( 'Do {' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2116:1: ( 'Do {' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2117:1: 'Do {'
            {
             before(grammarAccess.getDoWhileAccess().getDoKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__DoWhile__Group__0__Impl4447); 
             after(grammarAccess.getDoWhileAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__0__Impl"


    // $ANTLR start "rule__DoWhile__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2130:1: rule__DoWhile__Group__1 : rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2 ;
    public final void rule__DoWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2134:1: ( rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2135:2: rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__1__Impl_in_rule__DoWhile__Group__14478);
            rule__DoWhile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__2_in_rule__DoWhile__Group__14481);
            rule__DoWhile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__1"


    // $ANTLR start "rule__DoWhile__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2142:1: rule__DoWhile__Group__1__Impl : ( ( rule__DoWhile__BodyAssignment_1 )* ) ;
    public final void rule__DoWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2146:1: ( ( ( rule__DoWhile__BodyAssignment_1 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2147:1: ( ( rule__DoWhile__BodyAssignment_1 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2147:1: ( ( rule__DoWhile__BodyAssignment_1 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2148:1: ( rule__DoWhile__BodyAssignment_1 )*
            {
             before(grammarAccess.getDoWhileAccess().getBodyAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2149:1: ( rule__DoWhile__BodyAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==19||(LA26_0>=23 && LA26_0<=24)||LA26_0==26||(LA26_0>=29 && LA26_0<=30)||(LA26_0>=32 && LA26_0<=35)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2149:2: rule__DoWhile__BodyAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DoWhile__BodyAssignment_1_in_rule__DoWhile__Group__1__Impl4508);
            	    rule__DoWhile__BodyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDoWhileAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__1__Impl"


    // $ANTLR start "rule__DoWhile__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2159:1: rule__DoWhile__Group__2 : rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3 ;
    public final void rule__DoWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2163:1: ( rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2164:2: rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__2__Impl_in_rule__DoWhile__Group__24539);
            rule__DoWhile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__3_in_rule__DoWhile__Group__24542);
            rule__DoWhile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__2"


    // $ANTLR start "rule__DoWhile__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2171:1: rule__DoWhile__Group__2__Impl : ( '} While (' ) ;
    public final void rule__DoWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2175:1: ( ( '} While (' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2176:1: ( '} While (' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2176:1: ( '} While (' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2177:1: '} While ('
            {
             before(grammarAccess.getDoWhileAccess().getWhileKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__DoWhile__Group__2__Impl4570); 
             after(grammarAccess.getDoWhileAccess().getWhileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__2__Impl"


    // $ANTLR start "rule__DoWhile__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2190:1: rule__DoWhile__Group__3 : rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4 ;
    public final void rule__DoWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2194:1: ( rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2195:2: rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__3__Impl_in_rule__DoWhile__Group__34601);
            rule__DoWhile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__4_in_rule__DoWhile__Group__34604);
            rule__DoWhile__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__3"


    // $ANTLR start "rule__DoWhile__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2202:1: rule__DoWhile__Group__3__Impl : ( ( rule__DoWhile__ConditionAssignment_3 ) ) ;
    public final void rule__DoWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2206:1: ( ( ( rule__DoWhile__ConditionAssignment_3 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2207:1: ( ( rule__DoWhile__ConditionAssignment_3 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2207:1: ( ( rule__DoWhile__ConditionAssignment_3 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2208:1: ( rule__DoWhile__ConditionAssignment_3 )
            {
             before(grammarAccess.getDoWhileAccess().getConditionAssignment_3()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2209:1: ( rule__DoWhile__ConditionAssignment_3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2209:2: rule__DoWhile__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__DoWhile__ConditionAssignment_3_in_rule__DoWhile__Group__3__Impl4631);
            rule__DoWhile__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__3__Impl"


    // $ANTLR start "rule__DoWhile__Group__4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2219:1: rule__DoWhile__Group__4 : rule__DoWhile__Group__4__Impl ;
    public final void rule__DoWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2223:1: ( rule__DoWhile__Group__4__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2224:2: rule__DoWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__4__Impl_in_rule__DoWhile__Group__44661);
            rule__DoWhile__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__4"


    // $ANTLR start "rule__DoWhile__Group__4__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2230:1: rule__DoWhile__Group__4__Impl : ( ')' ) ;
    public final void rule__DoWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2234:1: ( ( ')' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2235:1: ( ')' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2235:1: ( ')' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2236:1: ')'
            {
             before(grammarAccess.getDoWhileAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__DoWhile__Group__4__Impl4689); 
             after(grammarAccess.getDoWhileAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2259:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2263:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2264:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__04730);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__04733);
            rule__IfThenElse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0"


    // $ANTLR start "rule__IfThenElse__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2271:1: rule__IfThenElse__Group__0__Impl : ( 'If' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2275:1: ( ( 'If' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2276:1: ( 'If' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2276:1: ( 'If' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2277:1: 'If'
            {
             before(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__IfThenElse__Group__0__Impl4761); 
             after(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2290:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2294:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2295:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__14792);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__14795);
            rule__IfThenElse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1"


    // $ANTLR start "rule__IfThenElse__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2302:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__ConditionAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2306:1: ( ( ( rule__IfThenElse__ConditionAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2307:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2307:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2308:1: ( rule__IfThenElse__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfThenElseAccess().getConditionAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2309:1: ( rule__IfThenElse__ConditionAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2309:2: rule__IfThenElse__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl4822);
            rule__IfThenElse__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfThenElseAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2319:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2323:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2324:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__24852);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__24855);
            rule__IfThenElse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2"


    // $ANTLR start "rule__IfThenElse__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2331:1: rule__IfThenElse__Group__2__Impl : ( '{' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2335:1: ( ( '{' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2336:1: ( '{' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2336:1: ( '{' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2337:1: '{'
            {
             before(grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__IfThenElse__Group__2__Impl4883); 
             after(grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2350:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2354:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2355:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__34914);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__34917);
            rule__IfThenElse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3"


    // $ANTLR start "rule__IfThenElse__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2362:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ThenAssignment_3 )* ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2366:1: ( ( ( rule__IfThenElse__ThenAssignment_3 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2367:1: ( ( rule__IfThenElse__ThenAssignment_3 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2367:1: ( ( rule__IfThenElse__ThenAssignment_3 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2368:1: ( rule__IfThenElse__ThenAssignment_3 )*
            {
             before(grammarAccess.getIfThenElseAccess().getThenAssignment_3()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2369:1: ( rule__IfThenElse__ThenAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==19||(LA27_0>=23 && LA27_0<=24)||LA27_0==26||(LA27_0>=29 && LA27_0<=30)||(LA27_0>=32 && LA27_0<=35)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2369:2: rule__IfThenElse__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl4944);
            	    rule__IfThenElse__ThenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getIfThenElseAccess().getThenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2379:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2383:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2384:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__44975);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__44978);
            rule__IfThenElse__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4"


    // $ANTLR start "rule__IfThenElse__Group__4__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2391:1: rule__IfThenElse__Group__4__Impl : ( '}' ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2395:1: ( ( '}' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2396:1: ( '}' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2396:1: ( '}' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2397:1: '}'
            {
             before(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__IfThenElse__Group__4__Impl5006); 
             after(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__5"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2410:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2414:1: ( rule__IfThenElse__Group__5__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2415:2: rule__IfThenElse__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55037);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5"


    // $ANTLR start "rule__IfThenElse__Group__5__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2421:1: rule__IfThenElse__Group__5__Impl : ( ( rule__IfThenElse__Group_5__0 )? ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2425:1: ( ( ( rule__IfThenElse__Group_5__0 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2426:1: ( ( rule__IfThenElse__Group_5__0 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2426:1: ( ( rule__IfThenElse__Group_5__0 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2427:1: ( rule__IfThenElse__Group_5__0 )?
            {
             before(grammarAccess.getIfThenElseAccess().getGroup_5()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2428:1: ( rule__IfThenElse__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2428:2: rule__IfThenElse__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IfThenElse__Group_5__0_in_rule__IfThenElse__Group__5__Impl5064);
                    rule__IfThenElse__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfThenElseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5__Impl"


    // $ANTLR start "rule__IfThenElse__Group_5__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2450:1: rule__IfThenElse__Group_5__0 : rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1 ;
    public final void rule__IfThenElse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2454:1: ( rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2455:2: rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__0__Impl_in_rule__IfThenElse__Group_5__05107);
            rule__IfThenElse__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group_5__1_in_rule__IfThenElse__Group_5__05110);
            rule__IfThenElse__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__0"


    // $ANTLR start "rule__IfThenElse__Group_5__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2462:1: rule__IfThenElse__Group_5__0__Impl : ( 'Else {' ) ;
    public final void rule__IfThenElse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2466:1: ( ( 'Else {' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2467:1: ( 'Else {' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2467:1: ( 'Else {' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2468:1: 'Else {'
            {
             before(grammarAccess.getIfThenElseAccess().getElseKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__IfThenElse__Group_5__0__Impl5138); 
             after(grammarAccess.getIfThenElseAccess().getElseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group_5__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2481:1: rule__IfThenElse__Group_5__1 : rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2 ;
    public final void rule__IfThenElse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2485:1: ( rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2486:2: rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__1__Impl_in_rule__IfThenElse__Group_5__15169);
            rule__IfThenElse__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group_5__2_in_rule__IfThenElse__Group_5__15172);
            rule__IfThenElse__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__1"


    // $ANTLR start "rule__IfThenElse__Group_5__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2493:1: rule__IfThenElse__Group_5__1__Impl : ( ( rule__IfThenElse__ElseAssignment_5_1 )* ) ;
    public final void rule__IfThenElse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2497:1: ( ( ( rule__IfThenElse__ElseAssignment_5_1 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2498:1: ( ( rule__IfThenElse__ElseAssignment_5_1 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2498:1: ( ( rule__IfThenElse__ElseAssignment_5_1 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2499:1: ( rule__IfThenElse__ElseAssignment_5_1 )*
            {
             before(grammarAccess.getIfThenElseAccess().getElseAssignment_5_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2500:1: ( rule__IfThenElse__ElseAssignment_5_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==19||(LA29_0>=23 && LA29_0<=24)||LA29_0==26||(LA29_0>=29 && LA29_0<=30)||(LA29_0>=32 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2500:2: rule__IfThenElse__ElseAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__IfThenElse__ElseAssignment_5_1_in_rule__IfThenElse__Group_5__1__Impl5199);
            	    rule__IfThenElse__ElseAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getIfThenElseAccess().getElseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group_5__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2510:1: rule__IfThenElse__Group_5__2 : rule__IfThenElse__Group_5__2__Impl ;
    public final void rule__IfThenElse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2514:1: ( rule__IfThenElse__Group_5__2__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2515:2: rule__IfThenElse__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__2__Impl_in_rule__IfThenElse__Group_5__25230);
            rule__IfThenElse__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__2"


    // $ANTLR start "rule__IfThenElse__Group_5__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2521:1: rule__IfThenElse__Group_5__2__Impl : ( '}' ) ;
    public final void rule__IfThenElse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2525:1: ( ( '}' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2526:1: ( '}' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2526:1: ( '}' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2527:1: '}'
            {
             before(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,18,FOLLOW_18_in_rule__IfThenElse__Group_5__2__Impl5258); 
             after(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_5__2__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2546:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2550:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2551:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__05295);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__05298);
            rule__Affectation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2558:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__VariableAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2562:1: ( ( ( rule__Affectation__VariableAssignment_0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2563:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2563:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2564:1: ( rule__Affectation__VariableAssignment_0 )
            {
             before(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2565:1: ( rule__Affectation__VariableAssignment_0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2565:2: rule__Affectation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl5325);
            rule__Affectation__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2575:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2579:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2580:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__15355);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__15358);
            rule__Affectation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2587:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2591:1: ( ( '=' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2592:1: ( '=' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2592:1: ( '=' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2593:1: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Affectation__Group__1__Impl5386); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2606:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2610:1: ( rule__Affectation__Group__2__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2611:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__25417);
            rule__Affectation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2617:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ElemAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2621:1: ( ( ( rule__Affectation__ElemAssignment_2 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2622:1: ( ( rule__Affectation__ElemAssignment_2 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2622:1: ( ( rule__Affectation__ElemAssignment_2 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2623:1: ( rule__Affectation__ElemAssignment_2 )
            {
             before(grammarAccess.getAffectationAccess().getElemAssignment_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2624:1: ( rule__Affectation__ElemAssignment_2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2624:2: rule__Affectation__ElemAssignment_2
            {
            pushFollow(FOLLOW_rule__Affectation__ElemAssignment_2_in_rule__Affectation__Group__2__Impl5444);
            rule__Affectation__ElemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getElemAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Exec__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2640:1: rule__Exec__Group__0 : rule__Exec__Group__0__Impl rule__Exec__Group__1 ;
    public final void rule__Exec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2644:1: ( rule__Exec__Group__0__Impl rule__Exec__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2645:2: rule__Exec__Group__0__Impl rule__Exec__Group__1
            {
            pushFollow(FOLLOW_rule__Exec__Group__0__Impl_in_rule__Exec__Group__05480);
            rule__Exec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group__1_in_rule__Exec__Group__05483);
            rule__Exec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__0"


    // $ANTLR start "rule__Exec__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2652:1: rule__Exec__Group__0__Impl : ( 'Exec' ) ;
    public final void rule__Exec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2656:1: ( ( 'Exec' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2657:1: ( 'Exec' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2657:1: ( 'Exec' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2658:1: 'Exec'
            {
             before(grammarAccess.getExecAccess().getExecKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Exec__Group__0__Impl5511); 
             after(grammarAccess.getExecAccess().getExecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__0__Impl"


    // $ANTLR start "rule__Exec__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2671:1: rule__Exec__Group__1 : rule__Exec__Group__1__Impl rule__Exec__Group__2 ;
    public final void rule__Exec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2675:1: ( rule__Exec__Group__1__Impl rule__Exec__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2676:2: rule__Exec__Group__1__Impl rule__Exec__Group__2
            {
            pushFollow(FOLLOW_rule__Exec__Group__1__Impl_in_rule__Exec__Group__15542);
            rule__Exec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group__2_in_rule__Exec__Group__15545);
            rule__Exec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__1"


    // $ANTLR start "rule__Exec__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2683:1: rule__Exec__Group__1__Impl : ( ( rule__Exec__SequenceAssignment_1 ) ) ;
    public final void rule__Exec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2687:1: ( ( ( rule__Exec__SequenceAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2688:1: ( ( rule__Exec__SequenceAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2688:1: ( ( rule__Exec__SequenceAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2689:1: ( rule__Exec__SequenceAssignment_1 )
            {
             before(grammarAccess.getExecAccess().getSequenceAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2690:1: ( rule__Exec__SequenceAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2690:2: rule__Exec__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Exec__SequenceAssignment_1_in_rule__Exec__Group__1__Impl5572);
            rule__Exec__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExecAccess().getSequenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__1__Impl"


    // $ANTLR start "rule__Exec__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2700:1: rule__Exec__Group__2 : rule__Exec__Group__2__Impl ;
    public final void rule__Exec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2704:1: ( rule__Exec__Group__2__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2705:2: rule__Exec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group__2__Impl_in_rule__Exec__Group__25602);
            rule__Exec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__2"


    // $ANTLR start "rule__Exec__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2711:1: rule__Exec__Group__2__Impl : ( ( rule__Exec__Group_2__0 )? ) ;
    public final void rule__Exec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2715:1: ( ( ( rule__Exec__Group_2__0 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2716:1: ( ( rule__Exec__Group_2__0 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2716:1: ( ( rule__Exec__Group_2__0 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2717:1: ( rule__Exec__Group_2__0 )?
            {
             before(grammarAccess.getExecAccess().getGroup_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2718:1: ( rule__Exec__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2718:2: rule__Exec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Exec__Group_2__0_in_rule__Exec__Group__2__Impl5629);
                    rule__Exec__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExecAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group__2__Impl"


    // $ANTLR start "rule__Exec__Group_2__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2734:1: rule__Exec__Group_2__0 : rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1 ;
    public final void rule__Exec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2738:1: ( rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2739:2: rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__0__Impl_in_rule__Exec__Group_2__05666);
            rule__Exec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__1_in_rule__Exec__Group_2__05669);
            rule__Exec__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__0"


    // $ANTLR start "rule__Exec__Group_2__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2746:1: rule__Exec__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Exec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2750:1: ( ( '(' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2751:1: ( '(' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2751:1: ( '(' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2752:1: '('
            {
             before(grammarAccess.getExecAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Exec__Group_2__0__Impl5697); 
             after(grammarAccess.getExecAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__0__Impl"


    // $ANTLR start "rule__Exec__Group_2__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2765:1: rule__Exec__Group_2__1 : rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2 ;
    public final void rule__Exec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2769:1: ( rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2770:2: rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__1__Impl_in_rule__Exec__Group_2__15728);
            rule__Exec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__2_in_rule__Exec__Group_2__15731);
            rule__Exec__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__1"


    // $ANTLR start "rule__Exec__Group_2__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2777:1: rule__Exec__Group_2__1__Impl : ( ( rule__Exec__ParamsAssignment_2_1 ) ) ;
    public final void rule__Exec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2781:1: ( ( ( rule__Exec__ParamsAssignment_2_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2782:1: ( ( rule__Exec__ParamsAssignment_2_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2782:1: ( ( rule__Exec__ParamsAssignment_2_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2783:1: ( rule__Exec__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getExecAccess().getParamsAssignment_2_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2784:1: ( rule__Exec__ParamsAssignment_2_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2784:2: rule__Exec__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Exec__ParamsAssignment_2_1_in_rule__Exec__Group_2__1__Impl5758);
            rule__Exec__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExecAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__1__Impl"


    // $ANTLR start "rule__Exec__Group_2__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2794:1: rule__Exec__Group_2__2 : rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3 ;
    public final void rule__Exec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2798:1: ( rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2799:2: rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__2__Impl_in_rule__Exec__Group_2__25788);
            rule__Exec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__3_in_rule__Exec__Group_2__25791);
            rule__Exec__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__2"


    // $ANTLR start "rule__Exec__Group_2__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2806:1: rule__Exec__Group_2__2__Impl : ( ( rule__Exec__Group_2_2__0 )* ) ;
    public final void rule__Exec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2810:1: ( ( ( rule__Exec__Group_2_2__0 )* ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2811:1: ( ( rule__Exec__Group_2_2__0 )* )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2811:1: ( ( rule__Exec__Group_2_2__0 )* )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2812:1: ( rule__Exec__Group_2_2__0 )*
            {
             before(grammarAccess.getExecAccess().getGroup_2_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2813:1: ( rule__Exec__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2813:2: rule__Exec__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Exec__Group_2_2__0_in_rule__Exec__Group_2__2__Impl5818);
            	    rule__Exec__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExecAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__2__Impl"


    // $ANTLR start "rule__Exec__Group_2__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2823:1: rule__Exec__Group_2__3 : rule__Exec__Group_2__3__Impl ;
    public final void rule__Exec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2827:1: ( rule__Exec__Group_2__3__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2828:2: rule__Exec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__3__Impl_in_rule__Exec__Group_2__35849);
            rule__Exec__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__3"


    // $ANTLR start "rule__Exec__Group_2__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2834:1: rule__Exec__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Exec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2838:1: ( ( ')' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2839:1: ( ')' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2839:1: ( ')' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2840:1: ')'
            {
             before(grammarAccess.getExecAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Exec__Group_2__3__Impl5877); 
             after(grammarAccess.getExecAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2__3__Impl"


    // $ANTLR start "rule__Exec__Group_2_2__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2861:1: rule__Exec__Group_2_2__0 : rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1 ;
    public final void rule__Exec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2865:1: ( rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2866:2: rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Exec__Group_2_2__0__Impl_in_rule__Exec__Group_2_2__05916);
            rule__Exec__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2_2__1_in_rule__Exec__Group_2_2__05919);
            rule__Exec__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2_2__0"


    // $ANTLR start "rule__Exec__Group_2_2__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2873:1: rule__Exec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Exec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2877:1: ( ( ',' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2878:1: ( ',' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2878:1: ( ',' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2879:1: ','
            {
             before(grammarAccess.getExecAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Exec__Group_2_2__0__Impl5947); 
             after(grammarAccess.getExecAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2_2__0__Impl"


    // $ANTLR start "rule__Exec__Group_2_2__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2892:1: rule__Exec__Group_2_2__1 : rule__Exec__Group_2_2__1__Impl ;
    public final void rule__Exec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2896:1: ( rule__Exec__Group_2_2__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2897:2: rule__Exec__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group_2_2__1__Impl_in_rule__Exec__Group_2_2__15978);
            rule__Exec__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2_2__1"


    // $ANTLR start "rule__Exec__Group_2_2__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2903:1: rule__Exec__Group_2_2__1__Impl : ( ( rule__Exec__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__Exec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2907:1: ( ( ( rule__Exec__ParamsAssignment_2_2_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2908:1: ( ( rule__Exec__ParamsAssignment_2_2_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2908:1: ( ( rule__Exec__ParamsAssignment_2_2_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2909:1: ( rule__Exec__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getExecAccess().getParamsAssignment_2_2_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2910:1: ( rule__Exec__ParamsAssignment_2_2_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2910:2: rule__Exec__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Exec__ParamsAssignment_2_2_1_in_rule__Exec__Group_2_2__1__Impl6005);
            rule__Exec__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExecAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__Group_2_2__1__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2924:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2928:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2929:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__06039);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__06042);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2936:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2940:1: ( ( 'Fill' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2941:1: ( 'Fill' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2941:1: ( 'Fill' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2942:1: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Fill__Group__0__Impl6070); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2955:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2959:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2960:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__16101);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__16104);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2967:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__FieldAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2971:1: ( ( ( rule__Fill__FieldAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2972:1: ( ( rule__Fill__FieldAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2972:1: ( ( rule__Fill__FieldAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2973:1: ( rule__Fill__FieldAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getFieldAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2974:1: ( rule__Fill__FieldAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2974:2: rule__Fill__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__Fill__FieldAssignment_1_in_rule__Fill__Group__1__Impl6131);
            rule__Fill__FieldAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getFieldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2984:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2988:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2989:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__26161);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__26164);
            rule__Fill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2996:1: rule__Fill__Group__2__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3000:1: ( ( 'with' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3001:1: ( 'with' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3001:1: ( 'with' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3002:1: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Fill__Group__2__Impl6192); 
             after(grammarAccess.getFillAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3015:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3019:1: ( rule__Fill__Group__3__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3020:2: rule__Fill__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__36223);
            rule__Fill__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3"


    // $ANTLR start "rule__Fill__Group__3__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3026:1: rule__Fill__Group__3__Impl : ( ( rule__Fill__Alternatives_3 ) ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3030:1: ( ( ( rule__Fill__Alternatives_3 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3031:1: ( ( rule__Fill__Alternatives_3 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3031:1: ( ( rule__Fill__Alternatives_3 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3032:1: ( rule__Fill__Alternatives_3 )
            {
             before(grammarAccess.getFillAccess().getAlternatives_3()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3033:1: ( rule__Fill__Alternatives_3 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3033:2: rule__Fill__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Fill__Alternatives_3_in_rule__Fill__Group__3__Impl6250);
            rule__Fill__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3051:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3055:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3056:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__06288);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Check__Group__1_in_rule__Check__Group__06291);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3063:1: rule__Check__Group__0__Impl : ( 'Check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3067:1: ( ( 'Check' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3068:1: ( 'Check' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3068:1: ( 'Check' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3069:1: 'Check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Check__Group__0__Impl6319); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3082:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3086:1: ( rule__Check__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3087:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__16350);
            rule__Check__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3093:1: rule__Check__Group__1__Impl : ( ( rule__Check__CheckboxAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3097:1: ( ( ( rule__Check__CheckboxAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3098:1: ( ( rule__Check__CheckboxAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3098:1: ( ( rule__Check__CheckboxAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3099:1: ( rule__Check__CheckboxAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getCheckboxAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3100:1: ( rule__Check__CheckboxAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3100:2: rule__Check__CheckboxAssignment_1
            {
            pushFollow(FOLLOW_rule__Check__CheckboxAssignment_1_in_rule__Check__Group__1__Impl6377);
            rule__Check__CheckboxAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getCheckboxAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3114:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3118:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3119:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__06411);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Click__Group__1_in_rule__Click__Group__06414);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3126:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3130:1: ( ( 'Click' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3131:1: ( 'Click' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3131:1: ( 'Click' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3132:1: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Click__Group__0__Impl6442); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3145:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3149:1: ( rule__Click__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3150:2: rule__Click__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__16473);
            rule__Click__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3156:1: rule__Click__Group__1__Impl : ( ( rule__Click__ElemAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3160:1: ( ( ( rule__Click__ElemAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3161:1: ( ( rule__Click__ElemAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3161:1: ( ( rule__Click__ElemAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3162:1: ( rule__Click__ElemAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getElemAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3163:1: ( rule__Click__ElemAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3163:2: rule__Click__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__Click__ElemAssignment_1_in_rule__Click__Group__1__Impl6500);
            rule__Click__ElemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getElemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3177:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3181:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3182:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__06534);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__06537);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3189:1: rule__Verify__Group__0__Impl : ( 'Verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3193:1: ( ( 'Verify' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3194:1: ( 'Verify' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3194:1: ( 'Verify' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3195:1: 'Verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Verify__Group__0__Impl6565); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3208:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3212:1: ( rule__Verify__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3213:2: rule__Verify__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__16596);
            rule__Verify__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3219:1: rule__Verify__Group__1__Impl : ( ( rule__Verify__ConditionAssignment_1 ) ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3223:1: ( ( ( rule__Verify__ConditionAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3224:1: ( ( rule__Verify__ConditionAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3224:1: ( ( rule__Verify__ConditionAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3225:1: ( rule__Verify__ConditionAssignment_1 )
            {
             before(grammarAccess.getVerifyAccess().getConditionAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3226:1: ( rule__Verify__ConditionAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3226:2: rule__Verify__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Verify__ConditionAssignment_1_in_rule__Verify__Group__1__Impl6623);
            rule__Verify__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getConditionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3240:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3244:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3245:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__06657);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__06660);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3252:1: rule__GoTo__Group__0__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3256:1: ( ( 'GoTo' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3257:1: ( 'GoTo' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3257:1: ( 'GoTo' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3258:1: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__GoTo__Group__0__Impl6688); 
             after(grammarAccess.getGoToAccess().getGoToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3271:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3275:1: ( rule__GoTo__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3276:2: rule__GoTo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__16719);
            rule__GoTo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3282:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__Alternatives_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3286:1: ( ( ( rule__GoTo__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3287:1: ( ( rule__GoTo__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3287:1: ( ( rule__GoTo__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3288:1: ( rule__GoTo__Alternatives_1 )
            {
             before(grammarAccess.getGoToAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3289:1: ( rule__GoTo__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3289:2: rule__GoTo__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GoTo__Alternatives_1_in_rule__GoTo__Group__1__Impl6746);
            rule__GoTo__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3303:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3307:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3308:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06780);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06783);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3315:1: rule__Condition__Group__0__Impl : ( ( 'Not' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3319:1: ( ( ( 'Not' )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3320:1: ( ( 'Not' )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3320:1: ( ( 'Not' )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3321:1: ( 'Not' )?
            {
             before(grammarAccess.getConditionAccess().getNotKeyword_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3322:1: ( 'Not' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3323:2: 'Not'
                    {
                    match(input,36,FOLLOW_36_in_rule__Condition__Group__0__Impl6812); 

                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3334:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3338:1: ( rule__Condition__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3339:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16845);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3345:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3349:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3350:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3350:1: ( ( rule__Condition__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3351:1: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3352:1: ( rule__Condition__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3352:2: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6872);
            rule__Condition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__UnaryCondition__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3366:1: rule__UnaryCondition__Group__0 : rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 ;
    public final void rule__UnaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3370:1: ( rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3371:2: rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryCondition__Group__0__Impl_in_rule__UnaryCondition__Group__06906);
            rule__UnaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryCondition__Group__1_in_rule__UnaryCondition__Group__06909);
            rule__UnaryCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__Group__0"


    // $ANTLR start "rule__UnaryCondition__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3378:1: rule__UnaryCondition__Group__0__Impl : ( ( rule__UnaryCondition__OpAssignment_0 ) ) ;
    public final void rule__UnaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3382:1: ( ( ( rule__UnaryCondition__OpAssignment_0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3383:1: ( ( rule__UnaryCondition__OpAssignment_0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3383:1: ( ( rule__UnaryCondition__OpAssignment_0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3384:1: ( rule__UnaryCondition__OpAssignment_0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getOpAssignment_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3385:1: ( rule__UnaryCondition__OpAssignment_0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3385:2: rule__UnaryCondition__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryCondition__OpAssignment_0_in_rule__UnaryCondition__Group__0__Impl6936);
            rule__UnaryCondition__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__Group__0__Impl"


    // $ANTLR start "rule__UnaryCondition__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3395:1: rule__UnaryCondition__Group__1 : rule__UnaryCondition__Group__1__Impl ;
    public final void rule__UnaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3399:1: ( rule__UnaryCondition__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3400:2: rule__UnaryCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryCondition__Group__1__Impl_in_rule__UnaryCondition__Group__16966);
            rule__UnaryCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__Group__1"


    // $ANTLR start "rule__UnaryCondition__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3406:1: rule__UnaryCondition__Group__1__Impl : ( ( rule__UnaryCondition__ElemAssignment_1 ) ) ;
    public final void rule__UnaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3410:1: ( ( ( rule__UnaryCondition__ElemAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3411:1: ( ( rule__UnaryCondition__ElemAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3411:1: ( ( rule__UnaryCondition__ElemAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3412:1: ( rule__UnaryCondition__ElemAssignment_1 )
            {
             before(grammarAccess.getUnaryConditionAccess().getElemAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3413:1: ( rule__UnaryCondition__ElemAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3413:2: rule__UnaryCondition__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryCondition__ElemAssignment_1_in_rule__UnaryCondition__Group__1__Impl6993);
            rule__UnaryCondition__ElemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getElemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__Group__1__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3427:1: rule__BinaryCondition__Group__0 : rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 ;
    public final void rule__BinaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3431:1: ( rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3432:2: rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__0__Impl_in_rule__BinaryCondition__Group__07027);
            rule__BinaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryCondition__Group__1_in_rule__BinaryCondition__Group__07030);
            rule__BinaryCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__0"


    // $ANTLR start "rule__BinaryCondition__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3439:1: rule__BinaryCondition__Group__0__Impl : ( ( rule__BinaryCondition__ElemAssignment_0 ) ) ;
    public final void rule__BinaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3443:1: ( ( ( rule__BinaryCondition__ElemAssignment_0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3444:1: ( ( rule__BinaryCondition__ElemAssignment_0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3444:1: ( ( rule__BinaryCondition__ElemAssignment_0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3445:1: ( rule__BinaryCondition__ElemAssignment_0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getElemAssignment_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3446:1: ( rule__BinaryCondition__ElemAssignment_0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3446:2: rule__BinaryCondition__ElemAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryCondition__ElemAssignment_0_in_rule__BinaryCondition__Group__0__Impl7057);
            rule__BinaryCondition__ElemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getElemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__0__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3456:1: rule__BinaryCondition__Group__1 : rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 ;
    public final void rule__BinaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3460:1: ( rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3461:2: rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__1__Impl_in_rule__BinaryCondition__Group__17087);
            rule__BinaryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryCondition__Group__2_in_rule__BinaryCondition__Group__17090);
            rule__BinaryCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__1"


    // $ANTLR start "rule__BinaryCondition__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3468:1: rule__BinaryCondition__Group__1__Impl : ( ( rule__BinaryCondition__OpAssignment_1 ) ) ;
    public final void rule__BinaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3472:1: ( ( ( rule__BinaryCondition__OpAssignment_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3473:1: ( ( rule__BinaryCondition__OpAssignment_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3473:1: ( ( rule__BinaryCondition__OpAssignment_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3474:1: ( rule__BinaryCondition__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryConditionAccess().getOpAssignment_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3475:1: ( rule__BinaryCondition__OpAssignment_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3475:2: rule__BinaryCondition__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryCondition__OpAssignment_1_in_rule__BinaryCondition__Group__1__Impl7117);
            rule__BinaryCondition__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__1__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3485:1: rule__BinaryCondition__Group__2 : rule__BinaryCondition__Group__2__Impl ;
    public final void rule__BinaryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3489:1: ( rule__BinaryCondition__Group__2__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3490:2: rule__BinaryCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__2__Impl_in_rule__BinaryCondition__Group__27147);
            rule__BinaryCondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__2"


    // $ANTLR start "rule__BinaryCondition__Group__2__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3496:1: rule__BinaryCondition__Group__2__Impl : ( ( rule__BinaryCondition__Alternatives_2 ) ) ;
    public final void rule__BinaryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3500:1: ( ( ( rule__BinaryCondition__Alternatives_2 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3501:1: ( ( rule__BinaryCondition__Alternatives_2 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3501:1: ( ( rule__BinaryCondition__Alternatives_2 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3502:1: ( rule__BinaryCondition__Alternatives_2 )
            {
             before(grammarAccess.getBinaryConditionAccess().getAlternatives_2()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3503:1: ( rule__BinaryCondition__Alternatives_2 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3503:2: rule__BinaryCondition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Alternatives_2_in_rule__BinaryCondition__Group__2__Impl7174);
            rule__BinaryCondition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__2__Impl"


    // $ANTLR start "rule__GetButton__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3519:1: rule__GetButton__Group__0 : rule__GetButton__Group__0__Impl rule__GetButton__Group__1 ;
    public final void rule__GetButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3523:1: ( rule__GetButton__Group__0__Impl rule__GetButton__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3524:2: rule__GetButton__Group__0__Impl rule__GetButton__Group__1
            {
            pushFollow(FOLLOW_rule__GetButton__Group__0__Impl_in_rule__GetButton__Group__07210);
            rule__GetButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetButton__Group__1_in_rule__GetButton__Group__07213);
            rule__GetButton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__Group__0"


    // $ANTLR start "rule__GetButton__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3531:1: rule__GetButton__Group__0__Impl : ( 'GetButton' ) ;
    public final void rule__GetButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3535:1: ( ( 'GetButton' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3536:1: ( 'GetButton' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3536:1: ( 'GetButton' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3537:1: 'GetButton'
            {
             before(grammarAccess.getGetButtonAccess().getGetButtonKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__GetButton__Group__0__Impl7241); 
             after(grammarAccess.getGetButtonAccess().getGetButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__Group__0__Impl"


    // $ANTLR start "rule__GetButton__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3550:1: rule__GetButton__Group__1 : rule__GetButton__Group__1__Impl ;
    public final void rule__GetButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3554:1: ( rule__GetButton__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3555:2: rule__GetButton__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetButton__Group__1__Impl_in_rule__GetButton__Group__17272);
            rule__GetButton__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__Group__1"


    // $ANTLR start "rule__GetButton__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3561:1: rule__GetButton__Group__1__Impl : ( ( rule__GetButton__Alternatives_1 ) ) ;
    public final void rule__GetButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3565:1: ( ( ( rule__GetButton__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3566:1: ( ( rule__GetButton__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3566:1: ( ( rule__GetButton__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3567:1: ( rule__GetButton__Alternatives_1 )
            {
             before(grammarAccess.getGetButtonAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3568:1: ( rule__GetButton__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3568:2: rule__GetButton__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetButton__Alternatives_1_in_rule__GetButton__Group__1__Impl7299);
            rule__GetButton__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGetButtonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__Group__1__Impl"


    // $ANTLR start "rule__GetLink__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3582:1: rule__GetLink__Group__0 : rule__GetLink__Group__0__Impl rule__GetLink__Group__1 ;
    public final void rule__GetLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3586:1: ( rule__GetLink__Group__0__Impl rule__GetLink__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3587:2: rule__GetLink__Group__0__Impl rule__GetLink__Group__1
            {
            pushFollow(FOLLOW_rule__GetLink__Group__0__Impl_in_rule__GetLink__Group__07333);
            rule__GetLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetLink__Group__1_in_rule__GetLink__Group__07336);
            rule__GetLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__Group__0"


    // $ANTLR start "rule__GetLink__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3594:1: rule__GetLink__Group__0__Impl : ( 'GetLink' ) ;
    public final void rule__GetLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3598:1: ( ( 'GetLink' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3599:1: ( 'GetLink' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3599:1: ( 'GetLink' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3600:1: 'GetLink'
            {
             before(grammarAccess.getGetLinkAccess().getGetLinkKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__GetLink__Group__0__Impl7364); 
             after(grammarAccess.getGetLinkAccess().getGetLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__Group__0__Impl"


    // $ANTLR start "rule__GetLink__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3613:1: rule__GetLink__Group__1 : rule__GetLink__Group__1__Impl ;
    public final void rule__GetLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3617:1: ( rule__GetLink__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3618:2: rule__GetLink__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetLink__Group__1__Impl_in_rule__GetLink__Group__17395);
            rule__GetLink__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__Group__1"


    // $ANTLR start "rule__GetLink__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3624:1: rule__GetLink__Group__1__Impl : ( ( rule__GetLink__Alternatives_1 ) ) ;
    public final void rule__GetLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3628:1: ( ( ( rule__GetLink__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3629:1: ( ( rule__GetLink__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3629:1: ( ( rule__GetLink__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3630:1: ( rule__GetLink__Alternatives_1 )
            {
             before(grammarAccess.getGetLinkAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3631:1: ( rule__GetLink__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3631:2: rule__GetLink__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetLink__Alternatives_1_in_rule__GetLink__Group__1__Impl7422);
            rule__GetLink__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGetLinkAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__Group__1__Impl"


    // $ANTLR start "rule__GetCheckbox__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3645:1: rule__GetCheckbox__Group__0 : rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1 ;
    public final void rule__GetCheckbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3649:1: ( rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3650:2: rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Group__0__Impl_in_rule__GetCheckbox__Group__07456);
            rule__GetCheckbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetCheckbox__Group__1_in_rule__GetCheckbox__Group__07459);
            rule__GetCheckbox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__Group__0"


    // $ANTLR start "rule__GetCheckbox__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3657:1: rule__GetCheckbox__Group__0__Impl : ( 'GetCheckbox' ) ;
    public final void rule__GetCheckbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3661:1: ( ( 'GetCheckbox' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3662:1: ( 'GetCheckbox' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3662:1: ( 'GetCheckbox' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3663:1: 'GetCheckbox'
            {
             before(grammarAccess.getGetCheckboxAccess().getGetCheckboxKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__GetCheckbox__Group__0__Impl7487); 
             after(grammarAccess.getGetCheckboxAccess().getGetCheckboxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__Group__0__Impl"


    // $ANTLR start "rule__GetCheckbox__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3676:1: rule__GetCheckbox__Group__1 : rule__GetCheckbox__Group__1__Impl ;
    public final void rule__GetCheckbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3680:1: ( rule__GetCheckbox__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3681:2: rule__GetCheckbox__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Group__1__Impl_in_rule__GetCheckbox__Group__17518);
            rule__GetCheckbox__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__Group__1"


    // $ANTLR start "rule__GetCheckbox__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3687:1: rule__GetCheckbox__Group__1__Impl : ( ( rule__GetCheckbox__Alternatives_1 ) ) ;
    public final void rule__GetCheckbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3691:1: ( ( ( rule__GetCheckbox__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3692:1: ( ( rule__GetCheckbox__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3692:1: ( ( rule__GetCheckbox__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3693:1: ( rule__GetCheckbox__Alternatives_1 )
            {
             before(grammarAccess.getGetCheckboxAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3694:1: ( rule__GetCheckbox__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3694:2: rule__GetCheckbox__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Alternatives_1_in_rule__GetCheckbox__Group__1__Impl7545);
            rule__GetCheckbox__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGetCheckboxAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__Group__1__Impl"


    // $ANTLR start "rule__GetText__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3708:1: rule__GetText__Group__0 : rule__GetText__Group__0__Impl rule__GetText__Group__1 ;
    public final void rule__GetText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3712:1: ( rule__GetText__Group__0__Impl rule__GetText__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3713:2: rule__GetText__Group__0__Impl rule__GetText__Group__1
            {
            pushFollow(FOLLOW_rule__GetText__Group__0__Impl_in_rule__GetText__Group__07579);
            rule__GetText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetText__Group__1_in_rule__GetText__Group__07582);
            rule__GetText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__Group__0"


    // $ANTLR start "rule__GetText__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3720:1: rule__GetText__Group__0__Impl : ( 'GetText' ) ;
    public final void rule__GetText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3724:1: ( ( 'GetText' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3725:1: ( 'GetText' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3725:1: ( 'GetText' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3726:1: 'GetText'
            {
             before(grammarAccess.getGetTextAccess().getGetTextKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__GetText__Group__0__Impl7610); 
             after(grammarAccess.getGetTextAccess().getGetTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__Group__0__Impl"


    // $ANTLR start "rule__GetText__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3739:1: rule__GetText__Group__1 : rule__GetText__Group__1__Impl ;
    public final void rule__GetText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3743:1: ( rule__GetText__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3744:2: rule__GetText__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetText__Group__1__Impl_in_rule__GetText__Group__17641);
            rule__GetText__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__Group__1"


    // $ANTLR start "rule__GetText__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3750:1: rule__GetText__Group__1__Impl : ( ( rule__GetText__Alternatives_1 ) ) ;
    public final void rule__GetText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3754:1: ( ( ( rule__GetText__Alternatives_1 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3755:1: ( ( rule__GetText__Alternatives_1 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3755:1: ( ( rule__GetText__Alternatives_1 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3756:1: ( rule__GetText__Alternatives_1 )
            {
             before(grammarAccess.getGetTextAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3757:1: ( rule__GetText__Alternatives_1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3757:2: rule__GetText__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetText__Alternatives_1_in_rule__GetText__Group__1__Impl7668);
            rule__GetText__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGetTextAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__Group__1__Impl"


    // $ANTLR start "rule__GetButtons__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3771:1: rule__GetButtons__Group__0 : rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1 ;
    public final void rule__GetButtons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3775:1: ( rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3776:2: rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1
            {
            pushFollow(FOLLOW_rule__GetButtons__Group__0__Impl_in_rule__GetButtons__Group__07702);
            rule__GetButtons__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetButtons__Group__1_in_rule__GetButtons__Group__07705);
            rule__GetButtons__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__Group__0"


    // $ANTLR start "rule__GetButtons__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3783:1: rule__GetButtons__Group__0__Impl : ( 'GetButtons' ) ;
    public final void rule__GetButtons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3787:1: ( ( 'GetButtons' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3788:1: ( 'GetButtons' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3788:1: ( 'GetButtons' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3789:1: 'GetButtons'
            {
             before(grammarAccess.getGetButtonsAccess().getGetButtonsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__GetButtons__Group__0__Impl7733); 
             after(grammarAccess.getGetButtonsAccess().getGetButtonsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__Group__0__Impl"


    // $ANTLR start "rule__GetButtons__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3802:1: rule__GetButtons__Group__1 : rule__GetButtons__Group__1__Impl ;
    public final void rule__GetButtons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3806:1: ( rule__GetButtons__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3807:2: rule__GetButtons__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetButtons__Group__1__Impl_in_rule__GetButtons__Group__17764);
            rule__GetButtons__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__Group__1"


    // $ANTLR start "rule__GetButtons__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3813:1: rule__GetButtons__Group__1__Impl : ( ( rule__GetButtons__Alternatives_1 )? ) ;
    public final void rule__GetButtons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3817:1: ( ( ( rule__GetButtons__Alternatives_1 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3818:1: ( ( rule__GetButtons__Alternatives_1 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3818:1: ( ( rule__GetButtons__Alternatives_1 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3819:1: ( rule__GetButtons__Alternatives_1 )?
            {
             before(grammarAccess.getGetButtonsAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3820:1: ( rule__GetButtons__Alternatives_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==EOF||LA33_2==RULE_ID) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3820:2: rule__GetButtons__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetButtons__Alternatives_1_in_rule__GetButtons__Group__1__Impl7791);
                    rule__GetButtons__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetButtonsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__Group__1__Impl"


    // $ANTLR start "rule__GetCheckboxes__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3834:1: rule__GetCheckboxes__Group__0 : rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1 ;
    public final void rule__GetCheckboxes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3838:1: ( rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3839:2: rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1
            {
            pushFollow(FOLLOW_rule__GetCheckboxes__Group__0__Impl_in_rule__GetCheckboxes__Group__07826);
            rule__GetCheckboxes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetCheckboxes__Group__1_in_rule__GetCheckboxes__Group__07829);
            rule__GetCheckboxes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__Group__0"


    // $ANTLR start "rule__GetCheckboxes__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3846:1: rule__GetCheckboxes__Group__0__Impl : ( 'GetCheckboxes' ) ;
    public final void rule__GetCheckboxes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3850:1: ( ( 'GetCheckboxes' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3851:1: ( 'GetCheckboxes' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3851:1: ( 'GetCheckboxes' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3852:1: 'GetCheckboxes'
            {
             before(grammarAccess.getGetCheckboxesAccess().getGetCheckboxesKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__GetCheckboxes__Group__0__Impl7857); 
             after(grammarAccess.getGetCheckboxesAccess().getGetCheckboxesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__Group__0__Impl"


    // $ANTLR start "rule__GetCheckboxes__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3865:1: rule__GetCheckboxes__Group__1 : rule__GetCheckboxes__Group__1__Impl ;
    public final void rule__GetCheckboxes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3869:1: ( rule__GetCheckboxes__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3870:2: rule__GetCheckboxes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetCheckboxes__Group__1__Impl_in_rule__GetCheckboxes__Group__17888);
            rule__GetCheckboxes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__Group__1"


    // $ANTLR start "rule__GetCheckboxes__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3876:1: rule__GetCheckboxes__Group__1__Impl : ( ( rule__GetCheckboxes__Alternatives_1 )? ) ;
    public final void rule__GetCheckboxes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3880:1: ( ( ( rule__GetCheckboxes__Alternatives_1 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3881:1: ( ( rule__GetCheckboxes__Alternatives_1 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3881:1: ( ( rule__GetCheckboxes__Alternatives_1 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3882:1: ( rule__GetCheckboxes__Alternatives_1 )?
            {
             before(grammarAccess.getGetCheckboxesAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3883:1: ( rule__GetCheckboxes__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==EOF||LA34_2==RULE_ID) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3883:2: rule__GetCheckboxes__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__Alternatives_1_in_rule__GetCheckboxes__Group__1__Impl7915);
                    rule__GetCheckboxes__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetCheckboxesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__Group__1__Impl"


    // $ANTLR start "rule__GetLinks__Group__0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3897:1: rule__GetLinks__Group__0 : rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1 ;
    public final void rule__GetLinks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3901:1: ( rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3902:2: rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1
            {
            pushFollow(FOLLOW_rule__GetLinks__Group__0__Impl_in_rule__GetLinks__Group__07950);
            rule__GetLinks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetLinks__Group__1_in_rule__GetLinks__Group__07953);
            rule__GetLinks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__Group__0"


    // $ANTLR start "rule__GetLinks__Group__0__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3909:1: rule__GetLinks__Group__0__Impl : ( 'GetLinks' ) ;
    public final void rule__GetLinks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3913:1: ( ( 'GetLinks' ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3914:1: ( 'GetLinks' )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3914:1: ( 'GetLinks' )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3915:1: 'GetLinks'
            {
             before(grammarAccess.getGetLinksAccess().getGetLinksKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__GetLinks__Group__0__Impl7981); 
             after(grammarAccess.getGetLinksAccess().getGetLinksKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__Group__0__Impl"


    // $ANTLR start "rule__GetLinks__Group__1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3928:1: rule__GetLinks__Group__1 : rule__GetLinks__Group__1__Impl ;
    public final void rule__GetLinks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3932:1: ( rule__GetLinks__Group__1__Impl )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3933:2: rule__GetLinks__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetLinks__Group__1__Impl_in_rule__GetLinks__Group__18012);
            rule__GetLinks__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__Group__1"


    // $ANTLR start "rule__GetLinks__Group__1__Impl"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3939:1: rule__GetLinks__Group__1__Impl : ( ( rule__GetLinks__Alternatives_1 )? ) ;
    public final void rule__GetLinks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3943:1: ( ( ( rule__GetLinks__Alternatives_1 )? ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3944:1: ( ( rule__GetLinks__Alternatives_1 )? )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3944:1: ( ( rule__GetLinks__Alternatives_1 )? )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3945:1: ( rule__GetLinks__Alternatives_1 )?
            {
             before(grammarAccess.getGetLinksAccess().getAlternatives_1()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3946:1: ( rule__GetLinks__Alternatives_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==EOF||LA35_2==RULE_ID) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3946:2: rule__GetLinks__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetLinks__Alternatives_1_in_rule__GetLinks__Group__1__Impl8039);
                    rule__GetLinks__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGetLinksAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__Group__1__Impl"


    // $ANTLR start "rule__Program__SequencesAssignment_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3961:1: rule__Program__SequencesAssignment_0 : ( ruleSequence ) ;
    public final void rule__Program__SequencesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3965:1: ( ( ruleSequence ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3966:1: ( ruleSequence )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3966:1: ( ruleSequence )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3967:1: ruleSequence
            {
             before(grammarAccess.getProgramAccess().getSequencesSequenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Program__SequencesAssignment_08079);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getSequencesSequenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__SequencesAssignment_0"


    // $ANTLR start "rule__Program__TestsAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3976:1: rule__Program__TestsAssignment_1 : ( ruleTest ) ;
    public final void rule__Program__TestsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3980:1: ( ( ruleTest ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3981:1: ( ruleTest )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3981:1: ( ruleTest )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3982:1: ruleTest
            {
             before(grammarAccess.getProgramAccess().getTestsTestParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTest_in_rule__Program__TestsAssignment_18110);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getTestsTestParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__TestsAssignment_1"


    // $ANTLR start "rule__Test__BrowserAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3991:1: rule__Test__BrowserAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Test__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3995:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3996:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3996:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3997:1: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Test__BrowserAssignment_18141); 
             after(grammarAccess.getTestAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__BrowserAssignment_1"


    // $ANTLR start "rule__Test__BodyAssignment_3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4006:1: rule__Test__BodyAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Test__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4010:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4011:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4011:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4012:1: ruleInstruction
            {
             before(grammarAccess.getTestAccess().getBodyInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Test__BodyAssignment_38172);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getTestAccess().getBodyInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__BodyAssignment_3"


    // $ANTLR start "rule__Sequence__NameAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4021:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4025:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4026:1: ( RULE_ID )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4026:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4027:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_18203); 
             after(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__NameAssignment_1"


    // $ANTLR start "rule__Sequence__ParametersAssignment_2_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4036:1: rule__Sequence__ParametersAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__Sequence__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4040:1: ( ( ruleVariable ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4041:1: ( ruleVariable )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4041:1: ( ruleVariable )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4042:1: ruleVariable
            {
             before(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_18234);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ParametersAssignment_2_1"


    // $ANTLR start "rule__Sequence__ParametersAssignment_2_2_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4051:1: rule__Sequence__ParametersAssignment_2_2_1 : ( ruleVariable ) ;
    public final void rule__Sequence__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4055:1: ( ( ruleVariable ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4056:1: ( ruleVariable )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4056:1: ( ruleVariable )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4057:1: ruleVariable
            {
             before(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_2_18265);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Sequence__BodyAssignment_4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4066:1: rule__Sequence__BodyAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Sequence__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4070:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4071:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4071:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4072:1: ruleInstruction
            {
             before(grammarAccess.getSequenceAccess().getBodyInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Sequence__BodyAssignment_48296);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getBodyInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__BodyAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4081:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4085:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4086:1: ( RULE_ID )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4086:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4087:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment8327); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__ForAll__ElemsAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4096:1: rule__ForAll__ElemsAssignment_1 : ( ruleElems ) ;
    public final void rule__ForAll__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4100:1: ( ( ruleElems ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4101:1: ( ruleElems )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4101:1: ( ruleElems )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4102:1: ruleElems
            {
             before(grammarAccess.getForAllAccess().getElemsElemsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleElems_in_rule__ForAll__ElemsAssignment_18358);
            ruleElems();

            state._fsp--;

             after(grammarAccess.getForAllAccess().getElemsElemsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__ElemsAssignment_1"


    // $ANTLR start "rule__ForAll__ItAssignment_2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4111:1: rule__ForAll__ItAssignment_2 : ( ruleVariable ) ;
    public final void rule__ForAll__ItAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4115:1: ( ( ruleVariable ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4116:1: ( ruleVariable )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4116:1: ( ruleVariable )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4117:1: ruleVariable
            {
             before(grammarAccess.getForAllAccess().getItVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__ForAll__ItAssignment_28389);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getForAllAccess().getItVariableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__ItAssignment_2"


    // $ANTLR start "rule__ForAll__BodyAssignment_4"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4126:1: rule__ForAll__BodyAssignment_4 : ( ruleInstruction ) ;
    public final void rule__ForAll__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4130:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4131:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4131:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4132:1: ruleInstruction
            {
             before(grammarAccess.getForAllAccess().getBodyInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__ForAll__BodyAssignment_48420);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getForAllAccess().getBodyInstructionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForAll__BodyAssignment_4"


    // $ANTLR start "rule__DoWhile__BodyAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4141:1: rule__DoWhile__BodyAssignment_1 : ( ruleInstruction ) ;
    public final void rule__DoWhile__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4145:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4146:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4146:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4147:1: ruleInstruction
            {
             before(grammarAccess.getDoWhileAccess().getBodyInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__DoWhile__BodyAssignment_18451);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getDoWhileAccess().getBodyInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__BodyAssignment_1"


    // $ANTLR start "rule__DoWhile__ConditionAssignment_3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4156:1: rule__DoWhile__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__DoWhile__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4160:1: ( ( ruleCondition ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4161:1: ( ruleCondition )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4161:1: ( ruleCondition )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4162:1: ruleCondition
            {
             before(grammarAccess.getDoWhileAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__DoWhile__ConditionAssignment_38482);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getDoWhileAccess().getConditionConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhile__ConditionAssignment_3"


    // $ANTLR start "rule__IfThenElse__ConditionAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4171:1: rule__IfThenElse__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__IfThenElse__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4175:1: ( ( ruleCondition ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4176:1: ( ruleCondition )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4176:1: ( ruleCondition )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4177:1: ruleCondition
            {
             before(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__IfThenElse__ConditionAssignment_18513);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ConditionAssignment_1"


    // $ANTLR start "rule__IfThenElse__ThenAssignment_3"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4186:1: rule__IfThenElse__ThenAssignment_3 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4190:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4191:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4191:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4192:1: ruleInstruction
            {
             before(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_38544);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ThenAssignment_3"


    // $ANTLR start "rule__IfThenElse__ElseAssignment_5_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4201:1: rule__IfThenElse__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4205:1: ( ( ruleInstruction ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4206:1: ( ruleInstruction )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4206:1: ( ruleInstruction )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4207:1: ruleInstruction
            {
             before(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_5_18575);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ElseAssignment_5_1"


    // $ANTLR start "rule__Affectation__VariableAssignment_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4216:1: rule__Affectation__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__Affectation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4220:1: ( ( ruleVariable ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4221:1: ( ruleVariable )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4221:1: ( ruleVariable )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4222:1: ruleVariable
            {
             before(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Affectation__VariableAssignment_08606);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__VariableAssignment_0"


    // $ANTLR start "rule__Affectation__ElemAssignment_2"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4231:1: rule__Affectation__ElemAssignment_2 : ( ruleElem ) ;
    public final void rule__Affectation__ElemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4235:1: ( ( ruleElem ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4236:1: ( ruleElem )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4236:1: ( ruleElem )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4237:1: ruleElem
            {
             before(grammarAccess.getAffectationAccess().getElemElemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElem_in_rule__Affectation__ElemAssignment_28637);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getElemElemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__ElemAssignment_2"


    // $ANTLR start "rule__Exec__SequenceAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4246:1: rule__Exec__SequenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Exec__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4250:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4251:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4251:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4252:1: ( RULE_ID )
            {
             before(grammarAccess.getExecAccess().getSequenceSequenceCrossReference_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4253:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4254:1: RULE_ID
            {
             before(grammarAccess.getExecAccess().getSequenceSequenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exec__SequenceAssignment_18672); 
             after(grammarAccess.getExecAccess().getSequenceSequenceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExecAccess().getSequenceSequenceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__SequenceAssignment_1"


    // $ANTLR start "rule__Exec__ParamsAssignment_2_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4265:1: rule__Exec__ParamsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Exec__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4269:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4270:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4270:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4271:1: RULE_STRING
            {
             before(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_18707); 
             after(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__ParamsAssignment_2_1"


    // $ANTLR start "rule__Exec__ParamsAssignment_2_2_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4280:1: rule__Exec__ParamsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__Exec__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4284:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4285:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4285:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4286:1: RULE_STRING
            {
             before(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_2_18738); 
             after(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exec__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__Fill__FieldAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4295:1: rule__Fill__FieldAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4299:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4300:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4300:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4301:1: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getFieldSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fill__FieldAssignment_18769); 
             after(grammarAccess.getFillAccess().getFieldSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__FieldAssignment_1"


    // $ANTLR start "rule__Fill__ValueAssignment_3_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4310:1: rule__Fill__ValueAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Fill__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4314:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4315:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4315:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4316:1: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fill__ValueAssignment_3_08800); 
             after(grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ValueAssignment_3_0"


    // $ANTLR start "rule__Fill__ParamAssignment_3_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4325:1: rule__Fill__ParamAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fill__ParamAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4329:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4330:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4330:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4331:1: ( RULE_ID )
            {
             before(grammarAccess.getFillAccess().getParamVariableCrossReference_3_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4332:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4333:1: RULE_ID
            {
             before(grammarAccess.getFillAccess().getParamVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fill__ParamAssignment_3_18835); 
             after(grammarAccess.getFillAccess().getParamVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getFillAccess().getParamVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__ParamAssignment_3_1"


    // $ANTLR start "rule__Check__CheckboxAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4344:1: rule__Check__CheckboxAssignment_1 : ( ( rule__Check__CheckboxAlternatives_1_0 ) ) ;
    public final void rule__Check__CheckboxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4348:1: ( ( ( rule__Check__CheckboxAlternatives_1_0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4349:1: ( ( rule__Check__CheckboxAlternatives_1_0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4349:1: ( ( rule__Check__CheckboxAlternatives_1_0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4350:1: ( rule__Check__CheckboxAlternatives_1_0 )
            {
             before(grammarAccess.getCheckAccess().getCheckboxAlternatives_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4351:1: ( rule__Check__CheckboxAlternatives_1_0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4351:2: rule__Check__CheckboxAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Check__CheckboxAlternatives_1_0_in_rule__Check__CheckboxAssignment_18870);
            rule__Check__CheckboxAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getCheckboxAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__CheckboxAssignment_1"


    // $ANTLR start "rule__Click__ElemAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4360:1: rule__Click__ElemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Click__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4364:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4365:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4365:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4366:1: ( RULE_ID )
            {
             before(grammarAccess.getClickAccess().getElemElemCrossReference_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4367:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4368:1: RULE_ID
            {
             before(grammarAccess.getClickAccess().getElemElemIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Click__ElemAssignment_18907); 
             after(grammarAccess.getClickAccess().getElemElemIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getClickAccess().getElemElemCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ElemAssignment_1"


    // $ANTLR start "rule__Verify__ConditionAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4379:1: rule__Verify__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Verify__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4383:1: ( ( ruleCondition ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4384:1: ( ruleCondition )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4384:1: ( ruleCondition )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4385:1: ruleCondition
            {
             before(grammarAccess.getVerifyAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Verify__ConditionAssignment_18942);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getConditionConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__ConditionAssignment_1"


    // $ANTLR start "rule__GoTo__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4394:1: rule__GoTo__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GoTo__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4398:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4399:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4399:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4400:1: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GoTo__ValueAssignment_1_08973); 
             after(grammarAccess.getGoToAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__ValueAssignment_1_0"


    // $ANTLR start "rule__GoTo__LinkAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4409:1: rule__GoTo__LinkAssignment_1_1 : ( ( rule__GoTo__LinkAlternatives_1_1_0 ) ) ;
    public final void rule__GoTo__LinkAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4413:1: ( ( ( rule__GoTo__LinkAlternatives_1_1_0 ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4414:1: ( ( rule__GoTo__LinkAlternatives_1_1_0 ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4414:1: ( ( rule__GoTo__LinkAlternatives_1_1_0 ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4415:1: ( rule__GoTo__LinkAlternatives_1_1_0 )
            {
             before(grammarAccess.getGoToAccess().getLinkAlternatives_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4416:1: ( rule__GoTo__LinkAlternatives_1_1_0 )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4416:2: rule__GoTo__LinkAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__GoTo__LinkAlternatives_1_1_0_in_rule__GoTo__LinkAssignment_1_19004);
            rule__GoTo__LinkAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getLinkAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__LinkAssignment_1_1"


    // $ANTLR start "rule__UnaryCondition__OpAssignment_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4425:1: rule__UnaryCondition__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryCondition__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4429:1: ( ( ruleUnaryOp ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4430:1: ( ruleUnaryOp )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4430:1: ( ruleUnaryOp )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4431:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryConditionAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__UnaryCondition__OpAssignment_09037);
            ruleUnaryOp();

            state._fsp--;

             after(grammarAccess.getUnaryConditionAccess().getOpUnaryOpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__OpAssignment_0"


    // $ANTLR start "rule__UnaryCondition__ElemAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4440:1: rule__UnaryCondition__ElemAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UnaryCondition__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4444:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4445:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4445:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4446:1: ( RULE_ID )
            {
             before(grammarAccess.getUnaryConditionAccess().getElemElemCrossReference_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4447:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4448:1: RULE_ID
            {
             before(grammarAccess.getUnaryConditionAccess().getElemElemIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UnaryCondition__ElemAssignment_19072); 
             after(grammarAccess.getUnaryConditionAccess().getElemElemIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUnaryConditionAccess().getElemElemCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryCondition__ElemAssignment_1"


    // $ANTLR start "rule__BinaryCondition__ElemAssignment_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4459:1: rule__BinaryCondition__ElemAssignment_0 : ( ruleElem ) ;
    public final void rule__BinaryCondition__ElemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4463:1: ( ( ruleElem ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4464:1: ( ruleElem )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4464:1: ( ruleElem )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4465:1: ruleElem
            {
             before(grammarAccess.getBinaryConditionAccess().getElemElemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleElem_in_rule__BinaryCondition__ElemAssignment_09107);
            ruleElem();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getElemElemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__ElemAssignment_0"


    // $ANTLR start "rule__BinaryCondition__OpAssignment_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4474:1: rule__BinaryCondition__OpAssignment_1 : ( ruleBinaryOp ) ;
    public final void rule__BinaryCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4478:1: ( ( ruleBinaryOp ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4479:1: ( ruleBinaryOp )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4479:1: ( ruleBinaryOp )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4480:1: ruleBinaryOp
            {
             before(grammarAccess.getBinaryConditionAccess().getOpBinaryOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryOp_in_rule__BinaryCondition__OpAssignment_19138);
            ruleBinaryOp();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getOpBinaryOpEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__OpAssignment_1"


    // $ANTLR start "rule__BinaryCondition__ValueAssignment_2_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4489:1: rule__BinaryCondition__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BinaryCondition__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4493:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4494:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4494:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4495:1: RULE_STRING
            {
             before(grammarAccess.getBinaryConditionAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BinaryCondition__ValueAssignment_2_09169); 
             after(grammarAccess.getBinaryConditionAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__ValueAssignment_2_0"


    // $ANTLR start "rule__BinaryCondition__ParamAssignment_2_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4504:1: rule__BinaryCondition__ParamAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__BinaryCondition__ParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4508:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4509:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4509:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4510:1: ( RULE_ID )
            {
             before(grammarAccess.getBinaryConditionAccess().getParamVariableCrossReference_2_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4511:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4512:1: RULE_ID
            {
             before(grammarAccess.getBinaryConditionAccess().getParamVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BinaryCondition__ParamAssignment_2_19204); 
             after(grammarAccess.getBinaryConditionAccess().getParamVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getBinaryConditionAccess().getParamVariableCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__ParamAssignment_2_1"


    // $ANTLR start "rule__GetButton__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4523:1: rule__GetButton__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetButton__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4527:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4528:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4528:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4529:1: RULE_STRING
            {
             before(grammarAccess.getGetButtonAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetButton__ValueAssignment_1_09239); 
             after(grammarAccess.getGetButtonAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__ValueAssignment_1_0"


    // $ANTLR start "rule__GetButton__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4538:1: rule__GetButton__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetButton__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4542:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4543:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4543:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4544:1: ( RULE_ID )
            {
             before(grammarAccess.getGetButtonAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4545:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4546:1: RULE_ID
            {
             before(grammarAccess.getGetButtonAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetButton__VarAssignment_1_19274); 
             after(grammarAccess.getGetButtonAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetButtonAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButton__VarAssignment_1_1"


    // $ANTLR start "rule__GetLink__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4557:1: rule__GetLink__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetLink__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4561:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4562:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4562:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4563:1: RULE_STRING
            {
             before(grammarAccess.getGetLinkAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetLink__ValueAssignment_1_09309); 
             after(grammarAccess.getGetLinkAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__ValueAssignment_1_0"


    // $ANTLR start "rule__GetLink__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4572:1: rule__GetLink__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetLink__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4576:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4577:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4577:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4578:1: ( RULE_ID )
            {
             before(grammarAccess.getGetLinkAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4579:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4580:1: RULE_ID
            {
             before(grammarAccess.getGetLinkAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetLink__VarAssignment_1_19344); 
             after(grammarAccess.getGetLinkAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetLinkAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLink__VarAssignment_1_1"


    // $ANTLR start "rule__GetCheckbox__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4591:1: rule__GetCheckbox__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetCheckbox__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4595:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4596:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4596:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4597:1: RULE_STRING
            {
             before(grammarAccess.getGetCheckboxAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetCheckbox__ValueAssignment_1_09379); 
             after(grammarAccess.getGetCheckboxAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__ValueAssignment_1_0"


    // $ANTLR start "rule__GetCheckbox__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4606:1: rule__GetCheckbox__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetCheckbox__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4610:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4611:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4611:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4612:1: ( RULE_ID )
            {
             before(grammarAccess.getGetCheckboxAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4613:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4614:1: RULE_ID
            {
             before(grammarAccess.getGetCheckboxAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetCheckbox__VarAssignment_1_19414); 
             after(grammarAccess.getGetCheckboxAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetCheckboxAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckbox__VarAssignment_1_1"


    // $ANTLR start "rule__GetText__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4625:1: rule__GetText__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetText__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4629:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4630:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4630:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4631:1: RULE_STRING
            {
             before(grammarAccess.getGetTextAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetText__ValueAssignment_1_09449); 
             after(grammarAccess.getGetTextAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__ValueAssignment_1_0"


    // $ANTLR start "rule__GetText__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4640:1: rule__GetText__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetText__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4644:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4645:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4645:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4646:1: ( RULE_ID )
            {
             before(grammarAccess.getGetTextAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4647:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4648:1: RULE_ID
            {
             before(grammarAccess.getGetTextAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetText__VarAssignment_1_19484); 
             after(grammarAccess.getGetTextAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetTextAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetText__VarAssignment_1_1"


    // $ANTLR start "rule__GetButtons__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4659:1: rule__GetButtons__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetButtons__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4663:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4664:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4664:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4665:1: RULE_STRING
            {
             before(grammarAccess.getGetButtonsAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetButtons__ValueAssignment_1_09519); 
             after(grammarAccess.getGetButtonsAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__ValueAssignment_1_0"


    // $ANTLR start "rule__GetButtons__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4674:1: rule__GetButtons__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetButtons__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4678:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4679:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4679:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4680:1: ( RULE_ID )
            {
             before(grammarAccess.getGetButtonsAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4681:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4682:1: RULE_ID
            {
             before(grammarAccess.getGetButtonsAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetButtons__VarAssignment_1_19554); 
             after(grammarAccess.getGetButtonsAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetButtonsAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetButtons__VarAssignment_1_1"


    // $ANTLR start "rule__GetCheckboxes__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4693:1: rule__GetCheckboxes__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetCheckboxes__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4697:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4698:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4698:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4699:1: RULE_STRING
            {
             before(grammarAccess.getGetCheckboxesAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetCheckboxes__ValueAssignment_1_09589); 
             after(grammarAccess.getGetCheckboxesAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__ValueAssignment_1_0"


    // $ANTLR start "rule__GetCheckboxes__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4708:1: rule__GetCheckboxes__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetCheckboxes__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4712:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4713:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4713:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4714:1: ( RULE_ID )
            {
             before(grammarAccess.getGetCheckboxesAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4715:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4716:1: RULE_ID
            {
             before(grammarAccess.getGetCheckboxesAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetCheckboxes__VarAssignment_1_19624); 
             after(grammarAccess.getGetCheckboxesAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetCheckboxesAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetCheckboxes__VarAssignment_1_1"


    // $ANTLR start "rule__GetLinks__ValueAssignment_1_0"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4727:1: rule__GetLinks__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetLinks__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4731:1: ( ( RULE_STRING ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4732:1: ( RULE_STRING )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4732:1: ( RULE_STRING )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4733:1: RULE_STRING
            {
             before(grammarAccess.getGetLinksAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetLinks__ValueAssignment_1_09659); 
             after(grammarAccess.getGetLinksAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__ValueAssignment_1_0"


    // $ANTLR start "rule__GetLinks__VarAssignment_1_1"
    // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4742:1: rule__GetLinks__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetLinks__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4746:1: ( ( ( RULE_ID ) ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4747:1: ( ( RULE_ID ) )
            {
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4747:1: ( ( RULE_ID ) )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4748:1: ( RULE_ID )
            {
             before(grammarAccess.getGetLinksAccess().getVarVariableCrossReference_1_1_0()); 
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4749:1: ( RULE_ID )
            // ../Selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4750:1: RULE_ID
            {
             before(grammarAccess.getGetLinksAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetLinks__VarAssignment_1_19694); 
             after(grammarAccess.getGetLinksAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getGetLinksAccess().getVarVariableCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GetLinks__VarAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Alternatives_in_ruleProgram94 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0_in_ruleTest155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__NameAssignment_in_ruleVariable275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_entryRuleForAll362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForAll369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__0_in_ruleForAll395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_entryRuleDoWhile422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhile429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__0_in_ruleDoWhile455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_entryRuleAffectation542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAffectation549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0_in_ruleAffectation575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExec_in_entryRuleExec602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExec609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__0_in_ruleExec635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__0_in_ruleFill695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__0_in_ruleCheck755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_entryRuleClick782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClick789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__0_in_ruleClick815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_entryRuleVerify842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerify849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__0_in_ruleVerify875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_entryRuleGoTo902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoTo909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__0_in_ruleGoTo935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0_in_ruleCondition995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryCondition1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__0_in_ruleUnaryCondition1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_entryRuleBinaryCondition1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryCondition1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__0_in_ruleBinaryCondition1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_entryRuleElem1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElem1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elem__Alternatives_in_ruleElem1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButton_in_entryRuleGetButton1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetButton1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Group__0_in_ruleGetButton1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_entryRuleGetLink1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetLink1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Group__0_in_ruleGetLink1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_entryRuleGetCheckbox1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetCheckbox1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__0_in_ruleGetCheckbox1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetText_in_entryRuleGetText1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetText1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Group__0_in_ruleGetText1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElems_in_entryRuleElems1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElems1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elems__Alternatives_in_ruleElems1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButtons_in_entryRuleGetButtons1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetButtons1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__0_in_ruleGetButtons1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckboxes_in_entryRuleGetCheckboxes1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetCheckboxes1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__0_in_ruleGetCheckboxes1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLinks_in_entryRuleGetLinks1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetLinks1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__0_in_ruleGetLinks1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOp__Alternatives_in_ruleBinaryOp1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryOp__Alternatives_in_ruleUnaryOp1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__SequencesAssignment_0_in_rule__Program__Alternatives1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__TestsAssignment_1_in_rule__Program__Alternatives1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Instruction__Alternatives1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForAll_in_rule__Instruction__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_rule__Instruction__Alternatives1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_rule__Instruction__Alternatives1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAffectation_in_rule__Instruction__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExec_in_rule__Instruction__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_rule__Instruction__Alternatives1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_rule__Instruction__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClick_in_rule__Instruction__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerify_in_rule__Instruction__Alternatives1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoTo_in_rule__Instruction__Alternatives1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__ValueAssignment_3_0_in_rule__Fill__Alternatives_32016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__ParamAssignment_3_1_in_rule__Fill__Alternatives_32034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_rule__Check__CheckboxAlternatives_1_02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__ValueAssignment_1_0_in_rule__GoTo__Alternatives_12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__LinkAssignment_1_1_in_rule__GoTo__Alternatives_12136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_rule__GoTo__LinkAlternatives_1_1_02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_rule__Condition__Alternatives_12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives_12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ValueAssignment_2_0_in_rule__BinaryCondition__Alternatives_22269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ParamAssignment_2_1_in_rule__BinaryCondition__Alternatives_22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButton_in_rule__Elem__Alternatives2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_rule__Elem__Alternatives2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_rule__Elem__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetText_in_rule__Elem__Alternatives2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Elem__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__ValueAssignment_1_0_in_rule__GetButton__Alternatives_12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__VarAssignment_1_1_in_rule__GetButton__Alternatives_12438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__ValueAssignment_1_0_in_rule__GetLink__Alternatives_12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__VarAssignment_1_1_in_rule__GetLink__Alternatives_12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__ValueAssignment_1_0_in_rule__GetCheckbox__Alternatives_12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__VarAssignment_1_1_in_rule__GetCheckbox__Alternatives_12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__ValueAssignment_1_0_in_rule__GetText__Alternatives_12573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__VarAssignment_1_1_in_rule__GetText__Alternatives_12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButtons_in_rule__Elems__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckboxes_in_rule__Elems__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLinks_in_rule__Elems__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__ValueAssignment_1_0_in_rule__GetButtons__Alternatives_12690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__VarAssignment_1_1_in_rule__GetButtons__Alternatives_12708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__ValueAssignment_1_0_in_rule__GetCheckboxes__Alternatives_12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__VarAssignment_1_1_in_rule__GetCheckboxes__Alternatives_12759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__ValueAssignment_1_0_in_rule__GetLinks__Alternatives_12792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__VarAssignment_1_1_in_rule__GetLinks__Alternatives_12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BinaryOp__Alternatives2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryOp__Alternatives2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnaryOp__Alternatives2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnaryOp__Alternatives2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UnaryOp__Alternatives2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__02976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__02979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Test__Group__0__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__13038 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__BrowserAssignment_1_in_rule__Test__Group__1__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__23098 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Test__Group__3_in_rule__Test__Group__23101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Test__Group__2__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__33160 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Test__Group__4_in_rule__Test__Group__33163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__BodyAssignment_3_in_rule__Test__Group__3__Impl3190 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__43221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Test__Group__4__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13352 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__23412 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__0_in_rule__Sequence__Group__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__33473 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__33476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sequence__Group__3__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43535 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__43538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__BodyAssignment_4_in_rule__Sequence__Group__4__Impl3565 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__53596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sequence__Group__5__Impl3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__0__Impl_in_rule__Sequence__Group_2__03667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__1_in_rule__Sequence__Group_2__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group_2__0__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__1__Impl_in_rule__Sequence__Group_2__13729 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__2_in_rule__Sequence__Group_2__13732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParametersAssignment_2_1_in_rule__Sequence__Group_2__1__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__2__Impl_in_rule__Sequence__Group_2__23789 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__3_in_rule__Sequence__Group_2__23792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__0_in_rule__Sequence__Group_2__2__Impl3819 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__3__Impl_in_rule__Sequence__Group_2__33850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sequence__Group_2__3__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__0__Impl_in_rule__Sequence__Group_2_2__03917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__1_in_rule__Sequence__Group_2_2__03920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sequence__Group_2_2__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__1__Impl_in_rule__Sequence__Group_2_2__13979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParametersAssignment_2_2_1_in_rule__Sequence__Group_2_2__1__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04040 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ForAll__Group__0__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__2_in_rule__ForAll__Group__14105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__ElemsAssignment_1_in_rule__ForAll__Group__1__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__2__Impl_in_rule__ForAll__Group__24162 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ForAll__Group__3_in_rule__ForAll__Group__24165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__ItAssignment_2_in_rule__ForAll__Group__2__Impl4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__3__Impl_in_rule__ForAll__Group__34222 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__4_in_rule__ForAll__Group__34225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ForAll__Group__3__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__4__Impl_in_rule__ForAll__Group__44284 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__5_in_rule__ForAll__Group__44287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__BodyAssignment_4_in_rule__ForAll__Group__4__Impl4314 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__ForAll__Group__5__Impl_in_rule__ForAll__Group__54345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForAll__Group__5__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__0__Impl_in_rule__DoWhile__Group__04416 = new BitSet(new long[]{0x0000000F67880020L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__1_in_rule__DoWhile__Group__04419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DoWhile__Group__0__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__1__Impl_in_rule__DoWhile__Group__14478 = new BitSet(new long[]{0x0000000F67880020L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__2_in_rule__DoWhile__Group__14481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__BodyAssignment_1_in_rule__DoWhile__Group__1__Impl4508 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__2__Impl_in_rule__DoWhile__Group__24539 = new BitSet(new long[]{0x000001F00000E020L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__3_in_rule__DoWhile__Group__24542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DoWhile__Group__2__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__3__Impl_in_rule__DoWhile__Group__34601 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__4_in_rule__DoWhile__Group__34604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__ConditionAssignment_3_in_rule__DoWhile__Group__3__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__4__Impl_in_rule__DoWhile__Group__44661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DoWhile__Group__4__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__04730 = new BitSet(new long[]{0x000001F00000E020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IfThenElse__Group__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__14792 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__14795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__24852 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__24855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IfThenElse__Group__2__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__34914 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__34917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl4944 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__44975 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__44978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group__4__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__0_in_rule__IfThenElse__Group__5__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__0__Impl_in_rule__IfThenElse__Group_5__05107 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__1_in_rule__IfThenElse__Group_5__05110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IfThenElse__Group_5__0__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__1__Impl_in_rule__IfThenElse__Group_5__15169 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__2_in_rule__IfThenElse__Group_5__15172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ElseAssignment_5_1_in_rule__IfThenElse__Group_5__1__Impl5199 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__2__Impl_in_rule__IfThenElse__Group_5__25230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group_5__2__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__05295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__05298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__15355 = new BitSet(new long[]{0x000001F00000E020L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__15358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Affectation__Group__1__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__25417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__ElemAssignment_2_in_rule__Affectation__Group__2__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__0__Impl_in_rule__Exec__Group__05480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exec__Group__1_in_rule__Exec__Group__05483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Exec__Group__0__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__1__Impl_in_rule__Exec__Group__15542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exec__Group__2_in_rule__Exec__Group__15545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__SequenceAssignment_1_in_rule__Exec__Group__1__Impl5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__2__Impl_in_rule__Exec__Group__25602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__0_in_rule__Exec__Group__2__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__0__Impl_in_rule__Exec__Group_2__05666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__1_in_rule__Exec__Group_2__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exec__Group_2__0__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__1__Impl_in_rule__Exec__Group_2__15728 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__2_in_rule__Exec__Group_2__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__ParamsAssignment_2_1_in_rule__Exec__Group_2__1__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__2__Impl_in_rule__Exec__Group_2__25788 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__3_in_rule__Exec__Group_2__25791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__0_in_rule__Exec__Group_2__2__Impl5818 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__3__Impl_in_rule__Exec__Group_2__35849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exec__Group_2__3__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__0__Impl_in_rule__Exec__Group_2_2__05916 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__1_in_rule__Exec__Group_2_2__05919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Exec__Group_2_2__0__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__1__Impl_in_rule__Exec__Group_2_2__15978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__ParamsAssignment_2_2_1_in_rule__Exec__Group_2_2__1__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__06039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__06042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Fill__Group__0__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__16101 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__16104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__FieldAssignment_1_in_rule__Fill__Group__1__Impl6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__26161 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__26164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fill__Group__2__Impl6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__36223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Alternatives_3_in_rule__Fill__Group__3__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__06288 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Check__Group__1_in_rule__Check__Group__06291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Check__Group__0__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__16350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__CheckboxAssignment_1_in_rule__Check__Group__1__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__06411 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Click__Group__1_in_rule__Click__Group__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Click__Group__0__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__ElemAssignment_1_in_rule__Click__Group__1__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__06534 = new BitSet(new long[]{0x000001F00000E020L});
    public static final BitSet FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__06537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Verify__Group__0__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__16596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__ConditionAssignment_1_in_rule__Verify__Group__1__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__06657 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__06660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GoTo__Group__0__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__16719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Alternatives_1_in_rule__GoTo__Group__1__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06780 = new BitSet(new long[]{0x000001F00000E020L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Condition__Group__0__Impl6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__0__Impl_in_rule__UnaryCondition__Group__06906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__1_in_rule__UnaryCondition__Group__06909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__OpAssignment_0_in_rule__UnaryCondition__Group__0__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__1__Impl_in_rule__UnaryCondition__Group__16966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__ElemAssignment_1_in_rule__UnaryCondition__Group__1__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__0__Impl_in_rule__BinaryCondition__Group__07027 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__1_in_rule__BinaryCondition__Group__07030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ElemAssignment_0_in_rule__BinaryCondition__Group__0__Impl7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__1__Impl_in_rule__BinaryCondition__Group__17087 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__2_in_rule__BinaryCondition__Group__17090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__OpAssignment_1_in_rule__BinaryCondition__Group__1__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__2__Impl_in_rule__BinaryCondition__Group__27147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Alternatives_2_in_rule__BinaryCondition__Group__2__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Group__0__Impl_in_rule__GetButton__Group__07210 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetButton__Group__1_in_rule__GetButton__Group__07213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GetButton__Group__0__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Group__1__Impl_in_rule__GetButton__Group__17272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Alternatives_1_in_rule__GetButton__Group__1__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Group__0__Impl_in_rule__GetLink__Group__07333 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetLink__Group__1_in_rule__GetLink__Group__07336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GetLink__Group__0__Impl7364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Group__1__Impl_in_rule__GetLink__Group__17395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Alternatives_1_in_rule__GetLink__Group__1__Impl7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__0__Impl_in_rule__GetCheckbox__Group__07456 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__1_in_rule__GetCheckbox__Group__07459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__GetCheckbox__Group__0__Impl7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__1__Impl_in_rule__GetCheckbox__Group__17518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Alternatives_1_in_rule__GetCheckbox__Group__1__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Group__0__Impl_in_rule__GetText__Group__07579 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetText__Group__1_in_rule__GetText__Group__07582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__GetText__Group__0__Impl7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Group__1__Impl_in_rule__GetText__Group__17641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Alternatives_1_in_rule__GetText__Group__1__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__0__Impl_in_rule__GetButtons__Group__07702 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__1_in_rule__GetButtons__Group__07705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__GetButtons__Group__0__Impl7733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__1__Impl_in_rule__GetButtons__Group__17764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Alternatives_1_in_rule__GetButtons__Group__1__Impl7791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__0__Impl_in_rule__GetCheckboxes__Group__07826 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__1_in_rule__GetCheckboxes__Group__07829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__GetCheckboxes__Group__0__Impl7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__1__Impl_in_rule__GetCheckboxes__Group__17888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Alternatives_1_in_rule__GetCheckboxes__Group__1__Impl7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__0__Impl_in_rule__GetLinks__Group__07950 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__1_in_rule__GetLinks__Group__07953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__GetLinks__Group__0__Impl7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__1__Impl_in_rule__GetLinks__Group__18012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Alternatives_1_in_rule__GetLinks__Group__1__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Program__SequencesAssignment_08079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_rule__Program__TestsAssignment_18110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Test__BrowserAssignment_18141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Test__BodyAssignment_38172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_18203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_18234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_2_18265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Sequence__BodyAssignment_48296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElems_in_rule__ForAll__ElemsAssignment_18358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__ForAll__ItAssignment_28389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__ForAll__BodyAssignment_48420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__DoWhile__BodyAssignment_18451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__DoWhile__ConditionAssignment_38482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__IfThenElse__ConditionAssignment_18513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_38544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_5_18575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Affectation__VariableAssignment_08606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_rule__Affectation__ElemAssignment_28637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exec__SequenceAssignment_18672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_18707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_2_18738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fill__FieldAssignment_18769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fill__ValueAssignment_3_08800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fill__ParamAssignment_3_18835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__CheckboxAlternatives_1_0_in_rule__Check__CheckboxAssignment_18870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Click__ElemAssignment_18907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Verify__ConditionAssignment_18942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GoTo__ValueAssignment_1_08973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__LinkAlternatives_1_1_0_in_rule__GoTo__LinkAssignment_1_19004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__UnaryCondition__OpAssignment_09037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UnaryCondition__ElemAssignment_19072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_rule__BinaryCondition__ElemAssignment_09107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_rule__BinaryCondition__OpAssignment_19138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BinaryCondition__ValueAssignment_2_09169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BinaryCondition__ParamAssignment_2_19204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetButton__ValueAssignment_1_09239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetButton__VarAssignment_1_19274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetLink__ValueAssignment_1_09309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetLink__VarAssignment_1_19344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetCheckbox__ValueAssignment_1_09379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetCheckbox__VarAssignment_1_19414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetText__ValueAssignment_1_09449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetText__VarAssignment_1_19484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetButtons__ValueAssignment_1_09519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetButtons__VarAssignment_1_19554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetCheckboxes__ValueAssignment_1_09589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetCheckboxes__VarAssignment_1_19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetLinks__ValueAssignment_1_09659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetLinks__VarAssignment_1_19694 = new BitSet(new long[]{0x0000000000000002L});

}