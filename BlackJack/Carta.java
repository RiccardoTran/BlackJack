package BlackJack;

public class Carta {
	private String nomeCarta;
	private String seme;
	private String colore;
	private int valore;
	
	public Carta(String nomeCarta, String seme, String colore, int valore) {
		this.nomeCarta=nomeCarta;
		this.seme=seme;
		this.colore=colore;
		this.valore=valore;
	}
	public Carta() {
		this("","","",0);
	}
	public String getNomeCarta() {
		return nomeCarta;
	}
	public String getSeme() {
		return seme;
	}
	public String getColore() {
		return colore;
	}
	public int getValore() {
		return valore;
	}
	
	public String toString() {
		return "("+nomeCarta+", "+seme+", "+colore+") ";
	}
}
