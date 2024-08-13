
public class RJoinThread extends Thread
{

	public void run()
	{
		System.out.println("This is Run Method"+currentThread().getName());
	}
	public static void main(String[] args) 
	{
	   
		RJoinThread t1=new RJoinThread();
		RJoinThread t2=new RJoinThread();
		t1.start();
		
		try
		{
			System.out.println("JoinIN");
			t1.join(10000);
			System.out.println("JoinOUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		t2.start();

	}

}
