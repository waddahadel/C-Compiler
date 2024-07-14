package tinycc.implementation.expression;

import tinycc.implementation.type.Type;
import tinycc.parser.Token;

public class ExternalDeclaration extends Expression {

    Token identifier;
    Type type;

    public ExternalDeclaration(Type type, Token identifier) {
        this.identifier = identifier;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Var_" + identifier.toString();
    }

}
