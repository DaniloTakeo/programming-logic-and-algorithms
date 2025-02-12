package longestCommonSubsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteForceApproach {
	
	private static String findLCS(String s1, String s2) {
		System.out.println("Finding the Longest Common Subsequence between: " + s1 + " and " + s2 + "...");
		List<Character> characterListString1 = fillList(s1);
		List<Character> characterListString2 = fillList(s2);
		List<String> subsets1 = generatePowerSet(characterListString1);
		List<String> subsets2 = generatePowerSet(characterListString2);
		
		String lcs = findMatches(subsets1, subsets2);
		
		return lcs;
	}

	private static List<Character> fillList(String s1) {
		List<Character> list = new ArrayList<>();
		
		for(int i = 0; i < s1.length(); i++) {
			list.add(s1.charAt(i));
		}
		
		return list;
	}
	
	private static List<String> generatePowerSet(List<Character> set) {
        int n = set.size();
        int powerSetSize = (int) Math.pow(2, n);
        List<String> powerSet = new ArrayList<>();
        StringBuilder sb;

        for (int i = 0; i < powerSetSize; i++) {
        	sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { 
                    sb.append(set.get(j));
                }
            }
            powerSet.add(sb.toString());
        }

        return powerSet;
    }
	
	private static String findMatches(List<String> ss1, List<String> ss2) {
		String lcs = "";
		int lcsSize = 0;
		
		for(int i = 0; i < ss1.size(); i++) {
			for(int j = 0; j < ss2.size(); j++) {
				if(ss1.get(i).compareTo(ss2.get(j)) == 0 && lcsSize < ss1.get(i).length()) {
					lcs = ss1.get(i);
					lcsSize = ss1.get(i).length();
				}
			}
		}
		
		return lcs;
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
