package stringManipulation;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String = ");
		String str = sc.nextLine();
		int countVowel = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					countVowel++;
		}
		System.out.println("String '" + str + "' has " + countVowel + " vowels.");
		sc.close();
	}

}
