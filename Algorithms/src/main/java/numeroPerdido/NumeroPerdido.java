package numeroPerdido;

public class NumeroPerdido {
    public static int encontrarNumeroPerdido(int[] numeros, int n) {
        int somaEsperada = n * (n + 1) / 2;
        int somaAtual = 0;

        for (int num : numeros) {
            somaAtual += num;
        }

        return somaEsperada - somaAtual;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 5, 6}; // Exemplo, falta o 3
        int n = 6; // O conjunto original era {1, 2, 3, 4, 5, 6}

        System.out.println("Número perdido: " + encontrarNumeroPerdido(numeros, n));
    }
}