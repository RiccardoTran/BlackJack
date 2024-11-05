package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Mano {
	private List<Carta> mano;
	//private int denaro; 
	//scommesse ancora da aggiungere
	private String risposta;
	boolean hit=true;
	public Mano(List<Carta> mano) {
		this.mano=mano;
	}
	public Mano() {
		this(new ArrayList<Carta>());
	}
	public int getValoreMano() {
		int valore=0;
		boolean asso=false;
		boolean primoAsso=true;
		for(int i=0;i<mano.size(); i++) {	
			valore+=mano.get(i).getValore(); //da rivedere per valore dell'asso
			if(mano.get(i).getNomeCarta().equals("Asso")) 
				if(valore<11&&!asso) { 
					valore+=10;
					asso=true;	//tecnicamente se trovi due assi, il primo vale 11 e dal secondo in poi valgono 1	
				}
			if(valore>21&&asso&&primoAsso) {
				valore-=10;
				primoAsso=false; //previene un caso in cui non sballeresti mai
				}
			}
		return valore;

		}
	public Carta getCartaNumero(int i) {
		return this.mano.get(i);
	}
	public String mostraMano() {
		String s="";
		for(int i=0; i<mano.size(); i++) s+=mano.get(i).toString();
		return s;
	}
	
	public void aggiungiCartaAllaMano(Mazzo m) {
		this.mano.add(m.pescaCarta());

	}
	public void svuotaMano() {
		this.mano.clear();
	}
	public String getRisposta() {
		return risposta;
	}
	public void setRisposta(String risposta) {
		this.risposta = risposta;
		if(risposta.equalsIgnoreCase("hit")) this.hit=true; 
		else this.hit=false;
	}
	public boolean isHit() {
		return hit;
	}
	public void setHit(boolean hit) {
		this.hit = hit;
	}
	public boolean blackjack() {
		boolean blackjack=false;
		if((mano.get(0).getNomeCarta().equalsIgnoreCase("asso")&&mano.get(1).getValore()==10)||
				(mano.get(1).getNomeCarta().equalsIgnoreCase("asso")&&mano.get(0).getValore()==10))
			blackjack=true;
		return blackjack;
	}
	
	
}
