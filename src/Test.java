import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args){
		Connection conn = null;
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/pos?" +
		                                   "user=kbethalam&password=kbethalam");

		    // Do something with the Connection

		   
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
