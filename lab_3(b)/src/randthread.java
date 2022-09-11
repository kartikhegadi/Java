import java.util.Random;

public class randthread extends  Thread{
	
	public void run()
	{
		Random r= new Random();
		for(int i=0; i<=600;i++)
		{
			System.out.println("Random no+"+r.nextInt(100));
			try
			{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			
		}
	}

}
