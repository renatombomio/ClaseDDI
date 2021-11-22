package array;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> listaDatos=new ArrayList<String>();
		
		listaDatos.add("Rojo");
		listaDatos.add("Azul");
		listaDatos.add("Amarillo");
		listaDatos.add("Verde");
		
		for (int i = 0 ; i<listaDatos.size(); i++) {
			if(listaDatos.get(i).equals("Azul")) {
				System.out.println("Se encuentra en la posición : " + i);
			}
		}
		Collections.sort(listaDatos);
		
		//imprimimos el array ordenado
		for (int i = 0 ; i<listaDatos.size(); i++) {
			
				System.out.println(listaDatos.get(i));
			
		}
		// Borra el último dato del array
		listaDatos.remove(3);
		//imprimimos el array sin el último dato
				for (int i = 0 ; i<listaDatos.size(); i++) {
					
						System.out.println(listaDatos.get(i));
					
				}
		

	}

}
