package tinycc.implementation.statement;

import tinycc.implementation.expression.*;

import tinycc.diagnostic.Locatable;

public class ExpressionStatement extends Statement {

    Locatable loc;
    Expression expression;

    public ExpressionStatement(Locatable loc, Expression expression) {
        this.loc = loc;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression.toString();
    }

}
