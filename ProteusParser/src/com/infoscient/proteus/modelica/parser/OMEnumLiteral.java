/* Generated By:JJTree: Do not edit this line. OMEnumLiteral.java */

package com.infoscient.proteus.modelica.parser;

public class OMEnumLiteral extends SimpleNode {

	public String name;

	public OMComment comment;

	public OMEnumLiteral(int id) {
		super(id);
	}

	public OMEnumLiteral(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
