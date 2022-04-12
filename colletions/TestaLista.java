package colletions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {

		List<Carro> meusCarros = new ArrayList<>();

		Carro carro1 = new Carro("AudiX1", 2022, "Prata", "2.2");
		meusCarros.add(carro1); // inserir informação

		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));

		for (Carro carro : meusCarros) {
			System.out.println(carro.toString());
		}

		System.out.println("  ");
		for (int i = 0; i < meusCarros.size(); i++) {
			Carro carroTemp = meusCarros.get(i);
			System.out.println(carroTemp.toString());

		}

		System.out.println("  ");
		System.out.println(meusCarros.get(1));

		System.out.println("  ");
		// meusCarros.remove(2);
		for (Carro carro : meusCarros) {
			System.out.println(carro.toString());
		}

		System.out.println("  ");
		// boolean resp = meusCarros.contains(carro1);
		boolean resp = meusCarros.contains(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));

		System.out.println(resp);

		// sort() => Comparable ==> Strings
		System.out.println("  ");
		Collections.sort(meusCarros);
		System.out.println(meusCarros.toString());

		System.out.println("  ");
		meusCarros.sort(new ComparadorDeAnos());
		System.out.println(meusCarros.toString());

		System.out.println("   ");
		Collections.shuffle(meusCarros); // colocar emm ordem aleatória
		System.out.println(meusCarros.toString());
	}

}
