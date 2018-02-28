import java.util.Scanner;

public class strrev {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String ch,rev="";
		System.out.println("Enter the String");
		ch=s.next();
		int length = ch.length();
	      for ( int i = length - 1; i >= 0; i-- )
	      {
	         rev = rev + ch.charAt(i);
	         
	      }
	      System.out.println("Reverse of the string is\t" +rev);
	}

}
