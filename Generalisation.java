public class Generalisation
{
	public static void main(String[] args)
		{

		int i = 1;
		int col = 5;
		int raw = 7;
		
		while(i<=raw)
			{
				printraw(i , raw);
				i+=1;
			}
		

		}
	public static void printraw(int n , int col)
		{
			
			
			int i = 1;
			while(i <= col)
			{
				System.out.printf("%4d", n * i);
				i = i + 1;
			}
			System.out.println();
		}
	


}