package BlackJack;
import java.util.*;

public class Banco{
	private List<Carta> banco;
	public Banco(List<Carta> banco) {
			this.banco=banco;
		}
	public Banco() {
			this(new ArrayList<Carta>());
		}

	public void aggiungiCartaAllaMano(Mazzo m) {
		this.banco.add(m.pescaCarta());
	}
	public Carta getCartaNumero(int i) {
		return this.banco.get(i);
	}
	public void svuotaMano() {
		this.banco.clear();
	}
	public void pescaSecondoLeRegole(Mazzo m) { //il banco deve pescare seguendo certe regole, per cui va fatto un metodo apposito
		while(getValoreMano()<17) aggiungiCartaAllaMano(m);
	}
	
	public int getValoreMano() {
		int valore=0;
		boolean asso=false;
		boolean primoAsso=true;
		for(int i=0;i<banco.size(); i++) {	
			valore+=banco.get(i).getValore(); //da rivedere per valore dell'asso
			if(banco.get(i).getNomeCarta().equals("Asso")) 
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
	
	public String mostraMano() {
		String s="";
		for(int i=0; i<banco.size(); i++) s+=banco.get(i).toString();
		return s;
	}
	public String mostraManoCensurata() {
		String s="";
		s+=banco.get(0).toString();
		s+="(***,***,***)";
		return s;
	}
		
}
