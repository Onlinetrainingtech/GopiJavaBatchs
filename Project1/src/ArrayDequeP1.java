import java.util.ArrayDeque;

public class ArrayDequeP1 
{
	ArrayDeque<Integer>obj=new ArrayDeque<>();
    void get1()
    {
    	obj.addFirst(1001);
    	obj.add(1002);
    	obj.add(1003);
    	obj.addLast(1004);
    	
    	System.out.println("Your data is::"+obj.getFirst());
    	System.out.println("Your data is::"+obj.size());
    	System.out.println("Your data is::"+obj.getLast());
    	
    	
    	
    }
	public static void main(String[] args) {
		
		ArrayDequeP1 f1=new ArrayDequeP1();
		f1.get1();

	}

}
