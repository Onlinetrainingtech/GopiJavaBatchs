
public class StrictfpConcepts 
{
	public  double add(double a,double b)
	{
		return a+b;
	}
	public  double multiply(double a,double b)
	{
		return a*b;
	}
   public static void main(String args[])
   {
	   StrictfpConcepts example=new StrictfpConcepts();
	   double num1=10.12223344;
	   double num2=2.999798668;
	   double sum=example.add(num1, num2);
	   double product=example.multiply(num1, num2);
	   System.out.println("Sum value is::"+sum);
	   System.out.println("Product value is::"+product);
   }
}
