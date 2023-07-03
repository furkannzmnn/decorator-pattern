package org.crafter.SqlExample;

public class BasicQuery implements DatabaseQuery{
    @Override
    public String getQuery() {
        return "SELECT * FROM table";
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing query: " + getQuery());
    }
}
