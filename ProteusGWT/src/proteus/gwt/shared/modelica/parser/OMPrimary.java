/* Generated By:JJTree: Do not edit this line. OMPrimary.java */

package proteus.gwt.shared.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMPrimary extends SimpleNode {

	public boolean escimg;

	public String image;
	
	public String funcName;

	public OMFunctionCallArgs funcCallArgs;

	public OMComponentRef componentRef;

	public OMExpression[] outputExpressionList;

	public List<List<OMExpression>> expressionLists = new LinkedList<List<OMExpression>>();

	public OMFunctionArguments funcArgs;

	public boolean initial;

	public boolean terminal;

	public OMPrimary(int id) {
		super(id);
	}

	public OMPrimary(ModelicaParser p, int id) {
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
		if (image != null) {
			String s;
			if (escimg) {
				s = "\"" + image + "\"";
			} else {
				s = image;
			}
			sb.append(s);
		} else if (funcName != null) {
			sb.append(funcName + funcCallArgs.toCode());
		} else if (componentRef != null) {
			sb.append(componentRef.toCode());
		} else if (outputExpressionList != null) {
			sb.append("(");
			int i = 0;
			for (OMExpression exp : outputExpressionList) {
				if (i++ > 0) {
					sb.append(", ");
				}
				sb.append(exp.toCode());
			}
			sb.append(")");
		} else if (expressionLists.size() > 0) {
			sb.append("[");
			int i = 0;
			for (List<OMExpression> list : expressionLists) {
				if (i++ > 0) {
					sb.append("; ");
				}
				int j = 0;
				for (OMExpression exp : list) {
					if (j++ > 0) {
						sb.append(", ");
					}
					sb.append(exp.toCode());
				}
			}
			sb.append("]");
		} else if (funcArgs != null) {
			sb.append("{" + funcArgs.toCode() + "}");
		}
		return sb.toString();
	}
}
