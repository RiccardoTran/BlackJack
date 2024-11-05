package BlackJack;
import java.util.*;
public class Mazzo{
	private static final String ASSO="Asso";
	private static final String DUE="Due";
	private static final String TRE="Tre";
	private static final String QUATTRO="Quattro";
	private static final String CINQUE="Cinque";
	private static final String SEI="Sei";
	private static final String SETTE="Sette";
	private static final String OTTO="Otto";
	private static final String NOVE="Nove";
	private static final String DIECI="Dieci";
	private static final String JACK="Jack";
	private static final String REGINA="Regina";
	private static final String RE="Re";
	private static final String CUORI="Cuori";
	private static final String QUADRI="Quadri";
	private static final String PICCHE="Picche";
	private static final String FIORI="Fiori";
	private static final String ROSSO="Rosso";
	private static final String NERO="Nero";




	private List<Carta> mazzo;
	private int carteRimaste;
	
	private Carta c01 = new Carta(ASSO,CUORI,ROSSO,1);
	private Carta c02 = new Carta(ASSO,QUADRI,ROSSO,1);
	private Carta c03 = new Carta(ASSO,PICCHE,NERO,1);
	private Carta c04 = new Carta(ASSO,FIORI,NERO,1);
	private Carta c05 = new Carta(DUE,CUORI,ROSSO,2);
	private Carta c06 = new Carta(DUE,QUADRI,ROSSO,2);
	private Carta c07 = new Carta(DUE,PICCHE,NERO,2);
	private Carta c08 = new Carta(DUE,FIORI,NERO,2);
	private Carta c09 = new Carta(TRE,CUORI,ROSSO,3);
	private Carta c10 = new Carta(TRE,QUADRI,ROSSO,3);
	private Carta c11 = new Carta(TRE,PICCHE,NERO,3);
	private Carta c12 = new Carta(TRE,FIORI,NERO,3);
	private Carta c13 = new Carta(QUATTRO,CUORI,ROSSO,4);
	private Carta c14 = new Carta(QUATTRO,QUADRI,ROSSO,4);
	private Carta c15 = new Carta(QUATTRO,PICCHE,NERO,4);
	private Carta c16 = new Carta(QUATTRO,FIORI,NERO,4);
	private Carta c17 = new Carta(CINQUE,CUORI,ROSSO,5);
	private Carta c18 = new Carta(CINQUE,QUADRI,ROSSO,5);
	private Carta c19 = new Carta(CINQUE,PICCHE,NERO,5);
	private Carta c20 = new Carta(CINQUE,FIORI,NERO,5);
	private Carta c21 = new Carta(SEI,CUORI,ROSSO,6);
	private Carta c22 = new Carta(SEI,QUADRI,ROSSO,6);
	private Carta c23 = new Carta(SEI,PICCHE,NERO,6);
	private Carta c24 = new Carta(SEI,FIORI,NERO,6);
	private Carta c25 = new Carta(SETTE,CUORI,ROSSO,7);
	private Carta c26 = new Carta(SETTE,QUADRI,ROSSO,7);
	private Carta c27 = new Carta(SETTE,PICCHE,NERO,7);
	private Carta c28 = new Carta(SETTE,FIORI,NERO,7);
	private Carta c29 = new Carta(OTTO,CUORI,ROSSO,8);
	private Carta c30 = new Carta(OTTO,QUADRI,ROSSO,8);
	private Carta c31 = new Carta(OTTO,PICCHE,NERO,8);
	private Carta c32 = new Carta(OTTO,FIORI,NERO,8);
	private Carta c33 = new Carta(NOVE,CUORI,ROSSO,9);
	private Carta c34 = new Carta(NOVE,QUADRI,ROSSO,9);
	private Carta c35 = new Carta(NOVE,PICCHE,NERO,9);
	private Carta c36 = new Carta(NOVE,FIORI,NERO,9);
	private Carta c37 = new Carta(DIECI,CUORI,ROSSO,10);
	private Carta c38 = new Carta(DIECI,QUADRI,ROSSO,10);
	private Carta c39 = new Carta(DIECI,PICCHE,NERO,10);
	private Carta c40 = new Carta(DIECI,FIORI,NERO,10);
	private Carta c41 = new Carta(JACK,CUORI,ROSSO,10);
	private Carta c42 = new Carta(JACK,QUADRI,ROSSO,10);
	private Carta c43 = new Carta(JACK,PICCHE,NERO,10);
	private Carta c44 = new Carta(JACK,FIORI,NERO,10);
	private Carta c45 = new Carta(REGINA,CUORI,ROSSO,10);
	private Carta c46 = new Carta(REGINA,QUADRI,ROSSO,10);
	private Carta c47 = new Carta(REGINA,PICCHE,NERO,10);
	private Carta c48 = new Carta(REGINA,FIORI,NERO,10);
	private Carta c49 = new Carta(RE,CUORI,ROSSO,10);
	private Carta c50 = new Carta(RE,QUADRI,ROSSO,10);
	private Carta c51 = new Carta(RE,PICCHE,NERO,10);
	private Carta c52 = new Carta(RE,FIORI,NERO,10);
	
	public Mazzo(List<Carta> mazzo) {
		this.mazzo=mazzo;
	}
	
	public Mazzo(){
		this(new ArrayList<Carta>());
	}
	public int getCarteRimaste() {
		return mazzo.size();
	}

	

	public void nuovoMazzo(){
		this.mazzo.clear();
		this.mazzo.add(c01);
		this.mazzo.add(c02);
		this.mazzo.add(c03);
		this.mazzo.add(c04);
		this.mazzo.add(c05);
		this.mazzo.add(c06);
		this.mazzo.add(c07);
		this.mazzo.add(c08);
		this.mazzo.add(c09);
		this.mazzo.add(c10);
		this.mazzo.add(c11);
		this.mazzo.add(c12);
		this.mazzo.add(c13);
		this.mazzo.add(c14);
		this.mazzo.add(c15);
		this.mazzo.add(c16);
		this.mazzo.add(c17);
		this.mazzo.add(c18);
		this.mazzo.add(c19);
		this.mazzo.add(c20);
		this.mazzo.add(c21);
		this.mazzo.add(c22);
		this.mazzo.add(c23);
		this.mazzo.add(c24);
		this.mazzo.add(c25);
		this.mazzo.add(c26);
		this.mazzo.add(c27);
		this.mazzo.add(c28);
		this.mazzo.add(c29);
		this.mazzo.add(c30);
		this.mazzo.add(c31);
		this.mazzo.add(c32);
		this.mazzo.add(c33);
		this.mazzo.add(c34);
		this.mazzo.add(c35);
		this.mazzo.add(c36);
		this.mazzo.add(c37);
		this.mazzo.add(c38);
		this.mazzo.add(c39);
		this.mazzo.add(c40);
		this.mazzo.add(c41);
		this.mazzo.add(c42);
		this.mazzo.add(c43);
		this.mazzo.add(c44);
		this.mazzo.add(c45);
		this.mazzo.add(c46);
		this.mazzo.add(c47);
		this.mazzo.add(c48);
		this.mazzo.add(c49);
		this.mazzo.add(c50);
		this.mazzo.add(c51);
		this.mazzo.add(c52);
		this.carteRimaste=mazzo.size();

	}
	
	public void rimuoviCarta(int posizione) {
		this.mazzo.remove(posizione);
	}
	public Carta pescaCarta() {
		int random = (int)(Math.random()*this.carteRimaste);
		Carta c = this.mazzo.get(random); 
		this.mazzo.remove(random);
		this.carteRimaste--;
		return c;
	}

}
