package com.pitambar.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pitambar.dto.Account;
import com.pitambar.util.DBUtil;
import java.util.ArrayList;
import java.util.List;


public class AccountModel
{
	public List<Account> getAccounts(float lo,float up)
	{
		 List<Account> acc=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement("select * from Account where balance between ? and ? ");
			ps.setFloat(1,lo);
             ps.setFloat(2,up);
			rs=ps.executeQuery();
			if(rs.next())
			{
                  acc=new ArrayList<Account>();
			do
			{
			    
                  Account a=new Account();
				a.setAccno(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setBalance(rs.getFloat(3));
                acc.add(a);
			}while(rs.next());
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			DBUtil.close(rs,ps,con);
		}

		return acc;
	}
}