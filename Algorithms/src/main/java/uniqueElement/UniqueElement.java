package uniqueElement;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    public static int findUnique(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Contar as ocorrências de cada número
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Procurar o número que aparece apenas uma vez
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1; // Retorna -1 se não houver um elemento único
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 4, 3, 3, 3, 2, 5};
        System.out.println("Elemento único: " + findUnique(nums)); // Saída esperada: 5
    }
}