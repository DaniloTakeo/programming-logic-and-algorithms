package subsetSum;

import java.util.Scanner;

public class SubsetSum {
    
    public static boolean subsetSum(int[] nums, int n, int target) {
        if (target == 0) return true;
        if (n == 0 || target < 0) return false;

        boolean exclude = subsetSum(nums, n - 1, target);
        boolean include = subsetSum(nums, n - 1, target - nums[n - 1]);
        
        return exclude || include;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do conjunto: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Digite os elementos do conjunto:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor da soma alvo: ");
        int target = scanner.nextInt();
        
        if (subsetSum(nums, n, target)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}