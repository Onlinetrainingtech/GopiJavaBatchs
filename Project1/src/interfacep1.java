interface F1
{
	void get1();
}
interface F2 extends F1
{
	void get2();
}
class S1 implements F2
{
	public void get1()
	{
		System.out.println("This is an Interface-1");
	}

	@Override
	public void get2() {
		
		System.out.println("This is an Interface-2");
		
	}
}
public class interfacep1 {

	public static void main(String[] args) {
		
		S1 g1=new S1();
		g1.get1();
		g1.get2();

	}

}
