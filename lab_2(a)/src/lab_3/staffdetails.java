package lab_3;

import java.io.IOException;
import java.util.Scanner;

public class staffdetails {

	public static void main(String[] args ) throws IOException
	{
		//@SuppressWarnings("unused")
		int m,n,p;
		Scanner s=new Scanner(System.in);
		// Creating objects for Inheriting the Features of base class 
		teaching r[];
		techinical t[];
		contact c[];
		
		
		System.out.println("\n ****** read teaching staff details***\n");
		System.out.println("enter number of teaching staff");
		m=s.nextInt();
		r=new teaching[m];
		
		for(int i=0;i<m;i++)
		{
			r[i]=new teaching();
			System.out.println("Enter teaching staff"+(i+1)+"details");
			r[i].read();
		}
		System.out.println("\n****read techinical staff details*****");
		System.out.println("Enter no of techinical staff");
		n=s.nextInt();
		t=new techinical[n];
		
		for(int i=0;i<n;i++)
		{
			t[i]=new techinical();
			System.out.println("Enter the techical staff"+(i+1)+"details");
			t[i].read();
		}
		System.out.println("\n teaching staff");
		System.out.println("staffid\t name\t phone\t salary \t domain \t publication\t");
		for(int i=0;i<m;i++)
		{
			r[i].display();
		}
		System.out.println("\n Contract staff");
		System.out.println("staffid\t name\t phone\t salary\t period\t");
		for(int i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}
