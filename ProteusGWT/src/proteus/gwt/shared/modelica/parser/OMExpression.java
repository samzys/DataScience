/* Generated By:JJTree: Do not edit this line. OMExpression.java */

package proteus.gwt.shared.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMExpression extends SimpleNode {

	public OMSimpleExpression simpleExpression;

	public OMExpression ifCondition;

	public OMExpression ifExpression;

	public List<OMExpression> elseIfConditions = new LinkedList<OMExpression>();

	public List<OMExpression> elseIfExpressions = new LinkedList<OMExpression>();

	public OMExpression elseExpression;

	public OMExpression(int id) {
		super(id);
	}

	public OMExpression(ModelicaParser p, int id) {
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
		if (simpleExpression != null) {
			sb.append(simpleExpression.toCode());
		} else {
			sb.append("if " + ifCondition.toCode() + " then "
					+ ifExpression.toCode());
			int i = 0;
			for (OMExpression cond : elseIfConditions) {
				sb.append("\nelseif " + cond.toCode() + " then "
						+ elseIfExpressions.get(i++).toCode());
			}
			sb.append(" else " + elseExpression.toCode());
		}
		return sb.toString();
	}

	public static class OMExpressionPtr extends OMExpression {

		private OMExpression pointTo;

		/*
		 * This constructor is provided only to be compatible with the interface
		 * provided by OMExpression, should not be used
		 */
		public OMExpressionPtr(int id) {
			super(id);
		}

		/*
		 * This constructor is provided only to be compatible with the interface
		 * provided by OMExpression, should not be used
		 */
		public OMExpressionPtr(ModelicaParser p, int id) {
			super(p, id);
		}

		public OMExpressionPtr(OMExpression pointTo) {
			this(pointTo.parser, pointTo.id);
			set(pointTo);
		}

		public OMExpression get() {
			return pointTo;
		}

		public void set(OMExpression pointTo) {
			this.pointTo = pointTo;
			id = pointTo.id;
			parser = pointTo.parser;
			simpleExpression = pointTo.simpleExpression;
			ifCondition = pointTo.ifCondition;
			ifExpression = pointTo.ifExpression;
			elseIfConditions = pointTo.elseIfConditions;
			elseIfExpressions = pointTo.elseIfExpressions;
			elseExpression = pointTo.elseExpression;
		}

		/** Accept the visitor. * */
		@Override
		public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
			return visitor.visit(this, data);
		}

		@Override
		public String toCode() {
			return pointTo.toCode();
		}
	}
}
