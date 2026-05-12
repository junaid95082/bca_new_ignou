import java.sql.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final String url = "jdbc:mysql://localhost:3306/";
        final String user = "root";
        final String password = "aman";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS bca4");
        stmt.execute("USE bca4");
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INT, name VARCHAR(100), marks INT)");

        // System.out.print("Enter ID: ");
        // int id = sc.nextInt();
        // System.out.print("Enter Name: ");
        // String name = sc.next();
        // System.out.print("Enter Marks: ");
        // int marks = sc.nextInt();

        // stmt.executeUpdate("insert into student values(" + id + ",'" + name + "'," +
        // marks + ")");

        ResultSet rs = stmt.executeQuery("select * from student");

        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.println();
        }
    }
}