package lab_4;

import java.util.Random;
import java.util.Scanner;

public class quicksort {
	static int a[],num;
	static Scanner s = new Scanner(System.in); 
	Random r=new Random();
	private quicksort(int n)
	{
	this.num=n; 
	this.a=new int[n];
	}
	void read()
	{
	for(int i=0;i<num;i++)
	   {
	  a[i]=5000+r.nextInt(999);
	   }
	}


	 public static void quickSort(int[] arr , int s , int e){
	        //base case
	        if(s >= e)
	        {
	            return;
	        }
	        //take the partition
	        int p = partition(arr , s , e);

	        //left part sort
	        quickSort(arr , s , p - 1);

	        //right part sort
	        quickSort(arr , p + 1 , e);

	    }

	    public static int partition(int[] arr , int s , int e){

	        int pivot = arr[s];
	        int count = 0;
	        //count of elements smaller than pivot element
	        for(int i = s + 1; i <= e; i++)
	        {
	            if(arr[i] <= pivot)
	                count++;
	        }

	        int pivotIdx = s + count;

	        //put pivot element at correct position
	        int temp = pivot;
	        arr[s] = arr[pivotIdx];
	        arr[pivotIdx] = temp;

	        int sIdx = s;
	        int eIdx = e;

	        //make smaller elements lie before pivot & larger elements after pivot
	        while(sIdx < pivotIdx && eIdx > pivotIdx){

	            //move sIdx++ till we find element greater than pivot element in left side
	            while(arr[sIdx] <= pivot){
	                sIdx++;
	            }
	            //move eIdx-- till we find smaller elements than pivot in right side
	            while(arr[eIdx] > pivot){
	                eIdx--;
	            }
	            //swap the values if found
	            if(sIdx < pivotIdx && eIdx > pivotIdx){
	                temp = arr[sIdx];
	                arr[sIdx] = arr[eIdx];
	                arr[eIdx] = temp;

	                sIdx++;
	                eIdx--;
	            }
	        }
	        return pivotIdx;
	    }
	

	void display()
	{
	for(int i=0;i<num;i++)
	{
	System.out.println(a[i]+"\t");
	}
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
	int n;
	System.out.println("enter the value of n>5000"); 
	n=s.nextInt();
	quicksort q=new quicksort(n);
	q.read();
	System.out.println("*** before sorting**"); 
	q.display();
	long startTime=System.nanoTime(); 
	q.quickSort(a,0,n-1);
	System.out.println(" after sorting "); 
	long stopTime=System.nanoTime(); q.display();
	float elapsedTime=(float)((stopTime-startTime)/Math.pow(10, 6)); 
	System.out.println(" complexity="+elapsedTime+"ms");


}
}
