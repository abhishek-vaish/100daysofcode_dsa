// https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1

class Compute {
    public String isSubset(long a1[], long a2[], long n, long m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a2[i] == a1[j])
                    count++;

            }
        }

        if (count == m) {
            return "Yes";
        } else {
            return "No";
        }

    }
}