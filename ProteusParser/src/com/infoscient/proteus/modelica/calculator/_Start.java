/* Generated By:JJTree: Do not edit this line. _Start.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=_,NODE_EXTENDS=,NODE_FACTORY= */
package com.infoscient.proteus.modelica.calculator;

import java.util.LinkedList;
import java.util.List;

public class _Start extends SimpleNode {
	public List<_Expressions> eList = new LinkedList<_Expressions>();
	
	//parser this one to store the value
	public List<Double> doubleList = new LinkedList<Double>();
	public List<Integer> arraySubList = new LinkedList<Integer>();
	
  public _Start(int id) {
    super(id);
  }

  public _Start(Calculator p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CalculatorVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ce3eeaf861b763239cd6f82c1ab6d7b0 (do not edit this line) */
