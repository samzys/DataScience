/* Generated By:JJTree: Do not edit this line. OMElementModification.java */

package proteus.gwt.shared.modelica.parser;

public class OMElementModification extends SimpleNode {

	public OMComponentRef componentRef;

	public OMModification modification;

	public String stringComment;

	public OMElementModification(int id) {
		super(id);
	}

	public OMElementModification(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	@Override
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	@Override
	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(componentRef.toCode());
		if (modification != null) {
			sb.append(modification.toCode());
		}
		if (stringComment.length() > 0) {
			sb.append("\"" + stringComment + "\"");
		}
		return sb.toString();
	}
}
