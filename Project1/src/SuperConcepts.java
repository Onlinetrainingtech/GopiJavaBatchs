class B15
{
	int pid=1001;
	void get1()
	{
		System.out.println("BaseClassvalue is::"+pid);
	}
}
class D15 extends B15
{
	void get2()
	{
		int pid=2001;
		System.out.println("Derviedclass value is::"+super.pid);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
		
		D15 f1=new D15();
		f1.get1();
		f1.get2();

	}

}
