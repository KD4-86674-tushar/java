import java.util.Scanner;

public class inpt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first double value - ");
        if (sc.hasNextDouble() && !sc.hasNextInt()) 
        {
        	double n1 = sc.nextDouble();
        	System.out.println("Enter second double value");
        	if(sc.hasNextDouble() && !sc.hasNextInt())
        	{
        		double n2 = sc.nextDouble();
        		double avg = (n1+n2)/2;
        		System.out.println("Average of 2 double values = " + avg);
        		return;
        	}
        	else
        	{
        		System.out.println("Second number is not a double !!");
        		return;
        	}
        }
        else
    	{
    		System.out.println("First number is not a double !!");
    		return; 
    	}
    }
}