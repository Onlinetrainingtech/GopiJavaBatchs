
public class ThreadP1 extends Thread 
{
    public void run()
    {
    	try
    	{
    		System.out.println("IN");
    		Thread.sleep(10000);
    		System.out.println("OUT");
    	}
    	catch(InterruptedException t)
    	{
    		System.out.println(t);
    	}
    	System.out.println("This is run method");
    }
	public static void main(String[] args) {
		
		ThreadP1 f1=new ThreadP1();
		f1.start();

	}

}
