package com.pitambar.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pitambar.dto.Account;
import com.pitambar.util.DBUtil;
public class AccountModel
{
	public Account getAccount(int accno)
	{
		Account acc=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select * from Account where accno=?");
			ps.setInt(1,accno);
			rs=ps.executeQuery();
			if(rs.next())
			{
			    acc=new Account();
				acc.setAccno(rs.getInt(1));
				acc.setName(rs.getString(2));
				acc.setBalance(rs.getFloat(3));
			}
		}catch(SQLException e){
		}
		finally{
			DBUtil.close(rs,ps,con);
		}

		return acc;
	}
}