// https://practice.geeksforgeeks.org/problems/common-elements1132/1

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n3; k++) {
                    if (A[i] < B[j] || A[i] < C[k] || B[j] < C[k]) {
                        break;
                    } else if (C[k] > A[i] || C[k] > B[j]) {
                        break;
                    } else if (A[i] == B[j] && B[j] == C[k]) {
                        if (!arr.contains(A[i]))
                            arr.add(A[i]);
                    }
                }

            }
        }

        return arr;
    }
}