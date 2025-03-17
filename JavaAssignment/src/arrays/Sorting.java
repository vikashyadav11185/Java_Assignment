package arrays;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter length of the Array = ");
			int n = sc.nextInt();
	     	int[] numbers = new int[n];
	     	for(int i=0;i<n;i++)
	     	{
	     		System.out.println("Enter " + "element " +(i+1)  +" = ");
	     		numbers[i] = sc.nextInt();
	     	}
	        
	        // Bubble Sort Algorithm
	        for (int i = 0; i < numbers.length - 1; i++) {
	            for (int j = 0; j < numbers.length - i - 1; j++) {
	                if (numbers[j] > numbers[j + 1]) {
	                    int temp = numbers[j];
	                    numbers[j] = numbers[j + 1];
	                    numbers[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        sc.close();
	}	
	
}
