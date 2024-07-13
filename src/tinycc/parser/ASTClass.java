package tinycc.parser;

import java.util.List;

import mars.venus.editors.jeditsyntax.InputHandler.next_char;
import tinycc.diagnostic.Locatable;
import tinycc.implementation.expression.BinaryExpression;
import tinycc.implementation.expression.Expression;
import tinycc.implementation.statement.Statement;
import tinycc.implementation.type.BaseType;
import tinycc.implementation.type.FunctionType;
import tinycc.implementation.type.PointerType;
import tinycc.implementation.type.Type;

public class ASTClass implements ASTFactory {

    // ------------------Statements----------------

    @Override
    public Statement createBlockStatement(Locatable loc, List<Statement> statements) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBlockStatement'");
    }

    @Override
    public Statement createBreakStatement(Locatable loc) {
        throw new UnsupportedOperationException("Break statement not implemented!");
    }

    @Override

    public Statement createContinueStatement(Locatable loc) {
        throw new UnsupportedOperationException("Continue statement not implemented!");
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
    public Statement createAnnotatedWhileStatement(
            Locatable loc, Expression condition, Statement body,
            Expression invariant, Expression term, Token loopBound) {
        throw new UnsupportedOperationException("Annotated while statement not implemented!");
    }

    @Override
    public Statement createAssumeStatement(Locatable loc, Expression condition) {
        throw new UnsupportedOperationException("Assume statement not implemented!");
    }

    @Override
    public Statement createAssertStatement(Locatable loc, Expression condition) {
        throw new UnsupportedOperationException("Assert statement not implemented!");
    }

    // ---------- Types --------------

    @Override
    public Type createFunctionType(Type returnType, List<Type> parameters) {
        return new FunctionType(returnType, parameters);
    }

    @Override
    public Type createPointerType(Type pointsTo) {
        return new PointerType(pointsTo);
    }

    @Override
    public Type createBaseType(TokenKind kind) {
        return new BaseType(kind);
    }

    // -------------- Expressions -------------

    @Override
    public Expression createBinaryExpression(Token operator, Expression left, Expression right) {
        return new BinaryExpression(operator, left, right);
    }

    @Override
    public Expression createCallExpression(Token token, Expression callee, List<Expression> arguments) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCallExpression'");
    }

    @Override
    public Expression createConditionalExpression(Token token, Expression condition, Expression consequence,
            Expression alternative) {
        throw new UnsupportedOperationException("Conditional expression not implemented!");
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
