package com.pitambar.service;
import javax.servlet.*;
import javax.naming.*;
import java.sql.*;
import javax.sql.DataSource;
public class Connutil{
	private static DataSource ds;
	static{
		try{
			InitialContext ic = new InitialContext();
			ds = (DataSource)ic.lookup("java:comp/env/myds");
		}catch(Exception e){
		}
	}
	public static Connection getConnection()throws SQLException{
		return ds.getConnection();
	}
	public static void close(ResultSet rs,PreparedStatement ps,Connection conn){
		try{
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}