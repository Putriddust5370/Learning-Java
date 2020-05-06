import java.util.Scanner;
public class Class8
{
	public static void main(String[] args)
		{
		
			System.out.println("guess the number...");
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			x(num);
		}
	public static void x(int num)
		{
			final int actualNumber = 33;
			if(num == 33)
				{
					System.out.println("Congrats, you have guessed the right number!!....");
					
				}
			 else if(num>33 && num<43)
				{
					int difference = (num - actualNumber);
					System.out.println("oops, it looks like you are close and the difference is :  " + difference);
					repeat(num);
				}
			 else if(num>43)
				{
					int difference = (num - actualNumber);
					System.out.println("ooh, thats not even close..but dont loose hope , try again. your difference is :  " + difference);
					repeat(num);
				}
			 else if(num<33 && num>23)
				{
					int difference = (num - actualNumber);
					System.out.println("oops, it looks like you are close and the difference is :  " + difference);
					repeat(num);
				}
			else
				{
					int difference = (actualNumber - num);
					System.out.println("ooh, thats not even close..but dont loose hope , try again. your difference is :  " + difference);
					repeat(num);
				}

		}	
	public static void repeat(int n)
		{
			Scanner r = new Scanner(System.in);
			System.out.println("TRY AGAIN :");
			int num1= r.nextInt();
			x(num1);
		}
}
			