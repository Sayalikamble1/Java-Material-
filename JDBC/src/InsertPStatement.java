import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPStatement {
    private static final String INSERT_USER_SQL = "INSERT INTO user" +
        "  (ID, Name, Email, Country) VALUES " +
        " (?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
        InsertPStatement createTableExample = new InsertPStatement();
        createTableExample.insertRecord();
    }

    public void insertRecord() throws SQLException 
    {
        System.out.println(INSERT_USER_SQL);
      
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/pgdac", "root", "root");

     
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Namrata");
            preparedStatement.setString(3, "nssharma@gmail.com");
            preparedStatement.setString(4, "Korea");
         

            System.out.println(preparedStatement);
      
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) 
        {

     
            printSQLException(e);
        }

 
    }

    public static void printSQLException(SQLException ex) 
    {
        for (Throwable e: ex) 
        {
            if (e instanceof SQLException) 
            {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null)
                {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}