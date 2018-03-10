/*Die Variablen a, b, c sind vom Typ long und mit beliebigen Zahlen belegt. 
Wie bekommt man das Minimum auf dem Bildschirm angezeigt?*/
public class Variablen {

	public static void main(String[] args) {
		long a, b, c, minimum;
		a=0;
		b=1;
		c=2;
		
		System.out.println("Minimum: "+ Math.min(Math.min(a, b),c));

	}

}
