class Demo18
{
	Demo18()
	{
		System.out.println("This is Normal default cons..");
	}
	Demo18(int empid,String empname)
	{
		System.out.println("Your empid is::"+empid+"Your empname is::"+empname);
	}
	void get1()
	{
		System.out.println("This is normal method..");
	}
}
public class ConstructorP1 {

	public static void main(String[] args) {
		
		Demo18 f1=new Demo18();//default cons
		new Demo18(1001,"azar");//para cons
		f1.get1();

	}

}
