package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal){
		this.customerDal = customerDal;
		
	}
	public void add() {
		// i� kodlar� yaz�l�r
		customerDal.add();
		
		
	}

}
