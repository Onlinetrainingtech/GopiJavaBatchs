import java.util.Scanner;

class B2
{
	int a1,a2;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the a1 and a2 value is::");
	   a1=sc.nextInt();
	   a2=sc.nextInt();
	}
}
class D3 extends B2
{
	void get2()
	{
		System.out.println("Your value is::"+a1);
	}
}
class D4 extends B2
{
	void get3()
	{
		System.out.println("Your value is::"+a2);
	}
}
public class InheritanceP3 {

	public static void main(String[] args) {
	
		D3 f1=new D3();
		D4 f2=new D4();
		f1.get1();
		f1.get2();
		f2.get1();
		f2.get3();

	}

}
