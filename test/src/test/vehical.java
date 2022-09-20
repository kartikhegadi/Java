package test;

import java.util.Scanner;

public class vehical {
	
	protected int capa;
	protected int tyres;
	protected float speed;
	
	void read()
	{
		System.out.println("Enter the capacity of vehical\n");
		Scanner sc =new Scanner(System.in);
		capa=sc.nextInt();
		System.out.println("Enter the tyres of vehical\n");
		tyres=sc.nextInt();
		System.out.println("Enter the speed of vehical\n");
		speed=sc.nextFloat();
		
		
	}
	void display()
	{
		System.out.println("Capacity"+capa+"\t");
		System.out.println("Tyres"+tyres+"\t");
		System.out.println("Speed"+speed+"\t");
		
	}

}
