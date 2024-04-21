class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> num = new ArrayList<Integer>();
       Arrays.sort(arr);
       for(int i=0;i<n-1;i++){
           if(arr[i]==arr[i+1]){
                num.add(arr[i]);
                while(i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
           }
                
       }
        if(num.isEmpty()) {
            num.add(-1);
        }
        return num;
    }
}
