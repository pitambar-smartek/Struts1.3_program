package com.pitambar.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Dbutil{
	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e){
		}
	}
	public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mohan","oracle");
	}
	public static void close(Connection con,PreparedStatement ps,ResultSet rs){
		try{
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
			    con.close();
		}
		catch(SQLException s){}
	}
}
