package lab_7;

import java.util.Scanner;

public class dijkstras {
	
	
	
	static int n;
	final static int max =20;
	 static int vist[]=new int[10];
	 static int dist[]=new int[10];
	 static int a[][]=new int[10][10];
	 static Scanner sc= new Scanner(System.in);
	 public static void main(String args[])
	 {
	  
	   readmatrix();
	   
	   System.out.println("Enter source node");
	   int src=sc.nextInt();
	   
	   dk(src); //sending source node 
	   
	   
	     for(int j=1;j<=n;j++)
	    {
	     if(j!=src)
	      System.out.println("Cost from "+src+" to "+j+" is"+dist[j]); }
	  }
	 
	  private static void readmatrix() {

		    int i ,j;
		    
			//a=new int[max][max];
			System.out.println("Enter the number of nod dijk \n");
			n=sc.nextInt();
			System.out.println("Enter the cost adjecent matrix \n");
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					a[i][j]=sc.nextInt();
					if(a[i][j]==0)
					{
						a[i][j]=999;   // making diagonal matrix as 999
					}
				}
			}
		
	}

	public static void dk(int src)  // sending source node 
	  {
	    for(int i=1;i<=n;i++)
	    {
	      vist[i]=0; 
	      dist[i]=a[src][i]; // getting from source node where all we can reach 
	    }
	    vist[src]=1;   // setting source node to 1 because it is the base distance which we wanna reach 
	    int x=2,m; // setting index 2 and iterating because 0 index is not considered and 1 is for base adders for source node
	    while(x<=n)
	    {
	      m=min();  // getting smallest valued index form the array of distance 
	      vist[m]=1;   // marking visited array as 1 
	      for(int j=1;j<=n;j++) 
	      {
	        if((dist[m]+a[m][j]<dist[j])&&(vist[j]==0) && vist[j]==0&&m!=-1)
	          dist[j]=dist[m]+a[m][j];
	       } 
	     }x++;
	   }
	                                // complexity will be O(n*n) 
	  public static int min()
	  {
	    int min=999,j=-1;
	    for(int i=1;i<=n;i++)
	    {
	     if(dist[i]<min&&vist[i]==0)
	     {
	       j=i; 
	      }
	   
	   }
	    return j;
	  }
	

}
