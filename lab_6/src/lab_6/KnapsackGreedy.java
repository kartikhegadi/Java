package lab_6;

import java.util.Scanner;

public class KnapsackGreedy {
	
	  static int wt[]=new int[10];
	  static float wp[]=new float[10];
	  static float twp[]=new float[10];
	  static int pr[]=new int[10];
	  static int n,curwt=0,remwt;
	  static float maxprofit=0,pro;
	  
	  
	  public static float knapsack(int m)
	  {
	   int i=0;
	   while(curwt<=m)
	    {
	      curwt+=wt[maxpro()];
	      maxprofit+=pr[maxpro()];
	      i=maxpro();
	      wp[maxpro()]=0;
	     }
	   
	     curwt-=wt[i];               // last condition of the while condition
	     remwt=m-curwt;              //remwt= removeweight  //curwt= current_weitgh 
	     maxprofit-=pr[i];            
	     float newprofit=twp[i]*remwt;
	     maxprofit+=newprofit;
	     
	   return maxprofit;
	  }
	  
	  
	  public static int maxpro()
	  {
	     float max=wp[1];
	     int index=1;
	     for(int i=2;i<=n;i++)
	      if(wp[i]>max)       // taking max out of the weight and profit ratio array 
	      {
	         max=wp[i];
	         index=i; 
	      }
	    return index;
	  }
	  
	  
	  public static void main(String args[])
	  {
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter number of objects");
	    n=in.nextInt();
	    System.out.println("Enter profit array");
	    for(int i=1;i<=n;i++)
	      pr[i]=in.nextInt();
	    System.out.println("Enter weight array");
	    for(int i=1;i<=n;i++)
	      wt[i]=in.nextInt();
	    System.out.println("Enter maximum weight");
	    int m=in.nextInt();
	    remwt=m;
	    
	    for(int i=1;i<=n;i++)
	    {
	      wp[i]=pr[i]/wt[i];
	      twp[i]=wp[i];
	     }
	    
	    
	    float maxpro=knapsack(m);
	    System.out.println("Maximum Profit = "+maxpro);

}
}
