import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
    public Connection connect_to_db( String dbname, String user, String password ){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname,user,password );
            System.out.println("Connected to the PostgresSQL server successfully.");
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
}
