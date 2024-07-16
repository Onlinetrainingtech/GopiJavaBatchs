abstract class Sample15
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal method");
	}
}
class Demo17 extends Sample15
{
	void get1()
	{
		System.out.println("This is get1 function");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		Demo17 f1=new Demo17();
		f1.get1();
		f1.get2();

	}

}
