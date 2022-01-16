// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                if (arr1[n - 1 - i] > arr2[j]) {
                    int temp = arr1[n - 1 - i];
                    arr1[n - 1 - i] = arr2[j];
                    arr2[j] = temp;
                } else {
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}