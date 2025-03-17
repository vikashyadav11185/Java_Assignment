package dataTypesAndOperators;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion (1-2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
                break;
                
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = (fahrenheitInput - 32) * 5/9;
                System.out.printf("%.2f°F = %.2f°C\n", fahrenheitInput, celsiusOutput);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
	}

}
