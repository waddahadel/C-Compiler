package tinycc.implementation.type;

import tinycc.parser.*;;

public class PointerType extends Type {

    Type type;

    public PointerType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String type_text = type.toString();
        return "Pointer[" + type_text + "]";
    }

}
