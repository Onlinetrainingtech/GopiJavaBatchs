class Counter
{
	private int count=0;
	
	//Synchronized method to increment the count
	
	public synchronized void increment()
	{
		count++;
	}
	
	//Method to get the count value
	public int getCount()
	{
		return count;
	}
	
}
public class SynchronizedProcess extends Thread
{

	private Counter counter;
	
	SynchronizedProcess(Counter counter)
	{
		this.counter=counter;
	}
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			counter.increment();
		}
	}
	
	public static void main(String[] args) {
		
		Counter counter=new Counter();
		SynchronizedProcess t1=new SynchronizedProcess(counter);
		
		SynchronizedProcess t2=new SynchronizedProcess(counter);
		
		SynchronizedProcess t3=new SynchronizedProcess(counter);
		
		t1.start();
		//t2.start();
		//t3.start();
		
		//Join the thread
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException t)
		{
			
		}
		
		System.out.println("FinalCount::"+counter.getCount());

	}

}
