package org.crafter.SqlExample;

public class SortingDecorator extends QueryDecorator{
    public SortingDecorator(DatabaseQuery databaseQuery) {
        super(databaseQuery);
    }

    @Override
    public String getQuery() {
        return super.getQuery() + " ORDER BY id";
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing query: " + getQuery());
    }
}
