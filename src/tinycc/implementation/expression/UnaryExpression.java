package tinycc.implementation.expression;

import tinycc.parser.Token;

public class UnaryExpression extends Expression {

    Token operator;
    boolean postfix;
    Expression operand;

    public UnaryExpression(Token operator, boolean postfix, Expression operand) {

        this.operator = operator;
        this.postfix = postfix;
        this.operand = operand;

    }

    @Override
    public String toString() {
        return "Unary_" + operator + "[" + operand.toString() + "]";
    }

}
