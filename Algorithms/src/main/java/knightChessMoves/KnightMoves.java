package knightChessMoves;

import java.util.*;

public class KnightMoves {
    private static final int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static int minKnightMoves(int n, int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) return 0; 
        
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x1, y1, 0});
        visited[x1][y1] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0], cy = current[1], moves = current[2];

            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    if (nx == x2 && ny == y2) return moves + 1; 
                    queue.add(new int[]{nx, ny, moves + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int boardSize = 8; 
        int startX = 0, startY = 0, endX = 7, endY = 7; 

        int result = minKnightMoves(boardSize, startX, startY, endX, endY);
        System.out.println("Mínimo de movimentos necessários: " + result);
    }
}