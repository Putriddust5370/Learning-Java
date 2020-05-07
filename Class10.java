import java.util.Scanner;
public class Class10
	{
		public static void main(String[] args)
			{
			Scanner s = new Scanner(System.in);
			System.out.println("press \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division");
			int a = s.nextInt();
			
			
			if( a == 1 )
				{
					System.out.print("x: ");
					int x = s.nextInt();
					System.out.print("y: ");
					int y = s.nextInt();
					addition( x , y );
				}
			else if( a == 2 )
				{
					System.out.print("x: ");
					int x = s.nextInt();
					System.out.print("y: ");
					int y = s.nextInt();
					subtraction( x , y );
				}
			else if( a == 3 )
				{
					System.out.print("x: ");
					int x = s.nextInt();
					System.out.print("y: ");
					int y = s.nextInt();
					multiplication( x , y );
				}
			else if ( a == 4 )
				{
					System.out.print("x: ");
					int x = s.nextInt();
					System.out.print("y: ");
					int y = s.nextInt();
					division( x , y );
				}
			
			}
			
		
		
		public static void addition(int x , int y)
			{
				int sum=x+y;
				System.out.println("SUM: " + sum);
			}
		public static void subtraction(int x , int y)
			{
				int sub = x-y;
				System.out.println("DIFFERENCE: " + sub);
			}
		public static void multiplication(int x , int y)
			{
				int product = x*y;
				System.out.println("PRODUCT: " + product);
			}
		public static void division(int x , int y)
			{
				double quotient = x / y ;
				System.out.printf("QUOTIENT: %.3f ", quotient);
 //bro, check out here the value of 3/2 it is giving a wrong answer
			}
	}
			
			
	