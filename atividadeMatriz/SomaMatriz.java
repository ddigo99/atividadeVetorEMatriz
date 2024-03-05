package atividadeMatriz;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int z = 0; z < matriz[i].length; z++) {
				System.out.println("Digite um número para adicionar à matriz: ");
				matriz[i][z] = leia.nextInt();
			}
		}

		System.out.printf("\n Numeros da diagonal principal: [ %d, %d, %d\n", matriz[0][0], matriz[1][1],
				matriz[2][2]);
		System.out.printf("\n Numeros da diagonal secundária:[ %d, %d, %d\n", matriz[0][2], matriz[1][1],
				matriz[2][0]);
		System.out.printf("\033[1mSoma dos elementos da diagonal principal:\033[0m %d\n",
				matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.printf("\033[1mSoma dos elementos da diagonal secundária:\033[0m %d\n",
				matriz[0][2] + matriz[1][1] + matriz[2][0]);

		leia.close();

	}

}
