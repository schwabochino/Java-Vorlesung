
//Schreibe ein Programm, welches das Maximum von Sinus(0,1) 
//und Kosinus(0,8) ausgibt. Es sollte doch schon eine 
//max(...)-Methode geben, oder?

public class Mathe 
{

	public static void main(String[] args) 
	{

		double sinus = Math.sin(0.1);
		double cosinus = Math.cos(0.8);
		
		double maximum=0;
		maximum = Math.max(sinus, cosinus);
		System.out.println("Maximum = "+ maximum);
	}

}
