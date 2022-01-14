
//https://practice.geeksforgeeks.org/problems/coin-change2448/1/?category[]=Arrays&category[]=Mathematical&category[]=Arrays&category[]=Mathematical&difficulty[]=1&page=2&query=category[]Arrayscategory[]Mathematicaldifficulty[]1page2category[]Arrayscategory[]Mathematical
import java.util.*;

class Solution {
    public long count(int S[], int m, int n) {
        long dp[][] = new long[m + 1][n + 1];
        for (long[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return sol(S, m, n, dp);
    }

    public long sol(int S[], int m, int n, long[][] dp) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (m <= 0 && n >= 1) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        dp[m][n] = sol(S, m - 1, n, dp) + sol(S, m, n - S[m - 1], dp);
        return dp[m][n];
    }
}