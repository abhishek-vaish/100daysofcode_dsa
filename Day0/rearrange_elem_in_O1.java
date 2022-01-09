// https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1/?category[]=Arrays&category[]=Arrays&difficulty[]=1&page=1&query=category[]Arraysdifficulty[]1page1category[]Arrays#

class Solution {

    // arr: input array
    // n: size of array
    // Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    // with O(1) extra space.
    static void arrange(long arr[], int n) {
        // your code here
        long maxElem = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxElem = Math.max(maxElem, arr[i]);
        }
        maxElem += 1;
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[(int) arr[i]] % maxElem) * maxElem;
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= maxElem;
        }

    }
}
