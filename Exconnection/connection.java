package Exconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    public static final String username = "root";
    public static final String password = "";
    public static final String url = "jdbc:mysql://localhost:3306/student";

    private Connection cn;

    public connection() {
        try {
            // Step 2: Load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish the connection
            cn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established: " + cn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return cn;
    }
}
