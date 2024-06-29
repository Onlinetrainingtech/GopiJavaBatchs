
public class OperatorsP1
{
   void ArithmeticOperators()
   {
	   int a=100,b=200;
	   System.out.println("Adding::"+(a+b));
	   System.out.println("Sub::"+(a-b));
	   System.out.println("Mult::"+(a*b));
	   System.out.println("Division::"+(a/b));
	   System.out.println("Module::"+(a%b));
   }
   void logicalOperator()
   {
	   int a1=100,b1=200;
	   System.out.println("LogicalAND::"+((a1<b1)&&(b1>a1)));
	   System.out.println("LogicalOR::"+((a1>b1)||(b1>a1)));
	   System.out.println("LogicalNOT::"+(!(a1>b1)));
   }
   void BitwiseOperator()
   {
	   int a=2,b=3;
	   System.out.println("BitWiseAND::"+((a&b)));//2
	   System.out.println("BitWiseOR::"+((a|b)));//3
	   System.out.println("BitWiseXOR::"+((a^b)));//1
	   System.out.println("Leftshift::"+(a<<1));
	   System.out.println("RightShift::"+(a>>1));
	   
   }


	public static void main(String[] args) {
		
		OperatorsP1 f1=new OperatorsP1();
		//f1.ArithmeticOperators();
		//f1.logicalOperator();
		f1.BitwiseOperator();

	}

}
