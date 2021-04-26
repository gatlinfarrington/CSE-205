import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;
		
		try {
			//CONNECTION TO THE TABLE
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usersdb","gatlinfarrington", "password");
			System.out.println("Connected to the database.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		
		//MAKING A TABLE
		try {
			stmt = c.createStatement();
			String sql = "CREATE TABLE COMPANY " + 
			"(ID INT PRIMARY KEY NOT NULL, " +
			"NAME TEXT NOT NULL, " +
			"AGE INT NOT NULL, " +
			"ADDRESS CHAR(50), " +
			"SALARY REAL)";
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
			System.out.println("Table has been created.");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		/*
		
		//INSERT
		try {
			c.setAutoCommit(false);
			stmt = c.createStatement();
			String sql = "INSERT INTO COMPANY(" +
			"ID,NAME,AGE,ADDRESS,SALARY) " +
			"VALUES(1, 'Mike', 37, 'California', 20000.00);";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO COMPANY(" +
				"ID,NAME,AGE,ADDRESS,SALARY) " +
				"VALUES(2, 'Jeff', 24, 'Arizona', 35000.00);";
				stmt.executeUpdate(sql);
			sql = "INSERT INTO COMPANY(" +
				"ID,NAME,AGE,ADDRESS,SALARY) " +
				"VALUES(3, 'Tina', 21, 'Nevada', 157000.00);";
				stmt.executeUpdate(sql);
			stmt.close();
			c.commit();
			c.close();
			System.out.println("Just added elements to table.");
			}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		
		
		//SELECT
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select name, age from company where address = 'Arizona';");
			while(rs.next()) {
//				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
//				String address = rs.getString("Address");
//				float salary = rs.getFloat("salary");
				System.out.println("\n Name: " + name + "\n Age: "+ age);
				System.out.println();
			}
			System.out.println("DONE");
			rs.close();
			stmt.close();
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		
		
		//UPDATE
		try {
			c.setAutoCommit(false);
			stmt = c.createStatement();
			String sql = "Update COMPANY set SALARY = 30000.00 where ID = 3;";
			stmt.executeUpdate(sql);
			c.commit();
			
			ResultSet rs = stmt.executeQuery("select * from company;");
			while(rs.next()) {
//				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
//				String address = rs.getString("Address");
				float salary = rs.getFloat("salary");
				System.out.println("\n Name: " + name + "\n Age: "+ age + "\n salary: " + salary);
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		*/
		
		//DELETE
		try {
			c.setAutoCommit(false);
			stmt = c.createStatement();
			String sql = "DELETE from COMPANY where ID = 3;";
			stmt.executeUpdate(sql);
			c.commit();
			
			ResultSet rs = stmt.executeQuery("select * from company;");
			while(rs.next()) {
//				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
//				String address = rs.getString("Address");
				float salary = rs.getFloat("salary");
				System.out.println("\n Name: " + name + "\n Age: "+ age + "\n salary: " + salary);
				System.out.println();
			}
			rs.close();
			stmt.close();
			c.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
		}
		
	}
}