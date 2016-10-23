package com.pitambar.model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.pitambar.util.DBUtil;
import java.sql.Connection;
import com.pitambar.dto.Register;

public class RegistrationService
{
          
	public boolean registerUser(Register r)
	{
		boolean flag=true;
		Connection con=null;
		 PreparedStatement ps=null;
                                try{
                                         con=DBUtil.getConnection();
                                       ps=con.prepareStatement("insert into register values(?,?,?)");
                                       ps.setString(1,r.getUsername());
                                       ps.setString(2,r.getPassword());
                                      ps.setString(3,r.getEmailid());
                                     ps.executeUpdate();
                                   }catch(SQLException e)
                                       {
                                          flag=false;
                                       }
                                     finally{
                                                  DBUtil.close(null,ps,con);
                                                }
		return flag;
         }
}	