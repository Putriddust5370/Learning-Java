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
					System.out.print("x: ");	//bro, how can i reduce the repetation of the raw 13 to 17?
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
					System.out.print("y: ");  /** but bro, here also we have to change the data type from int to double, then only it works,
									anyway, thank you bro..*/
					int y = s.nextInt();
					division( x , y );	//Not so! You can send an int type to a parameter that needs a double and Java will convert.
				}	//I mean it's good practice to make the change so that all your types match up, but 'technically' you don't NEED to.
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
		public static void division(double x , double y)
			{
				double quotient = x / y ; /*Since Java always rounds down,and you had two ints being divided,
								rounding error occurs, and THEN you save as double. Now, you 
								divide with doubles, no error.*/
				System.out.printf("QUOTIENT: %.3f ", quotient);
 //bro, check out here the value of 3/2 it is giving a wrong answer
			}
	}
			
			
	
