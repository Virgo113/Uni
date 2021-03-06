package model;

import java.util.ArrayList;

public class CorsoLaurea {

	 private String nome;
	 public static final int MIN_CREDITI = 90;
	 public static int prossimaMatricola = 1;
	
	 private ArrayList<Studente> immatricolati;
	 private ArrayList<Esame> esamiCorso; 
	

	public CorsoLaurea(String nome) {
		
		this.immatricolati = new ArrayList<>();
		this.nome = nome;
		this.esamiCorso = new ArrayList<>();
		
		
	}

	public String getNome() {
		return nome;
	}
	
	
	//iscriviamo studente a corso laurea
	 public void iscrivi(String nomeStudente) {
		
		 Studente s = new Studente(nomeStudente, prossimaMatricola);
		 for (Esame esame : esamiCorso) {
			 s.aggiungiEsame(esame.getNome(), esame.getCrediti());
		 }
		 prossimaMatricola++;
		
		 System.out.println("Ciao " + nomeStudente + ", ti sei iscritto con successo");
		
		 immatricolati.add(s);
	}
	
	 //iscriviamo con un array inserito
	 public void iscrivi(String nomeStudente, ArrayList<Esame> esamiCorso) {
		 
		 Studente s = new Studente(nomeStudente, prossimaMatricola);
		 for (Esame esame : esamiCorso) {
			 s.aggiungiEsame(esame.getNome(), esame.getCrediti());
		 }
		 prossimaMatricola++;
		 
		 System.out.println("Ciao " + nomeStudente + ", ti sei iscritto con successo");
		 
		 immatricolati.add(s);
	 }

	 
	 //rimuovo studente dal corso
	 public void ritira(String nomeStudente) {
		 for (int i = 0; i < immatricolati.size(); i++) {
			
			 if (immatricolati.get(i).getNome().equals(nomeStudente)) {
				 
				immatricolati.remove(i);
				System.out.println(nomeStudente + ": TI SEI RITIRATO DAL CORSO! :(");
			}//if
			 
		}//for
		System.out.println(immatricolati.toString());
	}
	
	
	public void appello(String nomeEsame, ArrayList<Studente> iscritti) {
		
		int voto = 0;
		
		for (Studente studente : iscritti) {
			
			voto = (int) (Math.random() * 30);
			
			studente.promosso(nomeEsame, voto);
			//System.out.println(voto);
			
		}
		
		
	}
	
	public ArrayList<Studente> getImmatricolati() {
		return immatricolati;
	}
	
	public void laurea() {
		
		for (Studente studente : immatricolati) {
			if (studente.crediti() >= MIN_CREDITI) {
				
				System.out.println(studente.getNome() + " SEI LAUREATO!!" + " con " + (int) (studente.media()/3)*11);
			}
			
		}
		
	}
	
}
