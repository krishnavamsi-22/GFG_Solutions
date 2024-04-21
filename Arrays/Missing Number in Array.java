class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = (n*(n+1))/2;
        int as = 0;
        for(int i=0;i<n-1;i++){
            as+=array[i];
        }
        return sum-as;
    }
}
