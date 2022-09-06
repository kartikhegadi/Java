package Program_1;

import java.util.Scanner;

public class stack {
	
	
	int a[];
	int top;
	int n;
	int data;
	
	stack(int size)
	{
		top = -1;
		a=new int[size];
		n=size;
	}
	void push()
	{
		System.out.println("Enter the element to insert in to stack \n");
		Scanner sc = new Scanner(System.in);
		data=sc.nextInt();
		if(top == n-1)
		{
			System.out.println("stack is full");
			
		}
		else
		{
			a[++top]=data;
			System.out.println("PUSHED element "+a[top]);
		}


}
	int pop()
	{
		if(top ==-1)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
		{
			System.out.println("Popped element="+a[top]);
			return a[top--];
		}
	}
void display()
{
	if(top==-1)
	{
		System.out.println("No elements to Display \n");
	}
	else
	{
		System.out.println("Stack contents are \n");
		for(int i=0; i<n ;i ++)
		{
			System.out.println(a[i]);
		}
	}
}
}