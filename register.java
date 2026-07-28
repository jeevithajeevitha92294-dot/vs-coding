import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Register {

    public static void registerUser(String name, String email, String pass,
                                    String role, String college,
                                    String course, String skills,
                                    String interest) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO users(name,email,password,role,college,course,skills,interest) VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);
            ps.setString(4, role);
            ps.setString(5, college);
            ps.setString(6, course);
            ps.setString(7, skills);
            ps.setString(8, interest);

            ps.executeUpdate();

            System.out.println("User Registered Successfully!");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
