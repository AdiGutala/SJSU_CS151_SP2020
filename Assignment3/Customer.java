
public class Customer extends Person {
	
	private String paymentMethod;
	
	
	public Customer(String first, String last) {
		super(first, last);
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String first, String last, Address add) {
		super(first, last, add);
	}
	
	public String getpaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(String pMethod) {
		paymentMethod = pMethod;
	}
	
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + " " + this.getAge() + " " + this.getSsn()
		+ " " + this.getIdNumber() + " " + this.isAccomodation() + " " + this.getAddress() + " " + this.getpaymentMethod();
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public void makePayment() {
		System.out.println(this.getpaymentMethod());
	}
	

	
}
