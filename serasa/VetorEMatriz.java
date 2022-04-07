package serasa;

public class VetorEMatriz {
	
	public static void main(String[] args) {

	// unidimensional => vetor
			int[] idades = { 1, 5, 7, 80, 45 }; // ja está inicializado -> pq ja tem valores
			int[] idades2 = new int[5]; // não possui dados escritos pelo usuario
			String[] nomes = { "Julia", "Marcia", "Ana" };
			String[] nomes2 = new String[3];
			System.out.println("Idade: " + idades[2] + " - Nome: " + nomes[2]);
			for (int indice = 0; indice < idades.length; indice++) {
				System.out.println("Idades: " + idades[indice]);
			}
			for (int indice = 0; indice < nomes.length; indice++) {
				System.out.println("Nomes: " + nomes[indice]);
			}
	//multidimensionais => matriz
			
			//int[linha][coluna]
			
			int[][] numeros = new int[3][3];
			int valor = 1;
			for (int linha = 0; linha < 3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
					numeros[linha][coluna] = valor++;
				}
			}
			
			
			for (int linha = 0; linha < 3; linha++) {
				for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna] + "\t");
				}
				System.out.println();
			}
			
			System.out.println(numeros[0][2]);
			
			int[][]randomicos = {{8,12,78,96},
											{22,79,85,92}};
			}
}


