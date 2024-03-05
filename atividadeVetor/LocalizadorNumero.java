package atividadeVetor;

import java.util.Scanner;

public class LocalizadorNumero {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int[] vector = new int[10];
		int tamanho = 0;
		int numero = 0;
		boolean locNum = false;

		while (tamanho < 10) {
			System.out.print("Adicione um número à lista (digite -99 para sair): ");

			numero = leia.nextInt();
			locNum = false;

			for (int i = 0; i < vector.length; i++) {
				if (numero == vector[i])
					locNum = true;
			}

			if (!locNum && numero != -99) {
				vector[tamanho] = numero;
				System.out.printf("O número foi adicionado à lista.\n", numero);
				tamanho++;
				
			} else if (numero != -99)
				System.out.println("Numero ja existente, digite outro!");
			else {
				System.out.println("Você digitou um numero para sair,  Obrigado e até mais...");
				System.out.println("Aplicativo encerrado pelo usuário");
				System.exit(0);
			}
		}

		numero = 0;
		System.out.println("\n==========");

		while (numero != -99) {
			System.out.print("\nDigite um número e veja se ele está na lista (digite -1 para sair): ");
			numero = leia.nextInt();

			tamanho = 0;
			locNum = false;

			for (int i = 0; i < vector.length; i++) {
				if (numero == vector[i]) {
					locNum = true;
					tamanho = i;
					continue;
				}
			}

			if (locNum)
				System.out.printf("Este número está na posição: %d\n", numero, tamanho);
			else if (numero != -99)
				System.out.printf("Este número não foi encontrado!\n", numero);
			else {
				System.out.println("Você digitou um numero para sair,  Obrigado e até mais...");
			}
		}

		leia.close();

	}

}
