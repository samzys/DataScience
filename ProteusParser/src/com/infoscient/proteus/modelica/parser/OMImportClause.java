/* Generated By:JJTree: Do not edit this line. OMImportClause.java */

package com.infoscient.proteus.modelica.parser;

import com.infoscient.proteus.types.BooleanType;
import com.infoscient.proteus.types.StringType;

public class OMImportClause extends SimpleNode {

	@StringType(name = "Name", category = CATEGORY_CODE)
	public String name;

	@BooleanType(name = "Include subclasses", category = CATEGORY_CODE)
	public boolean includeSub;

	@StringType(name = "Alias", category = CATEGORY_CODE)
	public String alias;

	public OMComment comment;

	public OMImportClause(int id) {
		super(id);
	}

	public OMImportClause(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append("import ");
		if (alias != null) {
			sb.append(alias + " = ");
		}
		sb.append(name);
		if (includeSub) {
			sb.append(".*");
		}
		sb.append(comment.toCode());
		return sb.toString();
	}
}