class Compute {

    public void rotate(int arr[], int n) {
        // fetch the last value from the array.
        int last_value = arr[n - 1];
        for (int i = 0; i < n; i++) {
            // store the value into temporary variable.
            int temp = arr[i];
            // replace the first value for the array with last value.
            arr[i] = last_value;
            // assign the last value with the temporary variable.
            last_value = temp;
        }
    }
}