package colletions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMaps {

	public static void main(String[] args) {

		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Jap�o", 58);
		quadroMedalhasOlimpicas2020.put("Gr�-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);

		// buscar informa~��o atraves de uma chave e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("Alemanha"));

		// buscar informa~��o atraves de um valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey(58));

		// Informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());

		// Consultar o valor armazenado na chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));

		// Remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		System.out.println(quadroMedalhasOlimpicas2020);

		for (Map.Entry<String, Integer> entry : quadroMedalhasOlimpicas2020.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();

			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("================");
		for (String key : quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + "->" + quadroMedalhasOlimpicas2020.get(key));
		}

		TreeMap<String, Integer> quadroDeMedalhasOlimpicas2016 = new TreeMap<>();

		System.out.println("==================");
		quadroDeMedalhasOlimpicas2016.put("EUA", 103);
		quadroDeMedalhasOlimpicas2016.put("China", 90);
		quadroDeMedalhasOlimpicas2016.put("Jap�o", 50);
		quadroDeMedalhasOlimpicas2016.put("Gr�-Bretanha", 70);
		quadroDeMedalhasOlimpicas2016.put("Brasil", 17);

		System.out.println("============");

		System.out.println(quadroDeMedalhasOlimpicas2016.firstKey()); // pega a primeira chave
		System.out.println(quadroDeMedalhasOlimpicas2016.lastKey()); // pega a ultima chave

		System.out.println("============");

		System.out.println(quadroDeMedalhasOlimpicas2016.lowerKey("China")); // mostra a chave anterior
		System.out.println(quadroDeMedalhasOlimpicas2016.higherKey("China")); // mostra a chave posterior

		System.out.println("============");
		System.out.println(quadroDeMedalhasOlimpicas2016.pollFirstEntry()); // exibe o valor e apaga posteriormente
		System.out.println(quadroDeMedalhasOlimpicas2016.pollLastEntry()); // exibe o valor e apaga posteriormente

	}

}
