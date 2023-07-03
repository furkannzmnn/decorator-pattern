package org.crafter.SqlExample;

public class Main {
    public static void main(String[] args) {
        DatabaseQuery databaseQuery = new BasicQuery();
        DatabaseQuery filteredQuery = new FilterDecorator(databaseQuery);
        DatabaseQuery sortedQuery = new SortingDecorator(filteredQuery);
        sortedQuery.executeQuery(); // Executing query: SELECT * FROM table WHERE id = 1 ORDER BY id
    }
}
