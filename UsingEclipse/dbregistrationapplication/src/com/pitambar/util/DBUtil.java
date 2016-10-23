package com.pitambar.util;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;

public class DBUtil
{
static DataSource ds;
  static{
          try{
                InitialContext ic=new InitialContext();
                 ds=(DataSource)ic.lookup("java:comp/env/myds");
               }catch(Exception e)
                  {
                  }
         }
public static Connection getConnection()throws SQLException
{
    Connection con=null;
           if(ds!=null)
	{
                con= ds.getConnection(); 
	}
          else 
	{
                  throw new SQLException();
	}
  return con;
}
public static void close(ResultSet rs,PreparedStatement ps,Connection con)
	{
	try{
	if(rs!=null)
		rs.close();
	if(ps!=null)
		ps.close();
	if(con!=null)
		con.close();
	}catch(SQLException e)
		{
		}
	}
}                

