import java.util.Scanner;

class Sample1
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid");
		empid=sc.nextInt();
		System.out.println("Enter the empname");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your Empid is::"+empid+"Your empname is::"+empname);
		
	}
}
public class RuntimeInput {

	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.input();
		f1.display();

	}

}
