package serasa;

public class Exercicios01 {

	public static void main(String[] args) {

		// 01. Fa�a um programa que, dado o valor da conta de uma refei��o realizada
		// em um restaurante, acrescente os 10% do gar�om e exiba o valor total da
		// conta.
		double conta = 24.9;
		double adicional = conta * 0.1;
		System.out.println("O adicional de 10% �: " + adicional);
		System.out.println("O valor total a pagar �: " + (conta + adicional));
		System.out.println("       ");

		// 02. Fa�a um programa que calcule o resto da divis�o inteira entre dois n�meros
		// dados.
		// Exemplo: se dividirmos 25 por 4, temos resto=1
		int valor1 = 17;
		int valor2 = 2;
		System.out.println(valor1 % valor2);
		// n�o precisava (treinando if else)
		if (valor1 % valor2 == 1) {
			System.out.println("impar");
		} else {
			System.out.println("par");

		}
		System.out.println("         ");

		// 03. Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15%
		// de desconto em uma venda � vista e exiba o valor a ser pago
		double valor = 10.0;
		double descontoAVista = 0.15;
		System.out.println("O valor a pagar a vista �: " + (valor - (valor * descontoAVista)));

		// 04. Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule
		// e exiba
		// o troco a ser devolvido.
		System.out.println("      ");

		double valorDaMercadoria = 1.99;
		double valorPago = 10.0;
		System.out.println("O troco a ser devolvido �: " + (valorPago - valorDaMercadoria));

		// 05. Escreva um programa que, dados tr�s n�meros, informe o maior e o menor.
		System.out.println("       ");

		int valorX = 5;
		int valorY = 7;
		int valorZ = 9;

		if (valorX > valorY && valorX > valorZ)
			System.out.println("O valor " + valorX + " � o maior");
		else if (valorY > valorX && valorY > valorZ)
			System.out.println("O valor " + valorY + " � o maior");
		else
			System.out.println("O valor " + valorZ + " � o maior");
		
		if (valorX < valorY && valorX < valorZ)
		System.out.println("O valor " + valorX + " � o menor");
		else if (valorY < valorX && valorY < valorZ)
			System.out.println("O valor " + valorY + " � o menor");
		else
			System.out.println("O valor " + valorZ + " � o menor");
		
		// 06. Fa�a um Programa que leia as seguintes informa��es de um funcion�rio: matricula, 
		// nome, idade, sexo, endere�o, bairro e estado civil.  Escreva o nome do funcion�rio.
		
		System.out.println("        ");
		int matricula = 2010365;
		String nome = "Jose das Couves";
		int idade = 40;
		String sexo = "masculino";
		String endere�o = "Rua das Ortas, 136";
		String bairro = "Fazendinha";
		String estadoCivil = "solteiro";
		
		System.out.println("Funcion�rio: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Endere�o: " + endere�o + ". " + bairro + ".");
		
		
		// 07. Fa�a um programa que leia dois n�meros inteiros e escreva a soma entre eles.
		System.out.println("       ");
		int numero1 = 5;
		int numero2 = 6;
		System.out.println("A soma de 5 + 6 �: " + (numero1 + numero2));
		
		
		// 08. Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e 
		//escrever o nome e a m�dia. Vari�veis utilizadas: NOME, N1, N2, N3, MEDIA
		System.out.println("      ");
		String aluno = "Valentina Echler";
		float n1 = 9.9f;
		float n2 = 9.3f;
		float n3 = 9.0f;
		float media = ((n1 + n2 + n3)/3);
		System.out.println("Nome do Aluno: " + aluno);
		System.out.println("M�dia do aluno: " + media);
		
		// 09. Fa�a  um  programa  para  ler  o  nome,  departamento  e  o  sal�rio  de  um  funcion�rio. 
		//Calcular e informar um abono de 10% (dez por cento) sobre o sal�rio e, ainda, o novo 
		//sal�rio acrescido do abono.
		System.out.println("    ");
		String funcionario = "Ze dos Tomates";
		String departamento = "Administrativo";
		double salario = 2500.00;
		System.out.println("Funcion�rio: " + funcionario);
		System.out.println("Departamento: " + departamento);
		System.out.println("Sal�rio atual R$: " + salario);
		System.out.println("Abono de 10%: " + (salario*0.1));
		System.out.println("O novo sal�rio � R$ " + (salario +(salario*0.1)));
		
		// 10. Fa�a um programa para ler o c�digo, a descri��o, a quantidade, o pre�o de compra e o  percentual  
		//de  lucro  de  uma  mercadoria.  Calcular  o  valor  da  venda  com  base  no percentual de lucro 
		//e, ainda, calcular o pre�o total em �R$� entre o pre�o da venda e a quantidade. Ao final, escrever 
		//o pre�o de compra, o percentual de lucro, o pre�o da venda, a quantidade e o pre�o total
		System.out.println("   ");
		int codigo = 7894;
		String descricao = "bolaDeFutebol";
		int quantidade = 7;
		float precoDeCompra = 19.9f;
		float percentualDeLucro = 1.513f;
		System.out.println("Controle de produtos: produto - " + codigo + " - " + descricao);
		System.out.println("Pre�o de compra: " + precoDeCompra);
		System.out.println("Precentual de lucro: " + (percentualDeLucro*100) + "%");
		System.out.println("Pre�o de venda: " + (precoDeCompra + (precoDeCompra) * percentualDeLucro));
		System.out.println("Quantidade em estoque: " + quantidade);
		System.out.println("Pre�o total das bolas: " + (((precoDeCompra + (precoDeCompra) * percentualDeLucro))*quantidade));
		
		// 11. Fa�a um programa para ler o nome e o ano, m�s e dia de nascimento de um cidad�o. 
		//Calcular e informar sua idade.
		System.out.println("  ");
		
		String pessoa = "Giovana Rafaella";
		int anoNasc = 2007;
		int mesNasc = 01;
		int diaNasc = 16;
		
		int anoAtual = 2022;
		int mesAtual = 3;
		int diaAtual = 27;
		
		if(mesAtual > mesNasc || (mesAtual >= mesNasc && diaAtual >= diaNasc)) {
			idade = anoAtual - anoNasc;
		} else {
			idade = anoAtual - anoNasc - 1;
		}
		System.out.println("A Idade da " + pessoa + " � " + idade);
		
		// 12. Considerando um Programa iniciado pelos atributos A = 1, B = 2, C = 3, complete-o de  modo que ao 
		//final do Programa o conte�do de A seja 3, de B seja 1 e de C seja 2. Use apenas atribui��es entre vari�veis.
		System.out.println("   ");
		int a = 1;
		int b = 2;
		int c = 3;
		int vazia =0;
		
		vazia = a;
		a = c;
		c = b;
		b = vazia;
		System.out.println("A:" + a + " B:" + b + " C:" + c);
		
		// 13. Fa�a um Programa que obtenha o sal�rio-base e o n�mero de dependentes de um  funcion�rio  e  
		// informe  o  sal�rio  bruto  (igual  ao  sal�rio-base  +  R$  100,00  por dependente), e o sal�rio 
		//l�quido, sabendo-se que o desconto para o INSS � de 10% sobre o sal�rio-base
		System.out.println("   ");
		double salarioBase = 3000.0;
		int qtdeDependentes = 7;
		double salarioBruto = salarioBase + (qtdeDependentes * 100);
		double descontoInss = salarioBase * 0.1;
		System.out.println("Sal�rio Bruto: " + salarioBruto);
		System.out.println("Sal�rio l�quido: " + (salarioBruto - descontoInss));
		
		// 14. Fa�a um Programa que calcule a quantidade necess�ria de tinta e o n�mero de latas, para pintar 
		//uma parede de Xm de largura por Ym de altura. Considere que o consumo de tinta � de 3 litros por 
		//metro� e a quantidade de tinta por lata � de 2 litros. 
		System.out.println("   ");
		
		float altura = 2.5f;
		float largura = 7f;
		float tamanhoDaParede = largura * altura;
		float consumo = tamanhoDaParede * 3;
		System.out.println("Quantidade de tinta necess�ria: " + consumo);
		System.out.println("Quantidade de latas necess�ria: " + consumo/2);
		
		
		// 15. Considerando que I= 5, J= 8 e K= 10, calcule e imprima o valor das seguintes express�es: 
				// Y = X * A 
				// X = A + (2 * B) / (C - 6)
		System.out.println("   ");
		
		int i = 5;
		int j = 8;
		int k = 10;
		
		int x = (i + (2*j)/ (k - 6));
		int y = x * i;
		System.out.println("X:" + x + " e Y:" + y);
		
		//16. Em um aeroporto, a balan�a de bagagem envia a informa��o de peso da bagagem desacompanhada para um 
		//computador que calcula o valor do excesso de peso com os seguintes par�metros:  
			//Faixa de Peso da bagagem Valor a pagar por quilo em excesso 
			//At� 20 Kg (inclusive) 0,00 
			//De 20 Kg a 40 Kg (inclusive) 5.000,00 
			//De 40 Kg para cima ... 10.000,00 
		System.out.println("   ");
		//Tatiane
		double peso = 41;
		
		if (peso <= 20) 
			System.out.println("N�o equivale a excesso de bagagem - isento");
		else if (peso > 20 && peso <= 40)
			System.out.println("O valor a ser pago �: " + (peso - 20) * 5000);
		else 
			System.out.println("O valor a ser pago �: " + (peso - 20) * 10000);
		
		
		// 17.Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa que 
		//calcule seu peso ideal, utilizando as seguintes f�rmulas: 
			//� Para homens:  (72.7 * altura) � 58; 
			//� Para mulheres: (62.1 * altura) � 44.7;
		System.out.println("   ");
		
		float tamanho = 1.68f;
		String orientacao = "masculino";
		if (orientacao == "masculino")
			System.out.println("O peso ideal masculino �: " + ((72.7f * tamanho) - 58f));
		else if (orientacao == "feminino")
			System.out.println("O peso ideal feminino �: " + ((62.1f * tamanho) - 44.7f));
		
		
		//18. Elabore um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias: 
			//� Infantil A   =  5 � 7 anos 
			//� Infantil B  =  8 � 10 anos 
			//� Juvenil A  =  11 � 13 anos 
			//� Juvenil B  =  14 � 17 anos 
			//� S�nior   =  maiores de 18 anos  
		System.out.println("    ");
		
		int idadeDoNadador = 17;
		
		if (idadeDoNadador >= 5 && idadeDoNadador <= 7)
			System.out.println("Categoria: Infantil A");
		else if
		(idadeDoNadador >= 8 && idadeDoNadador <= 10)
			System.out.println("Categoria: Infantil B");
		else if
		(idadeDoNadador >= 11 && idadeDoNadador <= 13)
			System.out.println("Categoria: Juvenil A");
		else if
		(idadeDoNadador >= 14 && idadeDoNadador <= 17)
			System.out.println("Categoria: Juvenil B");
		else
			System.out.println("Categoria: S�nior");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
