/* Generated By:JJTree: Do not edit this line. OMForStatement.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMForStatement extends SimpleNode {

	public OMForIndices forIndices;

	public List<OMStatement> statements = new LinkedList<OMStatement>();

	public OMForStatement(int id) {
		super(id);
	}

	public OMForStatement(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append("for " + forIndices.toCode() + "loop\n");
		for (OMStatement st : statements) {
			sb.append(st.toCode() + ";\n");
		}
		sb.append("end for\n");
		return sb.toString();
	}
}
