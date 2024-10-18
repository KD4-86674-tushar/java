import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Part Number");
		String partnumber = sc.next();
		System.out.println("Enter Part Discription");
		String partdiscription = sc.next();
		System.out.println("Enter Quantity");
		int quntity = sc.nextInt();
		System.out.println("Enter Price ");
		double price = sc.nextDouble();
		
		InvoiceTest t = new InvoiceTest(partdiscription, partdiscription, quntity, price);
		System.out.println("Calculation = " +t.display());
	}
	

}
