package serasa;

public class Exercicios01 {

	public static void main(String[] args) {

		// 01. Faça um programa que, dado o valor da conta de uma refeição realizada
		// em um restaurante, acrescente os 10% do garçom e exiba o valor total da
		// conta.
		double conta = 24.9;
		double adicional = conta * 0.1;
		System.out.println("O adicional de 10% é: " + adicional);
		System.out.println("O valor total a pagar é: " + (conta + adicional));
		System.out.println("       ");

		// 02. Faça um programa que calcule o resto da divisão inteira entre dois números
		// dados.
		// Exemplo: se dividirmos 25 por 4, temos resto=1
		int valor1 = 17;
		int valor2 = 2;
		System.out.println(valor1 % valor2);
		// não precisava (treinando if else)
		if (valor1 % valor2 == 1) {
			System.out.println("impar");
		} else {
			System.out.println("par");

		}
		System.out.println("         ");

		// 03. Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15%
		// de desconto em uma venda à vista e exiba o valor a ser pago
		double valor = 10.0;
		double descontoAVista = 0.15;
		System.out.println("O valor a pagar a vista é: " + (valor - (valor * descontoAVista)));

		// 04. Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule
		// e exiba
		// o troco a ser devolvido.
		System.out.println("      ");

		double valorDaMercadoria = 1.99;
		double valorPago = 10.0;
		System.out.println("O troco a ser devolvido é: " + (valorPago - valorDaMercadoria));

		// 05. Escreva um programa que, dados três números, informe o maior e o menor.
		System.out.println("       ");

		int valorX = 5;
		int valorY = 7;
		int valorZ = 9;

		if (valorX > valorY && valorX > valorZ)
			System.out.println("O valor " + valorX + " é o maior");
		else if (valorY > valorX && valorY > valorZ)
			System.out.println("O valor " + valorY + " é o maior");
		else
			System.out.println("O valor " + valorZ + " é o maior");
		
		if (valorX < valorY && valorX < valorZ)
		System.out.println("O valor " + valorX + " é o menor");
		else if (valorY < valorX && valorY < valorZ)
			System.out.println("O valor " + valorY + " é o menor");
		else
			System.out.println("O valor " + valorZ + " é o menor");
		
		// 06. Faça um Programa que leia as seguintes informações de um funcionário: matricula, 
		// nome, idade, sexo, endereço, bairro e estado civil.  Escreva o nome do funcionário.
		
		System.out.println("        ");
		int matricula = 2010365;
		String nome = "Jose das Couves";
		int idade = 40;
		String sexo = "masculino";
		String endereço = "Rua das Ortas, 136";
		String bairro = "Fazendinha";
		String estadoCivil = "solteiro";
		
		System.out.println("Funcionário: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Endereço: " + endereço + ". " + bairro + ".");
		
		
		// 07. Faça um programa que leia dois números inteiros e escreva a soma entre eles.
		System.out.println("       ");
		int numero1 = 5;
		int numero2 = 6;
		System.out.println("A soma de 5 + 6 é: " + (numero1 + numero2));
		
		
		// 08. Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e 
		//escrever o nome e a média. Variáveis utilizadas: NOME, N1, N2, N3, MEDIA
		System.out.println("      ");
		String aluno = "Valentina Echler";
		float n1 = 9.9f;
		float n2 = 9.3f;
		float n3 = 9.0f;
		float media = ((n1 + n2 + n3)/3);
		System.out.println("Nome do Aluno: " + aluno);
		System.out.println("Média do aluno: " + media);
		
		// 09. Faça  um  programa  para  ler  o  nome,  departamento  e  o  salário  de  um  funcionário. 
		//Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo 
		//salário acrescido do abono.
		System.out.println("    ");
		String funcionario = "Ze dos Tomates";
		String departamento = "Administrativo";
		double salario = 2500.00;
		System.out.println("Funcionário: " + funcionario);
		System.out.println("Departamento: " + departamento);
		System.out.println("Salário atual R$: " + salario);
		System.out.println("Abono de 10%: " + (salario*0.1));
		System.out.println("O novo salário é R$ " + (salario +(salario*0.1)));
		
		// 10. Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e o  percentual  
		//de  lucro  de  uma  mercadoria.  Calcular  o  valor  da  venda  com  base  no percentual de lucro 
		//e, ainda, calcular o preço total em “R$” entre o preço da venda e a quantidade. Ao final, escrever 
		//o preço de compra, o percentual de lucro, o preço da venda, a quantidade e o preço total
		System.out.println("   ");
		int codigo = 7894;
		String descricao = "bolaDeFutebol";
		int quantidade = 7;
		float precoDeCompra = 19.9f;
		float percentualDeLucro = 1.513f;
		System.out.println("Controle de produtos: produto - " + codigo + " - " + descricao);
		System.out.println("Preço de compra: " + precoDeCompra);
		System.out.println("Precentual de lucro: " + (percentualDeLucro*100) + "%");
		System.out.println("Preço de venda: " + (precoDeCompra + (precoDeCompra) * percentualDeLucro));
		System.out.println("Quantidade em estoque: " + quantidade);
		System.out.println("Preço total das bolas: " + (((precoDeCompra + (precoDeCompra) * percentualDeLucro))*quantidade));
		
		// 11. Faça um programa para ler o nome e o ano, mês e dia de nascimento de um cidadão. 
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
		System.out.println("A Idade da " + pessoa + " é " + idade);
		
		// 12. Considerando um Programa iniciado pelos atributos A = 1, B = 2, C = 3, complete-o de  modo que ao 
		//final do Programa o conteúdo de A seja 3, de B seja 1 e de C seja 2. Use apenas atribuições entre variáveis.
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
		
		// 13. Faça um Programa que obtenha o salário-base e o número de dependentes de um  funcionário  e  
		// informe  o  salário  bruto  (igual  ao  salário-base  +  R$  100,00  por dependente), e o salário 
		//líquido, sabendo-se que o desconto para o INSS é de 10% sobre o salário-base
		System.out.println("   ");
		double salarioBase = 3000.0;
		int qtdeDependentes = 7;
		double salarioBruto = salarioBase + (qtdeDependentes * 100);
		double descontoInss = salarioBase * 0.1;
		System.out.println("Salário Bruto: " + salarioBruto);
		System.out.println("Salário líquido: " + (salarioBruto - descontoInss));
		
		// 14. Faça um Programa que calcule a quantidade necessária de tinta e o número de latas, para pintar 
		//uma parede de Xm de largura por Ym de altura. Considere que o consumo de tinta é de 3 litros por 
		//metro² e a quantidade de tinta por lata é de 2 litros. 
		System.out.println("   ");
		
		float altura = 2.5f;
		float largura = 7f;
		float tamanhoDaParede = largura * altura;
		float consumo = tamanhoDaParede * 3;
		System.out.println("Quantidade de tinta necessária: " + consumo);
		System.out.println("Quantidade de latas necessária: " + consumo/2);
		
		
		// 15. Considerando que I= 5, J= 8 e K= 10, calcule e imprima o valor das seguintes expressões: 
				// Y = X * A 
				// X = A + (2 * B) / (C - 6)
		System.out.println("   ");
		
		int i = 5;
		int j = 8;
		int k = 10;
		
		int x = (i + (2*j)/ (k - 6));
		int y = x * i;
		System.out.println("X:" + x + " e Y:" + y);
		
		//16. Em um aeroporto, a balança de bagagem envia a informação de peso da bagagem desacompanhada para um 
		//computador que calcula o valor do excesso de peso com os seguintes parâmetros:  
			//Faixa de Peso da bagagem Valor a pagar por quilo em excesso 
			//Até 20 Kg (inclusive) 0,00 
			//De 20 Kg a 40 Kg (inclusive) 5.000,00 
			//De 40 Kg para cima ... 10.000,00 
		System.out.println("   ");
		//Tatiane
		double peso = 41;
		
		if (peso <= 20) 
			System.out.println("Não equivale a excesso de bagagem - isento");
		else if (peso > 20 && peso <= 40)
			System.out.println("O valor a ser pago é: " + (peso - 20) * 5000);
		else 
			System.out.println("O valor a ser pago é: " + (peso - 20) * 10000);
		
		
		// 17.Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa que 
		//calcule seu peso ideal, utilizando as seguintes fórmulas: 
			//• Para homens:  (72.7 * altura) – 58; 
			//• Para mulheres: (62.1 * altura) – 44.7;
		System.out.println("   ");
		
		float tamanho = 1.68f;
		String orientacao = "masculino";
		if (orientacao == "masculino")
			System.out.println("O peso ideal masculino é: " + ((72.7f * tamanho) - 58f));
		else if (orientacao == "feminino")
			System.out.println("O peso ideal feminino é: " + ((62.1f * tamanho) - 44.7f));
		
		
		//18. Elabore um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias: 
			//• Infantil A   =  5 – 7 anos 
			//• Infantil B  =  8 – 10 anos 
			//• Juvenil A  =  11 – 13 anos 
			//• Juvenil B  =  14 – 17 anos 
			//• Sênior   =  maiores de 18 anos  
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
			System.out.println("Categoria: Sênior");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
