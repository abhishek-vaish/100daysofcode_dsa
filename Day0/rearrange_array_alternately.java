// https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1/?category[]=Arrays&category[]=Arrays&difficulty[]=1&page=1&query=category[]Arraysdifficulty[]1page1category[]Arrays#

class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange the array elements alternately.
    public static void rearrange(int arr[], int n) {
        int maxElem = arr[n - 1] + 1;
        int maxId = n - 1;
        int minId = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[maxId--] % maxElem) * maxElem;
            } else {
                arr[i] += (arr[minId++] % maxElem) * maxElem;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= maxElem;
        }
    }

}
