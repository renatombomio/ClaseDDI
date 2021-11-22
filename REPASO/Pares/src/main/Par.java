package main;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean valor = true;
		int numero = 1;
		while(valor) {
			if (numero%2 == 0) {
				System.out.println("Numero par "+ numero);
				numero++;
				
			}else {
				numero ++;
			}
			if (numero> 100) {
				valor = false;
			}
		}
	}

}
