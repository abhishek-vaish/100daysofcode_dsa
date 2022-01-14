//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1#

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int j = 0; j < k; j++) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            arr[index] = Integer.MAX_VALUE;
        }

        return min;
    }
}
