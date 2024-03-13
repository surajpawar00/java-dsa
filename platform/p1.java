import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static List<Integer> findLongestIncreasingSubsequence(List<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        int[] previousIndex = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1; // Initialize the length of LIS ending at index i to 1
            previousIndex[i] = -1; // Initialize the previous index as -1 (no previous)
            for (int j = 0; j < i; j++) {
                if (nums.get(i) > nums.get(j) && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    previousIndex[i] = j;
                }
            }
        }

        int maxLength = 0;
        int endIndex = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        while (endIndex >= 0) {
            longestIncreasingSubsequence.add(nums.get(endIndex));
            endIndex = previousIndex[endIndex];
        }

        // Reverse the list to get the increasing subsequence in the correct order
        List<Integer> result = new ArrayList<>();
        for (int i = longestIncreasingSubsequence.size() - 1; i >= 0; i--) {
            result.add(longestIncreasingSubsequence.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(-1);
        nums.add(0);
        nums.add(6);
        nums.add(2);
        nums.add(3);

        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(nums);
        System.out.println("Longest Increasing Subsequence: " + longestIncreasingSubsequence);
    }
}
