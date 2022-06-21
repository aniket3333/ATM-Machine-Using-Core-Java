import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		AtmOpe op=new AtmOpe();
		int atmnumber=12345;
		int pin=123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter atmnumber");
		int atmNumber=sc.nextInt();
		System.out.println("Enter pin");
		int pinn=sc.nextInt();
		if(atmnumber==atmNumber && pin==pinn)
		{
			while (true)
			{
				System.out.println("1. Available Balance\n2. withdraw amount\n3. Deposite amount\n4. Mini Statement\n5. Exit");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				if (ch==1)
				{
					op.viewBalance();
				}
				else if (ch==2)
				{
					System.out.println("Enter amount to withdraw");
					double withdrawAmount=sc.nextDouble();
					op.withdraw(withdrawAmount);
				}
				else if (ch==3)
				{
					System.out.println("Amount to Deposite :");
					double depositeAmount=sc.nextDouble();
					op.deposite(depositeAmount);
				}
				else if (ch==4)
				{
					op.viewMiniStataement();
				}
				else if(ch==5)
				{
					System.out.println("Collect your Atm card\n Thank You for using ATM machine");
					
				}
				else {
                     System.out.println("Enter correct choice");
				}
			}
		}
		else 
		{
			System.out.println("Not validate");
		}
		
	}

}
