package controlFlowStatements;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter first number: ");
	    double num1 = scanner.nextDouble();
	    
	    System.out.print("Enter second number: ");
	    double num2 = scanner.nextDouble();
	    
	    System.out.print("Enter third number: ");
	    double num3 = scanner.nextDouble();
	    
	    double largest;
	    
	    if (num1 >= num2 && num1 >= num3) {
	        largest = num1;
	    } else if (num2 >= num1 && num2 >= num3) {
	        largest = num2;
	    } else {
	        largest = num3;
	    }
	    
	    System.out.println("The largest number is: " + largest);
	    
	    scanner.close();
	}
	
}
