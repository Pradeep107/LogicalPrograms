import java.util.Scanner;

public class Amstrong 
{
	public static void main(String args[])
	{
		int a, b, c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		a = s.nextInt();
		 int temp = a;
		 while(a >0)  
		    {  
		    b=a%10;  
		    a=a/10;  
		    c=c+(b*b*b);  
		    }  
		 if(temp == c)
		 {
			 System.out.println("Amstrong number");
		 }
		 else 
		 {
			 System.out.println(" Not a Amstrong Number");
		 }
	}

}
