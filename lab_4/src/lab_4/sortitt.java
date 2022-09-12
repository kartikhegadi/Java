package lab_4;

import java.util.Random;
import java.util.Scanner;

public class sortitt {
	static int a[],num;
	static Scanner s = new Scanner(System.in); 
	Random r=new Random();
	 sortitt(int n)
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

	        int pivotele = arr[s];
	        int count = 0;
	        //count of elements smaller than pivot element
	        for(int k = s + 1; k <= e; k++)
	        {
	            if(arr[k] <= pivotele)
	                count++;
	        }

	        int pivotIdx = s + count;

	        //put pivot element at correct position
	        int temp = pivotele;
	        arr[s] = arr[pivotIdx];
	        arr[pivotIdx] = temp;

	        int i = s;
	        int j = e;

	        //make smaller elements lie before pivot & larger elements after pivot
	        while(i < pivotIdx && j > pivotIdx){

	            //move i++ till we find element greater than pivot element in left side
	            while(arr[i] <= pivotele){
	                i++;
	            }
	            //move j-- till we find smaller elements than pivot in right side
	            while(arr[j] > pivotele){
	                j--;
	            }
	            //swap the values if found
	            if(i < pivotIdx && j > pivotIdx){
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;

	                i++;
	                j--;
	            }
	        }
	        return pivotIdx;
	    }
	

	void display()
	{
	for(int i=0;i<num;i++)
	{
	System.out.print(a[i]+"\t");
	}
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{
	int n;
	System.out.println("enter the value of n>5000"); n=s.nextInt();
	sortitt q=new sortitt(n);
	q.read();
	System.out.println("*** before sorting**"); q.display();
	long startTime=System.nanoTime(); 
	q.quickSort(a,0,n-1);
	System.out.println(" \n after sorting "); long stopTime=System.nanoTime(); q.display();
	double elapsedTime=((stopTime-startTime)/Math.pow(10, 6)); System.out.println(" complexity="+elapsedTime+"ms");


}
}
