// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        return count;
    }
}