package NewOne;

import java.sql.*;


public class CallebleStatementStoreProc {
	static final String DB_URL="jdbc:mysql://localhost:3306/db";
	static final String USER="root";
	static final String PASS="admin"; 
	
	static Connection conn1=null;
	
	public static void main(String[] args)
	{
		try {
			conn1 = DriverManager.getConnection(DB_URL,USER,PASS);
			CallableStatement stmt=conn1.prepareCall("{call db.INSERTR3(?,?,?,?,?,?)}");
			
//			stmt.setInt(1,7);
//			stmt.setString(2, "Tamil");
//			stmt.setString(3, "Arasi");
//			stmt.setString(4,"Sales Excutive");
//			stmt.setInt(5, 25);
//			stmt.execute();
				
//			stmt.setInt(1,8);
//			stmt.setString(2, "Tamil");
//			stmt.setString(3, "Arasan");
//			stmt.setString(4,"Digital Sales");
//			stmt.setInt(5, 28);
//			stmt.execute();
			
			stmt.setInt(1,9);
			stmt.setString(2, "Vishwa");
			stmt.setString(3, "P");
			stmt.setString(4,"Java Devoloper");
			stmt.setInt(5, 21);
			stmt.setString(6,"Male");
			stmt.execute();
			
			
			
			System.out.println("Recorder Insert");
				
						
			           
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		}
	}
