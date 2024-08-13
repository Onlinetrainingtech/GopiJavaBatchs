
public class RThreadP1 extends Thread
{

	public void run()
	{
		
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
		
		System.out.println("This is run method.."+currentThread().getName());
		System.out.println("This is Priority::"+currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		RThreadP1 t1=new RThreadP1();
		RThreadP1 t2=new RThreadP1();
		t1.setName("Gopi");
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t1.isAlive());

	}

}
