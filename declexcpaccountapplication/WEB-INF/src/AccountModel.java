package com.pitambar.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pitambar.dto.Account;
import com.pitambar.util.DBUtil;
import com.pitambar.exception.AccountNotFoundException;
import com.pitambar.exception.ProcessingException;
public class AccountModel
{
	public Account getAccount(int accno)throws AccountNotFoundException,ProcessingException
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
			else
				throw new AccountNotFoundException();
		}catch(SQLException e){
			throw new ProcessingException();
		}
		finally{
			DBUtil.close(rs,ps,con);
		}

		return acc;
	}
}