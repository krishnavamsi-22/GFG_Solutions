class Solution {
    void rearrange(int arr[], int n) {
        int[] p = new int[n]; 
        int[] neg = new int[n];
        
        int pIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                p[pIndex++] = arr[i];
            } else {
                neg[negIndex++] = arr[i];
            }
        }
        int i = 0, j = 0, k = 0;
        while (i < pIndex && j < negIndex) {
            arr[k++] = p[i++];
            arr[k++] = neg[j++];
        }
        
        while (i < pIndex) {
            arr[k++] = p[i++];
        }
        
        while (j < negIndex) {
            arr[k++] = neg[j++];
        }
    }
}
