package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/nexthire";
            String username = "root";
            String password = "nexthire@2007";

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
            return con;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

public static void main(String[] args) {
    getConnection();
}
}
