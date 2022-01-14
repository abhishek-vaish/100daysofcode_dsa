
//https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1/?category[]=Arrays&category[]=Mathematical&category[]=Arrays&category[]=Mathematical&difficulty[]=1&page=2&query=category[]Arrayscategory[]Mathematicaldifficulty[]1page2category[]Arrayscategory[]Mathematical#
import java.util.*;

class Solution {
    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size) {
        int sum = 1;
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            if (arr[i] == sum) {
                sum++;
            }
        }
        return sum;
    }
}