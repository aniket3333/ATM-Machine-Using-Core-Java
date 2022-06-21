import java.util.*;
import java.util.Map;
public class AtmOpe implements AtmOperations{
	Working atm=new Working();
	Map<Double,String> ministmt=new HashMap<>();
	//@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
	}
	//@Override
	public void withdraw(double withdrawAmount)
	{
		if(withdrawAmount%500==0)
		{
		if(withdrawAmount<=atm.getBalance())
		{
			ministmt.put(withdrawAmount,"Amount Withdraw");
		System.out.println("Collect The Cash "+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewBalance();
		}
		
		else
		{
			System.out.println("INSUFFICIENT BALANCE!!");
		}
		}
		else
		{
			System.out.println("Please Withdraw  amount in multiple of 500 : ");
		}
	}
	//@Override
	public void deposite(double depositeAmount) {
		ministmt.put(depositeAmount,"Amount Deposited");
		System.out.println(depositeAmount+"Deposited Succesfully !!");
		atm.setBalance(atm.getBalance()+depositeAmount);
		viewBalance();
	}
	public void viewMiniStataement()
	{
		for(Map.Entry<Double,String> m:ministmt.entrySet()){
			System.out.println(m.getKey()+""+m.getKey());
		}
	}
	@Override
	public void viewbalance() {
		// TODO Auto-generated method stub
		
	}
	
 
}
