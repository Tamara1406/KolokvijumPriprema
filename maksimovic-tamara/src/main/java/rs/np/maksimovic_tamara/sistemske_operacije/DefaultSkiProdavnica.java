package rs.np.maksimovic_tamara.sistemske_operacije;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import rs.np.maksimovic_tamara.domenske_klase.Skije;
/**
 * Implementira interfejs SkiProdavnica i predstavlja ski prodavnicu koja prodaje i iznajmljuje skije
 * 
 * @author Tamara Maksimovic
 *
 */
public class DefaultSkiProdavnica implements SkiProdavnica {
	/**
	 * Lista skija koje se nalaze u prodavnici
	 */
	private List<Skije> sveSkije = new ArrayList<Skije>();

	@Override
	public void nabaviSkije(Skije skije) {
		if (skije == null)
			throw new NullPointerException();
		
		if (!sveSkije.contains(skije))
			sveSkije.add(skije);
		else {
			int indeks = sveSkije.indexOf(skije);
			
			Skije s = sveSkije.get(indeks);
			
			s.setKolicina(s.getKolicina() + skije.getKolicina());
		}
	}

	@Override
	public void prodajSkije(Skije skije) {
		if (!sveSkije.contains(skije))
			throw new IllegalArgumentException();
		
		int indeks = sveSkije.indexOf(skije);
		
		Skije s = sveSkije.get(indeks);
		
		s.setKolicina(s.getKolicina() - skije.getKolicina());
	}

	@Override
	public List<Skije> vratiSveSkije() {
		return sveSkije;
	}

	
	@Override
	public String serijalizujJSON() {
		Gson gson = new Gson();
		return gson.toJson(sveSkije);
	}
	

	@Override
	public void deserijalizujJSON(String adresa) {
		try(FileReader in = new FileReader(adresa)) {
			Gson gson = new Gson();
			Skije s = gson.fromJson(in, Skije.class);
			nabaviSkije(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
