package com.pitambar.model;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.pitambar.util.DBUtil;
import java.sql.ResultSet;
public class LoginModel
{
                Connection con=null;
                 PreparedStatement ps=null;
                  ResultSet rs=null;
	public boolean isAutenticated(String user,String pwd)
	{
		boolean flag=false;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select * from register where username=? and password=?");
			ps.setString(1,user);
			ps.setString(2,pwd);
			rs=ps.executeQuery();
			if(rs.next())
			{
				flag=true;
			}
		}catch(SQLException e)
		{
			//flag=false;
		}
		finally{
			try{
			if(rs!=null)
				rs.close();
			if(rs!=null)
				ps.close();
			if(rs!=null)
				con.close();
			}catch(SQLException e)
			{
			}
				
		}
		
		return flag;
	}
}