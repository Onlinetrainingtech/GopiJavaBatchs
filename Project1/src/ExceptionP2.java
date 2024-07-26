
public class ExceptionP2 {

	void get1()
	{
		try
		{
			//String name="mohamed";
			String name=null;
			System.out.println("Your data is::"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check"+t);
		}
	}
	public static void main(String[] args) {
		
		ExceptionP2 f1=new ExceptionP2();
		f1.get1();

	}

}
