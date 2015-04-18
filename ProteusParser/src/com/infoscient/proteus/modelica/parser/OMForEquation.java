/* Generated By:JJTree: Do not edit this line. OMForEquation.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMForEquation extends SimpleNode {

	public OMForIndices forIndices;

	public List<OMEquation> equations = new LinkedList<OMEquation>();

	public OMForEquation(int id) {
		super(id);
	}

	public OMForEquation(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append("for " + forIndices.toCode() + " loop\n");
		for (OMEquation eq : equations) {
			sb.append(eq.toCode() + ";\n");
		}
		sb.append("end for\n");
		return sb.toString();
	}
}
