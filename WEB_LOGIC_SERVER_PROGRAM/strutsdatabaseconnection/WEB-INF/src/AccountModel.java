package com.pitambar.service;
import java.sql.*;
import java.util.*;
public class AccountModel{
	public List<AccountDTO> getAccount(float lower,float upper){
		AccountDTO acc = null;
		List<AccountDTO> al=null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = Connutil.getConnection();
			ps = con.prepareStatement("select * from account where balance between ? and ?");
			ps.setFloat(1,lower);
			ps.setFloat(2,upper);
			rs = ps.executeQuery();
			if(rs.next()){
				al = new ArrayList<AccountDTO>();
				do{
				  acc = new AccountDTO();
				  acc.setAccno(rs.getInt(1));
				  acc.setName(rs.getString(2));
				  acc.setBalance(rs.getFloat(3));
				  al.add(acc);
				}while(rs.next());
			}
		}
			catch(SQLException s){}
			finally{
				Connutil.close(rs,ps,con);
			}
			return al;		
	}
}