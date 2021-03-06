/* Generated By:JJTree: Do not edit this line. OMSubscript.java */

package com.infoscient.proteus.modelica.parser;

public class OMSubscript extends SimpleNode {

	public boolean sep;

	public OMExpression expression;

	public OMSubscript(int id) {
		super(id);
	}

	public OMSubscript(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		if (sep) {
			sb.append(" : ");
		} else {
			sb.append(expression.toCode());
		}
		return sb.toString();
	}
}
