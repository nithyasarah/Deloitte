
public class Payment {

	static Payment payment=new Payment();

	private Payment() {
		System.out.println("Object created");
	}
	 
	public static Payment getPaymentobject()
	{
		return payment;
		
		
	}
	public void pay(int amount)
	{
		
		System.out.println("Payment done is "+amount);
	}
	
	
}
