
import java.util.Scanner;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAOImpl;
import com.pitambar.dao.DAOFactory;
public class ClosingUseCase 
{
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account no=");
		int ano=s.nextInt();
		

		AccountDAO dao=DAOFactory.getAccountDAO();
		boolean flag=dao.deleteAccount(ano);
		if(flag)
			System.out.println("The account is closed successfully");
		else{
			
			
				System.out.println("wrong account number is entered");
			}
		
	}
}
