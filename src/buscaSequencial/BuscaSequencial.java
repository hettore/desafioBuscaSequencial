package buscaSequencial;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

		// TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

		int valor = leitor.nextInt();

		Busca(valor, elementos);

	}

	public static int Busca(int valor, int array[]) {
		boolean temValor = false;
		int i = 0;
		for (i = 0; i < array.length; i++) {
			int j = array[i];

			if (j == valor) {
				temValor = true;
				break;
			}

		}
		if (temValor) {
			System.out.println("Achei " + valor + " na posicao " + i);
		} else {
			System.out.println("Numero " + valor + " nao encontrado!");
		}
		return valor;

	}
}
