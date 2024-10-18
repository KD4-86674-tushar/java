
public class Employee {
	
	String firstName;
	String lastName;
	double salary;
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
		if(salary<0) {
			this.salary=0;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double yearlySalary() {
		
		return salary*12;
		
		
	}
	
public double raiseSalary() {
		double raiseSalary =salary + salary*0.1;
		return raiseSalary*12;
		
		
		
		
	}
}
