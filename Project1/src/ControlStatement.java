import java.util.Scanner;

public class ControlStatement {

	int age,sal,bns;
	Scanner sc=new Scanner(System.in);
	void cnd1()
	{
		int productid=2001;
		if(productid==1001)
		{
			System.out.println("Your Productid is Equal");
		}
		else
		{
			System.out.println("Your Productid is not equal");
		}
	}
	void cnd2()
	{
	    System.out.println("Enter the age is::");
	    age=sc.nextInt();
	    if(age>=61)
	    {
	    	System.out.println("Enter the salary is::");
	    	sal=sc.nextInt();
	    	if(sal>=20000)
	    	{
	    		bns=sal+500;
	    		System.out.println("Your bns is::"+bns);
	    	}
	    	else
	    	{
	    		bns=sal+1000;
	    		System.out.println("Your bns is::"+bns);
	    	}
	    }
	    else
	    {
	    	System.out.println("Your age is very low");
	    }
	}
	public static void main(String[] args) {
		
		ControlStatement f1=new ControlStatement();
		//f1.cnd1();
		f1.cnd2();

	}

}
