package lab_3;

import java.io.IOException;

public class techinical extends staff{
	
	int n;
	String skills[];
	void read() throws IOException
	{
		super.read();
		System.out.println("enter teh no of skills staff has");
		n=s.nextInt();
		skills=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter skill"+(i+1));
			skills[i]=s.next();
			
		}
		
	}
	
	void display()
	{
		System.out.println(staffid+"\t"+name+"\t\t"+phone+"\t"+salary+"\t");
		for(int j=0;j<n;j++)
		{
			System.out.println(skills[j]+",");
			
		}
		System.out.println("");
		
	}

}
