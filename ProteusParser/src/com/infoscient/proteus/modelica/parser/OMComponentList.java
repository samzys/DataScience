/* Generated By:JJTree: Do not edit this line. OMComponentList.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMComponentList extends SimpleNode {

	public List<OMComponentDecl> componentDecls = new LinkedList<OMComponentDecl>();

	public OMComponentList(int id) {
		super(id);
	}

	public OMComponentList(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (OMComponentDecl cd : componentDecls) {
			if (i++ > 0) {
				sb.append(", ");
			}
			sb.append(cd.toCode());
		}
		return sb.toString();
	}
	//	
	// public OMComponentList copy() {
	// OMComponentList copy = new OMComponentList(parser, id);
	// for (OMComponentDecl cd : componentDecls) {
	// copy.componentDecls.add(cd);
	// }
	// return copy;
	// }

	public List<OMComponentDecl> getComponentDecls() {
		return componentDecls;
	}

	public void setComponentDecls(List<OMComponentDecl> componentDecls) {
		this.componentDecls = componentDecls;
	}
}