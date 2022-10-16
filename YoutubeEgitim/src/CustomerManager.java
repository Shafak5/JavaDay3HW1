
public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;
	//interfaceler referans tiptir
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	
	public void Save() {
		System.out.println("müşteri kaydedildi " );
	}
	
	public void Delete() {
		System.out.println("müşteri silindi " );
	}
	
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("kredi verildi");
	}

}
