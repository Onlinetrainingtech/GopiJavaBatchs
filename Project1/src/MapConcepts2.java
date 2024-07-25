import java.util.Map;
import java.util.TreeMap;

public class MapConcepts2 
{
	TreeMap<Integer,String>list1=new TreeMap<>();
	
    void get1()
    {
        list1.put(1001,"s1");
        list1.put(1002,"s2");
        list1.put(1003,"s3");
        list1.put(1004,"s4");
        
        
    }
    void get2()
    {
    	for(Map.Entry k:list1.entrySet())
    	{
    		System.out.println("GetKeyvalue is::"+k.getKey());
    		System.out.println("GetValue is::"+k.getValue());
    	}
    	System.out.println("Searching Your data is::"+list1.containsKey(1001));
    	System.out.println("Remove of data::"+list1.remove(1002));
    	System.out.println("After Removing data::"+list1.containsKey(1002));
    	System.out.println("Total Size is::"+list1.size());
    	System.out.println("Index of the data::"+list1.get(1004));
    }
	public static void main(String[] args) {
		
		MapConcepts2 f1=new MapConcepts2();
		f1.get1();
		f1.get2();
	}

}
