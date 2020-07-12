import java.sql.*;
class firstApp
{
	public static void main (String [] args)
	{
		try {
		String url ="jdbc:mysql://localhost/java";
		String username = "root";
		String password = "";
		Connection myConnection = DriverManager.getConnection(url,username,password);
		System.out.println("parimal is best\n\n");
		Statement myStmt = myConnection.createStatement();
		ResultSet myResult = myStmt.executeQuery("select * from emp");
		while(myResult.next()){
			System.out.println(myResult.getString("num"));
		}

		}
		catch (Exception e) {
		System.out.println(e);
		}
	}
}
// javac firstApp.java
// java -cp .:mysql-connector-java-8.0.20.jar firstApp