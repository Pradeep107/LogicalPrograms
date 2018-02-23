import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		int a , i , m=0 , flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be found \t");
		a = s.nextInt();
		m=a/2;
		if(a == 0 || a== 1)
		{
			System.out.println( + a +"\tnumber is not  prime");
		}
		else
		{
		for(i=0;i<=m;i++)
		{
		if(a%2 == 0)
		{
			System.out.println( +a + "\tnumber is not a prime");	
			flag = 1;
			break;
		}
		}
		if(flag == 0)
		{
			System.out.println( + a + " \tis Prime");
		}
		}
	}

}
