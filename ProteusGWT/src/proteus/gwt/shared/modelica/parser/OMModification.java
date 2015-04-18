/* Generated By:JJTree: Do not edit this line. OMModification.java */

package proteus.gwt.shared.modelica.parser;

public class OMModification extends SimpleNode {

	public OMClassModification classModification;

	public String eqType;

	public OMExpression expression;

	public OMModification(int id) {
		super(id);
	}

	public OMModification(ModelicaParser p, int id) {
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
		if (classModification != null) {
			sb.append(classModification.toCode() + " ");
		} else {
			sb.append(" ");
		}
		if (eqType != null) {
			sb.append(eqType + " " + expression.toCode());
		}
		return sb.toString();
	}
}
