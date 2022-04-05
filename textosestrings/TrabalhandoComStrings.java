package textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		// metodos são da Classe Character

		// verificar se o valor é um número ou é um texto e retorna true ou false
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('a'));

		System.out.println("         ");

		// verificar se o valor é uma letra e retorna true ou false
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('6'));

		System.out.println("         ");

		// verificar se o valor é uma letra ou numero e retorna true ou false
		System.out.println(Character.isLetterOrDigit('c'));
		System.out.println(Character.isLetterOrDigit('5'));
		System.out.println(Character.isLetterOrDigit('@'));

		System.out.println("         ");

		// verificar se o valor está escrito com caracter maiúsculo
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('A'));

		System.out.println("    ");

		// verificar se o valor está escrito com caracter minusculo
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));

		System.out.println("    ");

		// verificar se o valor é um espaço em branco
		System.out.println(Character.isWhitespace(' '));

		System.out.println("  ==STRINGS==  ");

		String arquivo = "escola.java";
		// verificar valor antigo e substituir pelo valor novo
		arquivo = arquivo.replace("java", "class");
		System.out.println(arquivo);

		System.out.println("    ");

		// compara 2 valores
		String nome1 = "flavia";
		String nome2 = "Flavia";

		// compara conteudo caracteres mauisculos/minusculos
		System.out.println(nome1.equals(nome2));
		// compara o conteudo do texto
		System.out.println(nome1.equalsIgnoreCase(nome2));

		// verifica se inicia com a mesma sequencia de caracteres
		System.out.println("    ");
		System.out.println(nome1.startsWith("fla"));
		System.out.println(nome1.startsWith("Fla"));

		// verifica se finaliza com a mesma sequencia de caracteres
		System.out.println("    ");
		System.out.println(nome1.endsWith("ia"));
		System.out.println(nome1.endsWith("ane"));

		// Compara as letras uma a uma
		// muito usado para ordenar em ordem alfabética
		// colections
		System.out.println("    ");
		System.out.println(nome1.compareTo(nome2));

		// verifica o tamanho da string
		System.out.println(nome1.length());

		// mostra o valor armazenado num determinado indice
		System.out.println(nome1.charAt(4));

		// retorna uma parte de uma string (informa inicio e fim
		System.out.println(nome1.substring(2, 4));

		// retorna a posição da 1ª ocorrencia de uma letra
		System.out.println(nome1.indexOf("a"));

		// retorna a posição da ultima ocorrencia de uma letra
		System.out.println(nome1.lastIndexOf(nome2));

	}
}
