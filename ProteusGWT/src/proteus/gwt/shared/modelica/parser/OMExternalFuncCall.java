/* Generated By:JJTree: Do not edit this line. OMExternalFuncCall.java */

package proteus.gwt.shared.modelica.parser;

public class OMExternalFuncCall extends SimpleNode {

	public OMComponentRef componentRef;

	public String funcName;

	public OMExpression[] expList;

	public OMExternalFuncCall(int id) {
		super(id);
	}

	public OMExternalFuncCall(ModelicaParser p, int id) {
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
		if (componentRef != null) {
			sb.append(componentRef.toCode() + " = ");
		}
		sb.append(funcName);
		sb.append("(");
		if (expList != null) {
			int i = 0;
			for (OMExpression exp : expList) {
				if (i++ > 0) {
					sb.append(", ");
				}
				sb.append(exp.toCode());
			}
		}
		sb.append(")");
		return sb.toString();
	}
}
