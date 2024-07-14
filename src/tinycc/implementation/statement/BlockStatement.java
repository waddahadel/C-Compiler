package tinycc.implementation.statement;

import java.util.List;

import tinycc.diagnostic.Locatable;

public class BlockStatement extends Statement {

    Locatable loc;
    List<Statement> statements;

    public BlockStatement(Locatable loc, List<Statement> statements) {
        this.loc = loc;
        this.statements = statements;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

}
