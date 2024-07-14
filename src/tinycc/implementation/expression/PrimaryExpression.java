package tinycc.implementation.expression;

import tinycc.parser.Token;

public class PrimaryExpression extends Expression {

    Token token;

    public PrimaryExpression(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        switch (token.getKind()) {
            case IDENTIFIER:
                return "Var_" + token.toString();
            case CHARACTER:
                return "Const_" + token.toString();
            case NUMBER:
                return "Const_" + token.toString();
            case STRING:
                return "Const_" + token.toString();
            default:
                return "Unfortunately, the TinyC syntax doesn't  support this.";
        }
    }

}
