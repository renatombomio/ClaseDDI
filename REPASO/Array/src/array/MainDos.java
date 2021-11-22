package array;

import java.util.ArrayList;

public class MainDos {

	public static void main(String[] args) {
		ArrayList<Integer> listaDatos=new ArrayList<Integer>();
		
		for(int i =0 ;i <100 ; i++) {
			listaDatos.add((int) (Math.random()*101));
		}
		
		for (int i =0 ;i <listaDatos.size() ; i++) {
			if (listaDatos.get(i)== 8 || listaDatos.get(i)== 88) {
				listaDatos.set(i, 888);
				
			}
			else if( listaDatos.get(i)== 9 || listaDatos.get(i)== 99 ) {
				listaDatos.set(i, 999);
				
			}
			else if( listaDatos.get(i)== 1 || listaDatos.get(i)== 11) {
				listaDatos.set(i, 111);
				
			}else {
				listaDatos.set(i, 000);
			}
			
			
		}
		
		for (int i =0 ;i <listaDatos.size() ; i++) {
			System.out.println(listaDatos.get(i));
		}

	}

}
