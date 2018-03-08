
/**
 * @author Phil
 * 2018-03-08
 */
public class Mwst {

	public static void main(String[] args) {
		double mwst = 0.19;
		double betrag = 100;
		
		System.out.printf("Netto %.2f %n", + betrag); 
		System.out.printf("MWST: %.2f %n", + mwst * betrag);
		System.out.printf("Brutto: %.2f %n", + ((betrag*mwst) + betrag)); //wichtig nicht println sondern printf nutzen

	}

}
