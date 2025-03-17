package basicJava;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Triangle pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Square pattern
        System.out.println("\nSquare pattern:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
