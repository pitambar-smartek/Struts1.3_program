package com.pitambar.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
public class RegistrationService
{
	public boolean registerUser(String user,String pwd,String emid,String agr,String mob,String pof)
	{
		boolean flag=true;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pi");
			PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?,?)");

			ps.setString(1,user);
			ps.setString(2,pwd);
			ps.setString(3,emid);
			ps.setString(4,agr);
			ps.setString(5,mob);
			ps.setString(6,pof);
			System.out.println("agr="+agr+"pro"+pof+"mob"+mob+"user"+user+"pwd"+pwd+"email"+emid);
			int i=ps.executeUpdate();
			if(i!=1)
				flag=false;
		}catch(Exception e)
		{
		}

				return flag;
	}
}
