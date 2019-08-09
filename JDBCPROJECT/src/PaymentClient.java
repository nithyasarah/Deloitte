
public class PaymentClient {

	
public static void main(String[] args) {
	
	Payment payment1=Payment.getPaymentobject();
	Payment payment2=Payment.getPaymentobject();
	Payment payment3=Payment.getPaymentobject();
	payment1.pay(100);
	payment2.pay(5600);
	payment3.pay(1800);
	
}
}
