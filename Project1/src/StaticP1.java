class Demo19
{
	int pid;
	String pname;
	static int a=10;
	Demo19()
	{
		a++;
		System.out.println(a);
	}
	void get1(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
		System.out.println("This is get1 function.."+pid+pname);
	}
	void display()
	{
		System.out.println("Your data is::"+pid+""+pname);
	}
	
}
public class StaticP1 {

	public static void main(String[] args) {
		
		new Demo19();
		Demo19 f1=new Demo19();
		f1.get1(1001,"azar");
		f1.display();
	

	}

}
