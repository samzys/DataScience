/* Generated By:JJTree: Do not edit this line. OMForIndices.java */

package proteus.gwt.shared.modelica.parser;

import java.util.LinkedList;
import java.util.List;

public class OMForIndices extends SimpleNode {

	public List<OMForIndex> forIndices = new LinkedList<OMForIndex>();

	public OMForIndices(int id) {
		super(id);
	}

	public OMForIndices(ModelicaParser p, int id) {
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
		for (OMForIndex fi : forIndices) {
			if (i++ > 0) {
				sb.append(", ");
			}
			sb.append(fi.toCode());
		}
		return sb.toString();
	}
}
