package frequencySort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class FrequencySort {
    public static int[] frequencySort(int[] nums) {
        // Mapa para contar a frequência de cada número
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Converter array primitivo para um array de objetos Integer
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Ordenando os números com base na frequência e, em caso de empate, pelo próprio valor
        Arrays.sort(arr, (a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a);
            return (freqCompare != 0) ? freqCompare : a - b;
        });

        // Converter de volta para int[]
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 5, 4, 3};
        System.out.println("Entrada: " + Arrays.toString(nums));
        int[] sorted = frequencySort(nums);
        System.out.println("Ordenado por Frequência: " + Arrays.toString(sorted));
    }
}