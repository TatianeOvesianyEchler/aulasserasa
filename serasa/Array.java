package serasa;

public class Array {
	
	public static void main(String[] args) {
		//unidimensinal => vetor
        int[] idades = {1,5,7,80,45}; //j� est� iniciado -> pq ja tem valores
        int[] idades2 = new int[5]; // n�o possui dados inseridos pelo usu�rio

        String[] nomes = {"Julia", "Marcia", "Ana"};
		String[] nomes2 = new String [3];

        System.out.println("Idade:" + idades[2] + " Nome:" + nomes[2]);

        for(int indice =0; indice < idades.length; indice++){
            System.out.println("idade: " + idades[indice]);
        }
        
        for(int indice =0; indice < idades.length; indice++){
            System.out.println("Nome: " + nomes[indice]);
	}

}
}
