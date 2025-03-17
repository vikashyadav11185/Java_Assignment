package stringManipulation;
import java.util.*;
public class Anagrams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String = ");
		String str  =sc.nextLine();
		System.out.println("Enter Second String = ");
		String str1  =sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		if(str.length()!=str1.length())
			System.out.println("Strings are not anagram");
		else
		{
			for(int i=0;i<str.length();i++)
			{
				map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
			}
			for(int i=0;i<str1.length();i++)
			{
				if(!map.containsKey(str1.charAt(i)))
				{
					System.out.println("Strings are not anagram");
					break;
				}
				else
				{
					if(map.get(str1.charAt(i))==1)
						map.remove(str1.charAt(i));
					else if(map.get(str1.charAt(i))>1)
						map.put(str1.charAt(i), map.get(str1.charAt(i))-1);
				}
			}
			if(map.isEmpty())
				System.out.println("Strings are anagram.");
		}
		sc.close();
	}
}
