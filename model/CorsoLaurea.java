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
		 
		 immatricolati.add(s);
	}
	 
	 //rimuovo studente dal corso
	 public void ritira(String nomeStudente) {
		 
		 for (Studente studente : immatricolati) {
			
			 if (studente.getNome().equals(nomeStudente)) {
				 
				immatricolati.remove(studente);
			}//if
		}//for
		
	}
	
	
	public void appello(String nomeEsame, ArrayList<Studente> iscritti) {
		
		int voto = 0;
		
		for (Studente studente : iscritti) {
			
			voto = (int) (Math.random() * 30);
			
			studente.promosso(nomeEsame, voto);
			System.out.println(voto);
			
		}
		
		
	}
	
	public ArrayList<Studente> getImmatricolati() {
		return immatricolati;
	}
	
	public void laurea() {
		
		for (Studente studente : immatricolati) {
			if (studente.crediti() >= MIN_CREDITI) {
				
				System.out.println("SEI LAUREATO!!");
			}
			
		}
		
	}
	
}
