import java.util.Scanner;

public class Forloopp3 {

	public static void main(String[] args) {
		
		int i,fact=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			
			fact=fact*i;
			//System.out.println("I value is::"+i);
		}
		System.out.println("Fact value is::"+fact);

	}

}
