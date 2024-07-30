package collezioni;

import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;

public class Parolacce {

	public static void main(String[] args) {
		try {
			Files
				.readAllLines(Paths.get("C:\\Users\\angel\\Downloads\\1000_parole_italiane_comuni.txt"))
				.stream()
//				.filter(p ->p.length()==5)
				.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
