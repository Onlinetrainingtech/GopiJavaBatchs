import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		int i=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}

	}

}
