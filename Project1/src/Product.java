
public class Product 
{
	int pid=1001;//global variable
    void addProduct()
    {
    	String pname="apple";//local variable
    	System.out.println("This is addProduct"+pid+pname);
    }
    void viewDetails(int cid,String cname)//Passing parameters
    {
    	System.out.println("This is viewDetails"+cid+""+cname);
    }
	public static void main(String[] args) {
		
		Product f1=new Product();
		f1.addProduct();
		f1.viewDetails(2001,"mobile");

	}

}
