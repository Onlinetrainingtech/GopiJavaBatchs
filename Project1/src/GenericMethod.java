class Demo24
{
	public <M>M test(M t)
	{
		return t;
	}
}
public class GenericMethod {

	public static void main(String[] args) {
		
		Demo24 f1=new Demo24();
		System.out.println(f1.test(1001));
		System.out.println(f1.test("welcome"));
		System.out.println(f1.test(2.4));

	}

}
