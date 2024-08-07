
public class ThreadP5 extends Thread
{
    public void run()
    {
    	try
    	{
    		
    		Thread.sleep(10000);
    	}
    	catch(InterruptedException t)
    	{
    		System.out.println(t);
    	}
    }
	public static void main(String[] args) {
		
		ThreadP5 t1=new ThreadP5();
		ThreadP5 t2=new ThreadP5();
		t1.start();
		try
		{
			System.out.println("ThreadJoinIN");
			t1.join(2000);
			System.out.println("ThreadJoinOUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		t2.start();
	}

}
