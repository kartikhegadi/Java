import java.util.Scanner;

public class floyds {
	 
	static Scanner sc=new Scanner(System.in);
	static int cost[][]=new int[10][10];
	static int n;
	public static void main(String args[])
	  {
		readmatrix();
	    floyds(cost);
	    printmatrix();
	    
	  }
	
public static void printmatrix() {
		
	System.out.println("Matrix is ");
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
       System.out.print(cost[i][j]+" ");
     System.out.println();
    }
}
		
	

public static void floyds(int cost[][]) {
		
	
	int i,j,k; 
	for(k=1;k<=n;k++)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
		        cost[i][j]=Math.min(cost[i][j], cost[i][k]+cost[k][j]);
			}
		
	    }
	}
	
	//for(int i=0;i<n;i++)
	  //   for(int j=0;j<n;j++)
	      //for(int k=0;k<n;k++)
	    //   if(cost[j][k]>cost[j][i]+cost[i][k])
	        // cost[j][k]=cost[j][i]+cost[i][k];
}

public static void readmatrix() {
		
		System.out.println("Enter the number of vertex \n");
		 n=sc.nextInt();
		 System.out.println("Enter the cost matrix");
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		      cost[i][j]=sc.nextInt();   // note dont make diagonal elements as 999 because we are re-changing same cost matrix
		     
		    }
		    
		}

}
		}
