
public class Student implements Comparable<Student> {

	String city;
	Double marks;
	String name;
	int rollno;

	public Student() {

		// TODO Auto-generated constructor stub
	}

	public Student(String city, Double marks, String name, int rollno) {

		this.city = city;
		this.marks = marks;
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [city=" + city + ", marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return this.rollno=o.rollno;
//	}

}
