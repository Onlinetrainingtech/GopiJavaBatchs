class Demo14
{
	void get1(int empid,String empname)
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	void get1(long mobile)
	{
		System.out.println("Your value is::"+mobile);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		
		Demo14 f1=new Demo14();
		f1.get1(1001,"mohamed");
		f1.get1(12345);

	}

}
