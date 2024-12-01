package NewOne;

import java.sql.*;

public class JDBCCreateStatement {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER="root";
	static final String PASS="admin"; 
	
static Connection conn1=null;

	public static void main(String[] args) {
		
		try {
			conn1=DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt=conn1.createStatement();
				String sql= "select * from EmployeeDetails";
						
				ResultSet rs=stmt.executeQuery(sql);
					while(rs.next())
					{
						System.out.println("ID :"+rs.getInt(1));
						System.out.println("Name :"+rs.getString(2));
						System.out.println("LastName :"+rs.getString(3));
						System.out.println("Dep :"+rs.getString(4));
						System.out.println("Age :"+rs.getInt(5));
						System.out.println("Gender :"+rs.getString(6));
					}
			           
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
}
