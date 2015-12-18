package day29;

public class Hsbc implements Bank{

	public static void main(String[] args) {
		Hsbc h=new Hsbc();
		h.debit();
		h.credit();
		h.moneyTransfer();
	}
	public void debit() {
		System.out.println("Debiting procedure");
	}
	
	public void credit() {
		System.out.println("Credit");
	}

	public void moneyTransfer() {
		System.out.println("Monet transfer policy");
		
	}

}
