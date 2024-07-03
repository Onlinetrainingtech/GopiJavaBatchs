import java.util.Scanner;

public class Forloopp5 {

	public static void main(String[] args) {
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Its Even"+i);
			}
			else
			{
				System.out.println("Its Odd"+i);
			}
		}

	}

}
