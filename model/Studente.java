package model;

import java.util.ArrayList;

public class Studente {

	private String nome;
	private int matricola;

	private ArrayList<Esame> esamiSostenuti; //esami promozione
	private ArrayList<Esame> pianoStudio; //esami da dover dare

	public Studente(String nome, int matricola) {
		
		this.pianoStudio = new ArrayList<Esame>();
		this.esamiSostenuti = new ArrayList<Esame>();
		
		this.nome = nome;
		this.matricola = matricola;
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
	
	
//	public void aggiungiEsamiSostenuti(String nomeEsame, int crediti, int voto) {
//		
//		Esame esami = new Esame(nomeEsame, crediti);
//		esami.setVoto(voto);
//		esamiSostenuti.add(esami);
//		
//	}
	//spostiamo un esame tra array
	public void promosso(String nomeEsame, int voto) {
		for (Esame esame : pianoStudio) {
			System.out.println("siamo qui"); //<------------------------------------
			if (esame.getNome().equals(nomeEsame)) {
				if (voto >= 18) {
					esame.setVoto(voto);
					esamiSostenuti.add(esame);
					pianoStudio.remove(esame);
					
					System.out.println("sei passato con" + voto);
				}//2 if
				else {
				System.out.println("NON LO HAI PASSATO!");
				}
			}//1 if
		}//for
		
		
	}
	
	//cancelliamo un esame da piano studio
	public void cancella(String nomeEsame) {
		
		for (Esame esame : pianoStudio) {
			if (esame.getNome().equals(nomeEsame)) {
				pianoStudio.remove(esame);
				
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
		return "Studente [nome=" + nome + ", matricola=" + matricola + ", esamiSostenuti=" + esamiSostenuti
				+ ", pianoStudio=" + pianoStudio + ", media()=" + media() + ", crediti()=" + crediti() + "]";
	}
	
	
	
	
	
	
}
