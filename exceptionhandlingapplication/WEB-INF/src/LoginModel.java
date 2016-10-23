package com.pitambar.model;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.pitambar.util.DBUtil;
import java.sql.ResultSet;
import com.pitambar.exception.LoginFailedException;
import com.pitambar.exception.ProcessingException;
public class LoginModel
{
                Connection con=null;
                 PreparedStatement ps=null;
                  ResultSet rs=null;
	public void isAutenticated(String user,String pwd)throws LoginFailedException,ProcessingException
	{
		
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select * from register where username=? and password=?");
			ps.setString(1,user);
			ps.setString(2,pwd);
			rs=ps.executeQuery();
			if(!rs.next())
			{
				throw new LoginFailedException();
			}
		}catch(SQLException e)
		{
			throw new ProcessingException();
		}
		finally{
			DBUtil.close(rs,ps,con);
				
		}	
	}
			
			
}