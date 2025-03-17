package basicJava;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int number = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        scanner.close();
	}
}
