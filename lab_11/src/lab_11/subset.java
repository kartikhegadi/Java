package lab_11;
import java.util.Scanner;
import java.util.Stack;

public class subset {        // find the sum of the subset in the given set is that right ????
 
	static int sum;
	static int set[]=new int[20];
	
	Stack<Integer> solutionset;   // name of the stack is solutionset 
	boolean hassolution;
	
	subset(int set[], int sum )  //constructor 
	{
		this.set=set;
		this.sum=sum;
		this.solutionset=new Stack<Integer>();
		hassolution= false; 
	}
	
	public void solve(int currsum,int idx)
	{
		if(currsum>sum)  // return false if s value exceeds 
		{
			return;
		}
		//check the stack has the right subsets of numbers 
		if(currsum==sum)
		{
			hassolution=true;
			
			displaysolutionset(); //display stack solution
			
			return; //Through found a solution but 
		}
		for(int i=idx; i<set.length ;i++ )
		{
			solutionset.push(set[i]);
			
			solve(currsum+set[i],i+1); // sending currsum and index of next item
			
			solutionset.pop();
			
		}
		
	
		
	}

	 void displaysolutionset() 
	{
		System.out.print("The subsets are \n");
		for(Integer item : solutionset )
		{
			System.out.println(item+"");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the how many elements are there in the set \n");
			int n=sc.nextInt();
			System.out.print("Enter the set elements in the increasing order \n");
			for(int k=0;k<n;k++)
			{
				set[k]=sc.nextInt();
			}
			System.out.print("Enter the sum");
			int size=sc.nextInt();
			
			subset s =new subset(set,size );
			s.solve(0,0); // Parameters are(currsum,index) 
			if(s.hassolution==false)
			{
				System.out.println("No solution \n");
			}
		}
	}
}

