/* Generated By:JJTree: Do not edit this line. OMStoredDefinition.java */

package com.infoscient.proteus.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMStoredDefinition extends SimpleNode {

	public boolean within;

	public String name;

	public List<OMClassDefinition> classDefinitions = new LinkedList<OMClassDefinition>();

	public OMStoredDefinition(int id) {
		super(id);
	}

	public OMStoredDefinition(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		if (within) {
			sb.append("within ");
			if (name != null) {
				sb.append(name);
			}
			sb.append(";\n");
		}
		for (OMClassDefinition cd : classDefinitions) {
			sb.append(cd.toCode());
		}
		return sb.toString();
	}
}
