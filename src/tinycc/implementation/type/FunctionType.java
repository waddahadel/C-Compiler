package tinycc.implementation.type;

import java.util.List;

public class FunctionType extends Type {

    Type returnType;
    List<Type> parameters;

    public FunctionType(Type returnType, List<Type> parameters) {
        this.returnType = returnType;
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        String returnTypeString = returnType.toString();
        StringBuilder parametersToString = new StringBuilder();

        if (parameters != null && !parameters.isEmpty()) {
            for (Type paramType : parameters) {
                if (parametersToString.length() > 0) {
                    parametersToString.append(" , ");
                }
                parametersToString.append(paramType.toString());
            }
            return "FunctionType [ " + returnTypeString + " , " + parametersToString.toString() + " ]";
        } else {
            return "FunctionType [ " + returnTypeString + " ]";
        }
    }
}
