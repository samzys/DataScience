/* Generated By:JJTree: Do not edit this line. OMEquationSection.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMEquationSection extends SimpleNode {

	public boolean initial;

	public List<OMEquation> equations = new LinkedList<OMEquation>();

	public List<OMAnnotation> annotations = new LinkedList<OMAnnotation>();

	public OMEquationSection(int id) {
		super(id);
	}

	public OMEquationSection(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		if (initial) {
			sb.append("initial ");
		}
		sb.append("equation\n");
		for (OMEquation e : equations) {
			sb.append(e.toCode() + ";\n");
		}
		for (OMAnnotation a : annotations) {
			sb.append(a.toCode() + ";\n");
		}
		return sb.toString();
	}
}
