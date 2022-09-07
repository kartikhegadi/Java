package lab_3;

import java.io.IOException;

public class contact extends staff{
	int period;
	void read() throws IOException
	{
		super.read();
		System.out.println("enter no of years contact");
		period=s.nextInt();
	}
	void display()
	{
		System.out.println(staffid+"\t"+name+"\t\t"+phone+"\t"+salary+"\t"+period);
	}

}

