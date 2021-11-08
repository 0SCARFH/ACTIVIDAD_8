package actividad_8;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;
import java.util.Random;






public class Deck {
	private List<card> card;
	private Integer numCard = null;
	
	

	public List<card> getCard(){
		
		return card;
	}

	public void setCard(List<card> card) {
		this.card = card;
		
	}
	
  public static String getcolor(String palo) {
		
		if(palo.toLowerCase().equals("pica") || palo.equals("trebol")){
			return "negro";
		}
		
		
		if(palo.toLowerCase().equals("corazon") || palo.equals("diamantes")) {
			return "rojo";
		}
		return null;
		
	}
	public String Mezclar () throws Exception{
		
		Collections.shuffle(card);
		
		return "Se Mezclo el deck....";
		
		
	}
	
	  public String Mostrar() throws Exception {
		  int res;
		card carta1 = card.get(0);
		res = card.size() - 1;
		return "La carta 1 es: " + carta1.getPalo() + "  " + carta1.getValor() + "  "+ carta1.getColor() +
				"\nQuedan " + res + " cartas en deck" ;
	
		
	}
	  
	  public String Pick() throws Exception {
		  Random numrandom = new Random();
		  int res;
		  int num = numrandom.nextInt(card.size());
		  card carta2 = card.get(num);
		  res = numCard - 1;
		  
		  return "Carta al azar del deck: " + carta2.getPalo() + "  "+ carta2.getValor()+ "  " 
				  + carta2.getColor() + "\nQuedan " + res + " cartas en deck";
		 
	  }
	  
	  public String Hand() throws Exception {
		 
		  Deck deck2 = new Deck();
		  deck2.setCard(new ArrayList<card>());
		  Integer deckString;
		  
			  for(int i=0; i<5;i++) { 
				  Random numrandom = new Random();
				  int num = numrandom.nextInt(card.size());
				  card carta3 = card.get(num);
				  deck2.getCard().add(carta3);
				 System.out.println(carta3.getColor()+ "  " +carta3.getPalo()+ "  " +carta3.getValor());
				 
			  
		}
	
		  deckString = numCard - deck2.getCard().size();
		     return "Quedan  " + deckString + " Cartas en el deck";
	  }
	  
}
