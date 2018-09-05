import java.util.Scanner;
/**
*This program is a String program that plays around with 9 different string methods in Java. 
*The program begins by prompting the user to enter 3 different strings, which are used in the methods below:
*The first method determines the length of a given string. The second method determines whether or not two strings sre the same.
*The third method looks at a substring within a string. The fourth method trims the white edges from the left and right of a word.
*The following two methods determine the beginning index and the last beginning index of a substring within another string. The next method
* determines the character at a given index. The toUpperCase method sets all the characters in a string to uppercase.
*Finally, the last method adds two strings together. Following the entry of 3 strings, all method results are calculated and printed
*/
public class StringFun
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();

		System.out.println("Enter another string: ");
		String otherString = in.nextLine();

		System.out.println("Enter a substring: ");
		String subString = in.nextLine();

		System.out.println("Enter a string you'd like to add to your first string (Add a space before you begin typing): ");
		String concatString = in.nextLine();

		System.out.println("The length is: " + s.length());

		
		System.out.println("Are the strings the same: "  + s.equals(otherString));

		System.out.println(s.substring(0, s.length()));

		System.out.println(s.trim());

		System.out.println(s.indexOf(subString));

		System.out.println(s.lastIndexOf(subString));

		System.out.println(s.charAt(3));

		System.out.println(s.toUpperCase());

		System.out.println(s.concat(concatString));
	}
}