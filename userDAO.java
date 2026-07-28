package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;


public class UserDAO {

    public void addUser(User user) {
        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name, email, password, role) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.name);
            ps.setString(2, user.email);
            ps.setString(3, user.password);
            ps.setString(4, user.role);

            ps.executeUpdate();

            System.out.println("User Added Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
public void viewUsers() {
    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM users";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Email: " + rs.getString("email"));
            System.out.println("Role: " + rs.getString("role"));
            System.out.println("-----------------------");
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}
public void login(String email, String password) {
    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM users WHERE email=? AND password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, email);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Login!");
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}
}
