import java.util.Scanner;

public class ExceptionP4 {

	Scanner sc=new Scanner(System.in);
	void get1()
	{
		try
		{
			try
			{
				int a,c;
				
				System.out.println("Enter the a value is::");
				a=sc.nextInt();
				c=a/0;
				System.out.println("Your value is::"+c);
			}
			catch(ArithmeticException t)
			{
				System.out.println("Please check Exception1");
			}
			try
			{
				String s1;
				System.out.println("Enter the s1 value is::");
				s1=sc.next();
				System.out.println("Your data is::"+s1.length());
			}
			catch(NullPointerException t1)
			{
				System.out.println("Please Check Exception2");
			}
		}
		catch(Exception t)
		{
			System.out.println("Alloverexception");
		}
		finally
		{
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP4 f1=new ExceptionP4();
		f1.get1();

	}

}
