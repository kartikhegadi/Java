package lab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class staff {
	protected int staffid;
	protected String name;
	protected int salary;
	protected String phone;
	
	//readers buffers
	BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
	Scanner s =new Scanner(System.in);
	
	void read() throws IOException
	{
		
		System.out.println("Enter Staff id");
		staffid=s.nextInt();
		System.out.println("Enter staff name");
		name=in.readLine();
		System.out.println("Enter phone no");
		phone=s.next();
		System.out.println("Enter staff sal");
		salary=s.nextInt();
		
		
	}

}
