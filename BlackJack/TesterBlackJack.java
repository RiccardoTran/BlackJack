package BlackJack;
import java.util.*;
public class TesterBlackJack {
	//main funzionante a giocatore singolo
	public static void main(String[]args) {
		
		Banco banco = new Banco();
		Mano g1 = new Mano();
		Mazzo m = new Mazzo();
		Scanner tastiera = new Scanner(System.in);
		String risposta="";
		boolean sballato=false;
		System.out.println("Realizzato da Tran Riccardo @riccardotran_");
		System.out.println("Questo è BlackJack. Il giocatore e il banco pescano due carte. Il banco mostra la prima delle tue carte,\nmentre tu puoi decidere di pescare (hit) o di restare con le tue carte (stay).\nL'obiettivo è di fare un punteggio maggiore del banco.");
		System.out.print("Vuoi giocare? (si/no)");
		risposta=tastiera.next();
		
		m.nuovoMazzo();
		if(risposta.equalsIgnoreCase("si"))
		do {
		if(m.getCarteRimaste()<20) {
			System.out.println("Nuovo mazzo.");
			m.nuovoMazzo();
		}
		sballato=false;
		risposta="";
		banco.aggiungiCartaAllaMano(m);
		banco.aggiungiCartaAllaMano(m);
		g1.aggiungiCartaAllaMano(m);
		g1.aggiungiCartaAllaMano(m);
		
		System.out.print("Carte del banco: ");
		System.out.println(banco.mostraManoCensurata());
		System.out.print("Le tue carte: ");
		System.out.println(g1.mostraMano());
		System.out.println("Carte Rimanenti: "+m.getCarteRimaste());
		while(g1.getValoreMano()<21&&!risposta.equalsIgnoreCase("Stay")&&!g1.blackjack()) {
			System.out.print("Cosa vuoi fare? (hit/stay)");
			 risposta = tastiera.next();

			if(risposta.equalsIgnoreCase("hit")) {
				g1.aggiungiCartaAllaMano(m);
				System.out.print("Le tue carte: ");
				System.out.println(g1.mostraMano());
		}	}
		System.out.println();
		if(!g1.blackjack())
		if(g1.getValoreMano()<=21) {
		banco.pescaSecondoLeRegole(m);
		System.out.print("Carte del banco: ");
		System.out.println(banco.mostraMano());
		System.out.println("Valore della tua mano: "+g1.getValoreMano());
		System.out.println("Valore del banco: "+banco.getValoreMano());
		}else {
			System.out.println("Hai sballato. Sconfitta ("+g1.getValoreMano()+")");
			sballato=true;
		}
		if(g1.blackjack()) System.out.println("Blackjack! Hai vinto"); else
		if(!sballato)
		if(g1.getValoreMano()>banco.getValoreMano()||banco.getValoreMano()>21) System.out.println("Vittoria!");
		else if(g1.getValoreMano()<banco.getValoreMano()) System.out.println("Sconfitta :(");
		else System.out.println("Pareggio.");
		g1.svuotaMano();
		banco.svuotaMano();
		System.out.print("\n Continuare? (si/no)");
		risposta=tastiera.next();
		System.out.println();
		}while(!risposta.equals("no"));
		
		System.out.println("Fine del gioco.");
		tastiera.close();
		
	}
	//main di prova con multigiocatore e multimazzo, ancora da ultimare e non funzionante
/*	public static void main(String[]args) {
		Scanner tastiera = new Scanner(System.in);
		int nGiocatori,nMazzi,i,mazzoSelezionato=0;
		do {
		System.out.println("Quanti giocatori ci sono?(1-5)");
	    nGiocatori= tastiera.nextInt();
		}while(!(nGiocatori>0&&nGiocatori<6));
		Mano [] giocatore= new Mano[nGiocatori];
		for(i=0; i<nGiocatori; i++)
			giocatore[i]=new Mano();
		do {
		System.out.println("Quanti mazzi ci sono? (1-8)");
			nMazzi=tastiera.nextInt();
			}while(!(nMazzi>0&&nMazzi<9));
		Mazzo[] mazzi = new Mazzo[nMazzi];
		for(i=0; i<nMazzi; i++)
			mazzi[i]=new Mazzo();
		Banco banco = new Banco();
		do {
			boolean sballato=false;
			int giocatoriCheStanno=0;
			if(mazzoSelezionato==nMazzi) mazzoSelezionato=0;
			banco.aggiungiCartaAllaMano(mazzi[mazzoSelezionato]);
			banco.aggiungiCartaAllaMano(mazzi[mazzoSelezionato]);
			System.out.println("Banco: "+banco.mostraManoCensurata());
			for(i=0;i<nGiocatori;i++) {
				giocatore[i].aggiungiCartaAllaMano(mazzi[mazzoSelezionato]);
				giocatore[i].aggiungiCartaAllaMano(mazzi[mazzoSelezionato]);
				System.out.println("Giocatore "+(i+1)+": "+giocatore[i].mostraMano());
			}//distribuisce due carte per ciascuno
			do {
			for(i=0;i<nGiocatori;i++) {
				if(giocatore[i].getValoreMano()<21&&giocatore[i].isHit()) {
				System.out.print("Giocatore "+i+" cosa vuoi fare?(hit/stay) ");
				String risposta = tastiera.next();
				giocatore[i].setRisposta(risposta);
				}else giocatore[i].setRisposta("stay");
			}
			for(i=0;i<nGiocatori;i++) {
				if(giocatore[i].isHit())
					giocatore[i].aggiungiCartaAllaMano(mazzi[mazzoSelezionato]);
				else giocatoriCheStanno++;
			}
			
			}while(giocatoriCheStanno==nGiocatori);
			
			System.out.println("\n"+"Banco: "+banco.mostraMano());
			
			for(i=0;i<nGiocatori;i++) {
				System.out.print("Giocatore "+(i+1) +": "+giocatore[i].mostraMano() );
				if(giocatore[i].getValoreMano()>21) System.out.println("Sballato!"); else
				if(giocatore[i].getValoreMano()==21) System.out.println("BlackJack!"); else
				if(giocatore[i].getValoreMano()>banco.getValoreMano()) System.out.println("Vittoria!");
				else if(giocatore[i].getValoreMano()<banco.getValoreMano()) System.out.println("Sconfitta!");
				else if(giocatore[i].getValoreMano()==banco.getValoreMano()) System.out.println("Pareggio.");
			}
			
			
			mazzoSelezionato++;
		}while(false);
		tastiera.close();
	
}*/
}
