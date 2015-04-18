/* Generated By:JJTree: Do not edit this line. OMTypePrefix.java */

package com.infoscient.proteus.modelica.parser;

import com.infoscient.proteus.types.EnumType;

public class OMTypePrefix extends SimpleNode {

	// @BooleanType(name = "Flow", category = CATEGORY_CODE)
	// public boolean flow;

	@EnumType(name = "Flow_stream", allowed = { "flow", "stream" }, category = CATEGORY_CODE)
	public String flow_stream;

	@EnumType(name = "Variability", allowed = { "discrete", "parameter",
			"constant" }, category = CATEGORY_CODE)
	public String variability;

	@EnumType(name = "Causality", allowed = { "input", "output" }, category = CATEGORY_CODE)
	public String causality;

	public OMTypePrefix(int id) {
		super(id);
	}

	public OMTypePrefix(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		if (flow_stream != null) {
			sb.append(flow_stream + " ");
		}
		if (variability != null) {
			sb.append(variability + " ");
		}
		if (causality != null) {
			sb.append(causality + " ");
		}
		return sb.toString();
	}
}
