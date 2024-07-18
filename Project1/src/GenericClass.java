class Demo21<M>
{
	public M t;
	
	public void get1(M t)
	{
		System.out.println("Your value is::"+t);
	}
}
public class GenericClass {

	public static void main(String[] args) {
		
		Demo21<Integer>f1=new Demo21();
		f1.get1(1001);
		Demo21<String>f2=new Demo21();
		f2.get1("welcome");

	}

}
