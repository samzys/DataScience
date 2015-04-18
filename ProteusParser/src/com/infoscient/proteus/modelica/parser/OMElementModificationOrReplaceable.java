/* Generated By:JJTree: Do not edit this line. OMElementModificationOrReplaceable.java */

package com.infoscient.proteus.modelica.parser;

public class OMElementModificationOrReplaceable extends SimpleNode {

	public boolean each;

	public boolean final_;

	public OMElementModification elementModification;

	public OMElementReplaceable elementReplaceable;

	public OMElementModificationOrReplaceable(int id) {
		super(id);
	}

	public OMElementModificationOrReplaceable(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		if (each) {
			sb.append("each ");
		}
		if (final_) {
			sb.append("final ");
		}
		if (elementModification != null) {
			sb.append(elementModification.toCode());
		} else if (elementReplaceable != null) {
			sb.append(elementReplaceable.toCode());
		}
		return sb.toString();
	}
}
