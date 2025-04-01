package maiorSubstringUnica;

import java.util.HashSet;

public class MaiorSubstringUnica {
    public static String encontrarMaiorSubstringUnica(String s) {
        int maxLength = 0, left = 0, start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String entrada = "abcabcbb";
        System.out.println("Maior substring única: " + encontrarMaiorSubstringUnica(entrada)); // Saída esperada: "abc"
    }
}
