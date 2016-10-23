package com.pitambar.service;
import java.sql.*;

public class RegModel{
	public boolean isRegistered(RegAccount la){
		Connection con = null;
		PreparedStatement ps = null;
		boolean flag = false;
		try{
			con = Connutil.getConnection();
			ps = con.prepareStatement("insert into registration values(?,?,?)");
			ps.setString(1,la.getName());
			ps.setString(2,la.getPassword());
			ps.setString(3,la.getEmailid());
			ps.executeUpdate();
			flag=true;
		}
		catch(SQLException s){            
		}
		finally{
			Connutil.close(null,ps,con);
		}
		return flag;
	}
}