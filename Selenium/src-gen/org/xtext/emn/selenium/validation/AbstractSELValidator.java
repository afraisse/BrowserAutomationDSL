/*
 * generated by Xtext
 */
package org.xtext.emn.selenium.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSELValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.emn.selenium.sel.SelPackage.eINSTANCE);
		return result;
	}
}
