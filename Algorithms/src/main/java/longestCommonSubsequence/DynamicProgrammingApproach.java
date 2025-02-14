package longestCommonSubsequence;

import java.util.Scanner;

public class DynamicProgrammingApproach {

	private static String findLCS(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] searchMatrix = createSearchMatrix(m, n, s1, s2);
		
		printMatrix(m, n, searchMatrix);
		
		return buildLCS(searchMatrix, m, n, s1, s2);
	}
	
	private static String buildLCS(int[][] matrix, int m, int n, String s1, String s2) {
		StringBuilder lcs = new StringBuilder();
		int i = m;
		int j = n;
		
		while(i > 0 && j > 0) {
			if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs.append(s1.charAt(i - 1));
				i--;
				j--;
			} else  if(matrix[i - 1][j] > matrix[i][j - 1]) {
				i--;
			} else {
				j--;
			}
		}
		
		return lcs.reverse().toString();
	}

	private static void printMatrix(int m, int n, int[][] searchMatrix) {
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				System.out.print(searchMatrix[i][j] + "    ");
			}
			System.out.println();
		}
	}
	
	private static int[][] createSearchMatrix(int m, int n, String s1, String s2) {
		int[][] matrix = new int[m + 1][n + 1];
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(s1.charAt(i - 1) == s2.charAt(j - 1))
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				else
					matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
			}
		}
		
		return matrix;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the first string: ");
		String s1 = scanner.next();
		
		System.out.println("Type the second string: ");
		String s2 = scanner.next();
		
		String lcs = findLCS(s1, s2);
		System.out.println("The Longest Common Subsequence is " + lcs + 
				" and its size is " + lcs.length() + " characters");
		
		scanner.close();
	}
}
