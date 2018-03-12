//collatz-Folge Berechnung. Wenn n gerade dann n/2 wenn ungerade 3n+1.
public class collatz 
{

	public static void main(String[] args) 
	{
		float n=100432;

		System.out.print(""+n);
		do
		{	
		if (n%2 == 0)
		{
			n=n/2;
			System.out.print(" ->"+n);
		}else if(n%2!=0)
		{
			n=3*n+1;
			System.out.print(" ->"+n);
		}
		}while(n!=1);

		
	}
}
