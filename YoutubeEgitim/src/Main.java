
public class Main {
	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;

		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1 = sayilar2;

		System.out.println(sayilar1[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Save();

		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("ankara");
		customer.setNationalIdentity("123456");

		// IoC Container
		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.Save();
		customerManager.Delete();

		Company company = new Company();
		company.setTaxNumber("252343");
		company.setCompanyName("hp");
		company.setId(232);

		CustomerManager customerManager2 = new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager2.GiveCredit();

		Person person = new Person();
		person.setFirstName("ferhat");
		person.setLastName("kara");
	}
}
