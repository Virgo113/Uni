package model;

public class Esame {
	
	private String nome;
	private int crediti;
	private int voto;
	public Esame(String nomeEsame, int crediti) {
		
		this.nome = nomeEsame;
		this.crediti = crediti;
	}
	
	
	public int getVoto() {
		return voto;
	}
	
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCrediti() {
		return crediti;
	}
	
	
	@Override
	public String toString() {
		return "Esame " + nome + ", crediti=" + crediti + ", voto=" + voto;
	}
	
	
	
	
}