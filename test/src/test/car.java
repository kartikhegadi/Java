package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class car extends vehical {
	
	String company;
	void spec()
	{
    System.out.println("Enter the Car company \n");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	try {
		company=in.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	void display1() 
	{
		System.out.println("Car company"+company);
	}

}
