//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> AdditiveExpression()
 * f1 -> [ ( "<<" | ">>" ) ShiftExpression() ]
 */
public class ShiftExpression implements Node {
  static final long serialVersionUID = 20050923L;

   public AdditiveExpression f0;
   public NodeOptional f1;

   public ShiftExpression(AdditiveExpression n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      v.visit(this);
   }
}
