package com.pitambar.model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.pitambar.util.DBUtil;
import java.sql.Connection;
public class RegistrationService
{
           PreparedStatement ps=null;
	public boolean registerUser(String user,String pwd,String emid)
	{
		boolean flag=true;
		Connection con=null;
                                try{
                                         con=DBUtil.getConnection();
                                       ps=con.prepareStatement("insert into register values(?,?,?)");
                                       ps.setString(1,user);
                                       ps.setString(2,pwd);
                                      ps.setString(3,emid);
                                     ps.executeUpdate();
                                   }catch(SQLException e)
                                       {
                                          flag=false;
                                       }
                                     finally{
                                                   try{
                                                          if(con!=null)
                                                                con.close();
                                                          if(ps!=null)
                                                                 ps.close();
                                                       }catch(Exception e)
                                                             {
                                                              }
                                                }
		return flag;
         }
}	