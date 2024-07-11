import java.util.Scanner;

class B1
{
	int a1,a2,c1;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the a1 value is::");
	   a1=sc.nextInt();
	}
}
class D1 extends B1
{
	void get2()
	{
		System.out.println("Enter the a2 value is::");
		a2=sc.nextInt();
	}
}
class D2 extends D1
{
	void get3()
	{
		c1=a1*a2;
		System.out.println(c1);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
