package Program_1;

import java.util.Scanner;

public class stackmain {
	 
	public static void main(String[] args )
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		size =sc.nextInt();
		stack s = new stack(size);
		for(;;)
		{
			System.out.println("1.PUSH \t 2.POP \t 3.DISPLAY \t 4.EXIT  \n");
			int choice;
			choice =sc.nextInt();
			switch(choice)
			{
			case 1 : //System.out.println("Enter the item to be PUSHED \n");
			        s.push();
			        break;
			case 2 : s.pop();
			         break;
			case 3 : s.display();
			break;
			case 4 : System.exit(0);
			default: System.out.println("Invalid Choice \n");
			}
		}
	}

	
		
	}


