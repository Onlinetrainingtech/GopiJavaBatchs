import java.util.Scanner;

class Demo22
{
	int empid[][]=new int[10][5];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				empid[i][j]=sc.nextInt();
				System.out.println("Your value is::"+empid[i][j]);
			}
		}
	}
}
public class ArrayP2 {

	public static void main(String[] args) {
		Demo22 f1=new Demo22();
		f1.get1();
		f1.get2();

	}

}
