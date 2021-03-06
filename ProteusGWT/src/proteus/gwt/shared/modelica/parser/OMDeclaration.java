/* Generated By:JJTree: Do not edit this line. OMDeclaration.java */

package proteus.gwt.shared.modelica.parser;




public class OMDeclaration extends SimpleNode {

//	@StringType(name = "Name", category = CATEGORY_CODE)
	public String name;

	public OMModification modification;

	public OMSubscript[] arraySubscripts;

	public OMDeclaration(int id) {
		super(id);
	}

	public OMDeclaration(ModelicaParser p, int id) {
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
		sb.append(name + " ");
		if (arraySubscripts != null) {
			sb.append("[");
			int i = 0;
			for (OMSubscript s : arraySubscripts) {
				if (i > 0) {
					sb.append(", ");
				}
				sb.append(s.toCode());
			}
			sb.append("] ");
		}
		if (modification != null) {
			sb.append(modification.toCode());
		}
		return sb.toString();
	}

	/**
	 * @return the modification
	 */
	public OMModification getModification() {
		return modification;
	}

	/**
	 * @param modification the modification to set
	 */
	public void setModification(OMModification modification) {
		this.modification = modification;
	}
}
