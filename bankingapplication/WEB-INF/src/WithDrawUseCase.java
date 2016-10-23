
import java.util.Scanner;
import com.pitambar.dao.AccountDAO;
import com.pitambar.dao.Account;
import com.pitambar.dao.AccountDAOImpl;
import com.pitambar.dao.DAOFactory;
public class WithDrawUseCase 
{
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account no=");
		int ano=s.nextInt();
		System.out.println("Enter the Amount to withdraw=");
		int amount=s.nextInt();

		AccountDAO dao=DAOFactory.getAccountDAO();
		Account acc=dao.findAccount(ano);
		if(acc==null)
			System.out.println("Enter wrong account number entered");
		else{
			float balance=acc.getBalance();
			if(balance>=amount)
			{
				balance=balance-amount;
				acc.setBalance(balance);
				dao.updateAccount(acc);
				System.out.println("collect the cash");
			}else{
				System.out.println("Insufficient fund");
			}
		}
	}
}
