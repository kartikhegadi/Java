package lab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class teaching extends staff{

	
	String domain;
	String publication;
	
	void read() throws IOException
	{
		super.read(); //calls suber class 
		//Scanner sc =new Scanner(System.in);
		//BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the staff domain");
		domain=in.readLine();
		System.out.println("enter the publication");
		publication=in.readLine();
	}
	
	void display()
	{
		System.out.println(staffid+"\t"+name+"\t\t"+phone+"\t"+salary+"\t"+domain+"\t"+publication);
		
	}
}

