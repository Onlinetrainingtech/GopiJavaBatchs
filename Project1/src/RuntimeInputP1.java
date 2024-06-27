import java.io.DataInputStream;
import java.io.IOException;

class Sample2
{
	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws  IOException
	{
		System.out.println("Enter the empid::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname::");
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your empid is::"+empid+"Empname::"+empname);
	}
}
public class RuntimeInputP1 {

	public static void main(String[] args) throws IOException {
		
		Sample2 f1=new Sample2();
		f1.input();
		f1.display();

	}

}
