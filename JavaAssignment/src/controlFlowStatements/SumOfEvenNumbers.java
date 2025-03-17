package controlFlowStatements;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
        int i = 1;
        
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        
        System.out.println("Sum of even numbers from 1 to 10: " + sum);
	}

}
