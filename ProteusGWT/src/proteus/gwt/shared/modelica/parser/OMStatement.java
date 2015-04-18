/* Generated By:JJTree: Do not edit this line. OMStatement.java */

package proteus.gwt.shared.modelica.parser;

public class OMStatement extends SimpleNode {

	public OMComponentRef componentRef;

	public OMExpression expression;

	public OMFunctionCallArgs funcCallArgs;

	public OMExpression[] outputExpressionList;

	public boolean break_;

	public boolean return_;

	public OMIfStatement ifStatement;

	public OMForStatement forStatement;

	public OMWhileStatement whileStatement;

	public OMWhenStatement whenStatement;

	public OMComment comment;

	public OMStatement(int id) {
		super(id);
	}

	public OMStatement(ModelicaParser p, int id) {
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
			sb.append(componentRef.toCode());
			if (expression != null) {
				sb.append(" := " + expression.toCode());
			} else {
				sb.append(funcCallArgs.toCode());
			}
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
			sb.append(" := " + componentRef.toCode() + funcCallArgs.toCode());
		} else if (break_) {
			sb.append("break");
		} else if (return_) {
			sb.append("return");
		} else if (ifStatement != null) {
			sb.append(ifStatement.toCode());
		} else if (forStatement != null) {
			sb.append(forStatement.toCode());
		} else if (whileStatement != null) {
			sb.append(whileStatement.toCode());
		} else if (whenStatement != null) {
			sb.append(whenStatement.toCode());
		}
		sb.append(comment.toCode());
		return sb.toString();
	}
}
