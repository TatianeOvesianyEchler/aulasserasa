package serasa;

public class Aula01 {
	public static void main(String[] args) {
		System.out.print("Hello ");
		System.out.println("Turma!!!");
		System.out.println(   );
		System.out.println("Hello ");
		System.out.println("Turma!!!");
		
		//criação de um atributo para tipo texto
		String nomeDoAluno = "Tatiane";
		String sobrenomeDoAluno = "Echler";
		
		//criação para tipos numéricos
		//número do tipo inteiro
		// -2.147.483.648 até 2.147.483.647
		
		byte numeroDoTipoByte = 9;
		short numeroDoTipoShort = 222;
		int idade = 25;
		long matricula = 25L;
		
		//números de ponto flutuante
		float nota = 8.5f;
		double mensalidade = 8.5;
		
		System.out.println("Nome: " + nomeDoAluno);
		System.out.println("Sobrenome: " + sobrenomeDoAluno);
		System.out.println(numeroDoTipoByte);
		System.out.println(numeroDoTipoShort);
		System.out.println(idade);
		System.out.println(matricula);
		System.out.println(nota);
		System.out.println(mensalidade);
		
		
		int a = 4;
		int b = 2;
		System.out.println(a % b);

		
	}
	
}


