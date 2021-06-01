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
			new Esame("Metodi", 19),	
			new Esame("Classi", 6),	
		};
				
		
		c.iscrivi("Francesco");
		c.iscrivi("Francesca");
		c.iscrivi("Filippo");
		c.iscrivi("Franco");
		c.iscrivi("Giovanni");

		//c.ritira("Giovanni");
		
		//System.out.println(c.getImmatricolati().toString());
		
		
		
		for (int i = 0; i < c.getImmatricolati().size(); i++) {
			c.getImmatricolati().get(i).aggiungiEsame("Array", 18);
			
		}
		
		
		//c.getImmatricolati().get(1).aggiungiEsame("Array", 18);
		//c.getImmatricolati().get(2).aggiungiEsame("Array", 18);
		//c.getImmatricolati().get(3).aggiungiEsame("Array", 18);
		
		c.appello("Array", c.getImmatricolati());

		
		
		
		
		
		
		
	}

}
