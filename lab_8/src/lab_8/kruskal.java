package lab_8;

import java.util.Scanner;

public class kruskal {


	final static int max =20; // impossible to inherit or override
	static int n,mincost; // no of vertices of G
	static int cost[][]=new int[max][max];
	
	static int parent[]=new int[9];
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args)
	{
		readmatrix();
		kruskals(cost);  // no source node
		System.out.println("Total cost is = "+mincost);
	}
	

static void readmatrix()   //reading the adjacent matrix
{ 
	
	
	int i ,j;
	
	System.out.println("Enter the number of node \n");
	n=sc.nextInt();
	System.out.println("Enter the cost adjecent matrix \n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			cost[i][j]=sc.nextInt();
			if(cost[i][j]==0)
			{
				cost[i][j]=999;   // making diagonal matrix as 999
			}
		}
	}
}
static void kruskals(int cost [][])
{
	int a=0,b=0,u=0,v=0;
	int i,j,ne=1,min; // ne=1
	System.out.println("The edge of minimum cost Spanning Tree are \n");
	
	while(ne<n)   // for n nodes we need to search for n-1 times same as (n<n-1)
	{
		min=999;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(cost[i][j]<min) // track the minimum value 
				{
					min=cost[i][j];   
					a=u=i;  // a is just for printing and u is to find the parent vertex
					b=v=j;  //b is just for printing and v is to find the parent vertex
				}
				u=find(u);
				v=find(v);
			}
		}
				if(u!=v) 
				{
					uni(u,v);
					System.out.println(ne+++"edge("+a+","+b+")="+min);
					mincost+=min;
				}
				
				cost[a][b]=cost[b][a]=999;   // why we are considering because we have already visited that element that's y we do search once again that's y we do 999
			
	} 
	
}

static int find(int i)
{
	while(parent[i]>0)     // Initially the parent array will be having values zeros
	{
		i=parent[i];

	}
	return i;
}
static void uni(int i,int j)
{
	parent[j]=i;  // or parent [i]=j;
}

}
