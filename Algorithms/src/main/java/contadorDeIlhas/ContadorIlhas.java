package contadorDeIlhas;

public class ContadorIlhas {
    
    private static final int[] DX = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] DY = {-1, 0, 1, -1, 1, -1, 0, 1};
    
    public static int contarIlhas(int[][] matriz) {
        if (matriz == null || matriz.length == 0) return 0;
        
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        boolean[][] visitado = new boolean[linhas][colunas];
        int contagemIlhas = 0;
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == 1 && !visitado[i][j]) {
                    dfs(matriz, visitado, i, j, linhas, colunas);
                    contagemIlhas++;
                }
            }
        }
        return contagemIlhas;
    }
    
    private static void dfs(int[][] matriz, boolean[][] visitado, int x, int y, int linhas, int colunas) {
        visitado[x][y] = true;
        
        for (int d = 0; d < 8; d++) {
            int novoX = x + DX[d];
            int novoY = y + DY[d];
            
            if (ehValido(matriz, visitado, novoX, novoY, linhas, colunas)) {
                dfs(matriz, visitado, novoX, novoY, linhas, colunas);
            }
        }
    }
    
    private static boolean ehValido(int[][] matriz, boolean[][] visitado, int x, int y, int linhas, int colunas) {
        return (x >= 0 && x < linhas && y >= 0 && y < colunas && matriz[x][y] == 1 && !visitado[x][y]);
    }
    
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}
        };
        System.out.println("Número de ilhas: " + contarIlhas(matriz));
    }
}