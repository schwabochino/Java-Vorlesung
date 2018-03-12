
public class schleifen 
{

	public static void main(String[] args) 
	{
		int y=0 , i=0;
		for (i=0; i<=90; i++) //Schleife z�hlt bis 9 hoch
		{
			for (y=0; y<i; y++) //vergleicht i und y und gibt dann solange i aus bis y>i
			{
				System.out.printf("%d",+ i);	
			}
			System.out.printf("\n");							//Zeilenumbruch
		}
		

	}

}
