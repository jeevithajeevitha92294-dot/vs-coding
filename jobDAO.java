package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JobDAO {

    public void addJob(String title, String company, String location, String skills, double cgpa, int backlogs) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO jobs(job_title, company_name, location, required_skills, min_cgpa, max_backlogs) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, title);
            ps.setString(2, company);
            ps.setString(3, location);
            ps.setString(4, skills);
            ps.setDouble(5, cgpa);
            ps.setInt(6, backlogs);

            ps.executeUpdate();

            System.out.println("Job Added Successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void viewJobs() {

    try {
        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM jobs";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println("Job ID: " + rs.getInt("job_id"));
            System.out.println("Job Title: " + rs.getString("job_title"));
            System.out.println("Company: " + rs.getString("company_name"));
            System.out.println("Location: " + rs.getString("location"));
            System.out.println("Skills: " + rs.getString("required_skills"));
            System.out.println("--------------------");
        }

    } catch(Exception e) {
        System.out.println(e);
    }
}
}
