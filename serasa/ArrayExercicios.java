package serasa;

import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crie um array de inteiros e retorna a quantidade de elementos do array que
		// s�o n�meros negativos

		int[] numeros = { 1, -1, 2, -2, 3, -3, 4, -4 };
		int x = 0;

		// inicializador, condi��o, incremento
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				x++;
			}
		}

		System.out.println(x);

		// Crie um array de inteiros a e um valor inteiro x e retorna a quantidade de
		// vezes que x aparece no array a

		int[] inteiros = { 2, 4, 6, 8, 2, 7, 8, 7 };
		int j = 0;

		for (int i = 0; i < inteiros.length; i++) {

			for (int y = 0; y < inteiros.length; y++) {
				if (y != i && inteiros[i] == inteiros[y]) {
					j++;

				}
			}

		} 
		
		System.out.println(j);

		//Escreva  um  array  de  inteiros  a  e  devolve  um  array  de  boolean  onde,  cada  posi��o 
		//indique true se o elemento da posi��o correspondente de a � positivo e false caso seja 
		//negativo ou zero
		
		int [] inteiro = { 0, 2, 3, 4, -1, -2, -3, -4, -5};
		boolean [] retorno = new boolean [9];
		
		for (int d = 0; d < inteiro.length;d++){
			
			if (inteiro[d] < 0) {
				retorno[d] = false;
				}
			else {retorno[d] = true;}			
	}	//� preciso um for para imprimir um array completo
		for (int t = 0; t < retorno.length;t++){
			System.out.println(retorno[t]);
			
		}
		
		//Escreva um array de n�meros e devolve a posi��o onde se encontra o maior valor do array
		
		int [] lista = { 12, 2, 3, 14, 10};
		int maior = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]> maior) {
				maior=lista[i];
			}
		}
		System.out.println(maior);
		
		
			
		
	
		
		
		
		
		
		
	}
}

 
				
		
		
		



