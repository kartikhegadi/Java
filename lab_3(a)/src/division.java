import java.util.Scanner;

public class division {
	
	public static void main(String args[])
	{
		int a,b;
		float quot;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Please enter FIRST number (Numerator)");
		a=sc.nextInt();
		System.out.println("Please enter second number (Denomitor)");
		b=sc.nextInt();
		
		try
		{
			quot=a/b;
			System.out.println("Quotent="+quot);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}

}
