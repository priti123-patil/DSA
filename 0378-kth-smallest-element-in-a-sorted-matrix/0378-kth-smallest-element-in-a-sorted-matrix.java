class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, x = 0;
        int m = matrix[0].length;
        int[] arr = new int[n*m];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                arr[x] = matrix[i][j];
                x++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}