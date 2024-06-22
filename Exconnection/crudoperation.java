package Exconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crudoperation {

    private static Statement statement;
    private static Connection connection;

    static {
        connection = new connection().getConnection();
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertData(String name, String field, String city, String contact_no) {
        String query = "insert into stud (name, field, city, contact_no) values ('" + name + "', '" + field + "', '" + city + "', '" + contact_no + "')";
        try {
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateData(String name, String field, String city, String contact_no) {
        String query = "update stud set field = '" + field + "', city = '" + city + "', contact_no = '" + contact_no + "' where name = '" + name + "'";
        try {
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteData(String name) {
        String query = "delete from stud where name = '" + name + "'";
        try {
            int rowsAffected = statement.executeUpdate(query);
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getData() {
        String query = "select * from stud";
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("name") + ", " +
                                resultSet.getString("field") + ", " +
                                resultSet.getString("city") + ", " +
                                resultSet.getString("contact_no"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
