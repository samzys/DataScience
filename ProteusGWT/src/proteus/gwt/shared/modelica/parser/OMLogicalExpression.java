/* Generated By:JJTree: Do not edit this line. OMLogicalExpression.java */

package proteus.gwt.shared.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMLogicalExpression extends SimpleNode {

	public List<OMLogicalTerm> logicalTerms = new LinkedList<OMLogicalTerm>();

	public OMLogicalExpression(int id) {
		super(id);
	}

	public OMLogicalExpression(ModelicaParser p, int id) {
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
		int i = 0;
		for (OMLogicalTerm term : logicalTerms) {
			if (i++ > 0) {
				sb.append(" or ");
			}
			sb.append(term.toCode());
		}
		return sb.toString();
	}
}
