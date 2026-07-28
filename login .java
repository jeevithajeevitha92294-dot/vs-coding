import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {

    public static boolean checkLogin(String name, String pass) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM users WHERE name=? AND password=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                status = true;
                System.out.println("Login Successful!");
            }
            else {
                System.out.println("Invalid Login!");
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }

        return status;
    }
}
