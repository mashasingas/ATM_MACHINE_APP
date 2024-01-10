import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		AtmOperation test=new AtmOperationImpl();
		int atmNumber=12345;
		int atmPin=123;
		BufferedReader stin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER ATM NUMBER");
	    int	atmN=Integer.parseInt(stin.readLine());
		System.out.println("ENTER PIN NUMBER");
		int atmP=Integer.parseInt(stin.readLine());
		System.out.println("Select Options Below");
		
		if(atmNumber==atmN && atmPin==atmP) {
			while(true) {
				System.out.println("1.View available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View min statement\n5.Exit");
				System.out.println("Enter Choice :");
				int choice=Integer.parseInt(stin.readLine());
				if(choice==1) {
					test.viewBalance();
					
				}else if(choice==2) {
					System.out.println("Enter The amount You want to Withdraw");
					double withdrawAmount=Double.parseDouble(stin.readLine());
					test.withdrawAmount(withdrawAmount);
					
				}
				else if(choice==3) {
					System.out.println("Enter Deposit Amount");
					double depositAmount=Double.parseDouble(stin.readLine());
					test.depositAmount(depositAmount);
					
				}
				else if(choice==4) {
					
				}else if(choice==5) {
					System.out.println("Collect your Card\nThank you for using ATM machine");
					System.exit(0);
				}
				else {
					System.out.println("Please Select the Correct Choice");
				}
				
			}
		}else {
			System.out.println("Incorrect AMT number or Pin");
			System.exit(0);
		}
		

	} 

}
