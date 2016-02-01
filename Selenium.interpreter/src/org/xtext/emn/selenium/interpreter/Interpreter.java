package org.xtext.emn.selenium.interpreter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.xtext.emn.selenium.sel.Instruction;
import org.xtext.emn.selenium.sel.Program;
import org.xtext.emn.selenium.sel.Sequence;
import org.xtext.emn.selenium.sel.Test;

public class Interpreter {
	
	Map<String, Object> environment = new HashMap<String, Object>();

	public void execute(Program program) {
		Iterator<Sequence> itSeq = program.getSequences().iterator();
		Iterator<Test> itTests = program.getTests().iterator();
		
		Sequence seq;
		do {
			seq = itSeq.next();
			this.step(seq);
		} while (itSeq.hasNext());
		
	}
	
	private void step(Instruction i) {
		
	}

}
