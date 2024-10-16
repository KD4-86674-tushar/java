import java.util.Scanner;

public class Assignment02_2 {

	public static int menu() {

		System.out.println("1 Dosa = 10");
		System.out.println("2 Samosa = 10");

		System.out.println("3 Idli = 10");
		System.out.println("4 Vadapaw = 10");
		System.out.println("5 Misal = 10");
		System.out.println("6 Generate Bill");
		System.out.println("Enter menu");

		Scanner sc = new Scanner(System.in);
		int Menu = sc.nextInt();
//		System.out.println("Enter Quantity");
//		int quantity=  sc.nextInt();
		return Menu;

	}

	public static void main(String[] args) {
//		System.out.println("Enter menu");
//
//		Scanner sc = new Scanner(System.in);
//		int Menu=  sc.nextInt();
//		System.out.println("Enter Quantity");
//		int quantity=  sc.nextInt();
		int choice;
		int sum = 0;
		int quantity;
		while ((choice = menu()) != 0) {
			System.out.println("Enter Quantity");
			Scanner sc = new Scanner(System.in);

			switch (choice) {
			case 1:
				System.out.println("Enter Quantity");
				quantity = sc.nextInt();

				sum = sum + quantity * 10;
				break;

			case 2:
				System.out.println("Enter Quantity");
				quantity = sc.nextInt();

				sum = sum + quantity * 10;
				break;
			case 3:
				System.out.println("Enter Quantity");
				quantity = sc.nextInt();

				sum = sum + quantity * 10;
				break;

			case 4:
				System.out.println("Enter Quantity");
				quantity = sc.nextInt();

				sum = sum + quantity * 10;
				break;

			case 5:
				System.out.println("Enter Quantity");
				quantity = sc.nextInt();

				sum = sum + quantity * 10;
				break;

			case 6:
				System.out.println("Bill= " + sum);

			}

		}

	}
}
