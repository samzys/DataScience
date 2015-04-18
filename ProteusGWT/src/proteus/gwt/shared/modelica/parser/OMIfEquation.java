/* Generated By:JJTree: Do not edit this line. OMIfEquation.java */

package proteus.gwt.shared.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMIfEquation extends SimpleNode {

	public OMExpression ifExpression;

	public List<OMEquation> ifEquations = new LinkedList<OMEquation>();

	public List<OMExpression> elseIfExpressions = new LinkedList<OMExpression>();

	public List<List<OMEquation>> elseIfEquationsList = new LinkedList<List<OMEquation>>();

	public boolean else_;

	public List<OMEquation> elseEquations = new LinkedList<OMEquation>();

	public OMIfEquation(int id) {
		super(id);
	}

	public OMIfEquation(ModelicaParser p, int id) {
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
		sb.append("if " + ifExpression.toCode() + " then\n");
		for (OMEquation eq : ifEquations) {
			sb.append(eq.toCode() + ";\n");
		}
		int i = 0;
		for (OMExpression exp : elseIfExpressions) {
			sb.append("elseif " + exp.toCode() + " then\n");
			List<OMEquation> eqs = elseIfEquationsList.get(i++);
			if (eqs != null) {
				for (OMEquation eq : eqs) {
					sb.append(eq.toCode() + ";\n");
				}
			}
		}
		if (else_) {
			sb.append("else\n");
			for (OMEquation eq : elseEquations) {
				sb.append(eq.toCode() + ";\n");
			}
		}
		sb.append("end if\n");
		return sb.toString();
	}
}
