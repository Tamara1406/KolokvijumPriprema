package rs.np.maksimovic_tamara.sistemske_operacije;

import java.util.List;

import rs.np.maksimovic_tamara.domenske_klase.Skije;

public interface SkiProdavnica {
	
	public void nabaviSkije(Skije skije);
	
	public void prodajSkije(Skije skije);
	
	public List<Skije> vratiSveSkije();

	public String serijalizujJSON();
	
	public void deserijalizujJSON( String adresa);
}
