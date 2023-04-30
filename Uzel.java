package uzlyVeStyluGrafu;

import java.util.Vector;

public class Uzel {
	private String nazev;
	
	private Vector<Uzel> sousede = new Vector<>();

	public Uzel(String nazev) {
		super();
		this.nazev = nazev;
	}

	public void pridejUzel(Uzel pridanyUzel) {
		sousede.add(pridanyUzel);
	}
	
	public void vypisUzly() {
		for (Uzel uzel : sousede) {
			System.out.println(uzel);
		}
	}
	
	public int pocetUzlu() {
		return sousede.size();
		
	}

	@Override
	public String toString() {
		return "Adresar je: " + nazev;
	}
	
	
}
