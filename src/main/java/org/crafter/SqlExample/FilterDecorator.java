package org.crafter.SqlExample;

public class FilterDecorator extends QueryDecorator{

    public FilterDecorator(DatabaseQuery databaseQuery) {
        super(databaseQuery);
    }

    @Override
    public String getQuery() {
        return super.getQuery() + " WHERE id = 1";
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing query: " + getQuery());
    }
}
