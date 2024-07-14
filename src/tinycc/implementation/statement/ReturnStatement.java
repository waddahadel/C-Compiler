package tinycc.implementation.statement;

import tinycc.implementation.expression.*;

import tinycc.diagnostic.Locatable;

public class ReturnStatement extends Statement {

    Locatable loc;
    Expression expression;

    public ReturnStatement(Locatable loc, Expression expression) {
        this.loc = loc;
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (expression == null) {
            return "Return[]";
        } else {
            return "Return[" + expression.toString() + "]";
        }
    }

}
