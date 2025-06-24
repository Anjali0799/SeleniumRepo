package week3.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		
		System.out.println("Cash On Delivery option available in amazon");
	}

	@Override
	public void upiPayments() {
		
		System.out.println("UPI Payments option are also available in amazon");
	}

	@Override
	public void cardPayments() {
		
		System.out.println("All types of Cards Payments option are also available in amazon");
		
	}

	@Override
	public void internetBanking() {
		
		System.out.println("InternetBanking option are also available in amazon");
		
	}
	
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.RecordPaymentsDetails();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		
	}

	
		

	

}
