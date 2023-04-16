package rs.np.maksimovic_tamara.domenske_klase;

import java.util.Objects;
/**
 * Klasa koja predstavlja skije kao sportsku opremu. Svaka skije sadrzi marku, model, duzinu, kolicinu i cenu kao atribute
 * 
 * @author Tamara Maksimovic
 *
 */
public class Skije {
	/**
	 * Marka i model skija kao String
	 */
	private String markaModel;
	/**
	 * Duzina skija u centimetrima
	 */
	private int duzina;
	/**
	 * Kolicina skija u prodavnici na stanju
	 */
	private int kolicina;
	/**
	 * Cena skija u prodavnici
	 */
	private int cena;
	
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * Postavlja marku i model skija na zadatu vrednost
	 * @param markaModel marka i model skija. Ne smeju biti null niti manji od 2
	 * 
	 * @throws NullPointerException ako je uneta vrednost null
	 * @throws IllegalArgumentException ako je duzina unetog stringa manja od 2
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException();
		
		if (markaModel.length() < 2)
			throw new IllegalArgumentException();
		
		this.markaModel = markaModel;
	}

	public int getDuzina() {
		return duzina;
	}
	/**
	 * Postavlja duzinu skija
	 * @param duzina Duzina skija. Ne sme biti manja od 0 niti veca od 225
	 * 
	 * @throws IllegalArgumentException ako je uneta duzina manja od 0 ili ako je veca od 225
	 */
	public void setDuzina(int duzina) {
		if (duzina < 0 || duzina > 225)
			throw new IllegalArgumentException();
		
		this.duzina = duzina;
	}

	public int getKolicina() {
		return kolicina;
	}
	/**
	 * Postavlja kolicinu skija na stanju
	 * @param kolicina Broj skija. Ne sme biti manji od 0
	 * 
	 * @throws IllegalArgumentException ako je uneta kolicina manja od 0
	 */
	public void setKolicina(int kolicina) {
		if (kolicina < 0)
			throw new IllegalArgumentException();	
			
		this.kolicina = kolicina;
	}

	public int getCena() {
		return cena;
	}
	/**
	 * Postavlja cenu skija u prodaji
	 * @param cena Cena skija. Ne sme biti manja od 0
	 * 
	 * @throws IllegalArgumentException ako je uneta vrednost manja od 0
	 */
	public void setCena(int cena) {
		if (cena < 0)
			throw new IllegalArgumentException();
		
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Skije [markaModel=" + markaModel + ", duzina=" + duzina + ", kolicina=" + kolicina + ", cena=" + cena
				+ "]";
	}
	/**
	 * Vraca hash izracunat na osnovu duzine skija i marke i modela skija
	 * 
	 * @return hash code izracunat na osnovu duzine i marke i modela
	 */
	@Override
	public int hashCode() {
		return Objects.hash(duzina, markaModel);
	}
	/**
	 * Poredi dva para skija po duzini, marki i modelu
	 * 
	 * @param obj Objekat koji uporedjujemo, drugi par skija
	 * 
	 * @return true ako su parovi skija isti, a false ako su razliciti
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skije other = (Skije) obj;
		return duzina == other.duzina && Objects.equals(markaModel, other.markaModel);
	}

}
