import java.util.Scanner;

class Demo20
{
	int empid[]=new int[5];
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
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
			System.out.println("Your value is::"+empid[i]);
		}
	}
}
public class ArrayP1 {

	public static void main(String[] args) {
		
		Demo20 f1=new Demo20();
		f1.get1();
		f1.get2();

	}

}
