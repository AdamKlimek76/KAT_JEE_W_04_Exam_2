package exam;

import java.sql.*;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        System.out.println("Zapisywanie danych do tabeli items");
        System.out.println("Podaj nazwę");
        Scanner scanner = new Scanner(System.in);
        String itemsName = scanner.nextLine();
        System.out.println("Podaj opis");
        Scanner scanner1=new Scanner(System.in);
        String itemsDescription = scanner1.nextLine();
        System.out.println("Podaj cenę");
        Scanner scanner2=new Scanner(System.in);
        while(!scanner2.hasNextDouble()){
            System.out.println("Cena musi być liczbą");
            scanner2.next();
        }
        double itemsPriceDouble=scanner2.nextDouble();
        String itemsPrice=Double.toString(itemsPriceDouble);

        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
                                     + "?useSSL=false&characterEncoding=utf8",
                             "root", "coderslab");
        ) {

            PreparedStatement preStmt =
                    conn.prepareStatement("INSERT INTO items (name, description, price) VALUES (?, ?, ?)");
            preStmt.setString(1, itemsName);
            preStmt.setString(2, itemsDescription);
            preStmt.setString(3, itemsPrice);
            preStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



    }
