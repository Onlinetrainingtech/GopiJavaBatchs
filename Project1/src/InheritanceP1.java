import java.util.Scanner;

class B
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your value is::"+empid);
	}
}
public class InheritanceP1 {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
