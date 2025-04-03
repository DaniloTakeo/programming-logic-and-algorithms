package numeroMagico;

import java.util.HashSet;
import java.util.Set;

public class NumeroMagico {
    public static boolean isMagicNumber(int n) {
        Set<Integer> visited = new HashSet<>();
        
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = sumOfSquares(n);
        }
        
        return n == 1;
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 20;
        
        System.out.println(num1 + " é um número mágico? " + isMagicNumber(num1)); // true
        System.out.println(num2 + " é um número mágico? " + isMagicNumber(num2)); // false
    }
}