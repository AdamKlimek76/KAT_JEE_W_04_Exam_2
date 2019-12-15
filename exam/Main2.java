package exam;

public class Main2 {

	private static final String QUERY1 = "SELECT * FROM items WHERE price>50;";
	private static final String QUERY2 = "INSERT INTO items(name, description) VALUES ('product 1', 'desc 1');";
	private static final String QUERY3 = "DELETE FROM users WHERE id=7;";
	private static final String QUERY4 = "SELECT * FROM users JOIN messages ON users.id = messages.user_id ORDER BY users.name ASC;";
	private static final String QUERY5 = "SELECT MAX(items.price) FROM items JOIN items_orders ON items.id = items_orders.item_id WHERE items_orders.order_id=2;";
	private static final String QUERY6 = "SELECT * FROM orders WHERE DATE(created)='2017-11-12';";
	private static final String QUERY7 = "INSERT INTO items_orders (item_id, order_id) VALUES (2, 6);";
	
}
