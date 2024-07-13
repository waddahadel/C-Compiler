package tinycc.implementation.type;

import tinycc.parser.*;;

public class BaseType extends Type {

    TokenKind type;

    public BaseType(TokenKind type) {
        type = this.type;
    }

    @Override
    public String toString() {
        String type_text = type.getText();
        return "Type_" + type_text;
    }

}
