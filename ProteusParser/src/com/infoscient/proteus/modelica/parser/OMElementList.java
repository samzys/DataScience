/* Generated By:JJTree: Do not edit this line. OMElementList.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMElementList extends SimpleNode {

	public List<OMElement> elements = new LinkedList<OMElement>();

	public List<OMAnnotation> annotations = new LinkedList<OMAnnotation>();

	public OMElementList(int id) {
		super(id);
	}

	public OMElementList(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		for (OMElement e : elements) {
			sb.append(e.toCode() + ";\n");
		}
		if (!noAnnotation) {
			for (OMAnnotation a : annotations) {
				sb.append(a.toCode() + ";\n");
			}
		}
		return sb.toString();
	}
}