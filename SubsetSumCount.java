public class SubsetSumCount {
    public static void sum(int[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];

            dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s <= target; s++) {
                dp[i][s] = dp[i - 1][s]; 
                if (s >= arr[i - 1]) {
                    dp[i][s] += dp[i - 1][s - arr[i - 1]]; 
                }
            }
        }

        System.out.println("Number of subsets with sum " + target + " = " + dp[n][target]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 5;

        sum(arr, target);
    }
}
