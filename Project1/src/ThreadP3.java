
public class ThreadP3 extends Thread 
{
    public void run()
    {
    	System.out.println("Priority::"+currentThread().getPriority());
    	System.out.println("ThreadName::"+currentThread().getName());
    }
	public static void main(String[] args) {
		
		ThreadP3 t1=new ThreadP3();
		ThreadP3 t2=new ThreadP3();
		t1.setName("Welcome");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}
