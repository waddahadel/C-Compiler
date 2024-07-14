package tinycc.implementation.statement;

import tinycc.implementation.expression.*;
import tinycc.implementation.type.*;
import tinycc.parser.Token;

public class DeclarationStatement extends Statement {

    Type type;
    Token name;
    Expression init;

    public DeclarationStatement(Type type, Token name, Expression init) {
        this.type = type;
        this.name = name;
        this.init = init;
    }

    @Override
    public String toString() {
        if (init == null) {
            return "Declaration_" + name.toString() + "[" + type.toString() + "]";
        } else {
            return "Declaration_" + name.toString() + "[" + type.toString() + "," + init.toString() + "]";
        }
    }

}
