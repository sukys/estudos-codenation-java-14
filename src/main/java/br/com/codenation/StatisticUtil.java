package br.com.codenation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatisticUtil {

	/**
	 * Média:
	 * 
	 * A média pode ser obtida através da soma de todos os valores do conjunto,
	 * dividida pela quantidade de elementos do conjunto.
	 * 
	 * Exemplo: Para um array [1,2,3,4,5], o cálculo da média deverá ser: 15 / 5 = 3
	 * (soma / quantidade = média)
	 * 
	 * @param elements
	 * @return
	 */
	public static int average(int[] elements) {
		int total = 0;
		for (int integer : elements) {
			total += integer;
		}
		return total / elements.length;
	}

	/**
	 * Moda:
	 * 
	 * A moda é representada pelo valor que mais se repete no conjunto.
	 * 
	 * Exemplo: Para um array [1,2,2,3,3,4,4,4,5,5,6,7,8], a moda é o número 4 com 3
	 * ocorrências.
	 * 
	 * Observação: Para fins de simplificação, não deverão ser considerados arrays
	 * que possuam mais de 1 número de moda, como por exemplo: [1,1,2,2,4]
	 * 
	 * @param elements
	 * @return
	 */
	public static int mode(int[] elements) {
		Map<Integer, Integer> qtd = new HashMap<>();
		for (int i : elements) {
			if (!qtd.containsKey(i)) {
				qtd.put(i, 1);
			} else {
				qtd.replace(i, qtd.get(i) + 1);
			}
		}
		Integer key = 0;
		Integer max = null;
		for (Integer item : qtd.keySet()) {
			if (max == null) {
				key = item;
				max = qtd.get(item);
			} else if (qtd.get(item) > max) {
				key = item;
				max = qtd.get(item);
			}
		}
		return key;
	}

	/**
	 * Mediana:
	 * 
	 * A mediana pode ser obtida ordenando os valores no array e pegando o valor que
	 * se encontra no meio do mesmo. Para arrays com quantidade par de elementos,
	 * não haverá um único valor no meio, nesse caso a mediana será definida como a
	 * média entre os dois valores do meio do array.
	 * 
	 * Exemplo: Para um array [1,2,3,4,5,6,7], a mediana é representada pelo número
	 * 4 que se encontra exatamente no meio da distribuição. Para um array
	 * [1,4,6,10,12,14], a mediana é definida pelo cálculo da média entre 6 e 10, o
	 * que significa que teremos: (6 + 10) / 2 = 8
	 * 
	 * @param elements
	 * @return
	 */
	public static int median(int[] elements) {
		List<Integer> lista = Arrays.stream(elements).boxed().sorted().collect(Collectors.toList());
		int mediana = 0;
		if (lista.size() % 2 == 0) {
			mediana += lista.get(Math.floorDiv(lista.size(), 2) - 1);
			mediana += lista.get(Math.floorDiv(lista.size(), 2));
			if(mediana > 0) {
				mediana = Math.floorDiv(mediana, 2);
			} else {
				mediana = Math.floorDiv(mediana *-1, 2) * -1;
			}
		} else {
			int index = Math.floorDiv(lista.size(), 2);
			mediana = lista.get(index);
		}
		return mediana;
	}
}