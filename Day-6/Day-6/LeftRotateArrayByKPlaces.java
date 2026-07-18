class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        // store first d elements
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        
        
        //shifiting elements 
        for(int i = d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        
        // storing the temp vales
        for(int i = n-d ;i<n;i++){
            arr[i] = temp[i-(n-d)];
        }
    
    }
}
