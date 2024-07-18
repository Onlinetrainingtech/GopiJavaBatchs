import java.util.ArrayList;


public class CollectionP2 {

    ArrayList<Integer>list1=new ArrayList<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		System.out.println("Your data is::"+list1);
		System.out.println("Totalsize of data::"+list1.size());
		System.out.println("Searching of data::"+list1.contains(1001));
		System.out.println("Removing the data::"+list1.remove(1001));
		System.out.println("After Removing data::"+list1.size());
	}
	public static void main(String[] args) {
		
		CollectionP2 f1=new CollectionP2();
		f1.get1();
	}

}
