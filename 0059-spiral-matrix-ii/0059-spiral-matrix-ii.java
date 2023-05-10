class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int num=1;
        int sR = 0, eR = n-1, sC = 0, eC = n-1;
        int total = n * n;
        while(num <= total) {
            //starting row
            for(int i = sC;i <= eC; i++) {
                 spiralMatrix[sR][i] = num++; 
            }
            sR++;
            //ending column
            for(int i = sR;i <= eR; i++) {
                 spiralMatrix[i][eC] = num++; 
            }
            eC--;
            //ending row
            for(int i = eC;i >= sC; i--) {
                 spiralMatrix[eR][i] = num++; 
            }
            eR--;
            //starting column
            for(int i = eR;i >= sR; i--) {
                 spiralMatrix[i][sC] = num++; 
            }
            sC++;
        }
        return spiralMatrix;
    }
}