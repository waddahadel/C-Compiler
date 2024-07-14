package tinycc.implementation.statement;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.*;

public class IfStatement extends Statement {

    Locatable loc;
    Expression condition;
    Statement consequence;
    Statement alternative;

    public IfStatement(Locatable loc, Expression condition, Statement consequence,
            Statement alternative) {
        this.loc = loc;
        this.condition = condition;
        this.consequence = consequence;
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        if (alternative == null) {
            return "If[" + condition.toString() + "," + consequence.toString() + "]";
        } else {
            return "If[" + condition.toString() + "," + consequence.toString() + "," + alternative.toString() + "]";
        }
    }

}
