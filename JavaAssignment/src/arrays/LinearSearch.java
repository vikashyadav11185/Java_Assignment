package arrays;
import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter length of the Array = ");
		int n = scanner.nextInt();
     	int[] numbers = new int[n];
     	for(int i=0;i<n;i++)
     	{
     		System.out.println("Enter " + "element " +(i+1)  +" = ");
     		numbers[i] = scanner.nextInt();
     	}
     	System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is present in the array.");
        } else {
            System.out.println(search + " is not present in the array.");
        }
		scanner.close();
		
	}
	
}
