package lab_5;

import java.util.Random;
import java.util.Scanner;

public class sort {
	static int a[],num;
	static Scanner sc = new Scanner(System.in); 
	Random r=new Random();
	private sort(int n)
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
	void display()
	{
	for(int i=0;i<num;i++)
	{
	System.out.println(a[i]+"\t");
	}
	}
	public static void main(String[] args) {
      
         int n;
        System.out.println("Enter the value morethan n>5000");
        n=sc.nextInt();
        
        sort s = new sort(n); 
        s.read();
       
    	System.out.println("*** before sorting**");
    	s.display();
    	long startTime=System.nanoTime(); 
    	
    	mergeSort(a , 0 , n - 1);
    	
    	System.out.println(" \n after sorting ");
    	long stopTime=System.nanoTime(); s.display();
    	double elapsedTime=((stopTime-startTime)/Math.pow(10, 6));
    	System.out.println(" complexity="+elapsedTime+"ms");

        
        
        }
        static void mergeSort(int[] arr , int s , int e){
            //base case
            if(s >= e)
                return;

            int mid = (s + e)/2;
            //left Part
            mergeSort(arr , s , mid);
            //right part
            mergeSort(arr , mid + 1 , e);
            merge(arr , s , e);
        }

        static void merge(int[] arr , int s , int e){

            int mid = (s + e)/2;
            int len1 = mid - s + 1; //length of first half
            int len2 = e - mid; //length of second half
            
            // taking two arrays (The concept of merge two sortted array)
            
            int[] arr1 = new int[len1];   //right wala part
            int[] arr2 = new int[len2];   // left wala part 

            //copy elements in these arrays;
            int originalArrayIndex = s;
            
            for(int i = 0; i < len1; i++){
                arr1[i] = arr[originalArrayIndex++];
            }

//            originalArrayIndex = mid + 1;

            for(int i = 0; i < len2; i++){
                arr2[i] = arr[originalArrayIndex++];
            }

            //merge two sorted arrays;
            originalArrayIndex = s;

            int idx1 = 0;
            int idx2 = 0;
            while(idx1 < len1 && idx2 < len2){
                if(arr1[idx1] < arr2[idx2]){
                    arr[originalArrayIndex++] = arr1[idx1++];
                }
                else {
                    arr[originalArrayIndex++] = arr2[idx2++];
                }
            }

            //if in arr1 elements are remaining
            while(idx1 < len1){
                arr[originalArrayIndex++] = arr1[idx1++];
            }
            //if in arr2 elements are remaining
            while(idx2 < len2){
                arr[originalArrayIndex++] = arr2[idx2++];
            }
        }

	
}