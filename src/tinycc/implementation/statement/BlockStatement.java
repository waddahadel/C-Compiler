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

        StringBuilder statementsToString = new StringBuilder();

        if (statements != null && !statements.isEmpty()) {
            for (Statement statement : statements) {
                if (statementsToString.length() > 0) {
                    statementsToString.append(" , ");
                }
                statementsToString.append(statement.toString());
            }
            return "Block [ " + statementsToString + " ]";
        } else {
            return "Block [ ]";
        }
    }

}
