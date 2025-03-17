package arrays;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        double[] numbers = new double[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        
        double average = sum / size;
        
        System.out.println("Average of array elements: " + average);
        
        scanner.close();
	}

}
