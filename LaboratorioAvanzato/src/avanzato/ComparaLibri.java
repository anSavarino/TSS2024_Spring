package avanzato;

import java.util.List;

public class ComparaLibri {

	public static void main(String[] args) {
		Libro l1 = new Libro();
		l1.titolo = "i malavoglia";
		l1.pagine = 100;
		l1.prezzo = 1000;
		
		Libro l2 = new Libro();
		l2.titolo = "I malavoglia";
		l2.pagine = 100;
		l2.prezzo = 10;
		
		List.of(l1,l2).stream().sorted((a,b) -> Double.compare(a.prezzo, b.prezzo) ).forEach(l->System.out.println(l.titolo));
//		System.out.println(l1.equals(l2));
	}
}
