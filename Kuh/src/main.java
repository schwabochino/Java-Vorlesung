class Kuh
{
	char name = "Elsa";
	char nachname;// = Euter;
	int geburtsjahr; // = 1998;
	float gewicht;
	
	char get_name()
	{
		return name;
	}
	char get_nachname()
	{
		return nachname;
	}
	int get_geburtsjahr()
	{
		return geburtsjahr;
	}
	float get_gewicht()
	{
		return gewicht;
	}
}
public class main {

	public static void main(String[] args) {
		Kuh k1 = new Kuh();
		System.out.println(k1.get_name());
		
	}

}
