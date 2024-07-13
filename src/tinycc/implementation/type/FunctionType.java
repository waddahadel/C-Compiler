package tinycc.implementation.type;

import java.util.List;

public class FunctionType extends Type {

    Type returnType;
    List<Type> parameters;
    String parameters_to_strings = "";

    public FunctionType(Type returnType, List<Type> parameters) {
        this.returnType = returnType;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        String returnType_String = returnType.toString();

        for (Type param_type : parameters) {
            String.format(parameters_to_strings + ", ", param_type.toString());
        }

        return "FunctionType[" + returnType_String + parameters_to_strings + "]";
    }

}
