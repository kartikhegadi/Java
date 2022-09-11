import java.util.Scanner;

public class multithread {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the value of n");
		cube t1=new cube(5);
		square t2= new square(10);
		randthread t3= new randthread();
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
