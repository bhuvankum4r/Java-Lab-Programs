package Program5b.src;

import java.sql.*;
public class MySQLConn {
    public static void main(String[] args) {
        try {
            // Create our MySQL database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "****");
            // Retrieve data from the users table
            String query = "SELECT * FROM users";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            // Iterate through the result set and print the data
            while (rs.next()) {
                String usn = rs.getString("USN");
                String name = rs.getString("Name");
                String section = rs.getString("Section");
                float cgpa = rs.getFloat("CGPA");
                System.out.format("USN: %s, Name: %s, Section: %s, CGPA: %.2f\n", usn, name, section, cgpa);
            }
            // Close resources
            st.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
