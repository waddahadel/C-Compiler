package tinycc.implementation.expression;

import mars.assembler.Token;

public class BinaryExpression extends Expression {

    Token operator;
    Expression left;
    Expression right;

    public BinaryExpression(tinycc.parser.Token operator2, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Binary_" + operator.toString() + "[" + left.toString() + "," + right.toString() + "]";
    }

}
