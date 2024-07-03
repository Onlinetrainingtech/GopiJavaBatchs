import java.util.Scanner;

public class Forloopp2 {

	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	public static void main(String[] args) {
	
		Forloopp2 f1=new Forloopp2();
		f1.get1();
		f1.get2();

	}

}
