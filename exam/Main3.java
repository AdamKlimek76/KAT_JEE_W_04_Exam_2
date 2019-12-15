package exam;

import java.sql.*;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        System.out.println("Podaj id użytkownika, którego chcesz wybrać");
        Scanner scan = new Scanner(System.in);
        String userId = scan.next();

        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
                                     + "?useSSL=false&characterEncoding=utf8",
                             "root", "coderslab");
        ) {

            PreparedStatement preStmt =
                    conn.prepareStatement("SELECT * FROM users WHERE id = ?");
            preStmt.setString(1, userId);
            ResultSet rs = preStmt.executeQuery();

            while (rs.next()) {
                int id=rs.getInt("id");
                String userName = rs.getString("name");
                String userEmail = rs.getString("email");
                System.out.println(id + " " + userName + " " + userEmail);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
                                     + "?useSSL=false&characterEncoding=utf8",
                             "root", "coderslab");
        ) {

            PreparedStatement preStmt =
                    conn.prepareStatement("SELECT * FROM orders JOIN users ON orders.user_id = users.id WHERE users.id=?");
            preStmt.setString(1, userId);
            ResultSet rs = preStmt.executeQuery();

            while (rs.next()) {
                int ordersId=rs.getInt("orders.id");
                String ordersDescription = rs.getString("orders.description");
                double ordersPrice=rs.getDouble("orders.price");
                System.out.println(ordersId + " " + ordersDescription + " " + ordersPrice);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }






}
