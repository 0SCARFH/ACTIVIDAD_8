package actividad_8;

import java.util.ArrayList;
import java.util.Scanner;



public class metodos {
	public void showMenu() throws Exception {
		
	
			opciones();
		
		
		
	}
	
	public void opciones() throws Exception {
		//Creacion de arreglos para color, valor y palo Oscar_Feregrino
		 
		String [] color = {"rojo", "negro"};
		String [] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	    String [] palo = {"pica","trebol","corazon","diamantes"};
	    Deck deck = new  Deck(); 
	    deck.setCard(new ArrayList<card>());
	    
	    
		/*
		 ALGORITMO PARA CRER 52 CARTAS Oscar_Feregrino
		 */
		
		for (int i=0; i < palo.length ; i++ ){
			for (int j = 0; j < valor.length; j++){
				card Listacartas = new card (palo[i], deck.getcolor(palo[i]), valor[j]);
				deck.getCard().add(Listacartas);
			
				
			}
		
		}	
		System.out.println("Bienvenido al poker");
		System.out.println("Selecciona una opcion\n 1: mezclar deck\n 2: sacar una carta\n 3: Carta al azar \n 4: generar una mano de 5 cartas\n 0: Salir");
		Scanner respuestaScanner = new Scanner(System.in);
		int res = respuestaScanner.nextInt();
		
		switch (res) {
		case 1:
			System.out.println(deck.Mezclar());
			break;
		case 2:
			System.out.println(deck.Mostrar());
			break;
		case 3:
			System.out.println(deck.Pick());
			break;
		case 4:
			System.out.println(deck.Hand());
			break;
		case 0:
			System.out.println("salio");
			break;
		}
		if (res >= 5) {
			
			throw new Exception("Seleccione una opcion valida");
			
		}
		
	}
	

}
