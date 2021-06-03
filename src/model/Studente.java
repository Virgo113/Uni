package model;

import java.util.ArrayList;

public class Studente {

	private String nome;
	private int matricola;

	private ArrayList<Esame> esamiSostenuti; //esami promozione
	private ArrayList<Esame> pianoStudio; //esami da dover dare

	public Studente(String nome, int matricola) {
		
		this.pianoStudio = new ArrayList<>();
		this.esamiSostenuti = new ArrayList<>();
		
		this.nome = nome;
		this.matricola = matricola;
	}
	
	
	/**
	 * @param nome = immetto una stringa per il nome studente
	 * @param matricola = immetto un int per la matricola
	 * @param pianoStudio = immetto un ArrayList per immattere i vari esami da dover dare
	 */
	public Studente(String nome, int matricola, ArrayList<Esame> pianoStudio) {
		super();
		this.nome = nome;
		this.matricola = matricola;
		this.pianoStudio = pianoStudio;
		
		this.esamiSostenuti = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}

	public int getMatricola() {
		return matricola;
	}
	
	
	public void aggiungiEsame(String nomeEsame, int crediti) {
		
		Esame esami = new Esame(nomeEsame, crediti);
		
		pianoStudio.add(esami);		
	}
	
	
	//spostiamo un esame tra array
	public void promosso(String nomeEsame, int voto) {
		
		for (int i = 0; i < pianoStudio.size(); i++) {

			if (pianoStudio.get(i).getNome().equals(nomeEsame)) {
				if (voto >= 18) {
					pianoStudio.get(i).setVoto(voto);
					esamiSostenuti.add(pianoStudio.get(i));
					pianoStudio.remove(i);
					
					System.out.println( getNome() +  " SEI PASSATO CON" + voto + " !!");
					
				}//2 if
				else {
				System.out.println( getNome() + " NON LO HAI PASSATO!");
				}
			}//1 if
		}//for
		
	}

	
	/*
	 * public void promosso(String nomeEsame, int voto) { for (Esame esame :
	 * pianoStudio) { if (esame.getNome().equals(nomeEsame)) { if (voto >= 18) {
	 * esame.setVoto(voto); esamiSostenuti.add(esame); //pianoStudio.remove(esame);
	 * 
	 * System.out.println(getNome() + " SEI PASSATO CON " + voto + " !!"); }//2 if
	 * else { System.out.println(getNome() + " NON LO HAI PASSATO!"); } }//1 if
	 * }//for System.out.println("siamo qui");
	 * //<------------------------------------
	 * 
	 * }
	 */
	
	
	
	
	//cancelliamo un esame da piano studio
	public void cancella(String nomeEsame) {
		
		for (int i = 0; i < pianoStudio.size(); i++) {
			
			if (pianoStudio.get(i).getNome().equals(nomeEsame)) {
				pianoStudio.remove(i);
				
			}
		}
		
	}

	//facciamo la media
	public double media() {
		double somma = 0;
		double media = 0;
		
		for (Esame esame : esamiSostenuti) {
			somma = esame.getVoto() + somma;
			
		}
		
		media = somma/esamiSostenuti.size();
		
		return media;
	}
	
	public int crediti() {
		int creditiTot = 0;
		
		for (Esame esame : esamiSostenuti) {
			creditiTot = esame.getCrediti() + creditiTot;
			
		}
		
		return creditiTot;
	}

	@Override
	public String toString() {

//		return "Studente [nome=" + nome + ", matricola=" + matricola + ", esamiSostenuti=" + esamiSostenuti
//				+ ", pianoStudio=" + pianoStudio + ", media()=" + media() + ", crediti()=" + crediti() + "]";
		
		
		StringBuilder sb = new StringBuilder("\n");
		
		sb.append("Studente: " + nome);
		
		sb.append(" Matricola: " + matricola);
		
		sb.append(" PianoStudio: " + pianoStudio);
		
		sb.append(" Esami sostenuti: " + esamiSostenuti);
	
		sb.append(" Media: " + media());
		
		sb.append(" Crediti: " + crediti());
		
		sb.append("\n");
	
		return sb.toString();
	
	}
	
	
	
}
