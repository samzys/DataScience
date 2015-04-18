/* Generated By:JJTree: Do not edit this line. OMClassSpecifier.java */

package com.infoscient.proteus.modelica.parser;

import java.util.List;

import com.infoscient.proteus.types.StringType;

// Handle other specifier types (array subscript etc.)
public class OMClassSpecifier extends SimpleNode {

	@StringType(name = "Name", category = CATEGORY_CODE)
	public String name;//shared by all selctions to store the IDENT

	@StringType(name = "Description", category = CATEGORY_CODE)
	public String description;//shared by selection 0 and 4 to store string comment

	public OMComposition composition; //shared by selection 0 and 4 

	//selection 1
	public OMTypePrefix typePrefix; 
	
	public String refName; //shared by selction 1 and 3
	
	public OMSubscript []arraySubs;
	
	public OMClassModification classModification; //shared by selection 1 and 4
	
	public OMComment comment; //shared by selection 1, 2, 3

	//for selection 2
	public boolean allTag; //if ":" sign is used set the tag to be true;
	
	public OMEnumList omEnumlist; //if allTag is true, there is no need to check this elements
	
	//for selection 3
	public List<String> IdentList;
	
	public boolean extends_;

	public boolean endTag;
	

	public OMClassSpecifier(int id) {
		super(id);
	}

	public OMClassSpecifier(ModelicaParser p, int id) {
		super(p, id);
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	public String toCode() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " ");
		if (description != null && description.length() > 0) {
			sb.append("\"" + description + "\"\n");
		}
		if (composition != null) {
			sb.append(composition.toCode());
		}
		if (endTag) {
			sb.append("end " + name);
		}
		return sb.toString();
	}
	//	
	// public OMClassSpecifier copy() {
	// OMClassSpecifier copy = new OMClassSpecifier(parser, id);
	// copy.name = name;
	// copy.description = description;
	// if (composition != null) {
	// copy.composition = composition.copy();
	// }
	// copy.extends_ = extends_;
	// copy.endTag = endTag;
	// return copy;
	// }
}
