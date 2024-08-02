
public class ThreadP2 implements Runnable 
{
  public void run()
  {
	  System.out.println("This is run method");
  }
	public static void main(String[] args) {
		
		ThreadP2 f1=new ThreadP2();
		Thread t1=new Thread(f1);
		t1.start();

	}

}
