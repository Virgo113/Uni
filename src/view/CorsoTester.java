package view;

import java.util.ArrayList;

import model.CorsoLaurea;
import model.Esame;
import model.Studente;

public class CorsoTester {
	public static void main(String[] args) {
		
		CorsoLaurea c = new CorsoLaurea("Java");
		
		Esame[] esami = {
			new Esame("Array", 10),	
			new Esame("Classi", 6),	
			new Esame("Metodi", 90),	
			new Esame("ArrayList", 12),	
			new Esame("ArrayList2", 12),	
		};
		
		ArrayList<Esame> esamiDare = new ArrayList<Esame>();
		
		for (int i = 0; i < esami.length; i++) {
			
			esamiDare.add(esami[i]);
		}
		
				
		c.iscrivi("Francesco", esamiDare);
		c.iscrivi("Francesca", esamiDare);
		c.iscrivi("Filippo", esamiDare);
		c.iscrivi("Franco", esamiDare);
		c.iscrivi("Gianmarco", esamiDare);
		c.iscrivi("Giovanni", esamiDare);

		c.ritira("Giovanni");
		
		c.getImmatricolati().get(2).cancella("Classi");
		
		for (Studente studente : c.getImmatricolati()) {
			
			studente.cancella("ArrayList2");
			
		}

//			for (int j = 0; j < c.getImmatricolati().size(); j++) {
//				c.getImmatricolati().get(j).aggiungiEsame("Array", 10);
//			}
//		
//			for (int j = 0; j < c.getImmatricolati().size(); j++) {
//				c.getImmatricolati().get(j).aggiungiEsame("Metodi", 19);
//			}
//
//			for (int j = 0; j < c.getImmatricolati().size(); j++) {
//				c.getImmatricolati().get(j).aggiungiEsame("Classi", 6);
//			}

		//c.getImmatricolati().get(1).aggiungiEsame("Array", 18);
		//c.getImmatricolati().get(2).aggiungiEsame("Array", 18);
		//c.getImmatricolati().get(3).aggiungiEsame("Array", 18);
		
		//c.appello("Array", c.getImmatricolati());

		//c.appello("Metodi", c.getImmatricolati());
		
		for (Esame esame : esamiDare) {
			c.appello(esame.getNome(), c.getImmatricolati());
		}


		
		System.out.println(c.getImmatricolati().toString());
		
		c.laurea();
		
		
		
		
		
		
	}

}
