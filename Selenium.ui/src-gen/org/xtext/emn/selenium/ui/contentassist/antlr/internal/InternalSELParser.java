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
    public String getGrammarFileName() { return "../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g"; }


     
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:61:1: ( ruleProgram EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:62:1: ruleProgram EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:69:1: ruleProgram : ( ( rule__Program__Alternatives )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:73:2: ( ( ( rule__Program__Alternatives )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:74:1: ( ( rule__Program__Alternatives )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:74:1: ( ( rule__Program__Alternatives )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:75:1: ( rule__Program__Alternatives )*
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:76:1: ( rule__Program__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:76:2: rule__Program__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:88:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:89:1: ( ruleTest EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:90:1: ruleTest EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:97:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:101:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:102:1: ( ( rule__Test__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:102:1: ( ( rule__Test__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:103:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:104:1: ( rule__Test__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:104:2: rule__Test__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:116:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:117:1: ( ruleSequence EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:118:1: ruleSequence EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:125:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:129:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:130:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:130:1: ( ( rule__Sequence__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:131:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:132:1: ( rule__Sequence__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:132:2: rule__Sequence__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:144:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:145:1: ( ruleVariable EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:146:1: ruleVariable EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:153:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:157:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:158:1: ( ( rule__Variable__NameAssignment ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:158:1: ( ( rule__Variable__NameAssignment ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:159:1: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:160:1: ( rule__Variable__NameAssignment )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:160:2: rule__Variable__NameAssignment
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:172:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:173:1: ( ruleInstruction EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:174:1: ruleInstruction EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:181:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:185:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:186:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:186:1: ( ( rule__Instruction__Alternatives ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:187:1: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:188:1: ( rule__Instruction__Alternatives )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:188:2: rule__Instruction__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:200:1: entryRuleForAll : ruleForAll EOF ;
    public final void entryRuleForAll() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:201:1: ( ruleForAll EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:202:1: ruleForAll EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:209:1: ruleForAll : ( ( rule__ForAll__Group__0 ) ) ;
    public final void ruleForAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:213:2: ( ( ( rule__ForAll__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:214:1: ( ( rule__ForAll__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:214:1: ( ( rule__ForAll__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:215:1: ( rule__ForAll__Group__0 )
            {
             before(grammarAccess.getForAllAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:216:1: ( rule__ForAll__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:216:2: rule__ForAll__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:228:1: entryRuleDoWhile : ruleDoWhile EOF ;
    public final void entryRuleDoWhile() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:229:1: ( ruleDoWhile EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:230:1: ruleDoWhile EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:237:1: ruleDoWhile : ( ( rule__DoWhile__Group__0 ) ) ;
    public final void ruleDoWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:241:2: ( ( ( rule__DoWhile__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:242:1: ( ( rule__DoWhile__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:242:1: ( ( rule__DoWhile__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:243:1: ( rule__DoWhile__Group__0 )
            {
             before(grammarAccess.getDoWhileAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:244:1: ( rule__DoWhile__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:244:2: rule__DoWhile__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:256:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:257:1: ( ruleIfThenElse EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:258:1: ruleIfThenElse EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:265:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:269:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:270:1: ( ( rule__IfThenElse__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:270:1: ( ( rule__IfThenElse__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:271:1: ( rule__IfThenElse__Group__0 )
            {
             before(grammarAccess.getIfThenElseAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:272:1: ( rule__IfThenElse__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:272:2: rule__IfThenElse__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:284:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:285:1: ( ruleAffectation EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:286:1: ruleAffectation EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:293:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:297:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:298:1: ( ( rule__Affectation__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:298:1: ( ( rule__Affectation__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:299:1: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:300:1: ( rule__Affectation__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:300:2: rule__Affectation__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:312:1: entryRuleExec : ruleExec EOF ;
    public final void entryRuleExec() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:313:1: ( ruleExec EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:314:1: ruleExec EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:321:1: ruleExec : ( ( rule__Exec__Group__0 ) ) ;
    public final void ruleExec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:325:2: ( ( ( rule__Exec__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:326:1: ( ( rule__Exec__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:326:1: ( ( rule__Exec__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:327:1: ( rule__Exec__Group__0 )
            {
             before(grammarAccess.getExecAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:328:1: ( rule__Exec__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:328:2: rule__Exec__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:340:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:341:1: ( ruleFill EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:342:1: ruleFill EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:349:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:353:2: ( ( ( rule__Fill__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:354:1: ( ( rule__Fill__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:354:1: ( ( rule__Fill__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:355:1: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:356:1: ( rule__Fill__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:356:2: rule__Fill__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:368:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:369:1: ( ruleCheck EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:370:1: ruleCheck EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:377:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:381:2: ( ( ( rule__Check__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:382:1: ( ( rule__Check__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:382:1: ( ( rule__Check__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:383:1: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:384:1: ( rule__Check__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:384:2: rule__Check__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:396:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:397:1: ( ruleClick EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:398:1: ruleClick EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:405:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:409:2: ( ( ( rule__Click__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:410:1: ( ( rule__Click__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:410:1: ( ( rule__Click__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:411:1: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:412:1: ( rule__Click__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:412:2: rule__Click__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:424:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:425:1: ( ruleVerify EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:426:1: ruleVerify EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:433:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:437:2: ( ( ( rule__Verify__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:438:1: ( ( rule__Verify__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:438:1: ( ( rule__Verify__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:439:1: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:440:1: ( rule__Verify__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:440:2: rule__Verify__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:452:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:453:1: ( ruleGoTo EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:454:1: ruleGoTo EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:461:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:465:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:466:1: ( ( rule__GoTo__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:466:1: ( ( rule__GoTo__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:467:1: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:468:1: ( rule__GoTo__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:468:2: rule__GoTo__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:480:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:481:1: ( ruleCondition EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:482:1: ruleCondition EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:489:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:493:2: ( ( ( rule__Condition__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:494:1: ( ( rule__Condition__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:494:1: ( ( rule__Condition__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:495:1: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:496:1: ( rule__Condition__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:496:2: rule__Condition__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:508:1: entryRuleUnaryCondition : ruleUnaryCondition EOF ;
    public final void entryRuleUnaryCondition() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:509:1: ( ruleUnaryCondition EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:510:1: ruleUnaryCondition EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:517:1: ruleUnaryCondition : ( ( rule__UnaryCondition__Group__0 ) ) ;
    public final void ruleUnaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:521:2: ( ( ( rule__UnaryCondition__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:522:1: ( ( rule__UnaryCondition__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:522:1: ( ( rule__UnaryCondition__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:523:1: ( rule__UnaryCondition__Group__0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:524:1: ( rule__UnaryCondition__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:524:2: rule__UnaryCondition__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:536:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:537:1: ( ruleBinaryCondition EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:538:1: ruleBinaryCondition EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:545:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Group__0 ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:549:2: ( ( ( rule__BinaryCondition__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:550:1: ( ( rule__BinaryCondition__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:550:1: ( ( rule__BinaryCondition__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:551:1: ( rule__BinaryCondition__Group__0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:552:1: ( rule__BinaryCondition__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:552:2: rule__BinaryCondition__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:564:1: entryRuleElem : ruleElem EOF ;
    public final void entryRuleElem() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:565:1: ( ruleElem EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:566:1: ruleElem EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:573:1: ruleElem : ( ( rule__Elem__Alternatives ) ) ;
    public final void ruleElem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:577:2: ( ( ( rule__Elem__Alternatives ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:578:1: ( ( rule__Elem__Alternatives ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:578:1: ( ( rule__Elem__Alternatives ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:579:1: ( rule__Elem__Alternatives )
            {
             before(grammarAccess.getElemAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:580:1: ( rule__Elem__Alternatives )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:580:2: rule__Elem__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:592:1: entryRuleGetButton : ruleGetButton EOF ;
    public final void entryRuleGetButton() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:593:1: ( ruleGetButton EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:594:1: ruleGetButton EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:601:1: ruleGetButton : ( ( rule__GetButton__Group__0 ) ) ;
    public final void ruleGetButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:605:2: ( ( ( rule__GetButton__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:606:1: ( ( rule__GetButton__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:606:1: ( ( rule__GetButton__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:607:1: ( rule__GetButton__Group__0 )
            {
             before(grammarAccess.getGetButtonAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:608:1: ( rule__GetButton__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:608:2: rule__GetButton__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:620:1: entryRuleGetLink : ruleGetLink EOF ;
    public final void entryRuleGetLink() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:621:1: ( ruleGetLink EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:622:1: ruleGetLink EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:629:1: ruleGetLink : ( ( rule__GetLink__Group__0 ) ) ;
    public final void ruleGetLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:633:2: ( ( ( rule__GetLink__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:634:1: ( ( rule__GetLink__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:634:1: ( ( rule__GetLink__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:635:1: ( rule__GetLink__Group__0 )
            {
             before(grammarAccess.getGetLinkAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:636:1: ( rule__GetLink__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:636:2: rule__GetLink__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:648:1: entryRuleGetCheckbox : ruleGetCheckbox EOF ;
    public final void entryRuleGetCheckbox() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:649:1: ( ruleGetCheckbox EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:650:1: ruleGetCheckbox EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:657:1: ruleGetCheckbox : ( ( rule__GetCheckbox__Group__0 ) ) ;
    public final void ruleGetCheckbox() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:661:2: ( ( ( rule__GetCheckbox__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:662:1: ( ( rule__GetCheckbox__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:662:1: ( ( rule__GetCheckbox__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:663:1: ( rule__GetCheckbox__Group__0 )
            {
             before(grammarAccess.getGetCheckboxAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:664:1: ( rule__GetCheckbox__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:664:2: rule__GetCheckbox__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:676:1: entryRuleGetText : ruleGetText EOF ;
    public final void entryRuleGetText() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:677:1: ( ruleGetText EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:678:1: ruleGetText EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:685:1: ruleGetText : ( ( rule__GetText__Group__0 ) ) ;
    public final void ruleGetText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:689:2: ( ( ( rule__GetText__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:690:1: ( ( rule__GetText__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:690:1: ( ( rule__GetText__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:691:1: ( rule__GetText__Group__0 )
            {
             before(grammarAccess.getGetTextAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:692:1: ( rule__GetText__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:692:2: rule__GetText__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:704:1: entryRuleElems : ruleElems EOF ;
    public final void entryRuleElems() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:705:1: ( ruleElems EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:706:1: ruleElems EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:713:1: ruleElems : ( ( rule__Elems__Alternatives ) ) ;
    public final void ruleElems() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:717:2: ( ( ( rule__Elems__Alternatives ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:718:1: ( ( rule__Elems__Alternatives ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:718:1: ( ( rule__Elems__Alternatives ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:719:1: ( rule__Elems__Alternatives )
            {
             before(grammarAccess.getElemsAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:720:1: ( rule__Elems__Alternatives )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:720:2: rule__Elems__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:732:1: entryRuleGetButtons : ruleGetButtons EOF ;
    public final void entryRuleGetButtons() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:733:1: ( ruleGetButtons EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:734:1: ruleGetButtons EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:741:1: ruleGetButtons : ( ( rule__GetButtons__Group__0 ) ) ;
    public final void ruleGetButtons() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:745:2: ( ( ( rule__GetButtons__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:746:1: ( ( rule__GetButtons__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:746:1: ( ( rule__GetButtons__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:747:1: ( rule__GetButtons__Group__0 )
            {
             before(grammarAccess.getGetButtonsAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:748:1: ( rule__GetButtons__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:748:2: rule__GetButtons__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:760:1: entryRuleGetCheckboxes : ruleGetCheckboxes EOF ;
    public final void entryRuleGetCheckboxes() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:761:1: ( ruleGetCheckboxes EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:762:1: ruleGetCheckboxes EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:769:1: ruleGetCheckboxes : ( ( rule__GetCheckboxes__Group__0 ) ) ;
    public final void ruleGetCheckboxes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:773:2: ( ( ( rule__GetCheckboxes__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:774:1: ( ( rule__GetCheckboxes__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:774:1: ( ( rule__GetCheckboxes__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:775:1: ( rule__GetCheckboxes__Group__0 )
            {
             before(grammarAccess.getGetCheckboxesAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:776:1: ( rule__GetCheckboxes__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:776:2: rule__GetCheckboxes__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:788:1: entryRuleGetLinks : ruleGetLinks EOF ;
    public final void entryRuleGetLinks() throws RecognitionException {
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:789:1: ( ruleGetLinks EOF )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:790:1: ruleGetLinks EOF
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:797:1: ruleGetLinks : ( ( rule__GetLinks__Group__0 ) ) ;
    public final void ruleGetLinks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:801:2: ( ( ( rule__GetLinks__Group__0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:802:1: ( ( rule__GetLinks__Group__0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:802:1: ( ( rule__GetLinks__Group__0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:803:1: ( rule__GetLinks__Group__0 )
            {
             before(grammarAccess.getGetLinksAccess().getGroup()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:804:1: ( rule__GetLinks__Group__0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:804:2: rule__GetLinks__Group__0
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:817:1: ruleBinaryOp : ( ( rule__BinaryOp__Alternatives ) ) ;
    public final void ruleBinaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:821:1: ( ( ( rule__BinaryOp__Alternatives ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:822:1: ( ( rule__BinaryOp__Alternatives ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:822:1: ( ( rule__BinaryOp__Alternatives ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:823:1: ( rule__BinaryOp__Alternatives )
            {
             before(grammarAccess.getBinaryOpAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:824:1: ( rule__BinaryOp__Alternatives )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:824:2: rule__BinaryOp__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:836:1: ruleUnaryOp : ( ( rule__UnaryOp__Alternatives ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:840:1: ( ( ( rule__UnaryOp__Alternatives ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:841:1: ( ( rule__UnaryOp__Alternatives ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:841:1: ( ( rule__UnaryOp__Alternatives ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:842:1: ( rule__UnaryOp__Alternatives )
            {
             before(grammarAccess.getUnaryOpAccess().getAlternatives()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:843:1: ( rule__UnaryOp__Alternatives )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:843:2: rule__UnaryOp__Alternatives
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:854:1: rule__Program__Alternatives : ( ( ( rule__Program__SequencesAssignment_0 ) ) | ( ( rule__Program__TestsAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:858:1: ( ( ( rule__Program__SequencesAssignment_0 ) ) | ( ( rule__Program__TestsAssignment_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:859:1: ( ( rule__Program__SequencesAssignment_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:859:1: ( ( rule__Program__SequencesAssignment_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:860:1: ( rule__Program__SequencesAssignment_0 )
                    {
                     before(grammarAccess.getProgramAccess().getSequencesAssignment_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:861:1: ( rule__Program__SequencesAssignment_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:861:2: rule__Program__SequencesAssignment_0
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:865:6: ( ( rule__Program__TestsAssignment_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:865:6: ( ( rule__Program__TestsAssignment_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:866:1: ( rule__Program__TestsAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getTestsAssignment_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:867:1: ( rule__Program__TestsAssignment_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:867:2: rule__Program__TestsAssignment_1
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:876:1: rule__Instruction__Alternatives : ( ( ruleSequence ) | ( ruleForAll ) | ( ruleDoWhile ) | ( ruleIfThenElse ) | ( ruleAffectation ) | ( ruleExec ) | ( ruleFill ) | ( ruleCheck ) | ( ruleClick ) | ( ruleVerify ) | ( ruleGoTo ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:880:1: ( ( ruleSequence ) | ( ruleForAll ) | ( ruleDoWhile ) | ( ruleIfThenElse ) | ( ruleAffectation ) | ( ruleExec ) | ( ruleFill ) | ( ruleCheck ) | ( ruleClick ) | ( ruleVerify ) | ( ruleGoTo ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:881:1: ( ruleSequence )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:881:1: ( ruleSequence )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:882:1: ruleSequence
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:887:6: ( ruleForAll )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:887:6: ( ruleForAll )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:888:1: ruleForAll
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:893:6: ( ruleDoWhile )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:893:6: ( ruleDoWhile )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:894:1: ruleDoWhile
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:899:6: ( ruleIfThenElse )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:899:6: ( ruleIfThenElse )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:900:1: ruleIfThenElse
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:905:6: ( ruleAffectation )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:905:6: ( ruleAffectation )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:906:1: ruleAffectation
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:911:6: ( ruleExec )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:911:6: ( ruleExec )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:912:1: ruleExec
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:917:6: ( ruleFill )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:917:6: ( ruleFill )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:918:1: ruleFill
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:923:6: ( ruleCheck )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:923:6: ( ruleCheck )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:924:1: ruleCheck
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:929:6: ( ruleClick )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:929:6: ( ruleClick )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:930:1: ruleClick
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:935:6: ( ruleVerify )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:935:6: ( ruleVerify )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:936:1: ruleVerify
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:941:6: ( ruleGoTo )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:941:6: ( ruleGoTo )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:942:1: ruleGoTo
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:952:1: rule__Fill__Alternatives_3 : ( ( ( rule__Fill__ValueAssignment_3_0 ) ) | ( ( rule__Fill__ParamAssignment_3_1 ) ) );
    public final void rule__Fill__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:956:1: ( ( ( rule__Fill__ValueAssignment_3_0 ) ) | ( ( rule__Fill__ParamAssignment_3_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:957:1: ( ( rule__Fill__ValueAssignment_3_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:957:1: ( ( rule__Fill__ValueAssignment_3_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:958:1: ( rule__Fill__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getFillAccess().getValueAssignment_3_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:959:1: ( rule__Fill__ValueAssignment_3_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:959:2: rule__Fill__ValueAssignment_3_0
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:963:6: ( ( rule__Fill__ParamAssignment_3_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:963:6: ( ( rule__Fill__ParamAssignment_3_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:964:1: ( rule__Fill__ParamAssignment_3_1 )
                    {
                     before(grammarAccess.getFillAccess().getParamAssignment_3_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:965:1: ( rule__Fill__ParamAssignment_3_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:965:2: rule__Fill__ParamAssignment_3_1
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:974:1: rule__Check__CheckboxAlternatives_1_0 : ( ( ruleGetCheckbox ) | ( () ) );
    public final void rule__Check__CheckboxAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:978:1: ( ( ruleGetCheckbox ) | ( () ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:979:1: ( ruleGetCheckbox )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:979:1: ( ruleGetCheckbox )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:980:1: ruleGetCheckbox
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:985:6: ( () )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:985:6: ( () )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:986:1: ()
                    {
                     before(grammarAccess.getCheckAccess().getCheckboxVariableCrossReference_1_0_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:987:1: ()
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:989:1: 
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


    // $ANTLR start "rule__Click__ElemAlternatives_1_0"
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:998:1: rule__Click__ElemAlternatives_1_0 : ( ( ruleElem ) | ( () ) );
    public final void rule__Click__ElemAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1002:1: ( ( ruleElem ) | ( () ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=37 && LA6_0<=40)) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==RULE_ID||(LA6_0>=18 && LA6_0<=19)||(LA6_0>=23 && LA6_0<=26)||(LA6_0>=29 && LA6_0<=30)||(LA6_0>=32 && LA6_0<=35)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1003:1: ( ruleElem )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1003:1: ( ruleElem )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1004:1: ruleElem
                    {
                     before(grammarAccess.getClickAccess().getElemElemParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleElem_in_rule__Click__ElemAlternatives_1_02118);
                    ruleElem();

                    state._fsp--;

                     after(grammarAccess.getClickAccess().getElemElemParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1009:6: ( () )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1009:6: ( () )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1010:1: ()
                    {
                     before(grammarAccess.getClickAccess().getElemVariableCrossReference_1_0_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1011:1: ()
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1013:1: 
                    {
                    }

                     after(grammarAccess.getClickAccess().getElemVariableCrossReference_1_0_1()); 

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
    // $ANTLR end "rule__Click__ElemAlternatives_1_0"


    // $ANTLR start "rule__GoTo__Alternatives_1"
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1022:1: rule__GoTo__Alternatives_1 : ( ( ( rule__GoTo__ValueAssignment_1_0 ) ) | ( ( rule__GoTo__LinkAssignment_1_1 ) ) );
    public final void rule__GoTo__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1026:1: ( ( ( rule__GoTo__ValueAssignment_1_0 ) ) | ( ( rule__GoTo__LinkAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==RULE_ID||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=23 && LA7_0<=26)||(LA7_0>=29 && LA7_0<=30)||(LA7_0>=32 && LA7_0<=35)||LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1027:1: ( ( rule__GoTo__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1027:1: ( ( rule__GoTo__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1028:1: ( rule__GoTo__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGoToAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1029:1: ( rule__GoTo__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1029:2: rule__GoTo__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GoTo__ValueAssignment_1_0_in_rule__GoTo__Alternatives_12169);
                    rule__GoTo__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoToAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1033:6: ( ( rule__GoTo__LinkAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1033:6: ( ( rule__GoTo__LinkAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1034:1: ( rule__GoTo__LinkAssignment_1_1 )
                    {
                     before(grammarAccess.getGoToAccess().getLinkAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1035:1: ( rule__GoTo__LinkAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1035:2: rule__GoTo__LinkAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GoTo__LinkAssignment_1_1_in_rule__GoTo__Alternatives_12187);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1044:1: rule__GoTo__LinkAlternatives_1_1_0 : ( ( () ) | ( ruleGetLink ) );
    public final void rule__GoTo__LinkAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1048:1: ( ( () ) | ( ruleGetLink ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EOF||LA8_0==RULE_ID||(LA8_0>=18 && LA8_0<=19)||(LA8_0>=23 && LA8_0<=26)||(LA8_0>=29 && LA8_0<=30)||(LA8_0>=32 && LA8_0<=35)) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1049:1: ( () )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1049:1: ( () )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1050:1: ()
                    {
                     before(grammarAccess.getGoToAccess().getLinkVariableCrossReference_1_1_0_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1051:1: ()
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1053:1: 
                    {
                    }

                     after(grammarAccess.getGoToAccess().getLinkVariableCrossReference_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1057:6: ( ruleGetLink )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1057:6: ( ruleGetLink )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1058:1: ruleGetLink
                    {
                     before(grammarAccess.getGoToAccess().getLinkGetLinkParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleGetLink_in_rule__GoTo__LinkAlternatives_1_1_02239);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1068:1: rule__Condition__Alternatives_1 : ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1072:1: ( ( ruleUnaryCondition ) | ( ruleBinaryCondition ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=15)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=37 && LA9_0<=40)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1073:1: ( ruleUnaryCondition )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1073:1: ( ruleUnaryCondition )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1074:1: ruleUnaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleUnaryCondition_in_rule__Condition__Alternatives_12271);
                    ruleUnaryCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getUnaryConditionParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1079:6: ( ruleBinaryCondition )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1079:6: ( ruleBinaryCondition )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1080:1: ruleBinaryCondition
                    {
                     before(grammarAccess.getConditionAccess().getBinaryConditionParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives_12288);
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


    // $ANTLR start "rule__UnaryCondition__ElemAlternatives_1_0"
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1090:1: rule__UnaryCondition__ElemAlternatives_1_0 : ( ( ruleElem ) | ( () ) );
    public final void rule__UnaryCondition__ElemAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1094:1: ( ( ruleElem ) | ( () ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=37 && LA10_0<=40)) ) {
                alt10=1;
            }
            else if ( (LA10_0==EOF||LA10_0==RULE_ID||(LA10_0>=17 && LA10_0<=19)||LA10_0==21||(LA10_0>=23 && LA10_0<=26)||(LA10_0>=29 && LA10_0<=30)||(LA10_0>=32 && LA10_0<=35)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1095:1: ( ruleElem )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1095:1: ( ruleElem )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1096:1: ruleElem
                    {
                     before(grammarAccess.getUnaryConditionAccess().getElemElemParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleElem_in_rule__UnaryCondition__ElemAlternatives_1_02320);
                    ruleElem();

                    state._fsp--;

                     after(grammarAccess.getUnaryConditionAccess().getElemElemParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1101:6: ( () )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1101:6: ( () )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1102:1: ()
                    {
                     before(grammarAccess.getUnaryConditionAccess().getElemVariableCrossReference_1_0_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1103:1: ()
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1105:1: 
                    {
                    }

                     after(grammarAccess.getUnaryConditionAccess().getElemVariableCrossReference_1_0_1()); 

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
    // $ANTLR end "rule__UnaryCondition__ElemAlternatives_1_0"


    // $ANTLR start "rule__BinaryCondition__Alternatives_2"
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1114:1: rule__BinaryCondition__Alternatives_2 : ( ( ( rule__BinaryCondition__ValueAssignment_2_0 ) ) | ( ( rule__BinaryCondition__ParamAssignment_2_1 ) ) );
    public final void rule__BinaryCondition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1118:1: ( ( ( rule__BinaryCondition__ValueAssignment_2_0 ) ) | ( ( rule__BinaryCondition__ParamAssignment_2_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1119:1: ( ( rule__BinaryCondition__ValueAssignment_2_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1119:1: ( ( rule__BinaryCondition__ValueAssignment_2_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1120:1: ( rule__BinaryCondition__ValueAssignment_2_0 )
                    {
                     before(grammarAccess.getBinaryConditionAccess().getValueAssignment_2_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1121:1: ( rule__BinaryCondition__ValueAssignment_2_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1121:2: rule__BinaryCondition__ValueAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BinaryCondition__ValueAssignment_2_0_in_rule__BinaryCondition__Alternatives_22371);
                    rule__BinaryCondition__ValueAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBinaryConditionAccess().getValueAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1125:6: ( ( rule__BinaryCondition__ParamAssignment_2_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1125:6: ( ( rule__BinaryCondition__ParamAssignment_2_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1126:1: ( rule__BinaryCondition__ParamAssignment_2_1 )
                    {
                     before(grammarAccess.getBinaryConditionAccess().getParamAssignment_2_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1127:1: ( rule__BinaryCondition__ParamAssignment_2_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1127:2: rule__BinaryCondition__ParamAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__BinaryCondition__ParamAssignment_2_1_in_rule__BinaryCondition__Alternatives_22389);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1136:1: rule__Elem__Alternatives : ( ( ruleGetButton ) | ( ruleGetLink ) | ( ruleGetCheckbox ) | ( ruleGetText ) );
    public final void rule__Elem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1140:1: ( ( ruleGetButton ) | ( ruleGetLink ) | ( ruleGetCheckbox ) | ( ruleGetText ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 38:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1141:1: ( ruleGetButton )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1141:1: ( ruleGetButton )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1142:1: ruleGetButton
                    {
                     before(grammarAccess.getElemAccess().getGetButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetButton_in_rule__Elem__Alternatives2422);
                    ruleGetButton();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1147:6: ( ruleGetLink )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1147:6: ( ruleGetLink )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1148:1: ruleGetLink
                    {
                     before(grammarAccess.getElemAccess().getGetLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGetLink_in_rule__Elem__Alternatives2439);
                    ruleGetLink();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetLinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1153:6: ( ruleGetCheckbox )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1153:6: ( ruleGetCheckbox )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1154:1: ruleGetCheckbox
                    {
                     before(grammarAccess.getElemAccess().getGetCheckboxParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGetCheckbox_in_rule__Elem__Alternatives2456);
                    ruleGetCheckbox();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetCheckboxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1159:6: ( ruleGetText )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1159:6: ( ruleGetText )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1160:1: ruleGetText
                    {
                     before(grammarAccess.getElemAccess().getGetTextParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGetText_in_rule__Elem__Alternatives2473);
                    ruleGetText();

                    state._fsp--;

                     after(grammarAccess.getElemAccess().getGetTextParserRuleCall_3()); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1170:1: rule__GetButton__Alternatives_1 : ( ( ( rule__GetButton__ValueAssignment_1_0 ) ) | ( ( rule__GetButton__VarAssignment_1_1 ) ) );
    public final void rule__GetButton__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1174:1: ( ( ( rule__GetButton__ValueAssignment_1_0 ) ) | ( ( rule__GetButton__VarAssignment_1_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1175:1: ( ( rule__GetButton__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1175:1: ( ( rule__GetButton__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1176:1: ( rule__GetButton__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetButtonAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1177:1: ( rule__GetButton__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1177:2: rule__GetButton__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetButton__ValueAssignment_1_0_in_rule__GetButton__Alternatives_12505);
                    rule__GetButton__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1181:6: ( ( rule__GetButton__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1181:6: ( ( rule__GetButton__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1182:1: ( rule__GetButton__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetButtonAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1183:1: ( rule__GetButton__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1183:2: rule__GetButton__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetButton__VarAssignment_1_1_in_rule__GetButton__Alternatives_12523);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1192:1: rule__GetLink__Alternatives_1 : ( ( ( rule__GetLink__ValueAssignment_1_0 ) ) | ( ( rule__GetLink__VarAssignment_1_1 ) ) );
    public final void rule__GetLink__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1196:1: ( ( ( rule__GetLink__ValueAssignment_1_0 ) ) | ( ( rule__GetLink__VarAssignment_1_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1197:1: ( ( rule__GetLink__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1197:1: ( ( rule__GetLink__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1198:1: ( rule__GetLink__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetLinkAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1199:1: ( rule__GetLink__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1199:2: rule__GetLink__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetLink__ValueAssignment_1_0_in_rule__GetLink__Alternatives_12556);
                    rule__GetLink__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinkAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1203:6: ( ( rule__GetLink__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1203:6: ( ( rule__GetLink__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1204:1: ( rule__GetLink__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetLinkAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1205:1: ( rule__GetLink__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1205:2: rule__GetLink__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetLink__VarAssignment_1_1_in_rule__GetLink__Alternatives_12574);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1214:1: rule__GetCheckbox__Alternatives_1 : ( ( ( rule__GetCheckbox__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckbox__VarAssignment_1_1 ) ) );
    public final void rule__GetCheckbox__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1218:1: ( ( ( rule__GetCheckbox__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckbox__VarAssignment_1_1 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1219:1: ( ( rule__GetCheckbox__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1219:1: ( ( rule__GetCheckbox__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1220:1: ( rule__GetCheckbox__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetCheckboxAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1221:1: ( rule__GetCheckbox__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1221:2: rule__GetCheckbox__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetCheckbox__ValueAssignment_1_0_in_rule__GetCheckbox__Alternatives_12607);
                    rule__GetCheckbox__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1225:6: ( ( rule__GetCheckbox__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1225:6: ( ( rule__GetCheckbox__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1226:1: ( rule__GetCheckbox__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetCheckboxAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1227:1: ( rule__GetCheckbox__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1227:2: rule__GetCheckbox__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckbox__VarAssignment_1_1_in_rule__GetCheckbox__Alternatives_12625);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1236:1: rule__GetText__Alternatives_1 : ( ( ( rule__GetText__ValueAssignment_1_0 ) ) | ( ( rule__GetText__VarAssignment_1_1 ) ) );
    public final void rule__GetText__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1240:1: ( ( ( rule__GetText__ValueAssignment_1_0 ) ) | ( ( rule__GetText__VarAssignment_1_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1241:1: ( ( rule__GetText__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1241:1: ( ( rule__GetText__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1242:1: ( rule__GetText__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetTextAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1243:1: ( rule__GetText__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1243:2: rule__GetText__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetText__ValueAssignment_1_0_in_rule__GetText__Alternatives_12658);
                    rule__GetText__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetTextAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1247:6: ( ( rule__GetText__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1247:6: ( ( rule__GetText__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1248:1: ( rule__GetText__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetTextAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1249:1: ( rule__GetText__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1249:2: rule__GetText__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetText__VarAssignment_1_1_in_rule__GetText__Alternatives_12676);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1258:1: rule__Elems__Alternatives : ( ( ruleGetButtons ) | ( ruleGetCheckboxes ) | ( ruleGetLinks ) );
    public final void rule__Elems__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1262:1: ( ( ruleGetButtons ) | ( ruleGetCheckboxes ) | ( ruleGetLinks ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt17=1;
                }
                break;
            case 42:
                {
                alt17=2;
                }
                break;
            case 43:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1263:1: ( ruleGetButtons )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1263:1: ( ruleGetButtons )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1264:1: ruleGetButtons
                    {
                     before(grammarAccess.getElemsAccess().getGetButtonsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGetButtons_in_rule__Elems__Alternatives2709);
                    ruleGetButtons();

                    state._fsp--;

                     after(grammarAccess.getElemsAccess().getGetButtonsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1269:6: ( ruleGetCheckboxes )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1269:6: ( ruleGetCheckboxes )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1270:1: ruleGetCheckboxes
                    {
                     before(grammarAccess.getElemsAccess().getGetCheckboxesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGetCheckboxes_in_rule__Elems__Alternatives2726);
                    ruleGetCheckboxes();

                    state._fsp--;

                     after(grammarAccess.getElemsAccess().getGetCheckboxesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1275:6: ( ruleGetLinks )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1275:6: ( ruleGetLinks )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1276:1: ruleGetLinks
                    {
                     before(grammarAccess.getElemsAccess().getGetLinksParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleGetLinks_in_rule__Elems__Alternatives2743);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1286:1: rule__GetButtons__Alternatives_1 : ( ( ( rule__GetButtons__ValueAssignment_1_0 ) ) | ( ( rule__GetButtons__VarAssignment_1_1 ) ) );
    public final void rule__GetButtons__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1290:1: ( ( ( rule__GetButtons__ValueAssignment_1_0 ) ) | ( ( rule__GetButtons__VarAssignment_1_1 ) ) )
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1291:1: ( ( rule__GetButtons__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1291:1: ( ( rule__GetButtons__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1292:1: ( rule__GetButtons__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetButtonsAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1293:1: ( rule__GetButtons__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1293:2: rule__GetButtons__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetButtons__ValueAssignment_1_0_in_rule__GetButtons__Alternatives_12775);
                    rule__GetButtons__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetButtonsAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1297:6: ( ( rule__GetButtons__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1297:6: ( ( rule__GetButtons__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1298:1: ( rule__GetButtons__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetButtonsAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1299:1: ( rule__GetButtons__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1299:2: rule__GetButtons__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetButtons__VarAssignment_1_1_in_rule__GetButtons__Alternatives_12793);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1308:1: rule__GetCheckboxes__Alternatives_1 : ( ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckboxes__VarAssignment_1_1 ) ) );
    public final void rule__GetCheckboxes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1312:1: ( ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) ) | ( ( rule__GetCheckboxes__VarAssignment_1_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1313:1: ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1313:1: ( ( rule__GetCheckboxes__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1314:1: ( rule__GetCheckboxes__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetCheckboxesAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1315:1: ( rule__GetCheckboxes__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1315:2: rule__GetCheckboxes__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__ValueAssignment_1_0_in_rule__GetCheckboxes__Alternatives_12826);
                    rule__GetCheckboxes__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetCheckboxesAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1319:6: ( ( rule__GetCheckboxes__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1319:6: ( ( rule__GetCheckboxes__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1320:1: ( rule__GetCheckboxes__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetCheckboxesAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1321:1: ( rule__GetCheckboxes__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1321:2: rule__GetCheckboxes__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__VarAssignment_1_1_in_rule__GetCheckboxes__Alternatives_12844);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1330:1: rule__GetLinks__Alternatives_1 : ( ( ( rule__GetLinks__ValueAssignment_1_0 ) ) | ( ( rule__GetLinks__VarAssignment_1_1 ) ) );
    public final void rule__GetLinks__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1334:1: ( ( ( rule__GetLinks__ValueAssignment_1_0 ) ) | ( ( rule__GetLinks__VarAssignment_1_1 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1335:1: ( ( rule__GetLinks__ValueAssignment_1_0 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1335:1: ( ( rule__GetLinks__ValueAssignment_1_0 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1336:1: ( rule__GetLinks__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getGetLinksAccess().getValueAssignment_1_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1337:1: ( rule__GetLinks__ValueAssignment_1_0 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1337:2: rule__GetLinks__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__GetLinks__ValueAssignment_1_0_in_rule__GetLinks__Alternatives_12877);
                    rule__GetLinks__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGetLinksAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1341:6: ( ( rule__GetLinks__VarAssignment_1_1 ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1341:6: ( ( rule__GetLinks__VarAssignment_1_1 ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1342:1: ( rule__GetLinks__VarAssignment_1_1 )
                    {
                     before(grammarAccess.getGetLinksAccess().getVarAssignment_1_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1343:1: ( rule__GetLinks__VarAssignment_1_1 )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1343:2: rule__GetLinks__VarAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__GetLinks__VarAssignment_1_1_in_rule__GetLinks__Alternatives_12895);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1352:1: rule__BinaryOp__Alternatives : ( ( ( 'Contains' ) ) | ( ( 'Equals' ) ) );
    public final void rule__BinaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1356:1: ( ( ( 'Contains' ) ) | ( ( 'Equals' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            else if ( (LA21_0==12) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1357:1: ( ( 'Contains' ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1357:1: ( ( 'Contains' ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1358:1: ( 'Contains' )
                    {
                     before(grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1359:1: ( 'Contains' )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1359:3: 'Contains'
                    {
                    match(input,11,FOLLOW_11_in_rule__BinaryOp__Alternatives2929); 

                    }

                     after(grammarAccess.getBinaryOpAccess().getContainsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1364:6: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1364:6: ( ( 'Equals' ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1365:1: ( 'Equals' )
                    {
                     before(grammarAccess.getBinaryOpAccess().getEqualsEnumLiteralDeclaration_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1366:1: ( 'Equals' )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1366:3: 'Equals'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryOp__Alternatives2950); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1376:1: rule__UnaryOp__Alternatives : ( ( ( 'IsChecked' ) ) | ( ( 'IsEnabled' ) ) | ( ( 'Exists' ) ) );
    public final void rule__UnaryOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1380:1: ( ( ( 'IsChecked' ) ) | ( ( 'IsEnabled' ) ) | ( ( 'Exists' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt22=1;
                }
                break;
            case 14:
                {
                alt22=2;
                }
                break;
            case 15:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1381:1: ( ( 'IsChecked' ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1381:1: ( ( 'IsChecked' ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1382:1: ( 'IsChecked' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1383:1: ( 'IsChecked' )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1383:3: 'IsChecked'
                    {
                    match(input,13,FOLLOW_13_in_rule__UnaryOp__Alternatives2986); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getIsCheckedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1388:6: ( ( 'IsEnabled' ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1388:6: ( ( 'IsEnabled' ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1389:1: ( 'IsEnabled' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1390:1: ( 'IsEnabled' )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1390:3: 'IsEnabled'
                    {
                    match(input,14,FOLLOW_14_in_rule__UnaryOp__Alternatives3007); 

                    }

                     after(grammarAccess.getUnaryOpAccess().getIsEnabledEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1395:6: ( ( 'Exists' ) )
                    {
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1395:6: ( ( 'Exists' ) )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1396:1: ( 'Exists' )
                    {
                     before(grammarAccess.getUnaryOpAccess().getExistsEnumLiteralDeclaration_2()); 
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1397:1: ( 'Exists' )
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1397:3: 'Exists'
                    {
                    match(input,15,FOLLOW_15_in_rule__UnaryOp__Alternatives3028); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1409:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1413:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1414:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__03061);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__1_in_rule__Test__Group__03064);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1421:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1425:1: ( ( 'Test' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1426:1: ( 'Test' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1426:1: ( 'Test' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1427:1: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Test__Group__0__Impl3092); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1440:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1444:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1445:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__13123);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__2_in_rule__Test__Group__13126);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1452:1: rule__Test__Group__1__Impl : ( ( rule__Test__BrowserAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1456:1: ( ( ( rule__Test__BrowserAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1457:1: ( ( rule__Test__BrowserAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1457:1: ( ( rule__Test__BrowserAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1458:1: ( rule__Test__BrowserAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getBrowserAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1459:1: ( rule__Test__BrowserAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1459:2: rule__Test__BrowserAssignment_1
            {
            pushFollow(FOLLOW_rule__Test__BrowserAssignment_1_in_rule__Test__Group__1__Impl3153);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1469:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1473:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1474:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__23183);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__3_in_rule__Test__Group__23186);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1481:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1485:1: ( ( '{' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1486:1: ( '{' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1486:1: ( '{' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1487:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Test__Group__2__Impl3214); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1500:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1504:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1505:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__33245);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__4_in_rule__Test__Group__33248);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1512:1: rule__Test__Group__3__Impl : ( ( rule__Test__BodyAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1516:1: ( ( ( rule__Test__BodyAssignment_3 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1517:1: ( ( rule__Test__BodyAssignment_3 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1517:1: ( ( rule__Test__BodyAssignment_3 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1518:1: ( rule__Test__BodyAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getBodyAssignment_3()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1519:1: ( rule__Test__BodyAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==19||(LA23_0>=23 && LA23_0<=24)||LA23_0==26||(LA23_0>=29 && LA23_0<=30)||(LA23_0>=32 && LA23_0<=35)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1519:2: rule__Test__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Test__BodyAssignment_3_in_rule__Test__Group__3__Impl3275);
            	    rule__Test__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1529:1: rule__Test__Group__4 : rule__Test__Group__4__Impl ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1533:1: ( rule__Test__Group__4__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1534:2: rule__Test__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__43306);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1540:1: rule__Test__Group__4__Impl : ( '}' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1544:1: ( ( '}' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1545:1: ( '}' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1545:1: ( '}' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1546:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Test__Group__4__Impl3334); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1569:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1573:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1574:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03375);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03378);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1581:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1585:1: ( ( 'Sequence' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1586:1: ( 'Sequence' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1586:1: ( 'Sequence' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1587:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__0__Impl3406); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1600:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1604:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1605:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13437);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__13440);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1612:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1616:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1617:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1617:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1618:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1619:1: ( rule__Sequence__NameAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1619:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl3467);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1629:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1633:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1634:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__23497);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__23500);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1641:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__Group_2__0 )? ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1645:1: ( ( ( rule__Sequence__Group_2__0 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1646:1: ( ( rule__Sequence__Group_2__0 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1646:1: ( ( rule__Sequence__Group_2__0 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1647:1: ( rule__Sequence__Group_2__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1648:1: ( rule__Sequence__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1648:2: rule__Sequence__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_2__0_in_rule__Sequence__Group__2__Impl3527);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1658:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1662:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1663:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__33558);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__33561);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1670:1: rule__Sequence__Group__3__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1674:1: ( ( '{' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1675:1: ( '{' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1675:1: ( '{' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1676:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Sequence__Group__3__Impl3589); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1689:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1693:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1694:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43620);
            rule__Sequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__43623);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1701:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__BodyAssignment_4 )* ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1705:1: ( ( ( rule__Sequence__BodyAssignment_4 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1706:1: ( ( rule__Sequence__BodyAssignment_4 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1706:1: ( ( rule__Sequence__BodyAssignment_4 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1707:1: ( rule__Sequence__BodyAssignment_4 )*
            {
             before(grammarAccess.getSequenceAccess().getBodyAssignment_4()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1708:1: ( rule__Sequence__BodyAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==19||(LA25_0>=23 && LA25_0<=24)||LA25_0==26||(LA25_0>=29 && LA25_0<=30)||(LA25_0>=32 && LA25_0<=35)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1708:2: rule__Sequence__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__BodyAssignment_4_in_rule__Sequence__Group__4__Impl3650);
            	    rule__Sequence__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1718:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1722:1: ( rule__Sequence__Group__5__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1723:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__53681);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1729:1: rule__Sequence__Group__5__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1733:1: ( ( '}' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1734:1: ( '}' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1734:1: ( '}' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1735:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Sequence__Group__5__Impl3709); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1760:1: rule__Sequence__Group_2__0 : rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1 ;
    public final void rule__Sequence__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1764:1: ( rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1765:2: rule__Sequence__Group_2__0__Impl rule__Sequence__Group_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__0__Impl_in_rule__Sequence__Group_2__03752);
            rule__Sequence__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__1_in_rule__Sequence__Group_2__03755);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1772:1: rule__Sequence__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Sequence__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1776:1: ( ( '(' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1777:1: ( '(' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1777:1: ( '(' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1778:1: '('
            {
             before(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Sequence__Group_2__0__Impl3783); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1791:1: rule__Sequence__Group_2__1 : rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2 ;
    public final void rule__Sequence__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1795:1: ( rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1796:2: rule__Sequence__Group_2__1__Impl rule__Sequence__Group_2__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__1__Impl_in_rule__Sequence__Group_2__13814);
            rule__Sequence__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__2_in_rule__Sequence__Group_2__13817);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1803:1: rule__Sequence__Group_2__1__Impl : ( ( rule__Sequence__ParametersAssignment_2_1 ) ) ;
    public final void rule__Sequence__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1807:1: ( ( ( rule__Sequence__ParametersAssignment_2_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1808:1: ( ( rule__Sequence__ParametersAssignment_2_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1808:1: ( ( rule__Sequence__ParametersAssignment_2_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1809:1: ( rule__Sequence__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getParametersAssignment_2_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1810:1: ( rule__Sequence__ParametersAssignment_2_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1810:2: rule__Sequence__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__ParametersAssignment_2_1_in_rule__Sequence__Group_2__1__Impl3844);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1820:1: rule__Sequence__Group_2__2 : rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3 ;
    public final void rule__Sequence__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1824:1: ( rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1825:2: rule__Sequence__Group_2__2__Impl rule__Sequence__Group_2__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__2__Impl_in_rule__Sequence__Group_2__23874);
            rule__Sequence__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2__3_in_rule__Sequence__Group_2__23877);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1832:1: rule__Sequence__Group_2__2__Impl : ( ( rule__Sequence__Group_2_2__0 )* ) ;
    public final void rule__Sequence__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1836:1: ( ( ( rule__Sequence__Group_2_2__0 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1837:1: ( ( rule__Sequence__Group_2_2__0 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1837:1: ( ( rule__Sequence__Group_2_2__0 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1838:1: ( rule__Sequence__Group_2_2__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_2_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1839:1: ( rule__Sequence__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==22) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1839:2: rule__Sequence__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__Group_2_2__0_in_rule__Sequence__Group_2__2__Impl3904);
            	    rule__Sequence__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1849:1: rule__Sequence__Group_2__3 : rule__Sequence__Group_2__3__Impl ;
    public final void rule__Sequence__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1853:1: ( rule__Sequence__Group_2__3__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1854:2: rule__Sequence__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2__3__Impl_in_rule__Sequence__Group_2__33935);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1860:1: rule__Sequence__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Sequence__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1864:1: ( ( ')' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1865:1: ( ')' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1865:1: ( ')' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1866:1: ')'
            {
             before(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Sequence__Group_2__3__Impl3963); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1887:1: rule__Sequence__Group_2_2__0 : rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1 ;
    public final void rule__Sequence__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1891:1: ( rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1892:2: rule__Sequence__Group_2_2__0__Impl rule__Sequence__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2_2__0__Impl_in_rule__Sequence__Group_2_2__04002);
            rule__Sequence__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_2_2__1_in_rule__Sequence__Group_2_2__04005);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1899:1: rule__Sequence__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Sequence__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1903:1: ( ( ',' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1904:1: ( ',' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1904:1: ( ',' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1905:1: ','
            {
             before(grammarAccess.getSequenceAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Sequence__Group_2_2__0__Impl4033); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1918:1: rule__Sequence__Group_2_2__1 : rule__Sequence__Group_2_2__1__Impl ;
    public final void rule__Sequence__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1922:1: ( rule__Sequence__Group_2_2__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1923:2: rule__Sequence__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_2_2__1__Impl_in_rule__Sequence__Group_2_2__14064);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1929:1: rule__Sequence__Group_2_2__1__Impl : ( ( rule__Sequence__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Sequence__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1933:1: ( ( ( rule__Sequence__ParametersAssignment_2_2_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1934:1: ( ( rule__Sequence__ParametersAssignment_2_2_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1934:1: ( ( rule__Sequence__ParametersAssignment_2_2_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1935:1: ( rule__Sequence__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getParametersAssignment_2_2_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1936:1: ( rule__Sequence__ParametersAssignment_2_2_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1936:2: rule__Sequence__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__ParametersAssignment_2_2_1_in_rule__Sequence__Group_2_2__1__Impl4091);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1950:1: rule__ForAll__Group__0 : rule__ForAll__Group__0__Impl rule__ForAll__Group__1 ;
    public final void rule__ForAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1954:1: ( rule__ForAll__Group__0__Impl rule__ForAll__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1955:2: rule__ForAll__Group__0__Impl rule__ForAll__Group__1
            {
            pushFollow(FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04125);
            rule__ForAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04128);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1962:1: rule__ForAll__Group__0__Impl : ( 'ForAll' ) ;
    public final void rule__ForAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1966:1: ( ( 'ForAll' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1967:1: ( 'ForAll' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1967:1: ( 'ForAll' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1968:1: 'ForAll'
            {
             before(grammarAccess.getForAllAccess().getForAllKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ForAll__Group__0__Impl4156); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1981:1: rule__ForAll__Group__1 : rule__ForAll__Group__1__Impl rule__ForAll__Group__2 ;
    public final void rule__ForAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1985:1: ( rule__ForAll__Group__1__Impl rule__ForAll__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1986:2: rule__ForAll__Group__1__Impl rule__ForAll__Group__2
            {
            pushFollow(FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14187);
            rule__ForAll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__2_in_rule__ForAll__Group__14190);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1993:1: rule__ForAll__Group__1__Impl : ( ( rule__ForAll__ElemsAssignment_1 ) ) ;
    public final void rule__ForAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1997:1: ( ( ( rule__ForAll__ElemsAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1998:1: ( ( rule__ForAll__ElemsAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1998:1: ( ( rule__ForAll__ElemsAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:1999:1: ( rule__ForAll__ElemsAssignment_1 )
            {
             before(grammarAccess.getForAllAccess().getElemsAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2000:1: ( rule__ForAll__ElemsAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2000:2: rule__ForAll__ElemsAssignment_1
            {
            pushFollow(FOLLOW_rule__ForAll__ElemsAssignment_1_in_rule__ForAll__Group__1__Impl4217);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2010:1: rule__ForAll__Group__2 : rule__ForAll__Group__2__Impl rule__ForAll__Group__3 ;
    public final void rule__ForAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2014:1: ( rule__ForAll__Group__2__Impl rule__ForAll__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2015:2: rule__ForAll__Group__2__Impl rule__ForAll__Group__3
            {
            pushFollow(FOLLOW_rule__ForAll__Group__2__Impl_in_rule__ForAll__Group__24247);
            rule__ForAll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__3_in_rule__ForAll__Group__24250);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2022:1: rule__ForAll__Group__2__Impl : ( ( rule__ForAll__ItAssignment_2 ) ) ;
    public final void rule__ForAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2026:1: ( ( ( rule__ForAll__ItAssignment_2 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2027:1: ( ( rule__ForAll__ItAssignment_2 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2027:1: ( ( rule__ForAll__ItAssignment_2 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2028:1: ( rule__ForAll__ItAssignment_2 )
            {
             before(grammarAccess.getForAllAccess().getItAssignment_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2029:1: ( rule__ForAll__ItAssignment_2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2029:2: rule__ForAll__ItAssignment_2
            {
            pushFollow(FOLLOW_rule__ForAll__ItAssignment_2_in_rule__ForAll__Group__2__Impl4277);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2039:1: rule__ForAll__Group__3 : rule__ForAll__Group__3__Impl rule__ForAll__Group__4 ;
    public final void rule__ForAll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2043:1: ( rule__ForAll__Group__3__Impl rule__ForAll__Group__4 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2044:2: rule__ForAll__Group__3__Impl rule__ForAll__Group__4
            {
            pushFollow(FOLLOW_rule__ForAll__Group__3__Impl_in_rule__ForAll__Group__34307);
            rule__ForAll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__4_in_rule__ForAll__Group__34310);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2051:1: rule__ForAll__Group__3__Impl : ( '{' ) ;
    public final void rule__ForAll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2055:1: ( ( '{' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2056:1: ( '{' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2056:1: ( '{' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2057:1: '{'
            {
             before(grammarAccess.getForAllAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__ForAll__Group__3__Impl4338); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2070:1: rule__ForAll__Group__4 : rule__ForAll__Group__4__Impl rule__ForAll__Group__5 ;
    public final void rule__ForAll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2074:1: ( rule__ForAll__Group__4__Impl rule__ForAll__Group__5 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2075:2: rule__ForAll__Group__4__Impl rule__ForAll__Group__5
            {
            pushFollow(FOLLOW_rule__ForAll__Group__4__Impl_in_rule__ForAll__Group__44369);
            rule__ForAll__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForAll__Group__5_in_rule__ForAll__Group__44372);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2082:1: rule__ForAll__Group__4__Impl : ( ( rule__ForAll__BodyAssignment_4 )* ) ;
    public final void rule__ForAll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2086:1: ( ( ( rule__ForAll__BodyAssignment_4 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2087:1: ( ( rule__ForAll__BodyAssignment_4 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2087:1: ( ( rule__ForAll__BodyAssignment_4 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2088:1: ( rule__ForAll__BodyAssignment_4 )*
            {
             before(grammarAccess.getForAllAccess().getBodyAssignment_4()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2089:1: ( rule__ForAll__BodyAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==19||(LA27_0>=23 && LA27_0<=24)||LA27_0==26||(LA27_0>=29 && LA27_0<=30)||(LA27_0>=32 && LA27_0<=35)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2089:2: rule__ForAll__BodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__ForAll__BodyAssignment_4_in_rule__ForAll__Group__4__Impl4399);
            	    rule__ForAll__BodyAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2099:1: rule__ForAll__Group__5 : rule__ForAll__Group__5__Impl ;
    public final void rule__ForAll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2103:1: ( rule__ForAll__Group__5__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2104:2: rule__ForAll__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ForAll__Group__5__Impl_in_rule__ForAll__Group__54430);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2110:1: rule__ForAll__Group__5__Impl : ( '}' ) ;
    public final void rule__ForAll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2114:1: ( ( '}' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2115:1: ( '}' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2115:1: ( '}' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2116:1: '}'
            {
             before(grammarAccess.getForAllAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__ForAll__Group__5__Impl4458); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2141:1: rule__DoWhile__Group__0 : rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1 ;
    public final void rule__DoWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2145:1: ( rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2146:2: rule__DoWhile__Group__0__Impl rule__DoWhile__Group__1
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__0__Impl_in_rule__DoWhile__Group__04501);
            rule__DoWhile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__1_in_rule__DoWhile__Group__04504);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2153:1: rule__DoWhile__Group__0__Impl : ( 'Do {' ) ;
    public final void rule__DoWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2157:1: ( ( 'Do {' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2158:1: ( 'Do {' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2158:1: ( 'Do {' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2159:1: 'Do {'
            {
             before(grammarAccess.getDoWhileAccess().getDoKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__DoWhile__Group__0__Impl4532); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2172:1: rule__DoWhile__Group__1 : rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2 ;
    public final void rule__DoWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2176:1: ( rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2177:2: rule__DoWhile__Group__1__Impl rule__DoWhile__Group__2
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__1__Impl_in_rule__DoWhile__Group__14563);
            rule__DoWhile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__2_in_rule__DoWhile__Group__14566);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2184:1: rule__DoWhile__Group__1__Impl : ( ( rule__DoWhile__BodyAssignment_1 )* ) ;
    public final void rule__DoWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2188:1: ( ( ( rule__DoWhile__BodyAssignment_1 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2189:1: ( ( rule__DoWhile__BodyAssignment_1 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2189:1: ( ( rule__DoWhile__BodyAssignment_1 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2190:1: ( rule__DoWhile__BodyAssignment_1 )*
            {
             before(grammarAccess.getDoWhileAccess().getBodyAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2191:1: ( rule__DoWhile__BodyAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==19||(LA28_0>=23 && LA28_0<=24)||LA28_0==26||(LA28_0>=29 && LA28_0<=30)||(LA28_0>=32 && LA28_0<=35)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2191:2: rule__DoWhile__BodyAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DoWhile__BodyAssignment_1_in_rule__DoWhile__Group__1__Impl4593);
            	    rule__DoWhile__BodyAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2201:1: rule__DoWhile__Group__2 : rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3 ;
    public final void rule__DoWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2205:1: ( rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2206:2: rule__DoWhile__Group__2__Impl rule__DoWhile__Group__3
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__2__Impl_in_rule__DoWhile__Group__24624);
            rule__DoWhile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__3_in_rule__DoWhile__Group__24627);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2213:1: rule__DoWhile__Group__2__Impl : ( '} While (' ) ;
    public final void rule__DoWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2217:1: ( ( '} While (' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2218:1: ( '} While (' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2218:1: ( '} While (' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2219:1: '} While ('
            {
             before(grammarAccess.getDoWhileAccess().getWhileKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__DoWhile__Group__2__Impl4655); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2232:1: rule__DoWhile__Group__3 : rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4 ;
    public final void rule__DoWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2236:1: ( rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2237:2: rule__DoWhile__Group__3__Impl rule__DoWhile__Group__4
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__3__Impl_in_rule__DoWhile__Group__34686);
            rule__DoWhile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoWhile__Group__4_in_rule__DoWhile__Group__34689);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2244:1: rule__DoWhile__Group__3__Impl : ( ( rule__DoWhile__ConditionAssignment_3 ) ) ;
    public final void rule__DoWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2248:1: ( ( ( rule__DoWhile__ConditionAssignment_3 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2249:1: ( ( rule__DoWhile__ConditionAssignment_3 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2249:1: ( ( rule__DoWhile__ConditionAssignment_3 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2250:1: ( rule__DoWhile__ConditionAssignment_3 )
            {
             before(grammarAccess.getDoWhileAccess().getConditionAssignment_3()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2251:1: ( rule__DoWhile__ConditionAssignment_3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2251:2: rule__DoWhile__ConditionAssignment_3
            {
            pushFollow(FOLLOW_rule__DoWhile__ConditionAssignment_3_in_rule__DoWhile__Group__3__Impl4716);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2261:1: rule__DoWhile__Group__4 : rule__DoWhile__Group__4__Impl ;
    public final void rule__DoWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2265:1: ( rule__DoWhile__Group__4__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2266:2: rule__DoWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DoWhile__Group__4__Impl_in_rule__DoWhile__Group__44746);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2272:1: rule__DoWhile__Group__4__Impl : ( ')' ) ;
    public final void rule__DoWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2276:1: ( ( ')' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2277:1: ( ')' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2277:1: ( ')' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2278:1: ')'
            {
             before(grammarAccess.getDoWhileAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__DoWhile__Group__4__Impl4774); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2301:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2305:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2306:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__04815);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__04818);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2313:1: rule__IfThenElse__Group__0__Impl : ( 'If' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2317:1: ( ( 'If' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2318:1: ( 'If' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2318:1: ( 'If' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2319:1: 'If'
            {
             before(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__IfThenElse__Group__0__Impl4846); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2332:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2336:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2337:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__14877);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__14880);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2344:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__ConditionAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2348:1: ( ( ( rule__IfThenElse__ConditionAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2349:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2349:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2350:1: ( rule__IfThenElse__ConditionAssignment_1 )
            {
             before(grammarAccess.getIfThenElseAccess().getConditionAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2351:1: ( rule__IfThenElse__ConditionAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2351:2: rule__IfThenElse__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl4907);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2361:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2365:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2366:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__24937);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__24940);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2373:1: rule__IfThenElse__Group__2__Impl : ( '{' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2377:1: ( ( '{' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2378:1: ( '{' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2378:1: ( '{' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2379:1: '{'
            {
             before(grammarAccess.getIfThenElseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__IfThenElse__Group__2__Impl4968); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2392:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2396:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2397:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__34999);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35002);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2404:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ThenAssignment_3 )* ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2408:1: ( ( ( rule__IfThenElse__ThenAssignment_3 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2409:1: ( ( rule__IfThenElse__ThenAssignment_3 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2409:1: ( ( rule__IfThenElse__ThenAssignment_3 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2410:1: ( rule__IfThenElse__ThenAssignment_3 )*
            {
             before(grammarAccess.getIfThenElseAccess().getThenAssignment_3()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2411:1: ( rule__IfThenElse__ThenAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==19||(LA29_0>=23 && LA29_0<=24)||LA29_0==26||(LA29_0>=29 && LA29_0<=30)||(LA29_0>=32 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2411:2: rule__IfThenElse__ThenAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl5029);
            	    rule__IfThenElse__ThenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2421:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2425:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2426:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45060);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45063);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2433:1: rule__IfThenElse__Group__4__Impl : ( '}' ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2437:1: ( ( '}' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2438:1: ( '}' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2438:1: ( '}' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2439:1: '}'
            {
             before(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__IfThenElse__Group__4__Impl5091); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2452:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2456:1: ( rule__IfThenElse__Group__5__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2457:2: rule__IfThenElse__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55122);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2463:1: rule__IfThenElse__Group__5__Impl : ( ( rule__IfThenElse__Group_5__0 )? ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2467:1: ( ( ( rule__IfThenElse__Group_5__0 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2468:1: ( ( rule__IfThenElse__Group_5__0 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2468:1: ( ( rule__IfThenElse__Group_5__0 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2469:1: ( rule__IfThenElse__Group_5__0 )?
            {
             before(grammarAccess.getIfThenElseAccess().getGroup_5()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2470:1: ( rule__IfThenElse__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2470:2: rule__IfThenElse__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IfThenElse__Group_5__0_in_rule__IfThenElse__Group__5__Impl5149);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2492:1: rule__IfThenElse__Group_5__0 : rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1 ;
    public final void rule__IfThenElse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2496:1: ( rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2497:2: rule__IfThenElse__Group_5__0__Impl rule__IfThenElse__Group_5__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__0__Impl_in_rule__IfThenElse__Group_5__05192);
            rule__IfThenElse__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group_5__1_in_rule__IfThenElse__Group_5__05195);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2504:1: rule__IfThenElse__Group_5__0__Impl : ( 'Else {' ) ;
    public final void rule__IfThenElse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2508:1: ( ( 'Else {' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2509:1: ( 'Else {' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2509:1: ( 'Else {' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2510:1: 'Else {'
            {
             before(grammarAccess.getIfThenElseAccess().getElseKeyword_5_0()); 
            match(input,27,FOLLOW_27_in_rule__IfThenElse__Group_5__0__Impl5223); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2523:1: rule__IfThenElse__Group_5__1 : rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2 ;
    public final void rule__IfThenElse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2527:1: ( rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2528:2: rule__IfThenElse__Group_5__1__Impl rule__IfThenElse__Group_5__2
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__1__Impl_in_rule__IfThenElse__Group_5__15254);
            rule__IfThenElse__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfThenElse__Group_5__2_in_rule__IfThenElse__Group_5__15257);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2535:1: rule__IfThenElse__Group_5__1__Impl : ( ( rule__IfThenElse__ElseAssignment_5_1 )* ) ;
    public final void rule__IfThenElse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2539:1: ( ( ( rule__IfThenElse__ElseAssignment_5_1 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2540:1: ( ( rule__IfThenElse__ElseAssignment_5_1 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2540:1: ( ( rule__IfThenElse__ElseAssignment_5_1 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2541:1: ( rule__IfThenElse__ElseAssignment_5_1 )*
            {
             before(grammarAccess.getIfThenElseAccess().getElseAssignment_5_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2542:1: ( rule__IfThenElse__ElseAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||LA31_0==19||(LA31_0>=23 && LA31_0<=24)||LA31_0==26||(LA31_0>=29 && LA31_0<=30)||(LA31_0>=32 && LA31_0<=35)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2542:2: rule__IfThenElse__ElseAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__IfThenElse__ElseAssignment_5_1_in_rule__IfThenElse__Group_5__1__Impl5284);
            	    rule__IfThenElse__ElseAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2552:1: rule__IfThenElse__Group_5__2 : rule__IfThenElse__Group_5__2__Impl ;
    public final void rule__IfThenElse__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2556:1: ( rule__IfThenElse__Group_5__2__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2557:2: rule__IfThenElse__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_5__2__Impl_in_rule__IfThenElse__Group_5__25315);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2563:1: rule__IfThenElse__Group_5__2__Impl : ( '}' ) ;
    public final void rule__IfThenElse__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2567:1: ( ( '}' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2568:1: ( '}' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2568:1: ( '}' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2569:1: '}'
            {
             before(grammarAccess.getIfThenElseAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,18,FOLLOW_18_in_rule__IfThenElse__Group_5__2__Impl5343); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2588:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2592:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2593:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__05380);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__05383);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2600:1: rule__Affectation__Group__0__Impl : ( ( rule__Affectation__VariableAssignment_0 ) ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2604:1: ( ( ( rule__Affectation__VariableAssignment_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2605:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2605:1: ( ( rule__Affectation__VariableAssignment_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2606:1: ( rule__Affectation__VariableAssignment_0 )
            {
             before(grammarAccess.getAffectationAccess().getVariableAssignment_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2607:1: ( rule__Affectation__VariableAssignment_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2607:2: rule__Affectation__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl5410);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2617:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2621:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2622:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__15440);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__15443);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2629:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2633:1: ( ( '=' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2634:1: ( '=' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2634:1: ( '=' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2635:1: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__Affectation__Group__1__Impl5471); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2648:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2652:1: ( rule__Affectation__Group__2__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2653:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__25502);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2659:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__ElemAssignment_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2663:1: ( ( ( rule__Affectation__ElemAssignment_2 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2664:1: ( ( rule__Affectation__ElemAssignment_2 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2664:1: ( ( rule__Affectation__ElemAssignment_2 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2665:1: ( rule__Affectation__ElemAssignment_2 )
            {
             before(grammarAccess.getAffectationAccess().getElemAssignment_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2666:1: ( rule__Affectation__ElemAssignment_2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2666:2: rule__Affectation__ElemAssignment_2
            {
            pushFollow(FOLLOW_rule__Affectation__ElemAssignment_2_in_rule__Affectation__Group__2__Impl5529);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2682:1: rule__Exec__Group__0 : rule__Exec__Group__0__Impl rule__Exec__Group__1 ;
    public final void rule__Exec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2686:1: ( rule__Exec__Group__0__Impl rule__Exec__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2687:2: rule__Exec__Group__0__Impl rule__Exec__Group__1
            {
            pushFollow(FOLLOW_rule__Exec__Group__0__Impl_in_rule__Exec__Group__05565);
            rule__Exec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group__1_in_rule__Exec__Group__05568);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2694:1: rule__Exec__Group__0__Impl : ( 'Exec' ) ;
    public final void rule__Exec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2698:1: ( ( 'Exec' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2699:1: ( 'Exec' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2699:1: ( 'Exec' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2700:1: 'Exec'
            {
             before(grammarAccess.getExecAccess().getExecKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Exec__Group__0__Impl5596); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2713:1: rule__Exec__Group__1 : rule__Exec__Group__1__Impl rule__Exec__Group__2 ;
    public final void rule__Exec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2717:1: ( rule__Exec__Group__1__Impl rule__Exec__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2718:2: rule__Exec__Group__1__Impl rule__Exec__Group__2
            {
            pushFollow(FOLLOW_rule__Exec__Group__1__Impl_in_rule__Exec__Group__15627);
            rule__Exec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group__2_in_rule__Exec__Group__15630);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2725:1: rule__Exec__Group__1__Impl : ( ( rule__Exec__SequenceAssignment_1 ) ) ;
    public final void rule__Exec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2729:1: ( ( ( rule__Exec__SequenceAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2730:1: ( ( rule__Exec__SequenceAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2730:1: ( ( rule__Exec__SequenceAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2731:1: ( rule__Exec__SequenceAssignment_1 )
            {
             before(grammarAccess.getExecAccess().getSequenceAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2732:1: ( rule__Exec__SequenceAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2732:2: rule__Exec__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Exec__SequenceAssignment_1_in_rule__Exec__Group__1__Impl5657);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2742:1: rule__Exec__Group__2 : rule__Exec__Group__2__Impl ;
    public final void rule__Exec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2746:1: ( rule__Exec__Group__2__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2747:2: rule__Exec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group__2__Impl_in_rule__Exec__Group__25687);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2753:1: rule__Exec__Group__2__Impl : ( ( rule__Exec__Group_2__0 )? ) ;
    public final void rule__Exec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2757:1: ( ( ( rule__Exec__Group_2__0 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2758:1: ( ( rule__Exec__Group_2__0 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2758:1: ( ( rule__Exec__Group_2__0 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2759:1: ( rule__Exec__Group_2__0 )?
            {
             before(grammarAccess.getExecAccess().getGroup_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2760:1: ( rule__Exec__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2760:2: rule__Exec__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Exec__Group_2__0_in_rule__Exec__Group__2__Impl5714);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2776:1: rule__Exec__Group_2__0 : rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1 ;
    public final void rule__Exec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2780:1: ( rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2781:2: rule__Exec__Group_2__0__Impl rule__Exec__Group_2__1
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__0__Impl_in_rule__Exec__Group_2__05751);
            rule__Exec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__1_in_rule__Exec__Group_2__05754);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2788:1: rule__Exec__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Exec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2792:1: ( ( '(' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2793:1: ( '(' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2793:1: ( '(' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2794:1: '('
            {
             before(grammarAccess.getExecAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Exec__Group_2__0__Impl5782); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2807:1: rule__Exec__Group_2__1 : rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2 ;
    public final void rule__Exec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2811:1: ( rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2812:2: rule__Exec__Group_2__1__Impl rule__Exec__Group_2__2
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__1__Impl_in_rule__Exec__Group_2__15813);
            rule__Exec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__2_in_rule__Exec__Group_2__15816);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2819:1: rule__Exec__Group_2__1__Impl : ( ( rule__Exec__ParamsAssignment_2_1 ) ) ;
    public final void rule__Exec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2823:1: ( ( ( rule__Exec__ParamsAssignment_2_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2824:1: ( ( rule__Exec__ParamsAssignment_2_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2824:1: ( ( rule__Exec__ParamsAssignment_2_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2825:1: ( rule__Exec__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getExecAccess().getParamsAssignment_2_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2826:1: ( rule__Exec__ParamsAssignment_2_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2826:2: rule__Exec__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Exec__ParamsAssignment_2_1_in_rule__Exec__Group_2__1__Impl5843);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2836:1: rule__Exec__Group_2__2 : rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3 ;
    public final void rule__Exec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2840:1: ( rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2841:2: rule__Exec__Group_2__2__Impl rule__Exec__Group_2__3
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__2__Impl_in_rule__Exec__Group_2__25873);
            rule__Exec__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2__3_in_rule__Exec__Group_2__25876);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2848:1: rule__Exec__Group_2__2__Impl : ( ( rule__Exec__Group_2_2__0 )* ) ;
    public final void rule__Exec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2852:1: ( ( ( rule__Exec__Group_2_2__0 )* ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2853:1: ( ( rule__Exec__Group_2_2__0 )* )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2853:1: ( ( rule__Exec__Group_2_2__0 )* )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2854:1: ( rule__Exec__Group_2_2__0 )*
            {
             before(grammarAccess.getExecAccess().getGroup_2_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2855:1: ( rule__Exec__Group_2_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==22) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2855:2: rule__Exec__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Exec__Group_2_2__0_in_rule__Exec__Group_2__2__Impl5903);
            	    rule__Exec__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2865:1: rule__Exec__Group_2__3 : rule__Exec__Group_2__3__Impl ;
    public final void rule__Exec__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2869:1: ( rule__Exec__Group_2__3__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2870:2: rule__Exec__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group_2__3__Impl_in_rule__Exec__Group_2__35934);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2876:1: rule__Exec__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Exec__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2880:1: ( ( ')' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2881:1: ( ')' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2881:1: ( ')' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2882:1: ')'
            {
             before(grammarAccess.getExecAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Exec__Group_2__3__Impl5962); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2903:1: rule__Exec__Group_2_2__0 : rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1 ;
    public final void rule__Exec__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2907:1: ( rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2908:2: rule__Exec__Group_2_2__0__Impl rule__Exec__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Exec__Group_2_2__0__Impl_in_rule__Exec__Group_2_2__06001);
            rule__Exec__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exec__Group_2_2__1_in_rule__Exec__Group_2_2__06004);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2915:1: rule__Exec__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Exec__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2919:1: ( ( ',' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2920:1: ( ',' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2920:1: ( ',' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2921:1: ','
            {
             before(grammarAccess.getExecAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_22_in_rule__Exec__Group_2_2__0__Impl6032); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2934:1: rule__Exec__Group_2_2__1 : rule__Exec__Group_2_2__1__Impl ;
    public final void rule__Exec__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2938:1: ( rule__Exec__Group_2_2__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2939:2: rule__Exec__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Exec__Group_2_2__1__Impl_in_rule__Exec__Group_2_2__16063);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2945:1: rule__Exec__Group_2_2__1__Impl : ( ( rule__Exec__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__Exec__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2949:1: ( ( ( rule__Exec__ParamsAssignment_2_2_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2950:1: ( ( rule__Exec__ParamsAssignment_2_2_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2950:1: ( ( rule__Exec__ParamsAssignment_2_2_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2951:1: ( rule__Exec__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getExecAccess().getParamsAssignment_2_2_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2952:1: ( rule__Exec__ParamsAssignment_2_2_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2952:2: rule__Exec__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Exec__ParamsAssignment_2_2_1_in_rule__Exec__Group_2_2__1__Impl6090);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2966:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2970:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2971:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__06124);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__06127);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2978:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2982:1: ( ( 'Fill' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2983:1: ( 'Fill' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2983:1: ( 'Fill' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2984:1: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Fill__Group__0__Impl6155); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:2997:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3001:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3002:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__16186);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__16189);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3009:1: rule__Fill__Group__1__Impl : ( ( rule__Fill__FieldAssignment_1 ) ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3013:1: ( ( ( rule__Fill__FieldAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3014:1: ( ( rule__Fill__FieldAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3014:1: ( ( rule__Fill__FieldAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3015:1: ( rule__Fill__FieldAssignment_1 )
            {
             before(grammarAccess.getFillAccess().getFieldAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3016:1: ( rule__Fill__FieldAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3016:2: rule__Fill__FieldAssignment_1
            {
            pushFollow(FOLLOW_rule__Fill__FieldAssignment_1_in_rule__Fill__Group__1__Impl6216);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3026:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3030:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3031:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__26246);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__26249);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3038:1: rule__Fill__Group__2__Impl : ( 'with' ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3042:1: ( ( 'with' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3043:1: ( 'with' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3043:1: ( 'with' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3044:1: 'with'
            {
             before(grammarAccess.getFillAccess().getWithKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Fill__Group__2__Impl6277); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3057:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3061:1: ( rule__Fill__Group__3__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3062:2: rule__Fill__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__36308);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3068:1: rule__Fill__Group__3__Impl : ( ( rule__Fill__Alternatives_3 ) ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3072:1: ( ( ( rule__Fill__Alternatives_3 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3073:1: ( ( rule__Fill__Alternatives_3 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3073:1: ( ( rule__Fill__Alternatives_3 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3074:1: ( rule__Fill__Alternatives_3 )
            {
             before(grammarAccess.getFillAccess().getAlternatives_3()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3075:1: ( rule__Fill__Alternatives_3 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3075:2: rule__Fill__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Fill__Alternatives_3_in_rule__Fill__Group__3__Impl6335);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3093:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3097:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3098:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__06373);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Check__Group__1_in_rule__Check__Group__06376);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3105:1: rule__Check__Group__0__Impl : ( 'Check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3109:1: ( ( 'Check' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3110:1: ( 'Check' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3110:1: ( 'Check' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3111:1: 'Check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Check__Group__0__Impl6404); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3124:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3128:1: ( rule__Check__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3129:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__16435);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3135:1: rule__Check__Group__1__Impl : ( ( rule__Check__CheckboxAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3139:1: ( ( ( rule__Check__CheckboxAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3140:1: ( ( rule__Check__CheckboxAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3140:1: ( ( rule__Check__CheckboxAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3141:1: ( rule__Check__CheckboxAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getCheckboxAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3142:1: ( rule__Check__CheckboxAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3142:2: rule__Check__CheckboxAssignment_1
            {
            pushFollow(FOLLOW_rule__Check__CheckboxAssignment_1_in_rule__Check__Group__1__Impl6462);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3156:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3160:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3161:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__06496);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Click__Group__1_in_rule__Click__Group__06499);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3168:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3172:1: ( ( 'Click' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3173:1: ( 'Click' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3173:1: ( 'Click' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3174:1: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Click__Group__0__Impl6527); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3187:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3191:1: ( rule__Click__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3192:2: rule__Click__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__16558);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3198:1: rule__Click__Group__1__Impl : ( ( rule__Click__ElemAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3202:1: ( ( ( rule__Click__ElemAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3203:1: ( ( rule__Click__ElemAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3203:1: ( ( rule__Click__ElemAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3204:1: ( rule__Click__ElemAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getElemAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3205:1: ( rule__Click__ElemAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3205:2: rule__Click__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__Click__ElemAssignment_1_in_rule__Click__Group__1__Impl6585);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3219:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3223:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3224:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__06619);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__06622);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3231:1: rule__Verify__Group__0__Impl : ( 'Verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3235:1: ( ( 'Verify' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3236:1: ( 'Verify' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3236:1: ( 'Verify' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3237:1: 'Verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Verify__Group__0__Impl6650); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3250:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3254:1: ( rule__Verify__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3255:2: rule__Verify__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__16681);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3261:1: rule__Verify__Group__1__Impl : ( ( rule__Verify__ConditionAssignment_1 ) ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3265:1: ( ( ( rule__Verify__ConditionAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3266:1: ( ( rule__Verify__ConditionAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3266:1: ( ( rule__Verify__ConditionAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3267:1: ( rule__Verify__ConditionAssignment_1 )
            {
             before(grammarAccess.getVerifyAccess().getConditionAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3268:1: ( rule__Verify__ConditionAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3268:2: rule__Verify__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__Verify__ConditionAssignment_1_in_rule__Verify__Group__1__Impl6708);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3282:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3286:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3287:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__06742);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__06745);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3294:1: rule__GoTo__Group__0__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3298:1: ( ( 'GoTo' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3299:1: ( 'GoTo' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3299:1: ( 'GoTo' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3300:1: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__GoTo__Group__0__Impl6773); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3313:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3317:1: ( rule__GoTo__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3318:2: rule__GoTo__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__16804);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3324:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__Alternatives_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3328:1: ( ( ( rule__GoTo__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3329:1: ( ( rule__GoTo__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3329:1: ( ( rule__GoTo__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3330:1: ( rule__GoTo__Alternatives_1 )
            {
             before(grammarAccess.getGoToAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3331:1: ( rule__GoTo__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3331:2: rule__GoTo__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GoTo__Alternatives_1_in_rule__GoTo__Group__1__Impl6831);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3345:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3349:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3350:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06865);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06868);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3357:1: rule__Condition__Group__0__Impl : ( ( 'Not' )? ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3361:1: ( ( ( 'Not' )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3362:1: ( ( 'Not' )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3362:1: ( ( 'Not' )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3363:1: ( 'Not' )?
            {
             before(grammarAccess.getConditionAccess().getNotKeyword_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3364:1: ( 'Not' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3365:2: 'Not'
                    {
                    match(input,36,FOLLOW_36_in_rule__Condition__Group__0__Impl6897); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3376:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3380:1: ( rule__Condition__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3381:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16930);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3387:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3391:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3392:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3392:1: ( ( rule__Condition__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3393:1: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3394:1: ( rule__Condition__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3394:2: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6957);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3408:1: rule__UnaryCondition__Group__0 : rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 ;
    public final void rule__UnaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3412:1: ( rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3413:2: rule__UnaryCondition__Group__0__Impl rule__UnaryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryCondition__Group__0__Impl_in_rule__UnaryCondition__Group__06991);
            rule__UnaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryCondition__Group__1_in_rule__UnaryCondition__Group__06994);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3420:1: rule__UnaryCondition__Group__0__Impl : ( ( rule__UnaryCondition__OpAssignment_0 ) ) ;
    public final void rule__UnaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3424:1: ( ( ( rule__UnaryCondition__OpAssignment_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3425:1: ( ( rule__UnaryCondition__OpAssignment_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3425:1: ( ( rule__UnaryCondition__OpAssignment_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3426:1: ( rule__UnaryCondition__OpAssignment_0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getOpAssignment_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3427:1: ( rule__UnaryCondition__OpAssignment_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3427:2: rule__UnaryCondition__OpAssignment_0
            {
            pushFollow(FOLLOW_rule__UnaryCondition__OpAssignment_0_in_rule__UnaryCondition__Group__0__Impl7021);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3437:1: rule__UnaryCondition__Group__1 : rule__UnaryCondition__Group__1__Impl ;
    public final void rule__UnaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3441:1: ( rule__UnaryCondition__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3442:2: rule__UnaryCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryCondition__Group__1__Impl_in_rule__UnaryCondition__Group__17051);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3448:1: rule__UnaryCondition__Group__1__Impl : ( ( rule__UnaryCondition__ElemAssignment_1 ) ) ;
    public final void rule__UnaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3452:1: ( ( ( rule__UnaryCondition__ElemAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3453:1: ( ( rule__UnaryCondition__ElemAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3453:1: ( ( rule__UnaryCondition__ElemAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3454:1: ( rule__UnaryCondition__ElemAssignment_1 )
            {
             before(grammarAccess.getUnaryConditionAccess().getElemAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3455:1: ( rule__UnaryCondition__ElemAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3455:2: rule__UnaryCondition__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryCondition__ElemAssignment_1_in_rule__UnaryCondition__Group__1__Impl7078);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3469:1: rule__BinaryCondition__Group__0 : rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 ;
    public final void rule__BinaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3473:1: ( rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3474:2: rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__0__Impl_in_rule__BinaryCondition__Group__07112);
            rule__BinaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryCondition__Group__1_in_rule__BinaryCondition__Group__07115);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3481:1: rule__BinaryCondition__Group__0__Impl : ( ( rule__BinaryCondition__ElemAssignment_0 ) ) ;
    public final void rule__BinaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3485:1: ( ( ( rule__BinaryCondition__ElemAssignment_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3486:1: ( ( rule__BinaryCondition__ElemAssignment_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3486:1: ( ( rule__BinaryCondition__ElemAssignment_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3487:1: ( rule__BinaryCondition__ElemAssignment_0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getElemAssignment_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3488:1: ( rule__BinaryCondition__ElemAssignment_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3488:2: rule__BinaryCondition__ElemAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryCondition__ElemAssignment_0_in_rule__BinaryCondition__Group__0__Impl7142);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3498:1: rule__BinaryCondition__Group__1 : rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 ;
    public final void rule__BinaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3502:1: ( rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3503:2: rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__1__Impl_in_rule__BinaryCondition__Group__17172);
            rule__BinaryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BinaryCondition__Group__2_in_rule__BinaryCondition__Group__17175);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3510:1: rule__BinaryCondition__Group__1__Impl : ( ( rule__BinaryCondition__OpAssignment_1 ) ) ;
    public final void rule__BinaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3514:1: ( ( ( rule__BinaryCondition__OpAssignment_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3515:1: ( ( rule__BinaryCondition__OpAssignment_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3515:1: ( ( rule__BinaryCondition__OpAssignment_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3516:1: ( rule__BinaryCondition__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryConditionAccess().getOpAssignment_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3517:1: ( rule__BinaryCondition__OpAssignment_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3517:2: rule__BinaryCondition__OpAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryCondition__OpAssignment_1_in_rule__BinaryCondition__Group__1__Impl7202);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3527:1: rule__BinaryCondition__Group__2 : rule__BinaryCondition__Group__2__Impl ;
    public final void rule__BinaryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3531:1: ( rule__BinaryCondition__Group__2__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3532:2: rule__BinaryCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Group__2__Impl_in_rule__BinaryCondition__Group__27232);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3538:1: rule__BinaryCondition__Group__2__Impl : ( ( rule__BinaryCondition__Alternatives_2 ) ) ;
    public final void rule__BinaryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3542:1: ( ( ( rule__BinaryCondition__Alternatives_2 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3543:1: ( ( rule__BinaryCondition__Alternatives_2 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3543:1: ( ( rule__BinaryCondition__Alternatives_2 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3544:1: ( rule__BinaryCondition__Alternatives_2 )
            {
             before(grammarAccess.getBinaryConditionAccess().getAlternatives_2()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3545:1: ( rule__BinaryCondition__Alternatives_2 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3545:2: rule__BinaryCondition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BinaryCondition__Alternatives_2_in_rule__BinaryCondition__Group__2__Impl7259);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3561:1: rule__GetButton__Group__0 : rule__GetButton__Group__0__Impl rule__GetButton__Group__1 ;
    public final void rule__GetButton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3565:1: ( rule__GetButton__Group__0__Impl rule__GetButton__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3566:2: rule__GetButton__Group__0__Impl rule__GetButton__Group__1
            {
            pushFollow(FOLLOW_rule__GetButton__Group__0__Impl_in_rule__GetButton__Group__07295);
            rule__GetButton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetButton__Group__1_in_rule__GetButton__Group__07298);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3573:1: rule__GetButton__Group__0__Impl : ( 'GetButton' ) ;
    public final void rule__GetButton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3577:1: ( ( 'GetButton' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3578:1: ( 'GetButton' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3578:1: ( 'GetButton' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3579:1: 'GetButton'
            {
             before(grammarAccess.getGetButtonAccess().getGetButtonKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__GetButton__Group__0__Impl7326); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3592:1: rule__GetButton__Group__1 : rule__GetButton__Group__1__Impl ;
    public final void rule__GetButton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3596:1: ( rule__GetButton__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3597:2: rule__GetButton__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetButton__Group__1__Impl_in_rule__GetButton__Group__17357);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3603:1: rule__GetButton__Group__1__Impl : ( ( rule__GetButton__Alternatives_1 ) ) ;
    public final void rule__GetButton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3607:1: ( ( ( rule__GetButton__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3608:1: ( ( rule__GetButton__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3608:1: ( ( rule__GetButton__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3609:1: ( rule__GetButton__Alternatives_1 )
            {
             before(grammarAccess.getGetButtonAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3610:1: ( rule__GetButton__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3610:2: rule__GetButton__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetButton__Alternatives_1_in_rule__GetButton__Group__1__Impl7384);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3624:1: rule__GetLink__Group__0 : rule__GetLink__Group__0__Impl rule__GetLink__Group__1 ;
    public final void rule__GetLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3628:1: ( rule__GetLink__Group__0__Impl rule__GetLink__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3629:2: rule__GetLink__Group__0__Impl rule__GetLink__Group__1
            {
            pushFollow(FOLLOW_rule__GetLink__Group__0__Impl_in_rule__GetLink__Group__07418);
            rule__GetLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetLink__Group__1_in_rule__GetLink__Group__07421);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3636:1: rule__GetLink__Group__0__Impl : ( 'GetLink' ) ;
    public final void rule__GetLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3640:1: ( ( 'GetLink' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3641:1: ( 'GetLink' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3641:1: ( 'GetLink' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3642:1: 'GetLink'
            {
             before(grammarAccess.getGetLinkAccess().getGetLinkKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__GetLink__Group__0__Impl7449); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3655:1: rule__GetLink__Group__1 : rule__GetLink__Group__1__Impl ;
    public final void rule__GetLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3659:1: ( rule__GetLink__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3660:2: rule__GetLink__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetLink__Group__1__Impl_in_rule__GetLink__Group__17480);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3666:1: rule__GetLink__Group__1__Impl : ( ( rule__GetLink__Alternatives_1 ) ) ;
    public final void rule__GetLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3670:1: ( ( ( rule__GetLink__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3671:1: ( ( rule__GetLink__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3671:1: ( ( rule__GetLink__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3672:1: ( rule__GetLink__Alternatives_1 )
            {
             before(grammarAccess.getGetLinkAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3673:1: ( rule__GetLink__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3673:2: rule__GetLink__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetLink__Alternatives_1_in_rule__GetLink__Group__1__Impl7507);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3687:1: rule__GetCheckbox__Group__0 : rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1 ;
    public final void rule__GetCheckbox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3691:1: ( rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3692:2: rule__GetCheckbox__Group__0__Impl rule__GetCheckbox__Group__1
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Group__0__Impl_in_rule__GetCheckbox__Group__07541);
            rule__GetCheckbox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetCheckbox__Group__1_in_rule__GetCheckbox__Group__07544);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3699:1: rule__GetCheckbox__Group__0__Impl : ( 'GetCheckbox' ) ;
    public final void rule__GetCheckbox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3703:1: ( ( 'GetCheckbox' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3704:1: ( 'GetCheckbox' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3704:1: ( 'GetCheckbox' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3705:1: 'GetCheckbox'
            {
             before(grammarAccess.getGetCheckboxAccess().getGetCheckboxKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__GetCheckbox__Group__0__Impl7572); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3718:1: rule__GetCheckbox__Group__1 : rule__GetCheckbox__Group__1__Impl ;
    public final void rule__GetCheckbox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3722:1: ( rule__GetCheckbox__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3723:2: rule__GetCheckbox__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Group__1__Impl_in_rule__GetCheckbox__Group__17603);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3729:1: rule__GetCheckbox__Group__1__Impl : ( ( rule__GetCheckbox__Alternatives_1 ) ) ;
    public final void rule__GetCheckbox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3733:1: ( ( ( rule__GetCheckbox__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3734:1: ( ( rule__GetCheckbox__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3734:1: ( ( rule__GetCheckbox__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3735:1: ( rule__GetCheckbox__Alternatives_1 )
            {
             before(grammarAccess.getGetCheckboxAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3736:1: ( rule__GetCheckbox__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3736:2: rule__GetCheckbox__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetCheckbox__Alternatives_1_in_rule__GetCheckbox__Group__1__Impl7630);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3750:1: rule__GetText__Group__0 : rule__GetText__Group__0__Impl rule__GetText__Group__1 ;
    public final void rule__GetText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3754:1: ( rule__GetText__Group__0__Impl rule__GetText__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3755:2: rule__GetText__Group__0__Impl rule__GetText__Group__1
            {
            pushFollow(FOLLOW_rule__GetText__Group__0__Impl_in_rule__GetText__Group__07664);
            rule__GetText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetText__Group__1_in_rule__GetText__Group__07667);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3762:1: rule__GetText__Group__0__Impl : ( 'GetText' ) ;
    public final void rule__GetText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3766:1: ( ( 'GetText' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3767:1: ( 'GetText' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3767:1: ( 'GetText' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3768:1: 'GetText'
            {
             before(grammarAccess.getGetTextAccess().getGetTextKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__GetText__Group__0__Impl7695); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3781:1: rule__GetText__Group__1 : rule__GetText__Group__1__Impl ;
    public final void rule__GetText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3785:1: ( rule__GetText__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3786:2: rule__GetText__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetText__Group__1__Impl_in_rule__GetText__Group__17726);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3792:1: rule__GetText__Group__1__Impl : ( ( rule__GetText__Alternatives_1 ) ) ;
    public final void rule__GetText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3796:1: ( ( ( rule__GetText__Alternatives_1 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3797:1: ( ( rule__GetText__Alternatives_1 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3797:1: ( ( rule__GetText__Alternatives_1 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3798:1: ( rule__GetText__Alternatives_1 )
            {
             before(grammarAccess.getGetTextAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3799:1: ( rule__GetText__Alternatives_1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3799:2: rule__GetText__Alternatives_1
            {
            pushFollow(FOLLOW_rule__GetText__Alternatives_1_in_rule__GetText__Group__1__Impl7753);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3813:1: rule__GetButtons__Group__0 : rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1 ;
    public final void rule__GetButtons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3817:1: ( rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3818:2: rule__GetButtons__Group__0__Impl rule__GetButtons__Group__1
            {
            pushFollow(FOLLOW_rule__GetButtons__Group__0__Impl_in_rule__GetButtons__Group__07787);
            rule__GetButtons__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetButtons__Group__1_in_rule__GetButtons__Group__07790);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3825:1: rule__GetButtons__Group__0__Impl : ( 'GetButtons' ) ;
    public final void rule__GetButtons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3829:1: ( ( 'GetButtons' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3830:1: ( 'GetButtons' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3830:1: ( 'GetButtons' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3831:1: 'GetButtons'
            {
             before(grammarAccess.getGetButtonsAccess().getGetButtonsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__GetButtons__Group__0__Impl7818); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3844:1: rule__GetButtons__Group__1 : rule__GetButtons__Group__1__Impl ;
    public final void rule__GetButtons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3848:1: ( rule__GetButtons__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3849:2: rule__GetButtons__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetButtons__Group__1__Impl_in_rule__GetButtons__Group__17849);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3855:1: rule__GetButtons__Group__1__Impl : ( ( rule__GetButtons__Alternatives_1 )? ) ;
    public final void rule__GetButtons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3859:1: ( ( ( rule__GetButtons__Alternatives_1 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3860:1: ( ( rule__GetButtons__Alternatives_1 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3860:1: ( ( rule__GetButtons__Alternatives_1 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3861:1: ( rule__GetButtons__Alternatives_1 )?
            {
             before(grammarAccess.getGetButtonsAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3862:1: ( rule__GetButtons__Alternatives_1 )?
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
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3862:2: rule__GetButtons__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetButtons__Alternatives_1_in_rule__GetButtons__Group__1__Impl7876);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3876:1: rule__GetCheckboxes__Group__0 : rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1 ;
    public final void rule__GetCheckboxes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3880:1: ( rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3881:2: rule__GetCheckboxes__Group__0__Impl rule__GetCheckboxes__Group__1
            {
            pushFollow(FOLLOW_rule__GetCheckboxes__Group__0__Impl_in_rule__GetCheckboxes__Group__07911);
            rule__GetCheckboxes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetCheckboxes__Group__1_in_rule__GetCheckboxes__Group__07914);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3888:1: rule__GetCheckboxes__Group__0__Impl : ( 'GetCheckboxes' ) ;
    public final void rule__GetCheckboxes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3892:1: ( ( 'GetCheckboxes' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3893:1: ( 'GetCheckboxes' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3893:1: ( 'GetCheckboxes' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3894:1: 'GetCheckboxes'
            {
             before(grammarAccess.getGetCheckboxesAccess().getGetCheckboxesKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__GetCheckboxes__Group__0__Impl7942); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3907:1: rule__GetCheckboxes__Group__1 : rule__GetCheckboxes__Group__1__Impl ;
    public final void rule__GetCheckboxes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3911:1: ( rule__GetCheckboxes__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3912:2: rule__GetCheckboxes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetCheckboxes__Group__1__Impl_in_rule__GetCheckboxes__Group__17973);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3918:1: rule__GetCheckboxes__Group__1__Impl : ( ( rule__GetCheckboxes__Alternatives_1 )? ) ;
    public final void rule__GetCheckboxes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3922:1: ( ( ( rule__GetCheckboxes__Alternatives_1 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3923:1: ( ( rule__GetCheckboxes__Alternatives_1 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3923:1: ( ( rule__GetCheckboxes__Alternatives_1 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3924:1: ( rule__GetCheckboxes__Alternatives_1 )?
            {
             before(grammarAccess.getGetCheckboxesAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3925:1: ( rule__GetCheckboxes__Alternatives_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==EOF||LA36_2==RULE_ID) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3925:2: rule__GetCheckboxes__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetCheckboxes__Alternatives_1_in_rule__GetCheckboxes__Group__1__Impl8000);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3939:1: rule__GetLinks__Group__0 : rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1 ;
    public final void rule__GetLinks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3943:1: ( rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3944:2: rule__GetLinks__Group__0__Impl rule__GetLinks__Group__1
            {
            pushFollow(FOLLOW_rule__GetLinks__Group__0__Impl_in_rule__GetLinks__Group__08035);
            rule__GetLinks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GetLinks__Group__1_in_rule__GetLinks__Group__08038);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3951:1: rule__GetLinks__Group__0__Impl : ( 'GetLinks' ) ;
    public final void rule__GetLinks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3955:1: ( ( 'GetLinks' ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3956:1: ( 'GetLinks' )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3956:1: ( 'GetLinks' )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3957:1: 'GetLinks'
            {
             before(grammarAccess.getGetLinksAccess().getGetLinksKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__GetLinks__Group__0__Impl8066); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3970:1: rule__GetLinks__Group__1 : rule__GetLinks__Group__1__Impl ;
    public final void rule__GetLinks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3974:1: ( rule__GetLinks__Group__1__Impl )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3975:2: rule__GetLinks__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GetLinks__Group__1__Impl_in_rule__GetLinks__Group__18097);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3981:1: rule__GetLinks__Group__1__Impl : ( ( rule__GetLinks__Alternatives_1 )? ) ;
    public final void rule__GetLinks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3985:1: ( ( ( rule__GetLinks__Alternatives_1 )? ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3986:1: ( ( rule__GetLinks__Alternatives_1 )? )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3986:1: ( ( rule__GetLinks__Alternatives_1 )? )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3987:1: ( rule__GetLinks__Alternatives_1 )?
            {
             before(grammarAccess.getGetLinksAccess().getAlternatives_1()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3988:1: ( rule__GetLinks__Alternatives_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2==EOF||LA37_2==RULE_ID) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:3988:2: rule__GetLinks__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__GetLinks__Alternatives_1_in_rule__GetLinks__Group__1__Impl8124);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4003:1: rule__Program__SequencesAssignment_0 : ( ruleSequence ) ;
    public final void rule__Program__SequencesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4007:1: ( ( ruleSequence ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4008:1: ( ruleSequence )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4008:1: ( ruleSequence )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4009:1: ruleSequence
            {
             before(grammarAccess.getProgramAccess().getSequencesSequenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Program__SequencesAssignment_08164);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4018:1: rule__Program__TestsAssignment_1 : ( ruleTest ) ;
    public final void rule__Program__TestsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4022:1: ( ( ruleTest ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4023:1: ( ruleTest )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4023:1: ( ruleTest )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4024:1: ruleTest
            {
             before(grammarAccess.getProgramAccess().getTestsTestParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTest_in_rule__Program__TestsAssignment_18195);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4033:1: rule__Test__BrowserAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Test__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4037:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4038:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4038:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4039:1: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Test__BrowserAssignment_18226); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4048:1: rule__Test__BodyAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Test__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4052:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4053:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4053:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4054:1: ruleInstruction
            {
             before(grammarAccess.getTestAccess().getBodyInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Test__BodyAssignment_38257);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4063:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4067:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4068:1: ( RULE_ID )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4068:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4069:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_18288); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4078:1: rule__Sequence__ParametersAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__Sequence__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4082:1: ( ( ruleVariable ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4083:1: ( ruleVariable )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4083:1: ( ruleVariable )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4084:1: ruleVariable
            {
             before(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_18319);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4093:1: rule__Sequence__ParametersAssignment_2_2_1 : ( ruleVariable ) ;
    public final void rule__Sequence__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4097:1: ( ( ruleVariable ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4098:1: ( ruleVariable )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4098:1: ( ruleVariable )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4099:1: ruleVariable
            {
             before(grammarAccess.getSequenceAccess().getParametersVariableParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_2_18350);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4108:1: rule__Sequence__BodyAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Sequence__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4112:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4113:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4113:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4114:1: ruleInstruction
            {
             before(grammarAccess.getSequenceAccess().getBodyInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__Sequence__BodyAssignment_48381);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4123:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4127:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4128:1: ( RULE_ID )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4128:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4129:1: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Variable__NameAssignment8412); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4138:1: rule__ForAll__ElemsAssignment_1 : ( ruleElems ) ;
    public final void rule__ForAll__ElemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4142:1: ( ( ruleElems ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4143:1: ( ruleElems )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4143:1: ( ruleElems )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4144:1: ruleElems
            {
             before(grammarAccess.getForAllAccess().getElemsElemsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleElems_in_rule__ForAll__ElemsAssignment_18443);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4153:1: rule__ForAll__ItAssignment_2 : ( ruleVariable ) ;
    public final void rule__ForAll__ItAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4157:1: ( ( ruleVariable ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4158:1: ( ruleVariable )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4158:1: ( ruleVariable )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4159:1: ruleVariable
            {
             before(grammarAccess.getForAllAccess().getItVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__ForAll__ItAssignment_28474);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4168:1: rule__ForAll__BodyAssignment_4 : ( ruleInstruction ) ;
    public final void rule__ForAll__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4172:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4173:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4173:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4174:1: ruleInstruction
            {
             before(grammarAccess.getForAllAccess().getBodyInstructionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__ForAll__BodyAssignment_48505);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4183:1: rule__DoWhile__BodyAssignment_1 : ( ruleInstruction ) ;
    public final void rule__DoWhile__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4187:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4188:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4188:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4189:1: ruleInstruction
            {
             before(grammarAccess.getDoWhileAccess().getBodyInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__DoWhile__BodyAssignment_18536);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4198:1: rule__DoWhile__ConditionAssignment_3 : ( ruleCondition ) ;
    public final void rule__DoWhile__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4202:1: ( ( ruleCondition ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4203:1: ( ruleCondition )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4203:1: ( ruleCondition )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4204:1: ruleCondition
            {
             before(grammarAccess.getDoWhileAccess().getConditionConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__DoWhile__ConditionAssignment_38567);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4213:1: rule__IfThenElse__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__IfThenElse__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4217:1: ( ( ruleCondition ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4218:1: ( ruleCondition )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4218:1: ( ruleCondition )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4219:1: ruleCondition
            {
             before(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__IfThenElse__ConditionAssignment_18598);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4228:1: rule__IfThenElse__ThenAssignment_3 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4232:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4233:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4233:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4234:1: ruleInstruction
            {
             before(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_38629);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4243:1: rule__IfThenElse__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4247:1: ( ( ruleInstruction ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4248:1: ( ruleInstruction )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4248:1: ( ruleInstruction )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4249:1: ruleInstruction
            {
             before(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_5_18660);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4258:1: rule__Affectation__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__Affectation__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4262:1: ( ( ruleVariable ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4263:1: ( ruleVariable )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4263:1: ( ruleVariable )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4264:1: ruleVariable
            {
             before(grammarAccess.getAffectationAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVariable_in_rule__Affectation__VariableAssignment_08691);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4273:1: rule__Affectation__ElemAssignment_2 : ( ruleElem ) ;
    public final void rule__Affectation__ElemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4277:1: ( ( ruleElem ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4278:1: ( ruleElem )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4278:1: ( ruleElem )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4279:1: ruleElem
            {
             before(grammarAccess.getAffectationAccess().getElemElemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElem_in_rule__Affectation__ElemAssignment_28722);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4288:1: rule__Exec__SequenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Exec__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4292:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4293:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4293:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4294:1: ( RULE_ID )
            {
             before(grammarAccess.getExecAccess().getSequenceSequenceCrossReference_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4295:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4296:1: RULE_ID
            {
             before(grammarAccess.getExecAccess().getSequenceSequenceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exec__SequenceAssignment_18757); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4307:1: rule__Exec__ParamsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Exec__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4311:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4312:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4312:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4313:1: RULE_STRING
            {
             before(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_18792); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4322:1: rule__Exec__ParamsAssignment_2_2_1 : ( RULE_STRING ) ;
    public final void rule__Exec__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4326:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4327:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4327:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4328:1: RULE_STRING
            {
             before(grammarAccess.getExecAccess().getParamsSTRINGTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_2_18823); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4337:1: rule__Fill__FieldAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Fill__FieldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4341:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4342:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4342:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4343:1: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getFieldSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fill__FieldAssignment_18854); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4352:1: rule__Fill__ValueAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Fill__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4356:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4357:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4357:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4358:1: RULE_STRING
            {
             before(grammarAccess.getFillAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Fill__ValueAssignment_3_08885); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4367:1: rule__Fill__ParamAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fill__ParamAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4371:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4372:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4372:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4373:1: ( RULE_ID )
            {
             before(grammarAccess.getFillAccess().getParamVariableCrossReference_3_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4374:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4375:1: RULE_ID
            {
             before(grammarAccess.getFillAccess().getParamVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fill__ParamAssignment_3_18920); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4386:1: rule__Check__CheckboxAssignment_1 : ( ( rule__Check__CheckboxAlternatives_1_0 ) ) ;
    public final void rule__Check__CheckboxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4390:1: ( ( ( rule__Check__CheckboxAlternatives_1_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4391:1: ( ( rule__Check__CheckboxAlternatives_1_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4391:1: ( ( rule__Check__CheckboxAlternatives_1_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4392:1: ( rule__Check__CheckboxAlternatives_1_0 )
            {
             before(grammarAccess.getCheckAccess().getCheckboxAlternatives_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4393:1: ( rule__Check__CheckboxAlternatives_1_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4393:2: rule__Check__CheckboxAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Check__CheckboxAlternatives_1_0_in_rule__Check__CheckboxAssignment_18955);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4402:1: rule__Click__ElemAssignment_1 : ( ( rule__Click__ElemAlternatives_1_0 ) ) ;
    public final void rule__Click__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4406:1: ( ( ( rule__Click__ElemAlternatives_1_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4407:1: ( ( rule__Click__ElemAlternatives_1_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4407:1: ( ( rule__Click__ElemAlternatives_1_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4408:1: ( rule__Click__ElemAlternatives_1_0 )
            {
             before(grammarAccess.getClickAccess().getElemAlternatives_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4409:1: ( rule__Click__ElemAlternatives_1_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4409:2: rule__Click__ElemAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Click__ElemAlternatives_1_0_in_rule__Click__ElemAssignment_18988);
            rule__Click__ElemAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getElemAlternatives_1_0()); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4418:1: rule__Verify__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Verify__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4422:1: ( ( ruleCondition ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4423:1: ( ruleCondition )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4423:1: ( ruleCondition )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4424:1: ruleCondition
            {
             before(grammarAccess.getVerifyAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCondition_in_rule__Verify__ConditionAssignment_19021);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4433:1: rule__GoTo__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GoTo__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4437:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4438:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4438:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4439:1: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GoTo__ValueAssignment_1_09052); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4448:1: rule__GoTo__LinkAssignment_1_1 : ( ( rule__GoTo__LinkAlternatives_1_1_0 ) ) ;
    public final void rule__GoTo__LinkAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4452:1: ( ( ( rule__GoTo__LinkAlternatives_1_1_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4453:1: ( ( rule__GoTo__LinkAlternatives_1_1_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4453:1: ( ( rule__GoTo__LinkAlternatives_1_1_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4454:1: ( rule__GoTo__LinkAlternatives_1_1_0 )
            {
             before(grammarAccess.getGoToAccess().getLinkAlternatives_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4455:1: ( rule__GoTo__LinkAlternatives_1_1_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4455:2: rule__GoTo__LinkAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__GoTo__LinkAlternatives_1_1_0_in_rule__GoTo__LinkAssignment_1_19083);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4464:1: rule__UnaryCondition__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryCondition__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4468:1: ( ( ruleUnaryOp ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4469:1: ( ruleUnaryOp )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4469:1: ( ruleUnaryOp )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4470:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryConditionAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__UnaryCondition__OpAssignment_09116);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4479:1: rule__UnaryCondition__ElemAssignment_1 : ( ( rule__UnaryCondition__ElemAlternatives_1_0 ) ) ;
    public final void rule__UnaryCondition__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4483:1: ( ( ( rule__UnaryCondition__ElemAlternatives_1_0 ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4484:1: ( ( rule__UnaryCondition__ElemAlternatives_1_0 ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4484:1: ( ( rule__UnaryCondition__ElemAlternatives_1_0 ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4485:1: ( rule__UnaryCondition__ElemAlternatives_1_0 )
            {
             before(grammarAccess.getUnaryConditionAccess().getElemAlternatives_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4486:1: ( rule__UnaryCondition__ElemAlternatives_1_0 )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4486:2: rule__UnaryCondition__ElemAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnaryCondition__ElemAlternatives_1_0_in_rule__UnaryCondition__ElemAssignment_19147);
            rule__UnaryCondition__ElemAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryConditionAccess().getElemAlternatives_1_0()); 

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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4495:1: rule__BinaryCondition__ElemAssignment_0 : ( ruleElem ) ;
    public final void rule__BinaryCondition__ElemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4499:1: ( ( ruleElem ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4500:1: ( ruleElem )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4500:1: ( ruleElem )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4501:1: ruleElem
            {
             before(grammarAccess.getBinaryConditionAccess().getElemElemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleElem_in_rule__BinaryCondition__ElemAssignment_09180);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4510:1: rule__BinaryCondition__OpAssignment_1 : ( ruleBinaryOp ) ;
    public final void rule__BinaryCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4514:1: ( ( ruleBinaryOp ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4515:1: ( ruleBinaryOp )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4515:1: ( ruleBinaryOp )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4516:1: ruleBinaryOp
            {
             before(grammarAccess.getBinaryConditionAccess().getOpBinaryOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryOp_in_rule__BinaryCondition__OpAssignment_19211);
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4525:1: rule__BinaryCondition__ValueAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BinaryCondition__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4529:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4530:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4530:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4531:1: RULE_STRING
            {
             before(grammarAccess.getBinaryConditionAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BinaryCondition__ValueAssignment_2_09242); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4540:1: rule__BinaryCondition__ParamAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__BinaryCondition__ParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4544:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4545:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4545:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4546:1: ( RULE_ID )
            {
             before(grammarAccess.getBinaryConditionAccess().getParamVariableCrossReference_2_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4547:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4548:1: RULE_ID
            {
             before(grammarAccess.getBinaryConditionAccess().getParamVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BinaryCondition__ParamAssignment_2_19277); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4559:1: rule__GetButton__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetButton__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4563:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4564:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4564:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4565:1: RULE_STRING
            {
             before(grammarAccess.getGetButtonAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetButton__ValueAssignment_1_09312); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4574:1: rule__GetButton__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetButton__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4578:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4579:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4579:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4580:1: ( RULE_ID )
            {
             before(grammarAccess.getGetButtonAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4581:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4582:1: RULE_ID
            {
             before(grammarAccess.getGetButtonAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetButton__VarAssignment_1_19347); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4593:1: rule__GetLink__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetLink__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4597:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4598:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4598:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4599:1: RULE_STRING
            {
             before(grammarAccess.getGetLinkAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetLink__ValueAssignment_1_09382); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4608:1: rule__GetLink__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetLink__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4612:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4613:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4613:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4614:1: ( RULE_ID )
            {
             before(grammarAccess.getGetLinkAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4615:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4616:1: RULE_ID
            {
             before(grammarAccess.getGetLinkAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetLink__VarAssignment_1_19417); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4627:1: rule__GetCheckbox__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetCheckbox__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4631:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4632:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4632:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4633:1: RULE_STRING
            {
             before(grammarAccess.getGetCheckboxAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetCheckbox__ValueAssignment_1_09452); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4642:1: rule__GetCheckbox__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetCheckbox__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4646:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4647:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4647:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4648:1: ( RULE_ID )
            {
             before(grammarAccess.getGetCheckboxAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4649:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4650:1: RULE_ID
            {
             before(grammarAccess.getGetCheckboxAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetCheckbox__VarAssignment_1_19487); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4661:1: rule__GetText__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetText__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4665:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4666:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4666:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4667:1: RULE_STRING
            {
             before(grammarAccess.getGetTextAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetText__ValueAssignment_1_09522); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4676:1: rule__GetText__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetText__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4680:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4681:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4681:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4682:1: ( RULE_ID )
            {
             before(grammarAccess.getGetTextAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4683:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4684:1: RULE_ID
            {
             before(grammarAccess.getGetTextAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetText__VarAssignment_1_19557); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4695:1: rule__GetButtons__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetButtons__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4699:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4700:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4700:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4701:1: RULE_STRING
            {
             before(grammarAccess.getGetButtonsAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetButtons__ValueAssignment_1_09592); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4710:1: rule__GetButtons__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetButtons__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4714:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4715:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4715:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4716:1: ( RULE_ID )
            {
             before(grammarAccess.getGetButtonsAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4717:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4718:1: RULE_ID
            {
             before(grammarAccess.getGetButtonsAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetButtons__VarAssignment_1_19627); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4729:1: rule__GetCheckboxes__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetCheckboxes__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4733:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4734:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4734:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4735:1: RULE_STRING
            {
             before(grammarAccess.getGetCheckboxesAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetCheckboxes__ValueAssignment_1_09662); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4744:1: rule__GetCheckboxes__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetCheckboxes__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4748:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4749:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4749:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4750:1: ( RULE_ID )
            {
             before(grammarAccess.getGetCheckboxesAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4751:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4752:1: RULE_ID
            {
             before(grammarAccess.getGetCheckboxesAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetCheckboxes__VarAssignment_1_19697); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4763:1: rule__GetLinks__ValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__GetLinks__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4767:1: ( ( RULE_STRING ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4768:1: ( RULE_STRING )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4768:1: ( RULE_STRING )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4769:1: RULE_STRING
            {
             before(grammarAccess.getGetLinksAccess().getValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__GetLinks__ValueAssignment_1_09732); 
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
    // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4778:1: rule__GetLinks__VarAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__GetLinks__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4782:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4783:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4783:1: ( ( RULE_ID ) )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4784:1: ( RULE_ID )
            {
             before(grammarAccess.getGetLinksAccess().getVarVariableCrossReference_1_1_0()); 
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4785:1: ( RULE_ID )
            // ../org.xtext.emn.selenium.ui/src-gen/org/xtext/emn/selenium/ui/contentassist/antlr/internal/InternalSEL.g:4786:1: RULE_ID
            {
             before(grammarAccess.getGetLinksAccess().getVarVariableIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GetLinks__VarAssignment_1_19767); 
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
    public static final BitSet FOLLOW_ruleElem_in_rule__Click__ElemAlternatives_1_02118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__ValueAssignment_1_0_in_rule__GoTo__Alternatives_12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__LinkAssignment_1_1_in_rule__GoTo__Alternatives_12187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_rule__GoTo__LinkAlternatives_1_1_02239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_rule__Condition__Alternatives_12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryCondition_in_rule__Condition__Alternatives_12288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_rule__UnaryCondition__ElemAlternatives_1_02320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ValueAssignment_2_0_in_rule__BinaryCondition__Alternatives_22371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ParamAssignment_2_1_in_rule__BinaryCondition__Alternatives_22389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButton_in_rule__Elem__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLink_in_rule__Elem__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckbox_in_rule__Elem__Alternatives2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetText_in_rule__Elem__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__ValueAssignment_1_0_in_rule__GetButton__Alternatives_12505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__VarAssignment_1_1_in_rule__GetButton__Alternatives_12523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__ValueAssignment_1_0_in_rule__GetLink__Alternatives_12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__VarAssignment_1_1_in_rule__GetLink__Alternatives_12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__ValueAssignment_1_0_in_rule__GetCheckbox__Alternatives_12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__VarAssignment_1_1_in_rule__GetCheckbox__Alternatives_12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__ValueAssignment_1_0_in_rule__GetText__Alternatives_12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__VarAssignment_1_1_in_rule__GetText__Alternatives_12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetButtons_in_rule__Elems__Alternatives2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetCheckboxes_in_rule__Elems__Alternatives2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetLinks_in_rule__Elems__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__ValueAssignment_1_0_in_rule__GetButtons__Alternatives_12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__VarAssignment_1_1_in_rule__GetButtons__Alternatives_12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__ValueAssignment_1_0_in_rule__GetCheckboxes__Alternatives_12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__VarAssignment_1_1_in_rule__GetCheckboxes__Alternatives_12844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__ValueAssignment_1_0_in_rule__GetLinks__Alternatives_12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__VarAssignment_1_1_in_rule__GetLinks__Alternatives_12895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BinaryOp__Alternatives2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryOp__Alternatives2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UnaryOp__Alternatives2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__UnaryOp__Alternatives3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__UnaryOp__Alternatives3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__03061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__03064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Test__Group__0__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__13123 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__13126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__BrowserAssignment_1_in_rule__Test__Group__1__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__23183 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Test__Group__3_in_rule__Test__Group__23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Test__Group__2__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__33245 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Test__Group__4_in_rule__Test__Group__33248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__BodyAssignment_3_in_rule__Test__Group__3__Impl3275 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__43306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Test__Group__4__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__0__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13437 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__23497 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__23500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__0_in_rule__Sequence__Group__2__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__33558 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__33561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Sequence__Group__3__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__43620 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__43623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__BodyAssignment_4_in_rule__Sequence__Group__4__Impl3650 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__53681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sequence__Group__5__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__0__Impl_in_rule__Sequence__Group_2__03752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__1_in_rule__Sequence__Group_2__03755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group_2__0__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__1__Impl_in_rule__Sequence__Group_2__13814 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__2_in_rule__Sequence__Group_2__13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParametersAssignment_2_1_in_rule__Sequence__Group_2__1__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__2__Impl_in_rule__Sequence__Group_2__23874 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__3_in_rule__Sequence__Group_2__23877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__0_in_rule__Sequence__Group_2__2__Impl3904 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2__3__Impl_in_rule__Sequence__Group_2__33935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sequence__Group_2__3__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__0__Impl_in_rule__Sequence__Group_2_2__04002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__1_in_rule__Sequence__Group_2_2__04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sequence__Group_2_2__0__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_2_2__1__Impl_in_rule__Sequence__Group_2_2__14064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParametersAssignment_2_2_1_in_rule__Sequence__Group_2_2__1__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__0__Impl_in_rule__ForAll__Group__04125 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1_in_rule__ForAll__Group__04128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ForAll__Group__0__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__1__Impl_in_rule__ForAll__Group__14187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__2_in_rule__ForAll__Group__14190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__ElemsAssignment_1_in_rule__ForAll__Group__1__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__2__Impl_in_rule__ForAll__Group__24247 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ForAll__Group__3_in_rule__ForAll__Group__24250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__ItAssignment_2_in_rule__ForAll__Group__2__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__3__Impl_in_rule__ForAll__Group__34307 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__4_in_rule__ForAll__Group__34310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ForAll__Group__3__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__Group__4__Impl_in_rule__ForAll__Group__44369 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__ForAll__Group__5_in_rule__ForAll__Group__44372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForAll__BodyAssignment_4_in_rule__ForAll__Group__4__Impl4399 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__ForAll__Group__5__Impl_in_rule__ForAll__Group__54430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ForAll__Group__5__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__0__Impl_in_rule__DoWhile__Group__04501 = new BitSet(new long[]{0x0000000F67880020L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__1_in_rule__DoWhile__Group__04504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DoWhile__Group__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__1__Impl_in_rule__DoWhile__Group__14563 = new BitSet(new long[]{0x0000000F67880020L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__2_in_rule__DoWhile__Group__14566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__BodyAssignment_1_in_rule__DoWhile__Group__1__Impl4593 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__2__Impl_in_rule__DoWhile__Group__24624 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__3_in_rule__DoWhile__Group__24627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DoWhile__Group__2__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__3__Impl_in_rule__DoWhile__Group__34686 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__4_in_rule__DoWhile__Group__34689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__ConditionAssignment_3_in_rule__DoWhile__Group__3__Impl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoWhile__Group__4__Impl_in_rule__DoWhile__Group__44746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DoWhile__Group__4__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__04815 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__04818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IfThenElse__Group__0__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__14877 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__14880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__24937 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__24940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IfThenElse__Group__2__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__34999 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl5029 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45060 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group__4__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__0_in_rule__IfThenElse__Group__5__Impl5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__0__Impl_in_rule__IfThenElse__Group_5__05192 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__1_in_rule__IfThenElse__Group_5__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IfThenElse__Group_5__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__1__Impl_in_rule__IfThenElse__Group_5__15254 = new BitSet(new long[]{0x0000000F658C0020L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__2_in_rule__IfThenElse__Group_5__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ElseAssignment_5_1_in_rule__IfThenElse__Group_5__1__Impl5284 = new BitSet(new long[]{0x0000000F65880022L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_5__2__Impl_in_rule__IfThenElse__Group_5__25315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group_5__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__0__Impl_in_rule__Affectation__Group__05380 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1_in_rule__Affectation__Group__05383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__VariableAssignment_0_in_rule__Affectation__Group__0__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__1__Impl_in_rule__Affectation__Group__15440 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2_in_rule__Affectation__Group__15443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Affectation__Group__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__Group__2__Impl_in_rule__Affectation__Group__25502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Affectation__ElemAssignment_2_in_rule__Affectation__Group__2__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__0__Impl_in_rule__Exec__Group__05565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exec__Group__1_in_rule__Exec__Group__05568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Exec__Group__0__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__1__Impl_in_rule__Exec__Group__15627 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exec__Group__2_in_rule__Exec__Group__15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__SequenceAssignment_1_in_rule__Exec__Group__1__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group__2__Impl_in_rule__Exec__Group__25687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__0_in_rule__Exec__Group__2__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__0__Impl_in_rule__Exec__Group_2__05751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__1_in_rule__Exec__Group_2__05754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exec__Group_2__0__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__1__Impl_in_rule__Exec__Group_2__15813 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__2_in_rule__Exec__Group_2__15816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__ParamsAssignment_2_1_in_rule__Exec__Group_2__1__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__2__Impl_in_rule__Exec__Group_2__25873 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__3_in_rule__Exec__Group_2__25876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__0_in_rule__Exec__Group_2__2__Impl5903 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2__3__Impl_in_rule__Exec__Group_2__35934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exec__Group_2__3__Impl5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__0__Impl_in_rule__Exec__Group_2_2__06001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__1_in_rule__Exec__Group_2_2__06004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Exec__Group_2_2__0__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__Group_2_2__1__Impl_in_rule__Exec__Group_2_2__16063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exec__ParamsAssignment_2_2_1_in_rule__Exec__Group_2_2__1__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__0__Impl_in_rule__Fill__Group__06124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fill__Group__1_in_rule__Fill__Group__06127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Fill__Group__0__Impl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__1__Impl_in_rule__Fill__Group__16186 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Fill__Group__2_in_rule__Fill__Group__16189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__FieldAssignment_1_in_rule__Fill__Group__1__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__2__Impl_in_rule__Fill__Group__26246 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Fill__Group__3_in_rule__Fill__Group__26249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fill__Group__2__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Group__3__Impl_in_rule__Fill__Group__36308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fill__Alternatives_3_in_rule__Fill__Group__3__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__0__Impl_in_rule__Check__Group__06373 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Check__Group__1_in_rule__Check__Group__06376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Check__Group__0__Impl6404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__Group__1__Impl_in_rule__Check__Group__16435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__CheckboxAssignment_1_in_rule__Check__Group__1__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__0__Impl_in_rule__Click__Group__06496 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__Click__Group__1_in_rule__Click__Group__06499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Click__Group__0__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__Group__1__Impl_in_rule__Click__Group__16558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__ElemAssignment_1_in_rule__Click__Group__1__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__0__Impl_in_rule__Verify__Group__06619 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__Verify__Group__1_in_rule__Verify__Group__06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Verify__Group__0__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__Group__1__Impl_in_rule__Verify__Group__16681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Verify__ConditionAssignment_1_in_rule__Verify__Group__1__Impl6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__0__Impl_in_rule__GoTo__Group__06742 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1_in_rule__GoTo__Group__06745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__GoTo__Group__0__Impl6773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Group__1__Impl_in_rule__GoTo__Group__16804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__Alternatives_1_in_rule__GoTo__Group__1__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__0__Impl_in_rule__Condition__Group__06865 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__Condition__Group__1_in_rule__Condition__Group__06868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Condition__Group__0__Impl6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Group__1__Impl_in_rule__Condition__Group__16930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Condition__Alternatives_1_in_rule__Condition__Group__1__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__0__Impl_in_rule__UnaryCondition__Group__06991 = new BitSet(new long[]{0x000001F00000E000L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__1_in_rule__UnaryCondition__Group__06994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__OpAssignment_0_in_rule__UnaryCondition__Group__0__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__Group__1__Impl_in_rule__UnaryCondition__Group__17051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__ElemAssignment_1_in_rule__UnaryCondition__Group__1__Impl7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__0__Impl_in_rule__BinaryCondition__Group__07112 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__1_in_rule__BinaryCondition__Group__07115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__ElemAssignment_0_in_rule__BinaryCondition__Group__0__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__1__Impl_in_rule__BinaryCondition__Group__17172 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__2_in_rule__BinaryCondition__Group__17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__OpAssignment_1_in_rule__BinaryCondition__Group__1__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Group__2__Impl_in_rule__BinaryCondition__Group__27232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryCondition__Alternatives_2_in_rule__BinaryCondition__Group__2__Impl7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Group__0__Impl_in_rule__GetButton__Group__07295 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetButton__Group__1_in_rule__GetButton__Group__07298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GetButton__Group__0__Impl7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Group__1__Impl_in_rule__GetButton__Group__17357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButton__Alternatives_1_in_rule__GetButton__Group__1__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Group__0__Impl_in_rule__GetLink__Group__07418 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetLink__Group__1_in_rule__GetLink__Group__07421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GetLink__Group__0__Impl7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Group__1__Impl_in_rule__GetLink__Group__17480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLink__Alternatives_1_in_rule__GetLink__Group__1__Impl7507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__0__Impl_in_rule__GetCheckbox__Group__07541 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__1_in_rule__GetCheckbox__Group__07544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__GetCheckbox__Group__0__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Group__1__Impl_in_rule__GetCheckbox__Group__17603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckbox__Alternatives_1_in_rule__GetCheckbox__Group__1__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Group__0__Impl_in_rule__GetText__Group__07664 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetText__Group__1_in_rule__GetText__Group__07667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__GetText__Group__0__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Group__1__Impl_in_rule__GetText__Group__17726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetText__Alternatives_1_in_rule__GetText__Group__1__Impl7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__0__Impl_in_rule__GetButtons__Group__07787 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__1_in_rule__GetButtons__Group__07790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__GetButtons__Group__0__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Group__1__Impl_in_rule__GetButtons__Group__17849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetButtons__Alternatives_1_in_rule__GetButtons__Group__1__Impl7876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__0__Impl_in_rule__GetCheckboxes__Group__07911 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__1_in_rule__GetCheckboxes__Group__07914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__GetCheckboxes__Group__0__Impl7942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Group__1__Impl_in_rule__GetCheckboxes__Group__17973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetCheckboxes__Alternatives_1_in_rule__GetCheckboxes__Group__1__Impl8000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__0__Impl_in_rule__GetLinks__Group__08035 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__1_in_rule__GetLinks__Group__08038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__GetLinks__Group__0__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Group__1__Impl_in_rule__GetLinks__Group__18097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GetLinks__Alternatives_1_in_rule__GetLinks__Group__1__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Program__SequencesAssignment_08164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_rule__Program__TestsAssignment_18195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Test__BrowserAssignment_18226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Test__BodyAssignment_38257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_18288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_18319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Sequence__ParametersAssignment_2_2_18350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Sequence__BodyAssignment_48381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Variable__NameAssignment8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElems_in_rule__ForAll__ElemsAssignment_18443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__ForAll__ItAssignment_28474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__ForAll__BodyAssignment_48505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__DoWhile__BodyAssignment_18536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__DoWhile__ConditionAssignment_38567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__IfThenElse__ConditionAssignment_18598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_38629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_5_18660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__Affectation__VariableAssignment_08691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_rule__Affectation__ElemAssignment_28722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exec__SequenceAssignment_18757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_18792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Exec__ParamsAssignment_2_2_18823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fill__FieldAssignment_18854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Fill__ValueAssignment_3_08885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fill__ParamAssignment_3_18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Check__CheckboxAlternatives_1_0_in_rule__Check__CheckboxAssignment_18955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Click__ElemAlternatives_1_0_in_rule__Click__ElemAssignment_18988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rule__Verify__ConditionAssignment_19021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GoTo__ValueAssignment_1_09052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GoTo__LinkAlternatives_1_1_0_in_rule__GoTo__LinkAssignment_1_19083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__UnaryCondition__OpAssignment_09116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryCondition__ElemAlternatives_1_0_in_rule__UnaryCondition__ElemAssignment_19147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElem_in_rule__BinaryCondition__ElemAssignment_09180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOp_in_rule__BinaryCondition__OpAssignment_19211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BinaryCondition__ValueAssignment_2_09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BinaryCondition__ParamAssignment_2_19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetButton__ValueAssignment_1_09312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetButton__VarAssignment_1_19347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetLink__ValueAssignment_1_09382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetLink__VarAssignment_1_19417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetCheckbox__ValueAssignment_1_09452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetCheckbox__VarAssignment_1_19487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetText__ValueAssignment_1_09522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetText__VarAssignment_1_19557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetButtons__ValueAssignment_1_09592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetButtons__VarAssignment_1_19627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetCheckboxes__ValueAssignment_1_09662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetCheckboxes__VarAssignment_1_19697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__GetLinks__ValueAssignment_1_09732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GetLinks__VarAssignment_1_19767 = new BitSet(new long[]{0x0000000000000002L});

}