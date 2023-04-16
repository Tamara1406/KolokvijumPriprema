					package rs.np.maksimovic_tamara.sistemske_operacije;

import java.util.List;

import rs.np.maksimovic_tamara.domenske_klase.Skije;
/**
 * Interfejs koji prredstavlja prodavnicu skija u kojoj se mogu prodavati i iznajmljivati skije
 * 
 * @author Tamara Maksimovic
 *
 */
public interface SkiProdavnica {
	/**
	 * Dodaje skije na listu skija u prodavnici
	 * Ukoliko skije ne postoje u prodavnici dodaje ih, a ako vec postoji, samo povecava kolicinu tih skija za 1
	 * 
	 * @param skije Skije koje treba dodati u prodavnicu
	 * @throws NullPointerException ako su unete skije null
	 */
	public void nabaviSkije(Skije skije);
	/**
	 * Sklanja skije iz prodavnice, tj smanjuje stanje
	 * 
	 * @param skije Skije koje se brisu iz prodavnice
	 * 
	 * @throws IllegalArgumentException ako skije ne postoje u prodavnici
	 */
	public void prodajSkije(Skije skije);
	/**
	 * Vraca sve skije iz prodavnice
	 * 
	 * @return sve skije koje se nalaze u prodavnici
	 */
	public List<Skije> vratiSveSkije();
	/**
	 * Vraca string sa JSON reprezentacijom liste skija
	 * @return String sa JSON reprezentacijom liste skija
	 */
	public String serijalizujJSON();
	/**
	 * Ucitava domenski objekat sa te adrese i ubacuje ga u listu
	 * @param adresa Putanja do fajla
	 */
	public void deserijalizujJSON( String adresa);
}
