package controleDeFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("");
		int  parametroUm = terminal.nextInt();
		System.out.println("");
		int  parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
		} catch (Exception e ) {
			System.out.println(" O SEGUNDO PARAMETRO DEVE SER MAIR QUE O PRIMEIRO ");
			
		}

	}
	static void contar (int parametroUm, int parametroDois) throws ParametroInvalidosException{
		if (parametroUm >= parametroDois) {
			throw new ParametroInvalidosException(" O SEGUNDO PARAMETRO DEVE SER MAIR QUE O PRIMEIRO ");
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo o numero: " + i);
		}
	}

}
