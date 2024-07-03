import java.util.Scanner;

public class Nestedforloop1 {

	int r,c,i,j;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the r and c::");
		r=sc.nextInt();
		c=sc.nextInt();
		
	}
	void get2()
	{
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("I value is::"+i+"J value is::"+j);
			}
		}
	}
	public static void main(String[] args) {
		
		Nestedforloop1 f1=new Nestedforloop1();
		f1.get1();
		f1.get2();

	}

}
