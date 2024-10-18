import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String firstName = sc.next();
		System.out.println("Enter Last Name");
		String lastName = sc.next();

		System.out.println("Enter Salary");
		int salary = sc.nextInt();

		
		Employee e= new Employee(firstName, lastName, salary);
		System.out.println("yearlySalary = " +e.yearlySalary());
		
		
		Employee e2 = new Employee(firstName, lastName, salary);
		System.out.println("RaiseSalary = " +e2.raiseSalary());

		
	}

}
