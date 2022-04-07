package serasa;

public class exercicios02 {


	public static void main(String[] args) {

		// Exercícios de Arrays Unidimensionais
		// 1. Para cada conjunto de valores abaixo, escreva o código Java, usando
		// laço(s), que preencha um array com os valores:
		// a) 10 9 8 7 6 5 4 3 2 1
		int[] a = new int[11];
		for (int i = 10; i > 0; i--) {
			a[i] = i;
			System.out.println(a[i]);
		}

		System.out.println("   ");
		// b) 0 1 4 9 16 25 36 49 64 81 100
		for (int i = 0; i < 11; i++) {
			a[i] = i * i;
			System.out.println(a[i]);
		}

		System.out.println("  ");
		// c) 1 2 3 4 5 10 20 30 40 50
		for (int i = 1; i < 6; i++) {
			a[i] = i * 1;
			System.out.println(a[i]);
		}
		for (int i = 1; i < 6; i++) {
			a[i] = i * 10;
			System.out.println(a[i]);
		}

		// 2. Escreva um trecho Java que exiba os valores de um array a double numa mesma linha.
		System.out.println(" ");

		double[] d = { 1.2, 2.3, 3.4, -4.5, 7.6, -2.0 };
		for (int i = 0; i < 6; i++) {
			System.out.println(d[i]);
		}
		// de outra forma
		System.out.println(" ");
		double[] j = { 1.2, 2.4, 4.6, 6.8, -2.1 };
		for (Double num : j) { // executa looping
			System.out.print(num + " ");
		}
		System.out.println(" ");

		// 3. Crie um array de inteiros e retorna a quantidade de elementos do array que são números negativos.
		System.out.println(" ");

		int[] numeros = { -1, 2, -4, 5, -6, 7, -9 };
		int x = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				x++;
			}
		}
		System.out.println(x);

		// 4. Crie um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a.
		System.out.println(" ");
		int[] inteiros = { 2, 4, 6, 8, 2, 7, 8, 7 };
		int m = 0;

		for (int i = 0; i < inteiros.length; i++) {

			for (int y = 0; y < inteiros.length; y++) {
				if (y != i && inteiros[i] == inteiros[y]) {
					m++;
				}
			}
		}
		System.out.println(m);

		// 5. Escreva um array de inteiros a e devolve um array de boolean onde, cada posição indique
		// true se o elemento da posição correspondente de a é positivo e false caso seja negativo ou zero.
		System.out.println("  ");

		int[] inteiro = { 0, -2, 3, -4, 1, 3, -4, 5 };
		boolean[] retorno = new boolean[8];

		for (int g = 0; g < inteiro.length; g++) {

			if (inteiro[g] < 0) {
				retorno[g] = false;
			} else {
				retorno[g] = true;
			}
		} // é preciso um for para imprimir um array completo
		for (int t = 0; t < retorno.length; t++) {
			System.out.println(retorno[t]);
		}

		// 6. Escreva um array de números e devolve a posição onde se encontra o maio valor do array.
		System.out.println(" ");

		int[] lista = {-85, 26, 3, 14, 126 };
		int maior = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > maior) {
				maior = lista[i];
			}
		}
		System.out.println(maior);

		// 7. Crie um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
		//System.out.println(""); 
		
		//int[] ultimo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		//int[] chega = new int[9];
		
		//for (int i = 0; i < chega.length; i++) {
		//for (int k = 0; k < chega.length; k++) {
		//if (i % k == 1);
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
	}
}

