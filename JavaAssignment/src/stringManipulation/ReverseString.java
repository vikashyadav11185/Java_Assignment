package stringManipulation;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String str = sc.nextLine();
		String revstr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr +=str.charAt(i);
		}
		System.out.println("Given String = '" + str + "' and reversed String  = '" + revstr + "'");
		sc.close();
	}

}
