import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StdNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

//class StdCityComparator implements Comparator<Student> {
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.city.compareTo(o2.city);
//	}
//}

class StdCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.city.compareTo(o2.city);
	}
	
}

class StdMarksComparatorAsc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o1.marks, o2.marks);
	}
}
public class StudentTest {
	
	

	

	static int menu(Scanner sc){
		int choice;
		System.out.println("1. sorted_city,"
				+ "2. sorted_marks,  "
				+ "3. sorted_name,"
				+ "4. sorted_rollno	");
		choice = sc.nextInt();
		return choice;
		
	}
	
	
	public static void displayAllEmployees(Student[] arr) {
		System.out.println("*************************");
		for (Student student : arr)
			System.out.println(student);
		System.out.println("*************************");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		Comparator<Student> comparator;
		arr[0] = new Student("Mumbai", 100.0, "Mukesh", 1);
		arr[1] = new Student("Jalgaon",90.0, "Anil", 2);
		arr[2] = new Student("Pune",70.0, "Suresh", 4);
		arr[3] = new Student("Karad",80.0, "Sham", 5);
		arr[4] = new Student("Ich",60.0, "Ram", 3);

	

		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
//			case 1:
//				displayAllEmployees(arr);
//				break;
			
			case 1:
				comparator = new StdCityComparator();
				Arrays.sort(arr, comparator);
				displayAllEmployees(arr);
				break;
			case 2:
				comparator = new StdMarksComparatorAsc();
				Arrays.sort(arr, comparator);
				displayAllEmployees(arr);
				break;
			case 3:
				comparator = new StdNameComparator();
				Arrays.sort(arr, comparator);
				displayAllEmployees(arr);
				break;
			case 4:
				Arrays.sort(arr);
				displayAllEmployees(arr);
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
		}

	}

}

