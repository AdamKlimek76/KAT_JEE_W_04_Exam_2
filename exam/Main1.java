package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
	private static final String QUERY1 = "create table users\n" +
			"(\n" +
			"    id    INT NOT NULL AUTO_INCREMENT,\n" +
			"    name  VARCHAR(60),\n" +
			"    email  VARCHAR(60),\n" +
			"    password VARCHAR(60),\n" +
			"    PRIMARY KEY (id)\n" +
			"\n" +
			");";
	private static final String QUERY2 = "create table messages\n" +
			"(\n" +
			"    id    INT NOT NULL AUTO_INCREMENT,\n" +
			"    user_id INT NOT NULL,\n" +
			"    message  TEXT,\n" +
			"    PRIMARY KEY (id),\n" +
			"    FOREIGN KEY (user_id) REFERENCES users (id)\n" +
			"\n" +
			");";
	private static final String QUERY3 = "create table items\n" +
			"(\n" +
			"    id    INT NOT NULL AUTO_INCREMENT,\n" +
			"    name VARCHAR(40),\n" +
			"    description  TEXT,\n" +
			"    price DECIMAL(7,2),\n" +
			"    PRIMARY KEY (id)\n" +
			");";
	private static final String QUERY4 = "create table orders\n" +
			"(\n" +
			"    id    INT NOT NULL AUTO_INCREMENT,\n" +
			"    user_id INT NOT NULL,\n" +
			"    description  TEXT,\n" +
			"    created DATETIME,\n" +
			"    price DECIMAL(7,2),\n" +
			"    PRIMARY KEY (id),\n" +
			"    FOREIGN KEY (user_id) REFERENCES users (id)\n" +
			"\n" +
			");";
	private static final String QUERY5 = "create table items_orders\n" +
			"(\n" +
			"    id    INT NOT NULL AUTO_INCREMENT,\n" +
			"    item_id INT NOT NULL,\n" +
			"    order_id INT NOT NULL,\n" +
			"    PRIMARY KEY (id),\n" +
			"    FOREIGN KEY (item_id) REFERENCES items (id),\n" +
			"    FOREIGN KEY (order_id) REFERENCES orders (id)\n" +
			"\n" +
			");";
	
	public static void main(String[] args){
		try (Connection conn =
					 DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
									 + "?useSSL=false&characterEncoding=utf8",
							 "root", "coderslab");
			 Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(QUERY1);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (Connection conn =
					 DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
									 + "?useSSL=false&characterEncoding=utf8",
							 "root", "coderslab");
			 Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(QUERY2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (Connection conn =
					 DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
									 + "?useSSL=false&characterEncoding=utf8",
							 "root", "coderslab");
			 Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(QUERY3);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (Connection conn =
					 DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
									 + "?useSSL=false&characterEncoding=utf8",
							 "root", "coderslab");
			 Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(QUERY4);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try (Connection conn =
					 DriverManager.getConnection("jdbc:mysql://localhost:3306/exam2"
									 + "?useSSL=false&characterEncoding=utf8",
							 "root", "coderslab");
			 Statement stat = conn.createStatement()
		) {
			stat.executeUpdate(QUERY5);
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}


