import java.util.HashMap;

class Sample20
{
	HashMap<Integer,String>m1=new HashMap<>();
	void get1()
	{
		m1.put(1001,"azar");
		m1.put(1002,"mohamed");
		m1.put(1003,"raja");
		
		System.out.println("Your value is::"+m1);
	}
}
public class MapConcepts1 {

	public static void main(String[] args) {
		
        Sample20 f1=new Sample20();
        f1.get1();
	}

}
