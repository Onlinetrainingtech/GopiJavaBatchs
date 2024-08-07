
public class WaitProcessp1 extends Thread
{
  
	public synchronized void get1() throws InterruptedException
	{
		System.out.println("WaitIN");
		wait(10000);
		System.out.println("WaitOUT");
	}
	public synchronized void get2()
	{
		notify();
	}
	public static void main(String[] args) throws InterruptedException {
		
		WaitProcessp1 f1=new WaitProcessp1();
		f1.get1();
		f1.get2();

	}

}
