package controleDeFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm;
		int parametroDois;

		do {

			try {
				System.out.println("DIGITE O PRIMEIRO PARAMETRO: ");
				parametroUm = terminal.nextInt();
				System.out.println("DIGITE O SEGUNDO PARAMETRO: ");
				parametroDois = terminal.nextInt();

				contar(parametroUm, parametroDois);
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("TENTE NOVAMENTE ");
			}

		} while (true);
	}
	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
		if (parametroUm >= parametroDois) {
			throw new ParametroInvalidosException("O SEGUNDO PARAMETRO DEVE SER MAIR QUE O PRIMEIRO ");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i <= contagem; i++) {
			System.out.println("Imprimindo os numeros: " + (parametroUm + i));
		}
	}
}
