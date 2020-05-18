import java.util.Scanner;
public class SimpleCalculator
	{
		public static void main(String[] args)
			{
				Scanner s = new Scanner(System.in);
				System.out.print("enter your first number: ");
				int a = s.nextInt();				//accepting the first number from input
				System.out.print("enter your second number: ");
				int b = s.nextInt();				//accepting the first number from input
				s.nextLine();					//accepting the next line because of Scanner bug
				System.out.print("enter your operator: ");
				char x = s.nextLine().charAt(0);		//accepting the character from input
				int result=0;					//declaring the initial value for result
		switch(x)
				{
					case '+' :
						{
							result = a+b;
							break;
						}
			
					case '-' :
						{
							result = a-b;
							break;
						}	
		
					case '*' :
						{
							result = a*b;
							break;
						}	
			
					case '/' :
						{
							result = a/b;
							break;
						}	

					default:
						{
							System.out.println("Invalid operant!!!");
						}
				}
				System.out.println("your result: " + result);		//output is printed...
			}
	}

	