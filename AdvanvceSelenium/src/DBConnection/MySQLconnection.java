package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;



public class MySQLconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection connection=	DriverManager.getConnection("jdbc:sqlserver://35.213.140.173:22217;databaseName=GQ_FlightEngine_PG1A_Staging;user=GQ-QATestUser;password=FHds24312bfhj@sghwsersnhjdcbGEYG;encrypt=false;");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM dbo.UserLogins WHERE LoginName LIKE '%Ling%'");
	  	while(resultSet.next()) {
	  		System.out.println("LoginName:"+resultSet.getString("Loginname")+"  Password :"+resultSet.getString("Password"));
	  	}
	  	
	}
}
