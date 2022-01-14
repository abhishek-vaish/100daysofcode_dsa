class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int sum = 1;
        Arrays.sort(arr);
        for(int i = 0; i<size; i++){
            if(arr[i] == sum){
                sum++;
            }
        }
        return sum;
    }
}