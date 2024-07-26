class Demo
{
	void get1()
	{
		try
		{
		int a=100/2;
		System.out.println("Your value is::"+a);
		}
		catch(Exception t)
		{
			System.out.println("Please check the division"+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function");
	}
}
public class ExceptionP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
