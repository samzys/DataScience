/* Generated By:JJTree: Do not edit this line. OMComponentClause1.java */

package com.infoscient.proteus.modelica.parser;

public class OMComponentClause1 extends SimpleNode {

	public OMTypePrefix typePrefix;

	public String typeName;

	public OMComponentDecl1 componentDecl1;

	public OMComponentClause1(int id) {
		super(id);
	}

	public OMComponentClause1(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(typePrefix.toCode());
		sb.append(typeName + " ");
		sb.append(componentDecl1.toCode());
		return sb.toString();
	}
	//	
	// public OMComponentClause1 copy() {
	// OMComponentClause1 copy = new OMComponentClause1(parser, id);
	// copy.typePrefix = typePrefix.copy();
	// copy.typeName = typeName;
	// copy.componentDecl1 = componentDecl1.copy();
	// return copy;
	// }
}
