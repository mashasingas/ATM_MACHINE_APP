
public class AtmOperationImpl implements AtmOperation {
	  ATM obj=new ATM();

	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		 System.out.println("Available balance is :"+ obj.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(obj.getBalance()>=withdrawAmount) {
		System.out.println(withdrawAmount+"Amount sucessfull withdrawn");
		obj.setBalance(obj.getBalance()-withdrawAmount);
		viewBalance();
		}else {
			System.out.println("Insuffient Funds");
		}
			
		
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(depositAmount+"Amount Successful deposited");
		obj.setBalance(obj.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMinStatement() {
		// TODO Auto-generated method stub
		
	}

}
