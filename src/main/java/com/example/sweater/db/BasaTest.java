package com.example.sweater.db;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BasaTest {

    private static java.sql.Connection con = null;

    public static Connection getC() throws ClassNotFoundException {
        final String URL = "jdbc:mysql://localhost:3306/rocket";
        final String USER = "root";
        final String PASSWORD = "root";

        Class.forName("com.mysql.jdbc.Driver");
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return (Connection) con;
    }
    public static void close(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
