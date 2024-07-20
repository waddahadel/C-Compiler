package tinycc.implementation.expression;

import java.util.List;

import tinycc.parser.Token;

public class FunctionCallExpression extends Expression {

    Token token;
    Expression callee;
    List<Expression> argumentList;

    public FunctionCallExpression(Token token, Expression callee, List<Expression> arguments) {
        this.token = token;
        this.callee = callee;
        this.argumentList = arguments;
    }

    @Override
    public String toString() {

        StringBuilder argumentsToString = new StringBuilder();

        if (argumentList != null && !argumentList.isEmpty()) {
            for (Expression argument : argumentList) {
                if (argumentsToString.length() > 0) {
                    argumentsToString.append(" , ");
                }
                argumentsToString.append(argument.toString());
            }
            return "Call [ " + callee.toString() + " , " + argumentsToString + " ]";
        } else {
            return "Call [ " + callee.toString() + " ]";
        }
    }

}
