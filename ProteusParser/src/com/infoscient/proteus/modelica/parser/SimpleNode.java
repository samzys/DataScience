/* Generated By:JJTree: Do not edit this line. SimpleNode.java */

package com.infoscient.proteus.modelica.parser;

import java.io.Serializable;

import com.infoscient.proteus.Constants;

public abstract class SimpleNode implements Node, Constants, Serializable{
	protected Node parent;

	protected Node[] children;

	protected int id;
	
	public int selection=0;

	protected ModelicaParser parser;

	public SimpleNode(int i) {
		id = i;
	}

	public SimpleNode(ModelicaParser p, int i) {
		this(i);
		parser = p;
	}

	public void jjtOpen() {
	}

	public void jjtClose() {
	}

	public void jjtSetParent(Node n) {
		parent = n;
	}

	public Node jjtGetParent() {
		return parent;
	}

	public void jjtAddChild(Node n, int i) {
		if (children == null) {
			children = new Node[i + 1];
		} else if (i >= children.length) {
			Node c[] = new Node[i + 1];
			System.arraycopy(children, 0, c, 0, children.length);
			children = c;
		}
		children[i] = n;
	}

	public Node jjtGetChild(int i) {
		return children[i];
	}

	public int jjtGetNumChildren() {
		return (children == null) ? 0 : children.length;
	}

	/** Accept the visitor. * */
	public Object jjtAccept(ModelicaParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}

	/** Accept the visitor. * */
	public Object childrenAccept(ModelicaParserVisitor visitor, Object data) {
		if (children != null) {
			for (int i = 0; i < children.length; ++i) {
				children[i].jjtAccept(visitor, data);
			}
		}
		return data;
	}

	/*
	 * You can override these two methods in subclasses of SimpleNode to
	 * customize the way the node appears when the tree is dumped. If your
	 * output uses more than one line you should override toString(String),
	 * otherwise overriding toString() is probably all you need to do.
	 */

	public String toString() {
		return ModelicaParserTreeConstants.jjtNodeName[id];
	}

	public String toString(String prefix) {
		return prefix + toString();
	}

	/*
	 * Override this method if you want to customize how the node dumps out its
	 * children.
	 */

	public void dump(String prefix) {
		System.out.println(toString(prefix));
		if (children != null) {
			for (int i = 0; i < children.length; ++i) {
				SimpleNode n = (SimpleNode) children[i];
				if (n != null) {
					n.dump(prefix + " ");
				}
			}
		}
	}

	// Static system-wide flag which can be set to true to turn off annotations
	// in generated code. Sort of hackish... is there a better way?
	public static boolean noAnnotation;

	public String toCode() {
		return "";
	}
}