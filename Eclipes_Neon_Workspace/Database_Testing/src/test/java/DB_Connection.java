import java.io.IOException;
import java.sql.*;

public class DB_Connection extends Test_Base
{
//    private static String SQLDriver= "com.mysql.cj.jdbc.Driver";
//    private static String Username = "root";
//    private static String Password= "";
//    private static String Link ="jdbc:mysql://localhost:3306/testing";
//    private static String SQL_Qurry = "SELECT* FROM tracker_dell_28th_may_2021";

    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            Class.forName(prop.getProperty("SQLDriver"));
            Connection conn = DriverManager.getConnection(prop.getProperty("Link"),prop.getProperty("Username"), prop.getProperty("Password"));
            System.out.println("Connecting ");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(prop.getProperty("SQL_Qurry"));
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rs.next())
            {
                for(int i = 1 ; i <= columnsNumber; i++)
                {
                    System.out.print(rs.getString(i) + "  "); //Print one element of a row
                }
                System.out.println();//Move to the next line to print the next row.
            }
        }
        catch (SQLException throwables)
        {

            throwables.printStackTrace();
        }

    }
    }
