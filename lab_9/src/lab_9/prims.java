package lab_9;
import java.util.Scanner;

public class prims {
	
	 static int n,ne=1,min,mincost=0;
	 static int visited[]=new int[11]; // unlike kruskals(parent) it's uses visited  array only 
	 static int cost[][]=new int[10][10];
	 static Scanner sc =new Scanner(System.in);
	 
	 public static void main(String args[])
	 {
		 readmatrix();
	     prim(cost);
	 }
	public static void prim(int cost[][]) {
		
		int mincost=0;
			   int i,j,u=1,v=1;
			    while(ne<n)
			   {
			     min=999;
			     for(i=1;i<=n;i++)
			     {
			      for(j=1;j<=n;j++)
			      {
			         if(cost[i][j]<min)
			         {
			             min=cost[i][j];
			             u=i;
			             v=j;
			          } 
			         }
			       }
			       if(visited[u]==0||visited[v]==0)
			      {
			        System.out.println("Edge "+u+" to "+v+" with cost"+cost[u][v]);
			        mincost=mincost+cost[u][v];
			        
			        visited[v]=1; //mark visited as one!!!
			        ne++;
			        
			       }
			        cost[u][v]=cost[v][u]=999;
			   }
			     System.out.println("Total cost is = "+mincost);
			    }
			 
		
		
	
	public static void readmatrix() {
		
		System.out.println("Enter the number of vertex \n");
		 n=sc.nextInt();
		 System.out.println("Enter the cost matrix");
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		      cost[i][j]=sc.nextInt();
		      if(cost[i][j]==0)
				{
					cost[i][j]=999;
				}
		    }
		    
		}
		
		
	}
	 
	 }

