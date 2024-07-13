package tinycc.parser;

import java.util.List;

import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.Expression;
import tinycc.implementation.statement.Statement;
import tinycc.implementation.type.Type;

public class ASTClass implements ASTFactory {

    // ------------------Statements----------------

    @Override
    public Statement createBlockStatement(Locatable loc, List<Statement> statements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBlockStatement'");
    }

    @Override
    public Statement createDeclarationStatement(Type type, Token name, Expression init) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createDeclarationStatement'");
    }

    @Override
    public Statement createExpressionStatement(Locatable loc, Expression expression) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createExpressionStatement'");
    }

    @Override
    public Statement createIfStatement(Locatable loc, Expression condition, Statement consequence,
            Statement alternative) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createIfStatement'");
    }

    @Override
    public Statement createReturnStatement(Locatable loc, Expression expression) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createReturnStatement'");
    }

    @Override
    public Statement createWhileStatement(Locatable loc, Expression condition, Statement body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createWhileStatement'");
    }

    @Override
    public Type createFunctionType(Type returnType, List<Type> parameters) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFunctionType'");
    }

    @Override
    public Type createPointerType(Type pointsTo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPointerType'");
    }

    @Override
    public Type createBaseType(TokenKind kind) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBaseType'");
    }

    @Override
    public Expression createBinaryExpression(Token operator, Expression left, Expression right) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBinaryExpression'");
    }

    @Override
    public Expression createCallExpression(Token token, Expression callee, List<Expression> arguments) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCallExpression'");
    }

    @Override
    public Expression createUnaryExpression(Token operator, boolean postfix, Expression operand) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUnaryExpression'");
    }

    @Override
    public Expression createPrimaryExpression(Token token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPrimaryExpression'");
    }

    @Override
    public void createExternalDeclaration(Type type, Token name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createExternalDeclaration'");
    }

    @Override
    public void createFunctionDefinition(Type type, Token name, List<Token> parameterNames, Statement body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFunctionDefinition'");
    }

}
