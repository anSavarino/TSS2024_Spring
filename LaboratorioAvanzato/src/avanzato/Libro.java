package avanzato;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

	String titolo;
	int pagine;
	double prezzo;
	
	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pagine, prezzo, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return pagine == other.pagine && Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo)
				&& Objects.equals(titolo, other.titolo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titolo=");
		builder.append(titolo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Libro o) {
		return this.titolo.compareTo(o.titolo);
	}
	
	
	
	
}
