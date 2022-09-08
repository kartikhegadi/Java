import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class costomer {
	
	String name;
	String dob;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	void read() throws IOException
	{
		System.out.println("Enter the name \n");
		name=in.readLine();
		System.out.println("Enter the DOB in the form of dd/mm/yyyy \n");
		dob=in.readLine();
		
	}
	void display()
	{
		StringTokenizer st = new StringTokenizer(dob,"/");
		System.out.print("Output is \n");
		System.out.println(name);
		while(st.hasMoreTokens())
		{
			System.out.println(","+st.nextToken());
		}
		System.out.println("");
	}
}
