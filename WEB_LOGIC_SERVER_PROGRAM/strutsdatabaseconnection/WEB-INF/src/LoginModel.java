package com.pitambar.service;
import java.sql.*;
public class LoginModel{
	public boolean isAuthenticated(String user,String pwd){
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = Connutil.getConnection();
			ps = con.prepareStatement("select * from registration where name=? and password=?");
			ps.setString(1,user);
			ps.setString(2,pwd);
			rs = ps.executeQuery();
			if(rs.next())
				flag = true;
		}
		catch(SQLException e){
		}
		finally{
			Connutil.close(rs,ps,con);
		}
		return flag;
	}
}