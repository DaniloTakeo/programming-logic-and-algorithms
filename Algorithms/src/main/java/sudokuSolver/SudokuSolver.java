package sudokuSolver;

public class SudokuSolver {
    private static final int SIZE = 9;

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) { 
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int r = 0; r < SIZE; r++) {
            for (int d = 0; d < SIZE; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	int[][] board = {
    		    {8, 0, 0, 0, 0, 0, 0, 0, 0},
    		    {0, 0, 3, 6, 0, 0, 0, 0, 0},
    		    {0, 7, 0, 0, 9, 0, 2, 0, 0},
    		    {0, 5, 0, 0, 0, 7, 0, 0, 0},
    		    {0, 0, 0, 0, 4, 5, 7, 0, 0},
    		    {0, 0, 0, 1, 0, 0, 0, 3, 0},
    		    {0, 0, 1, 0, 0, 0, 0, 6, 8},
    		    {0, 0, 8, 5, 0, 0, 0, 1, 0},
    		    {0, 9, 0, 0, 0, 0, 4, 0, 0}
    	};

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("Nenhuma solução encontrada.");
        }
    }
}
