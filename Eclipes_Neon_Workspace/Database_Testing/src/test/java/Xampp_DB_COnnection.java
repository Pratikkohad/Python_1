import java.sql.*;

public class Xampp_DB_COnnection
{
	public static void main(String[] args) 
	{
		// Declaring all variables
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		Connection conn = null;
		String username = "root";
		String password = "";
//		String dbName = "testing";
//		String serverUrl = "jdbc:mysql://localhost:3306/ " + dbName + "";
//		Statement stmt = null;
//		String Tablename= "tracker_dell_28th_may_2021";
//		String checkDb = "SELECT * FROM " + Tablename + "";
		
		
		
		 	String serverUrl = "jdbc:mysql://localhost:3306";
	        Statement stmt = null;
	        String dbName = "testing";
	        String checkDb = "SELECT SCHEMA_NAME FROM `information_schema`.`SCHEMATA` WHERE `SCHEMA_NAME` = '" + dbName + "'";
	        String SQL_Qurry = "SELECT * FROM " + dbName + "";
	        
		ResultSet rs;
		boolean dbFound = false;

		try 
		{
			//check jdbc driver (mysql connector / j). Make sure the connector is configured correctly (added to libraries) before checking it.
			Class.forName(jdbcDriver);
			System.out.println("Driver Loaded");
		} 
		catch (ClassNotFoundException ex) 
		{
			System.out.println("Driver Failed To Load");
			System.out.println(ex.getMessage());
		}

		try 
		{
			//connecting to xampp server (Apache Server)
			conn = DriverManager.getConnection(serverUrl, username, password);
			System.out.println("Connected To Server Successfully");
		} 
		catch (SQLException ex) 
		{
			System.out.println("Failed To Connect To Server Successfully");
			System.out.println(ex.getMessage());

		}

		try 
		{
			// Output sql query for checking if the database exists
			System.out.println("Check if database exists query - " + checkDb);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(checkDb);
			
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int columnsNumber = rsmd.getColumnCount();
//			
//			while (rs.next())
//			{
//				for(int i = 1 ; i <= columnsNumber; i++)
//				{
//
//					System.out.print(rs.getString(i) + " "); //Print one element of a row
//
//				}
//
//				System.out.println();//Move to the next line to print the next row.
		
			if (rs.next()) 
			{
				//If the database is found in the information_schema, set the boolean value to true
				dbFound = true;


			}
			
			//If the database is no found create new database
			if (!dbFound)
			{
			
				String createNewDatabase = "CREATE DATABASE IF NOT EXISTS " + dbName + "";
				//Display database creation query in the console section.
				System.out.println("Database creation query - " + createNewDatabase);
				//Execute database creation query and store the result in integer variable. Expected reults are 0 and 1.
				int createdb = stmt.executeUpdate(createNewDatabase);
				 rs = stmt.executeQuery(SQL_Qurry);
				 ResultSetMetaData rsmd = rs.getMetaData();
					int columnsNumber = rsmd.getColumnCount();
					if(checkDb.equals(dbName)) {
						while (rs.next()) {
							for (int i = 1; i <= columnsNumber; i++) {

								System.out.print(rs.getString(i) + " "); //Print one element of a row

							}

							System.out.println();//Move to the next line to print the next row.

						}
					}
			}
		}
		catch (SQLException ex) 
		{
			System.out.println("Error " + ex.getMessage());
		}

	}
}



