package tinycc.implementation.expression;

public class BinaryExpression extends Expression {

    tinycc.parser.Token operator;
    Expression left;
    Expression right;

    public BinaryExpression(tinycc.parser.Token operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Binary_" + operator.toString() + "[" + left.toString() + "," + right.toString() + "]";
    }

}
