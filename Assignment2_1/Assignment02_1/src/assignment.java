import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Number= " +a);
//		System.out.println("Number= " + toBinaryString(a));

		String b = Integer.toBinaryString(a);

		System.out.println("Number= " +b);
		
		String c = Integer.toOctalString(a);
		System.out.println("Number= " +c);
		
		String d = Integer.toHexString(a);

		System.out.println("Number= " +d);



	}

}
