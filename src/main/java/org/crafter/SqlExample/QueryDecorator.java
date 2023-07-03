package org.crafter.SqlExample;

public abstract class QueryDecorator implements DatabaseQuery {
    private final DatabaseQuery databaseQuery;

    public QueryDecorator(DatabaseQuery databaseQuery) {
        this.databaseQuery = databaseQuery;
    }

    public String getQuery() {
        return databaseQuery.getQuery();
    }

    public void executeQuery() {
        databaseQuery.executeQuery();
    }
}
