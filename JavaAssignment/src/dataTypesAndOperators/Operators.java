package dataTypesAndOperators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int a = 10;
	        int b = 5;
	        
	        // Arithmetic operators
	        System.out.println("Arithmetic Operators:");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));
	        System.out.println("++a = " + (++a));
	        System.out.println("--b = " + (--b));
	        System.out.println("++a = " + (a++));
	        System.out.println("--b = " + (b--));
	        
	        // Relational operators
	        System.out.println("\nRelational Operators:");
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	        
	        // Logical operators
	        boolean x = true;
	        boolean y = false;
	        
	        System.out.println("\nLogical Operators:");
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));
	        
	        // Bitwise operators
	        System.out.println("\nBitwise Operators:");
	        System.out.println("a & b: " + (a & b));
	        System.out.println("a | b: " + (a | b));
	        System.out.println("a ^ b: " + (a ^ b));
	        System.out.println("~a: " + (~a));
	        System.out.println("a << 2: " + (a << 2));
	        System.out.println("a >> 2: " + (a >> 2));
	        
	        // Assignment operators
	        System.out.println("\nAssignment Operators:");
	        int c = 15;
	        System.out.println("c = " + c);
	        c += 5;
	        System.out.println("c += 5: " + c);
	        c -= 5;
	        System.out.println("c -= 5: " + c);
	        c *= 2;
	        System.out.println("c *= 2: " + c);
	        c /= 3;
	        System.out.println("c /= 3: " + c);
	        c %= 5;
	        System.out.println("c %= 5: " + c);
	}

}
