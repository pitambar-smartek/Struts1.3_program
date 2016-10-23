package com.pitambar.service;
import java.sql.*;
public class AccountModel{
	public AccountDTO getAccount(int ano){
		AccountDTO acc = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = Dbutil.getConnection();
			ps = con.prepareStatement("select * from account where accno=?");
			ps.setInt(1,ano);
			rs = ps.executeQuery();
			if(rs.next()){
				acc = new AccountDTO();
				acc.setAccno(ano);
				acc.setName(rs.getString(2));
				acc.setBalance(rs.getFloat(3));
			}
		}
			catch(SQLException s){}
			finally{
				Dbutil.close(con,ps,rs);
			}
			return acc;		
	}
}