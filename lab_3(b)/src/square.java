
public class square extends Thread{
	
	public int num;
	public square(int n)
	{
		num=n;
	}
	public void run()
	{
		for(int i=0; i<=num;i++)
		{
			System.out.println("Square"+i+"="+i*i);
		}
	}
	
	

}
