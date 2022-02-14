package org.java.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class CommonRepository<T> {

    protected abstract List<T> selectAll();

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Neva_Network_Company?user=root&password=1111");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return connection;
    }
}
