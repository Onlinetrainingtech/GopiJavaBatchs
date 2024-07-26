import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP3 {

	void get1()
	{
		try
		{
			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the a value is::");
			a=sc.nextInt();
			System.out.println("Your value is::"+a);
		}
		catch(InputMismatchException f)
		{
			System.out.println("Please check the input"+f);
		}
	}
	public static void main(String[] args) {
		

		ExceptionP3 g1=new ExceptionP3();
		g1.get1();
	}

}
